abstract class Type{
	public abstract  void type1();
	public abstract  void type2();
	public void type3(){
		System.out.println("�������г��˳��󷽷������о����ʵ�ַ���");
	}
	
}
class stract extends Type{
	public void type1(){
		System.out.println("������abstract class");
	}
	public void type2(){
		System.out.println("���󷽷�");
	}
	public void type3(){
		System.out.printf("���о����ʵ�ַ���");
	}
}
public class abstractuUse {
	public static void main(String[] agrs){
		stract s=new stract();
		s.type1();
		s.type2();
		s.type3();
	}

}
