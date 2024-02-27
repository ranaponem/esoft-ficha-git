import javax.swing.*;

public class Frame extends JFrame{
    Frame(){
        JPanel p1 = new JPanel();
        JLabel l1 = new JLabel("Hello World!");
        JLabel l2 = new JLabel("O Rafael Saraiva esteve aqui");
        l1.setVerticalAlignment(SwingConstants.CENTER);
        l2.setVerticalAlignment(SwingConstants.CENTER);
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        p1.add(l1);
        add(p1);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
