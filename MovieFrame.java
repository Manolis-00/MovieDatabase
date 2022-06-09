//package registrationapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MovieFrame extends JFrame {
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

    private JButton saveButton;
    private JButton exitButton;
    private JButton addMovieButton;
    private JButton statisticsButton;
    private JButton aboutButton;


    private JTextArea area;

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu helpMenu;
    private JMenuItem addMovieItem;
    private JMenuItem saveItem;
    private JMenuItem statisticsItem;
    private JMenuItem exitItem;
    private JMenuItem aboutItem;


    private ArrayList<Movie> moviesList = new ArrayList();

    public MovieFrame() {
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

        saveButton = new JButton("Save to file");
        exitButton = new JButton("Exit");
        addMovieButton = new JButton("Add Movie");
        saveButton = new JButton("Save to File");
        statisticsButton = new JButton("Statistics of Saved Movies");
        aboutButton = new JButton("About");
        exitButton = new JButton("Exit");

        area = new JTextArea();

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        addMovieItem = new JMenuItem("Add Movie");
        saveItem = new JMenuItem("Save to FIle");
        statisticsItem = new JMenuItem("Statistics of Saved Movies");
        exitItem = new JMenuItem("Exit");
        aboutItem = new JMenuItem("About");

        Panel northPanel = new Panel();
        northPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        Panel southPanel = new Panel();
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
        southPanel.add(aboutButton);
        southPanel.add(exitButton);

        this.setLayout(new BorderLayout());
        this.add(northPanel, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);
        this.add(area, BorderLayout.CENTER);

        fileMenu.add(addMovieItem);
        fileMenu.add(saveItem);
        fileMenu.add(statisticsItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);

        this.setSize(1800, 800);
        this.setTitle("Movie Database");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exitAction();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitAction();
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitAction();
            }
        });

        addMovieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMovieAction();
            }
        });

        addMovieItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMovieAction();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFileAction();
            }
        });

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveToFileAction();
            }
        });

        statisticsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO addStatisticsMethod
            }
        });

        statisticsItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO addStatisticsMethod
            }
        });

        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO addAboutMethod
            }
        });

        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO addAboutMethod
            }
        });

    }

    private void exitAction() {
        int answer = JOptionPane.showConfirmDialog(null, "Do you want to exit the application?");
        if (answer == JOptionPane.YES_OPTION)
            System.exit(0);
        }

    private void addMovieAction() {
        String movieTitle = movieTitleTextField.getText();
        int yearReleased = Integer.parseInt(yearReleasedTextField.getText());
        int movieDuration = Integer.parseInt(movieDurationTextField.getText());
        String movieCategory = movieCategoryTextField.getText();
        String movieDirector = movieDirectorTextField.getText();
        String movieDistributionMethod = movieDistributionMethodTextField.getText();
        int registryNumber;
        int movieBudget = Integer.parseInt(movieBudgetTextField.getText());

        if (!movieTitle.isEmpty() &&
                !movieCategory.isEmpty() &&
                !movieDirector.isEmpty() &&
                !movieDistributionMethod.isEmpty()) {

            for (Movie savedMovie : moviesList) {
                if (movieTitle == savedMovie.getMovieTitle() && yearReleased == savedMovie.getYearReleased()) {
                    JOptionPane.showMessageDialog(null,
                            "The movie already exists in the database",
                            "Duplicate Movie",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }

            registryNumber = (int) Math.floor(Math.random() * (999999 - 100000 + 1) + 100000);

            Movie movie = new Movie(registryNumber,
                    movieTitle,
                    yearReleased,
                    movieDuration,
                    movieCategory,
                    movieDirector,
                    movieDistributionMethod,
                    movieBudget);

            moviesList.add(movie);

            area.append(registryNumber + "\t" +
                    movieTitle + "\t" +
                    yearReleased + "\t" +
                    movieDuration + "\t" +
                    movieCategory + "\t" +
                    movieDirector + "\t" +
                    movieDistributionMethod + "\t" +
                    movieBudget);
            area.append("\n");

        } else {
            JOptionPane.showMessageDialog(null,
                    "The movie is incomplete",
                    "Not enough details",
                    JOptionPane.WARNING_MESSAGE);
        }
    }



    private void saveToFileAction() {
        String data = area.getText();

        if (data.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Nothing to save",
                    "Save Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("movies.txt"));
                writer.write(data);
                writer.close();

                JOptionPane.showMessageDialog(
                        null,
                        "Data succesfully saved",
                        "Save completed",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                System.err.println(e);
            }

        }
    }

    private void aboutAction() {

    }

}
