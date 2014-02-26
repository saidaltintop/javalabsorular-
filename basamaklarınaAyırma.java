import javax.print.DocFlavor.STRING;


public class BasamaklarınaAyırma {

	public String BasamaklarınaAyır(int sayi)
	{
		int binler,yuzler,onlar,birler,yedek1,yedek2; 
		binler=sayi/1000;
		yedek1=sayi%1000;
		yuzler=yedek1/100;
		yedek2=yedek1%100;
		onlar=yedek2/10;
		birler=yedek2%10;
		return "birler basamagı => "+birler+"\nonlar basamagı => "+onlar+"\nyuzler basamagı => "+yuzler+"\nbinler basamagı => "+binler;
	}
}
