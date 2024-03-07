package esercizio1;

import interfacce.checkIn;

public class Main {
    public static void main(String[] args) {

        DipendenteFullTime mario = new DipendenteFullTime(Dipartimento.VENDITE);
        Dirigente luigi = new Dirigente(Dipartimento.AMMINISTRAZIONE);
        DipendentePartTime daniele = new DipendentePartTime(Dipartimento.PRODUZIONE);
        Volontario giacomo = new Volontario("giacomo");
        Volontario mimmo = new Volontario("mimmo");

        Dipendente[] dipendenti = {mario, luigi, daniele, new DipendenteFullTime(Dipartimento.VENDITE)};
        double sommaSalari = 0.0;
        for (int i = 0; i < dipendenti.length; i++) {
//            dipendenti[i].getInfo();
            //           dipendenti[i].calculateSalary();
            sommaSalari += dipendenti[i].calculateSalary();
        }
        System.out.println("la somma dei salari è: " + sommaSalari);
        checkIn[] lavoratori = {mario, luigi, giacomo, daniele, mimmo, new Volontario("francesco"), new Dirigente(Dipartimento.PRODUZIONE)};
        for (int i = 0; i < lavoratori.length; i++) {
            lavoratori[i].check();
        }
    }
}
