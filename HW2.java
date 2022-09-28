import java.util.Scanner;

/**
 * Created by Qursan on 23/09/22.
 */
public class HW2 {
    public static void main(String[] args) {
//        double sum1=0;
//        double sum2=0;
//        for (int i=2; i<=100;i++)
//        {
//            if (i%2==0)
//            {
//             sum1=sum1+i;
//            }
//        }
//        System.out.println(sum1);
//
//        System.out.println("enter tow num  ");
//        Scanner x=new Scanner(System.in);
//        int a=x.nextInt();
//        int b=x.nextInt();
//        for (int i=a; i<=b;i++)
//        {
//            if (i%2!=0)
//            {
//                sum2=sum2+i;
//            }
//        }
//        System.out.println(sum2);

Scanner n=new Scanner(System.in);
        int sumdigits =0;
      int  num=n.nextInt();
        while (num>0)
        {
            int r=num%10;
            if (r%2!=0)
            {
                sumdigits =sumdigits+r;
            }
            num/=10;
        }

        System.out.println(sumdigits);











    }
}
