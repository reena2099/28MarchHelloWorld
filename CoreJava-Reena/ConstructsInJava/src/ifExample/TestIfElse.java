package ifExample;

public class TestIfElse {
      public static void main(String[] args)
      {
    	  int a,b,c;
    	  a=28;b=23;c=3;
    	  
    	  if(a>b && a>c)
    	  {
    		System.out.println("A is the biggest");  
    	  }
    	  
    	  else if(b>a && b>c)
    	  {
    		  System.out.println("B is the biggest");
    	  }
    	  else
    		  System.out.println("C is the biggest ");
      }
      
}
