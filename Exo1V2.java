import java.awt.*;
import java.awt.event.*;                                         

public class Exo1V2 extends Frame implements ActionListener 
{    
	private Button btn1;
	private Button btn2;
	private int nbBtn1;
	private int nbBtn2;
	private Label labNbBtn1;
	private Label labNbBtn2;

	public Exo1V2()
	{
		setTitle("2 Boutons");
		setLocation(50,50);

		labNbBtn1 = new Label("");
		labNbBtn2 = new Label("");
		add(labNbBtn1,"East");
		add(labNbBtn2,"West");
		
		btn1 = new Button( " Appliquer " );
		btn1.addActionListener(this);    
		add(btn1, BorderLayout.NORTH);

		btn2 = new Button( " Annuler " );
		btn2.addActionListener(this);
		add(this.btn2, BorderLayout.SOUTH);

		pack();                          
		setVisible(true);
	}


	public void actionPerformed(ActionEvent e)
	{               
		if (e.getSource() == btn1)        
		{
			System.out.println("Bouton B1 : " + nbBtn1 + " fois");
			labNbBtn1.setText(Integer.toString(nbBtn1));
			nbBtn1++;
		}
		
		if (e.getSource() == btn2)
		{
			System.out.println("Bouton B2 : "+ nbBtn2 + " fois");
			labNbBtn2.setText(Integer.toString(nbBtn2));
			nbBtn2++;

		}
			
		
	}

	public static void main(String [] args) { new Exo1V2(); }
}
