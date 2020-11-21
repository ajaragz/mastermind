package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class UndoController extends Controller{

	public UndoController(Session session) {
		super(session);
	}
	
	public void undo() {
		// TODO: this.session.undo()
		this.session.isWinner();
	}

	public boolean isUndoable(){
		// TODO: return this.session.isUndoable();
		return true;
	}

}
