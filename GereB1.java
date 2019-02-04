import java.awt.event.*;			     // 3

public class GereB1 implements ActionListener        // 4
{
    private int nbBtn1;

    public void actionPerformed(ActionEvent e)       // 5
    {
    	nbBtn1++;
        System.out.println("Bouton B1  : " + nbBtn1 + "fois");
        //System.out.println( "  e.getActionCommand() : " + e.getActionCommand() );  // 6
        //System.out.println( "  e.paramString     () : " + e.paramString     () );        
    }
}