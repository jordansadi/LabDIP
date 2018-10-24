package dip.lab3.student.solution1;

import javax.swing.*;

public class GUIInput implements MessageInput {
    @Override
    public void getMessage() {
        MessageService.message = JOptionPane.showInputDialog(null, "Enter message here:");
    }
}
