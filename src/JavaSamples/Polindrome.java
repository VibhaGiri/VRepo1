package JavaSamples;

public class Polindrome
{
    public static void main(String[] args)
    {
        String s = "Kabaka";
        if (polyndrome(s))
        {
            System.out.println("String is Polyndrome");
        } else
            System.out.println("String is not a polyndrome");
    }

    static boolean polyndrome(String s) {
        int n = s.length();
        char[] c = new char[n];
        char[] c2 = new char[n];

        for (int i = 0; i <n; i++) {
            c[i] = s.toLowerCase().charAt(i);

        }
        System.out.println(c);
        int l=n-1;
        for (int j = 0; j <n; j++) {
            c2[j] = s.toLowerCase().charAt(l);
            l--;
        }
        System.out.println(c2);

        for (int i = 0; i < n; i++)
        {
            if (c[i] != c2[i])
            {
                return false;
            }
        }
        return true;
    }
}
