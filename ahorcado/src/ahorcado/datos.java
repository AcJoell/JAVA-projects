package ahorcado;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class datos {

    // Ver 1.2
    
    public char[] jugar;
    public String[] guion;
    public String[] palabra;
    
    public void datos(){}

    public char[] getJugar() {
        return jugar;
    }

    public void setJugar(char[] jugar) {
        this.jugar = jugar;
    }

    public String[] getGuion() {
        return guion;
    }

    public void setGuion(String[] guion) {
        this.guion = guion;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }
    
    public String[] palabras = new String[70];

    
    // Se asigna un diccionario especifico al array para poder escoger entre estas
    public String[] assignWord(){ //Inicio de diccionario
        palabras[0]="HOLA";
        palabras[1]="ESTUDIANTE";
        palabras[2]="COMPETENCIA";
        palabras[3]="ARMADURA";
        palabras[4]=("CAMARA");
        palabras[5]=("ARBOL");
        palabras[6]=("SAL");
        palabras[7]=("TIENDA");
        palabras[8]=("BARCO");
        palabras[9]=("TELEFONO");
        palabras[10]=("CAMION");
        palabras[11]=("TELEVISOR");
        palabras[12]=("QUESO");
        palabras[13]=("CIELO");
        
        return palabras;
    }

    // Se actualiza la cantidad de palabras que hay dentro del diccionario para poder escoger un numero entre un rango especifico
    public int contWord(){ // Se crea una variable para que este acutalizado con respecto a la cantidad de palabras
        int cont =0;
        String[] test =this.assignWord();
        for(int i=0;i<test.length;i++){
            if(test[i]!=null){
                cont++;
            }
        }
        return cont;
    }
    
    public char[] chooseWord(){ 

        //Se hace un random para poder escoger la palabra aleatoriamente
        //y se guarda en una variable (palabra)
        Random aleatorio = new Random();
        String[] x = this.assignWord(); // Llamamos al metodo diccionario para darle esos valores a x
        
        String palabra = "";
        int i = aleatorio.nextInt(this.contWord()); // Se escoge aleatoriamente la palabra y llamamos el metodo contWord para establecer el limite del aleatorio
        palabra=x[i]; // Le damos el valor de la palabra elegida a palabra
        
        System.out.println("La palabra es: "+palabra+" tiene "+palabra.length());

        //Hacemos otra variable para poder jugar con la palabra seleccionada aleatoriamente
        
        this.jugar = new char[palabra.length()]; // Guardamos la longitud de la palabra individualmente por medio de un char
        this.guion = new String[palabra.length()]; // Guardamos la longitud de la palabra completamente

        for(int t=0;t<jugar.length;t++){ // Imprimimos segun la longitud: _
            jugar[t] = palabra.charAt(t); // Se guarda la palabra (individualmente) en el arreglo (jugar)
            guion[t] = "_"; // Se imprime segun la longitud de la palabra al azar
        }
        return jugar;
    }

    String lineal = "";
    
    public void assignLineOfWord(){ // Le damos la cantidad de lineas segun la palabra
        for(int t=0;t<jugar.length;t++){ // Imprimimos segun la longitud: _
            System.out.print(jugar[t]); // Se guarda la palabra (individualmente) en el arreglo (jugar)
            System.out.print(guion[t]); // Se imprime segun la longitud de la palabra al azar
        }
        for(String t="_";t.length()<=(jugar.length)*2;t+=" _"){ // Se hace un for para poder imprimir en pantalla los guiones, el *2 sirve por si la palabra es muy larga, no pierde funcionalidad
            lineal = t; // Guardamos el resultado final de los guiones
        }
        System.out.println();
        System.out.print(lineal); // Testeo de variable
        System.out.println();
        for(int t=0;t<jugar.length;t++){ // Imprimimos segun la longitud: _
            System.out.print(guion[t]); // Se imprime segun la longitud de la palabra al azar
        }
    }
    
    boolean notFound = true;
    int contLose;
    int contInterno;
    
    public boolean playGame(char letra){
        
        for(int i=0;i<jugar.length;i++){ // Verificamos si la palabra es acertada o no
            if(jugar[i]==letra){
                System.out.println("CORRECT WORD: "+ jugar[i]);
                guion[i] = Character.toString(jugar[i]); // Cambiamos el valor del guion por la palabra correcta
                contInterno = 1;
            } else {
                contInterno=0;
            }

        }
        
        JOptionPane.showMessageDialog(null, "Aside Perdidas: "+contLose);
        JOptionPane.showMessageDialog(null, "Aside Interno: "+contInterno);
        
        if(contInterno == 0){
        contLose++; // Se pone contador por si la palabra es erronea y se verifica la siguiente condicion
        JOptionPane.showMessageDialog(null, "Into Perdidas: "+contLose);
        JOptionPane.showMessageDialog(null, "Into Interno: "+contInterno);
        }
        
        if(contLose==1){
            window.imagenAhorcado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/punto1.png")));
        } else if(contLose==2){
            window.imagenAhorcado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/punto2.png")));
        } else if(contLose==3){
            window.imagenAhorcado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/punto3.png")));
        } else if(contLose==4){
            window.imagenAhorcado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/punto4.png")));
        } else if(contLose==5){
            window.imagenAhorcado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/punto5.png")));
        } else if(contLose==6){
            window.imagenAhorcado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/punto6.png")));
        }
        
        for(int i=0;i<jugar.length;i++){ // Si la persona gana entonces se finaliza el juego
            int cont=0;
            if(jugar[i]==letra && cont == jugar.length){
                JOptionPane.showMessageDialog(null, "¡ YOU WIN !");
                cont++;
                System.exit(0);
            }
        }
        
        if(contLose==6){ // Lo utilizamos para confirmar si el jugador ya perdio
            notFound=false;
            JOptionPane.showMessageDialog(null, "¡ YOU LOSE !");
            System.exit(0);
        }
        
        for(int i=0;i<6;i++){
            //System.out.print(" Linea "); // Sirve para mostrar la imagen del ahorcado :)
        }
        
        return notFound;
    }
    
    public void print(){
        window.head.setText("");
        for(int t=0;t<jugar.length;t++){ // Utilizamos for para poder mezclar el arreglodentro de la variable
            window.head.setText(window.head.getText()+" "+guion[t]); // Se agregan ambos valores para que el jlabel deljframe pueda imprimir exitosamente la posicion del array (guion)
        }
    }

}
/*
enter.toLowerCase();
enter.replace("Á", "A");
*/