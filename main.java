import java.util.Scanner;


public class Labsoruları {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi,kupicinsa,x=5,y=9;
		Scanner scan=new Scanner(System.in);
		Scanner kupicin=new Scanner(System.in);
		Asalsayi asal=new Asalsayi();
		BasamaklarınaAyırma ayır=new BasamaklarınaAyırma();
		Nufus sayim=new Nufus();
		Mukemmelsayi mukemmel=new Mukemmelsayi();
		sayıverakamlarınınkupu kupicinsayi=new sayıverakamlarınınkupu();
		ikizsayi ikizsayilar=new ikizsayi();
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
		System.out.print("\nsayının rakamlarının kupleri toplamı sayıya eşitmi kontolu için sayiyi giriniz => ");
		kupicinsa=kupicin.nextInt();
		if(kupicinsayi.sayırakamlarınınkupuneesitmi(kupicinsa)==true)
		{
			System.out.println("sayinın rakamlarının kuplerinin toplamıda sayıya esittir.");
		}
		else
			System.out.println("sayinın rakamlarının kuplerinin toplamıda sayıya esit degildir.");
		System.out.println("swap dan once x => "+x+" y => "+y);
		new swap(x, y);
		ikizsayilar.ikiz();
	}

}
