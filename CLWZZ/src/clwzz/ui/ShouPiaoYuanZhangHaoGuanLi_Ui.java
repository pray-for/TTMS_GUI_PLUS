package clwzz.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ShouPiaoYuanZhangHaoGuanLi_Ui {
	
	private DefaultTableModel tableModel_ShouPiaoYuan;
	private JTable jTable_shoupiaoyuan;
	private JTextField jTextField_xinging;
	private JTextField jTextField_zhanghao;
	private JTextField jTextField_mima;
	private JTextField jTextField_gongzi;
	private JTextField jTextField_ruzhishijian;
	private JTextField jTextField_jiegushijian;
	private JTextField jTextField_shoupiaoshu;
	private JTextField jTextField_qingjiashijain;
	private JTextField jTextField_yigongzuuotianshul;

	public JPanel ShouPiaoYuanZhangHaoGuanLi(){
		
		String[] biaotou = {"����","�˺�","����","����/��","��Ʊ����/��",
				"�������","��Ӷ����","�������","��������"};
		Object[][] chengyuan = {
				{"����","ZTSGDSB","123456",250,196,0,"2016��3��4��","����",22},
				{"����","WJSGDSB","123456",240,190,10,"2015��8��9��","����",242},
				{"�ܽ�","ZJSGDSB","123456",220,296,8,"2011��3��24��","����",222}
				};
		
		JPanel jPanel = ShouPiaoYuan(biaotou, chengyuan);
		return jPanel;
	}
	
	public JPanel ShouPiaoYuan(String[] biaotou,Object[][] chengyuan){
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.orange);
		
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 5, 0, 5);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel("��ƱԱ��Ϣ");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_shoupiaoyuan = ZhiBiao_ShouPiaoYuan(biaotou,chengyuan);
		jTable_shoupiaoyuan.setBackground(Color.magenta);
		jTable_shoupiaoyuan.addMouseListener(new MouseAdapter() {//�����ӵ���¼�

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				int select1 = jTable_shoupiaoyuan.getSelectedRow();  	//��ȡ��ѡ�е���
				Object oa = tableModel_ShouPiaoYuan.getValueAt(select1, 0);
				Object ob = tableModel_ShouPiaoYuan.getValueAt(select1, 1);
				Object oc = tableModel_ShouPiaoYuan.getValueAt(select1, 2);
				Object od = tableModel_ShouPiaoYuan.getValueAt(select1, 3);
				Object oe = tableModel_ShouPiaoYuan.getValueAt(select1, 4);
				Object of = tableModel_ShouPiaoYuan.getValueAt(select1, 5);
				Object og = tableModel_ShouPiaoYuan.getValueAt(select1, 6);
				Object oh = tableModel_ShouPiaoYuan.getValueAt(select1, 7);
				Object oi = tableModel_ShouPiaoYuan.getValueAt(select1, 8);
				
				jTextField_xinging.setText(oa.toString());
				jTextField_zhanghao.setText(ob.toString());
				jTextField_mima.setText(oc.toString());
				jTextField_gongzi.setText(od.toString());
				jTextField_shoupiaoshu.setText(oe.toString());
				jTextField_qingjiashijain.setText(of.toString());
				jTextField_ruzhishijian.setText(og.toString());
				jTextField_jiegushijian.setText(oh.toString());
				jTextField_yigongzuuotianshul.setText(oi.toString());
				
			}	
			
		});
		
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 120;
		gridBagConstraints.weighty = 100;
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(jTable_shoupiaoyuan);
		jScrollPane.setBackground(Color.orange);
		jPanel.add(jScrollPane, gridBagConstraints);
		
		
		JPanel jPanel5 = new JPanel();
		jPanel5.setBackground(Color.orange);
		
		jPanel5.setLayout(new GridLayout(4,0));
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new FlowLayout());
		
		jPanel2.add(new JLabel("����:"));
		jTextField_xinging = new JTextField(10);
		jPanel2.add(jTextField_xinging);
		
		jPanel2.add(new JLabel("�˺�:"));
		jTextField_zhanghao = new JTextField(10);
		jPanel2.add(jTextField_zhanghao);
		
		jPanel2.add(new JLabel("����:"));
		jTextField_mima = new JTextField(10);
		jPanel2.add(jTextField_mima);
		
		JPanel jPanel21 = new JPanel();
		jPanel21.setLayout(new FlowLayout());
		
		jPanel21.add(new JLabel("����/��:"));
		jTextField_gongzi = new JTextField(10);
		jPanel21.add(jTextField_gongzi);
		
		jPanel21.add(new JLabel("��Ʊ����/��:"));
		jTextField_shoupiaoshu = new JTextField(10);
		jPanel21.add(jTextField_shoupiaoshu);
		
		jPanel21.add(new JLabel("�������/��:"));
		jTextField_qingjiashijain = new JTextField(10);
		jPanel21.add(jTextField_qingjiashijain);
		
		JPanel jPanel22 = new JPanel();
		jPanel2.setLayout(new FlowLayout());
		
		jPanel22.add(new JLabel("��Ӷ����:"));
		jTextField_ruzhishijian = new JTextField(10);
		jPanel22.add(jTextField_ruzhishijian);
		
		jPanel22.add(new JLabel("�������:"));
		jTextField_jiegushijian = new JTextField(10);
		jPanel22.add(jTextField_jiegushijian);
		
		jPanel22.add(new JLabel("�ѹ�������"));
		jTextField_yigongzuuotianshul = new JTextField(10);
		jPanel22.add(jTextField_yigongzuuotianshul);
		
		
		
		JPanel jPanel3 = new JPanel();
		jPanel3.setLayout(new FlowLayout());
		
		final JButton jButton_shoupiaoyuan = new JButton("�����ƱԱ");
		jButton_shoupiaoyuan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String[] ra = {jTextField_xinging.getText(),
						jTextField_zhanghao.getText(),
						jTextField_mima.getText(),
						jTextField_gongzi.getText(),
						jTextField_shoupiaoshu.getText(),
						jTextField_qingjiashijain.getText(),
						jTextField_ruzhishijian.getText(),
						jTextField_jiegushijian.getText(),
						jTextField_yigongzuuotianshul.getText()};
						
				tableModel_ShouPiaoYuan.addRow(ra);
				
			}
		});
		
		final JButton jButton_shoupiaoyuan_Xiuagi = new JButton("��ƱԱ��Ϣ�޸�");
		jButton_shoupiaoyuan_Xiuagi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int setect = jTable_shoupiaoyuan.getSelectedRow();//�жϱ�ѡ�е�ĳ��
				if(setect != -1){
					
					tableModel_ShouPiaoYuan.setValueAt(jTextField_xinging.getText(),
							setect, 0);
					tableModel_ShouPiaoYuan.setValueAt(jTextField_zhanghao.getText(),
							setect, 0);
					tableModel_ShouPiaoYuan.setValueAt(jTextField_mima.getText(),
							setect, 0);
					tableModel_ShouPiaoYuan.setValueAt(jTextField_gongzi.getText(),
							setect, 0);
					tableModel_ShouPiaoYuan.setValueAt(jTextField_shoupiaoshu.getText(),
							setect, 0);
					tableModel_ShouPiaoYuan.setValueAt(jTextField_qingjiashijain.getText(),
							setect, 0);
					tableModel_ShouPiaoYuan.setValueAt(jTextField_ruzhishijian.getText(),
							setect, 0);
					tableModel_ShouPiaoYuan.setValueAt(jTextField_jiegushijian.getText(),
							setect, 0);
					tableModel_ShouPiaoYuan.setValueAt(jTextField_yigongzuuotianshul.getText(),
							setect, 0);
				}
				
			}
		});
		
		final JButton jButton_shoupiao_shanchu = new JButton("ɾ����ƱԱ");
		jButton_shoupiao_shanchu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int select = jTable_shoupiaoyuan.getSelectedRow();
				if(select != -1){
					tableModel_ShouPiaoYuan.removeRow(select);
				}
				
			}
		});
		
		jPanel3.add(jButton_shoupiaoyuan);
		jPanel3.add(jButton_shoupiaoyuan_Xiuagi);
		jPanel3.add(jButton_shoupiao_shanchu);
		
		jPanel5.add(jPanel2);
		jPanel5.add(jPanel21);
		jPanel5.add(jPanel22);
		jPanel5.add(jPanel3);
		
		gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.weightx = 10;
		gridBagConstraints.weighty = 10;
        jPanel.add(jPanel5, gridBagConstraints);
		
		return jPanel;
	}
	
	public JTable ZhiBiao_ShouPiaoYuan(String[] biaotou,Object[][] chengyuan){
		
		tableModel_ShouPiaoYuan = new DefaultTableModel(chengyuan, biaotou);
		JTable jTable1 = new JTable(tableModel_ShouPiaoYuan);
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
