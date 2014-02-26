
public class Asalsayi {

	public boolean Asalsayimi(int sayi)
	{	
	int j=0;
	for (int i = 2; i < sayi ; i++) {
		if(sayi%i==0)
		{
			j++;
		}
	}
	if(j==0)
		return true;
	else
		return false;

	}
	public void tumAsalsayilar(int sayi)
	{	
		for(int n=2;n<=sayi;n++)
		{
			int j=0;
				for (int i = 2; i < n ; i++)
				{
					if(n%i==0)
					{
						j++;
					}
				}
				if(j==0)
					System.out.print(n+",");			
		}
	}
}
