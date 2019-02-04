import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exo5 extends JFrame implements ActionListener {
	private Color[] tabCoul = { Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
			Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE };

	private JButton[] tabButton;

	private JPanel panelBackground;

	public Exo5() {
		setTitle("Fenetre");
		setLocation(300, 200);

		JPanel panelPrincipale = new JPanel(new GridLayout(0, 2, 10, 0));
		JPanel panelCoul = new JPanel(new GridLayout(4, 3, 10, 10));
		panelBackground = new JPanel();

		tabButton = new JButton[12];

		for (int i = 0; i < 12; i++) {

			tabButton[i] = new JButton("  ");
			tabButton[i].setBackground(tabCoul[i]);
			tabButton[i].addActionListener(this);
			panelCoul.add(tabButton[i]);
		}

		panelPrincipale.add(panelCoul);
		panelPrincipale.add(panelBackground);
		add(panelPrincipale);
		pack();
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 12; i++) {
			if (e.getSource() == tabButton[i]) {

				panelBackground.setBackground(tabCoul[i]);
			}
		}
	}

	public static void main(String[] args) {
		new Exo5();
	}
}
