/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.zstandard;
import java.io.IOException;
import java.io.OutputStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZstdCompressorOutputStream_Test_Failing {
    private ZstdCompressorOutputStream zcos;
    private OutputStream mockOutputStream;
@BeforeEach
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void tearDown_VQHf1() throws IOException {
        zcos.close();
    }
}