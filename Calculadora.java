package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


	public class Practica1Calculadora extends JFrame {
	
		private String dato;
		private String datoRetornado;
		private String datoFinal;
		
	public Practica1Calculadora() {
	Font font1 = new Font("SansSerif", Font.BOLD, 30);
	Font fontNums = new Font("SansSerif", Font.BOLD, 33);
	setTitle("Calculator-1.com");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	
	JPanel p1 = new JPanel();
	p1.setLayout(new GridLayout(6, 5));

	JButton MC = new JButton("MC");
	MC.setFont(font1);
	p1.add(MC);
	JButton MR = new JButton("MR");
	MR.setFont(font1);
	p1.add(MR);
	JButton M1 = new JButton("M-");
	M1.setFont(font1);
	p1.add(M1);
	JButton M2 = new JButton("M+");
	M2.setFont(font1);
	p1.add(M2);
	JButton raiz = new JButton("√");
	raiz.setFont(font1);
	p1.add(raiz);
	JButton MU = new JButton("MU");
	MU.setFont(font1);
	p1.add(MU);
	JButton masmenos = new JButton("+/-");
	masmenos.setFont(font1);
	p1.add(masmenos);
	JButton n7 = new JButton("7");
	n7.setFont(fontNums);
	n7.setForeground(Color.PINK);
	p1.add(n7);
	JButton n8 = new JButton("8");
	n8.setFont(fontNums);
	n8.setForeground(Color.PINK);
	p1.add(n8);
	JButton n9 = new JButton("9");
	n9.setFont(fontNums);
	n9.setForeground(Color.PINK);
	p1.add(n9);
	JButton div = new JButton("/");
	div.setFont(font1);
	p1.add(div);
	JButton porc = new JButton("%");
	porc.setFont(font1);
	p1.add(porc);
	JButton arrow = new JButton("→");
	arrow.setFont(font1);
	p1.add(arrow);
	JButton n4 = new JButton("4");
	n4.setFont(fontNums);
	n4.setForeground(Color.PINK);
	p1.add(n4);
	JButton n5 = new JButton("5");
	n5.setFont(fontNums);
	n5.setForeground(Color.PINK);
	p1.add(n5);
	JButton n6 = new JButton("6");
	n6.setFont(fontNums);
	n6.setForeground(Color.PINK);
	p1.add(n6);
	JButton nx = new JButton("x");
	nx.setFont(font1);
	p1.add(nx);
	JButton nmenoss = new JButton("♪");
	nmenoss.setFont(font1);
	p1.add(nmenoss);
	JButton AC = new JButton("AC");
	AC.setFont(font1);
	p1.add(AC);
	JButton n1 = new JButton("1");
	n1.setFont(fontNums);
	n1.setForeground(Color.PINK);
	p1.add(n1);
	JButton n2 = new JButton("2");
	n2.setFont(fontNums);
	n2.setForeground(Color.PINK);
	p1.add(n2);
	JButton n3 = new JButton("3");
	n3.setFont(fontNums);
	n3.setForeground(Color.PINK);
	p1.add(n3);
	JButton n = new JButton("n!");
	n.setFont(font1);
	p1.add(n);
	JButton nn = new JButton("π");
	nn.setFont(font1);
	p1.add(nn);
	JButton nC = new JButton("C");
	nC.setFont(font1);
	p1.add(nC);
	JButton n0 = new JButton("0");
	n0.setFont(fontNums);
	n0.setForeground(Color.PINK);
	p1.add(n0);
	JButton n00 = new JButton("00");
	n00.setFont(fontNums);
	n00.setForeground(Color.PINK);
	p1.add(n00);
	JButton npto = new JButton(".");
	npto.setFont(font1);
	p1.add(npto);
	JButton nmas = new JButton("+");
	nmas.setFont(font1);
	p1.add(nmas);
	JButton nmenos = new JButton("-");
	nmenos.setFont(font1);
	p1.add(nmenos);
	
	JButton salir = new JButton("Salir");
	salir.setFont(font1);
	p1.add(salir);
	JButton resultado = new JButton("=");
	resultado.setFont(fontNums);
	p1.add(resultado);

	JPanel p2 = new JPanel();
	p2.setLayout(new BorderLayout());
	JTextField text = new JTextField();
	text.setPreferredSize( new Dimension( 200, 60 ) );
	text.setFont(font1);
	text.setHorizontalAlignment(JTextField.CENTER);
	p2.add(text,BorderLayout.NORTH);
	text.setText("");
	p2.add(p1, BorderLayout.CENTER);
	add(p2, BorderLayout.EAST);

	n1.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"1");
	    	
	        text.setText(datoFinal);
	    }
	});
	n2.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"2");
	    	
	        text.setText(datoFinal);
	    }
	});
	n3.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"3");
	    	
	        text.setText(datoFinal);
	    }
	});
	n4.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"4");
	    	
	        text.setText(datoFinal);
	    }
	});
	n5.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"5");
	    	
	        text.setText(datoFinal);
	    }
	});
	n6.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"6");
	    	
	        text.setText(datoFinal);
	    }
	});
	n7.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"7");
	    	
	        text.setText(datoFinal);
	    }
	});
	n8.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"8");
	    	
	        text.setText(datoFinal);
	    }
	});
	n9.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"9");
	    	
	        text.setText(datoFinal);
	    }
	});
	n0.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"0");
	    	
	        text.setText(datoFinal);
	    }
	});
	n00.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"00");
	    	
	        text.setText(datoFinal);
	    }
	});
	
	div.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"/");
	    	
	        text.setText(datoFinal);
	    }
	});
	
	nC.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	text.setText("");
	    }
	});
	
	npto.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,",");
	    	
	        text.setText(datoFinal);
	    }
	});
	
	nmas.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"+");
	    	
	        text.setText(datoFinal);
	    }
	});
	
	nmenos.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"-");
	    	
	        text.setText(datoFinal);
	    }
	});
	
	nx.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"x");
	    	
	        text.setText(datoFinal);
	    }
	});
	
	raiz.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"√");
	    	
	        text.setText(datoFinal);
	    }
	});
	
	porc.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"%");
	    	
	        text.setText(datoFinal);
	    }
	});
	
	salir.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	System.exit(0);
	    }
	});
	
	n.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"!");
	    	
	        text.setText(datoFinal);
	    }
	});
	nn.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	dato = text.getText().toString();
	    	datoFinal = rellenar(dato,"π");
	    	
	        text.setText(datoFinal);
	    }
	});
	
	setSize(610, 498);
	setVisible(true);
	
	
	}

	public static void main(String[] args) {
		
		Practica1Calculadora frame = new Practica1Calculadora();
		
	}
	
	public String rellenar(String datoAnterior, String nuevoDato) {//Coge el valor anterior y añade lo que le venga por parametro
		
		datoRetornado = datoAnterior + nuevoDato;
		
		return datoRetornado;
	}
	}
	

