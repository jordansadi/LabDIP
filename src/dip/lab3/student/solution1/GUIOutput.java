package dip.lab3.student.solution1;

import javax.swing.*;

public class GUIOutput implements MessageOutput {
    @Override
    public void showMessage() {
        JOptionPane.showMessageDialog(null, MessageService.message);
    }
}
