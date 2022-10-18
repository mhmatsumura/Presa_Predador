public class Tempo2 extends java.lang.Thread {

   int interacoes;
  
    public void run() {
    	
    	
    	FrameQ.progressBar.setValue(interacoes);
    	FrameQ.progressBar.setString("aguarde, treinando...");
    	
        
    }
    public void setInteracao(int num){
    	interacoes = num;
    }
    

}