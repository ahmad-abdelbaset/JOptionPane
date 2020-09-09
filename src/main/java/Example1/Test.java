
package Example1;

import javax.swing.JOptionPane;

/*
1) Normal Message:

JOptionPane.showMessageDialog(null,"Hello World!");

2)Special Message:
JOptionPane.showMessageDialog(null, "Hello World", "Information",
                JOptionPane.Error_MESSAGE);

3)Option Message:
Object[] arr = {"First Option", "Second Option","Third Option"};
        
        JOptionPane.showOptionDialog(null, "Hello World", "Information",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,arr,arr[2]);

4) Input Message:
Object[] arr = {"First Option", "Second Option","Third Option"};
        
        JOptionPane.showInputDialog(null, "Hello World", "Information",
                 JOptionPane.QUESTION_MESSAGE,null,arr,"Second Option");

-- OR--

JOptionPane.showInputDialog(null, "Hello World");

*/

public class Test {

    public Test(){
        
   
        
        JOptionPane.showInputDialog(null, "Hello World");
        
    }
  
    public static void main(String[] args) {
    
        new Test();
    }
    
}
