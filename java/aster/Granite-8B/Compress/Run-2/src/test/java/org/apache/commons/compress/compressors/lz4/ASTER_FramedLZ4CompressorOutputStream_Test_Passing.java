/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.lz4;

import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_FramedLZ4CompressorOutputStream_Test_Passing {
private org.apache.commons.codec.digest.XXHash32 contentHash = new org.apache.commons.codec.digest.XXHash32();
private Parameters params;
private OutputStream out;
@Mock
    private OutputStream mockOutputStream;
private FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream;
private boolean finished;
private Parameters mockParameters;
private FramedLZ4CompressorOutputStream framedlz4compressoroutputstream;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteWithContentChecksum_UivU0() throws IOException {
    FramedLZ4CompressorOutputStream out = new FramedLZ4CompressorOutputStream(new ByteArrayOutputStream());
    byte[] data = new byte[1024];
    out.write(data);
    out.close();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_ylbd0() throws IOException {
        FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream = new FramedLZ4CompressorOutputStream(System.out);
        framedLZ4CompressorOutputStream.write(1);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClose_DpeT0() throws IOException {
        FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream = new FramedLZ4CompressorOutputStream(System.out);
        framedLZ4CompressorOutputStream.close();
    }
}