import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

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

  private JTable table = new JTable();
  
  MainFrame() {
    this.setTable();
    this.setComponents();
    this.setMainPanel();
    this.setPanels();
    this.setFrame();
  }

  private void setFrame() {
    this.setTitle("App");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 550);
    this.setVisible(true);
  }

  private void setMainPanel() {
    mainPanel.setBackground(Color.BLUE);

    mainPanel.setLayout(
      new BorderLayout()
    );

    //which borderlayout position: WHAT, WHERE
    mainPanel.add(northPanel, BorderLayout.NORTH);
    mainPanel.add(eastPanel, BorderLayout.EAST);
    mainPanel.add(southPanel, BorderLayout.SOUTH);
    mainPanel.add(westPanel, BorderLayout.WEST);
    mainPanel.add(centerPanel, BorderLayout.CENTER);
    this.add(mainPanel);

  }

  private void setPanels() {
    northPanel.setBackground(Color.CYAN);
    eastPanel.setBackground(Color.GREEN);
    southPanel.setBackground(Color.RED);
    westPanel.setBackground(Color.MAGENTA);
    centerPanel.setBackground(Color.ORANGE);

    //gridlayout settings for window object
    this.setLayout(
      new GridLayout(1, 1)
    );

    southPanel.setLayout(
      new FlowLayout(FlowLayout.RIGHT)
    );

    northPanel.setSize(400, 40);
    eastPanel.setSize(40, 320);
    southPanel.setSize(400, 40);
    westPanel.setSize(40, 320);


  }

  private void setComponents() {
    northLabel.setText("Eredeti szöveg");

    textButton = new JButton("Csere");
    exitButton = new JButton("Kilépés");

    northPanel.add(northLabel);

    southPanel.add(textButton);
    southPanel.add(exitButton);
    // centerPanel.add(valami tablet)
  }

  private void setTable() {

    JScrollPane tablePane = new JScrollPane(table);

    centerPanel.add(tablePane);

  }
  // getter
  public JButton getExitButton() {
    return exitButton;
  }

  // getter
  public JButton getTextButton() {
    return textButton;
  }

  //getter 
  public JTable getTable() {
    return table;
  }

  // setter
  public void setNorthLabel(String text) {
    northLabel.setText(text);
  }
}