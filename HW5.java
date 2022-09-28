import java.util.Scanner;

/**
 * Created by Qursan on 28/09/22.
 */
public class HW5 {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("enter word  ");
        Scanner x=new Scanner(System.in);
        String w=x.next();
        for (int i =0; i <=w.length()-1 ; i++)
        {
            if (w.charAt(i)=='a'||w.charAt(i)=='i'||w.charAt(i)=='o'||w.charAt(i)=='y'
                    ||w.charAt(i)=='u'||w.charAt(i)=='e')
            { sum=sum+1;}
        }
        System.out.println(sum);
    }
}
