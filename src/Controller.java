import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class Controller implements ActionListener{

  private MainFrame mf;

  Controller() {

    start();
    addActionEvents();
  }

  private void addActionEvents() {
    mf.getExitButton().addActionListener(this);
    mf.getLoadTableButton().addActionListener(this);
  }

  private void setTable() {

    TableModel tm = new TableModel();
    Vector<Vector<String>> rows = tm.getTableRowData();
    Vector<String> colNames = tm.getTableHeaderData();

    DefaultTableModel tableModel = new DefaultTableModel(
      rows, colNames
    );

    mf.getTable().setModel(tableModel);

    getRowsCols();

  }

  private void setTableHeader() {
    TableModel tm = new TableModel();
    Vector<Vector<String>> rows = new Vector<>();
    Vector<String> colNames = tm.getTableHeaderData();

    DefaultTableModel tableModel = new DefaultTableModel(
      rows, colNames
    );

    mf.getTable().setModel(tableModel);

  }

  private void start() {
    mf = new MainFrame();
    setTableHeader();

    

  }

  private void exit() {
    System.exit(0);
  }

  private void getRowsCols() {
    Integer rows = mf.getTable().getRowCount();

    Integer cols = mf.getTable().getColumnCount();

    String rowsStr = rows.toString();

    String colsStr = cols.toString();

    
    mf.setNorthLabel("Sorok: " + rowsStr + " Oszlopok: " + colsStr);


  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if ( event.getSource() == mf.getExitButton()) {
      exit();
    } else if ( event.getSource() == mf.getLoadTableButton()) {
      setTable();
    }


  }
}
