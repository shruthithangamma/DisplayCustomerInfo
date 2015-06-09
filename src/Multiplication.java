
public class Multiplication {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++)
		{
			System.out.print("\t"+i);
		}
		System.out.println();
System.out.println("---------------------------------------------------------------------------------");
	
	for(int i=1; i<=9; i++)
	{
		System.out.print(i+"|");
		for(int j=1; j<=9; j++)	
		{
			System.out.printf("\t" + i * j);
			/*if(i * j < 10)
			{
				System.out.printf("\t" + i * j);
			}else{
				System.out.printf("\t"+ i * j);
			}*/
		}
	System.out.println();
	}
	}
}
