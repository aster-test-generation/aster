/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.deflate;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeflateCompressorOutputStream_Test_Failing {
private DeflateCompressorOutputStream out;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_int_withNullOutputStream_YDke3() throws IOException {
    DeflateCompressorOutputStream out = new DeflateCompressorOutputStream(null);
    try {
        out.write(1);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
}