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
        setTitle("���ڶ���");
        setBounds(400,400,400,400);
        Container a=getContentPane();//������������
        a1=new JButton("���ڶ���");//����һ����ť�����ڶ�����
        a1.setBackground(Color.black);
        a.setLayout(new FlowLayout());
        a.add(a1);//��Ӱ�ť
        a1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int num=10;//��������
		        Point point = a1.getLocation();//����λ��
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
        setVisible(true);//���ڿɼ�
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ô��ڹر�
    }
   /* public void actionPerformed(ActionEvent e){
        int num=10;//��������
        Point point = getLocation();//����λ��
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