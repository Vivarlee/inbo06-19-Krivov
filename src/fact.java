import java.util.Scanner;
public class fact
{
    public static void main(String[] arg) {
        int jj=1;
        int a=0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = 1; i <= a; i++)
        {
            jj*=i;
        }
        System.out.println(jj);
    }
}
