/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.xz;
import org.tukaani.xz.XZ;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XZCompressorInputStream_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_true_SthB0() {
    byte[] signature = XZ.HEADER_MAGIC.clone();
    assertTrue(XZCompressorInputStream.matches(signature, XZ.HEADER_MAGIC.length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_false_length_NIQC1() {
    byte[] signature = XZ.HEADER_MAGIC.clone();
    assertFalse(XZCompressorInputStream.matches(signature, XZ.HEADER_MAGIC.length - 1));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_false_content_Wkjn2() {
    byte[] signature = XZ.HEADER_MAGIC.clone();
    signature[0] = (byte) ~signature[0];
    assertFalse(XZCompressorInputStream.matches(signature, XZ.HEADER_MAGIC.length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_empty_FHhL3() {
    byte[] signature = new byte[0];
    assertFalse(XZCompressorInputStream.matches(signature, 0));
}
}