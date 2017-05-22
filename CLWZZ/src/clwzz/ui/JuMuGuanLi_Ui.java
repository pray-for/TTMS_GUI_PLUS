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

public class JuMuGuanLi_Ui {

	public JTabbedPane JuMuGuanLi(){
		
		String[] strings_xinpin  = {"影片名称","影片类型","出产地","等级","时长","开始放映日期","结束放映日期"
				,"票价"};
		Object[][] objects_xinpin = {{"鬼影实录5：鬼次元","恐怖惊悚","美国","三级",88,
			"2016年3月12日","2016年4月12日",40},
			{"脑中蜜","剧情","德国","一级",90,
				"2016年3月13日","2016年4月13日",30},
			{"检察官外传","爆笑喜剧/犯罪","韩国","三级",120,
				"2016年3月13日","2016年4月13日",40},
			{"奔爱","剧情","中国","三级",120,
				"2016年3月14日","2016年4月14日",30},
			{"曝光","剧情","美国","二级",100,
				"2016年3月15日","2016年4月15日",40},
			{"长江七号爱地球","动画剧场","香港内地","一级",120,
				"2016年3月15日","2016年4月15日",40}};
		
		String[] strings_renqi = {"影片名称","影片类型","出产地","等级","时长","开始放映日期","结束放映日期"
				,"票价"};
		Object[][] objects_renqi = {{"疯狂动物城","动画动作冒险","美国","一级",109,
			"2016年3月20日","2016年4月20日",50},
			{"荒野猎人","冒险剧情惊悚","美国","一级",156,
				"2016年3月18日","2016年4月18日",50},
			{"女汉子真爱公式","喜剧爱情剧情","中国","三级",93,
				"2016年3月18日","2016年4月18日",40},
			{"飞鹰艾迪","喜剧运动传记","英国/美国","三级",105,
				"2016年3月18日","2016年4月18日",40}};
		
		String[] strings_tuijian = {"影片名称","影片类型","出产地","等级","时长","开始放映日期","结束放映日期"
				,"票价"};
		Object[][] objects_tuijian = {{"疯狂动物城","动画动作冒险","美国","一级",109,
			"2016年3月20日","2016年4月20日",50},
			{"爸爸去哪儿","情景喜剧","中国","一级",90,
				"2016年3月14日","2016年4月14日",30},
			{"长江七号爱地球","动画剧场","香港内地","一级",120,
					"2016年3月15日","2016年4月15日",40},
			{"波普先生和他的企鹅","喜剧","美国","一级",120,
				"2016年3月14日","2016年4月14日",30}};
		
		JTabbedPane jTabbedPane_jumuguanli = new JTabbedPane();
		JuMu juMu = new JuMu();
		jTabbedPane_jumuguanli.add("新品上市", juMu.JuMu_XinPin(strings_xinpin, objects_xinpin));
		jTabbedPane_jumuguanli.add("人气排行", juMu.JuMu_Renqi(strings_renqi, objects_renqi));
		jTabbedPane_jumuguanli.add("TODAY推荐", juMu.JuMu_Tuijian(strings_tuijian, objects_tuijian));
		jTabbedPane_jumuguanli.setBackground(Color.red);
		jTabbedPane_jumuguanli.setTabPlacement(JTabbedPane.TOP);
		
		return jTabbedPane_jumuguanli;
	}

}
class JuMu{
	
	private DefaultTableModel tableModel_renqi1;
	private JTable jTable_renqi1;
	private JTextField jTextField_renqi_mingcheng1;
	private JTextField jTextField_renqi_leixing1;
	private JTextField jTextField_renqi_chandi1;
	private JTextField jTextField_renqi_dengji1;
	private JTextField jTextField_renqi_shichang1;
	private JTextField jTextField_renqi_kaishifangyingriqi1;
	private JTextField jTextField_renqi_jieshufangyingriqi1;
	private JTextField jTextField_renqi_piaojia1;
	
