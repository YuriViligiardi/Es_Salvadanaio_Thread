package it.viligiardi;

public class Cestino {
    //attributes
    int valore;

    //methods and constructions
    public Cestino (int i){
        valore = i;
    }

    synchronized public void aggiungiMoneta(){
        valore = valore + 1;
    }

    public int getValore() {
        return valore;
    }
}
