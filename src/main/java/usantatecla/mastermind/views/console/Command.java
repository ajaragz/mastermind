package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;

public abstract class Command extends usantatecla.utils.Command {

    protected ProposalController proposalController;

    protected Command(String title, ProposalController proposalController) {
        super(title);
        this.proposalController = proposalController;
    }

    protected void writeSummary() {
        this.console.writeln();
        new AttemptsView(proposalController).writeln();;
        for (int i = 0; i < proposalController.getAttempts(); i++) {
            new ProposedCombinationView(proposalController).write(i);
            new ResultView(proposalController).writeln(i);
        }
        if (proposalController.isWinner()) {
            this.console.writeln(MessageView.WINNER.getMessage());
        } else if (proposalController.isLooser()) {
            this.console.writeln(MessageView.LOOSER.getMessage());
        }
    }
}
