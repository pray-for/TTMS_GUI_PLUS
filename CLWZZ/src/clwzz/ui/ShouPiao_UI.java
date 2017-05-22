package clwzz.ui;

import java.awt.BorderLayout;
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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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


public class ShouPiao_UI extends JFrame{

	private String path = "D:/Android Data/CLWZZ/src/iamge/";
	private JTabbedPane jTabbedPane_Main;
	private JTabbedPane jTabbedPane_DingPioa;
	private String string = "";
	
	private DefaultTableModel tableModel_renqi1;
	private JTable jTable_renqi1;
	
	private DefaultTableModel tableModel_xinpin;
	private JTable jTable_Xinpin;
	
	private DefaultTableModel tableModel_YingPian;
	private JTable jTable_YingPian;
	
	private DefaultTableModel tableModel_tuijian;
	private JTable jTable_tuijian;
	
	private JLabel jLabel_Yingming = new JLabel();
	private JLabel jLabel_leixing = new JLabel();
	private JLabel jLabel_changdi = new JLabel();
	private JLabel jLabel_shichang = new JLabel();
	private JLabel jLabel_piaojia = new JLabel();
	private JLabel jLabel_fangyingshijian = new JLabel();
	private JLabel jLabel_fangyingshijian1 = new JLabel();
	private JLabel jLabel_piaojia1 = new JLabel();
	private JLabel jLabel_shichang1 = new JLabel();
	private JLabel jLabel_Yingming1 = new JLabel();
	
	private JLabel jLabel_fangyingshijian2 = new JLabel();
	private JLabel jLabel_piaojia2 = new JLabel();
	private JLabel jLabel_shichang2 = new JLabel();
	private JLabel jLabel_Yingming2 = new JLabel();
	
	private JLabel jLabel_fangyingshijian3 = new JLabel();
	private JLabel jLabel_piaojia3 = new JLabel();
	private JLabel jLabel_shichang3 = new JLabel();
	private JLabel jLabel_Yingming3 = new JLabel();
	
	private JLabel jLabel_fangyingshijian4 = new JLabel();
	private JLabel jLabel_piaojia4 = new JLabel();
	private JLabel jLabel_shichang4 = new JLabel();
	private JLabel jLabel_Yingming4 = new JLabel();
	
	private JLabel jLabel_Yingmingbofang = new JLabel();
	
	private String zuowei ;
	private JLabel jLabel_weizhi1 = new JLabel();
	private JLabel jLabel_weizhi2 = new JLabel();
	private JLabel jLabel_weizhi3 = new JLabel();
	private JLabel jLabel_weizhi4 = new JLabel();
	
	private JButton[][] buttons1;
	private JButton[][] buttons2;
	private JButton[][] buttons3;
	private JButton[][] buttons4;
	
	
	public ShouPiao_UI(){
		this.setTitle("TODAY��Ժ����ϵͳ");
		this.setSize(800, 550);			//��С
		this.setLocationRelativeTo(null);		//������־���
		this.setDefaultCloseOperation(3);		//���ùرղ���
		this.setResizable(true);
		this.setIconImage(new ImageIcon(path+"tiele.bmp").getImage());
		
		jTabbedPane_Main = new JTabbedPane();
		
		jTabbedPane_Main.setBackground(Color.green);
		
		jTabbedPane_Main.add("ӰƬ��Ϣ", YingPianXinXi());
		jTabbedPane_Main.add("��ӳ��Ϣ", YingPiaoXiXin());
		jTabbedPane_Main.add("��Ʊ",DingPiaoXinXi());
		
		jTabbedPane_Main.setTabPlacement(JTabbedPane.LEFT);
		this.add(jTabbedPane_Main); 
		this.setVisible(true);
	}
	
	public JTabbedPane YingPianXinXi(){
		JTabbedPane jTabbedPane = new JTabbedPane();
		
		String[] strings_xinpin  = {"ӰƬ����","ӰƬ����","������","�ȼ�","ʱ��","��ʼ��ӳ����","������ӳ����"
				,"Ʊ��"};
		Object[][] objects_xinpin = {{"��Ӱʵ¼5.���Ԫ","�ֲ����","����","����",88,
			"2016��3��12��","2016��4��12��",40},
			{"������","����","�¹�","һ��",90,
				"2016��3��13��","2016��4��13��",30},
			{"�����⴫","��Цϲ��/����","����","����",120,
				"2016��3��13��","2016��4��13��",40},
			{"����","����","�й�","����",120,
				"2016��3��14��","2016��4��14��",30},
			{"�ع�","����","����","����",100,
				"2016��3��15��","2016��4��15��",40},
			{"�����ߺŰ�����","�����糡","����ڵ�","һ��",120,
				"2016��3��15��","2016��4��15��",40},
			{"����","ϲ��","����","����",120,
				"2016��3��14��","2016��4��14��",30},
			{"����2","ϲ��","����","����",119,
				"2016��3��14��","2016��4��14��",30},
			{"����3","ϲ��","����","����",120,
				"2016��3��14��","2016��4��14��",30},
			{"�ְ�ȥ�Ķ�","�龰ϲ��","�й�","һ��",90,
				"2016��3��14��","2016��4��14��",30},
			{"��Ұ���ڿ�","ϲ��","����","һ��",120,
				"2016��3��14��","2016��4��14��",40},
			{"�����������������","ϲ��","����","һ��",120,
				"2016��3��14��","2016��4��14��",30},
			{"�����⴫","��Цϲ��/����","����","����",120,
				"2016��3��13��","2016��4��13��",40},
			{"����","����","�й�","����",120,
				"2016��3��14��","2016��4��14��",30},
			{"�ع�","����","����","����",100,
				"2016��3��15��","2016��4��15��",40}};
		
		String[] strings_renqi = {"ӰƬ����","ӰƬ����","������","�ȼ�","ʱ��","��ʼ��ӳ����","������ӳ����"
				,"Ʊ��"};
		Object[][] objects_renqi = {{"������","��������ð��","����","һ��",109,
			"2016��3��20��","2016��4��20��",50},
			{"��Ұ����","ð�վ��龪�","����","һ��",156,
				"2016��3��18��","2016��4��18��",50},
			{"Ů�����氮��ʽ","ϲ�簮�����","�й�","����",93,
				"2016��3��18��","2016��4��18��",40},
			{"��ӥ����","ϲ���˶�����","Ӣ��/����","����",105,
				"2016��3��18��","2016��4��18��",40}};
		
		String[] strings_tuijian = {"ӰƬ����","ӰƬ����","������","�ȼ�","ʱ��","��ʼ��ӳ����","������ӳ����"
				,"Ʊ��"};
		Object[][] objects_tuijian = {{"������","��������ð��","����","һ��",109,
			"2016��3��20��","2016��4��20��",50},
			{"�ְ�ȥ�Ķ�","�龰ϲ��","�й�","һ��",90,
				"2016��3��14��","2016��4��14��",30},
			{"�����ߺŰ�����","�����糡","����ڵ�","һ��",120,
					"2016��3��15��","2016��4��15��",40},
			{"�����������������","ϲ��","����","һ��",120,
				"2016��3��14��","2016��4��14��",30}};
		
		jTabbedPane.add("��Ʒ����", JuMu_XinPin(strings_xinpin, objects_xinpin));
		jTabbedPane.add("��������", JuMu_Renqi(strings_renqi, objects_renqi));
		jTabbedPane.add("TODAY�Ƽ�", JuMu_Tuijian(strings_tuijian, objects_tuijian));
		
		return jTabbedPane;
	}
	
