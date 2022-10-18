
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Random;


public class SarsaInfinitoForm {
	
	int numero_sorteado,estadoA=1,estadoF=5;
	
	
	
	double reforco[][] = new double[10][10];
	double Q[][] = new double[10][8];
	int casaPredador[] = new int[2];
	int casaAgente[] = new int[2];
	int contadorAcaoAgente = 0;
	int estadoAtual = 0;
	int estadoAnterior = 0;
	long num_interacoes = 0;
	int acaoAtual = 0;
	boolean continua = true;
	boolean todos_atualizados,termina = false;
	int contador;
	double qTotal;
	String q;
	BufferedWriter bw3;
	
	int i = 0,j = 0;
	
	
	
	
	
	
	public SarsaInfinitoForm() {
		
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
		
		
		
		//int revesa = -1;
		
		System.out.println(Calendar.getInstance().getTime());
		
		try {
			bw3 = new BufferedWriter(new FileWriter("C:\\Users\\Mauricio\\Desktop\\QTotal.txt",true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (contador < 1){
			
		
		
		while (num_interacoes < 10000){
			
			
			
			//if (estadoAtual!= 9){
			
			
			
			estadoAnterior = estadoAtual;
			agenteAge();
			predadorAge();
			atualizaEstado();
			atualizaQ();
			
			 
			/*if (Q[7][2]!=qTotal){
			
			 q = (""+Q[7][2]);
	           
		        try {
					bw3.write(num_interacoes+"="+q.replace(".",",")+"\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}   
			  }*/

            if (termina == false){
				
				for (i=0;i<10;i++) {
					for (j=0;j<8;j++){
						if (Q[i][j]!=0){
							todos_atualizados = true;
						}else{
							todos_atualizados = false;
							break;
						}
					
					}
					if (todos_atualizados == false){
						break;
					}
				}
				
				}
				if ((todos_atualizados == true)&& (termina == false)){
					 try {
							bw3.write(""+num_interacoes+"\n");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}   
					termina = true;
				}
			
			qTotal = Q[7][2];
			
						
			num_interacoes += 1;
			
			
			
		}
		
		contador +=1;
		}
		 try {
				bw3.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
	        try {
				bw3.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
			/*for (i=0;i<10;i++) {
				for (j=0;j<8;j++){
					System.out.println("Q["+i+"]["+j+"]= "+Q[i][j]);
				
				}
			}*/
		
		System.out.println(Calendar.getInstance().getTime());
		
	}
	
	public void Desenha(){
		
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
		
		Q[estadoAnterior][acaoAtual] = Q[estadoAnterior][acaoAtual]+0.01*(reforco[estadoAnterior][estadoAtual] + (0.5* Q[estadoAtual][random.nextInt(8)])-Q[estadoAnterior][acaoAtual]);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		for (int i=0;i<1000;i++){
		
		new SarsaInfinitoForm();
		
		
		}

	}
			
		
}
