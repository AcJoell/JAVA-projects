
package game;

import javax.swing.JOptionPane;
import java.util.Random;

public class code {
    
    private String item;
    private int op;
    Random aleatorio = new Random();

    
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    
    public void botonInicio(){
            window.item1.setVisible(true);
            window.item2.setVisible(true);
            window.item3.setVisible(true);
            window.item4.setVisible(true);
            window.item5.setVisible(true);
            window.userOP.setVisible(true);
            window.mensaje1.setVisible(true);
            window.lanzar.setVisible(true);
            window.btnInicio.setVisible(false);
    }
    
    
    public void escogerItemUser(){
        this.setItem(String.valueOf(window.userOP.getValue()));

        if(item.equals("1")){
            window.eleccionUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/img/1.1.png")));
        }
        if(item.equals("2")){
            window.eleccionUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/img/4.1.png")));
        }
        if(item.equals("3")){
            window.eleccionUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/img/2.1.png")));
        }
        if(item.equals("4")){
            window.eleccionUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/img/5.1.png")));
        }
        if(item.equals("5")){
            window.eleccionUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/img/3.1.png")));
        }
        
    }
    
    public void botonLanzar(){
        window.mensajeP.setVisible(true);
        window.mensajeU.setVisible(true);
        window.eleccionUser.setVisible(true);
        window.eleccionPC.setVisible(true);
        window.mensaje2.setVisible(true);
        window.mensaje3.setVisible(true);
        window.resultadoU.setVisible(true);
        window.resultadoP.setVisible(true);
        window.btnFin.setVisible(true);
    }
    
    
    public void escogerItemPC(){
        
        System.out.println(aleatorio.nextInt(5)+1);
        op = aleatorio.nextInt(5)+1;
        
        
        if(op==1){
            window.eleccionPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/img/1.1.png")));
        }
        if(op==2){
            window.eleccionPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/img/4.1.png")));
        }
        if(op==3){
            window.eleccionPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/img/2.1.png")));
        }
        if(op==4){
            window.eleccionPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/img/5.1.png")));
        }
        if(op==5){
            window.eleccionPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/img/3.1.png")));
        }
  
    }
    
    int victory=0;
    int lose=0;
    int tie=0;
    
    public void resultados(){
        
        if( (item.equals("1") && op==5) ){
            window.mensaje3.setText("WIN - La piedra aplasta la tijera.");
            victory++;
            window.resultadoU.setText(""+victory);
        }
        if( (item.equals("1") && op==2) ){
            window.mensaje3.setText("WIN - La piedra machaca al lagarto");
            victory++;
            window.resultadoU.setText(""+victory);
        }
        if( (item.equals("5") && op==1) ){
            window.mensaje3.setText("LOSE - La piedra aplasta la tijera.");
            lose++;
            window.resultadoP.setText(""+lose);
        }
        if( (item.equals("2") && op==1) ){
            window.mensaje3.setText("LOSE - La piedra machaca al lagarto.");
            lose++;
            window.resultadoP.setText(""+lose);
        }
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        if( (item.equals("2") && op==4) ){
            window.mensaje3.setText("WIN - El lagarto envenena a Spock.");
            victory++;
            window.resultadoU.setText(""+victory);
        }
        if( (item.equals("2") && op==3) ){
            window.mensaje3.setText("WIN - El lagarto se come el papel.");
            victory++;
            window.resultadoU.setText(""+victory);
        }
        if( (item.equals("4") && op==2) ){
            window.mensaje3.setText("LOSE - El lagarto envenena a Spock.");
            lose++;
            window.resultadoP.setText(""+lose);
        }
        if( (item.equals("3") && op==2) ){
            window.mensaje3.setText("LOSE - El lagarto se come el papel.");
            lose++;
            window.resultadoP.setText(""+lose);
        }
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        if( (item.equals("3") && op==1) ){
            window.mensaje3.setText("WIN - El papel envuelve a la piedra.");
            victory++;
            window.resultadoU.setText(""+victory);
        }
        if( (item.equals("3") && op==4) ){
            window.mensaje3.setText("WIN - El papel desautoriza a Spock.");
            victory++;
            window.resultadoU.setText(""+victory);
        }
        if( (item.equals("1") && op==3) ){
            window.mensaje3.setText("LOSE - El papel envuelve a la piedra.");
            lose++;
            window.resultadoP.setText(""+lose);
        }
        if( (item.equals("4") && op==3) ){
            window.mensaje3.setText("LOSE - El papel desautoriza a Spock.");
            lose++;
            window.resultadoP.setText(""+lose);
        }
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        if( (item.equals("4") && op==5) ){
            window.mensaje3.setText("WIN - Spock rompe las tijeras.");
            victory++;
            window.resultadoU.setText(""+victory);
        }
        if( (item.equals("4") && op==1) ){
            window.mensaje3.setText("WIN - Spock vaporiza la piedra.");
            victory++;
            window.resultadoU.setText(""+victory);
        }
        if( (item.equals("5") && op==4) ){
            window.mensaje3.setText("LOSE - Spock rompe las tijeras.");
            lose++;
            window.resultadoP.setText(""+lose);
        }
        if( (item.equals("1") && op==4) ){
            window.mensaje3.setText("LOSE - Spock vaporiza la piedra.");
            lose++;
            window.resultadoP.setText(""+lose);
        }
        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        if( (item.equals("5") && op==3) ){
            window.mensaje3.setText("WIN - La tijera corta el papel.");
            victory++;
            window.resultadoU.setText(""+victory);
        }
        if( (item.equals("5") && op==2) ){
            window.mensaje3.setText("WIN - La tijera decapita al lagarto.");
            victory++;
            window.resultadoU.setText(""+victory);
        }
        if( (item.equals("3") && op==5) ){
            window.mensaje3.setText("LOSE - La tijera corta el papel.");
            lose++;
            window.resultadoP.setText(""+lose);
        }
        if( (item.equals("2") && op==5) ){
            window.mensaje3.setText("LOSE - La tijera decapita al lagarto.");
            lose++;
            window.resultadoP.setText(""+lose);
        }
        String fin = String.valueOf(op);
        if (item.equals(fin)){
            window.mensaje3.setText("TIE - Mismo movimiento.");
            tie++;
        }
        
    }
    
    public void finalizar (){
    
        if(victory>lose){
            JOptionPane.showMessageDialog(null,
                    "El jugador ha ganado!\n"+
                    "Movimientos:\n"+
                    "WIN: "+victory+
                    "\nLOSE: "+lose+
                    "\nTIE: "+tie
            );
        }
        else if(victory<lose){
            JOptionPane.showMessageDialog(null,
                    "El jugador ha perdido!\n"+
                    "Movimientos:\n"+
                    "WIN: "+victory+
                    "\nLOSE: "+lose+
                    "\nTIE: "+tie
            );
        }
        else if(victory == lose){
            JOptionPane.showMessageDialog(null,
                    "El jugador ha empatado!\n"+
                    "Movimientos:\n"+
                    "WIN: "+victory+
                    "\nLOSE: "+lose+
                    "\nTIE: "+tie
            );
        }
        System.exit(0);

    }
    
}