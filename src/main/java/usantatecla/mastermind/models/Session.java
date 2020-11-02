package usantatecla.mastermind.models;

import usantatecla.mastermind.types.Color;

import java.util.List;

public class Session {

    private Game game;
    private State state;

    public Session() {
        this.game = new Game();
        this.state = new State();
    }

    public int getWidth() {
        return this.game.getWidth();
    }

    public void next() {
        this.state.next();
    }

    public void reset() {
        this.game.clear();
        this.state.reset();
    }

    public void addProposedCombination(List<Color> colors) {
        this.game.addProposedCombination(colors);
    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public boolean isLooser() {
        return this.game.isLooser();
    }

    public int getAttempts() {
        return this.game.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.game.getColors(position);
    }

    public int getBlacks(int position) {
        return this.game.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.game.getWhites(position);
    }

    public StateValue getValueState() {
        return this.state.getValueState();
    }
}