	private DefaultTableModel tableModel_xinpin;
	private JTable jTable_Xinpin;
	private JTextField jTextField_xinpin_mingcheng;
	private JTextField jTextField_xinpin_leixing;
	private JTextField jTextField_xinpin_chandi;
	private JTextField jTextField_xinpin_dengji;
	private JTextField jTextField_xinpin_shichang;
	private JTextField jTextField_xinpin_kaishifangyingriqi;
	private JTextField jTextField_xinpin_jieshufangyingriqi;
	private JTextField jTextField_xinpin_piaojia;
	
	private DefaultTableModel tableModel_tuijian;
	private JTable jTable_tuijian;
	private JTextField jTextField_tuijian_mingcheng;
	private JTextField jTextField_tuijian_leixing;
	private JTextField jTextField_tuijian_chandi;
	private JTextField jTextField_tuijian_dengji;
	private JTextField jTextField_tuijian_shichang;
	private JTextField jTextField_tuijian_kaishifangyingriqi;
	private JTextField jTextField_tuijian_jieshufangyingriqi;
	private JTextField jTextField_tuijian_piaojia;
	
	public JPanel JuMu_Tuijian(String[] biaotou,Object[][] chengyuan){
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.orange);
		
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 5, 0, 5);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel("推荐列表");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_tuijian = ZhiBiao_tuijian(biaotou,chengyuan);
		jTable_tuijian.setBackground(Color.pink);
		jTable_tuijian.addMouseListener(new MouseAdapter() {//表格添加点击事件

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				int select1 = jTable_tuijian.getSelectedRow();  	//获取被选中的行
				Object oa = tableModel_tuijian.getValueAt(select1, 0);
				Object ob = tableModel_tuijian.getValueAt(select1, 1);
				Object oc = tableModel_tuijian.getValueAt(select1, 2);
				Object od = tableModel_tuijian.getValueAt(select1, 3);
				Object oe = tableModel_tuijian.getValueAt(select1, 4);
				Object of = tableModel_tuijian.getValueAt(select1, 5);
				Object og = tableModel_tuijian.getValueAt(select1, 6);
				Object oh = tableModel_tuijian.getValueAt(select1, 7);
				
				jTextField_tuijian_mingcheng.setText(oa.toString());
				jTextField_tuijian_leixing.setText(ob.toString());
				jTextField_tuijian_chandi.setText(oc.toString());
				jTextField_tuijian_dengji.setText(od.toString());
				jTextField_tuijian_shichang.setText(oe.toString());
				jTextField_tuijian_kaishifangyingriqi.setText(of.toString());
				jTextField_tuijian_jieshufangyingriqi.setText(og.toString());
				jTextField_tuijian_piaojia.setText(oh.toString());
				
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
		
		jPanel5.setLayout(new GridLayout(4,0));
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new FlowLayout());
		
		jPanel2.add(new JLabel("影片名称:"));
		jTextField_tuijian_mingcheng = new JTextField(10);
		jPanel2.add(jTextField_tuijian_mingcheng);
		
		jPanel2.add(new JLabel("影片类型:"));
		jTextField_tuijian_leixing = new JTextField(10);
		jPanel2.add(jTextField_tuijian_leixing);
		
		jPanel2.add(new JLabel("出产地:"));
		jTextField_tuijian_chandi = new JTextField(10);
		jPanel2.add(jTextField_tuijian_chandi);
		
		JPanel jPanel21 = new JPanel();
		jPanel21.setLayout(new FlowLayout());
		
		jPanel21.add(new JLabel("等级:"));
		jTextField_tuijian_dengji = new JTextField(10);
		jPanel21.add(jTextField_tuijian_dengji);
		
		jPanel21.add(new JLabel("时长:"));
		jTextField_tuijian_shichang = new JTextField(10);
		jPanel21.add(jTextField_tuijian_shichang);
		
		jPanel21.add(new JLabel("票价:"));
		jTextField_tuijian_piaojia = new JTextField(10);
		jPanel21.add(jTextField_tuijian_piaojia);
		
		JPanel jPanel22 = new JPanel();
		jPanel2.setLayout(new FlowLayout());
		
		jPanel22.add(new JLabel("结束放映日期:"));
		jTextField_tuijian_jieshufangyingriqi = new JTextField(15);
		jPanel22.add(jTextField_tuijian_jieshufangyingriqi);
		
		jPanel22.add(new JLabel("开始放映日期:"));
		jTextField_tuijian_kaishifangyingriqi = new JTextField(15);
		jPanel22.add(jTextField_tuijian_kaishifangyingriqi);
		
		
		
		JPanel jPanel3 = new JPanel();
		jPanel3.setLayout(new FlowLayout());
		
		final JButton jButton_tuijian_zengjia = new JButton("添加影片");
		jButton_tuijian_zengjia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String[] raa = {jTextField_tuijian_mingcheng.getText(),
						jTextField_tuijian_leixing.getText(),
						jTextField_tuijian_chandi.getText(),
						jTextField_tuijian_dengji.getText(),
						jTextField_tuijian_shichang.getText(),
						jTextField_tuijian_kaishifangyingriqi.getText(),
						jTextField_tuijian_jieshufangyingriqi.getText(),
						jTextField_tuijian_piaojia.getText(),};
				tableModel_tuijian.addRow(raa);
				
			}
		});
		
		final JButton jButton_tuijian_Xiuagi = new JButton("修改影片");
		jButton_tuijian_Xiuagi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int setect = jTable_tuijian.getSelectedRow();//判断被选中的某行
				if(setect != -1){
					
					tableModel_tuijian.setValueAt(jTextField_tuijian_mingcheng.getText(),
							setect, 0);
					tableModel_tuijian.setValueAt(jTextField_tuijian_leixing.getText(),
							setect, 0);
					tableModel_tuijian.setValueAt(jTextField_tuijian_chandi.getText(),
							setect, 0);
					tableModel_tuijian.setValueAt(jTextField_tuijian_dengji.getText(),
							setect, 0);
					tableModel_tuijian.setValueAt(jTextField_tuijian_shichang.getText(),
							setect, 0);
					tableModel_tuijian.setValueAt(jTextField_tuijian_kaishifangyingriqi.getText(),
							setect, 0);
					tableModel_tuijian.setValueAt(jTextField_tuijian_jieshufangyingriqi.getText(),
							setect, 0);
					tableModel_tuijian.setValueAt(jTextField_tuijian_piaojia.getText(),
							setect, 0);
					
				}
				
			}
		});
		
		final JButton jButton_tuijian_shanchu = new JButton("删除影片");
		jButton_tuijian_shanchu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int select = jTable_tuijian.getSelectedRow();
				if(select != -1){
					tableModel_tuijian.removeRow(select);
				}
				
			}
		});
		
		jPanel3.add(jButton_tuijian_zengjia);
		jPanel3.add(jButton_tuijian_Xiuagi);
		jPanel3.add(jButton_tuijian_shanchu);
		
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
	
	public JPanel JuMu_Renqi(String[] biaotou,Object[][] chengyuan){
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.orange);
		
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 5, 0, 5);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel("排行列表");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_renqi1 = ZhiBiao_renqi(biaotou,chengyuan);
		jTable_renqi1.setBackground(Color.magenta);
		jTable_renqi1.addMouseListener(new MouseAdapter() {//表格添加点击事件

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				int select1 = jTable_renqi1.getSelectedRow();  	//获取被选中的行
				Object oa1 = tableModel_renqi1.getValueAt(select1, 0);
				Object ob1 = tableModel_renqi1.getValueAt(select1, 1);
				Object oc1 = tableModel_renqi1.getValueAt(select1, 2);
				Object od1 = tableModel_renqi1.getValueAt(select1, 3);
				Object oe1 = tableModel_renqi1.getValueAt(select1, 4);
				Object of1 = tableModel_renqi1.getValueAt(select1, 5);
				Object og1 = tableModel_renqi1.getValueAt(select1, 6);
				Object oh1 = tableModel_renqi1.getValueAt(select1, 7);
				
				jTextField_renqi_mingcheng1.setText(oa1.toString());
				jTextField_renqi_leixing1.setText(ob1.toString());
				jTextField_renqi_chandi1.setText(oc1.toString());
				jTextField_renqi_dengji1.setText(od1.toString());
				jTextField_renqi_shichang1.setText(oe1.toString());
				jTextField_renqi_kaishifangyingriqi1.setText(of1.toString());
				jTextField_renqi_jieshufangyingriqi1.setText(og1.toString());
				jTextField_renqi_piaojia1.setText(oh1.toString());
				
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
		
		jPanel5.setLayout(new GridLayout(4,0));
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new FlowLayout());
		
		jPanel2.add(new JLabel("影片名称:"));
		jTextField_renqi_mingcheng1 = new JTextField(10);
		jPanel2.add(jTextField_renqi_mingcheng1);
		
		jPanel2.add(new JLabel("影片类型:"));
		jTextField_renqi_leixing1 = new JTextField(10);
		jPanel2.add(jTextField_renqi_leixing1);
		
		jPanel2.add(new JLabel("出产地:"));
		jTextField_renqi_chandi1 = new JTextField(10);
		jPanel2.add(jTextField_renqi_chandi1);
		
		JPanel jPanel21 = new JPanel();
		jPanel21.setLayout(new FlowLayout());
		
		jPanel21.add(new JLabel("等级:"));
		jTextField_renqi_dengji1 = new JTextField(10);
		jPanel21.add(jTextField_renqi_dengji1);
		
		jPanel21.add(new JLabel("时长:"));
		jTextField_renqi_shichang1 = new JTextField(10);
		jPanel21.add(jTextField_renqi_shichang1);
		
		jPanel21.add(new JLabel("票价:"));
		jTextField_renqi_piaojia1 = new JTextField(10);
		jPanel21.add(jTextField_renqi_piaojia1);
		
		JPanel jPanel22 = new JPanel();
		jPanel2.setLayout(new FlowLayout());
		
		jPanel22.add(new JLabel("结束放映日期:"));
		jTextField_renqi_jieshufangyingriqi1 = new JTextField(15);
		jPanel22.add(jTextField_renqi_jieshufangyingriqi1);
		
		jPanel22.add(new JLabel("开始放映日期:"));
		jTextField_renqi_kaishifangyingriqi1 = new JTextField(15);
		jPanel22.add(jTextField_renqi_kaishifangyingriqi1);
		
		
		
		JPanel jPanel3 = new JPanel();
		jPanel3.setLayout(new FlowLayout());
		
		final JButton jButton_renqi_zengjia = new JButton("添加影片");
		jButton_renqi_zengjia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String[] ra1 = {jTextField_renqi_mingcheng1.getText(),
						jTextField_renqi_leixing1.getText(),
						jTextField_renqi_chandi1.getText(),
						jTextField_renqi_dengji1.getText(),
						jTextField_renqi_shichang1.getText(),
						jTextField_renqi_kaishifangyingriqi1.getText(),
						jTextField_renqi_jieshufangyingriqi1.getText(),
						jTextField_renqi_piaojia1.getText(),};
				tableModel_renqi1.addRow(ra1);
				
			}
		});
		
		final JButton jButton_renqi_Xiuagi1 = new JButton("修改影片");
		jButton_renqi_Xiuagi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int setect = jTable_renqi1.getSelectedRow();//判断被选中的某行
				if(setect != -1){
					
					tableModel_renqi1.setValueAt(jTextField_renqi_mingcheng1.getText(),
							setect, 0);
					tableModel_renqi1.setValueAt(jTextField_renqi_leixing1.getText(),
							setect, 0);
					tableModel_renqi1.setValueAt(jTextField_renqi_chandi1.getText(),
							setect, 0);
					tableModel_renqi1.setValueAt(jTextField_renqi_dengji1.getText(),
							setect, 0);
					tableModel_renqi1.setValueAt(jTextField_renqi_shichang1.getText(),
							setect, 0);
					tableModel_renqi1.setValueAt(jTextField_renqi_kaishifangyingriqi1.getText(),
							setect, 0);
					tableModel_renqi1.setValueAt(jTextField_renqi_jieshufangyingriqi1.getText(),
							setect, 0);
					tableModel_renqi1.setValueAt(jTextField_renqi_piaojia1.getText(),
							setect, 0);
					
				}
				
			}
		});
		
		final JButton jButton_renqi_shanchu1 = new JButton("删除影片");
		jButton_renqi_shanchu1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int select = jTable_renqi1.getSelectedRow();
				if(select != -1){
					tableModel_renqi1.removeRow(select);
				}
				
			}
		});
		
		jPanel3.add(jButton_renqi_zengjia);
		jPanel3.add(jButton_renqi_Xiuagi1);
		jPanel3.add(jButton_renqi_shanchu1);
		
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
	
	public JPanel JuMu_XinPin(String[] biaotou,Object[][] chengyuan){
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.orange);
		
		jPanel.setLayout(new GridBagLayout());
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		Insets insets = new Insets(10, 5, 0, 5);
		gridBagConstraints.insets = insets;
		
		JLabel jLabel = new JLabel("新品列表");
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		jPanel.add(jLabel, gridBagConstraints);
		
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		jTable_Xinpin = ZhiBiao_xinpin(biaotou,chengyuan);
		jTable_Xinpin.setBackground(Color.pink);
		jTable_Xinpin.addMouseListener(new MouseAdapter() {//表格添加点击事件

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				int select1 = jTable_Xinpin.getSelectedRow();  	//获取被选中的行
				Object oa = tableModel_xinpin.getValueAt(select1, 0);
				Object ob = tableModel_xinpin.getValueAt(select1, 1);
				Object oc = tableModel_xinpin.getValueAt(select1, 2);
				Object od = tableModel_xinpin.getValueAt(select1, 3);
				Object oe = tableModel_xinpin.getValueAt(select1, 4);
				Object of = tableModel_xinpin.getValueAt(select1, 5);
				Object og = tableModel_xinpin.getValueAt(select1, 6);
				Object oh = tableModel_xinpin.getValueAt(select1, 7);
				
				jTextField_xinpin_mingcheng.setText(oa.toString());
				jTextField_xinpin_leixing.setText(ob.toString());
				jTextField_xinpin_chandi.setText(oc.toString());
				jTextField_xinpin_dengji.setText(od.toString());
				jTextField_xinpin_shichang.setText(oe.toString());
				jTextField_xinpin_kaishifangyingriqi.setText(of.toString());
				jTextField_xinpin_jieshufangyingriqi.setText(og.toString());
				jTextField_xinpin_piaojia.setText(oh.toString());
				
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
		
		jPanel5.setLayout(new GridLayout(4,0));
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new FlowLayout());
		
		jPanel2.add(new JLabel("影片名称:"));
		jTextField_xinpin_mingcheng = new JTextField(10);
		jPanel2.add(jTextField_xinpin_mingcheng);
		
		jPanel2.add(new JLabel("影片类型:"));
		jTextField_xinpin_leixing = new JTextField(10);
		jPanel2.add(jTextField_xinpin_leixing);
		
		jPanel2.add(new JLabel("出产地:"));
		jTextField_xinpin_chandi = new JTextField(10);
		jPanel2.add(jTextField_xinpin_chandi);
		
		JPanel jPanel21 = new JPanel();
		jPanel21.setLayout(new FlowLayout());
		
		jPanel21.add(new JLabel("等级:"));
		jTextField_xinpin_dengji = new JTextField(10);
		jPanel21.add(jTextField_xinpin_dengji);
		
		jPanel21.add(new JLabel("时长:"));
		jTextField_xinpin_shichang = new JTextField(10);
		jPanel21.add(jTextField_xinpin_shichang);
		
		jPanel21.add(new JLabel("票价:"));
		jTextField_xinpin_piaojia = new JTextField(10);
		jPanel21.add(jTextField_xinpin_piaojia);
		
		JPanel jPanel22 = new JPanel();
		jPanel2.setLayout(new FlowLayout());
		
		jPanel22.add(new JLabel("结束放映日期:"));
		jTextField_xinpin_jieshufangyingriqi = new JTextField(15);
		jPanel22.add(jTextField_xinpin_jieshufangyingriqi);
		
		jPanel22.add(new JLabel("开始放映日期:"));
		jTextField_xinpin_kaishifangyingriqi = new JTextField(15);
		jPanel22.add(jTextField_xinpin_kaishifangyingriqi);
		
		
		
		JPanel jPanel3 = new JPanel();
		jPanel3.setLayout(new FlowLayout());
		
		final JButton jButton_jumu_zengjia = new JButton("添加影片");
		jButton_jumu_zengjia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String[] ra = {jTextField_xinpin_mingcheng.getText(),
						jTextField_xinpin_leixing.getText(),
						jTextField_xinpin_chandi.getText(),
						jTextField_xinpin_dengji.getText(),
						jTextField_xinpin_shichang.getText(),
						jTextField_xinpin_kaishifangyingriqi.getText(),
						jTextField_xinpin_jieshufangyingriqi.getText(),
						jTextField_xinpin_piaojia.getText(),};
				tableModel_xinpin.addRow(ra);
				
			}
		});
		
		final JButton jButton_jumu_Xiuagi = new JButton("修改影片");
		jButton_jumu_Xiuagi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int setect = jTable_Xinpin.getSelectedRow();//判断被选中的某行
				if(setect != -1){
					
					tableModel_xinpin.setValueAt(jTextField_xinpin_mingcheng.getText(),
							setect, 0);
					tableModel_xinpin.setValueAt(jTextField_xinpin_leixing.getText(),
							setect, 0);
					tableModel_xinpin.setValueAt(jTextField_xinpin_chandi.getText(),
							setect, 0);
					tableModel_xinpin.setValueAt(jTextField_xinpin_dengji.getText(),
							setect, 0);
					tableModel_xinpin.setValueAt(jTextField_xinpin_shichang.getText(),
							setect, 0);
					tableModel_xinpin.setValueAt(jTextField_xinpin_kaishifangyingriqi.getText(),
							setect, 0);
					tableModel_xinpin.setValueAt(jTextField_xinpin_jieshufangyingriqi.getText(),
							setect, 0);
					tableModel_xinpin.setValueAt(jTextField_xinpin_piaojia.getText(),
							setect, 0);
					
				}
				
			}
		});
		
		final JButton jButton_jumu_shanchu = new JButton("删除影片");
		jButton_jumu_shanchu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int select = jTable_Xinpin.getSelectedRow();
				if(select != -1){
					tableModel_xinpin.removeRow(select);
				}
				
			}
		});
		
		jPanel3.add(jButton_jumu_zengjia);
		jPanel3.add(jButton_jumu_Xiuagi);
		jPanel3.add(jButton_jumu_shanchu);
		
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
	
	public JTable ZhiBiao_renqi(String[] biaotou,Object[][] chengyuan){
		
		tableModel_renqi1 = new DefaultTableModel(chengyuan, biaotou);
		JTable jTable1 = new JTable(tableModel_renqi1);
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
	
	public JTable ZhiBiao_tuijian(String[] biaotou,Object[][] chengyuan){
		
		tableModel_tuijian = new DefaultTableModel(chengyuan, biaotou);
		JTable jTable1 = new JTable(tableModel_tuijian);
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

	public JTable ZhiBiao_xinpin(String[] biaotou,Object[][] chengyuan){
	
		tableModel_xinpin = new DefaultTableModel(chengyuan, biaotou);
		JTable jTable1 = new JTable(tableModel_xinpin);
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
