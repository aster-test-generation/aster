/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.deflate;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeflateCompressorInputStream_Test_Passing {
    private DeflateCompressorInputStream deflateCompressorInputStream;
    private InputStream inputStream;
    private DeflateParameters parameters;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose_mgyO1() throws IOException {
        deflateCompressorInputStream.close();
    }
}