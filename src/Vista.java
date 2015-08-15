import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;


@SuppressWarnings({ "serial", "unused" })
public class Vista extends JFrame {

	private JPanel contentPane;


	private int contador;
	private JTextField input;
	private String primerNum;
	private String signo;
	private String segundoNum;
	private String tercerNum;
	
	private String respuesta;
	/**
	 * Create the frame.
	 */
	public Vista() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton multip = new JButton("X");
		multip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				primerNum=input.getText();
				signo = "*";
				input.setText("");
			}
		});
		multip.setBounds(192, 203, 50, 39);
		contentPane.add(multip);
		JButton borra = new JButton("C");
		borra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				input.setText("0");
			}
		});
		borra.setBounds(134, 111, 50, 39);
		contentPane.add(borra);

		JButton Suma = new JButton("+");
		Suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primerNum=input.getText();
				signo = "+";
				input.setText("");
			
			}
		});
		Suma.setBounds(192, 303, 50, 39);
		contentPane.add(Suma);

		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerNum=input.getText();
				signo = "/";
				input.setText("");
			}
		});
		division.setBounds(192, 159, 50, 39);
		contentPane.add(division);

		JButton resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!input.getText().equals(" ")){
					primerNum=input.getText();
					signo = "-";
					input.setText("");

				}
			}
		});
		resta.setBounds(192, 253, 50, 39);
		contentPane.add(resta);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(input.getText().equals("0")){
					input.setText("1");
					tercerNum=btn1.getText();
				}
				else{
					input.setText(input.getText()+"1");
				}
					
					System.out.println(tercerNum);
			}

		});
		btn1.setBounds(10, 253, 51, 39);
		contentPane.add(btn1);
		
			
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(input.getText().equals("0")){
					input.setText("2");
				}
				else{
					input.setText(input.getText()+"2");
				}
				tercerNum=btn2.getText();
				System.out.println(tercerNum);

			}
		});
		btn2.setBounds(71, 253, 53, 39);
		contentPane.add(btn2);
		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(input.getText().equals("0")){
					input.setText("3");
					tercerNum=btn3.getText();
				}
				else{
					input.setText(input.getText()+"3");
					tercerNum=btn3.getText();

				}
				
			}
		});
		btn3.setBounds(134, 253, 50, 39);
		contentPane.add(btn3);
		

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(input.getText().equals("0")){
					input.setText("4");
				}
				else{
					input.setText(input.getText()+"4");
					tercerNum=btn4.getText();

				}

			}
		});
		btn4.setBounds(10, 202, 51, 39);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(input.getText().equals("0")){
					input.setText("5");
				}
				else{
					input.setText(input.getText()+"5");
					tercerNum=btn5.getText();

				}
			}
		});
		btn5.setBounds(71, 203, 53, 39);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(input.getText().equals("0")){
					input.setText("6");
				}
				else{
					tercerNum=btn6.getText();
					input.setText(input.getText()+"6");
					

				}

			}
		}); 
		btn6.setBounds(134, 202, 50, 39);
		contentPane.add(btn6);
	
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(input.getText().equals("0")){
					input.setText("7");
				}
				else{
					input.setText(input.getText()+"7");
					tercerNum=btn7.getText();

				}
			}
		});
		btn7.setBounds(10, 159, 51, 39);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(input.getText().equals("0")){
					input.setText("8");
				}
				else{
					input.setText(input.getText()+"8");
					tercerNum=btn8.getText();

				}
				
			}
		});
		btn8.setBounds(71, 159, 53, 39);
		contentPane.add(btn8);
		
	
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(input.getText().equals("0")){
					input.setText("9");
				}
				else{
					input.setText(input.getText()+"9");
					tercerNum=btn9.getText();

				}			
			}
		});
		btn9.setBounds(134, 159, 50, 39);
		contentPane.add(btn9);
	
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"0");
				tercerNum=btn0.getText();

			}
		});
		btn0.setBounds(10, 303, 172, 39);
		contentPane.add(btn0);
		
		
		
		

		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String resultado;
				 segundoNum=input.getText();
				
				
					
					if (!segundoNum.equals("")){
						respuesta=calculadora(primerNum,segundoNum,tercerNum,signo);
						
						input.setText(respuesta);
						//System.out.println(respuesta);

					
				}
			}



			public String calculadora(String primerNum, String segundoNum,String tercerNum, String signo) {
				Double resultado =0.0;
				String respuesta;

				
				

				if (signo.equals("-")){
					resultado=Double.parseDouble(primerNum)-Double.parseDouble(segundoNum)-Double.parseDouble(tercerNum);
				}
				else if (signo.equals("+")){
					resultado=Double.parseDouble(primerNum)+Double.parseDouble(segundoNum)+Double.parseDouble(tercerNum);
 
				}
				else if (signo.equals("*")){
					resultado=Double.parseDouble(primerNum)*Double.parseDouble(segundoNum)*Double.parseDouble(tercerNum);

				}
				
				else if (signo.equals("/")){
					resultado=Double.parseDouble(primerNum)/Double.parseDouble(segundoNum)/Double.parseDouble(tercerNum);
				}
				respuesta=resultado.toString();
				return respuesta;

//resultado se converitiria en primerNum
				//guardar el resultado en una variable al final, no hace falta while ni dnada
				//el resultado se tiene que guardar en una variable fuera del action listener
				//las variables principales tengo que guardarlas fuera del listener
			}
		});
		
		
		igual.setBounds(252, 203, 50, 139);
		contentPane.add(igual);
		


		JButton button = new JButton("CE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(71, 111, 50, 39);
		contentPane.add(button);

		JButton button_1 = new JButton("<--");
		button_1.setBounds(10, 111, 51, 39);
		contentPane.add(button_1);

		JButton button_2 = new JButton("+/-");

		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_2.setBounds(192, 111, 50, 39);
		contentPane.add(button_2);

		JButton button_3 = new JButton("MC");



		button_3.setBounds(10, 61, 51, 39);
		contentPane.add(button_3);

		JButton btnMr = new JButton("MR");
		btnMr.setBounds(71, 61, 50, 39);
		contentPane.add(btnMr);

		JButton btnMs = new JButton("MS");
		btnMs.setBounds(134, 61, 50, 39);
		contentPane.add(btnMs);

		JButton btnM_1 = new JButton("M+");
		btnM_1.setBounds(192, 61, 50, 39);
		contentPane.add(btnM_1);

		JButton btnM = new JButton("M-");
		btnM.setBounds(252, 61, 50, 39);
		contentPane.add(btnM);

		JButton button_4 = new JButton("%");
		button_4.setBounds(252, 111, 50, 39);
		contentPane.add(button_4);

		JButton button_5 = new JButton("1/X");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setBounds(252, 159, 50, 39);
		contentPane.add(button_5);

		input = new JTextField();
		input.setText("0");
		input.setBounds(10, 11, 292, 39);
		contentPane.add(input);
		input.setColumns(10);
 
		
	}
}
