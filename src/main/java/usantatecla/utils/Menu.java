package usantatecla.utils;

import usantatecla.mastermind.views.MessageView;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu extends WithConsoleView {

    private static final String OPTION = "Option? [1-#size]: ";
    private List<Command> commandList;

    public Menu() {
        this.commandList = new ArrayList<Command>();
    }

    public void execute() {
        ArrayList<Command> commands = new ArrayList<Command>();
        for (int i = 0; i < this.commandList.size(); i++) {
            if (this.commandList.get(i).isActive()) {
                commands.add(this.commandList.get(i));
            }
        }
        this.console.writeln(MessageView.MENU_TITLE.getMessage());
        int option;
        boolean error;
        do {
            error = false;
            //this.console.writeln();
            for (int i = 0; i < commands.size(); i++) {
                this.console.writeln((i + 1) + ". " + commands.get(i).getTitle());
            }
            option = this.console.readInt(Menu.OPTION.replace("#size", "" + commands.size())) - 1;
            if (!new ClosedInterval(0, commands.size() - 1).includes(option)) {
                error = true;
            }
        } while (error);
        commands.get(option).execute();
        this.console.writeln();
    }

    protected void addCommand(Command command) {
        this.commandList.add(command);
    }

}