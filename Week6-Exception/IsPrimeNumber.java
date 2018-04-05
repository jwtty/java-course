package Exception;

import java.util.Scanner;

public class IsPrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		CheckPrime check = new CheckPrime();
		try
		{
			check.check(num);
			System.out.println("The number is not a prime number.");
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
	}
}