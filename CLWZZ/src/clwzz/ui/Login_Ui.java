package clwzz.ui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Login_Ui extends JFrame{
	
	private String path = "D:/Android Dat/CLWZZ/src/iamge/";
	private JButton jButton_denglu;
	private JButton jButton_zhuce;
	private JTextField textField_zhanghao;
	private JPasswordField textField_mima;
	private JButton jButton_denglu1;
	private JButton jButton_zhuce1;
	private JTextField textField_zhanghao1;
	private JPasswordField textField_mima1;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login_Ui login = new Login_Ui();
		login.showLogin();
		
	}
	public void showLogin(){
		
		this.setTitle("TODAY剧院管理系统");
		this.setSize(500, 360);			//大小
		this.setLocationRelativeTo(null);		//窗体出现居中
		this.setDefaultCloseOperation(3);		//设置关闭操作
		this.setResizable(true);
		this.setIconImage(new ImageIcon(path+"tiele.bmp").getImage());			//设置标题栏图标
		try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
		
		
		JPanel jPanel_shoupiaoyuan = new JPanel();
		JPanel jPanel_guanliyuan = new JPanel();
		
		
		
		jButton_denglu = new JButton("登陆");
		jButton_zhuce = new JButton("注册");
		
		textField_zhanghao = new JTextField(15);
		textField_mima = new JPasswordField(15);
		
		
		JLabel jLabel_zhanghao = new JLabel("账号");
		JLabel jLabel_mima = new JLabel("密码");
		
		JPanel jPanel_denglu = new JPanel();
		JPanel jPanel_mima = new JPanel();
		JPanel jPanel_button = new JPanel();
		
		jPanel_denglu.setLayout(new FlowLayout());
		jPanel_denglu.add(jLabel_zhanghao);
		jPanel_denglu.add(textField_zhanghao);
		
		jPanel_mima.setLayout(new FlowLayout());
		jPanel_mima.add(jLabel_mima);
		jPanel_mima.add(textField_mima);
		
		jPanel_button.setLayout(new FlowLayout());
		jPanel_button.add(jButton_denglu);
		jPanel_button.add(jButton_zhuce);
		
		JPanel jPanel_kong = new JPanel();
		JPanel jPanel_yi = new JPanel();
		jPanel_yi.setLayout(new GridLayout(3, 1));
		jPanel_yi.add(jPanel_kong);
		jPanel_yi.add(jPanel_denglu);
		jPanel_yi.add(jPanel_mima);
		
		JPanel jPanel_biaoti2 = new JPanel();
		jPanel_biaoti2.setLayout(new GridLayout(1,3, 10, 10));
		jPanel_biaoti2.setBackground(Color.green);
		
		JLabel jLabel_biaoti12 = new JLabel(new ImageIcon(path+"张甜logo3.jpg"));
		JPanel jPanel102 = new JPanel();
		jPanel102.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		jPanel102.setBackground(Color.green);

		JLabel jLabelhuan2 = new JLabel("欢迎");
		jLabelhuan2.setFont(new java.awt.Font("Dialog", 1, 40)); 
		jLabelhuan2.setForeground(Color.red);
		jPanel102.add(jLabelhuan2);
		jPanel_biaoti2.add(jPanel102);
		jPanel_biaoti2.add(jLabel_biaoti12);
		
		
		
		JPanel jPanel112 = new JPanel();
		jPanel112.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		jPanel112.setBackground(Color.green);
		
		JLabel jLabelhuan12 = new JLabel("光临");
		jLabelhuan12.setFont(new java.awt.Font("Dialog", 1, 40)); 
		jLabelhuan12.setForeground(Color.red);
		
		
		jPanel112.add(jLabelhuan12);
		
		
		jPanel_biaoti2.add(jPanel112);
		
		jButton_denglu1 = new JButton("登陆");
		jButton_zhuce1 = new JButton("注册");
		
		textField_zhanghao1 = new JTextField(15);
		textField_mima1 = new JPasswordField(15);
		
		JLabel jLabel_zhanghao1 = new JLabel("账号");
		JLabel jLabel_mima1 = new JLabel("密码");
		
		JPanel jPanel_denglu1 = new JPanel();
		JPanel jPanel_mima1 = new JPanel();
		JPanel jPanel_button1 = new JPanel();
		
		jPanel_denglu1.setLayout(new FlowLayout());
		jPanel_denglu1.add(jLabel_zhanghao1);
		jPanel_denglu1.add(textField_zhanghao1);
		
		jPanel_mima1.setLayout(new FlowLayout());
		jPanel_mima1.add(jLabel_mima1);
		jPanel_mima1.add(textField_mima1);
		
		jPanel_button1.setLayout(new FlowLayout());
		jPanel_button1.add(jButton_denglu1);
		jPanel_button1.add(jButton_zhuce1);
		
		JPanel jPanel_kong1 = new JPanel();
		JPanel jPanel_yi1 = new JPanel();
		jPanel_yi1.setLayout(new GridLayout(3, 1));
		jPanel_yi1.add(jPanel_kong1);
		jPanel_yi1.add(jPanel_denglu1);
		jPanel_yi1.add(jPanel_mima1);
		
		JPanel jPanel_biaoti = new JPanel();
		jPanel_biaoti.setLayout(new GridLayout(1,3, 10, 10));
		jPanel_biaoti.setBackground(Color.blue);
		
		JLabel jLabel_biaoti1 = new JLabel(new ImageIcon(path+"张甜logo3.jpg"));
		JPanel jPanel10 = new JPanel();
		jPanel10.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		jPanel10.setBackground(Color.blue);

		JLabel jLabelhuan = new JLabel("欢迎");
		jLabelhuan.setFont(new java.awt.Font("Dialog", 1, 40)); 
		jLabelhuan.setForeground(Color.red);
		jPanel10.add(jLabelhuan);
		jPanel_biaoti.add(jPanel10);
		jPanel_biaoti.add(jLabel_biaoti1);
		
		
		JPanel jPanel11 = new JPanel();
		jPanel11.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		jPanel11.setBackground(Color.blue);
		
		JLabel jLabelhuan1 = new JLabel("光临");
		jLabelhuan1.setFont(new java.awt.Font("Dialog", 1, 40)); 
		jLabelhuan1.setForeground(Color.red);
		
		
		jPanel11.add(jLabelhuan1);
		
		
		jPanel_biaoti.add(jPanel11);
		
		jPanel_guanliyuan.setLayout(new GridLayout(3, 1));
		jPanel_guanliyuan.add(jPanel_biaoti);
		jPanel_guanliyuan.add(jPanel_yi1);
		jPanel_guanliyuan.add(jPanel_button1);
		jPanel_guanliyuan.setBackground(Color.BLUE);
		
		jPanel_shoupiaoyuan.setLayout(new GridLayout(3, 1));
		jPanel_shoupiaoyuan.add(jPanel_biaoti2);
		jPanel_shoupiaoyuan.add(jPanel_yi);
		jPanel_shoupiaoyuan.add(jPanel_button);
		jPanel_shoupiaoyuan.setBackground(Color.GREEN);
		
		JTabbedPane jTabbedPane = new JTabbedPane();
		jTabbedPane.addTab("售票员登陆",
				jPanel_shoupiaoyuan);
		//jTabbedPane.add(, );
		jTabbedPane.add("管理员登陆", jPanel_guanliyuan);
		jTabbedPane.setTabPlacement(JTabbedPane.TOP);
		jTabbedPane.setBackground(Color.PINK);
		
		this.setLayout(new GridLayout(1, 1));
		this.add(jTabbedPane);
		
		this.setVisible(true);
		
		jButton_denglu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				ShouPiao_UI piao_UI = new ShouPiao_UI();
				jButton_denglu.setBackground(Color.BLUE);
			}
		});
		jButton_denglu1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				Main_Ui gongZuo_Ui = new Main_Ui();
				jButton_denglu1.setBackground(Color.BLUE);
			}
		});
	}
	
	
}
