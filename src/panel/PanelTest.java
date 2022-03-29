package panel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import jdk.internal.misc.FileSystemOption;

public class PanelTest extends JPanel {

	private JTextField textField; 
	private JLabel label, view;
	
	public PanelTest() {
		
		int xTextField = 5;

		setVisible(true);
		setBackground(Color.LIGHT_GRAY);
		
		for(int j = 0; j < xTextField; j++) {
			label = new JLabel("la saisi est : ");
			add(label);
			view = new JLabel();
			add(view);
		}
		
		for(int i = 0; i < xTextField; i++) {
			textField = new JTextField(10);
			add(textField);
			
			//evenement pour chaque textField
			textField.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					view.setText(textField.getText());
					System.out.println("L42 PanelTest resultat du textField : " + textField.getText());
					repaint();
					revalidate();
				}
			});
		}
		
		
		
		
	}

}
