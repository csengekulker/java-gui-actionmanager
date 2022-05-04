import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller implements ActionListener{

  private MainFrame mf;

  Controller() {

    addActionEvents();
    start();
  }

  private void addActionEvents() {
    mf.getExitButton().addActionListener(this);
  }

  private void start() {
    mf = new MainFrame();

  }

  private void exit() {
    System.exit(0);
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if ( event.getSource() == mf.getExitButton()) {
      exit();
    }
  }
}
