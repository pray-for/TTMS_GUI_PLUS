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
		
		String[] strings = {"��Ӱ��","������Ʊ��","����Ʊ��"};
		Object[][] objects = {{"�������",39,500},{"������",20,100},
				{"�����ߺŰ�����",30,429},{"�����������������",40,221},
				{"Ů�����氮��ʽ",39,223},{"��ӥ����",38,443},
				{"��Ұ����",23,110},{"ԯ��ն��",120,998},
				{"����״Ԫ",87,865},{"�޷�",67,987},{"�ŷ�",87,657},
				{"ա����",67,879}};
		
		String[] strings1 = {"��ӳ������","������Ʊ","����Ʊ"};
		Object[][] objects1 = {{"1�ŷ�ӳ��",435,1996},{"2�ŷ�ӳ��",234,897},
				{"3�ŷ�ӳ��",354,1864},{"4�ŷ�ӳ��",345,9988}};
		
		String[] strings2 = {"��ƱԱ����","������Ʊ","����Ʊ"};
		Object[][] objects2 = {{"����",196,2500},{"����",76,987},{"���",54,1122}};
		
		jTabbedPane_PiaoWuGuanLi.add("TODAY��Ʊ", JinTianSHouPiao(strings,objects));
		jTabbedPane_PiaoWuGuanLi.add("Ӱ����Ʊ",YingTingSHouPaio(strings1,objects1));
		jTabbedPane_PiaoWuGuanLi.add("��ƱԱ��Ʊ", ShouPiaoYuanShouPaio(strings2,objects2));
		
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
		
		JLabel jLabel = new JLabel("������Ʊͳ��");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_jintian = ZhiBiao_jintian(biaotou,chengyuan);
		jTable_jintian.setBackground(Color.pink);
		jTable_jintian.addMouseListener(new MouseAdapter() {//�����ӵ���¼�

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
		
		JLabel jLabel = new JLabel("Ӱ����Ʊͳ��");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_yingitng = ZhiBiao_yingting(biaotou,chengyuan);
		jTable_yingitng.setBackground(Color.pink);
		jTable_yingitng.addMouseListener(new MouseAdapter() {//�����ӵ���¼�

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
		
		JLabel jLabel = new JLabel("��ƱԱ��Ʊͳ��");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_shoupiaoyuan = ZhiBiao_shoupiaoyuan(biaotou,chengyuan);
		jTable_shoupiaoyuan.setBackground(Color.pink);
		jTable_shoupiaoyuan.addMouseListener(new MouseAdapter() {//�����ӵ���¼�

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
		
		//���ñ��Ϊ��ѡģʽ
		jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		DefaultTableCellRenderer   r   =   new   DefaultTableCellRenderer();   
		r.setHorizontalAlignment(JLabel.CENTER);   
		jTable1.setDefaultRenderer(Object.class,   r);
		
		//���ñ�ͷ����
		JTableHeader tbh = jTable1.getTableHeader();
		DefaultTableCellRenderer  renderer = (DefaultTableCellRenderer)tbh.getDefaultRenderer();
		renderer.setHorizontalAlignment(SwingConstants.CENTER);
		
		//����ѡ�������ɫ
		jTable1.setSelectionBackground(Color.green);
		
		//����Χ����ɫ
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
	
	//���ñ��Ϊ��ѡģʽ
	jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	
	DefaultTableCellRenderer   r   =   new   DefaultTableCellRenderer();   
	r.setHorizontalAlignment(JLabel.CENTER);   
	jTable1.setDefaultRenderer(Object.class,   r);
	
	//���ñ�ͷ����
	JTableHeader tbh = jTable1.getTableHeader();
	DefaultTableCellRenderer  renderer = (DefaultTableCellRenderer)tbh.getDefaultRenderer();
	renderer.setHorizontalAlignment(SwingConstants.CENTER);
	
	//����ѡ�������ɫ
	jTable1.setSelectionBackground(Color.green);
	
	//����Χ����ɫ
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
	
	//���ñ��Ϊ��ѡģʽ
	jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	
	DefaultTableCellRenderer   r   =   new   DefaultTableCellRenderer();   
	r.setHorizontalAlignment(JLabel.CENTER);   
	jTable1.setDefaultRenderer(Object.class,   r);
	
	//���ñ�ͷ����
	JTableHeader tbh = jTable1.getTableHeader();
	DefaultTableCellRenderer  renderer = (DefaultTableCellRenderer)tbh.getDefaultRenderer();
	renderer.setHorizontalAlignment(SwingConstants.CENTER);
	
	//����ѡ�������ɫ
	jTable1.setSelectionBackground(Color.green);
	
	//����Χ����ɫ
	Container c = jTable1.getParent();
	if(c instanceof JViewport){
	   JViewport jp = (JViewport)c;
	   jp.setBackground(new Color(100, 123, 313));
	}
	
	return jTable1;
}

	

}

