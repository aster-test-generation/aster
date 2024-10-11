/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.z;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithValidSignature_GKNc0() throws Exception {
    byte[] signature = {0x17, 0x72, 0x45, 0x38};
    boolean result = ZCompressorInputStream.matches(signature, 4);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithInvalidSignature_EuEV1() throws Exception {
    byte[] signature = {0x00, 0x00, 0x00, 0x00};
    boolean result = ZCompressorInputStream.matches(signature, 4);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithSignatureLengthLessThanFour_XxVd2() throws Exception {
    byte[] signature = {0x17, 0x72};
    boolean result = ZCompressorInputStream.matches(signature, 2);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesWithSignatureLengthGreaterThanFour_dBxV3() throws Exception {
    byte[] signature = {0x17, 0x72, 0x45, 0x38, 0x00};
    boolean result = ZCompressorInputStream.matches(signature, 5);
    assertFalse(result);
}
}