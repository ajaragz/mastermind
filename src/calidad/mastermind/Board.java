package calidad.mastermind;

public class Board {
    private static final int ATTEMPTS = 10;
    private SecretPattern secret;
    private int attempt;
    private Result result;

    Board() {
        attempt = 1;
        secret = new SecretPattern();
    }

    public boolean isFull() {
        return attempt == ATTEMPTS;
    }

    public boolean isWinner() {
        return this.result.isWinner();
    }

    public void add(GuessPattern guess) {
        this.result = this.secret.getResult(guess);
        this.attempt++;
    }
}
