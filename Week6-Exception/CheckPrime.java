package Exception;

public class CheckPrime
{
	public void check(int num) throws MyException
	{
		int limit = (int)Math.sqrt(num);
		for (int i = 2; i <= limit; ++i)
		{
			if(num % i == 0)
				return;
		}
		throw new MyException("The number is a prime number.");
	}
}