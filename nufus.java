
public class Nufus {

	public void kacyıl()
	{
		int i=0,anufus=10000000,bnufus=40000000;
		for (;;) 
		{
			anufus=anufus+(anufus/4);
			bnufus=bnufus+((bnufus*12)/100);
			i++;
			if(anufus>bnufus)
				{
				 System.out.print(i);
				 break;
				}
		}
		
		
	}
}
