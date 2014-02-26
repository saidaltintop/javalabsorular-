import java.util.Scanner;


public class Labsoruları {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi;
		Scanner scan=new Scanner(System.in);
		Asalsayi asal=new Asalsayi();
		BasamaklarınaAyırma ayır=new BasamaklarınaAyırma();
		Nufus sayim=new Nufus();
		Mukemmelsayi mukemmel=new Mukemmelsayi();
		System.out.print("lütfen bir sayi giriniz => " );
		sayi=scan.nextInt();
		System.out.println(ayır.BasamaklarınaAyır(sayi));
		if(asal.Asalsayimi(sayi)==true)
		{
			System.out.println(sayi+" asal sayıdır");
		}
		else
			System.out.println(sayi+" asal sayı degildir");
		System.out.print(sayi+"'e kadar tum asal sayılar\n");
		asal.tumAsalsayilar(sayi);
		System.out.println("\n");
		sayim.kacyıl();
		System.out.print(" yıl sonra a ulkesi b ulkesini gecer\n");
		System.out.print("1 ile 1000 arasındaki kendisi hariç bölenlerinin toplamı kendisine eşit olan sayılar => ");
		mukemmel.Mukemmelsayilar();
		
	}

}
