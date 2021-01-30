import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class MiniSearchEngine {
	
	String[] movies = {"Us",
			"Black Panther",
			"Crazy Rich Asians",
			"Lady Bird",
			"Moonlight",
			"Gravity",
			"Argo",
			"Toy Story 3",
			"Up",
			"The Dark Knight",
			"It",
			"Ratatouille",
			"Titanic",
			"BlacKKKlansman",
			"A Star is Born",
			"A Quiet Place",
			"Wonder Woman",
			"The Hangover",
			"Coco",
			"Spotlight",
			"Mad Max: Fury Road",
			"Get Out",
			"Citizen Kane",
			"The Secret Life of Pets",
			"The Godfather",
			"Inception"};

    public static void main(String[] args) {
        new MiniSearchEngine();
    }

    public MiniSearchEngine() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                JPanel form = new JPanel(new GridBagLayout());

                JTextField field = new JTextField(10);
                JButton button = new JButton("Search");
                JLabel results = new JLabel("results");
                JScrollPane scrPane = new JScrollPane(results);
                scrPane.setPreferredSize(new Dimension(300, 40));

                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.WEST;

                form.add(field, gbc);
                gbc.gridy++;

                gbc.gridx++;
                gbc.gridy = 0;
                form.add(button, gbc);
                gbc.gridx++;
                form.add(scrPane, gbc);
                
                button.addActionListener(new ActionListener()
                {
                  public void actionPerformed(ActionEvent e)
                  {
                	String text = field.getText();
                	String resultsText = "";
                	for(int i = 0; i < movies.length; i++) {
                		if(movies[i].toLowerCase().contains(text.toLowerCase())) {
                			resultsText += movies[i] + " ";
                		}
                	}
                    results.setText(resultsText);
                  }
                });
                
                JFrame frame = new JFrame("Mini Search Engine");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(form);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
                
            }
        });
    }

}