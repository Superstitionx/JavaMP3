package project;

import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel{
	String[] columnName = {};
	String[] data = {};
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 4;
	}
	/*@Override
	public String getColumnName(int arg0) {
		return 
	}*/
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return "ddd";
	}

}