	public JPanel YingPiaoXiXin(){
		JPanel jPanel = new JPanel();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		jPanel.setLayout(gridBagLayout);
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(5,5,5,5);
		gridBagConstraints.insets = insets;
		
		JPanel jPanel2 = DianYingPIaoBoFangXinxi();
		jPanel2.setBackground(Color.green);
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		gridBagConstraints.gridx=0;
		gridBagConstraints.gridy=0;
		gridBagConstraints.weightx=100;
		gridBagConstraints.weighty=15;
		jPanel.add(jPanel2,gridBagConstraints);
		
		String[] biaotou = {"��ӳ��","ʱ��","����","ʣ��Ʊ��"};
		Object[][] chengyuan = {{"1�ŷ�ӳ��","2016��8��27��13:00",1,108},
				{"2�ŷ�ӳ��","2016��8��27��16:00",2,109},
				{"3�ŷ�ӳ��","2016��8��27��18:00",3,100},
				{"4�ŷ�ӳ��","2016��8��29��13:00",4,107},
				{"3�ŷ�ӳ��","2016��8��30��14:00",5,98},
				{"2�ŷ�ӳ��","2016��8��31��12:00",6,99},
				{"3�ŷ�ӳ��","2016��9��1��22:00",6,99},
				{"4�ŷ�ӳ��","2016��9��11��22:00",6,99},
				{"1�ŷ�ӳ��","2016��9��21��12:00",6,99},
				{"1�ŷ�ӳ��","2016��9��22��14:00",6,99},
				{"3�ŷ�ӳ��","2016��9��22��16:00",6,99}};
		
		JPanel jPanel3 = JuMu_yingpiaoBoFnag(biaotou, chengyuan);
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		gridBagConstraints.gridx=0;
		gridBagConstraints.gridy=1;
		gridBagConstraints.weightx=100;
		gridBagConstraints.weighty=100;
		jPanel.add(jPanel3,gridBagConstraints);
		
		
		jPanel.setBackground(Color.orange);
		
		return jPanel;
	}
	
