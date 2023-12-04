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

    @Test
    public void testNhan() {
        Pheptoan pheptoanCalculator = new Pheptoan();

        // Kiểm tra kết quả khi nhân hai số dương
        int resultPositive = pheptoanCalculator.Nhan(5, 7);
        assertEquals(35, resultPositive);

        // Kiểm tra kết quả khi nhân một số dương và một số âm
        int resultNegative = pheptoanCalculator.Nhan(5, -7);
        assertEquals(-35, resultNegative);

        // Kiểm tra kết quả khi nhân hai số âm
        int resultBothNegative = pheptoanCalculator.Nhan(-5, -7);
        assertEquals(35, resultBothNegative);

        // Kiểm tra kết quả khi nhân một số bằng 0
        int resultZero = pheptoanCalculator.Nhan(5, 0);
        assertEquals(0, resultZero);
    }
    
}
