

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedWriter;
import java.text.DecimalFormat;
import java.util.Random;


public class QlearningInfinito extends java.lang.Thread {
	
	int numero_sorteado,estadoA=1,estadoF=5;
	
	
	
	private double reforco[][] = new double[10][10];
	private static double Q[][] = new double[10][8];
	private int casaPredador[] = new int[2];
	private int casaAgente[] = new int[2];
	private int contadorAcaoAgente = 0;
	private int estadoAtual = 0;
	private int estadoAnterior = 0;
	private int num_interacoes = 0;
	private int acaoAtual = 0;
	private boolean continua = true;
	private boolean todos_atualizados,termina = false;
	private int contador;
	private double qTotal;
	private String q;
	private BufferedWriter bw3;
	private static int ciclos = 0;

	
	int i = 0,j = 0;
	
	
	
	
	
	
	public void run() {
		
		//inicializa variáveis
		casaPredador[0] = 4;
		casaPredador[1] = 0;
		casaAgente[0] = 2;
		casaAgente[1] = 2;
		estadoAnterior = 0;
		estadoAtual = 0;
		todos_atualizados = false;
		termina = false;
		contador = 0;
		qTotal = 0;
		bw3 = null;
		q = null;
	
		
		
		//inicializa tabela reforço
		
		for (i=0;i<10;i++) {
			for (j=0;j<10;j++){
				reforco[i][j] = 0;
			}
		}
			
		reforco[0][0] = 10;	
		
		for (i=1;i<10;i++){
			reforco[i][0] = 100;
		}
		
		for (j=1;j<9;j++){
			reforco[0][j] = -10;
		}

		for (j=1;j<9;j++){
			reforco[9][j] = +50;
		}
		
			
		for (i=0;i<10;i++){
			reforco[i][9] = -100;
		}
		
		
		
		//inicializa tabela Q
		
		for (i=0;i<10;i++) {
			for (j=0;j<8;j++){
				Q[i][j] = 0;
			}
		}
		
		
		FrameQ.progressBar.setString("Aguarde...");	
		
		
		while (num_interacoes < ciclos){
		
			
			FrameQ.progressBar.setValue(num_interacoes);
			
			estadoAnterior = estadoAtual;
						
			agenteAge();	
			predadorAge();
			atualizaEstado();
			atualizaQ();
			
			num_interacoes += 1;
			
			//System.out.println(" "+estadoAnterior+" "+acaoAtual+" "+estadoAtual+"---"+casaAgente[0]+casaAgente[1]+"->"+casaPredador[0]+casaPredador[1]);
			
		}
		
		
		String texto = "";
		String textoAux = "";
		   DecimalFormat decimal = new DecimalFormat( "0.0" );  
		  
		   texto = "<html><br><br><div align=center><b>TABELA Q</div></b>";
		for (int i=0;i<10;i++) {
			
			texto = texto + ("<br><br><b><u><font color=\"black\">ESTADO "+i+"</font></u></b>");
			
			
			for (int j=0;j<8;j++){
				
				textoAux = "\n"+"Q["+i+"]["+j+"]= "+decimal.format(Q[i][j]);
				
				if (Q[i][j]==MAX(i)){
					
									
					texto = texto+("<br><b><font color=\"red\">"+textoAux+"</font></b>");
					
				}else{
				
					texto = texto+("<br><font color=\"black\">"+textoAux+"</font>");
				
				}
			}
			
		}
		texto += "</html>";
	
		FrameQ.jaTabela.setText(texto);
		FrameQ.progressBar.setString("Ok, Agente treinado...");
		
		
		
		
	}
	
	
	Random random = new Random();
	
		
		
		private void predadorAge(){
			
			
			numero_sorteado = random.nextInt(2);
			
			
			if ((casaAgente[0] > casaPredador[0])&&(casaAgente[1] > casaPredador[1])){
				casaPredador[numero_sorteado] += 1;
			}else if ((casaAgente[0] < casaPredador[0])&&(casaAgente[1] < casaPredador[1])){
				casaPredador[numero_sorteado] -= 1;
			}else if ((casaAgente[0] > casaPredador[0])&&(casaAgente[1] < casaPredador[1])){
				if (numero_sorteado==0){
					casaPredador[0] += 1;
				}else {
					casaPredador[1] -= 1;
				}
				
			}else if ((casaAgente[0] < casaPredador[0])&&(casaAgente[1] > casaPredador[1])){
				if (numero_sorteado==0){
					casaPredador[0] -= 1;
				}else {
					casaPredador[1] += 1;
				}
			}else if (casaAgente[0] > casaPredador[0]){
					casaPredador[0] += 1;
				}else if (casaAgente[0] < casaPredador[0]){
					casaPredador[0] -= 1;
				}else if (casaAgente[1] > casaPredador[1]){
					casaPredador[1] += 1;
				}else if (casaAgente[1] < casaPredador[1]){
					casaPredador[1] -= 1;
				}
			
	
	}
	
