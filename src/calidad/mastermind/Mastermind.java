package calidad.mastermind;

public class Mastermind {

    private Board board;

    Mastermind() {
        this.board = new Board();
        this.play();
    }

    private void play() {
        GuessPattern guess;
        String message;
        do {
            guess = new GuessPattern();
            guess.read();
            this.board.add(guess);
        } while (!this.board.isFull() || this.board.isWinner());

        if (this.board.isWinner()) {
            message = "You've won";
        } else {
            message = "You've lost";
        }
        System.out.println(message);
    }

    public static void main(String[] args) {
        new Mastermind();
    }
}
