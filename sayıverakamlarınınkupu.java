public class sayıverakamlarınınkupu {
	private int yuzler,onlar,birler,yedek1;
	public boolean sayırakamlarınınkupuneesitmi(int sayi) {
		yuzler=sayi/100;
		yedek1=sayi%100;
		onlar=yedek1/10;
		birler=yedek1%10;
		if(sayi==Math.pow(yuzler, 3)+Math.pow(onlar, 3)+Math.pow(birler, 3))
		{
			return true;
		}
		return false;
	}
}
