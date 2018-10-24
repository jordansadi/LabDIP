package dip.lab3.student.solution1;

public class ConsoleOutput implements MessageOutput {
    @Override
    public void showMessage() {
        System.out.println(MessageService.message);
    }
}
