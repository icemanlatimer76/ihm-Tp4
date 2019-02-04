import java.awt.event.*;

public class GereB2 implements ActionListener {
    private int nbBtn2;

    public void actionPerformed(ActionEvent e) {
        nbBtn2++;
        System.out.println("Bouton B2  : " + nbBtn2 + "fois");
        // System.out.println( " e.getActionCommand() : " + e.getActionCommand() );
        // System.out.println( " e.paramString () : " + e.paramString () );
    }
}