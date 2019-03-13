package simple_lambda_expression;

import java.util.ArrayList;

// First lets know what is Lambda expressions . Lambda Expressions enables you to  know functional Style programming.
// Functional Style programming  in Java enables you to write declarative code .
// Syntax lambda operator -> body
// where lambda operator can be :
// zero parameter:
// () -> System.out.println("zero parameter lambda")
// (p) -> System.out.printn("One parameter:" +P);
// (p1, p2) -> System.out.println("Multiple Parameter")

interface Custom
{
	   int caluculateInhand(int Gincome, int Incometax);
	   
	   //void calculateSavings() {
	   //	   System.out.println("Dada pod Maran");
	   //}
	   
}


interface FuncInter1
{
	   int operation(int a, int b);
}
//interface2
interface FuncInter2
{
	   void sayMessage(String message);
}

interface FuncInter3 {
	void talk(String word);
}

// interface custom 



public class Main {
	//interface1
   
   public static void main(String args[]) {
	   ArrayList<Integer> arrL = new ArrayList<Integer>();
	   arrL.add(1);
	   arrL.add(6);
	   arrL.add(7);
	   arrL.forEach(n -> System.out.println(n));
	   arrL.forEach(n -> {if (n%2 == 0 ) System.out.println("Divisible by 2 is :"+n);});
	   int sample [] = new int[4];
	   for (int i = 0; i<sample.length; i++ ) {
	        sample[i] = i +5;
	   }
	   for (int i : sample) {
		   System.out.println(i);
	   }
	   // assign interface to lambda
	   FuncInter1 add = (int x, int y) -> x + y;
	   FuncInter1 multiply = (int x, int y) -> x *y;
	   
	   System.out.println(add);
	   System.out.println(multiply);
	   
	   FuncInter2 fObj = message ->System.out.print("Laora "+ message);
	   fObj.sayMessage("bara");
	   
	   Manager obj2 = new Manager();
	   obj2.travel();
	   obj2.caluculateInhand(500000, 50000);
	   System.out.println(obj2.caluculateInhand(5000000, 50000));
	   
	   FuncInter3 greetFunction = word -> System.out.print("lambda "+word);
	   greetFunction.talk("dhamna");
	   //System.out.println(greetFunction);
	   
	   
	   //predicate
	   Emp e1 =  new Emp("shaunkha", 4, 9999.00);
	   Emp e2 = new Emp("oendrila", 5, 5000.00);
	   Emp e3 = new Emp("jhinuk", 3, 4000.00);
	   
	   ArrayList<Emp> empArrList = new ArrayList<>();
	   empArrList.add(e1);
	   empArrList.add(e2);
	   empArrList.add(e3);
	   
	   Predicate<Emp> predicate = e ->e.getPerformanceRating() >=5;
	   filter (empArrList, predicate);    		
   }
   static void filter(ArrayList<Emp> list, Predicate <Emp> rule )
   {
	   for (Emp e: list) {
		   if (rule.test(e)) {
			   System.out.println(e);
		   }
	   }
   }
}
