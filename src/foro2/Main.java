package foro2;

public class Main {
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TodoPcForm frame = new TodoPcForm();
                frame.setVisible(true);
            }
        });
    }
    
}
