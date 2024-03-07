package esercizio1;

import interfacce.checkIn;

import java.util.Random;

public class Volontario implements checkIn {
    public String name;
    public int age;
    public String cv;

    public Volontario(String name) {
        Random rndm = new Random();
        this.name = name;
        this.age = rndm.nextInt(18, 50);
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cv='" + cv + '\'' +
                '}';
    }

    @Override
    public void check() {
        System.out.println("Il volontario " + this.name + " entrata a lavoro");

    }
}
