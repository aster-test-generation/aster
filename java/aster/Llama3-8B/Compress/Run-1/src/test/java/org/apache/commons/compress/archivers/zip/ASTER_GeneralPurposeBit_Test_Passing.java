/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GeneralPurposeBit_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSlidingDictionarySize_ldCx0() {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        int result = generalPurposeBit.getSlidingDictionarySize();
        assertEquals(0, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode_FtAt0() {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        byte[] result = generalPurposeBit.encode();
        assert result.length == 2;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUsesUTF8ForNamesFalse_ptPx1() {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        boolean result = generalPurposeBit.usesUTF8ForNames();
        assert !result;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUseUTF8ForNamesTrue_vIwW0() {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        generalPurposeBit.useUTF8ForNames(true);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUseUTF8ForNamesFalse_DWuI1() {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        generalPurposeBit.useUTF8ForNames(false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeDataDescriptorFlagTrue_gnCL0() {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        byte[] buf = new byte[2];
        int offset = 0;
        generalPurposeBit.encode(buf, offset);
        assertEquals((byte) 0x8000, buf[0]);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeDataDescriptorFlagFalse_zcVK1() {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        byte[] buf = new byte[2];
        int offset = 0;
        generalPurposeBit.encode(buf, offset);
        assertEquals((byte) 0, buf[0]);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeLanguageEncodingFlagTrue_yfft2() {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        byte[] buf = new byte[2];
        int offset = 0;
        generalPurposeBit.encode(buf, offset);
        assertEquals((byte) 0x4000, buf[0]);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeEncryptionFlagTrue_GCZl4() {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        byte[] buf = new byte[2];
        int offset = 0;
        generalPurposeBit.encode(buf, offset);
        assertEquals((byte) 0x2000, buf[0]);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeStrongEncryptionFlagTrue_Burc6() {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        byte[] buf = new byte[2];
        int offset = 0;
        generalPurposeBit.encode(buf, offset);
        assertEquals((byte) 0x1000, buf[0]);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_gsNM0_QLmz0_1() {
    GeneralPurposeBit original = new GeneralPurposeBit();
    GeneralPurposeBit cloned = (GeneralPurposeBit) original.clone();
    assertNotNull(cloned);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testClone_gsNM0_QLmz0_2() {
    GeneralPurposeBit original = new GeneralPurposeBit();
    GeneralPurposeBit cloned = (GeneralPurposeBit) original.clone();
    assertEquals(original, cloned);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUsesEncryption_IrMI0_fid2() {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        boolean result = generalPurposeBit.usesEncryption();
        assertFalse(result);
    }
}