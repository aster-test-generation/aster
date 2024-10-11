/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPDouble_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareTo_kEpf0() throws Exception {
    CPDouble obj1 = new CPDouble(10.0);
    CPDouble obj2 = new CPDouble(20.0);
    assertEquals(-1, obj1.compareTo(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDouble_LbbT0() throws Exception {
    CPDouble cpDouble = new CPDouble(10.5);
    double result = cpDouble.getDouble();
    assertEquals(10.5, result, 0.0);
}
}