	public JPanel DingPiaoXinXi(){
		JPanel jPanel = new JPanel();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		jPanel.setLayout(gridBagLayout);
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(5,5,5,5);
		gridBagConstraints.insets = insets;
		
		JPanel jPanel2 = DianYingPIaoXinxi();
		jPanel2.setBackground(Color.green);
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		gridBagConstraints.gridx=0;
		gridBagConstraints.gridy=0;
		gridBagConstraints.weightx=100;
		gridBagConstraints.weighty=15;
		jPanel.add(jPanel2,gridBagConstraints);
		
		JTabbedPane jPanel3 = JuYuanXinXi();
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		gridBagConstraints.gridx=0;
		gridBagConstraints.gridy=1;
		gridBagConstraints.weightx=100;
		gridBagConstraints.weighty=100;
		jPanel.add(jPanel3,gridBagConstraints);
		
		
		jPanel.setBackground(Color.orange);
		return jPanel;
	}
	
	
	public JPanel DianYingPIaoXinxi(){
		JPanel jPanel = new JPanel();
		GridBagLayout gridBagLayout = new GridBagLayout();
		jPanel.setLayout(gridBagLayout);
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(5,5,5,5);
		gridBagConstraints.insets = insets;
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setBackground(Color.pink);
		jPanel2.setLayout(new GridLayout(2,1));
		
		JPanel jPanel21 = new JPanel();
		jPanel21.setBackground(Color.pink);
		jPanel21.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));
				
		JPanel jPanel211 = new JPanel();
		jPanel211.setBackground(Color.pink);
		jPanel211.setLayout(new FlowLayout(FlowLayout.CENTER));
		jPanel211.add(new JLabel("ӰƬ���ƣ�"));
		jLabel_Yingming.setFont(new java.awt.Font("Dialog", 1, 20)); 
		jLabel_Yingming.setForeground(Color.blue);
		jPanel211.add(jLabel_Yingming);
		
		JPanel jPanel212 = new JPanel();
		jPanel212.setBackground(Color.pink);
		jPanel212.setLayout(new FlowLayout(FlowLayout.CENTER));
		jPanel212.add(new JLabel("���ͣ�"));
		jLabel_leixing.setFont(new java.awt.Font("Dialog", 1, 20));
		jLabel_leixing.setForeground(Color.blue);
		jPanel212.add(jLabel_leixing);
		
		JPanel jPanel213 = new JPanel();
		jPanel213.setBackground(Color.pink);
		jPanel213.setLayout(new FlowLayout(FlowLayout.CENTER));
		jPanel213.add(new JLabel("���أ�"));
		jLabel_changdi.setFont(new java.awt.Font("Dialog", 1, 20));
		jLabel_changdi.setForeground(Color.blue);
		jPanel213.add(jLabel_changdi);
		
		jPanel21.add(jPanel211);
		jPanel21.add(jPanel212);
		jPanel21.add(jPanel213);
		
		JPanel jPanel22 = new JPanel();
		jPanel22.setBackground(Color.pink);
		jPanel22.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));
		
		JPanel jPanel221 = new JPanel();
		jPanel221.setBackground(Color.pink);
		jPanel221.setLayout(new FlowLayout(FlowLayout.CENTER));
		jPanel221.add(new JLabel("ʱ����"));
		jLabel_shichang.setFont(new java.awt.Font("Dialog", 1, 20));
		jLabel_shichang.setForeground(Color.blue);
		jPanel221.add(jLabel_shichang);
		JPanel jPanel222 = new JPanel();
		jPanel222.setBackground(Color.pink);
		jPanel222.setLayout(new FlowLayout(FlowLayout.CENTER));
		jPanel222.add(new JLabel("Ʊ��"));
		jLabel_piaojia.setFont(new java.awt.Font("Dialog", 1, 20));
		jLabel_piaojia.setForeground(Color.blue);
		jPanel222.add(jLabel_piaojia);
		JPanel jPanel223 = new JPanel();
		jPanel223.setBackground(Color.pink);
		jPanel223.setLayout(new FlowLayout(FlowLayout.CENTER));
		jPanel223.add(new JLabel("��ӳʱ�䣺"));
		jLabel_fangyingshijian.setFont(new java.awt.Font("Dialog", 1, 20));
		jLabel_fangyingshijian.setForeground(Color.blue);
		jPanel223.add(jLabel_fangyingshijian);
		
		jPanel22.add(jPanel221);
		jPanel22.add(jPanel222);
		jPanel22.add(jPanel223);
		
		jPanel2.add(jPanel21);
		jPanel2.add(jPanel22);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		gridBagConstraints.gridx=0;
		gridBagConstraints.gridy=0;
		gridBagConstraints.weightx=10;
		gridBagConstraints.weighty=10;
		jPanel.add(jPanel2,gridBagConstraints);
		
		JPanel jPanel3 = new JPanel();
		jPanel3.setBackground(Color.pink);
		JButton jButton_fanhui = new JButton("����");
		jButton_fanhui.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				jTabbedPane_Main.setSelectedIndex(1);
			}
		});
		jPanel3.add(jButton_fanhui,BorderLayout.CENTER);
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		gridBagConstraints.gridx=1;
		gridBagConstraints.gridy=0;
		gridBagConstraints.weightx=2;
		gridBagConstraints.weighty=10;
		jPanel.add(jPanel3,gridBagConstraints);
		
		return jPanel;
	}
	
	public JPanel DianYingPIaoBoFangXinxi(){
		JPanel jPanel = new JPanel();
		GridBagLayout gridBagLayout = new GridBagLayout();
		jPanel.setLayout(gridBagLayout);
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(5,5,5,5);
		gridBagConstraints.insets = insets;
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setBackground(Color.pink);
		jPanel2.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
				
		JPanel jPanel211 = new JPanel();
		jPanel211.setBackground(Color.pink);
		jPanel211.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		jLabel_Yingmingbofang.setFont(new java.awt.Font("Dialog", 1, 20)); 
		jLabel_Yingmingbofang.setForeground(Color.blue);
		jPanel211.add(jLabel_Yingmingbofang);
		jPanel211.add(new JLabel("��ӳ��Ϣһ����"));
		
		
		JPanel jPanel22 = new JPanel();
		jPanel22.setBackground(Color.pink);
		jPanel22.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));
		
		jPanel2.add(jPanel211);
		jPanel2.add(jPanel22);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		gridBagConstraints.gridx=0;
		gridBagConstraints.gridy=0;
		gridBagConstraints.weightx=10;
		gridBagConstraints.weighty=10;
		jPanel.add(jPanel2,gridBagConstraints);
		
		JPanel jPanel3 = new JPanel();
		jPanel3.setBackground(Color.pink);
		jPanel3.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		JButton jButton_fanhui = new JButton("����");
		jButton_fanhui.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				jTabbedPane_Main.setSelectedIndex(0);
			}
		});
		jPanel3.add(jButton_fanhui);
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		gridBagConstraints.gridx=1;
		gridBagConstraints.gridy=0;
		gridBagConstraints.weightx=2;
		gridBagConstraints.weighty=10;
		jPanel.add(jPanel3,gridBagConstraints);
		
		return jPanel;
	}
	
	public JTabbedPane JuYuanXinXi(){
		jTabbedPane_DingPioa = new JTabbedPane();
		
		
		jTabbedPane_DingPioa.add("1���ݳ���",YanChuTing1());
		jTabbedPane_DingPioa.add("2���ݳ���",YanChuTing2());
		jTabbedPane_DingPioa.add("3���ݳ���",YanChuTing3());
		jTabbedPane_DingPioa.add("4���ݳ���",YanChuTing4());
		
		return jTabbedPane_DingPioa;
	}
	
	public JPanel JuMu_Tuijian(String[] biaotou,Object[][] chengyuan){
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.orange);
		
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 5, 0, 5);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel("�Ƽ��б�");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_tuijian = ZhiBiao_tuijian(biaotou,chengyuan);
		jTable_tuijian.setBackground(Color.pink);
		jTable_tuijian.addMouseListener(new MouseAdapter() {//�����ӵ���¼�

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				int select1 = jTable_tuijian.getSelectedRow();  	//��ȡ��ѡ�е���
				Object oa = tableModel_tuijian.getValueAt(select1, 0);
				Object ob = tableModel_tuijian.getValueAt(select1, 1);
				Object oc = tableModel_tuijian.getValueAt(select1, 2);
				Object oe = tableModel_tuijian.getValueAt(select1, 4);
				Object oh = tableModel_tuijian.getValueAt(select1, 7);
				Object oi = tableModel_tuijian.getValueAt(select1, 6);
				
				jLabel_Yingming.setText(oa.toString());
				jLabel_Yingming1.setText(oa.toString());
				jLabel_Yingming2.setText(oa.toString());
				jLabel_Yingming3.setText(oa.toString());
				jLabel_Yingming4.setText(oa.toString());
				jLabel_Yingmingbofang.setText(oa.toString());
				jLabel_leixing.setText(ob.toString());
				jLabel_changdi.setText(oc.toString());
				jLabel_piaojia.setText(oh.toString());
				jLabel_piaojia1.setText(oh.toString());
				jLabel_piaojia2.setText(oh.toString());
				jLabel_piaojia3.setText(oh.toString());
				jLabel_piaojia4.setText(oh.toString());
				jLabel_shichang.setText(oe.toString());
				jLabel_shichang1.setText(oe.toString());
				jLabel_shichang2.setText(oe.toString());
				jLabel_shichang3.setText(oe.toString());
				jLabel_shichang4.setText(oe.toString());
				
				
				jTabbedPane_Main.setSelectedIndex(1);
				
			}	
			
		});
		
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 120;
		gridBagConstraints.weighty = 100;
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(jTable_tuijian);
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
	
	public JPanel JuMu_yingpiaoBoFnag(String[] biaotou,Object[][] chengyuan){
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.orange);
		
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 5, 0, 5);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel("��ӳ��Ϣ");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_YingPian = ZhiBiao_tuijian(biaotou,chengyuan);
		jTable_YingPian.setBackground(Color.pink);
		jTable_YingPian.addMouseListener(new MouseAdapter() {//�����ӵ���¼�

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				int select1 = jTable_YingPian.getSelectedRow();  	//��ȡ��ѡ�е���
				Object oa = tableModel_tuijian.getValueAt(select1, 0);
				Object ob = tableModel_tuijian.getValueAt(select1, 1);
				Object oc = tableModel_tuijian.getValueAt(select1, 2);
				Object oe = tableModel_tuijian.getValueAt(select1, 3);
				
				jLabel_fangyingshijian.setText(ob.toString());
				
				
				if (oa.toString().charAt(0) == '1') {
					jTabbedPane_DingPioa.setSelectedIndex(0);
					jLabel_fangyingshijian1.setText(ob.toString());
				}else if(oa.toString().charAt(0) == '2'){
					jTabbedPane_DingPioa.setSelectedIndex(1);
					jLabel_fangyingshijian2.setText(ob.toString());
				}else if(oa.toString().charAt(0) == '3'){
					jTabbedPane_DingPioa.setSelectedIndex(2);
					jLabel_fangyingshijian3.setText(ob.toString());
				}else if(oa.toString().charAt(0) == '4'){
					jTabbedPane_DingPioa.setSelectedIndex(3);
					jLabel_fangyingshijian4.setText(ob.toString());
				}
				
				
				jTabbedPane_Main.setSelectedIndex(2);
				
			}	
			
		});
		
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 120;
		gridBagConstraints.weighty = 100;
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(jTable_YingPian);
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
	
	public JPanel JuMu_Renqi(String[] biaotou,Object[][] chengyuan){
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.orange);
		
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 5, 0, 5);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel("�����б�");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_renqi1 = ZhiBiao_renqi(biaotou,chengyuan);
		jTable_renqi1.setBackground(Color.magenta);
		jTable_renqi1.addMouseListener(new MouseAdapter() {//�����ӵ���¼�

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				int select1 = jTable_renqi1.getSelectedRow();  	//��ȡ��ѡ�е���
				Object oa1 = tableModel_renqi1.getValueAt(select1, 0);
				Object ob1 = tableModel_renqi1.getValueAt(select1, 1);
				Object oc1 = tableModel_renqi1.getValueAt(select1, 2);
				Object oe1 = tableModel_renqi1.getValueAt(select1, 4);
				Object oh1 = tableModel_renqi1.getValueAt(select1, 7);
				
				jLabel_Yingmingbofang.setText(oa1.toString());
				jLabel_Yingming.setText(oa1.toString());
				jLabel_Yingming1.setText(oa1.toString());
				jLabel_Yingming2.setText(oa1.toString());
				jLabel_Yingming3.setText(oa1.toString());
				jLabel_Yingming4.setText(oa1.toString());
				jLabel_leixing.setText(ob1.toString());
				jLabel_changdi.setText(oc1.toString());
				jLabel_piaojia.setText(oh1.toString());
				jLabel_shichang.setText(oe1.toString());
				jLabel_piaojia1.setText(oh1.toString());
				jLabel_shichang1.setText(oe1.toString());
				jLabel_piaojia2.setText(oh1.toString());
				jLabel_shichang2.setText(oe1.toString());
				jLabel_piaojia3.setText(oh1.toString());
				jLabel_shichang3.setText(oe1.toString());
				jLabel_piaojia4.setText(oh1.toString());
				jLabel_shichang4.setText(oe1.toString());
				
				jTabbedPane_Main.setSelectedIndex(1);
				
			}	
			
		});
		
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 120;
		gridBagConstraints.weighty = 100;
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(jTable_renqi1);
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
	
	public JPanel JuMu_XinPin(String[] biaotou,Object[][] chengyuan){
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.orange);
		
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 5, 0, 5);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel("��Ʒ�б�");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_Xinpin = ZhiBiao_xinpin(biaotou,chengyuan);
		jTable_Xinpin.setBackground(Color.pink);
		jTable_Xinpin.addMouseListener(new MouseAdapter() {//�����ӵ���¼�

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				int select1 = jTable_Xinpin.getSelectedRow();  	//��ȡ��ѡ�е���
				Object oa = tableModel_xinpin.getValueAt(select1, 0);
				Object ob = tableModel_xinpin.getValueAt(select1, 1);
				Object oc = tableModel_xinpin.getValueAt(select1, 2);
				Object oe = tableModel_xinpin.getValueAt(select1, 4);
				Object oh = tableModel_xinpin.getValueAt(select1, 7);
				
				Object oi = tableModel_xinpin.getValueAt(select1, 6);
				jLabel_fangyingshijian.setText(oi.toString());
				jLabel_fangyingshijian1.setText(oi.toString());
				jLabel_Yingming.setText(oa.toString());
				jLabel_Yingmingbofang.setText(oa.toString());
				jLabel_Yingming1.setText(oa.toString());
				jLabel_Yingming2.setText(oa.toString());
				jLabel_Yingming3.setText(oa.toString());
				jLabel_Yingming4.setText(oa.toString());
				jLabel_leixing.setText(ob.toString());
				jLabel_changdi.setText(oc.toString());
				jLabel_piaojia.setText(oh.toString());
				jLabel_shichang.setText(oe.toString());
				jLabel_piaojia1.setText(oh.toString());
				jLabel_shichang1.setText(oe.toString());
				
				jLabel_piaojia2.setText(oh.toString());
				jLabel_shichang2.setText(oe.toString());
				jLabel_piaojia3.setText(oh.toString());
				jLabel_shichang3.setText(oe.toString());
				jLabel_piaojia4.setText(oh.toString());
				jLabel_shichang4.setText(oe.toString());
				
				jTabbedPane_Main.setSelectedIndex(1);
				
			}	
			
		});
		
		
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 120;
		gridBagConstraints.weighty = 100;
		JScrollPane jScrollPane = new JScrollPane();
		jScrollPane.setViewportView(jTable_Xinpin);
		jScrollPane.setBackground(Color.orange);
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
	
	public JTable ZhiBiao_YingPian(String[] biaotou,Object[][] chengyuan){
		
		tableModel_YingPian = new DefaultTableModel(chengyuan, biaotou);
		JTable jTable1 = new JTable(tableModel_renqi1);
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
	
	public JTable ZhiBiao_renqi(String[] biaotou,Object[][] chengyuan){
		
		tableModel_renqi1 = new DefaultTableModel(chengyuan, biaotou);
		JTable jTable1 = new JTable(tableModel_renqi1);
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
	
	public JTable ZhiBiao_tuijian(String[] biaotou,Object[][] chengyuan){
		
		tableModel_tuijian = new DefaultTableModel(chengyuan, biaotou);
		JTable jTable1 = new JTable(tableModel_tuijian);
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

	public JTable ZhiBiao_xinpin(String[] biaotou,Object[][] chengyuan){
	
		tableModel_xinpin = new DefaultTableModel(chengyuan, biaotou);
		JTable jTable1 = new JTable(tableModel_xinpin);
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
	

	
	public JPanel ShnegChengZuoWei(int a,int b){
		JPanel jPanel_shengchengZuowei = new JPanel();
		jPanel_shengchengZuowei.setLayout(new GridLayout(a, b,10,10));
		int i;
		int j;
		
		buttons1 = new JButton[a][b];
		for (i = 0; i < a; i++) {
			for (j = 0; j < b; j++) {
				buttons1[i][j] = new JButton();
				int aa = i+1;
				int bb = j+1;
				buttons1[i][j].setName("��"+aa+"�� ,��"+bb+"��");
				buttons1[i][j].setBackground(Color.pink);
				buttons1[i][j].addActionListener(new ActionListener() {
					int a;
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						 JButton button = (JButton) e.getSource();
						 jLabel_weizhi1.setText(button.getName());
						 string = button.getName();
						 jLabel_weizhi1.setFont(new java.awt.Font("Dialog", 1, 20));
						 jLabel_weizhi1.setForeground(Color.blue);
	                        a++;
	                        if (a%2==0) {
								button.setBackground(Color.pink);
							}else {
								button.setBackground(Color.red);
							}
					}
				});
				jPanel_shengchengZuowei.add(buttons1[i][j]);
			}
		}
		
		return jPanel_shengchengZuowei;
	}
	
	public JPanel ShnegChengZuoWei2(int a,int b){
		JPanel jPanel_shengchengZuowei = new JPanel();
		jPanel_shengchengZuowei.setLayout(new GridLayout(a, b,10,10));
		int i;
		int j;
		
		buttons2 = new JButton[a][b];
		for (i = 0; i < a; i++) {
			for (j = 0; j < b; j++) {
				buttons2[i][j] = new JButton();
				int aa = i+1;
				int bb = j+1;
				buttons2[i][j].setName("��"+aa+"��,��"+bb+"��");
				buttons2[i][j].setBackground(Color.pink);
				buttons2[i][j].addActionListener(new ActionListener() {
					int a;
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						 JButton button = (JButton) e.getSource();
						 jLabel_weizhi2.setText(button.getName());
						 string = button.getName();
						 jLabel_weizhi2.setFont(new java.awt.Font("Dialog", 1, 20));
						 jLabel_weizhi2.setForeground(Color.blue);
	                     a++;
	                        if (a%2==0) {
								button.setBackground(Color.pink);
							}else {
								button.setBackground(Color.red);
							}
					}
				});
				jPanel_shengchengZuowei.add(buttons2[i][j]);
			}
		}
		
		return jPanel_shengchengZuowei;
	}
	
	public JPanel ShnegChengZuoWei3(int a,int b){
		JPanel jPanel_shengchengZuowei = new JPanel();
		jPanel_shengchengZuowei.setLayout(new GridLayout(a, b,10,10));
		int i;
		int j;
		
		buttons3 = new JButton[a][b];
		for (i = 0; i < a; i++) {
			for (j = 0; j < b; j++) {
				buttons3[i][j] = new JButton();
				int aa = i+1;
				int bb = j+1;
				buttons3[i][j].setName("��"+aa+"��,��"+bb+"��");
				buttons3[i][j].setBackground(Color.pink);
				buttons3[i][j].addActionListener(new ActionListener() {
					int a;
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						 JButton button1 = (JButton) e.getSource();
						 jLabel_weizhi3.setText(button1.getName());
						 jLabel_weizhi3.setFont(new java.awt.Font("Dialog", 1, 20));
						 jLabel_weizhi3.setForeground(Color.blue);
						 string = button1.getName();
	                        a++;
	                        if (a%2==0) {
								button1.setBackground(Color.pink);
							}else {
								button1.setBackground(Color.red);
							}
					}
				});
				jPanel_shengchengZuowei.add(buttons3[i][j]);
			}
		}
		
		return jPanel_shengchengZuowei;
	}
	
	public JPanel ShnegChengZuoWei4(int a,int b){
		JPanel jPanel_shengchengZuowei = new JPanel();
		jPanel_shengchengZuowei.setLayout(new GridLayout(a, b,10,10));
		int i;
		int j;
		
		buttons4 = new JButton[a][b];
		for (i = 0; i < a; i++) {
			for (j = 0; j < b; j++) {
				buttons4[i][j] = new JButton();
				int aa = i+1;
				int bb = j+1;
				buttons4[i][j].setName("��"+aa+"��,��"+bb+"��");
				buttons4[i][j].setBackground(Color.pink);
				buttons4[i][j].addActionListener(new ActionListener() {
					int a;
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						 JButton button = (JButton) e.getSource();
						 jLabel_weizhi4.setText(button.getName());
						 string = button.getName();
						 jLabel_weizhi4.setFont(new java.awt.Font("Dialog", 1, 20));
						 jLabel_weizhi4.setForeground(Color.blue);
	                        a++;
	                        if (a%2==0) {
								button.setBackground(Color.pink);
							}else {
								button.setBackground(Color.red);
							}
					}
				});
				jPanel_shengchengZuowei.add(buttons4[i][j]);
			}
		}
		
		return jPanel_shengchengZuowei;
	}
	
