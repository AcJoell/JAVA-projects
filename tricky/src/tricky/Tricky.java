
package tricky;

import javax.swing.JOptionPane;

public class Tricky {

    public static void main(String[] args) {
        game begin = new game();
        datos data = new datos();
        
        begin.setTitle("Tricky");
        begin.setVisible(true);
        begin.setSize(400,400);
        begin.setLocationRelativeTo(null);


        /*int[][] field = new int[3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                field[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor"+i+j));
            }
        }
        
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }

        if( field[0][0]==field[0][1] && field[0][1]==field[0][2] ){
            JOptionPane.showMessageDialog(null,"Triqui");
        } else
            if( field[1][0]==field[1][1] && field[1][1]==field[1][2] ){
                JOptionPane.showMessageDialog(null,"Triqui");
            } else
                if( field[2][0]==field[2][1] && field[2][1]==field[2][2] ){
                    JOptionPane.showMessageDialog(null,"Triqui");
                }*/

    }
    
}
