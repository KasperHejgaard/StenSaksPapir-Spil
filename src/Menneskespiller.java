import java.util.Scanner;

public class Menneskespiller extends Spiller {

    Scanner spillerInput = new Scanner(System.in);

    public Menneskespiller(String spillerNavn) {
        super(spillerNavn);
    }

    @Override
    public int Points() {
        return 0;
    }

    @Override
    public Håndtegn håndtegnValg() {
        System.out.println("Tast 1 for at vælge 'Sten', 2 for at vælge 'Saks' og 3 for 'Papir'");
        int choice = spillerInput.nextInt();
        switch (choice) {
            case 1 -> {
                return Håndtegn.STEN;
            }
            case 2 -> {
                return Håndtegn.SAKS;
            }
            case 3 -> {
                return Håndtegn.PAPIR;
            }
        }
        return null;
    }

}
