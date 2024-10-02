package it.viligiardi;

public class Deposito extends Thread{
    Cestino c;
    int q;

    public Deposito(Cestino c, int q) {
        this.c = c;
        this.q = q;
    }

    public void run(){
        for(int i= 0; i<q; i++){
            c.aggiungiMoneta();
        }
    }
}
