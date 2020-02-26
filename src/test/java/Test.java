import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.function.Executable;

public class Test{
@org.junit.Test
    public void testSum(){
        Main obj = new Main();
        assertEquals(50,obj.sum(20,30));
    }
@org.junit.Test
    public void testStrReverse(){
        Main obj = new Main();
        assertEquals("avaj",obj.reverseStr("java"));
    }
@org.junit.Test
    public void testType(){
        Main obj = new Main();
        assertTrue("True",true);
    }
@org.junit.Test
    public void testNull(){
        Main obj = new Main();
        assertNotNull("Not null!",obj.checkByNull(25));
    }
@org.junit.Test
    public void checkException(){
        assertThrows(ArithmeticException.class, ()->{
                Main obj = new Main();
                obj.checkException(20,0);
        });
    }
}