	private void agenteAge(){
		
		
		
		if (contadorAcaoAgente < 7){
			
			implementaAcao(Explora());
			
		}else if (contadorAcaoAgente >= 7){
			implementaAcao(Qmax());
			
		}
		
		contadorAcaoAgente +=1;
		
		if (contadorAcaoAgente > 9){
			contadorAcaoAgente = 0;
		}
		
		
				
	}
	public void setCiclos(int cic){
		ciclos = cic;
	}
	
	public void implementaAcao(int acao){
		
		
			switch(acao){
			
				case 0: casaAgente[0] -= 1;casaAgente[1] -= 1;break;
				case 1: casaAgente[0] -= 1;break;
				case 2: casaAgente[0] -= 1;casaAgente[1] += 1;break;
				case 3: casaAgente[1] -= 1;break;
				case 4: casaAgente[1] += 1;break;
				case 5: casaAgente[0] += 1;casaAgente[1] -= 1;break;
				case 6: casaAgente[0] += 1;break;
				case 7: casaAgente[0] += 1;casaAgente[1] += 1;break;
			
			}
	
				acaoAtual = acao;
		
	}
	
	public int Explora(){
				
		numero_sorteado = random.nextInt(8);
		return numero_sorteado;
	
	}
	
	public int Qmax(){
		
		double acaoMax;
		int ac = 0;
		
		acaoMax = MAX(estadoAnterior);
		
		for (i=0;i<8;i++){
			if (Q[estadoAnterior][i] == acaoMax){
				ac = i;
			}
		}
		return ac;		
	}
	
	public double MAX(int estado){
		
		double max = 0;
		
		max = Math.max(Q[estado][0],Q[estado][1]);
		max = Math.max(max,Q[estado][2]);
		max = Math.max(max,Q[estado][3]);
		max = Math.max(max,Q[estado][4]);
		max = Math.max(max,Q[estado][5]);
		max = Math.max(max,Q[estado][6]);
		max = Math.max(max,Q[estado][7]);
			
	
		return max;
	}

	

	public void atualizaEstado(){
	
		if ((casaPredador[0] == casaAgente[0]) && (casaPredador[1] == casaAgente[1])){
			estadoAtual = 9;
		}else if ((Math.pow((casaPredador[0] - casaAgente[0]),2) > 2) ||(Math.pow((casaPredador[1] - casaAgente[1]),2) > 2)) {
			estadoAtual = 0;
		}else if ((casaPredador[0] < casaAgente[0]) && (casaPredador[1] < casaAgente[1])){
			estadoAtual = 1;
		}else if ((casaPredador[0] < casaAgente[0]) && (casaPredador[1] == casaAgente[1])){
			estadoAtual = 2;
		}else if ((casaPredador[0] < casaAgente[0]) && (casaPredador[1] > casaAgente[1])){
			estadoAtual = 3;
		}else if ((casaPredador[0] == casaAgente[0]) && (casaPredador[1] < casaAgente[1])){
			estadoAtual = 4;
		}else if ((casaPredador[0] == casaAgente[0]) && (casaPredador[1] > casaAgente[1])){
			estadoAtual = 5;
		}else if ((casaPredador[0] > casaAgente[0]) && (casaPredador[1] < casaAgente[1])){
			estadoAtual = 6;
		}else if ((casaPredador[0] > casaAgente[0]) && (casaPredador[1] == casaAgente[1])){
			estadoAtual = 7;
		}else if ((casaPredador[0] > casaAgente[0]) && (casaPredador[1] > casaAgente[1])){
			estadoAtual = 8;
		}
	
		
	
	}
	
	public void atualizaQ(){
		
		double maximo = MAX(estadoAtual);
		Q[estadoAnterior][acaoAtual] = Q[estadoAnterior][acaoAtual]+0.01*(reforco[estadoAnterior][estadoAtual] + (0.5* maximo)-Q[estadoAnterior][acaoAtual]);
		
	}
	public static double[][] getQ(){
		
		return Q;
	}
	
	
	
	
			
		
}
