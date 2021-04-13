package tricky;

import java.util.Random;

public class datos {

    public String item = "X";
    public String itemPC = "O";
    public int turno;
    public int elepc;
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

    public int getElepc() {
        return elepc;
    }

    public void setElepc(int elepc) {
        this.elepc = elepc;
    }

    //execute.aleatorPc();
      //  elecciones();
    
    public void aleatorPc(){

        elepc = aleatorio.nextInt(9)+1;
        System.out.println("NUM inicio "+elepc);
        //! game.po1.equals("X") && ! game.po1.equals("O")
        if(elepc==1 && game.po1.equals("X")){
            game.po1.setText(itemPC);
        }
        else if(elepc==2 && game.po2.equals("X")){
            game.po2.setText(itemPC);
        }
        else if(elepc==3 && game.po3.equals("X")){
            game.po3.setText(itemPC);
        }
        else if(elepc==4 && game.po4.equals("X")){
            game.po4.setText(itemPC);
        }
        else if(elepc==5 && game.po5.equals("X")){
            game.po5.setText(itemPC);
        }
        else if(elepc==6 && game.po6.equals("X")){
            game.po6.setText(itemPC);
        }
        else if(elepc==7 && game.po7.equals("X")){
            game.po7.setText(itemPC);
        }
        else if(elepc==8 && game.po8.equals("X")){
            game.po8.setText(itemPC);
        }
        else if(elepc==9 && game.po8.equals("X")){
            game.po9.setText(itemPC);
        }
        else {
            elepc = aleatorio.nextInt(9)+1;
            aleatorPc();
        }
    }

    /*
    00 01 02
    10 11 12
    20 21 22
    */
    
    
    
}