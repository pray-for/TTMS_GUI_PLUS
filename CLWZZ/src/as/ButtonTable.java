package as;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.*;

public class ButtonTable extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTable table = null;
	private DefaultTableModel model=null;
	private JScrollPane js=null ;
	public ButtonTable(){
		model = new DefaultTableModel(3,3);
		table = new JTable(model);
		table.getColumnModel().getColumn(1).setCellEditor(new MyRender());//ÉèÖÃ±à¼­Æ÷
		table.getColumnModel().getColumn(1).setCellRenderer(new MyRender() );
		js = new JScrollPane(table);

		this.add(js);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(399, 300);
		this.setLocationRelativeTo(null);
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonTable();
	}

}

//äÖÈ¾ Æ÷  ±à¼­Æ÷
class MyRender extends AbstractCellEditor implements TableCellRenderer,ActionListener, TableCellEditor{

	private static final long serialVersionUID = 1L;
	private JButton button =null;
	private int tag = 0;
	public MyRender(){
		button = new JButton("È·¶¨²»£¿");
		button.addActionListener(this);
	}

@Override
	public Object getCellEditorValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		// TODO Auto-generated method stub
		this.tag = row;
		return button;
	}

@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(tag);
		
	}

@Override
	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {
		// TODO Auto-generated method stub
		return button;
	}
	
}