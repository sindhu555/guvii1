import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			      Scanner sc=new Scanner(System.in);
                 String str=sc.nextLine();
                 int count=1;
                 for(int i=1;i<str.length();i++)
	     {
	     	if(str.charAt(i)=='.' &&str.charAt(i+1)==' ')
	     	{
	     		count++;
	     	}
	     	else if(str.charAt(i)==' ' &&str.charAt(i+1)==' ')
	     	{
	     		count++;
	     	}
	     	else if(str.charAt(i)=='.')
	     	{
	     		count++;
	     	}
	     	
	     }
	     System.out.println(count);
	}
}
	     
