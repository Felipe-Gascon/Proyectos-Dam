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


public class vista extends JFrame {

	private JPanel contentPane;
	private JTextField textresult;
	private  String numero1;
	private String signo;
	/**
	 * Create the frame.
	 */
	public vista() {

	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Multip = new JButton("X");
		Multip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textresult.getText().equals(" ")){
					String numero1="";
					String signo="";
					numero1=textresult.getText();
					signo="*";
					textresult.setText("");
					
				}
			}
		});
		Multip.setBounds(461, 56, 50, 39);
		contentPane.add(Multip);
		
		JButton Suma = new JButton("+");
		Suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		Suma.setBounds(400, 111, 50, 39);
		contentPane.add(Suma);
		
		JButton division = new JButton("/");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textresult.getText().equals(" ")){
					
				
				}
			}
		});
		division.setBounds(461, 159, 50, 39);
		contentPane.add(division);
		
		JButton resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textresult.getText().equals(" ")){
					
				
				}
			}
		});
		resta.setBounds(520, 111, 50, 39);
		contentPane.add(resta);
	
		
		textresult = new JTextField();
		textresult.setBorder(new LineBorder(Color.BLACK));
		textresult.setBounds(35, 0, 476, 22);
		contentPane.add(textresult);
		textresult.setColumns(10);
		
		JButton Btn1 = new JButton("1");
		Btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numero1="1";
				textresult.setText(numero1);
			}
		});
		Btn1.setBounds(10, 44, 51, 39);
		contentPane.add(Btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1="2";
				textresult.setText(numero1);
			}
		});
		btn2.setBounds(71, 44, 53, 39);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1="3";
				textresult.setText(numero1);
			}
		});
		btn3.setBounds(134, 44, 50, 39);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1="4";
				textresult.setText(numero1);			}
		});
		btn4.setBounds(10, 95, 51, 39);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1="5";
				textresult.setText(numero1);			}
		});
		btn5.setBounds(71, 95, 53, 39);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1="6";
				textresult.setText(numero1);
			}
		}); 
		btn6.setBounds(134, 95, 50, 39);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1="7";
				textresult.setText(numero1);
			}
		});
		btn7.setBounds(10, 146, 51, 39);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1="8";
				textresult.setText(numero1);
			}
		});
		btn8.setBounds(71, 146, 53, 39);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1="9";
				textresult.setText(numero1);			}
		});
		btn9.setBounds(134, 145, 50, 39);
		contentPane.add(btn9);
		
		JButton Borra = new JButton("C");
		Borra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textresult.setText(" ");
			}
		});
		Borra.setBounds(35, 191, 50, 39);
		contentPane.add(Borra);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1="0";
				textresult.setText(numero1);
			}
		});
		btn0.setBounds(104, 191, 50, 39);
		contentPane.add(btn0);
		
		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		igual.setBounds(461, 111, 50, 39);
		contentPane.add(igual);
	}
}
