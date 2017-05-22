package clwzz.ui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Main_Ui extends JFrame{

	private String path = "D:/Android Data/CLWZZ/src/iamge/";
	
	public Main_Ui(){
		this.setTitle("TODAY��Ժ����ϵͳ");
		this.setSize(800, 550);			//��С
		this.setLocationRelativeTo(null);		//������־���
		this.setDefaultCloseOperation(3);		//���ùرղ���
		this.setResizable(true);
		this.setIconImage(new ImageIcon(path+"tiele.bmp").getImage());
		
		YanChuTingGuanLi_Ui yanchuting = new YanChuTingGuanLi_Ui();
		PiaoWuGuanLi_Ui piaoWuGuanLi_Ui = new PiaoWuGuanLi_Ui();
		JuMuGuanLi_Ui juMuGuanLi_Ui = new JuMuGuanLi_Ui();
		XiTongSheZhi_Ui shouPiaoGuanLi_Ui = new XiTongSheZhi_Ui();
		ShouPiaoYuanZhangHaoGuanLi_Ui shouPiaoYuanZhangHaoGuanLi_Ui = new ShouPiaoYuanZhangHaoGuanLi_Ui();
		
		JTabbedPane jTabbedPane = new JTabbedPane();
		
		jTabbedPane.add("�ݳ�������",yanchuting.YanChuTingGuanLi());
		jTabbedPane.add("Ʊ�����", piaoWuGuanLi_Ui.PiaoWuGuanLi());
		jTabbedPane.add("��Ŀ����", juMuGuanLi_Ui.JuMuGuanLi());
		jTabbedPane.add("��ƱԱ����", shouPiaoYuanZhangHaoGuanLi_Ui.ShouPiaoYuanZhangHaoGuanLi());
		jTabbedPane.add("ϵͳ����", shouPiaoGuanLi_Ui.XiTongSheZhi());
		jTabbedPane.setBackground(Color.green);
		
		jTabbedPane.setTabPlacement(JTabbedPane.LEFT);
		this.add(jTabbedPane); 
		this.setVisible(true);
	}

}
