import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Color;
public class AWTuse {
	public static void main(String[] agrs){
		
		/*FlowLayout("������ҫ",FlowLayout.CENTER);
		FlowLayout("������ҫ",FlowLayout.LEADING);
		FlowLayout("������ҫ",FlowLayout.LEFT);
		FlowLayout("������ҫ",FlowLayout.RIGHT);
		FlowLayout("������ҫ",FlowLayout.TRAILING);*/
		//BorderLayout();
		GridLayout();
	}
	
	
	
	//FlowLayout��ʽ����
	public static void FlowLayout(String t,int type){
		Frame f=new Frame();
		f.setTitle(t);
		f.setSize(500,500);
		f.setBackground(Color.RED);
		f.setLocation(500,500);
		f.setVisible(true);
		f.setResizable(true);
		f.setLayout(new FlowLayout(type));
		Button b1=new Button("����");
		Button b2=new Button("���");
		Button b3=new Button("��Լ");
		Button b4=new Button("����");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
	}
	
	
	//BorderLayout��Ե����
	public static void BorderLayout(){
		Frame f=new Frame();
		f.setTitle("���߲���");
		f.setSize(500,500);
		f.setBackground(Color.BLACK);
		f.setLocation(500,500);
		f.setVisible(true);
		f.setResizable(true);
		f.setLayout(new BorderLayout());
		Button b1=new Button("����");
		Button b2=new Button("���");
		Button b3=new Button("��Լ");
		Button b4=new Button("����");
		Button b5=new Button("���");
		f.add(b1,BorderLayout.EAST);
		f.add(b2,BorderLayout.CENTER);
		f.add(b3,BorderLayout.NORTH);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.SOUTH);
	}
	
	
	
	//GridLayout���񲼾�
	public static void GridLayout(){
		Frame f=new Frame();
		f.setTitle("GridLayout���񲼾�");
		f.setSize(500,500);
		f.setBackground(Color.BLACK);
		f.setLocation(100,100);
		f.setVisible(true);
		f.setResizable(true);
		f.setLayout(new GridLayout(2,3));
		for(int i=1;i<=2*3;i++){
			Button b=new Button(String.valueOf(i));
			f.add(b);
		}
	}
}
