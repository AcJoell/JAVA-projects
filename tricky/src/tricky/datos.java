
package tricky;

import javax.swing.JOptionPane;
import java.util.Random;

public class datos {
 

    public String item = JOptionPane.showInputDialog(null, "Seleccione el item que desea usar");
    public int turno;
    public int elePc;
    public int eleUser;
    Random aleatorio = new Random();

    public datos() {
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    
    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getElePc() {
        return elePc;
    }

    public void setElePc(int elePc) {
        this.elePc = elePc;
    }

    public int getEleUser() {
        return eleUser;
    }

    public void setEleUser(int eleUser) {
        this.eleUser = eleUser;
    }
    
}
