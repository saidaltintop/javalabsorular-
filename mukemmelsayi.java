
public class Mukemmelsayi {

	public void Mukemmelsayilar()
	{
		for (int i = 1; i<1000; i++)
		{
			int toplam=0;
			for (int j = 1; j < i ;j++)
			{
				if(i%j==0)
				{
					toplam+=j;
				}
			}
			if(i==toplam)
			{
				System.out.print(i+",");
			}
		}
	}
}
