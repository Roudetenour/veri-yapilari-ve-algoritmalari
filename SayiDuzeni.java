/**
 * Created by Nur Nabhan on 8/17/2017.
 */
import java.util.Scanner;
public class SayiDuzeni {
    public  static void main ( String args[])
    {
        int sayi , kalan , sonuc , counter=0 ;
        System.out.println(" onluk duzeninde bir sayi gir :");
            Scanner in = new Scanner(System.in);
            sayi=in.nextInt();
            while ( sayi>=2)
            {
                sonuc = sayi / 2;
                kalan = sayi - sonuc * 2;
                System.out.print("" + kalan);
                sayi = sonuc;
                counter++;
            }
        

    }
}
