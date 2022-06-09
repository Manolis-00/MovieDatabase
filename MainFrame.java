import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainFrame {

    private JLabel movieTitleLabel;
    private JLabel yearReleasedLabel;
    private JLabel movieDurationLabel;
    private JLabel movieCategoryLabel;
    private JLabel movieDirectorLabel;
    private JLabel movieDistributionLabel;
    private JLabel movieBudgetLabel;

    private JTextField movieTitleTextField;
    private JTextField yearReleasedTextField;
    private JTextField movieDurationTextField;
    private JTextField movieCategoryTextField;
    private JTextField movieDirectorTextField;
    private JTextField movieDistributionMethodTextField;
    private JTextField movieBudgetTextField;

    private JButton addMovieButton;
    private JButton saveButton;
    private JButton statisticsButton;
    private JButton appInfoButton;
    private JButton exitButton;

    private JTextArea area;

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu helpMenu;
    private JMenuItem saveItem;
    private JMenuItem statisticsItem;
    private JMenuItem exitItem;
    private JMenuItem aboutItem;

    private ArrayList<Movie> moviesList = new ArrayList();

    public MainFrame() {
        movieTitleLabel = new JLabel("Title: \t");
        yearReleasedLabel = new JLabel("Year Released: \t");
        movieDurationLabel = new JLabel("Duration: \t");
        movieCategoryLabel = new JLabel("Category: \t");
        movieDirectorLabel = new JLabel("Director: \t");
        movieDistributionLabel = new JLabel("Distribution: \t");
        movieBudgetLabel = new JLabel("Budget: \t");

        movieTitleTextField = new JTextField(23);
        yearReleasedTextField = new JTextField(4);
        movieDurationTextField = new JTextField(6);
        movieCategoryTextField = new JTextField(10);
        movieDirectorTextField = new JTextField(23);
        movieDistributionMethodTextField = new JTextField(23);
        movieBudgetTextField = new JTextField(6);

        addMovieButton = new JButton("Add Movie");
        saveButton = new JButton("Save to File");
        statisticsButton = new JButton("Statistics of Saved Movies");
        appInfoButton = new JButton("About");
        exitButton = new JButton("Exit");

        area = new JTextArea();

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        saveItem = new JMenuItem("Save to FIle");
        statisticsItem = new JMenuItem("Statistics of Saved Movies");
        exitItem = new JMenuItem("Exit");
        aboutItem = new JMenuItem("About");

        JPanel northPanel =  new JPanel();
        northPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        northPanel.add(movieTitleLabel);
        northPanel.add(movieTitleTextField);
        northPanel.add(yearReleasedLabel);
        northPanel.add(yearReleasedTextField);
        northPanel.add(movieDurationLabel);
        northPanel.add(movieDurationTextField);
        northPanel.add(movieCategoryLabel);
        northPanel.add(movieCategoryTextField);
        northPanel.add(movieDirectorLabel);
        northPanel.add(movieDirectorTextField);
        northPanel.add(movieDistributionLabel);
        northPanel.add(movieDistributionMethodTextField);
        northPanel.add(movieBudgetLabel);
        northPanel.add(movieBudgetTextField);
        northPanel.add(addMovieButton);

        southPanel.add(saveButton);
        southPanel.add(statisticsButton);
        southPanel.add(appInfoButton);
        southPanel.add(exitButton);

        //this.setLayout(new BorderLayout());
        //this.setLayout(new BorderLayout());
        area.setLayout(new BorderLayout());
        northPanel.setLayout(new BorderLayout());
        northPanel.add(northPanel, BorderLayout.NORTH);



    }


}
