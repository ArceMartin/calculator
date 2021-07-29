public class Calculator extends javax.swing.JFrame{
	
	public Calculator(){
		initComponents();
		pila = new java.util.Stack<String>();
		pantalla.setText("0");
		pila.push("0");
		pendingOp = false;
		newOp = false;
		memory = 0;
		
		info();
	}
	
	private void initComponents(){
		java.awt.Font smallFont  = new java.awt.Font("Segoe UI", 0, 10);
		java.awt.Font bigFont    = new java.awt.Font("Segoe UI", 0, 18);
		java.awt.Font screenFont = new java.awt.Font("Calculator", 1, 70);
		
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
		mrc        = new javax.swing.JButton();
		mmenos     = new javax.swing.JButton();
		mmas       = new javax.swing.JButton();
		raiz       = new javax.swing.JButton();
		off        = new javax.swing.JButton();
		pantalla   = new javax.swing.JTextField();
		
		setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora");
		
		mrc       .setText("MRC");
		mmenos    .setText("M-");
		mmas      .setText("M+");
		raiz      .setText("\u221A");
		off       .setText("OFF");
		ac        .setText("AC");
		c         .setText("C");
		masmenos  .setText("+/-");
		porcentaje.setText("%");
		b7        .setText("7");
		b8        .setText("8");
		b9        .setText("9");
		entre     .setText("\u00F7");
		b4        .setText("4");
		b5        .setText("5");
		b6        .setText("6");
		por       .setText("\u00D7");
		b1        .setText("1");
		b2        .setText("2");
		b3        .setText("3");
		menos     .setText("-");
		b0        .setText("0");
		punto     .setText(".");
		igual     .setText("=");
		mas       .setText("+");
		
		mrc       .setFont(smallFont);
		mmenos    .setFont(smallFont);
		mmas      .setFont(smallFont);
		raiz      .setFont(smallFont);
		off       .setFont(smallFont);
		ac        .setFont(bigFont);
		c         .setFont(bigFont);
		masmenos  .setFont(bigFont);
		porcentaje.setFont(bigFont);
		b7        .setFont(bigFont);
		b8        .setFont(bigFont);
		b9        .setFont(bigFont);
		entre     .setFont(bigFont);
		b4        .setFont(bigFont);
		b5        .setFont(bigFont);
		b6        .setFont(bigFont);
		por       .setFont(bigFont);
		b1        .setFont(bigFont);
		b2        .setFont(bigFont);
		b3        .setFont(bigFont);
		menos     .setFont(bigFont);
		b0        .setFont(bigFont);
		punto     .setFont(bigFont);
		igual     .setFont(bigFont);
		mas       .setFont(bigFont);
		
		mrc       .setBounds(7+0,154,54, 41);
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
		punto.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){puntoButtonActionPerformed(evt);}});
		
		mrc.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){mrcButtonActionPerformed(evt);}});
		mmenos.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){mmenosButtonActionPerformed(evt);}});
		mmas.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){mmasButtonActionPerformed(evt);}});
		//raiz
		off.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){offButtonActionPerformed(evt);}});
		
		ac.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){acButtonActionPerformed(evt);}});
		c.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){cButtonActionPerformed(evt);}});
		masmenos.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){masmenosButtonActionPerformed(evt);}});
		//porcentaje
		
		entre.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){operationButtonActionPerformed(evt);}});
		por.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){operationButtonActionPerformed(evt);}});
		menos.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){operationButtonActionPerformed(evt);}});
		mas.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){operationButtonActionPerformed(evt);}});
		igual.addActionListener(new java.awt.event.ActionListener(){public void actionPerformed(java.awt.event.ActionEvent evt){equalsButtonActionPerformed(evt);}});
		
		pantalla.setFont(screenFont);
		pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		pantalla.setEditable(false);

		add(mrc);
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
		
		setLayout(null);
		setResizable(false);
		setSize(314, 457+31);
		setVisible(true);
		setIconImage((new javax.swing.ImageIcon("calc_ico.png")).getImage());
		getContentPane().setBackground(java.awt.Color.GRAY);
	}
	
	private void numButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.peek();
		int presionado = Integer.parseInt(""+evt.paramString().charAt(21));
		int valorInt;
		// float valorFloat;
		
		if (newOp) {
			// System.out.println("NUMBUTTONACTIONPERFORMED: [ALPHA]");
			pila.pop();
			pila.push(""+presionado);
			pantalla.setText(pila.peek());
		}
		else if( tope.contains(".")){
			// System.out.println("NUMBUTTONACTIONPERFORMED: [BETA]");
			pila.pop();
			pila.push(tope + presionado);
			pantalla.setText(tope + presionado);
		}
		else{
			// System.out.println("NUMBUTTONACTIONPERFORMED: [GAMMA]");
			try{
				// System.out.println("NUMBUTTONACTIONPERFORMED: [DELTA]");
				valorInt = Integer.parseInt(tope);
				pila.pop();
				
				valorInt *= 10;
				valorInt += presionado;
				pila.push("" + valorInt);
				pantalla.setText("" + valorInt);
			}
			catch ( NumberFormatException e ){
				// System.out.println("NUMBUTTONACTIONPERFORMED: [EPSILON]");
				pila.push("" + presionado);
				pantalla.setText("" + presionado);
			}
		}
		
		newOp = false;
		info();
	}
	
	private void operationButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.peek();
		char presionado = evt.paramString().charAt(21);
		float valor;
		
		try{
			valor = Float.parseFloat(tope);
			if(pendingOp){
				equalsButtonActionPerformed(evt);
			}
			pendingOp = true;
			pila.push("" + presionado);
		}
		catch ( NumberFormatException e ){
			pila.pop();
			pila.push("" + presionado);
		}
		
		newOp = false;
		info();
	}
	
	private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.pop();
		float valor1, valor2;
		String op;
		
		try{
			valor2 = Float.parseFloat(tope);
			if ( pendingOp ){
				op = pila.pop();
				valor1 = Float.parseFloat(pila.pop());
				switch(op){
					case "+":
						valor1 += valor2;
						pila.push("" + valor1);
					String ss = sf(valor1); 
						pantalla.setText(ss);
						break;
					case "-":
						valor1 -= valor2;
						pila.push("" + valor1);
						pantalla.setText(sf(valor1));
						break;
					case "\u00D7":
						valor1 *= valor2;
						pila.push("" + valor1);
						pantalla.setText(sf(valor1));
						break;
					case "\u00F7":
						if(valor2!=0){
							valor1 = valor1/valor2;
							pila.push("" + valor1);
							pantalla.setText(sf(valor1));
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
			System.out.println(e);
			valor1 = Float.parseFloat(pila.pop());
			switch (tope) {
				case "+":
					valor1 += valor1;
					pila.push(""+valor1);
					pantalla.setText(sf(valor1));
					break;
				case "-":
					valor1 = (-1)*valor1;
					pila.push(""+valor1);
					pantalla.setText(sf(valor1));
					break;
				case "\u00D7":
					valor1 *= valor1;
					pila.push(""+valor1);
					pantalla.setText(sf(valor1));
					break;
				case "\u00F7":
					pila.push("1");
					pantalla.setText("1");
					break;
			}
		}
		pendingOp = false;
		newOp = true;
		info();
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
		}
		else{
			pila.pop();
		}
		pila.push("0");
		pantalla.setText("0");
		pendingOp = false;
		
		info();
	}
	
	private void cButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.peek();
		float valor;
		
		try{
			valor = Float.parseFloat(tope);
			pila.pop();
		}catch ( NumberFormatException e ){}
		pila.push("0");
		pantalla.setText("0");
		
		info();
	}
	
	private void masmenosButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.peek();
		float valor;
		try{
			valor = Float.parseFloat(tope);
			if(valor==0)throw new NumberFormatException();
			valor *= (-1);
			pila.pop();
			pila.push(""+valor);
			pantalla.setText(sf(valor));
		}catch( NumberFormatException e ){}
		
		info();
	}
	
	private void mrcButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.peek();
		float valor;
		
		try{
			valor = Float.parseFloat(tope);
			pila.pop();
		}catch( NumberFormatException e ){}
		
		pila.push(""+memory);
		pantalla.setText(sf(memory));
		
		info();
	}
	
	private void mmasButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.peek();
		float valor;
		
		try{
			valor = Float.parseFloat(tope);
			memory += valor;
		}catch( NumberFormatException e ){
			pila.pop();
			valor = Float.parseFloat(pila.peek());
			memory+= valor;
			pila.push(tope);
		}
		
		info();
	}
	
	private void mmenosButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.peek();
		float valor;
		
		try{
			valor = Float.parseFloat(tope);
			memory -= valor;
		}catch( NumberFormatException e ){
			pila.pop();
			valor = Float.parseFloat(pila.peek());
			memory-= valor;
			pila.push(tope);
		}
		
		info();
	}
	
	private void puntoButtonActionPerformed(java.awt.event.ActionEvent evt){
		String tope = pila.peek();
		int valor;
		
		try{
			valor = Integer.parseInt(tope);
			pila.pop();
			pila.push(tope+".");
			pantalla.setText(tope+".");
		}catch(NumberFormatException e){
			pila.push("0.");
			pantalla.setText("0.");
			newOp = false;
		}
		
		info();
	}
	
	private void info(){
		System.out.println("pila = " + pila + "\tmemory = " + memory + "\tpendingOp = " + pendingOp + "\tnewOp = " + newOp);
	}
	
	private String sf(float f){
		String s = "" + f;
		if(f==Math.floor(f)){
			s = s.substring(0,s.indexOf("."));
			return s;
		}
		else{
			try{
				s = s.substring(0, s.indexOf(".") + 3);
			}
			catch( StringIndexOutOfBoundsException e ){}
		}
		return s;
	}
	
	public static void main(String[] argv) {
		new Calculator();
	}
	
	private javax.swing.JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ac, c, masmenos, porcentaje, entre, por, menos, mas, mrc, mmenos, mmas, raiz, off, punto, igual;
	private javax.swing.JTextField pantalla;
	private java.util.Stack<String> pila;
	private boolean pendingOp, newOp;
	private float memory;
}
