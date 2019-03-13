package learning_chapter4;

import java.util.ArrayList;

interface FuncInterface
{
	//void abstractFun(int x);
	void concreteFun(String y);
	
	default void normalFun()
	{
		System.out.println("Hello Normal Fun");
	}
}
public class Main {
	public static void main(String[] args) {
		// FuncInterface fobj = (int x)->System.out.println(x*2);
		FuncInterface fobj2 = (String y)->System.out.println("Podmara: " + y);
		fobj2.concreteFun("laora");
        // fobj.abstractFun(5);	
        fobj2.normalFun();
        ArrayList <String> sample = new ArrayList <String>();
        sample.add("gudmarani");
        sample.add("laora");
        
        ArrayList <Integer> arr = new ArrayList <Integer> ();
        arr.add(5);
        arr.add(11);
        arr.add(46);
        
        sample.forEach(n -> System.out.println(n));
        arr.forEach(n -> { if (n % 2 == 0) System.out.println(n);});
        
	}

}
