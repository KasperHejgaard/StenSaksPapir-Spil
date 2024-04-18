public class Spil {
    public void start() {
        /*public Spiller(Spiller menneskeSpiller, Spiller computerSpiller) {
            menneskeSpiller.getNavn();
            ComputerSpiller.getNavn();
        }*/
        Menneskespiller menneskeSpiller = new Menneskespiller("Kasper");
        ComputerSpiller computerSpiller = new ComputerSpiller("Computer");
        System.out.println("Velkommen til Sten, Saks, Papir."
                + "\nSpillet fungere efter vedst ud af tre princippet.");
        int runder = 0;

        while (runder != 3) {
            Håndtegn håndtegn1 = menneskeSpiller.håndtegnValg();
            Håndtegn håndTegn2 = computerSpiller.håndtegnValg();
            System.out.println(menneskeSpiller.getSpillerNavn()+ " Har valgt " + håndtegn1);
            System.out.println("Computer vælger " + håndTegn2);
            if (håndtegn1 == håndTegn2) {
                System.out.println("Det er uafgjort i har begge valgt " + håndtegn1);
                continue;
            } else if ((håndtegn1 == Håndtegn.STEN && håndTegn2 == Håndtegn.SAKS) ||
                    (håndtegn1 == Håndtegn.SAKS && håndTegn2 == Håndtegn.PAPIR) ||
                    (håndtegn1 == Håndtegn.PAPIR && håndTegn2 == Håndtegn.STEN)) {
                System.out.println("Du vinder denne runde!");
                menneskeSpiller.tilføjSpilPoint();
                System.out.println("Kasper har " + menneskeSpiller.getPoints() + " point");
            } else {
                System.out.println("Computeren vinder denne runde!");
                computerSpiller.tilføjSpilPoint();
                System.out.println("Computerspillerens point: " + computerSpiller.getPoints());
            }
            runder++;
        }
        System.out.println("Spillet er slut");
    }


}