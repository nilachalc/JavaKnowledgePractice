package controlstatement;

public class ThirdStar {

	public static void main(String[] args) 
	{
		int line = 10;
		for (int i = 1; i <= (line / 2) + 1; i++)
		{
			for (int j = (line / 2) - i; j >= 0; j--)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2) - 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= line / 2; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for (int j = (line / 2) - i; j >= 0; j--)
			{
				System.out.print("*");
			}
			for (int j = (line / 2) - i; j >= 1; j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
