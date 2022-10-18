
/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/


import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class FrameQ extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private static Tempo tempo;
	private static int acao = 0;
	private static JLabel jl11;
	private static JLabel jl13;
	private static JLabel jl12;
	private static JLabel jl41;
	private static JLabel jl31;
	private static JLabel jl22;
	private static JLabel jl42;
	private static JLabel jl24;
	private static JLabel jl26;
	private static JLabel jl28;
	private static JLabel jl510;
	private JTextField jtExecucao;
	private JLabel jlResultado3;
	private static JTextField jtMensagem3;
	private JLabel jlResultado2;
	private JLabel jlResultado;
	private static JTextField jtMensagem2;
	private JSeparator jSeparator2;
	private JSeparator jSeparator1;
	private JLabel jLabel1;
	private JLabel jlExecucao;
	private JLabel jlVelocidade2;
	private JTextField jtVelocidade;
	private JLabel jlVelocidade;
	private static JLabel jl1010;
	private static JLabel jl109;
	private static JLabel jl108;
	private static JLabel jl107;
	private static JLabel jl106;
	private static JLabel jl105;
	private static JLabel jl104;
	private static JLabel jl103;
	private static JLabel jl910;
	private static JLabel jl99;
	private static JLabel jl98;
	private static JLabel jl97;
	private static JLabel jl96;
	private static JLabel jl95;
	private static JLabel jl94;
	private static JLabel jl93;
	private static JLabel jl810;
	private static JLabel jl89;
	private static JLabel jl88;
	private static JLabel jl87;
	private static JLabel jl86;
	private static JLabel jl85;
	private static JLabel jl84;
	private static JLabel jl83;
	private static JLabel jl710;
	private static JLabel jl79;
	private static JLabel jl78;
	private static JLabel jl77;
	private static JLabel jl76;
	private static JLabel jl75;
	private static JLabel jl74;
	private static JLabel jl73;
	private static JLabel jl610;
	private static JLabel jl69;
	private static JLabel jl68;
	private static JLabel jl67;
	private static JLabel jl66;
	private static JLabel jl65;
	private static JLabel jl64;
	private static JLabel jl63;
	private static JLabel jl59;
	private static JLabel jl58;
	private static JLabel jl57;
	private static JLabel jl56;
	private static JLabel jl55;
	private static JLabel jl54;
	private static JLabel jl53;
	private static JLabel jl410;
	private static JLabel jl49;
	private static JLabel jl48;
	private static JLabel jl47;
	private static JLabel jl46;
	private static JLabel jl45;
	private static JLabel jl44;
	private static JLabel jl43;
	private static JLabel jl310;
	private static JLabel jl39;
	private static JLabel jl38;
	private static JLabel jl37;
	private static JLabel jl36;
	private static JLabel jl35;
	private static JLabel jl34;
	private static JLabel jl33;
	private static JLabel jl210;
	private static JLabel jl29;
	private static JLabel jl27;
	private static JLabel jl25;
	private static JLabel jl23;
	private static JLabel jl102;
	private static JLabel jl92;
	private static JLabel jl82;
	private static JLabel jl72;
	private static JLabel jl62;
	private static JLabel jl52;
	private static JLabel jl32;
	private static JLabel jl101;
	private static JLabel jl91;
	private static JLabel jl81;
	private static JLabel jl71;
	private static JLabel jl61;
	private static JLabel jl51;
	private static JLabel jl21;
	private static JLabel jl110;
	private static JLabel jl19;
	private static JLabel jl18;
	private static JLabel jl17;
	private static JLabel jl16;
	private static JLabel jl15;
	private static JLabel jl14;
	private JButton jbPlay;
	private static JTextArea jtMensagem;
	private JButton jbTreinar;
	private JButton jButton1;
	private JButton jbStop;
	private JButton jbContinua;
	private JButton jbReiniciar;
	private JLabel jlnumeroInteracoes;
	private JTextField jtNumeroInteracoes;
	private ButtonGroup btReforco;
	private JRadioButton jrQ;
	private JRadioButton jrSarsa;
	static JProgressBar progressBar;
	
	static double[][] matriz = new double[10][8];
	private static int[] maximo = new int[10];
	static Icon  falcao = new ImageIcon("icones\\falcao.jpg");
	static Icon  ceu = new ImageIcon("icones\\ceu.jpg");
	static Icon  captura = new ImageIcon("icones\\captura.jpg");
	static Icon  passaros = new ImageIcon("icones\\passaros.jpg");
	static Icon  pare = new ImageIcon("icones\\pare.png");
	static Icon  reiniciar = new ImageIcon("icones\\reiniciar.png");
	static Icon  continua = new ImageIcon("icones\\continua.png");
	private Icon  play = new ImageIcon("icones\\play.png");
	static int iPresa = 0,jPresa = 0;
	static int iPredador = 0,jPredador = 0;
	private static int numero_captura = 0;
	private static int num_execucao = 0;
	private static int numero_sorteado = 0;
	private static int estado_anterior = 0;
	private static int troca = 0;
	private static int iaux = 0,jaux = 0;
    static JScrollPane jsTabela; 
    static JEditorPane jaTabela;




	

	

	/**
	* Auto-generated main method to display this JFrame
	*/
	
	
	public FrameQ() {
		super("Problema presa/predador.");
		
	
		
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			
			{
				
				jl11 = new JLabel(ceu);
			    getContentPane().add(jl11);
				jl11.setBounds(12, 29, 60, 60);
			}
			
			{
				jl12 = new JLabel(ceu);
				getContentPane().add(jl12);
				jl12.setText("12");
				jl12.setBounds(72, 29, 60, 60);
			}
			{
				jl13 = new JLabel(ceu);
				getContentPane().add(jl13);
				jl13.setText("13");
				jl13.setBounds(132, 29, 60, 60);
			}
			{
				jl14 = new JLabel(ceu);
				getContentPane().add(jl14);
				jl14.setText("14");
				jl14.setBounds(192, 29, 60, 60);
			}
			{
				jl15 = new JLabel(ceu);
				getContentPane().add(jl15);
				jl15.setText("15");
				jl15.setBounds(252, 29, 60, 60);
			}
			{
				jl16 = new JLabel(ceu);
				getContentPane().add(jl16);
				jl16.setText("16");
				jl16.setBounds(312, 29, 60, 60);
			}
			{
				jl17 = new JLabel(ceu);
				getContentPane().add(jl17);
				jl17.setText("17");
				jl17.setBounds(372, 29, 60, 60);
			}
			{
				jl18 = new JLabel(ceu);
				getContentPane().add(jl18);
				jl18.setText("18");
				jl18.setBounds(432, 29, 60, 60);
			}
			{
				jl19 = new JLabel(ceu);
				getContentPane().add(jl19);
				jl19.setText("19");
				jl19.setBounds(492, 29, 60, 60);
			}
			{
				jl110 = new JLabel(ceu);
				getContentPane().add(jl110);
				jl110.setText("110");
				jl110.setBounds(552, 29, 60, 60);
			}
			{
				jl21 = new JLabel(ceu);
				getContentPane().add(jl21);
				jl21.setText("21");
				jl21.setBounds(12, 89, 60, 60);
			}
			{
				jl31 = new JLabel(ceu);
				getContentPane().add(jl31);
				jl31.setText("31");
				jl31.setBounds(12, 149, 60, 60);
			}
			{
				jl41 = new JLabel(ceu);
				getContentPane().add(jl41);
				jl41.setText("41");
				jl41.setBounds(12, 209, 60, 60);
			}
			{
				jl51 = new JLabel(ceu);
				getContentPane().add(jl51);
				jl51.setText("51");
				jl51.setBounds(12, 269, 60, 60);
			}
			{
				jl61 = new JLabel(ceu);
				getContentPane().add(jl61);
				jl61.setText("61");
				jl61.setBounds(12, 329, 60, 60);
			}
			{
				jl71 = new JLabel(ceu);
				getContentPane().add(jl71);
				jl71.setText("71");
				jl71.setBounds(12, 389, 60, 60);
			}
			{
				jl81 = new JLabel(ceu);
				getContentPane().add(jl81);
				jl81.setText("81");
				jl81.setBounds(12, 449, 60, 60);
			}
			{
				jl91 = new JLabel(ceu);
				getContentPane().add(jl91);
				jl91.setText("91");
				jl91.setBounds(12, 509, 60, 60);
			}
			{
				jl101 = new JLabel(ceu);
				getContentPane().add(jl101);
				jl101.setText("101");
				jl101.setBounds(12, 569, 60, 60);
			}
			{
				jl22 = new JLabel(ceu);
				getContentPane().add(jl22);
				jl22.setText("22");
				jl22.setBounds(72, 89, 60, 60);
			}
			{
				jl32 = new JLabel(ceu);
				getContentPane().add(jl32);
				jl32.setText("32");
				jl32.setBounds(72, 149, 60, 60);
			}
			{
				jl42 = new JLabel(ceu);
				getContentPane().add(jl42);
				jl42.setText("42");
				jl42.setBounds(72, 209, 60, 60);
			}
			{
				jl52 = new JLabel(ceu);
				getContentPane().add(jl52);
				jl52.setText("52");
				jl52.setBounds(72, 269, 60, 60);
			}
			{
				jl62 = new JLabel(ceu);
				getContentPane().add(jl62);
				jl62.setText("62");
				jl62.setBounds(72, 329, 60, 60);
			}
			{
				jl72 = new JLabel(ceu);
				getContentPane().add(jl72);
				jl72.setText("72");
				jl72.setBounds(72, 389, 60, 60);
			}
			{
				jl82 = new JLabel(ceu);
				getContentPane().add(jl82);
				jl82.setText("82");
				jl82.setBounds(72, 449, 60, 60);
			}
			{
				jl92 = new JLabel(ceu);
				getContentPane().add(jl92);
				jl92.setText("92");
				jl92.setBounds(72, 509, 60, 60);
			}
			{
				jl102 = new JLabel(ceu);
				getContentPane().add(jl102);
				jl102.setText("102");
				jl102.setBounds(72, 569, 60, 60);
			}
			{
				jl23 = new JLabel(ceu);
				getContentPane().add(jl23);
				jl23.setText("23");
				jl23.setBounds(132, 89, 60, 60);
			}
			{
				jl24 = new JLabel(ceu);
				getContentPane().add(jl24);
				jl24.setText("24");
				jl24.setBounds(192, 89, 60, 60);
			}
			{
				jl25 = new JLabel(ceu);
				getContentPane().add(jl25);
				jl25.setText("25");
				jl25.setBounds(252, 89, 60, 60);
			}
			{
				jl26 = new JLabel(ceu);
				getContentPane().add(jl26);
				jl26.setText("26");
				jl26.setBounds(312, 89, 60, 60);
			}
			{
				jl27 = new JLabel(ceu);
				getContentPane().add(jl27);
				jl27.setText("27");
				jl27.setBounds(372, 89, 60, 60);
			}
			{
				jl28 = new JLabel(ceu);
				getContentPane().add(jl28);
				jl28.setText("28");
				jl28.setBounds(432, 89, 60, 60);
			}
			{
				jl29 = new JLabel(ceu);
				getContentPane().add(jl29);
				jl29.setText("29");
				jl29.setBounds(492, 89, 60, 60);
			}
			{
				jl210 = new JLabel(ceu);
				getContentPane().add(jl210);
				jl210.setText("210");
				jl210.setBounds(552, 89, 60, 60);
			}
			{
				jl33 = new JLabel(ceu);
				getContentPane().add(jl33);
				jl33.setText("33");
				jl33.setBounds(132, 149, 60, 60);
			}
			{
				jl34 = new JLabel(ceu);
				getContentPane().add(jl34);
				jl34.setText("34");
				jl34.setBounds(192, 149, 60, 60);
			}
			{
				jl35 = new JLabel(ceu);
				getContentPane().add(jl35);
				jl35.setText("35");
				jl35.setBounds(252, 149, 60, 60);
			}
			{
				jl36 = new JLabel(ceu);
				getContentPane().add(jl36);
				jl36.setText("36");
				jl36.setBounds(312, 149, 60, 60);
			}
			{
				jl37 = new JLabel(ceu);
				getContentPane().add(jl37);
				jl37.setText("37");
				jl37.setBounds(372, 149, 60, 60);
			}
			{
				jl38 = new JLabel(ceu);
				getContentPane().add(jl38);
				jl38.setText("38");
				jl38.setBounds(432, 149, 60, 60);
			}
			{
				jl39 = new JLabel(ceu);
				getContentPane().add(jl39);
				jl39.setText("39");
				jl39.setBounds(492, 149, 60, 60);
			}
			{
				jl310 = new JLabel(ceu);
				getContentPane().add(jl310);
				jl310.setText("310");
				jl310.setBounds(552, 149, 60, 60);
			}
			{
				jl43 = new JLabel(ceu);
				getContentPane().add(jl43);
				jl43.setText("43");
				jl43.setBounds(132, 209, 60, 60);
			}
			{
				jl44 = new JLabel(ceu);
				getContentPane().add(jl44);
				jl44.setText("44");
				jl44.setBounds(192, 209, 60, 60);
			}
			{
				jl45 = new JLabel(ceu);
				getContentPane().add(jl45);
				jl45.setText("45");
				jl45.setBounds(252, 209, 60, 60);
			}
			{
				jl46 = new JLabel(ceu);
				getContentPane().add(jl46);
				jl46.setText("46");
				jl46.setBounds(312, 209, 60, 60);
			}
			{
				jl47 = new JLabel(ceu);
				getContentPane().add(jl47);
				jl47.setText("47");
				jl47.setBounds(372, 209, 60, 60);
			}
			{
				jl48 = new JLabel(ceu);
				getContentPane().add(jl48);
				jl48.setText("48");
				jl48.setBounds(432, 209, 60, 60);
			}
			{
				jl49 = new JLabel(ceu);
				getContentPane().add(jl49);
				jl49.setText("49");
				jl49.setBounds(492, 209, 60, 60);
			}
			{
				jl410 = new JLabel(ceu);
				getContentPane().add(jl410);
				jl410.setText("410");
				jl410.setBounds(552, 209, 60, 60);
			}
			{
				jl53 = new JLabel(ceu);
				getContentPane().add(jl53);
				jl53.setText("53");
				jl53.setBounds(132, 269, 60, 60);
			}
			{
				jl54 = new JLabel(ceu);
				getContentPane().add(jl54);
				jl54.setText("54");
				jl54.setBounds(192, 269, 60, 60);
			}
			{
				jl55 = new JLabel(ceu);
				getContentPane().add(jl55);
				jl55.setText("55");
				jl55.setBounds(252, 269, 60, 60);
			}
			{
				jl56 = new JLabel(ceu);
				getContentPane().add(jl56);
				jl56.setText("56");
				jl56.setBounds(312, 269, 60, 60);
			}
			{
				jl57 = new JLabel(ceu);
				getContentPane().add(jl57);
				jl57.setText("57");
				jl57.setBounds(372, 269, 60, 60);
			}
			{
				jl58 = new JLabel(ceu);
				getContentPane().add(jl58);
				jl58.setText("58");
				jl58.setBounds(432, 269, 60, 60);
			}
			{
				jl59 = new JLabel(ceu);
				getContentPane().add(jl59);
				jl59.setText("59");
				jl59.setBounds(492, 269, 60, 60);
			}
			{
				jl510 = new JLabel(ceu);
				getContentPane().add(jl510);
				jl510.setText("510");
				jl510.setBounds(552, 269, 60, 60);
			}
			{
				jl63 = new JLabel(ceu);
				getContentPane().add(jl63);
				jl63.setText("63");
				jl63.setBounds(132, 329, 60, 60);
			}
			{
				jl64 = new JLabel(ceu);
				getContentPane().add(jl64);
				jl64.setText("64");
				jl64.setBounds(192, 329, 60, 60);
			}
			{
				jl65 = new JLabel(ceu);
				getContentPane().add(jl65);
				jl65.setText("65");
				jl65.setBounds(252, 329, 60, 60);
			}
			{
				jl66 = new JLabel(ceu);
				getContentPane().add(jl66);
				jl66.setText("66");
				jl66.setBounds(312, 329, 60, 60);
			}
			{
				jl67 = new JLabel(ceu);
				getContentPane().add(jl67);
				jl67.setText("67");
				jl67.setBounds(372, 329, 60, 60);
			}
			{
				jl68 = new JLabel(ceu);
				getContentPane().add(jl68);
				jl68.setText("68");
				jl68.setBounds(432, 329, 60, 60);
			}
			{
				jl69 = new JLabel(ceu);
				getContentPane().add(jl69);
				jl69.setText("69");
				jl69.setBounds(492, 329, 60, 60);
			}
			{
				jl610 = new JLabel(ceu);
				getContentPane().add(jl610);
				jl610.setText("610");
				jl610.setBounds(552, 329, 60, 60);
			}
			{
				jl73 = new JLabel(ceu);
				getContentPane().add(jl73);
				jl73.setText("73");
				jl73.setBounds(132, 389, 60, 60);
			}
			{
				jl74 = new JLabel(ceu);
				getContentPane().add(jl74);
				jl74.setText("74");
				jl74.setBounds(192, 389, 60, 60);
			}
			{
				jl75 = new JLabel(ceu);
				getContentPane().add(jl75);
				jl75.setText("75");
				jl75.setBounds(252, 389, 60, 60);
			}
			{
				jl76 = new JLabel(ceu);
				getContentPane().add(jl76);
				jl76.setText("76");
				jl76.setBounds(312, 389, 60, 60);
			}
			{
				jl77 = new JLabel(ceu);
				getContentPane().add(jl77);
				jl77.setText("77");
				jl77.setBounds(372, 389, 60, 60);
			}
			{
				jl78 = new JLabel(ceu);
				getContentPane().add(jl78);
				jl78.setText("78");
				jl78.setBounds(432, 389, 60, 60);
			}
			{
				jl79 = new JLabel(ceu);
				getContentPane().add(jl79);
				jl79.setText("79");
				jl79.setBounds(492, 389, 60, 60);
			}
			{
				jl710 = new JLabel(ceu);
				getContentPane().add(jl710);
				jl710.setText("710");
				jl710.setBounds(552, 389, 60, 60);
			}
			{
				jl83 = new JLabel(ceu);
				getContentPane().add(jl83);
				jl83.setText("83");
				jl83.setBounds(132, 449, 60, 60);
			}
			{
				jl84 = new JLabel(ceu);
				getContentPane().add(jl84);
				jl84.setText("84");
				jl84.setBounds(192, 449, 60, 60);
			}
			{
				jl85 = new JLabel(ceu);
				getContentPane().add(jl85);
				jl85.setText("85");
				jl85.setBounds(252, 449, 60, 60);
			}
			{
				jl86 = new JLabel(ceu);
				getContentPane().add(jl86);
				jl86.setText("86");
				jl86.setBounds(312, 449, 60, 60);
			}
			{
				jl87 = new JLabel(ceu);
				getContentPane().add(jl87);
				jl87.setText("87");
				jl87.setBounds(372, 449, 60, 60);
			}
			{
				jl88 = new JLabel(ceu);
				getContentPane().add(jl88);
				jl88.setText("88");
				jl88.setBounds(432, 449, 60, 60);
			}
			{
				jl89 = new JLabel(ceu);
				getContentPane().add(jl89);
				jl89.setText("89");
				jl89.setBounds(492, 449, 60, 60);
			}
			{
				jl810 = new JLabel(ceu);
				getContentPane().add(jl810);
				jl810.setText("810");
				jl810.setBounds(552, 449, 60, 60);
			}
			{
				jl93 = new JLabel(ceu);
				getContentPane().add(jl93);
				jl93.setText("93");
				jl93.setBounds(132, 509, 60, 60);
			}
			{
				jl94 = new JLabel(ceu);
				getContentPane().add(jl94);
				jl94.setText("94");
				jl94.setBounds(192, 509, 60, 60);
			}
			{
				jl95 = new JLabel(ceu);
				getContentPane().add(jl95);
				jl95.setText("95");
				jl95.setBounds(252, 509, 60, 60);
			}
			{
				jl96 = new JLabel(ceu);
				getContentPane().add(jl96);
				jl96.setText("96");
				jl96.setBounds(312, 509, 60, 60);
			}
			{
				jl97 = new JLabel(ceu);
				getContentPane().add(jl97);
				jl97.setText("97");
				jl97.setBounds(372, 509, 60, 60);
			}
			{
				jl98 = new JLabel(ceu);
				getContentPane().add(jl98);
				jl98.setText("98");
				jl98.setBounds(432, 509, 60, 60);
			}
			{
				jl99 = new JLabel(ceu);
				getContentPane().add(jl99);
				jl99.setText("99");
				jl99.setBounds(492, 509, 60, 60);
			}
			{
				jl910 = new JLabel(ceu);
				getContentPane().add(jl910);
				jl910.setText("910");
				jl910.setBounds(552, 509, 60, 60);
			}
			{
				jl103 = new JLabel(ceu);
				getContentPane().add(jl103);
				jl103.setText("103");
				jl103.setBounds(132, 569, 60, 60);
			}
			{
				jl104 = new JLabel(ceu);
				getContentPane().add(jl104);
				jl104.setText("104");
				jl104.setBounds(192, 569, 60, 60);
			}
			{
				jl105 = new JLabel(ceu);
				getContentPane().add(jl105);
				jl105.setText("105");
				jl105.setBounds(252, 569, 60, 60);
			}
			{
				jl106 = new JLabel(ceu);
				getContentPane().add(jl106);
				jl106.setText("106");
				jl106.setBounds(312, 569, 60, 60);
			}
			{
				jl107 = new JLabel(ceu);
				getContentPane().add(jl107);
				jl107.setText("107");
				jl107.setBounds(372, 569, 60, 60);
			}
			{
				jl108 = new JLabel(ceu);
				getContentPane().add(jl108);
				jl108.setText("108");
				jl108.setBounds(432, 569, 60, 60);
			}
			{
				jl109 = new JLabel(ceu);
				getContentPane().add(jl109);
				jl109.setText("109");
				jl109.setBounds(492, 569, 60, 60);
			}
			{
				jl1010 = new JLabel(ceu);
				getContentPane().add(jl1010);
				jl1010.setText("1010");
				jl1010.setBounds(552, 569, 60, 60);
			}
			{
				jrSarsa = new JRadioButton();
				getContentPane().add(jrSarsa);
				jrSarsa.setText("Sarsa");
				jrSarsa.setBounds(645, 33, 74, 20);
			}
			{
				jrQ = new JRadioButton();
				getContentPane().add(jrQ);
				jrQ.setText("Q-Learning");
				jrQ.setBounds(719, 33, 109, 20);
				jrQ.setSelected(true);
			}

			btReforco = new ButtonGroup();
			btReforco.add(jrSarsa);
			btReforco.add(jrQ);
			{
				jtNumeroInteracoes = new JTextField();
				getContentPane().add(jtNumeroInteracoes);
				jtNumeroInteracoes.setBounds(662, 86, 128, 28);
				jtNumeroInteracoes.setText("0");
				
			}
			{
				jlnumeroInteracoes = new JLabel();
				getContentPane().add(jlnumeroInteracoes);
				jlnumeroInteracoes.setText("Número de interações:");
				jlnumeroInteracoes.setBounds(662, 64, 151, 16);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setBounds(618, 6, 19, 651);
				jButton1.setEnabled(false);
			}
			{
				jbTreinar = new JButton();
				getContentPane().add(jbTreinar);
				jbTreinar.setText("Treinar");
				jbTreinar.setBounds(692, 137, 67, 28);
				jbTreinar.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						progressBar.setMinimum(0); 
						progressBar.setMaximum(Integer.parseInt(jtNumeroInteracoes.getText()));  
						
						if (jrSarsa.isSelected()){
							
							SarsaInfinito sarsa = new SarsaInfinito(); 
							sarsa.setCiclos(Integer.parseInt(jtNumeroInteracoes.getText()));
							sarsa.start();
							
							matriz = SarsaInfinito.getQ();
							jtMensagem.setText("Agente treinado pelo \nSarsa\ncom " +
									jtNumeroInteracoes.getText()+" interações.");
							
						}else{
							
							QlearningInfinito q = new QlearningInfinito(); 
							q.setCiclos(Integer.parseInt(jtNumeroInteracoes.getText()));
							q.start();
							
							matriz = QlearningInfinito.getQ();
							jtMensagem.setText("Agente treinado pelo \nQ-learning \ncom " +
									jtNumeroInteracoes.getText()+" interações.");
							
						}
						
						
						
						
					}
				});

				
			
			
			
			}
			{
				
			}
			{
				jtMensagem = new JTextArea();
				getContentPane().add(jtMensagem);
				jtMensagem.setText("Agente não treinado!!!");
				jtMensagem.setBounds(643, 180, 168, 82);
				jtMensagem.setForeground(new java.awt.Color(128,64,64));
				jtMensagem.setBackground(new java.awt.Color(200,200,200));
				jtMensagem.setEditable(false);
				jtMensagem.setFont(new Font("Serif", Font.BOLD, 14));
				

			}
			{
				progressBar = new JProgressBar(); 
				getContentPane().add(progressBar);
				progressBar.setBounds(637, 263, 180, 19);  
				progressBar.setStringPainted(true);  
				 
				
			}
			tempo = new Tempo();
			{
				jbPlay = new JButton(play);
				getContentPane().add(jbPlay);
				jbPlay.setBounds(642, 417, 168, 100);
				jbPlay.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						troca = 0;
						num_execucao = 0;
						numero_captura = 0;
						jtMensagem2.setText("0");
						jtMensagem3.setText("0");
						tempo = new Tempo();					
						tempo.setVelocidade(1000/Integer.parseInt(jtVelocidade.getText()));
						tempo.setNumeroExecucao(Integer.parseInt(jtExecucao.getText()));
						tempo.start();
					
						
						
						
					}
				});
			}
			{
				jbStop = new JButton(pare);
				getContentPane().add(jbStop);
				jbStop.setBounds(642, 515, 53, 53);
				jbStop.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						tempo.suspend();
						
						
						
					}
				});
			}
			
			
			{
				jaTabela = new JEditorPane();
				jaTabela.setContentType("text/html");
				
		
			
				String texto = "";
				String textoAux = "";
				DecimalFormat decimal = new DecimalFormat( "0.0" );  
				  
				texto = "<html><br><br><div align=center><b>TABELA Q</div></b>";
				for (int i=0;i<10;i++) {
					
					texto = texto + ("<br><br><b><u><font color=\"black\">ESTADO "+i+"</font></u></b>");
					
					
					for (int j=0;j<8;j++){
						
						textoAux = "\n"+"Q["+i+"]["+j+"]= "+decimal.format(matriz[i][j]);
						
						texto = texto+("<br><font color=\"black\">"+textoAux+"</font>");
						
					}
					
				}
				texto += "</html>";
			
				jaTabela.setText(texto);
			}
			
		
			{
				jsTabela = new JScrollPane(jaTabela);
				getContentPane().add(jsTabela);
				jsTabela.setBounds(817, 5, 155, 650);
			
			}
			
			{
				jbContinua = new JButton(continua);
				getContentPane().add(jbContinua);
				jbContinua.setBounds(695, 515, 53, 53);
				jbContinua.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						tempo.resume();
						
						
						
					}
				});
			}
			{
				jbReiniciar = new JButton(reiniciar);
				getContentPane().add(jbReiniciar);
				jbReiniciar.setBounds(748, 515, 62, 53);
				jbReiniciar.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent e) {
						
						tempo.stop();
						
						jtMensagem2.setText("0");
						jtMensagem3.setText("0");
						
						for(int i=0;i<10;i++){
							for(int j=0;j<10;j++){
								Desenha(i,j,ceu);
							}
						}
						iPresa = 5;jPresa = 5;
						iPredador = 8;jPredador = 2;
						Desenha(iPresa,jPresa,passaros);
						Desenha(iPredador,jPredador,falcao);
						
					
						
					}
				});
			}
			{
				jlVelocidade = new JLabel();
				getContentPane().add(jlVelocidade);
				jlVelocidade.setText("VELOCIDADE:");
				jlVelocidade.setBounds(644, 281, 115, 16);
			}
			{
				jtVelocidade = new JTextField();
				getContentPane().add(jtVelocidade);
				jtVelocidade.setBounds(643, 306, 47, 28);
				jtVelocidade.setText("1");
				jtVelocidade.setHorizontalAlignment(JTextField.RIGHT);
			}
			{
				jlVelocidade2 = new JLabel();
				getContentPane().add(jlVelocidade2);
				jlVelocidade2.setText("movimentos por seg.");
				jlVelocidade2.setBounds(690, 312, 140, 16);
			}
			{
				jlExecucao = new JLabel();
				getContentPane().add(jlExecucao);
				jlExecucao.setText("NÚMERO DE EXECUÇÕES:");
				jlExecucao.setBounds(645, 348, 179, 16);
			}
			{
				jtExecucao = new JTextField();
				getContentPane().add(jtExecucao);
				jtExecucao.setBounds(643, 368, 47, 28);
				jtExecucao.setText("1");
				jtExecucao.setHorizontalAlignment(JTextField.RIGHT);
			}
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("execuções.");
				jLabel1.setBounds(691, 372, 62, 16);
			}
			{
				jSeparator1 = new JSeparator();
				getContentPane().add(jSeparator1);
				jSeparator1.setBounds(647, 340, 156, 10);
			}
			{
				jSeparator2 = new JSeparator();
				getContentPane().add(jSeparator2);
				jSeparator2.setBounds(647, 403, 156, 10);
			}
			{
				jtMensagem2 = new JTextField();
				getContentPane().add(jtMensagem2);
				jtMensagem2.setBounds(646, 588, 60, 28);
				jtMensagem2.setEditable(false);
				jtMensagem2.setHorizontalAlignment(JTextField.RIGHT);
				jtMensagem2.setForeground(new java.awt.Color(128,64,64));
				jtMensagem2.setBackground(new java.awt.Color(200,200,200));
				jtMensagem2.setFont(new Font("Serif", Font.BOLD, 18));
				jtMensagem2.setText("0");
				
			}
			{
				jlResultado = new JLabel();
				getContentPane().add(jlResultado);
				jlResultado.setText("A presa foi capturada");
				jlResultado.setBounds(648, 566, 116, 16);
			}
			{
				jlResultado2 = new JLabel();
				getContentPane().add(jlResultado2);
				jlResultado2.setText("vezes em");
				jlResultado2.setBounds(707, 594, 52, 16);
			}
			{
				jtMensagem3 = new JTextField();
				getContentPane().add(jtMensagem3);
				jtMensagem3.setBounds(646, 622, 60, 28);
				jtMensagem3.setEditable(false);
				jtMensagem3.setHorizontalAlignment(JTextField.RIGHT);
				jtMensagem3.setForeground(new java.awt.Color(128,64,64));
				jtMensagem3.setBackground(new java.awt.Color(200,200,200));
				jtMensagem3.setFont(new Font("Serif", Font.BOLD, 18));
				jtMensagem3.setText("0");
			}
			{
				jlResultado3 = new JLabel();
				getContentPane().add(jlResultado3);
				jlResultado3.setText("execuções.");
				jlResultado3.setBounds(707, 627, 62, 16);
			}
			iPresa = 5;jPresa = 5;
			iPredador = 8;jPredador = 2;
			Desenha(iPresa,jPresa,passaros);
			Desenha(iPredador,jPredador,falcao);
			estado_anterior = 0;
		

			pack();
			setLocationRelativeTo(null);
			getContentPane().setBackground(new java.awt.Color(237,238,241));
			
			setSize(995,698);
			setLocationRelativeTo(null);
			setVisible(true);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			
		
			


		
	}//construtor
	public static void executaQ(double[][] matrizX){
		
		
		
		num_execucao += 1;
		estado_anterior = getEstado(iPresa,jPresa,iPredador,jPredador);
		jtMensagem3.setText(""+num_execucao);
		
		Desenha(iPresa,jPresa,ceu);
		if 	(getEstado(iPresa,jPresa,iPredador,jPredador)== 9){
			Desenha(iPredador,jPredador,falcao);
		}
		for (int i=0;i<10;i++){
			maximo[i]= MAX(i);
		}
		
		if 	(getEstado(iPresa,jPresa,iPredador,jPredador)== 0){
			
			acao = 8;
			
			
		}else{
			acao = maximo[getEstado(iPresa,jPresa,iPredador,jPredador)];
		}
		switch(acao){
		
			case 0: iPresa -= 1;jPresa -= 1;break;
			case 1: iPresa -= 1;break;
			case 2: iPresa -= 1;jPresa += 1;break;
			case 3: jPresa -= 1;break;
			case 4: jPresa += 1;break;
			case 5: iPresa += 1;jPresa -= 1;break;
			case 6: iPresa += 1;break;
			case 7: iPresa += 1;jPresa += 1;break;

		}
		
		if ((iPresa>9)||(iPresa<0)||(jPresa>9)||(jPresa<0)){
			Desenha(iPredador,jPredador,ceu);
		
		if ((iPresa>9)&&(jPresa>9)){
			
			iPresa-=4;jPresa-=4;
			iPredador-=4;jPredador-=4;
			
		}else if ((iPresa<0)&&(jPresa<0)){
			
			iPresa+=4;jPresa+=4;
			iPredador+=4;jPredador+=4;
			
		}else if ((iPresa>9)&&(jPresa<0)){
			
			iPresa-=4;jPresa+=4;
			iPredador-=4;jPredador+=4;
			
		}else if ((iPresa<0)&&(jPresa>9)){
			
			iPresa+=4;jPresa-=4;
			iPredador+=4;jPredador-=4;
			
		}else if ((iPresa>9)&&(jPresa<=9||jPresa>=0)){
			
			iPresa-=4;
			iPredador-=4;
			
		}else if ((iPresa<0)&&(jPresa<=9||jPresa>=0)){
			
			iPresa+=4;
			iPredador+=4;
			
		}else if ((iPresa<=9||iPresa>=0)&&(jPresa>9)){
			
			jPresa-=4;
			jPredador-=4;
			
		}else if ((iPresa<=9||iPresa>=0)&&(jPresa<0)){
			
			jPresa+=4;
			jPredador+=4;
			
		}
				
			Desenha(iPresa,jPresa,passaros);
			Desenha(iPredador,jPredador,falcao);
		}else{
		
			Desenha(iPresa,jPresa,passaros);
		}
			
	}
	public static void executaPredador(){
		
		troca += 1;
		
		if (troca == 20){
			
			troca = 0;
			iaux = iPresa;jaux = jPresa;
			iPresa = iPredador;jPresa = jPredador;
			iPredador = iaux;jPredador = jaux;
			Desenha(iPresa,jPresa,passaros);
			Desenha(iPredador,jPredador,falcao);
			
		}
		Desenha(iPredador,jPredador,ceu);
		
		Random random = new Random();
		numero_sorteado = random.nextInt(2);
		
		if ((iPresa > iPredador)&&(jPresa > jPredador)){
			if 	((getEstado(iPresa,jPresa,iPredador,jPredador)!= 0)&&
			    (estado_anterior != 9)){
				iPredador += 1;jPredador += 1;	
			}else{
				if (numero_sorteado==0){
					iPredador += 1;
				}else {
					jPredador += 1;
				}
			}
		}else if ((iPresa < iPredador)&&(jPresa < jPredador)){
			if 	((getEstado(iPresa,jPresa,iPredador,jPredador)!= 0)&&
				    (estado_anterior != 9)){
					iPredador -= 1;jPredador -= 1;	
			}else{
				if (numero_sorteado==0){
					iPredador -= 1;
				}else {
					jPredador -= 1;
				}
			}
		}else if ((iPresa > iPredador)&&(jPresa < jPredador)){
			if 	((getEstado(iPresa,jPresa,iPredador,jPredador)!= 0)&&
				    (estado_anterior != 9)){
					iPredador += 1;jPredador -= 1;	
			}else{
				if (numero_sorteado==0){
					iPredador += 1;
				}else {
					jPredador -= 1;
				}
			}
		}else if ((iPresa < iPredador)&&(jPresa > jPredador)){
			if 	((getEstado(iPresa,jPresa,iPredador,jPredador)!= 0)&&
				    (estado_anterior != 9)){
					iPredador -= 1;jPredador += 1;	
			}else{
				if (numero_sorteado==0){
					iPredador -= 1;
				}else {
					jPredador += 1;
				}
			}
		}else if (iPresa > iPredador){
				iPredador += 1;
			}else if (iPresa < iPredador){
				iPredador -= 1;
			}else if (jPresa > jPredador){
				jPredador += 1;
			}else if (jPresa < jPredador){
				jPredador -= 1;
			}
		
		
			if ((iPresa==iPredador)&&(jPresa==jPredador)){
				
				Desenha(iPredador,jPredador,captura);
				numero_captura +=1;
				jtMensagem2.setText(""+numero_captura);
				
			}else{
		
				Desenha(iPredador,jPredador,falcao);
				
			}
	}
	
	
			
			
	
	public static int getEstado(int lpa,int cpa,int lpo,int cpo){
		int estado = 0;
		
		if ((lpo == lpa) && (cpo == cpa)){
			estado = 9;
		}else if ((Math.pow((lpo - lpa),2) > 2) ||(Math.pow((cpo - cpa),2) > 2)) {
			estado = 0;
		}else if ((lpo < lpa) && (cpo < cpa)){
			estado = 1;
		}else if ((lpo < lpa) && (cpo == cpa)){
			estado = 2;
		}else if ((lpo < lpa) && (cpo > cpa)){
			estado = 3;
		}else if ((lpo == lpa) && (cpo < cpa)){
			estado = 4;
		}else if ((lpo == lpa) && (cpo > cpa)){
			estado = 5;
		}else if ((lpo > lpa) && (cpo < cpa)){
			estado = 6;
		}else if ((lpo > lpa) && (cpo == cpa)){
			estado = 7;
		}else if ((lpo > lpa) && (cpo > cpa)){
			estado = 8;
		}
		
		return estado;
	}
	public static void Desenha(int linha,int coluna,Icon icone){
		
		switch(linha){
		case 0: switch(coluna){
				case  0: jl11.setIcon(icone);break;
				case  1: jl12.setIcon(icone);break;
				case  2: jl13.setIcon(icone);break;
				case  3: jl14.setIcon(icone);break;
				case  4: jl15.setIcon(icone);break;
				case  5: jl16.setIcon(icone);break;
				case  6: jl17.setIcon(icone);break;
				case  7: jl18.setIcon(icone);break;
				case  8: jl19.setIcon(icone);break;
				case  9: jl110.setIcon(icone);break;
				}break;
		case 1: switch(coluna){
				case  0: jl21.setIcon(icone);break;
				case  1: jl22.setIcon(icone);break;
				case  2: jl23.setIcon(icone);break;
				case  3: jl24.setIcon(icone);break;
				case  4: jl25.setIcon(icone);break;
				case  5: jl26.setIcon(icone);break;
				case  6: jl27.setIcon(icone);break;
				case  7: jl28.setIcon(icone);break;
				case  8: jl29.setIcon(icone);break;
				case  9: jl210.setIcon(icone);break;
				}break;
		case 2: switch(coluna){
				case  0: jl31.setIcon(icone);break;
				case  1: jl32.setIcon(icone);break;
				case  2: jl33.setIcon(icone);break;
				case  3: jl34.setIcon(icone);break;
				case  4: jl35.setIcon(icone);break;
				case  5: jl36.setIcon(icone);break;
				case  6: jl37.setIcon(icone);break;
				case  7: jl38.setIcon(icone);break;
				case  8: jl39.setIcon(icone);break;
				case  9: jl310.setIcon(icone);break;
				}break;
		case 3: switch(coluna){
				case  0: jl41.setIcon(icone);break;
				case  1: jl42.setIcon(icone);break;
				case  2: jl43.setIcon(icone);break;
				case  3: jl44.setIcon(icone);break;
				case  4: jl45.setIcon(icone);break;
				case  5: jl46.setIcon(icone);break;
				case  6: jl47.setIcon(icone);break;
				case  7: jl48.setIcon(icone);break;
				case  8: jl49.setIcon(icone);break;
				case  9: jl410.setIcon(icone);break;
				}break;
		case 4: switch(coluna){
				case  0: jl51.setIcon(icone);break;
				case  1: jl52.setIcon(icone);break;
				case  2: jl53.setIcon(icone);break;
				case  3: jl54.setIcon(icone);break;
				case  4: jl55.setIcon(icone);break;
				case  5: jl56.setIcon(icone);break;
				case  6: jl57.setIcon(icone);break;
				case  7: jl58.setIcon(icone);break;
				case  8: jl59.setIcon(icone);break;
				case  9: jl510.setIcon(icone);break;
				}break;
		case 5: switch(coluna){
				case  0: jl61.setIcon(icone);break;
				case  1: jl62.setIcon(icone);break;
				case  2: jl63.setIcon(icone);break;
				case  3: jl64.setIcon(icone);break;
				case  4: jl65.setIcon(icone);break;
				case  5: jl66.setIcon(icone);break;
				case  6: jl67.setIcon(icone);break;
				case  7: jl68.setIcon(icone);break;
				case  8: jl69.setIcon(icone);break;
				case  9: jl610.setIcon(icone);break;
				}break;
		case 6: switch(coluna){
				case  0: jl71.setIcon(icone);break;
				case  1: jl72.setIcon(icone);break;
				case  2: jl73.setIcon(icone);break;
				case  3: jl74.setIcon(icone);break;
				case  4: jl75.setIcon(icone);break;
				case  5: jl76.setIcon(icone);break;
				case  6: jl77.setIcon(icone);break;
				case  7: jl78.setIcon(icone);break;
				case  8: jl79.setIcon(icone);break;
				case  9: jl710.setIcon(icone);break;
				}break;
		case 7: switch(coluna){
				case  0: jl81.setIcon(icone);break;
				case  1: jl82.setIcon(icone);break;
				case  2: jl83.setIcon(icone);break;
				case  3: jl84.setIcon(icone);break;
				case  4: jl85.setIcon(icone);break;
				case  5: jl86.setIcon(icone);break;
				case  6: jl87.setIcon(icone);break;
				case  7: jl88.setIcon(icone);break;
				case  8: jl89.setIcon(icone);break;
				case  9: jl810.setIcon(icone);break;
				}break;
		case 8: switch(coluna){
				case  0: jl91.setIcon(icone);break;
				case  1: jl92.setIcon(icone);break;
				case  2: jl93.setIcon(icone);break;
				case  3: jl94.setIcon(icone);break;
				case  4: jl95.setIcon(icone);break;
				case  5: jl96.setIcon(icone);break;
				case  6: jl97.setIcon(icone);break;
				case  7: jl98.setIcon(icone);break;
				case  8: jl99.setIcon(icone);break;
				case  9: jl910.setIcon(icone);break;
				}break;
		case 9: switch(coluna){
				case  0: jl101.setIcon(icone);break;
				case  1: jl102.setIcon(icone);break;
				case  2: jl103.setIcon(icone);break;
				case  3: jl104.setIcon(icone);break;
				case  4: jl105.setIcon(icone);break;
				case  5: jl106.setIcon(icone);break;
				case  6: jl107.setIcon(icone);break;
				case  7: jl108.setIcon(icone);break;
				case  8: jl109.setIcon(icone);break;
				case  9: jl1010.setIcon(icone);break;
				}break;
		
				
		}
	}
	
				
		
	
	public static int MAX(int estado){
		
		double max = 0;
		int acao = 0;
		
		max = Math.max(matriz[estado][0],matriz[estado][1]);
		max = Math.max(max,matriz[estado][2]);
		max = Math.max(max,matriz[estado][3]);
		max = Math.max(max,matriz[estado][4]);
		max = Math.max(max,matriz[estado][5]);
		max = Math.max(max,matriz[estado][6]);
		max = Math.max(max,matriz[estado][7]);
		if ((max == 0)||(getEstado(iPresa,jPresa,iPredador,jPredador)== 9)){
			
			acao = new Random().nextInt(8);
		}else{
		
			for (int i=0;i<8;i++){
				if (matriz[estado][i] == max){
					acao = i;
				}
			}
		}
	
		return acao;
	}
	
	 public static void main(String[] args) {
			
     	
			new FrameQ();
			
			
     }

	
}
