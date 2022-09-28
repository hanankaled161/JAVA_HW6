import java.util.Scanner;
import java.lang.String.*;

/**
 * Created by Qursan on 25/09/22.
 */
public class HW4 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        String x=n.next();
        for (int i = x.length()-1; i >= 0; i--)
            System.out.println(x.charAt(i));
        }
}
