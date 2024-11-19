package day4;

public class PerfectNumber2 {

	public static void main(String[] args) {
		int n;
		for(n=1;n<=10000;n++)
		{
		
		int i;
		int sum=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==n)
		{
			System.out.println(n);
		}
		
		}

	}

}
