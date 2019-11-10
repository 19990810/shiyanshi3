abstract class Type{
	public abstract  void type1();
	public abstract  void type2();
	public void type3(){
		System.out.println("抽象类中出了抽象方法，还有具体的实现方法");
	}
	
}
class stract extends Type{
	public void type1(){
		System.out.println("抽象类abstract class");
	}
	public void type2(){
		System.out.println("抽象方法");
	}
	public void type3(){
		System.out.printf("还有具体的实现方法");
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
