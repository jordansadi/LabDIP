package dip.lab3.student.solution1;

public class Startup {
    public static void main(String[] args) {
        MessageInput consoleIn = new ConsoleInput();
        MessageOutput consoleOut = new ConsoleOutput();
        MessageInput guiIn = new GUIInput();
        MessageOutput guiOut = new GUIOutput();

        MessageService ms = new MessageService();

        ms.getMessage(consoleIn);
        ms.showMessage(consoleOut);
        ms.getMessage(guiIn);
        ms.showMessage(guiOut);
    }
}
