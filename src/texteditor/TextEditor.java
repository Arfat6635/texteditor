
package texteditor;
import javax.swing.JFrame;

/**
 *
 * @author avocado
 */
public class TextEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        textEditorGui obj = new textEditorGui();
        obj.setBounds(0,0,700,700);
        obj.setTitle("TextEditor");
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
