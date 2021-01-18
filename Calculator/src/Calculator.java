import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator  {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 329, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(10, 11, 293, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitButtonCliked("7");
			}
		});
		btn7.setBounds(10, 64, 49, 23);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitButtonCliked("8");
			}
		});
		btn8.setBounds(59, 64, 49, 23);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitButtonCliked("9");
			}
		});
		btn9.setBounds(108, 64, 49, 23);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitButtonCliked("4");
			}
		});
		btn4.setBounds(10, 98, 49, 23);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitButtonCliked("5");
			}
		});
		btn5.setBounds(59, 98, 49, 23);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitButtonCliked("6");
			}
		});
		btn6.setBounds(108, 98, 49, 23);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitButtonCliked("1");
			}
		});
		btn1.setBounds(10, 132, 49, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitButtonCliked("2");
			}
		});
		btn2.setBounds(59, 132, 49, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitButtonCliked("3");
			}
		});
		btn3.setBounds(108, 132, 49, 23);
		frame.getContentPane().add(btn3);
		
		JButton btnSign = new JButton("+/-");
		btnSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String displayedText=textField.getText();
				if (displayedText.equals("0")) return;
				if (displayedText.charAt(0)=='-') {
					displayedText=displayedText.substring(1);
				} else {
					displayedText="-"+displayedText;
				}
				textField.setText(displayedText);
			}
		});
		btnSign.setBounds(10, 166, 49, 23);
		frame.getContentPane().add(btnSign);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				digitButtonCliked("0");
			}

		});
		
		
		btn0.setBounds(59, 166, 49, 23);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String displayedText=textField.getText();
				if (displayedText.indexOf(".")>=0) {
					return;
				}
				displayedText+=".";
				textField.setText(displayedText);
			}
		});
		btnDot.setBounds(108, 166, 49, 23);
		frame.getContentPane().add(btnDot);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorClicked("+");
			}
		});
		btnAdd.setBounds(164, 64, 49, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorClicked("-");
			}
		});
		btnSub.setBounds(164, 98, 49, 23);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("x");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorClicked("x");
			}
		});
		btnMul.setBounds(164, 132, 49, 23);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorClicked("/");
			}

			
		});
		btnDiv.setBounds(164, 166, 49, 23);
		frame.getContentPane().add(btnDiv);
		
		JButton btnEqu = new JButton("=");
		btnEqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorClicked("");
			}
		});
		btnEqu.setBounds(223, 132, 49, 23);
		frame.getContentPane().add(btnEqu);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
			}
		});
		btnClear.setBounds(223, 98, 49, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnBack = new JButton("<=");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String displayedText=textField.getText();
				if (displayedText.equals("0")) return;
				else if (displayedText.length()==1) {
					displayedText="0";
				} else {
					displayedText=displayedText.substring(0,displayedText.length()-1);
				}
				textField.setText(displayedText);
			}
		});
		btnBack.setBounds(223, 64, 49, 23);
		frame.getContentPane().add(btnBack);
	}

	private void digitButtonCliked(String digit) {
		// TODO Auto-generated method stub
		if (textField.getText().equals("0")) {
			textField.setText(digit);
		} else {
			textField.setText(textField.getText()+digit);
		}
	}
	
	private void operatorClicked(String newOp) {
		// TODO Auto-generated method stub
		String[] data=textField.getText().split("\\+|-|x|/");
		double result=0.0;
		
		if (data.length==2) {
			String op=textField.getText().substring(data[0].length(),data[0].length()+1);
			if (op.equals("+")) {
				double operand1=Double.parseDouble(data[0]);
				double operand2=Double.parseDouble(data[1]);
				result=operand1+operand2;
			} else if (op.equals("-")) {
				double operand1=Double.parseDouble(data[0]);
				double operand2=Double.parseDouble(data[1]);
				result=operand1-operand2;
			} else if (op.equals("x")) {
				double operand1=Double.parseDouble(data[0]);
				double operand2=Double.parseDouble(data[1]);
				result=operand1*operand2;
			} else if (op.equals("/")) {
				double operand1=Double.parseDouble(data[0]);
				double operand2=Double.parseDouble(data[1]);
				result=operand1/operand2;
			}
			int iResult=(int)(double)result;
			String sResult=null;
			if (Math.abs(result-iResult)<0.00000001) {
				sResult=Integer.toString(iResult);
			} else {
				sResult=Double.toString(result);
			}
			textField.setText(sResult+newOp);
		} else {
			textField.setText(textField.getText()+newOp);
		}
		
	}
	
}
