package esercizio1;

import interfacce.checkIn;

import java.util.Random;

public abstract class Dipendente implements checkIn {

    protected int matricola;
    protected double stipendio;
    protected Dipartimento dipartimento;

    public Dipendente(Dipartimento dipartimento) {
        Random rndm = new Random();
        this.matricola = rndm.nextInt(1, 100);
        this.stipendio = calculateSalary();
        this.dipartimento = dipartimento;
    }

    @Override
    public void check() {
        System.out.println("La matricola n'" + this.matricola + " entrata a lavoro");
    }

    public void getInfo() {
        System.out.println("n'matricola: " + this.matricola);
        System.out.println("stipendio: " + this.stipendio);
        System.out.println("dipartimento: " + this.dipartimento);
    }

    public abstract double calculateSalary();
}

