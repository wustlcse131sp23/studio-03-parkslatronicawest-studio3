package studio3;

import java.util.Arrays;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] primes = new boolean [1000000];
		int j;  
		Arrays.fill(primes, true); 
		for (int i= 2; i < Math.sqrt(primes.length); i++)
		{
			if (primes[i] == true) 
			{
				for (j = i*i; j < primes.length ; j = j + i)
				{
					primes[j] = false; 
				}
			}
		}
		for (int i = 2; i < primes.length ;i++)
		{
			if (primes[i] == true)
			{
				System.out.println(i);
			}
		} 
		
		
				
		
		

	}

}
