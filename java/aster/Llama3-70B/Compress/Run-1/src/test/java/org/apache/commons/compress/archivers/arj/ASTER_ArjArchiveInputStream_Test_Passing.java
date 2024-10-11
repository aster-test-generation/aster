/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.arj;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.apache.commons.compress.archivers.ArchiveException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArjArchiveInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_false_magic1_cRSC2_BJpz0() {
    byte[] signature = new byte[] { 0x00, (byte) 0x60, 0x00 };
    assertFalse(ArjArchiveInputStream.matches(signature, 2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_false_magic2_eLNH3_jnEr0() {
    byte[] signature = new byte[] { (byte) 0x60, 0x00, 0x00 };
    assertFalse(ArjArchiveInputStream.matches(signature, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClose_MybE0_zals1() throws IOException {
    try {
        ArjArchiveInputStream arjArchiveInputStream = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        arjArchiveInputStream.close();
    } catch (ArchiveException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRead_lenZero_yHQU0_cdFs0() throws IOException {
    try {
        ArjArchiveInputStream ais = new ArjArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        byte[] b = new byte[10];
        int off = 0;
        int len = 0;
        int result = ais.read(b, off, len);
        assertEquals(0, result);
    } catch (ArchiveException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_true_xJSq0_Gkdy0_fid1() {
    byte[] signature = new byte[] { (byte) 0x60, (byte) 0xEA, 0x00 };
    assertFalse(ArjArchiveInputStream.matches(signature, 0));
}
}