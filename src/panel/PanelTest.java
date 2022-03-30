package panel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTest extends JPanel {

	private JTextField textField; 
	private JLabel label, view;
	private ArrayList<JTextField> listTextField = new ArrayList<>();
	private ArrayList<JLabel> listLabel = new ArrayList<>();
	
	public PanelTest() {
		
		int xTextField = 5;

		setVisible(true);
		setBackground(Color.LIGHT_GRAY);
		
//		for(int j = 0; j < xTextField; j++) {
//			label = new JLabel("la saisi est : ");
//			add(label);
//			//J'integre les Label dans une liste pour pouvoir les retrouver avec l'index
//			listLabel.add(new JLabel());
//			add(listLabel.get(j));
//		}
		
		for(int i = 0; i < xTextField; i++) {
			//j'integre les TextField dans une liste pour pouvoir les retrouver avec l'index
			listTextField.add(new JTextField(10));
			add(listTextField.get(i));
			
			//evenement pour chaque textField
			listTextField.get(i).addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					/*
					 * je verifie la quantite de textField demande avec la quantite de label que je vais devoir creer
					 * si le nombre est egal, je n'en cree plus
					 */
					if(xTextField != listLabel.size()) {
						listLabel.add(new JLabel());
					}
					/*
					 * dans un 1er temps j'aurai plus de TextField dans la liste que de Label dans sa liste
					 * a chaque interaction avec le textField je rajoute +1 dans la listLabel et cela synchronique
					 * les deux index
					 */
					for(int i = 0; i < listLabel.size(); i++) {
						System.out.println("L48 PT textField : "+ listTextField.get(i).getText());
						
						listLabel.get(i).setText(listTextField.get(i).getText());
						add(listLabel.get(i));
					}
					//j'oublie pas de rafraichir le panel avec le nouveaux Label
					repaint();
					revalidate();
				}
			});
		}
		
		
		
		
	}

}
