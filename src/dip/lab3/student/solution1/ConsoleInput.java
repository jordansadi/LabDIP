package dip.lab3.student.solution1;

import java.util.Scanner;

public class ConsoleInput implements MessageInput {
    private Scanner k = new Scanner(System.in);

    @Override
    public void getMessage() {
        System.out.println("Enter a message:");
        MessageService.message = k.nextLine();
    }
}
