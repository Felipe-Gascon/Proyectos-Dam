import java.awt.BorderLayout;
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


public class Vista extends JFrame {

	private JPanel contentPane;

	private int contador;
	private JTextField input;
	private String memoria1;
	private String signo;
	private String memoria2;
	private JButton boton;
	/**
	 * Create the frame.
	 * @return 
	 */
	public Vista() {
		//Resultado=input.setText(numeroConcat);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton multip = new JButton("X");
		multip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				memoria1=input.getText();
				signo = "*";
				input.setText("");
			}
		});
		multip.setBounds(192, 203, 50, 39);
		contentPane.add(multip);

		JButton Suma = new JButton("+");
		Suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				memoria1=input.getText();
				signo = "+";
				input.setText("");
			}
		});
		Suma.setBounds(192, 303, 50, 39);
		contentPane.add(Suma);

		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memoria1=input.getText();
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
					memoria1=input.getText();
					signo = "-";
					input.setText("");

				}
			}
		});
		resta.setBounds(192, 253, 50, 39);
		contentPane.add(resta);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				input.setText(input.getText()+"1");
			}
		});
		btn1.setBounds(10, 253, 51, 39);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"2");

			}
		});
		btn2.setBounds(71, 253, 53, 39);
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				input.setText(input.getText()+"3");

			}
		});
		btn3.setBounds(134, 253, 50, 39);
		contentPane.add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"4");

			}
		});
		btn4.setBounds(10, 202, 51, 39);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"5");

			}
		});
		btn5.setBounds(71, 203, 53, 39);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"6");

			}
		}); 
		btn6.setBounds(134, 202, 50, 39);
		contentPane.add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"7");

			}
		});
		btn7.setBounds(10, 159, 51, 39);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"8");

			}
		});
		btn8.setBounds(71, 159, 53, 39);
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"9");

			}
		});
		btn9.setBounds(134, 159, 50, 39);
		contentPane.add(btn9);

		JButton borra = new JButton("C");
		borra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(borra.isEnabled()){ 
				input.setText("0");
				}
				else{
					if(btn1.isEnabled()){
						input.setText("");
						
					}
				}
			}
		});
		borra.setBounds(134, 111, 50, 39);
		contentPane.add(borra);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"0");

			}
		});
		btn0.setBounds(10, 303, 172, 39);
		contentPane.add(btn0);

		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String resultado;
				String memoria2=input.getText();
				if (!memoria2.equals("")){
					resultado=calculadora(memoria1,memoria2,signo);
					input.setText(resultado);
				}

			}

			public String calculadora(String memoria1, String memoria2,String signo) {
				Double resultado =0.0;
				String respuesta;
				if (signo.equals("-")){
					resultado=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
				}
				if (signo.equals("+")){
					resultado=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);

				}
				if (signo.equals("*")){
					resultado=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);

				}
				if (signo.equals("/")){
					resultado=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
				}
				respuesta=resultado.toString();
				return respuesta;


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
		input.setBounds(10, 11, 292, 39);
		contentPane.add(input);
		input.setColumns(10);

		/*JButton punto = new JButton(".");
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena;
				cadena = input.getText();

				if (cadena.length()<=0){
					input.setText("0.");
				}
				else{
					if(!existepunto(input.getText())){
						input.setText(input.getText()+".");
					}
				}

			}

		});

		punto.setBounds(132, 303, 50, 39);
		contentPane.add(punto);
		public boolean existepunto(String cadena){
		boolean resultado;
		resultado = false;
			for (int i = 0; i < cadena.length(); i++) {

				if(cadena.substring(i, i+1).equals(".")){
					resultado = true;
					break;
				}
			} return resultado; 

		}*/

	}
}
