
package ahorcado;

import javax.swing.JOptionPane;

public class Ahorcado {

    public static void main(String[] args) {
        
        datos dt = new datos();
        
        
        dt.chooseWord();
        if(dt.playGame('O')){
            System.out.println("Si encontro");
        } else {
        System.out.println("No encontro");
        }
        
        
        menu mn = new menu();
        mn.setTitle("Menu");
        mn.setVisible(true);
        mn.setLocationRelativeTo(null);
        
    }
     
}
