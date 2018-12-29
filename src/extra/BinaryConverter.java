package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame JF = new JFrame();
	JPanel JP = new JPanel();
	JTextField JTF = new JTextField(20);
	JButton JB = new JButton("BUTTON");
	JLabel JL = new JLabel();

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	public static void main(String[] args) {
		BinaryConverter BC = new BinaryConverter();
		BC.setup();
	}

	void setup() {
		JF.setVisible(true);
		JF.add(JP);
		JP.add(JTF);
		JP.add(JB);
		JB.addActionListener(this);
		JP.add(JL);
		JF.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String Binary = JTF.getText();
		String ASCII = convert(Binary);
		JL.setText(ASCII);
		JF.pack();

	}
}
