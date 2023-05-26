package ar.com.juanek.app

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 *   mvn -Dtest=ar.com.juanek.app.UtilTest test
 *
 * @author juan kipes
 */
class UtilTest {

     @Test
     public void hello() {
        
         System.out.println("hello groovy test");
         assertTrue(true);
        
     }
}
