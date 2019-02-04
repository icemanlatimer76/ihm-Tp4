import java.awt.*;
import java.awt.event.*;

public class Exo4 extends Frame implements ActionListener {

	private List lstChoix;
	private Button btn1;
	private Button btn2;

	public Exo4() {
		setTitle("Fenetre");
		setLocation(50, 50);

		btn1 = new Button(" Appliquer ");
		btn1.addActionListener(this);
		add(btn1, "North");
		btn2 = new Button(" Annuler ");
		btn2.addActionListener(this);
		add(this.btn2, "South");

		lstChoix = new List();

		lstChoix.add("premier");
		lstChoix.add("second");
		lstChoix.add("troisieme");
		lstChoix.add("quatrieme");
		lstChoix.add("cinquieme");
		lstChoix.add("sixieme");
		lstChoix.add("septieme");
		lstChoix.setMultipleMode(true);
		lstChoix.addActionListener(this);
		add(lstChoix, "Center");

		pack();
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String s;
		String[] tab;
		s = "";

		// System.out.println(e);
		if (e.getSource() == btn1) {

			tab = lstChoix.getSelectedItems();
			if (tab.length == 0) {
				s = "Aucun element appliquée";
			} else {
				for (int i = 0; i < tab.length; i++) {
					switch (tab[i]) {
					case "premier":
						s += "Click sur le 1er  btn\n";
						break;
					case "second":
						s += "Click sur le 2ème btn\n"; 
						break;
					case "troisieme":
						s += "Click sur le 3ème btn\n"; 
						break;
					case "quatrieme":
						s += "Click sur le 4ème btn\n"; 
						break;
					case "cinquieme":
						s += "Click sur le 5ème btn\n"; 
						break;
					}
				}
			}

			System.out.println(s);

		}

	}

	public static void main(String[] args) {
		new Exo4();
	}
}
