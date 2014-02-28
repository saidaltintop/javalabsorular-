
public class ikizsayi {
	
	public void ikiz()
	{
		int gecicisayi=0;
   for(int asalsayimi=10;asalsayimi<=99;asalsayimi++)	//içerdeki for a tek tek sayý gönderiyoruz asallýgýný konrol etmesi için	
	{
			int girdi=0;
		
			for(int i=2;i<asalsayimi;i++)//bu for içinde asal sayi olup olmadýgýný kontrol ediyoruz
	        {
				if(asalsayimi % i == 0)// if e giren sayi asal degildir.//saidaltýntop
				{
					girdi++;
				}
			}
			if(girdi==0)//bu if e giren asal sayýdýr
			{ 
					if(asalsayimi-gecicisayi==2)//ikiz asal olup olmadýgýný kontrol edýyoruz
					{   
						System.out.println("ikiz sayılar => " + asalsayimi +" ve "+gecicisayi);
					}
				    gecicisayi=asalsayimi;//bunu yapma nedenimiz gelecek sayýdan bi onceki sayýyý tutmamýz çünkü daha sonra ikiz olup olmadýgýný kontrol etmek için bi önceki asal sayý gerekecek
			}	
	}	
}
}
