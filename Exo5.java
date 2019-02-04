import java.awt.*;
import java.awt.event.*;                                         

public class Exo2 extends Frame implements ActionListener 
{    
	private Color[] tabCoul = { Color.BLACK,  		Color.BLUE,
	  							Color.CYAN,   		Color.DARK_GRAY,
                    			Color.GRAY,   		Color.GREEN, 
                    			Color.LIGHT_GRAY, 	Color.MAGENTA,
                    			Color.ORANGE, 		Color.PINK,  
                    			Color.RED,        	Color.WHITE      }; 
	

	public Exo2()
	{
		setTitle("Fenetre");
		setLocation(300,200);
		bn1 = new Button( " Appliquer " );
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

		
	}

	public static void main(String [] args) { new Exo2(); }
}
