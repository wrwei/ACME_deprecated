package acme.assurancecase.diagram.dialog;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class ButtonsInTextField {

	JPanel gui = new JPanel(new GridLayout());
	JTextField textField;
	
	public ButtonsInTextField(int cols) {
		JPanel textfieldWithButtonsPanel = new JPanel(new FlowLayout(SwingConstants.LEADING, 5, 1));
		textField = new JTextField(cols);
		textfieldWithButtonsPanel.add(textField);
		
		addButtonToPanel(textfieldWithButtonsPanel, 8);
		addButtonToPanel(textfieldWithButtonsPanel, 16);
		
		textfieldWithButtonsPanel.setBackground(textField.getBackground());
		textfieldWithButtonsPanel.setBorder(textField.getBorder());
		textField.setBorder(null);
		gui.add(textfieldWithButtonsPanel);
	}
	
	private final void addButtonToPanel(JPanel panel, int height) {
		BufferedImage bi = new BufferedImage(24, height, BufferedImage.TYPE_INT_RGB);
		JButton b = new JButton(new ImageIcon(bi));
		b.setContentAreaFilled(false);
		b.setMargin(new Insets(0, 0, 0, 0));
		panel.add(b);
	}
	
	public JPanel getGui() {
		return gui;
	}
	
	
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				ButtonsInTextField bitf = new ButtonsInTextField(20);
				JOptionPane.showMessageDialog(null, bitf.getGui());
			}
		};
		SwingUtilities.invokeLater(r);
	}
}
