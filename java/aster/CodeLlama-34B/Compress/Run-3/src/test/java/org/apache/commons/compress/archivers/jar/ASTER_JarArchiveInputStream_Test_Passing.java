/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.jar;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JarArchiveInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_validSignature_true_RLXz0() {
    byte[] signature = new byte[] { 0x50, 0x4B, 0x03, 0x04 };
    int length = 4;
    assertTrue(JarArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidSignature_false_jGWa1() {
    byte[] signature = new byte[] { 0x50, 0x4B, 0x03, 0x05 };
    int length = 4;
    assertFalse(JarArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_emptySignature_false_MkWk2() {
    byte[] signature = new byte[] {};
    int length = 0;
    assertFalse(JarArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_nullSignature_false_ZPCK3() {
    byte[] signature = null;
    int length = 0;
    assertFalse(JarArchiveInputStream.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidSignatureWithEncoding_false_WAVU5_KPHE0() {
    byte[] signature = new byte[] { 0x50, 0x4B, 0x03, 0x05 };
    int length = 4;
    String encoding = "UTF-8";
    assertFalse(JarArchiveInputStream.matches(signature, length));
}
}