import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Color;
public class AWTuse {
	public static void main(String[] agrs){
		
		/*FlowLayout("王者荣耀",FlowLayout.CENTER);
		FlowLayout("王者荣耀",FlowLayout.LEADING);
		FlowLayout("王者荣耀",FlowLayout.LEFT);
		FlowLayout("王者荣耀",FlowLayout.RIGHT);
		FlowLayout("王者荣耀",FlowLayout.TRAILING);*/
		//BorderLayout();
		GridLayout();
	}
	
	
	
	//FlowLayout流式布局
	public static void FlowLayout(String t,int type){
		Frame f=new Frame();
		f.setTitle(t);
		f.setSize(500,500);
		f.setBackground(Color.RED);
		f.setLocation(500,500);
		f.setVisible(true);
		f.setResizable(true);
		f.setLayout(new FlowLayout(type));
		Button b1=new Button("韩信");
		Button b2=new Button("李白");
		Button b3=new Button("守约");
		Button b4=new Button("赵云");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
	}
	
	
	//BorderLayout边缘布局
	public static void BorderLayout(){
		Frame f=new Frame();
		f.setTitle("王者布局");
		f.setSize(500,500);
		f.setBackground(Color.BLACK);
		f.setLocation(500,500);
		f.setVisible(true);
		f.setResizable(true);
		f.setLayout(new BorderLayout());
		Button b1=new Button("韩信");
		Button b2=new Button("李白");
		Button b3=new Button("守约");
		Button b4=new Button("赵云");
		Button b5=new Button("诸葛");
		f.add(b1,BorderLayout.EAST);
		f.add(b2,BorderLayout.CENTER);
		f.add(b3,BorderLayout.NORTH);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.SOUTH);
	}
	
	
	
	//GridLayout网格布局
	public static void GridLayout(){
		Frame f=new Frame();
		f.setTitle("GridLayout网格布局");
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
