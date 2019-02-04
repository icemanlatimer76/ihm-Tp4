import java.awt.*;
import java.awt.event.*;                                         

public class Exo2 extends Frame implements ActionListener 
{    
	
	private List lstChoix;
	private Button btn1;
	private Button btn2;

	public Exo2()
	{
		setTitle("Fenetre");
		setLocation(50,50);

		btn1 = new Button( " Appliquer " );
		btn1.addActionListener(this);    
		add(btn1, "North");
		btn2 = new Button( " Annuler " );
		btn2.addActionListener(this);
		add(this.btn2,"South");



		lstChoix = new List();

		lstChoix.add("premier"  );
		lstChoix.add("second"   );
		lstChoix.add("troisieme");
		lstChoix.add("quatrieme");
		lstChoix.add("cinquieme");
		lstChoix.add("sixieme"  );
		lstChoix.add("septieme" );

		lstChoix.addActionListener(this);
		add(lstChoix,"Center");

		pack();                          
		setVisible(true);
	}


	public void actionPerformed(ActionEvent e)
	{               
		//System.out.println(e);
		if (e.getSource() == btn1)        
		{
			switch (lstChoix.getSelectedItem())
			{
				case "premier": 	System.out.println("Double click sur le 1er  btn"); break;
				case "second": 		System.out.println("Double click sur le 2ème btn"); break;
				case "troisieme": 	System.out.println("Double click sur le 3ème btn"); break;
				case "quatrieme": 	System.out.println("Double click sur le 4ème btn"); break;
				case "cinquieme": 	System.out.println("Double click sur le 5ème btn"); break;
				default: 			System.out.println("Aucun element appliquée");

			}
			
		}
		
		
			
		
	}

	public static void main(String [] args) { new Exo2(); }
}
