import java.util.scanner;
class Evenodd
{
public static void main(String[]args){
	
	int n;
	System.out.print("ENTER ANY NUMBER ");
	scanner r=new scanner(System.in);
	n=r.nextInt();
	if(n%2==0)
	{
		System.out.print("Even number");
	}
	else
	{
		System.out.print("ODD NUMBER");
	} 
}

	
}
