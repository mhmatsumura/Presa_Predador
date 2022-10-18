public class Tempo extends java.lang.Thread {

   static int velocidade = 0;
   static int numero_execucao = 0;
  
    public void run() {
    	
    	for (int i = 0 ; i < numero_execucao;i++){
    		
    		FrameQ.executaPredador();
    
    
    		try {Thread.sleep( velocidade );} catch (InterruptedException e) {}
    	
    		FrameQ.executaQ(FrameQ.matriz);
    	
    	
    		try {Thread.sleep( velocidade );} catch (InterruptedException e) {}
    	}
    	
    	
        
    }
    public void setVelocidade(int veloc){
    	velocidade = veloc;
    }
    public void setNumeroExecucao(int num){
    	numero_execucao = num;
    }

}