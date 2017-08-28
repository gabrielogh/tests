import java.util.Collection;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTests{
	
	    @Test
        public final void testValuesOfKata(){
        Kata fun = new multiple_of_five(10);
        assertEquals("El resultado del test para mult 5 es: ", fun.multiple_of_five()[10]);
        
    }
	
	
}
