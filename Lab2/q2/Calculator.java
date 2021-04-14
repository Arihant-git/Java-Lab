public class Calculator{
      public static void main(String[] args){
	    System.out.println(args[0]+"  "+args[1]+"  "+args[2]+" is equal to ");
	    int a = Integer.parseInt(args[0]);
	    int b = Integer.parseInt(args[2]);
	    String operator = args[1];
	    String add = "+";
	    String sub = "-";
	    String multiply = "*";
	    String divide = "/";

	    if(operator.equals(add))
		System.out.println(a+b);

	    else if(operator.equals(sub))
		System.out.println(a-b);

	    else if(operator.equals(multiply))
		System.out.println(a*b);

	    else
		System.out.println(a/b);

}
}