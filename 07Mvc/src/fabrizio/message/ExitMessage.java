package fabrizio.message;

import fabrizio.controller.ControllerVisitor;

public class ExitMessage extends Message {

	@Override
	public void visit(ControllerVisitor cv) {
		cv.visitExitController();

	}

}
