package JavaSamples;

import java.util.ArrayList;
import java.util.List;

public class Codility
{
    public static void main(String[] args)
    {
        int[] a= {130,191,200,10,140};
        List<Integer> sumarray=new ArrayList();
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int fd=firstdigit(a[i]);
            int ld=lastdigit(a[i]);

            for(int j=i+1;j<(n-i);j++)
            {
                int nfd=firstdigit(a[j]);
                int nld=lastdigit(a[j]);
                if(fd==nfd && ld==nld)
                {
                    int sum=a[i]+a[j];
                    sumarray.add(sum);

                }
            }
        }
        System.out.println(sumarray);

        int l=sumarray.size();
        System.out.println(l);
        System.out.println(sumarray.get(l-1));

    }
    public static int firstdigit(int i)
    {
        while(i>9)
        {
            i/=10;

        }
        return i;
    }
    public static int lastdigit(int i)
    {
        int j=i%10;
        return j;
    }
}

