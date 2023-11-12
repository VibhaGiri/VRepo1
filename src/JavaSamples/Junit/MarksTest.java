package JavaSamples.Junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarksTest
{
    @Test
    void result()
    {
        Marks mark=new Marks();
        assertEquals('A',mark.marks(92));
    }
    @Test
    void result1()
    {
        Marks mark=new Marks();
        assertThrows(IllegalArgumentException.class,()->{
            mark.marks(-8);
        });
           }

}