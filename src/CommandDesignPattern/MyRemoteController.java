package CommandDesignPattern;

public class MyRemoteController {

    ICommand command;

    public MyRemoteController() {
    }

    public ICommand getCommand() {
        return command;
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
