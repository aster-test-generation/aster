/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lz4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_FramedLZ4CompressorOutputStream_Test_Passing {
private org.apache.commons.codec.digest.XXHash32 contentHash = new org.apache.commons.codec.digest.XXHash32();
private Parameters params;
private OutputStream out;
FramedLZ4CompressorOutputStream framedlz4compressoroutputstream;
private boolean finished;
@Mock
    private OutputStream mockOut;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWrite_mhsT0() throws IOException {
    byte[] data = new byte[100];
    int off = 0;
    int len = 10;
    FramedLZ4CompressorOutputStream f = new FramedLZ4CompressorOutputStream(new ByteArrayOutputStream());
    f.write(data, off, len);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testclose() throws Exception{
        out = mockOut;
        framedlz4compressoroutputstream = new FramedLZ4CompressorOutputStream(out);
        framedlz4compressoroutputstream.close();
        verify(mockOut, times(1)).close();
    }
}