public JPanel YanChuTing1(){
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 5, 0, 5);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel("1���ݳ�����ͼ");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jLabel.setFont(new java.awt.Font("Dialog", 1, 25));
		jLabel.setForeground(Color.red);
		jPanel.add(jLabel, gridBagConstraints);
		
		JLabel jLabel2 = new JLabel("��Ʊ��Ϣ");
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		jLabel2.setFont(new java.awt.Font("Dialog", 1, 25));
		jLabel2.setForeground(Color.red);
		jPanel.add(jLabel2, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		JPanel jPanel3 = NiaoKanTu(8,11);
		jPanel3.setBackground(Color.pink);
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 80;
		gridBagConstraints.weighty = 100;
		jPanel.add(jPanel3, gridBagConstraints);
		
		JPanel jPanel4 = new JPanel();
		jPanel4.setLayout(new GridLayout(8, 1));
		
		
		JPanel jPanel41 = new JPanel();
		jPanel41.setBackground(Color.pink);
		jPanel41.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
		jPanel41.add(new JLabel("��Ӱ���ƣ�"));
		
		JPanel jPanel45 = new JPanel();
		jPanel45.setBackground(Color.pink);
		jPanel45.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
		jLabel_Yingming1.setFont(new java.awt.Font("Dialog", 1, 15));
		jLabel_Yingming1.setForeground(Color.blue);
		jPanel45.add(jLabel_Yingming1);
		
		JPanel jPanel48 = new JPanel();
		jPanel48.setBackground(Color.pink);
		jPanel48.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		jPanel48.add(new JLabel("��ӳ����"));
		JLabel jLabel_fangyingting = new JLabel();
		jLabel_fangyingting.setText("1�ŷ�ӳ��");
		jLabel_fangyingting.setFont(new java.awt.Font("Dialog", 1, 15));
		jLabel_fangyingting.setForeground(Color.blue);
		jPanel48.add(jLabel_fangyingting);
		
		JPanel jPanel46 = new JPanel();
		jPanel46.setBackground(Color.pink);
		jPanel46.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		jPanel46.add(new JLabel("Ʊ�ۣ�"));
		jLabel_piaojia1.setFont(new java.awt.Font("Dialog", 1, 15));
		jLabel_piaojia1.setForeground(Color.blue);
		jPanel46.add(jLabel_piaojia1);
		
		JPanel jPanel47 = new JPanel();
		jPanel47.setBackground(Color.pink);
		jPanel47.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		jPanel47.add(new JLabel("ʱ����"));
		jLabel_shichang1.setFont(new java.awt.Font("Dialog", 1, 15));
		jLabel_shichang1.setForeground(Color.blue);
		jPanel47.add(jLabel_shichang1);
		
		JPanel jPanel42 = new JPanel();
		jPanel42.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
		jPanel42.add(new JLabel("��Ŀǰ�������λ�ã�"));
		
		JPanel jPanel43 = new JPanel();
		jPanel43.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
		jLabel_weizhi1.setText(zuowei);
		jPanel43.add(jLabel_weizhi1);
		jPanel42.setBackground(Color.pink);
		jPanel43.setBackground(Color.pink);
		
		JPanel jPanel44 = new JPanel();
		jPanel44.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
		JButton jButton_dingpiao = new JButton("��Ʊ");
		jButton_dingpiao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog( null,"��Ʊ�ɹ�������λ���ǣ�"+string);
				System.out.println(string.charAt(6));
				int a = string.charAt(1)-49;
				int b = string.charAt(6)-49;
				buttons1[a][b].setBackground(Color.blue);
			}
		});
		jPanel44.add(jButton_dingpiao);
		jPanel44.setBackground(Color.pink);
		
		jPanel4.add(jPanel41);
		jPanel4.add(jPanel45);
		jPanel4.add(jPanel48);
		jPanel4.add(jPanel46);
		jPanel4.add(jPanel47);
		jPanel4.add(jPanel42);
		jPanel4.add(jPanel43);
		jPanel4.add(jPanel44);

		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		gridBagConstraints.weightx = 0;
		gridBagConstraints.weighty = 0;
		jPanel.add(jPanel4, gridBagConstraints);
		
		JPanel jPanel5 = new JPanel();
		jPanel5.setBackground(Color.orange);
		gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.gridwidth=2;
        jPanel.add(jPanel5, gridBagConstraints);
        
		
		jPanel.setBackground(Color.orange);
		return jPanel;
	}

