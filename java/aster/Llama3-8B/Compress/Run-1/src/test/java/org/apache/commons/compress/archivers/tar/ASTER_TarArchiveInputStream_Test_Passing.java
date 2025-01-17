/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.tar;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TarArchiveInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesTooShort_AYSR4() {
    byte[] signature = new byte[] {(byte) 'u', (byte) 's', (byte) 't', (byte) 'a', (byte) 'r'};
    boolean result = TarArchiveInputStream.matches(signature, signature.length);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesMagicMismatch_Pbic5() {
    byte[] signature = new byte[] {(byte) 'x', (byte) 'y', (byte) 'z', (byte) 't', (byte) 'a', (byte) 'r', (byte) ' ', (byte) '0', (byte) '0', (byte) '0', (byte) '1'};
    boolean result = TarArchiveInputStream.matches(signature, signature.length);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesVersionMismatch_oKPu6() {
    byte[] signature = new byte[] {(byte) 'u', (byte) 's', (byte) 't', (byte) 'a', (byte) 'r', (byte) ' ', (byte) '0', (byte) '0', (byte) '0', (byte) '1', (byte) 'x'};
    boolean result = TarArchiveInputStream.matches(signature, signature.length);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchesTooShortVersion_RXmA7() {
    byte[] signature = new byte[] {(byte) 'u', (byte) 's', (byte) 't', (byte) 'a', (byte) 'r', (byte) ' ', (byte) '0', (byte) '0'};
    boolean result = TarArchiveInputStream.matches(signature, signature.length);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRecordSize2_Usiq1() {
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[512]));
        assertEquals(512, tarArchiveInputStream.getRecordSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRecordSize3_ugua2() {
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]), 1024, 1024);
        assertEquals(1024, tarArchiveInputStream.getRecordSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRecordSize4_CEVO3() {
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]), 1024, 1024, "UTF-8", true);
        assertEquals(1024, tarArchiveInputStream.getRecordSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRecordSize5_NTbp4() {
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]), 1024, 1024, "UTF-8");
        assertEquals(1024, tarArchiveInputStream.getRecordSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRecordSize6_JKZg5() {
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]), 1024, 1024, "UTF-8", false);
        assertEquals(1024, tarArchiveInputStream.getRecordSize());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetRecordSize9_nHLC8() {
        TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(new java.io.ByteArrayInputStream(new byte[512]), 151224);
        assertEquals(512, tarArchiveInputStream.getRecordSize());
    }
}