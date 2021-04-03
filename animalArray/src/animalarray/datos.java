package animalarray;

import java.util.Random;
import javax.swing.JOptionPane;

public class datos {

    //window wd = new window();
    
    Random aleatorio = new Random();
    String animales[] = {"Cebra","Caballo","Lagarto","Puma","Jirafa","Delfin","Elefante","Mico","Loro","Perro"};

    public void mostrarLista(){
        for(String i : animales){
            System.out.println(i);
        }
    }
    
    int x;
    
    public void randomOption(){
        x = aleatorio.nextInt(9);
        window.name.setText(animales[x]);
    }
    
    public void chooseNumber(){
        x = Integer.parseInt(window.opcion.getValue().toString());
        window.name.setText(animales[x]);
    }
    
    public void chooseAsset(){
        if (x==0){window.field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ass1.png")));}
        if (x==1){window.field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ass2.png")));}
        if (x==2){window.field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ass3.png")));}
        if (x==3){window.field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ass4.png")));}
        if (x==4){window.field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ass5.png")));}
        if (x==5){window.field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ass6.png")));}
        if (x==6){window.field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ass7.png")));}
        if (x==7){window.field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ass8.png")));}
        if (x==8){window.field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ass9.png")));}
        if (x==9){window.field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ass10.png")));}
    }

}
