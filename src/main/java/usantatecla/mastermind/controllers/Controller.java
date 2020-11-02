package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class Controller {

	protected Session session;

	Controller(Session session) {
		this.session = session;
	}
	
	public int getWidth() {
		return this.session.getWidth();
	}

}
