/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lzma;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LZMAUtils_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_empty_signature_jWfD3() {
    byte[] signature = {};
    int length = 3;
    assertFalse(LZMAUtils.matches(signature, length));
}
}