/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZFile_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_emptySignature_nwpL2() {
    byte[] signature = new byte[] {};
    int length = signature.length;
    assertFalse(SevenZFile.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_nullSignature_BvkC3() {
    byte[] signature = null;
    int length = 0;
    assertFalse(SevenZFile.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
        public void close_SBao10() throws IOException {
        }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatches_invalidSignature_HFUY1_NcTU0() {
    byte[] signature = new byte[] {(byte)0x37, (byte)0x7A, (byte)0xBC, (byte)0xAF, (byte)0x27, (byte)0x1C};
    int length = signature.length;
    assertTrue(SevenZFile.matches(signature, length));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuilderWithFile_YcNx1_KnUX0() {
    File file = new File("test.7z");
    SevenZFile.Builder builder = SevenZFile.builder();
    builder.setFile(file);
    assertNotNull(builder);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testBuilder_bBOE0_pKYz0() {
    SevenZFile.Builder builder = new SevenZFile.Builder();
    assertNotNull(builder);
}
}