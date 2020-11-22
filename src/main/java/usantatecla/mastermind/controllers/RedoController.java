package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class RedoController extends Controller {

    public RedoController(Session session) {
        super(session);
    }

    public void redo() {
        this.session.redo();
        if (this.session.isLooser()) {
            this.session.next();
        }
    }

    public boolean isRedoable(){
        return this.session.isRedoable();
    }

}
