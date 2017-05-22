package clwzz.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class PiaoWuGuanLi_Ui {
	
	private DefaultTableModel tableModel_jintina;
	private JTable jTable_jintian;
	
	private DefaultTableModel tableModel_yingting;
	private JTable jTable_yingitng;
	
	private DefaultTableModel tableModel_shoupiaoyuan;
	private JTable jTable_shoupiaoyuan;

	public JTabbedPane PiaoWuGuanLi(){
		JTabbedPane jTabbedPane_PiaoWuGuanLi = new JTabbedPane();
		
		String[] strings = {"电影名","今天售票数","总售票数"};
		Object[][] objects = {{"三娘教子",39,500},{"疯狂动物城",20,100},
				{"长江七号爱地球",30,429},{"波普先生和他的企鹅",40,221},
				{"女汉子真爱公式",39,223},{"飞鹰艾迪",38,443},
				{"荒野猎人",23,110},{"辕门斩子",120,998},
				{"屠夫状元",87,865},{"哭坟",67,987},{"放饭",87,657},
				{"铡美案",67,879}};
		
		String[] strings1 = {"放映厅名称","今天售票","总售票"};
		Object[][] objects1 = {{"1号放映厅",435,1996},{"2号放映厅",234,897},
				{"3号放映厅",354,1864},{"4号放映厅",345,9988}};
		
		String[] strings2 = {"售票员名称","今天售票","总售票"};
		Object[][] objects2 = {{"张甜",196,2500},{"王俊",76,987},{"周婕",54,1122}};
		
		jTabbedPane_PiaoWuGuanLi.add("TODAY售票", JinTianSHouPiao(strings,objects));
		jTabbedPane_PiaoWuGuanLi.add("影厅售票",YingTingSHouPaio(strings1,objects1));
		jTabbedPane_PiaoWuGuanLi.add("售票员售票", ShouPiaoYuanShouPaio(strings2,objects2));
		
		jTabbedPane_PiaoWuGuanLi.setBackground(Color.pink);
		jTabbedPane_PiaoWuGuanLi.setTabPlacement(JTabbedPane.TOP);
		
		return jTabbedPane_PiaoWuGuanLi;
	}
	
	public JPanel JinTianSHouPiao(String[] biaotou,Object[][] chengyuan){
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.orange);
		
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 5, 0, 5);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel("今天售票统计");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_jintian = ZhiBiao_jintian(biaotou,chengyuan);
		jTable_jintian.setBackground(Color.pink);
		jTable_jintian.addMouseListener(new MouseAdapter() {//表格添加点击事件

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
			}	
			
		});
		
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 120;
		gridBagConstraints.weighty = 100;
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(jTable_jintian);
		jScrollPane.setBackground(Color.yellow);
		jPanel.add(jScrollPane, gridBagConstraints);
		
		
		JPanel jPanel5 = new JPanel();
		jPanel5.setBackground(Color.orange);
		
		gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.weightx = 10;
		gridBagConstraints.weighty = 10;
        jPanel.add(jPanel5, gridBagConstraints);
		
		return jPanel;
	}
	
	public JPanel YingTingSHouPaio(String[] biaotou,Object[][] chengyuan){
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.orange);
		
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 5, 0, 5);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel("影厅售票统计");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_yingitng = ZhiBiao_yingting(biaotou,chengyuan);
		jTable_yingitng.setBackground(Color.pink);
		jTable_yingitng.addMouseListener(new MouseAdapter() {//表格添加点击事件

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
			}	
			
		});
		
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 120;
		gridBagConstraints.weighty = 100;
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(jTable_yingitng);
		jScrollPane.setBackground(Color.yellow);
		jPanel.add(jScrollPane, gridBagConstraints);
		
		
		JPanel jPanel5 = new JPanel();
		jPanel5.setBackground(Color.orange);
		
		gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.weightx = 10;
		gridBagConstraints.weighty = 10;
        jPanel.add(jPanel5, gridBagConstraints);
		
		return jPanel;
	}
	
	
	public JPanel ShouPiaoYuanShouPaio(String[] biaotou,Object[][] chengyuan){
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.orange);
		
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 5, 0, 5);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel("售票员售票统计");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_shoupiaoyuan = ZhiBiao_shoupiaoyuan(biaotou,chengyuan);
		jTable_shoupiaoyuan.setBackground(Color.pink);
		jTable_shoupiaoyuan.addMouseListener(new MouseAdapter() {//表格添加点击事件

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
			}	
			
		});
		
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 120;
		gridBagConstraints.weighty = 100;
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(jTable_shoupiaoyuan);
		jScrollPane.setBackground(Color.yellow);
		jPanel.add(jScrollPane, gridBagConstraints);
		
		
		JPanel jPanel5 = new JPanel();
		jPanel5.setBackground(Color.orange);
		
		gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.weightx = 10;
		gridBagConstraints.weighty = 10;
        jPanel.add(jPanel5, gridBagConstraints);
		
		return jPanel;
	}
	
