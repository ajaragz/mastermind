package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class BoardSetup {
    private List<ProposedCombination> proposedCombinations;
    private List<Result> results;
    private int attempts;

    BoardSetup(List<ProposedCombination> proposedCombinations,
               List<Result> results,
               int attempts) {
        this.proposedCombinations = new ArrayList<>(proposedCombinations);
        this.results = new ArrayList<>(results);
        this.attempts = attempts;
    }

    public List<ProposedCombination> getProposedCombinations() {
        return new ArrayList<>(this.proposedCombinations);
    }

    public ProposedCombination getLastProposedCombination() {
        return this.proposedCombinations.get(this.proposedCombinations.size() - 1);
    }

    public List<Result> getResults() {
        return new ArrayList<>(this.results);
    }

    public int getAttempts() {
        return this.attempts;
    }
}


