import javax.swing.*;
import java.awt.event.*;

public class GP6_textEditor extends JFrame implements ActionListener {

    JFrame f = new JFrame("Text Editor");
    JMenuBar m = new JMenuBar();
    JTextArea t = new JTextArea();
    
    GP6_textEditor() {

        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        
        m.add(m1);
        m.add(m2);

        JMenuItem m11 = new JMenuItem("new");
        JMenuItem m12 = new JMenuItem("close");
        JMenuItem m21 = new JMenuItem("cut");
        JMenuItem m22 = new JMenuItem("copy");
        JMenuItem m23 = new JMenuItem("paste");

        m1.add(m11);
        m1.add(m12);
        m2.add(m21);
        m2.add(m22);
        m2.add(m23);

        m11.addActionListener(this);
        m12.addActionListener(this);
        m21.addActionListener(this);
        m22.addActionListener(this);
        m23.addActionListener(this);
	
        f.setSize(500, 500);
        f.setVisible(true);
        f.setJMenuBar(m);
        f.add(t);
        f.addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                f.dispose();    
            }    
        }); 
	}


	public void actionPerformed(ActionEvent e) {
        
        String s = e.getActionCommand();
        
        if (s.equals("new")) {
	t.setText("");
	} 
        
        else if (s.equals("close")) {
            f.dispose();
	}

        else if (s.equals("cut")) {
            t.cut();
 	}
        else if (s.equals("copy")) {
	t.copy();
	}
        else if (s.equals("paste")) {
            t.paste();
	}
        }

        public static void main(String args[]) {
        new GP6_textEditor();
	}
}
