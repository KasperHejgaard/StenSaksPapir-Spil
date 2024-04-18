import java.util.Random;

public class ComputerSpiller extends Spiller {
    Random rand = new Random();

    public ComputerSpiller(String spillerNavn) {
        super(spillerNavn);
    }

    @Override
    public int Points() {
        return 0;
    }

    @Override
    public Håndtegn håndtegnValg() {
        int computerHåndTegn = rand.nextInt(3);
            switch (computerHåndTegn) {
                case 0 -> {
                    return Håndtegn.STEN;
                }
                case 1 -> {
                    return Håndtegn.SAKS;
                }
                case 2 -> {
                    return Håndtegn.PAPIR;
                }
            }
        return null;
    }
}
