package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class RedoController extends Controller {

    public RedoController(Session session) {
        super(session);
    }

    public void redo() {
        // TODO: change this to this.session.redo()
        this.session.isWinner();
    }

    public boolean isRedoable(){
        // TODO: return this.session.isRedoable();
        return true;
    }

}
