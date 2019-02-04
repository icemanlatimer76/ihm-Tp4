import java.awt.*;
import java.awt.event.*;                                         

public class Exo3 extends Frame implements ActionListener 
{    
	
	private List lstChoix;
	private Button btn1;
	private Button btn2;

	public Exo3()
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
		String s;
		s="";

		//System.out.println(e);
		if (e.getSource() == btn1)        
		{
			if (lstChoix.getSelectedItem() != null)
			{
				switch (lstChoix.getSelectedItem())
				{
					case "premier"	: 	s="Double click sur le 1er  btn"; break;
					case "second"	: 	s="Double click sur le 2ème btn"; break;
					case "troisieme": 	s="Double click sur le 3ème btn"; break;
					case "quatrieme": 	s="Double click sur le 4ème btn"; break;
					case "cinquieme": 	s="Double click sur le 5ème btn"; break;
				}
				
			}
			else
			{
				s="Aucun element appliquée";
			}
			System.out.println(s);
			
		}
		
		
			
		
	}

	public static void main(String [] args) { new Exo3(); }
}
