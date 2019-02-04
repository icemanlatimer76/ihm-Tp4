import java.awt.*;

public class Exo1V1 extends Frame
{
    private Button btn1;
    private Button btn2;

    public Exo1V1()
    {
        this.setTitle   ("2 Boutons");
        this.setSize    (300,150);                   // 1
        this.setLocation(50,50);

        this.btn1 = new Button( " Appliquer " );
        this.btn1.addActionListener( new GereB1() );
        this.add(this.btn1, BorderLayout.NORTH);

        this.btn2 = new Button( " Annuler " );
        this.btn2.addActionListener( new GereB2() );  // 2
        this.add(this.btn2, BorderLayout.SOUTH);

        this.pack();                                  // 3
        this.setVisible(true);
    }

    public static void main(String [] args) { new Exo1V1(); }
}