public abstract class Spiller {
    private final String spillerNavn;
    int points;

    public Spiller(String spillerNavn) {
        this.spillerNavn = spillerNavn;
        this.points = 0;
    }

    public void tilføjSpilPoint() {
        points++;
    }

    public String getSpillerNavn() {
        return spillerNavn;
    }

    public int getPoints() {
        return points;
    }

    public abstract int Points();

    public abstract Håndtegn håndtegnValg();
}
