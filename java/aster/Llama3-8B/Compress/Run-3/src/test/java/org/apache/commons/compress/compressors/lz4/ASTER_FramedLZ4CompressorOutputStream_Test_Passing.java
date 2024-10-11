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
@Mock
    private Parameters params;
@Mock
    private OutputStream out;
private FramedLZ4CompressorOutputStream framedlz4compressoroutputstream;
@Mock
    private OutputStream outputStream;
@Mock
    private Parameters parameters;
private boolean finished;
    private final org.apache.commons.codec.digest.XXHash32 contentHash = new org.apache.commons.codec.digest.XXHash32();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_aWyu0() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        FramedLZ4CompressorOutputStream compressorOutputStream = new FramedLZ4CompressorOutputStream(bos);
        compressorOutputStream.write((int) 0x12);
        assert bos.toByteArray()[0] == (byte) 0x12;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose() throws Exception {
        framedlz4compressoroutputstream = new FramedLZ4CompressorOutputStream(out);
        // Act
        framedlz4compressoroutputstream.close();
        // Assert
        verify(out, times(1)).close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteSmallData_cYtG0_vcFA0() throws IOException {
    FramedLZ4CompressorOutputStream compressor = new FramedLZ4CompressorOutputStream(new ByteArrayOutputStream());
    byte[] data = new byte[10];
    compressor.write(data, 0, 5);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteDataWithBlockDependency_roRK2_FGsd0() throws IOException {
    FramedLZ4CompressorOutputStream compressor = new FramedLZ4CompressorOutputStream(new ByteArrayOutputStream());
    byte[] data = new byte[10];
    compressor.write(data, 0, 5);
    compressor.write(data, 0, 5);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_dzmV0_vMrV0() throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    FramedLZ4CompressorOutputStream compressorOutputStream = new FramedLZ4CompressorOutputStream(out);
    compressorOutputStream.close();
}
}