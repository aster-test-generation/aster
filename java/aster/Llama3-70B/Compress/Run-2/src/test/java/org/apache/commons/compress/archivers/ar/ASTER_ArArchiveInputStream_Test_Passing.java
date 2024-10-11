/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.ar;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ArArchiveInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_true_eEXP0() {
    byte[] signature = new byte[] {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a, 0x01};
    assertTrue(ArArchiveInputStream.matches(signature, 8));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_false_length_pLjc1() {
    byte[] signature = new byte[] {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
    assertFalse(ArArchiveInputStream.matches(signature, 7));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_false_signature_YZHY2() {
    byte[] signature = new byte[] {0x20, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a, 0x01};
    assertFalse(ArArchiveInputStream.matches(signature, 8));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_true_extraBytes_fFEp3() {
    byte[] signature = new byte[] {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a, 0x01, 0x02};
    assertTrue(ArArchiveInputStream.matches(signature, 8));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_false_emptySignature_iKXK5() {
    byte[] signature = new byte[0];
    assertFalse(ArArchiveInputStream.matches(signature, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_false_lengthZero_NjEt6() {
    byte[] signature = new byte[] {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
    assertFalse(ArArchiveInputStream.matches(signature, 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_false_lengthNegative_wNiD7() {
    byte[] signature = new byte[] {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
    assertFalse(ArArchiveInputStream.matches(signature, -1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_true_minLength_jBRB8() {
    byte[] signature = new byte[] {0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a};
    assertTrue(ArArchiveInputStream.matches(signature, 8));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_false_lengthOne_lgFB9() {
    byte[] signature = new byte[] {0x21};
    assertFalse(ArArchiveInputStream.matches(signature, 1));
}
}