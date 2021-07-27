public class Calculator extends javax.swing.JFrame{
	
	public Calculator(){
		initComponents();
		pila = new java.util.Stack<String>();
		pantalla.setText("0");
		pila.push("0");
		pendingOp = false;
		newOp = true;
	}
	
	private void initComponents(){
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
		
		setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora");
		
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
		
		b0.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){numButtonActionPerformed(evt);}});
		b1.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){numButtonActionPerformed(evt);}});
		b2.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){numButtonActionPerformed(evt);}});
		b3.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){numButtonActionPerformed(evt);}});
		b4.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){numButtonActionPerformed(evt);}});
		b5.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){numButtonActionPerformed(evt);}});
		b6.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){numButtonActionPerformed(evt);}});
		b7.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){numButtonActionPerformed(evt);}});
		b8.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){numButtonActionPerformed(evt);}});
		b9.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){numButtonActionPerformed(evt);}});
		
		mas.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){operationButtonActionPerformed(evt);}});
		entre.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){operationButtonActionPerformed(evt);}});
		por.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){operationButtonActionPerformed(evt);}});
		menos.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){operationButtonActionPerformed(evt);}});
		igual.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){equalsButtonActionPerformed(evt);}});
		
		off.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){offButtonActionPerformed(evt);}});
		ac.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){acButtonActionPerformed(evt);}});
		c.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){cButtonActionPerformed(evt);}});
		masmenos.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){masmenosButtonActionPerformed(evt);}});
	
		
		pantalla.setFont(new java.awt.Font("Calculator", 1, 70));
		pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		pantalla.setEditable(false);
		// pantalla.setText("0000000");
				
		setLayout(null);
		setResizable(false);
		setSize(314, 457+31);
		setVisible(true);
		setIconImage((new javax.swing.ImageIcon("calc_ico.png")).getImage());
		getContentPane().setBackground(java.awt.Color.GRAY);
		
		add(mcr);
		add(mmenos);
		add(mmas);
		add(raiz);
		add(off);
		add(ac);
		add(c);
		add(masmenos);
		add(porcentaje);
		add(b7);
		add(b8);
		add(b9);
		add(entre);
		add(b4);
		add(b5);
		add(b6);
		add(por);
		add(b1);
		add(b2);
		add(b3);
		add(menos);
		add(b0);
		add(punto);
		add(igual);
		add(mas);
		add(pantalla);
	}
	
	private void numButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.peek();
		int presionado = Integer.parseInt(""+evt.paramString().charAt(21));
		int valor;
		
		try{
			valor = Integer.parseInt(tope);
			pila.pop();
			if (newOp) throw new NumberFormatException();
			
			valor *= 10;
			valor += presionado;
			pila.push("" + valor);
		}
		catch ( NumberFormatException e ){
			pila.push(""+presionado);
		}
		
		newOp = false;
		pantalla.setText(pila.peek());
		System.out.println("pila = "+pila);
	}
	
	private void operationButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.peek();
		char presionado = evt.paramString().charAt(21);
		int valor;
		
		try{
			valor = Integer.parseInt(tope);
			equalsButtonActionPerformed(evt);
			pendingOp = true;
			pila.push("" + presionado);
		}
		catch ( NumberFormatException e ){
			pila.pop();
			pila.push("" + presionado);
		}
		
		System.out.println("pila = "+pila);
	}
	
	private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.pop();
		int valor1, valor2;
		String op;
		
		try{
			valor2 = Integer.parseInt(tope);
			if ( pendingOp ){
				op = pila.pop();
				valor1 = Integer.parseInt(pila.pop());
				switch(op){
					case "+":
						valor1 += valor2;
						pila.push("" + valor1);
						pantalla.setText("" + valor1);
						break;
					case "-":
						valor1 -= valor2;
						pila.push("" + valor1);
						pantalla.setText("" + valor1);
						break;
					case "X":
						valor1 *= valor2;
						pila.push("" + valor1);
						pantalla.setText("" + valor1);
						break;
					case "/":
						if(valor2!=0){
							valor1 = valor1/valor2;
							pila.push("" + valor1);
							pantalla.setText("" + valor1);
						}
						else{
							pantalla.setText("ERROR");
							pila.push("0");
						}
						break;
				}
			}
			else{
				pila.push(tope);
			}
			
		} 
		catch ( NumberFormatException e ){
			valor1 = Integer.parseInt(pila.pop());
			switch (tope) {
				case "+":
					valor1 += valor1;
					pila.push(""+valor1);
					pantalla.setText(""+valor1);
					break;
				case "-":
					valor1 = (-1)*valor1;
					pila.push(""+valor1);
					pantalla.setText(""+valor1);
					break;
				case "X":
					valor1 *= valor1;
					pila.push(""+valor1);
					pantalla.setText(""+valor1);
					break;
				case "/":
					pila.push("1");
					pantalla.setText("1");
					break;
			}
		}
		pendingOp = false;
		newOp = true;
		System.out.println("pila = " + pila);
	}
	
	private void offButtonActionPerformed(java.awt.event.ActionEvent evt){
		System.exit(0);
	}
	
	private void acButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.peek();
		if(pendingOp){
			try{
				Integer.parseInt(tope);
				pila.pop();
			} catch ( NumberFormatException e ){}
			pila.pop();
			pila.pop();
			// pila.push("0");
			// pantalla.setText("0");
			// pendingOp = false;
		}
		else{
			pila.pop();
			// pila.push("0");
			// pantalla.setText("0");
		}
		pila.push("0");
		pantalla.setText("0");
		pendingOp = false;
		
		System.out.println("pila = " + pila);
	}
	
	private void cButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.peek();
		int valor;
		
		try{
			valor = Integer.parseInt(tope);
			pila.pop();
			// pila.push("0");
			// pantalla.setText("0");
		}catch ( NumberFormatException e ){}
		pila.push("0");
		pantalla.setText("0");
		
		System.out.println("pila = " + pila);
	}
	
	private void masmenosButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.peek();
		int valor;
		try{
			valor = Integer.parseInt(tope);
			valor *= (-1);
			pila.pop();
			pila.push(""+valor);
			pantalla.setText(""+valor);
		}catch( NumberFormatException e ){}
		
		System.out.println("pila = " + pila);
	}
	
	public static void main(String[] argv) {
		new Calculator();
	}
	
	private javax.swing.JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ac, c, masmenos, porcentaje, entre, por, menos, mas, mcr, mmenos, mmas, raiz, off, punto, igual;
	private javax.swing.JTextField pantalla;
	private java.util.Stack<String> pila;
	private boolean pendingOp, newOp;
}
