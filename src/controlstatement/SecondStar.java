package controlstatement;
public class SecondStar 
{
	public static void main(String[] args) 
	{
		int line = 5;
		for (int i = 1; i <= line; i++)
		{
			for (int j = line - i; j >= 0; j--)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
