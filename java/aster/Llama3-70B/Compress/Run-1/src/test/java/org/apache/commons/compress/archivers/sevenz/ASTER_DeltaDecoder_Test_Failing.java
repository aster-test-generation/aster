/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeltaDecoder_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsAsProperties_gVNt0_fid1() {
    DeltaDecoder deltaDecoder = new DeltaDecoder();
    Object options = 2;
    byte[] result = deltaDecoder.getOptionsAsProperties(options);
    assertArrayEquals(new byte[] { 0 }, result);
}
}