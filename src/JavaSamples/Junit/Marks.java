package JavaSamples.Junit;

public class Marks
{
    char marks(int i)
    {
        if(i<0)
        {
            throw new IllegalArgumentException("Number is negetive");
        }
        else if(i<60)
        {
            return 'F';
        }
        else if(i<70)
        {
            return 'D';
        }
        else if(i<80)
        {
            return 'C';
        }
        else if(i<90)
        {
            return 'B';
        }
        else return 'A';
    }
}
