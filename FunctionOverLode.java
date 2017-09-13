
class A{
	
 void desplay(Object obj){
		
	 System.out.println("I am The Fust Calss Function");
	}
}
class B extends A{
	
	 void desplay(String s){
			
		 System.out.println("I am The 2nd Calss Function");
		}
	}


public class FunctionOverLode {
	public static void main(String[] args) {
	//DMD
		A a=new A();
		B b=new B();
		A a1=new B();
	
	//this is not valid Type Miss mach;
	//B b1=new A();
		
		a.desplay(55);//pass any value because object class is parent of all java class
		
		b.desplay("hitesh");// 2nd class desplay run because pass string
		
		a1.desplay("hitesh");
		
		
		
		
	
	
	}
}