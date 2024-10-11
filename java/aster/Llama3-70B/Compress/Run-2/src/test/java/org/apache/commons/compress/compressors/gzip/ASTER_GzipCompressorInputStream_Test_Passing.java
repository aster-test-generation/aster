/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesTrue_IhJV0() throws Exception {
    byte[] signature = new byte[] {31, -117, 1, 2, 3};
    assertTrue(GzipCompressorInputStream.matches(signature, 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesFalseLength_xVYd1() throws Exception {
    byte[] signature = new byte[] {31, -117, 1, 2, 3};
    assertFalse(GzipCompressorInputStream.matches(signature, 1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesFalseSignature_mtbK2() throws Exception {
    byte[] signature = new byte[] {30, -117, 1, 2, 3};
    assertFalse(GzipCompressorInputStream.matches(signature, 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesFalseBoth_uEmm3() throws Exception {
    byte[] signature = new byte[] {30, -116, 1, 2, 3};
    assertFalse(GzipCompressorInputStream.matches(signature, 1));
}
}