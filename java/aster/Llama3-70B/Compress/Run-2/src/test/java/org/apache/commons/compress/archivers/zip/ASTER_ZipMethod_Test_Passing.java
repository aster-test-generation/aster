/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ZipMethod_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_STORED_yehS0() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.STORED.getCode());
    assertEquals(ZipMethod.STORED, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_UNSHRINKING_TZDL1() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.UNSHRINKING.getCode());
    assertEquals(ZipMethod.UNSHRINKING, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_EXPANDING_LEVEL_1_Nuui2() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.EXPANDING_LEVEL_1.getCode());
    assertEquals(ZipMethod.EXPANDING_LEVEL_1, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_EXPANDING_LEVEL_2_gpzm3() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.EXPANDING_LEVEL_2.getCode());
    assertEquals(ZipMethod.EXPANDING_LEVEL_2, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_EXPANDING_LEVEL_3_fsim4() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.EXPANDING_LEVEL_3.getCode());
    assertEquals(ZipMethod.EXPANDING_LEVEL_3, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_EXPANDING_LEVEL_4_YLNJ5() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.EXPANDING_LEVEL_4.getCode());
    assertEquals(ZipMethod.EXPANDING_LEVEL_4, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_IMPLODING_lKTq6() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.IMPLODING.getCode());
    assertEquals(ZipMethod.IMPLODING, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_TOKENIZATION_XnRT7() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.TOKENIZATION.getCode());
    assertEquals(ZipMethod.TOKENIZATION, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_DEFLATED_eSQZ8() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.DEFLATED.getCode());
    assertEquals(ZipMethod.DEFLATED, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_ENHANCED_DEFLATED_RDYF9() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.ENHANCED_DEFLATED.getCode());
    assertEquals(ZipMethod.ENHANCED_DEFLATED, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_PKWARE_IMPLODING_hjCw10() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.PKWARE_IMPLODING.getCode());
    assertEquals(ZipMethod.PKWARE_IMPLODING, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_BZIP2_gbdU11() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.BZIP2.getCode());
    assertEquals(ZipMethod.BZIP2, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_LZMA_cCje12() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.LZMA.getCode());
    assertEquals(ZipMethod.LZMA, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_XZ_GqZA13() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.XZ.getCode());
    assertEquals(ZipMethod.XZ, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_JPEG_nXkR14() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.JPEG.getCode());
    assertEquals(ZipMethod.JPEG, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_WAVPACK_UcNg15() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.WAVPACK.getCode());
    assertEquals(ZipMethod.WAVPACK, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_PPMD_IZjA16() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.PPMD.getCode());
    assertEquals(ZipMethod.PPMD, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_AES_ENCRYPTED_CFPS17() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.AES_ENCRYPTED.getCode());
    assertEquals(ZipMethod.AES_ENCRYPTED, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethodByCode_UNKNOWN_mmHe18() throws Exception {
    ZipMethod method = ZipMethod.getMethodByCode(ZipMethod.UNKNOWN.getCode());
    assertEquals(ZipMethod.UNKNOWN, method);
}
}