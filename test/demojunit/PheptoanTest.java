/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package demojunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thien
 */
public class PheptoanTest {
    
    Pheptoan pt;
    
    public PheptoanTest() {
        pt = new Pheptoan();
    }

    @Test
    public void testMain() {
        int kq = pt.Nhan(5, 7);
        int kquamongmuon =35 ;
        assertEquals(kq, kquamongmuon);
    }
    
}
