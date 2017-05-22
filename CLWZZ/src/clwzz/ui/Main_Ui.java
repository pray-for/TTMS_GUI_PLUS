package clwzz.ui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Main_Ui extends JFrame{

	private String path = "D:/Android Data/CLWZZ/src/iamge/";
	
	public Main_Ui(){
		this.setTitle("TODAY剧院管理系统");
		this.setSize(800, 550);			//大小
		this.setLocationRelativeTo(null);		//窗体出现居中
		this.setDefaultCloseOperation(3);		//设置关闭操作
		this.setResizable(true);
		this.setIconImage(new ImageIcon(path+"tiele.bmp").getImage());
		
		YanChuTingGuanLi_Ui yanchuting = new YanChuTingGuanLi_Ui();
		PiaoWuGuanLi_Ui piaoWuGuanLi_Ui = new PiaoWuGuanLi_Ui();
		JuMuGuanLi_Ui juMuGuanLi_Ui = new JuMuGuanLi_Ui();
		XiTongSheZhi_Ui shouPiaoGuanLi_Ui = new XiTongSheZhi_Ui();
		ShouPiaoYuanZhangHaoGuanLi_Ui shouPiaoYuanZhangHaoGuanLi_Ui = new ShouPiaoYuanZhangHaoGuanLi_Ui();
		
		JTabbedPane jTabbedPane = new JTabbedPane();
		
		jTabbedPane.add("演出厅管理",yanchuting.YanChuTingGuanLi());
		jTabbedPane.add("票务管理", piaoWuGuanLi_Ui.PiaoWuGuanLi());
		jTabbedPane.add("剧目管理", juMuGuanLi_Ui.JuMuGuanLi());
		jTabbedPane.add("售票员管理", shouPiaoYuanZhangHaoGuanLi_Ui.ShouPiaoYuanZhangHaoGuanLi());
		jTabbedPane.add("系统设置", shouPiaoGuanLi_Ui.XiTongSheZhi());
		jTabbedPane.setBackground(Color.green);
		
		jTabbedPane.setTabPlacement(JTabbedPane.LEFT);
		this.add(jTabbedPane); 
		this.setVisible(true);
	}

}