public JPanel YanChuTing2(){
	JPanel jPanel = new JPanel();
	jPanel.setLayout(new GridBagLayout());
	GridBagConstraints gridBagConstraints = new GridBagConstraints();
	Insets insets = new Insets(10, 5, 0, 5);
	gridBagConstraints.insets = insets;
	
	JLabel jLabel = new JLabel("2���ݳ�����ͼ");
	gridBagConstraints.gridx = 0;
	gridBagConstraints.gridy = 0;
	jLabel.setFont(new java.awt.Font("Dialog", 1, 25));
	jLabel.setForeground(Color.red);
	jPanel.add(jLabel, gridBagConstraints);
	
	JLabel jLabel2 = new JLabel("��Ʊ��Ϣ");
	gridBagConstraints.gridx = 1;
	gridBagConstraints.gridy = 0;
	jLabel2.setFont(new java.awt.Font("Dialog", 1, 25));
	jLabel2.setForeground(Color.red);
	jPanel.add(jLabel2, gridBagConstraints);
	
	gridBagConstraints.fill = GridBagConstraints.BOTH;
	JPanel jPanel3 = NiaoKanTu2(9,10);
	jPanel3.setBackground(Color.pink);
	gridBagConstraints.gridx = 0;
	gridBagConstraints.gridy = 1;
	gridBagConstraints.weightx = 80;
	gridBagConstraints.weighty = 100;
	jPanel.add(jPanel3, gridBagConstraints);
	

	JPanel jPanel4 = new JPanel();
	jPanel4.setLayout(new GridLayout(8, 1));
	
	
	JPanel jPanel41 = new JPanel();
	jPanel41.setBackground(Color.pink);
	jPanel41.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	jPanel41.add(new JLabel("��Ӱ���ƣ�"));
	
	JPanel jPanel45 = new JPanel();
	jPanel45.setBackground(Color.pink);
	jPanel45.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	jLabel_Yingming2.setFont(new java.awt.Font("Dialog", 1, 15));
	jLabel_Yingming2.setForeground(Color.blue);
	jPanel45.add(jLabel_Yingming2);
	
	JPanel jPanel48 = new JPanel();
	jPanel48.setBackground(Color.pink);
	jPanel48.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
	jPanel48.add(new JLabel("��ӳ����"));
	JLabel jLabel_fangyingting = new JLabel();
	jLabel_fangyingting.setText("2�ŷ�ӳ��");
	jLabel_fangyingting.setFont(new java.awt.Font("Dialog", 1, 15));
	jLabel_fangyingting.setForeground(Color.blue);
	jPanel48.add(jLabel_fangyingting);
	
	JPanel jPanel46 = new JPanel();
	jPanel46.setBackground(Color.pink);
	jPanel46.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
	jPanel46.add(new JLabel("Ʊ�ۣ�"));
	jLabel_piaojia2.setFont(new java.awt.Font("Dialog", 1, 15));
	jLabel_piaojia2.setForeground(Color.blue);
	jPanel46.add(jLabel_piaojia2);
	
	JPanel jPanel47 = new JPanel();
	jPanel47.setBackground(Color.pink);
	jPanel47.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
	jPanel47.add(new JLabel("ʱ����"));
	jLabel_shichang2.setFont(new java.awt.Font("Dialog", 1, 15));
	jLabel_shichang2.setForeground(Color.blue);
	jPanel47.add(jLabel_shichang2);
	
	JPanel jPanel42 = new JPanel();
	jPanel42.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	jPanel42.add(new JLabel("��Ŀǰ�������λ�ã�"));
	
	JPanel jPanel43 = new JPanel();
	jPanel43.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	jLabel_weizhi2.setText(zuowei);
	jPanel43.add(jLabel_weizhi2);
	jPanel42.setBackground(Color.pink);
	jPanel43.setBackground(Color.pink);
	
	JPanel jPanel44 = new JPanel();
	jPanel44.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	JButton jButton_dingpiao2 = new JButton("��Ʊ");
	jButton_dingpiao2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog( null,"��Ʊ�ɹ�������λ���ǣ�"+string);
		
			buttons2[string.charAt(1)-49][string.charAt(5)-49].setBackground(Color.blue);
		}
	});
	jPanel44.add(jButton_dingpiao2);
	jPanel44.setBackground(Color.pink);
	
	jPanel4.add(jPanel41);
	jPanel4.add(jPanel45);
	jPanel4.add(jPanel48);
	jPanel4.add(jPanel46);
	jPanel4.add(jPanel47);
	jPanel4.add(jPanel42);
	jPanel4.add(jPanel43);
	jPanel4.add(jPanel44);

	gridBagConstraints.gridx = 1;
	gridBagConstraints.gridy = 1;
	gridBagConstraints.fill = GridBagConstraints.BOTH;
	gridBagConstraints.weightx = 0;
	gridBagConstraints.weighty = 0;
	jPanel.add(jPanel4, gridBagConstraints);
	
	JPanel jPanel5 = new JPanel();
	jPanel5.setBackground(Color.orange);
	gridBagConstraints.gridx=0;
    gridBagConstraints.gridy=2;
    gridBagConstraints.gridwidth=2;
    jPanel.add(jPanel5, gridBagConstraints);
    
	
	jPanel.setBackground(Color.blue);
	return jPanel;
}
public JPanel YanChuTing3(){
	JPanel jPanel = new JPanel();
	jPanel.setLayout(new GridBagLayout());
	GridBagConstraints gridBagConstraints = new GridBagConstraints();
	Insets insets = new Insets(10, 5, 0, 5);
	gridBagConstraints.insets = insets;
	
	JLabel jLabel = new JLabel("3���ݳ�����ͼ");
	gridBagConstraints.gridx = 0;
	gridBagConstraints.gridy = 0;
	jLabel.setFont(new java.awt.Font("Dialog", 1, 25));
	jLabel.setForeground(Color.red);
	jPanel.add(jLabel, gridBagConstraints);
	
	JLabel jLabel2 = new JLabel("��Ʊ��Ϣ");
	gridBagConstraints.gridx = 1;
	gridBagConstraints.gridy = 0;
	jLabel2.setFont(new java.awt.Font("Dialog", 1, 25));
	jLabel2.setForeground(Color.red);
	jPanel.add(jLabel2, gridBagConstraints);
	
	gridBagConstraints.fill = GridBagConstraints.BOTH;
	JPanel jPanel3 = NiaoKanTu3(10,9);
	jPanel3.setBackground(Color.pink);
	gridBagConstraints.gridx = 0;
	gridBagConstraints.gridy = 1;
	gridBagConstraints.weightx = 80;
	gridBagConstraints.weighty = 100;
	jPanel.add(jPanel3, gridBagConstraints);
	
	

	JPanel jPanel4 = new JPanel();
	jPanel4.setLayout(new GridLayout(8, 1));
	
	
	JPanel jPanel41 = new JPanel();
	jPanel41.setBackground(Color.pink);
	jPanel41.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	jPanel41.add(new JLabel("��Ӱ���ƣ�"));
	
	JPanel jPanel45 = new JPanel();
	jPanel45.setBackground(Color.pink);
	jPanel45.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	jLabel_Yingming3.setFont(new java.awt.Font("Dialog", 1, 15));
	jLabel_Yingming3.setForeground(Color.blue);
	jPanel45.add(jLabel_Yingming3);
	
	JPanel jPanel48 = new JPanel();
	jPanel48.setBackground(Color.pink);
	jPanel48.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
	jPanel48.add(new JLabel("��ӳ����"));
	JLabel jLabel_fangyingting = new JLabel();
	jLabel_fangyingting.setText("3�ŷ�ӳ��");
	jLabel_fangyingting.setFont(new java.awt.Font("Dialog", 1, 15));
	jLabel_fangyingting.setForeground(Color.blue);
	jPanel48.add(jLabel_fangyingting);
	
	JPanel jPanel46 = new JPanel();
	jPanel46.setBackground(Color.pink);
	jPanel46.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
	jPanel46.add(new JLabel("Ʊ�ۣ�"));
	jLabel_piaojia3.setFont(new java.awt.Font("Dialog", 1, 15));
	jLabel_piaojia3.setForeground(Color.blue);
	jPanel46.add(jLabel_piaojia3);
	
	JPanel jPanel47 = new JPanel();
	jPanel47.setBackground(Color.pink);
	jPanel47.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
	jPanel47.add(new JLabel("ʱ����"));
	jLabel_shichang3.setFont(new java.awt.Font("Dialog", 1, 15));
	jLabel_shichang3.setForeground(Color.blue);
	jPanel47.add(jLabel_shichang3);
	
	JPanel jPanel42 = new JPanel();
	jPanel42.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	jPanel42.add(new JLabel("��Ŀǰ�������λ�ã�"));
	
	JPanel jPanel43 = new JPanel();
	jPanel43.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	jLabel_weizhi3.setText(zuowei);
	jPanel43.add(jLabel_weizhi3);
	jPanel42.setBackground(Color.pink);
	jPanel43.setBackground(Color.pink);
	
	JPanel jPanel44 = new JPanel();
	jPanel44.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	JButton jButton_dingpiao3 = new JButton("��Ʊ");
	jButton_dingpiao3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog( null,"��Ʊ�ɹ�������λ���ǣ�"+string);
		
			buttons3[string.charAt(1)-49][string.charAt(5)-49].setBackground(Color.blue);
		}
	});
	jPanel44.add(jButton_dingpiao3);
	jPanel44.setBackground(Color.pink);
	
	jPanel4.add(jPanel41);
	jPanel4.add(jPanel45);
	jPanel4.add(jPanel48);
	jPanel4.add(jPanel46);
	jPanel4.add(jPanel47);
	jPanel4.add(jPanel42);
	jPanel4.add(jPanel43);
	jPanel4.add(jPanel44);

	gridBagConstraints.gridx = 1;
	gridBagConstraints.gridy = 1;
	gridBagConstraints.fill = GridBagConstraints.BOTH;
	gridBagConstraints.weightx = 0;
	gridBagConstraints.weighty = 0;
	jPanel.add(jPanel4, gridBagConstraints);
	
	JPanel jPanel5 = new JPanel();
	jPanel5.setBackground(Color.orange);
	gridBagConstraints.gridx=0;
    gridBagConstraints.gridy=2;
    gridBagConstraints.gridwidth=2;
    jPanel.add(jPanel5, gridBagConstraints);
    
	
	jPanel.setBackground(Color.gray);
	return jPanel;
}
public JPanel YanChuTing4(){
	JPanel jPanel = new JPanel();
	jPanel.setLayout(new GridBagLayout());
	GridBagConstraints gridBagConstraints = new GridBagConstraints();
	Insets insets = new Insets(10, 5, 0, 5);
	gridBagConstraints.insets = insets;
	
	JLabel jLabel = new JLabel("4���ݳ�����ͼ");
	gridBagConstraints.gridx = 0;
	gridBagConstraints.gridy = 0;
	jLabel.setFont(new java.awt.Font("Dialog", 1, 25));
	jLabel.setForeground(Color.red);
	jPanel.add(jLabel, gridBagConstraints);
	
	JLabel jLabel2 = new JLabel("��Ʊ��Ϣ");
	gridBagConstraints.gridx = 1;
	gridBagConstraints.gridy = 0;
	jLabel2.setFont(new java.awt.Font("Dialog", 1, 25));
	jLabel2.setForeground(Color.red);
	jPanel.add(jLabel2, gridBagConstraints);
	
	gridBagConstraints.fill = GridBagConstraints.BOTH;
	JPanel jPanel3 = NiaoKanTu4(8,11);
	jPanel3.setBackground(Color.pink);
	gridBagConstraints.gridx = 0;
	gridBagConstraints.gridy = 1;
	gridBagConstraints.weightx = 80;
	gridBagConstraints.weighty = 100;
	jPanel.add(jPanel3, gridBagConstraints);
	

	JPanel jPanel4 = new JPanel();
	jPanel4.setLayout(new GridLayout(8, 1));
	
	
	JPanel jPanel41 = new JPanel();
	jPanel41.setBackground(Color.pink);
	jPanel41.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	jPanel41.add(new JLabel("��Ӱ���ƣ�"));
	
	JPanel jPanel45 = new JPanel();
	jPanel45.setBackground(Color.pink);
	jPanel45.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	jLabel_Yingming4.setFont(new java.awt.Font("Dialog", 1, 15));
	jLabel_Yingming4.setForeground(Color.blue);
	jPanel45.add(jLabel_Yingming4);
	
	JPanel jPanel48 = new JPanel();
	jPanel48.setBackground(Color.pink);
	jPanel48.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
	jPanel48.add(new JLabel("��ӳ����"));
	JLabel jLabel_fangyingting = new JLabel();
	jLabel_fangyingting.setText("4�ŷ�ӳ��");
	jLabel_fangyingting.setFont(new java.awt.Font("Dialog", 1, 15));
	jLabel_fangyingting.setForeground(Color.blue);
	jPanel48.add(jLabel_fangyingting);
	
	JPanel jPanel46 = new JPanel();
	jPanel46.setBackground(Color.pink);
	jPanel46.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
	jPanel46.add(new JLabel("Ʊ�ۣ�"));
	jLabel_piaojia4.setFont(new java.awt.Font("Dialog", 1, 15));
	jLabel_piaojia4.setForeground(Color.blue);
	jPanel46.add(jLabel_piaojia4);
	
	JPanel jPanel47 = new JPanel();
	jPanel47.setBackground(Color.pink);
	jPanel47.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
	jPanel47.add(new JLabel("ʱ����"));
	jLabel_shichang4.setFont(new java.awt.Font("Dialog", 1, 15));
	jLabel_shichang4.setForeground(Color.blue);
	jPanel47.add(jLabel_shichang4);
	
	JPanel jPanel42 = new JPanel();
	jPanel42.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	jPanel42.add(new JLabel("��Ŀǰ�������λ�ã�"));
	
	JPanel jPanel43 = new JPanel();
	jPanel43.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	jLabel_weizhi4.setText(zuowei);
	jPanel43.add(jLabel_weizhi4);
	jPanel42.setBackground(Color.pink);
	jPanel43.setBackground(Color.pink);
	JPanel jPanel44 = new JPanel();
	jPanel44.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
	JButton jButton_dingpiao4 = new JButton("��Ʊ");
	jButton_dingpiao4.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog( null,"��Ʊ�ɹ�������λ���ǣ�"+string);
			
			buttons4[string.charAt(1)-49][string.charAt(5)-49].setBackground(Color.blue);
		}
	});
	jPanel44.add(jButton_dingpiao4);
	jPanel44.setBackground(Color.pink);
	
	jPanel4.add(jPanel41);
	jPanel4.add(jPanel45);
	jPanel4.add(jPanel48);
	jPanel4.add(jPanel46);
	jPanel4.add(jPanel47);
	jPanel4.add(jPanel42);
	jPanel4.add(jPanel43);
	jPanel4.add(jPanel44);

	gridBagConstraints.gridx = 1;
	gridBagConstraints.gridy = 1;
	gridBagConstraints.fill = GridBagConstraints.BOTH;
	gridBagConstraints.weightx = 0;
	gridBagConstraints.weighty = 0;
	jPanel.add(jPanel4, gridBagConstraints);
	
	JPanel jPanel5 = new JPanel();
	jPanel5.setBackground(Color.orange);
	gridBagConstraints.gridx=0;
    gridBagConstraints.gridy=2;
    gridBagConstraints.gridwidth=2;
    jPanel.add(jPanel5, gridBagConstraints);
    
	
	jPanel.setBackground(Color.GREEN);
	return jPanel;
}
	
	public JScrollPane YingTingXinXi(int a,int b){
		
		JPanel jPanel_Zuowei = ShnegChengZuoWei(a,b);
		jPanel_Zuowei.setBackground(Color.pink);
		JScrollPane jScrollPane = new JScrollPane(jPanel_Zuowei);
		
		return jScrollPane;
	}
	public JScrollPane YingTingXinXi2(int a,int b){
		
		JPanel jPanel_Zuowei = ShnegChengZuoWei2(a,b);
		jPanel_Zuowei.setBackground(Color.pink);
		JScrollPane jScrollPane = new JScrollPane(jPanel_Zuowei);
		
		return jScrollPane;
	}

	public JScrollPane YingTingXinXi3(int a,int b){
	
		JPanel jPanel_Zuowei = ShnegChengZuoWei3(a,b);
		jPanel_Zuowei.setBackground(Color.pink);
		JScrollPane jScrollPane = new JScrollPane(jPanel_Zuowei);
	
		return jScrollPane;
	}

	public JScrollPane YingTingXinXi4(int a,int b){
	
		JPanel jPanel_Zuowei = ShnegChengZuoWei4(a,b);
		jPanel_Zuowei.setBackground(Color.pink);
		JScrollPane jScrollPane = new JScrollPane(jPanel_Zuowei);
	
		return jScrollPane;
	}
	
	public JPanel NiaoKanTu(int a,int b){
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 10, 10, 1);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		JLabel jLabel3 = new JLabel();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel3, gridBagConstraints);
		
		JPanel jPanel2 = new JPanel();
		JLabel jLabel2 = new JLabel("��Ļ");
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		jPanel2.setBackground(Color.blue);
		jPanel2.add(jLabel2);
		jPanel.add(jPanel2, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		JScrollPane jScrollPane = YingTingXinXi(a,b);
		jScrollPane.setBackground(Color.pink);
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 100;
		gridBagConstraints.weighty = 100;
		gridBagConstraints.gridwidth = 2;
		jPanel.add(jScrollPane, gridBagConstraints);
		
		return jPanel;
	}
	
	public JPanel NiaoKanTu2(int a,int b){
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 10, 10, 1);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		JLabel jLabel3 = new JLabel();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel3, gridBagConstraints);
		
		JPanel jPanel2 = new JPanel();
		JLabel jLabel2 = new JLabel("��Ļ");
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		jPanel2.setBackground(Color.blue);
		jPanel2.add(jLabel2);
		jPanel.add(jPanel2, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		JScrollPane jScrollPane = YingTingXinXi2(a,b);
		jScrollPane.setBackground(Color.pink);
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 100;
		gridBagConstraints.weighty = 100;
		gridBagConstraints.gridwidth = 2;
		jPanel.add(jScrollPane, gridBagConstraints);
		
		return jPanel;
	}
	
	public JPanel NiaoKanTu3(int a,int b){
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 10, 10, 1);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		JLabel jLabel3 = new JLabel();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel3, gridBagConstraints);
		
		JPanel jPanel2 = new JPanel();
		JLabel jLabel2 = new JLabel("��Ļ");
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		jPanel2.setBackground(Color.blue);
		jPanel2.add(jLabel2);
		jPanel.add(jPanel2, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		JScrollPane jScrollPane = YingTingXinXi3(a,b);
		jScrollPane.setBackground(Color.pink);
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 100;
		gridBagConstraints.weighty = 100;
		gridBagConstraints.gridwidth = 2;
		jPanel.add(jScrollPane, gridBagConstraints);
		
		return jPanel;
	}
	
	public JPanel NiaoKanTu4(int a,int b){
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 10, 10, 1);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		JLabel jLabel3 = new JLabel();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel3, gridBagConstraints);
		
		JPanel jPanel2 = new JPanel();
		JLabel jLabel2 = new JLabel("��Ļ");
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		jPanel2.setBackground(Color.blue);
		jPanel2.add(jLabel2);
		jPanel.add(jPanel2, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		JScrollPane jScrollPane = YingTingXinXi4(a,b);
		jScrollPane.setBackground(Color.pink);
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.weightx = 100;
		gridBagConstraints.weighty = 100;
		gridBagConstraints.gridwidth = 2;
		jPanel.add(jScrollPane, gridBagConstraints);
		
		return jPanel;
	}



}
