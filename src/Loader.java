import java.util.Scanner;
public class Loader
{

    public static  void main(String[] arg)
    {
        double[] arrsum = new double[10];
        for(int i=1;i<10;i++)
        {
          arrsum[i]=1/(double)i;
            System.out.println((double)1/i);
        }
        double sum=0;
        for(double i:arrsum){
            sum+=i;
        }
        System.out.println(sum);
    }
}
