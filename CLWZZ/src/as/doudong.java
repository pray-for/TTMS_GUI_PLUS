package as;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class doudong extends JFrame{
	private JButton a1;
    public doudong()
    {
        super();
        setTitle("窗口抖动");
        setBounds(400,400,400,400);
        Container a=getContentPane();//创建容器对象
        a1=new JButton("窗口抖动");//创建一个按钮“窗口抖动”
        a1.setBackground(Color.black);
        a.setLayout(new FlowLayout());
        a.add(a1);//添加按钮
        a1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int num=10;//抖动次数
		        Point point = a1.getLocation();//窗体位置
		        for(int i=10;i>0;i--){      
		            for(int  j=num;j>0;j--){
		            point.y+=i;
		            setLocation(point);
		            point.x+=i;
		            setLocation(point);
		            point.y-=i;
		            setLocation(point);
		            point.x-=i;
		            setLocation(point);     
		             
		        }
		        }
			}
		});
        setVisible(true);//窗口可见
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口关闭
    }
   /* public void actionPerformed(ActionEvent e){
        int num=10;//抖动次数
        Point point = getLocation();//窗体位置
        for(int i=10;i>0;i--){      
            for(int  j=num;j>0;j--){
            point.y+=i;
            setLocation(point);
            point.x+=i;
            setLocation(point);
            point.y-=i;
            setLocation(point);
            point.x-=i;
            setLocation(point);
             
             
        }
        }
         
    }*/
    public static void main(String[] args)
    {
        new doudong();
             
         
    }
 
}