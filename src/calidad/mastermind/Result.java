package calidad.mastermind;

public class Result {
    private int BlackHits;
    private int WhiteHits;

    Result(int blackHits, int whiteHits) {
        this.BlackHits = blackHits;
        this.WhiteHits = whiteHits;
    }

    public boolean isWinner() {
        return this.BlackHits == Pattern.WIDTH;
    }
}
