package esercizio1;

public class DipendentePartTime extends Dipendente {
    public DipendentePartTime(Dipartimento dipartimento) {
        super(dipartimento);
    }

    @Override
    public double calculateSalary() {
        System.out.println("salario PartTime: " + 6.5 * 8);
        return 6.5 * 8;
    }


}
