/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ExactMath_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAdd_omtR0() {
        assertEquals(5, ExactMath.add(2, 3));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddOverflow_pIAu1() {
        try {
            ExactMath.add(Integer.MAX_VALUE, 1);
            assertEquals(false, true);
        } catch (IllegalArgumentException e) {
            assertEquals("Argument too large or result overflows", e.getMessage());
        }
    }
}