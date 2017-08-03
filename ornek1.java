/**
 * Created by Nur Nabhan on 8/3/2017.
 */
import java.util.Scanner;
public class ornek1
{
    /*A, B, C değişkeni olarak girilen sayılardan büyük olanı A değişkenine,
    ikinciyi B değişkenine, küçük olanı C değişkenine atan algoritma
     */
    public static void main(String args[])
    {
        int x1, x2, x3;
        Scanner in = new Scanner(System.in);
        x1 = in.nextInt();
        x2 = in.nextInt();
        x3 = in.nextInt();
        if  (x1>x2 && x1>x3 )
            System.out.println("A=" +x1);
        {
            if (x2 > x3)
            {
                System.out.println("B=" + x2);
                System.out.println("C=" + x3);
            }
            else
            {
                System.out.println("B=" + x3);
                System.out.println("C=" + x2);
            }
        }

        else
            if ( x2>x1 && x2>x3)

        System.out.println("A=" +x2);

        {  if (x1 > x3)
            {
                System.out.println("B=" + x1);
                System.out.println("C=" + x3);
            }
            else
            {
                System.out.println("B=" + x3);
                System.out.println("C=" + x1);
            }
        }
    }
}
