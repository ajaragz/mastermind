package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;
import usantatecla.mastermind.views.MessageView;

import java.util.List;

public class ProposalCommand extends Command {
    public ProposalCommand(ProposalController proposalController) {
        super(MessageView.PROPOSE_COMMAND.getMessage(), proposalController);
    }

    @Override
    protected void execute() {
        Error error;
        do {
            List<Color> colors = new ProposedCombinationView(proposalController).read();
            error = proposalController.addProposedCombination(colors);
            if (error != null) {
                new ErrorView(error).writeln();
            }
        } while (error != null);
        this.console.writeln();
        new AttemptsView(proposalController).writeln();
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

    @Override
    protected boolean isActive() {
        return true;
    }
}
