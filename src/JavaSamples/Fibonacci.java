package JavaSamples;

public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int k=0;
        int[] f = new int[12];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<11;i++)
        {
               f[i]=f[i-1]+f[i-2];

        }
        for(int i=0;i<11;i++)
        {
            System.out.println(f[i]);
        }
    }
}
