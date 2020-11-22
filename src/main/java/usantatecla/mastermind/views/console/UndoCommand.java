package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;

public class UndoCommand extends Command {
    public UndoCommand(ProposalController proposalController) {
        super(MessageView.UNDO_COMMAND.getMessage(), proposalController);
    }

    @Override
    protected void execute() {
        this.proposalController.undo();
        this.writeSummary();
    }

    @Override
    protected boolean isActive() {
        return this.proposalController.isUndoable();
    }
}
