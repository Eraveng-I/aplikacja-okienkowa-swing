package tb.soft;
//import java.awt.EventQueue;
//import javax.swing.JFrame;

/**
 * klasa główna zawierająca metodę statyczną main
 */
public class MainWindow /*extends JFrame*/ /*implements ActionListener*/ {

    public static void main(String[] args) {

        try{
            Okno frame = new Okno();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }

    }
}