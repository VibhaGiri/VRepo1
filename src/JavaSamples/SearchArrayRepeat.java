package JavaSamples;

public class SearchArrayRepeat
{

    public static void main(String[] args)
    {
        int[] array = {10, 20, 87, 9, 5, 5, 5};
        int n=55;
        if (search(array, n))
        {
            System.out.println("The number is present in the array");
        } else
            System.out.println("The number is not present in the array");

        int h=repeat(array,n);
        System.out.println("The number is repeated times: " +h);
    }


   static boolean search(int[] a,int f)
    {
        int n=a.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==f)
            {
                j++;
                return true;
            }
        }
        return false;
    }
static int repeat(int[] a,int n)
{
    int m=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==n)
        {
            m++;
        }
    }
    return m;
}



}
