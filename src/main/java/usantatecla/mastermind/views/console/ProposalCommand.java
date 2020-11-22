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
        this.writeSummary();;
    }

    @Override
    protected boolean isActive() {
        return true;
    }
}