public JTable ZhiBiao_jintian(String[] biaotou,Object[][] chengyuan){
		
		tableModel_jintina = new DefaultTableModel(chengyuan, biaotou);
		JTable jTable1 = new JTable(tableModel_jintina);
		JTableHeader header = new JTableHeader();
		header = jTable1.getTableHeader();
		header.setBackground(Color.blue);
		jTable1.setRowHeight(30);
		jTable1.setGridColor(Color.red);
		
		//设置表格为单选模式
		jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		DefaultTableCellRenderer   r   =   new   DefaultTableCellRenderer();   
		r.setHorizontalAlignment(JLabel.CENTER);   
		jTable1.setDefaultRenderer(Object.class,   r);
		
		//设置表头居中
		JTableHeader tbh = jTable1.getTableHeader();
		DefaultTableCellRenderer  renderer = (DefaultTableCellRenderer)tbh.getDefaultRenderer();
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		
		//设置选定后的颜色
		jTable1.setSelectionBackground(Color.green);
		
		//表周围的颜色
		Container c = jTable1.getParent();
		if(c instanceof JViewport){
		   JViewport jp = (JViewport)c;
		   jp.setBackground(new Color(100, 123, 313));
		}
		
		return jTable1;
	}

public JTable ZhiBiao_shoupiaoyuan(String[] biaotou,Object[][] chengyuan){
	
	tableModel_shoupiaoyuan = new DefaultTableModel(chengyuan, biaotou);
	JTable jTable1 = new JTable(tableModel_shoupiaoyuan);
	JTableHeader header = new JTableHeader();
	header = jTable1.getTableHeader();
	header.setBackground(Color.blue);
	jTable1.setRowHeight(30);
	jTable1.setGridColor(Color.red);
	
	//设置表格为单选模式
	jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	
	DefaultTableCellRenderer   r   =   new   DefaultTableCellRenderer();   
	r.setHorizontalAlignment(JLabel.CENTER);   
	jTable1.setDefaultRenderer(Object.class,   r);
	
	//设置表头居中
	JTableHeader tbh = jTable1.getTableHeader();
	DefaultTableCellRenderer  renderer = (DefaultTableCellRenderer)tbh.getDefaultRenderer();
	renderer.setHorizontalAlignment(SwingConstants.CENTER);
	
	//设置选定后的颜色
	jTable1.setSelectionBackground(Color.green);
	
	//表周围的颜色
	Container c = jTable1.getParent();
	if(c instanceof JViewport){
	   JViewport jp = (JViewport)c;
	   jp.setBackground(new Color(100, 123, 313));
	}
	
	return jTable1;
	}

public JTable ZhiBiao_yingting(String[] biaotou,Object[][] chengyuan){
	
	tableModel_yingting = new DefaultTableModel(chengyuan, biaotou);
	JTable jTable1 = new JTable(tableModel_yingting);
	JTableHeader header = new JTableHeader();
	header = jTable1.getTableHeader();
	header.setBackground(Color.blue);
	jTable1.setRowHeight(30);
	jTable1.setGridColor(Color.red);
	
	//设置表格为单选模式
	jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	
	DefaultTableCellRenderer   r   =   new   DefaultTableCellRenderer();   
	r.setHorizontalAlignment(JLabel.CENTER);   
	jTable1.setDefaultRenderer(Object.class,   r);
	
	//设置表头居中
	JTableHeader tbh = jTable1.getTableHeader();
	DefaultTableCellRenderer  renderer = (DefaultTableCellRenderer)tbh.getDefaultRenderer();
	renderer.setHorizontalAlignment(SwingConstants.CENTER);
	
	//设置选定后的颜色
	jTable1.setSelectionBackground(Color.green);
	
	//表周围的颜色
	Container c = jTable1.getParent();
	if(c instanceof JViewport){
	   JViewport jp = (JViewport)c;
	   jp.setBackground(new Color(100, 123, 313));
	}
	
	return jTable1;
}

	

}

