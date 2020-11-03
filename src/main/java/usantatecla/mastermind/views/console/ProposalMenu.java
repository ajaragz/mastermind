package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.utils.Menu;

public class ProposalMenu extends Menu {

  ProposalMenu(ProposalController proposalController) {
    this.addCommand(new ProposalCommand(proposalController));
    // TODO: add unro/redo commands here
  }

}
