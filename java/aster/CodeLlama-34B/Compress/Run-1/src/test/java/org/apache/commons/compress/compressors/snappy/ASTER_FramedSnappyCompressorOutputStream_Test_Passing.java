/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.snappy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedSnappyCompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMaskNegative_WEfv1() {
    long x = -123456789;
    long expected = -123456789;
    long actual = FramedSnappyCompressorOutputStream.mask(x);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMaskLarge_PMPO2() {
    long x = 1234567890123456789L;
    long expected = 1234567890123456789L;
    long actual = FramedSnappyCompressorOutputStream.mask(x);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMaskSmall_TEhP3() {
    long x = 123;
    long expected = 123;
    long actual = FramedSnappyCompressorOutputStream.mask(x);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMaskNegativeZero_UXAg5() {
    long x = -0;
    long expected = -0;
    long actual = FramedSnappyCompressorOutputStream.mask(x);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMaskNegativeInfinity_HXQn7_cKwr0() {
    long x = Double.doubleToLongBits(Double.NEGATIVE_INFINITY);
    long expected = Double.doubleToLongBits(Double.NEGATIVE_INFINITY);
    long actual = FramedSnappyCompressorOutputStream.mask(x);
}
}