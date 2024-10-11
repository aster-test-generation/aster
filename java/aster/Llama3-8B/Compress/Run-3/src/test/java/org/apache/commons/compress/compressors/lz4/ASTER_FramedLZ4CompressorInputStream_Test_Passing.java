/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lz4;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FramedLZ4CompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesValidSignature_RgIZ0_qLvE0() {
    byte[] signature = new byte[]{-85, -113, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int length = signature.length;
    boolean result = FramedLZ4CompressorInputStream.matches(signature, length);
    assert result;
}
}