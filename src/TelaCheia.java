import java.awt.Color;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;


public class TelaCheia extends JFrame {
  
  private static final long serialVersionUID = 1L;
  private JButton jbSair;
  private static JButton jfData;
  private static Date date;
  private static DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

public TelaCheia() {
    super("Vendas");
    {
		
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
    date = new Date();
    getContentPane().setPreferredSize( Toolkit.getDefaultToolkit().getScreenSize());
    pack();
    getContentPane().setLocation(50,50);
    setResizable(false);
    
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    
    getContentPane().setBackground(Color.black);
    getContentPane().setLayout(null);
    {
        Point p = new Point(0, 0);
        SwingUtilities.convertPointToScreen(p, getContentPane());
        Point l = getLocation();
        l.x -= p.x;
        l.y -= p.y;
        setLocation(l);
    }
    {
        jbSair = new JButton();
    	jbSair.setText("SAIR");
    	jbSair.setBounds(15, 53, 94, 390);
 
    	
    	jbSair.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent evt) {
    			System.exit(0);
    		}
    	});
    }
    	
		
	{
		jfData = new JButton();
		getContentPane().add(jfData); 	
		jfData.setVisible(true);
	   	jfData.setBounds(15, 15, 94, 40);
		jfData.setFont(new java.awt.Font("Times New Roman",1,18));
		jfData.setHorizontalAlignment(0);
		jfData.setText(dateFormat.format( date.getTime() ));
			
	}
	
			
				
    	
    	

    	getContentPane().add(jbSair);
    
    	boolean tempo = true;
    	 
		while (tempo) {   
    		
	    	try { Thread.sleep (500); } catch (InterruptedException ex) {}
	    	
	    	date = new Date();
	       	jfData.setText(dateFormat.format(date));  
           		            
      }    

    

	    
    	
    	
    	
        	
    	
        
}

        public static void main(String[] args) {
	
        	
			new TelaCheia();
			
			
        }

}

