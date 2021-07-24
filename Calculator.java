import java.awt.Color;
import javax.swing.ImageIcon;

public class Calculator extends javax.swing.JFrame{
	// ------------------------------ ATRIBUTOS ---------------------------------
	
	private javax.swing.JButton b0;
	private javax.swing.JButton b1;
	private javax.swing.JButton b2;
	private javax.swing.JButton b3;
	private javax.swing.JButton b4;
	private javax.swing.JButton b5;
	private javax.swing.JButton b6;
	private javax.swing.JButton b7;
	private javax.swing.JButton b8;
	private javax.swing.JButton b9;
	private javax.swing.JButton ac;
	private javax.swing.JButton c;
	private javax.swing.JButton masmenos;
	private javax.swing.JButton porcentaje;
	private javax.swing.JButton entre;
	private javax.swing.JButton por;
	private javax.swing.JButton menos;
	private javax.swing.JButton mas;
	private javax.swing.JButton mcr;
	private javax.swing.JButton mmenos;
	private javax.swing.JButton mmas;
	private javax.swing.JButton raiz;
	private javax.swing.JButton off;
	private javax.swing.JButton punto;
	private javax.swing.JButton igual;
	private javax.swing.JTextField pantalla;
	
	// ---------------------------- CONSTRUCTOR -------------------------------
	
	public Calculator(){
		b0         = new javax.swing.JButton();
		b1         = new javax.swing.JButton();
		b2         = new javax.swing.JButton();
		b3         = new javax.swing.JButton();
		b4         = new javax.swing.JButton();
		b5         = new javax.swing.JButton();
		b6         = new javax.swing.JButton();
		b7         = new javax.swing.JButton();
		b8         = new javax.swing.JButton();
		b9         = new javax.swing.JButton();
		ac         = new javax.swing.JButton();
		c          = new javax.swing.JButton();
		masmenos   = new javax.swing.JButton();
		porcentaje = new javax.swing.JButton();
		entre      = new javax.swing.JButton();
		por        = new javax.swing.JButton();
		menos      = new javax.swing.JButton();
		mas        = new javax.swing.JButton();
		punto      = new javax.swing.JButton();
		igual      = new javax.swing.JButton();
		mcr        = new javax.swing.JButton();
		mmenos     = new javax.swing.JButton();
		mmas       = new javax.swing.JButton();
		raiz       = new javax.swing.JButton();
		off        = new javax.swing.JButton();
		pantalla   = new javax.swing.JTextField();
		
		this.setTitle("Calculadora");
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		this.setSize(314, 457+31);
		this.setVisible(true);
		this.setIconImage((new ImageIcon("calc_ico.png")).getImage());
		this.getContentPane().setBackground(Color.GRAY);
		
		mcr       .setText("mcr");
		mmenos    .setText("m-");
		mmas      .setText("m+");
		raiz      .setText("sqrt");
		off       .setText("off");
		ac        .setText("ac");
		c         .setText("c");
		masmenos  .setText("+/-");
		porcentaje.setText("%");
		b7        .setText("7");
		b8        .setText("8");
		b9        .setText("9");
		entre     .setText("/");
		b4        .setText("4");
		b5        .setText("5");
		b6        .setText("6");
		por       .setText("X");
		b1        .setText("1");
		b2        .setText("2");
		b3        .setText("3");
		menos     .setText("-");
		b0        .setText("0");
		punto     .setText(".");
		igual     .setText("=");
		mas       .setText("+");
		
		mcr       .setBounds(7+0,154,54, 41);
		mmenos    .setBounds(7+58,154,54, 41);
		mmas      .setBounds(7+116,154,54, 41);
		raiz      .setBounds(7+174,154,54, 41);
		off       .setBounds(7+232,154,54, 41);
		ac        .setBounds(5+0,205,65,40);
		c         .setBounds(5+75,205,65,40);
		masmenos  .setBounds(5+150,205,65,40);
		porcentaje.setBounds(5+225,205,65,40);
		b7        .setBounds(5+0, 255, 65, 40);
		b8        .setBounds(5+75, 255, 65, 40);
		b9        .setBounds(5+150, 255, 65, 40);
		entre     .setBounds(5+225, 255, 65, 40);
		b4        .setBounds(5+0, 305, 65,40);
		b5        .setBounds(5+75, 305, 65,40);
		b6        .setBounds(5+150, 305, 65,40);
		por       .setBounds(5+225, 305, 65,40);
		b1        .setBounds(5+0, 355, 65, 40);
		b2        .setBounds(5+75, 355, 65, 40);
		b3        .setBounds(5+150, 355, 65, 40);
		menos     .setBounds(5+225, 355, 65, 40);
		b0        .setBounds(5+0,405, 65, 40);
		punto     .setBounds(5+75,405,65,40);
		igual     .setBounds(5+150,405,65,40);
		mas       .setBounds(5+225,405,65,40);
		pantalla  .setBounds(5,5, 290, 140);
		
		pantalla.setText("000");
		
		
		this.add(mcr);
		this.add(mmenos);
		this.add(mmas);
		this.add(raiz);
		this.add(off);
		
		this.add(ac);
		this.add(c);
		this.add(masmenos);
		this.add(porcentaje);
		
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(entre);
		
		
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(por);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(menos);
		
		this.add(b0);
		this.add(punto);
		this.add(igual);
		this.add(mas);
		
		this.add(pantalla);
	}
	
	// -------------------------- MÉTODOS ESTATICOS -----------------------------
	/*
	 * Método main
	 * @param argv son los argumentos de consola
	 */
	public static void main(String[] argv) {
		new Calculator();
	}
}
