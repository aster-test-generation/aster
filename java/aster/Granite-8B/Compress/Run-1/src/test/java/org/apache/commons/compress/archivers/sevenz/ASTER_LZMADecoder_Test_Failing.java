/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import java.io.IOException;
import java.io.OutputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LZMADecoder_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_GmEo0() throws IOException {
        OutputStream out = null;
        Object opts = null;
        LZMADecoder lzmaDecoder = new LZMADecoder();
        OutputStream result = lzmaDecoder.encode(out, opts);
    }
}