package it.viligiardi;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cestino c1 = new Cestino(0);
        Deposito d1 = new Deposito(c1, 10000);
        Deposito d2 = new Deposito(c1, 10000);
        d1.start();
        d2.start();
        
        d1.join();
        d2.join();
        
        System.out.println(c1.getValore());
    }
}