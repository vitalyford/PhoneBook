import javax.swing.*;
import BreezySwing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

/**
 * This PhoneBook started code is a sample Java phone book application.
 * This game uses BreezeSwing framework: http://home.wlu.edu/~lambertk/BreezySwing/index.html
 * 
 * @author Vitaly Ford
 *
 */
public class PhoneBook extends GBFrame {

	JLabel nameLabel  = addLabel("Name:", 1,1,1,1);
	JTextField name   = addTextField("", 1,2,1,1);
	JLabel phoneLabel = addLabel("Phone number:", 2,1,1,1);
	JTextField phone  = addTextField("", 2,2,1,1);
    JButton add       = addButton("Add", 3,1,2,1);
	JTextArea book    = addTextArea("", 4,1,2,8);
    
    PhoneBook() {
    	book.setEditable(false); // make the phone book not editable manually
    }
    
    public void buttonClicked(JButton button) {
    	// Process what happens what the user clicks on Add button
    }

    public static void main (String[] args) {
    	// Get the size of the screen so that we could set our game window in the middle
    	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    	// Create the frame for our game window
        JFrame frm = new PhoneBook();
        // Set the size of our game window
        frm.setSize(1000, 600);
        // Set the window in the middle of the screen
        frm.setLocation(dim.width / 2 - frm.getSize().width / 2, dim.height / 2 - frm.getSize().height / 2);
        // Make it visible to the user
        frm.setVisible(true);
    }

}
