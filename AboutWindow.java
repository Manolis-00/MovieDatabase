import javax.swing.*;

public class AboutWindow extends JFrame {

    public AboutWindow() {

        ImageIcon logo = new ImageIcon("movieDatabase.jpg");
        JLabel imageLabel = new JLabel(logo);
        JLabel label = new JLabel("<html>Movie Database App Version 0.1<br/>Developer: Emmanouil Katopis<br/>Registry Number: 20390097<br/>Timeframe for app development: 8/6/2022 - 9/6/2022<br/><html/>" + imageLabel);

        this.add(label);

        this.setSize(350, 300);
        this.setResizable(false);
        this.setTitle("About");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);

    }
}
