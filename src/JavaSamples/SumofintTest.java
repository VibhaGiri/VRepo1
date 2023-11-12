package JavaSamples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumofintTest
{
    @Test
    void result()
    {
        Sumofint sum=new Sumofint();
        assertEquals(5, sum.sum(0,5));

    }
    @Test
    void result1()
    {
        Sumofint sum=new Sumofint();
        assertEquals(5, sum.sum(2,3));

    }
    @Test
    void result11()
    {
        Sumofint sum=new Sumofint();
        assertNotEquals(3,sum.sum(0,3));

    }

}