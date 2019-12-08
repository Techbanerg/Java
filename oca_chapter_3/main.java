package oca_chapter_3;

public class main {
	/*Creating and Manipulating Strings The String class is such a fundamental class that you’d be hard-pressed to write code without it.
After all, you can’t even write a main() method without using the String class. A string is basically a sequence of characters; here’s an example:
String name = "Fluffy";
As you learned in Chapter 1, “Java Building Blocks,” this is an example of a reference type. You also learned that reference types are created using the new keyword. Wait a minute.
Something is missing from the previous example: it doesn’t have new in it! In Java, these two  snippets both create a String:
String name = "Fluffy";
String name = new String("Fluffy");
Placing one String before the other String and combining them together is called string concatenation. The OCA exam creators like string concatenation because the + operator
can be used in two ways within the same line of code. There aren’t a lot of rules to know for  this, but you have to know them well:
1. If both operands are numeric, + means numeric addition.
2. If either operand is a String, + means concatenation.
Now let’s look at some examples:
*/
	public static void main(String[] args) {
		System.out.println(1 + 2); // 3
		System.out.println("a" + "b"); // ab
		System.out.println("a" + "b" + 3); // ab3
		System.out.println(1 + 2 + "c"); // 3c
/*  When you see this, just take it slow and remember the three rules—and be sure to check the variable types. In this example, we start with the third rule, which tells us to consider
1 + 2. The first rule gives us 3. Next we have 3 + three. Since three is of type int, we still use the fi rst rule, giving us 6. Next we have 6 + four. Since four is of type String, we
switch to the second rule and get a final answer of "64". When you see questions like this, just take your time and check the types. Being methodical pays off.
There is only one more thing to know about concatenation, but it is an easy one. In this example, you just have to remember what += does. s += "2" means the same thing as s =
s + "2".
*/
		String s = "1"; // s currently holds "1"
		s += "2"; // s currently holds "12"
		s += 3; // s currently holds "123"
		System.out.println(s); // 123
		
	}




   

}
