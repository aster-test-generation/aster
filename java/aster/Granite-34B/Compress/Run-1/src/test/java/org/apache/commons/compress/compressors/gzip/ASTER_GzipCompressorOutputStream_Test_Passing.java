/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.gzip;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GzipCompressorOutputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_eXkt0() throws Exception {
        byte[] buffer = new byte[0];
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out);
        gzipCompressorOutputStream.write(buffer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_uFgf1() throws Exception {
        byte[] buffer = new byte[10];
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out);
        gzipCompressorOutputStream.write(buffer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_pNqE2() throws Exception {
        byte[] buffer = new byte[100];
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out);
        gzipCompressorOutputStream.write(buffer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_tWwv3() throws Exception {
        byte[] buffer = new byte[0];
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out, new GzipParameters());
        gzipCompressorOutputStream.write(buffer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_JQJw4() throws Exception {
        byte[] buffer = new byte[10];
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out, new GzipParameters());
        gzipCompressorOutputStream.write(buffer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_msbd5() throws Exception {
        byte[] buffer = new byte[100];
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out, new GzipParameters());
        gzipCompressorOutputStream.write(buffer);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_BepO6() throws Exception {
        byte[] buffer = new byte[0];
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out);
        gzipCompressorOutputStream.write(buffer, 0, 0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_bFVa7() throws Exception {
        byte[] buffer = new byte[10];
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out);
        gzipCompressorOutputStream.write(buffer, 0, 10);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_ekBW8() throws Exception {
        byte[] buffer = new byte[100];
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out);
        gzipCompressorOutputStream.write(buffer, 0, 100);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_Iqru9() throws Exception {
        byte[] buffer = new byte[0];
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out, new GzipParameters());
        gzipCompressorOutputStream.write(buffer, 0, 0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWrite_DYNb10() throws Exception {
        byte[] buffer = new byte[10];
        GzipCompressorOutputStream gzipCompressorOutputStream = new GzipCompressorOutputStream(System.out, new GzipParameters());
        gzipCompressorOutputStream.write(buffer, 0, 10);
    }
}