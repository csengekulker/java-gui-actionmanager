import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MainFrame extends JFrame {

  private JPanel mainPanel = new JPanel();
  private JPanel northPanel = new JPanel();
  private JPanel eastPanel = new JPanel();
  private JPanel southPanel = new JPanel();
  private JPanel westPanel = new JPanel();
  private JPanel centerPanel = new JPanel();

  private JLabel northLabel  = new JLabel();
  private JButton exitButton;
  private JButton textButton;
  
  MainFrame() {
    this.setComponents();
    this.setPanels();
    this.setFrame();
  }

  private void setFrame() {
    this.setTitle("App");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 400);
    this.setVisible(true);
  }

  private void setPanels() {
    mainPanel.setBackground(Color.BLUE);
    northPanel.setBackground(Color.CYAN);
    eastPanel.setBackground(Color.GREEN);
    southPanel.setBackground(Color.RED);
    westPanel.setBackground(Color.MAGENTA);
    centerPanel.setBackground(Color.ORANGE);

    //gridlayout settings for window object
    this.setLayout(
      new GridLayout(1, 1)
    );

    mainPanel.setLayout(
      new BorderLayout()
    );

    southPanel.setLayout(
      new FlowLayout(FlowLayout.RIGHT)
    );

    northPanel.setSize(400, 40);
    eastPanel.setSize(40, 320);
    southPanel.setSize(400, 40);
    westPanel.setSize(40, 320);

    //which borderlayout position: WHAT, WHERE
    mainPanel.add(northPanel, BorderLayout.NORTH);
    mainPanel.add(eastPanel, BorderLayout.EAST);
    mainPanel.add(southPanel, BorderLayout.SOUTH);
    mainPanel.add(westPanel, BorderLayout.WEST);
    mainPanel.add(centerPanel, BorderLayout.CENTER);
    this.add(mainPanel);
  }

  private void setComponents() {
    northLabel.setText("Eredeti szöveg");

    textButton = new JButton("Csere");
    exitButton = new JButton("Kilépés");

    northPanel.add(northLabel);

    southPanel.add(textButton);
    southPanel.add(exitButton);
  }

    // // getter
    // public JButton getExitButton () {
    //   return exitButton;
    // }
  
    // // getter
    // public JButton getTextButton () {
    //   return textButton;
    // }
  
    // // setter
    // public void setNorthLabel (String text) {
    //   northLabel.setText(text);
    // }
}