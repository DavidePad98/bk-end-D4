package esercizio1;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(Dipartimento dipartimento) {
        super(dipartimento);
    }

    @Override
    public double calculateSalary() {
        System.out.println("salario FullTime: " + 1500.50);
        return 1500.50;
    }
}
