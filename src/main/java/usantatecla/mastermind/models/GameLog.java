package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class GameLog {

    private Game game;
    private List<BoardSetup> boardSetups;

    GameLog(Game game){
        this.game = game;
        this.reset();
    }

    public void reset() {
        this.boardSetups = new ArrayList<BoardSetup>();
    }

    public void log() {
        this.boardSetups.add(this.game.getBoardSetup());
    }

    public void undo() {
        this.boardSetups.remove(this.boardSetups.size() - 1);
        this.game.setBoard(this.boardSetups.get(this.boardSetups.size() - 1));
    }

    public void redo() {
        ProposedCombination lastProposedCombination =
                this.boardSetups.get(this.boardSetups.size() - 1).getLastProposedCombination();
        this.game.addProposedCombination(lastProposedCombination.getColors());
        this.log();
    }

    public boolean isUndoable() {
        return this.boardSetups.size() > 1;
    }

    public boolean isRedoable() {
        return this.boardSetups.size() > 0;
    }
}
