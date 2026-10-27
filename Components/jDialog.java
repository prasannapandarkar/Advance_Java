import javax.swing.*;

public class jDialog extends JFrame {

    public jDialog() {
        setTitle("JDialog Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton btn = new JButton("Open Dialog");
        btn.setBounds(100, 80, 150, 40);

        btn.addActionListener(e -> {
            JDialog dialog = new JDialog(this, "My Dialog", true);

            JLabel label = new JLabel("Welcome to Java Swing!");
            label.setBounds(30, 30, 250, 30);

            JButton close = new JButton("Close");
            close.setBounds(80, 80, 100, 30);

            close.addActionListener(ev -> dialog.dispose());

            dialog.setLayout(null);
            dialog.add(label);
            dialog.add(close);

            dialog.setSize(300, 180);
            dialog.setLocationRelativeTo(this);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        });

        add(btn);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new jDialog();
    }
}