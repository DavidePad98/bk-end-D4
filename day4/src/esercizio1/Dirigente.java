package esercizio1;

public class Dirigente extends Dipendente {
    public Dirigente(Dipartimento dipartimento) {
        super(dipartimento);
    }

    @Override
    public double calculateSalary() {
        System.out.println("salario Dirigente: " + (2500.50 + 1500.60));
        return 2500.50 + 1500.60;
    }
}
