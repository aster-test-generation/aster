/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipCompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteByteArray_PHBh0() throws Exception {
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out);
        byte[] buffer = new byte[10];
        gzipCompressorOutputStream.write(buffer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteByteArrayIntInt_pKWI1() throws Exception {
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out);
        byte[] buffer = new byte[10];
        gzipCompressorOutputStream.write(buffer, 0, buffer.length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteInt_deCG2() throws Exception {
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out);
        int b = 10;
        gzipCompressorOutputStream.write(b);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_hnNA0() throws Exception {
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out);
        gzipCompressorOutputStream.write(1);
    }
}