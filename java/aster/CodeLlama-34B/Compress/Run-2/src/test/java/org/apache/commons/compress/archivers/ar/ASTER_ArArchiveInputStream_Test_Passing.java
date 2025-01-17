/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.ar;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArArchiveInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_validSignature_WKIJ0() {
    byte[] signature = new byte[] { 0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a };
    int length = 8;
    assertTrue(ArArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidSignature_rfeg1() {
    byte[] signature = new byte[] { 0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a };
    int length = 7;
    assertFalse(ArArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_nullSignature_xhqO2() {
    byte[] signature = null;
    int length = 8;
    assertFalse(ArArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_emptySignature_qbIA3() {
    byte[] signature = new byte[0];
    int length = 0;
    assertFalse(ArArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidLength_JSPW4() {
    byte[] signature = new byte[] { 0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a };
    int length = 9;
    assertFalse(ArArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNextEntryWithNullInputStream_LyWY4() throws IOException {
    ArArchiveInputStream inputStream = new ArArchiveInputStream(null);
    ArArchiveEntry entry = inputStream.getNextEntry();
    assertNull(entry);
}
}