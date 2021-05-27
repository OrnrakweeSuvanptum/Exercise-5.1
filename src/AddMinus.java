import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMinus {

	private JFrame frame;
	private JTextField textFieldAdd;
	private JTextField textFieldMinus;
	private JTextField textFieldAnswer;
	private JButton AddButton;
	private JButton MinusButton;
	private JLabel AnswerLabel;
	private JLabel Integer1Label;
	private JLabel Integer2Label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMinus window = new AddMinus();
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
	public AddMinus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 464, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		AddButton = new JButton("Add");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no1, no2, ans;
				try {
					no1 = Integer.parseInt(textFieldAdd.getText());
					no2 = Integer.parseInt(textFieldMinus.getText());
					ans = no1 + no2;
					textFieldAnswer.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Wron input! Please enter number only.");
				}
			}
		});
		
		AddButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		AddButton.setForeground(Color.RED);
		AddButton.setBackground(Color.CYAN);
		AddButton.setBounds(80, 121, 102, 37);
		frame.getContentPane().add(AddButton);
		
		MinusButton = new JButton("Minus");
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no1, no2, ans;
				try {
					no1 = Integer.parseInt(textFieldAdd.getText());
					no2 = Integer.parseInt(textFieldMinus.getText());
					ans = no1 - no2;
					textFieldAnswer.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Wron input! Please enter number only.");
				}
			}
		});
		MinusButton.setForeground(Color.RED);
		MinusButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		MinusButton.setBackground(Color.CYAN);
		MinusButton.setBounds(273, 121, 102, 37);
		frame.getContentPane().add(MinusButton);
		
		textFieldAdd = new JTextField();
		textFieldAdd.setBounds(80, 72, 100, 30);
		frame.getContentPane().add(textFieldAdd);
		textFieldAdd.setColumns(10);
		
		textFieldMinus = new JTextField();
		textFieldMinus.setBounds(273, 72, 96, 30);
		frame.getContentPane().add(textFieldMinus);
		textFieldMinus.setColumns(10);
		
		AnswerLabel = new JLabel("Answer");
		AnswerLabel.setBackground(Color.BLUE);
		AnswerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AnswerLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		AnswerLabel.setBounds(77, 197, 105, 25);
		frame.getContentPane().add(AnswerLabel);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setBounds(273, 195, 96, 30);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
		
		Integer1Label = new JLabel("Integer 1");
		Integer1Label.setForeground(Color.BLUE);
		Integer1Label.setHorizontalAlignment(SwingConstants.CENTER);
		Integer1Label.setFont(new Font("Arial Narrow", Font.ITALIC, 17));
		Integer1Label.setBounds(80, 36, 100, 30);
		frame.getContentPane().add(Integer1Label);
		
		Integer2Label = new JLabel("Integer 2");
		Integer2Label.setForeground(Color.BLUE);
		Integer2Label.setFont(new Font("Arial Narrow", Font.ITALIC, 17));
		Integer2Label.setHorizontalAlignment(SwingConstants.CENTER);
		Integer2Label.setBounds(273, 36, 100, 30);
		frame.getContentPane().add(Integer2Label);
	}
}
