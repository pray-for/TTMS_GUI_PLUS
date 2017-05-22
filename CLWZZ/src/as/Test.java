package as;

import java.awt.BorderLayout;  
import java.awt.Checkbox;  
import java.awt.Color;  
import java.awt.Component;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import javax.swing.AbstractCellEditor;  
import javax.swing.Icon;  
import javax.swing.ImageIcon;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JProgressBar;  
import javax.swing.JScrollPane;  
import javax.swing.JTable;  
import javax.swing.table.AbstractTableModel;  
import javax.swing.table.TableCellEditor;  
import javax.swing.table.TableCellRenderer;  
import javax.swing.table.TableColumnModel;  
//���Դ���  
public class Test extends JFrame {  
    private JTable table;  
    private MyTableModel model;  
    public Test(){  
        init();  
    }  
    //��ʼ������  
    private void init() {  
        this.setSize(600, 400);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setTitle("�����Զ���JTable");  
        //�����Զ�������ģ��  
        model=new MyTableModel();  
        table=new JTable(model);  
        //���뵥Ԫ��Ԫ�أ������Զ���Ԫ��  
        ButtonColumn progressBarColumn = new ButtonColumn(table, 3);  
        ButtonColumn buttonColumn = new ButtonColumn(table, 4);  
        table.setRowHeight(30);  
          
        JScrollPane jsp =new JScrollPane(table);  
        this.getContentPane().add(jsp,BorderLayout.CENTER);  
        this.setVisible(true);  
    }  
    public static void main(String[] args) {  
        new Test();  
    }  
}  
//�Զ�����ģ��  
class MyTableModel extends AbstractTableModel{  
    //��Ԫ��Ԫ������  
    private Class []cellType={String.class,Icon.class,JButton.class,JButton.class};  
    //��ͷ  
    private String title[]={"���","ͼ��","�Ƿ�ѡ��","����","����"};  
    //ģ������  
    private Object data[][]={{"1",new ImageIcon("e://image/3.jpg"),new JButton("rt2"),0,new JButton("start1")},  
            {"2",new ImageIcon("e://image/1.jpg"),new JButton("rt2"),60,new JButton("start2")},  
            {"3",new ImageIcon("e://image/4.png"),new JButton("rt2"),25,new JButton("start3")}  
            };  
    public MyTableModel(){  
    }  
    @Override  
    public Class<?> getColumnClass(int arg0) {  
        // TODO Auto-generated method stub  
        return cellType[arg0];  
    }  
    @Override  
    public String getColumnName(int arg0) {  
        // TODO Auto-generated method stub  
        return title[arg0];  
    }  
    @Override  
    public int getColumnCount() {  
        // TODO Auto-generated method stub  
        return title.length;  
    }  
    @Override  
    public int getRowCount() {  
        // TODO Auto-generated method stub  
        return data.length;  
    }  
    @Override  
    public Object getValueAt(int r, int c) {  
        // TODO Auto-generated method stub  
        return data[r][c];  
    }  
      //��дisCellEditable����  
    public boolean isCellEditable(int r,int c)  
    {  
        return true;  
    }  
    //��дsetValueAt����  
    public void setValueAt(Object value,int r,int c)  
    {  
        data[r][c]=value;  
        this.fireTableCellUpdated(r,c);  
    }  
}  
  
//�Զ���JButton�У���ťÿ���һ�Σ���������+5  
class ButtonColumn extends AbstractCellEditor implements TableCellEditor, TableCellRenderer ,ActionListener{  
    //��ť������״̬  
    private JButton rb,eb;  
    private int row;   
    private JTable table;  
    private String text="��ʼ";  
    public ButtonColumn(){}  
    public ButtonColumn(JTable table, int column)  
    {  
        super();  
        this.table = table;  
        rb = new JButton("��ʼ");  
        eb = new JButton("��ʼ");  
        eb.setFocusPainted( false );  
        eb.addActionListener( this );  
        //���øõ�Ԫ����Ⱦ�ͱ༭��ʽ  
        TableColumnModel columnModel = table.getColumnModel();  
        columnModel.getColumn(column).setCellRenderer( this );  
        columnModel.getColumn(column).setCellEditor( this );  
    }  
    @Override  
    public Object getCellEditorValue() {  
        // TODO Auto-generated method stub  
        return null;  
    }  
    //����������  
    @Override  
    public void actionPerformed(ActionEvent arg0) {  
        int v=Integer.parseInt(table.getValueAt(row, 3).toString());  
        System.out.println("row :"+row+" bar value :"+table.getValueAt(row, 3));  
        //���½����� �е�ֵ  
        table.setValueAt(v+5, row, 3);  
    }  
    @Override  
    public Component getTableCellRendererComponent(JTable arg0, Object value,  
            boolean arg2, boolean arg3, int arg4, int arg5) {  
        rb.setText(text);  
        return rb;  
    }  
    @Override  
    public Component getTableCellEditorComponent(JTable table, Object value,  
            boolean isSelected, int row, int column) {  
        eb.setText( text );  
        //�༭�У��к�  
        this.row=row;  
        return eb;  
    }   
}  
//�Զ���ProgressBar �У�ʵ�ַ�ʽ�밴ť����  
class ProgressBarColumn extends AbstractCellEditor implements TableCellEditor, TableCellRenderer{  
    JProgressBar rjsb,ejsb;;  
    JTable table;  
    private int row;   
    public  ProgressBarColumn(JTable table,int column){  
        super();  
        this.table = table;  
        rjsb=new JProgressBar();  
        rjsb.setMaximum(100);  
        rjsb.setBackground(Color.BLUE);  
        rjsb.setForeground(Color.LIGHT_GRAY);  
        rjsb.setStringPainted(true);  
        rjsb.setBorderPainted(false);  
        ejsb=new JProgressBar();  
        ejsb.setMaximum(100);  
        ejsb.setBackground(Color.DARK_GRAY);  
        ejsb.setForeground(Color.LIGHT_GRAY);  
        TableColumnModel columnModel = table.getColumnModel();  
        columnModel.getColumn(column).setCellRenderer( this );  
        columnModel.getColumn(column).setCellEditor( this );  
    }  
    @Override  
    public Component getTableCellRendererComponent(JTable arg0, Object value,  
            boolean arg2, boolean arg3, int arg4, int arg5) {  
        // TODO Auto-generated method stub  
        rjsb.setValue(Integer.parseInt(value.toString()));  
        return rjsb;  
    }  
    @Override  
    public Object getCellEditorValue() {  
        // TODO Auto-generated method stub  
        return null;  
    }  
    @Override  
    public Component getTableCellEditorComponent(JTable table, Object value,  
            boolean isSelected, int row, int column) {  
        // TODO Auto-generated method stub  
        this.row = row;    
        ejsb.setValue(ejsb.getValue()+5);  
        return ejsb;  
    }  
} 