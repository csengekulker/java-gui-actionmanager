import java.util.Vector;

public class TableModel {

  TableModel() {
    this.getTableRowData();
    this.getTableHeaderData();
  }

  public Vector<String> getTableHeaderData() {
    Vector<String> colNames = new Vector<>();

    colNames.add("Első");
    colNames.add("Második");
    colNames.add("Harmadik");

    return colNames;

  }

  public Vector<Vector<String>> getTableRowData() {
    Vector<Vector<String>> rows = new Vector<>(); 
    Vector<String> rowItems = new Vector<>();

    //row1
    rowItems.add("row1-col1");
    rowItems.add("row1-col2");
    rowItems.add("row1-col3");

    rows.add(rowItems);

    //row2

    rowItems = new Vector<>();

    rowItems.add("row2-col1");
    rowItems.add("row2-col2");
    rowItems.add("row2-col3");

    rows.add(rowItems);

    //row3

    rowItems = new Vector<>();

    rowItems.add("row3-col1");
    rowItems.add("row3-col2");
    rowItems.add("row3-col3");

    rows.add(rowItems);

    return rows;

  }
}
