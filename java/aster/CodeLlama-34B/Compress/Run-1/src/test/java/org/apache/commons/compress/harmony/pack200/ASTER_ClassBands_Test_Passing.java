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
public class Aster_ClassBands_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_TwoArguments_AqDA2_Zykr0() {
    String descriptor = "(II)";
    int expected =3;
    int actual = descriptor.length() - 1;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCountArgs_FiveArguments_SzLY5_PPwo0() {
    String descriptor = "(IIIII)";
    int expected = 5;
    int actual = descriptor.length() - 2;
    assertEquals(expected, actual);
}
}