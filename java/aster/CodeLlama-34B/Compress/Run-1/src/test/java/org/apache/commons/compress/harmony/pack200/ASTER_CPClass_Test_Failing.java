/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPClass_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareTo_Null_mzKc3_latS0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 utf8 = new org.apache.commons.compress.harmony.pack200.CPUTF8("CPClass");
    CPClass cpClass = new CPClass(utf8);
    int result = cpClass.compareTo(null);
    assertNotEquals(0, result);
}
}