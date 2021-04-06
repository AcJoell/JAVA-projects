package ahorcado;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class datos {

    public char[] jugar;
    public String[] guion;
    public String[] palabra;
    public String[] lose = {"A","H","O","R","C","A","D","O"};
    public String[] lose_line = {"_","_","_","_","_","_","_","_"};
    
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

    public String[] assignWord(){ //Inicio de diccionario
        palabras[0]="HOLA";
        palabras[1]="ESTUDIANTE";
        palabras[2]="COMPETENCIA";
        palabras[3]="AHORCADO";
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
        String[] x = this.assignWord();
        
        String palabra = "";
        int i = aleatorio.nextInt(this.contWord());
        
        palabra=x[i];
        JOptionPane.showMessageDialog(null,"La palabra es: "+palabra+" tiene "+palabra.length());

        //Hacemos otra variable para poder jugar con la palabra seleccionada aleatoriamente
        
        this.jugar = new char[palabra.length()];
        this.guion = new String[palabra.length()];
        
        for(int t=0;t<jugar.length;t++){
            jugar[t] = palabra.charAt(t);
            guion[t] = "_";
            //System.out.print(jugar[t]+" - "); 
            //System.out.print(guion[t]+" ");
        }
        return jugar;
    }

    
    public boolean playGame(char letra){
        
        boolean notFound=true;
        char [] gameWord = this.jugar;
        String[] gameLine = this.guion;
        String[] gameLose1 = this.lose;
        String[] gameLose2 = this.lose_line;
        int z=0, cont=0;
        for(int i=0;i<gameWord.length;i++){
            if(gameWord[i]==letra){
                gameLine[i]=Character.toString(gameWord[i]);
            } else {
            cont++;
            }
        }
        
        if(cont==gameWord.length){
            notFound=false;
            gameLose2[z]=gameLose1[z];
            z++;
        }
        
        for(int i=0;i<gameLose2.length;i++){
            System.out.print(gameLose2[i]+" ");
        }
        
        return notFound;
    }

}

/*
enter.toLowerCase();
enter.replace("Á", "A");
*/