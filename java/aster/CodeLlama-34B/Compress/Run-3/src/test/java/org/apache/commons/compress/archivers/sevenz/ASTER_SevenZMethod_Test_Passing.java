/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZMethod_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testById_COPY_gFzr0() {
    byte[] id = new byte[] { (byte) 0x30 };
    SevenZMethod method = SevenZMethod.byId(id);
    assertEquals(SevenZMethod.COPY, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testById_LZMA_iCRO1() {
    byte[] id = new byte[] { (byte) 0x31 };
    SevenZMethod method = SevenZMethod.byId(id);
    assertEquals(SevenZMethod.LZMA, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testById_DEFLATE_IfSU4() {
    byte[] id = new byte[] { (byte) 0x33 };
    SevenZMethod method = SevenZMethod.byId(id);
    assertEquals(SevenZMethod.DEFLATE, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testById_DEFLATE64_BpaP5() {
    byte[] id = new byte[] { (byte) 0x34 };
    SevenZMethod method = SevenZMethod.byId(id);
    assertEquals(SevenZMethod.DEFLATE64, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testById_BZIP2_rxtt6() {
    byte[] id = new byte[] { (byte) 0x35 };
    SevenZMethod method = SevenZMethod.byId(id);
    assertEquals(SevenZMethod.BZIP2, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testById_AES256SHA256_hrYI7() {
    byte[] id = new byte[] { (byte) 0x36 };
    SevenZMethod method = SevenZMethod.byId(id);
    assertEquals(SevenZMethod.AES256SHA256, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testById_BCJ_X86_FILTER_WDhG8() {
    byte[] id = new byte[] { (byte) 0x37 };
    SevenZMethod method = SevenZMethod.byId(id);
    assertEquals(SevenZMethod.BCJ_X86_FILTER, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testById_BCJ_PPC_FILTER_MmLX9() {
    byte[] id = new byte[] { (byte) 0x38 };
    SevenZMethod method = SevenZMethod.byId(id);
    assertEquals(SevenZMethod.BCJ_PPC_FILTER, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testById_BCJ_IA64_FILTER_JPhg10() {
    byte[] id = new byte[] { (byte) 0x39 };
    SevenZMethod method = SevenZMethod.byId(id);
    assertEquals(SevenZMethod.BCJ_IA64_FILTER, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testById_BCJ_ARM_FILTER_nhEG11() {
    byte[] id = new byte[] { (byte) 0x3A };
    SevenZMethod method = SevenZMethod.byId(id);
    assertEquals(SevenZMethod.BCJ_ARM_FILTER, method);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_COPY_AKaZ0_dZnn0() {
    SevenZMethod method = SevenZMethod.COPY;
    byte[] id = method.getId();
    assertEquals(SevenZMethod.COPY.getId(), id);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_LZMA_tWXh1_EKHZ0() {
    SevenZMethod method = SevenZMethod.LZMA;
    byte[] id = method.getId();
    assertEquals(SevenZMethod.LZMA.getId(), id);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_LZMA2_FqDy2_ydFl0() {
    SevenZMethod method = SevenZMethod.LZMA2;
    byte[] id = method.getId();
    assertEquals(SevenZMethod.LZMA2.getId(), id);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_DEFLATE_Ribn3_OkRD0() {
    SevenZMethod method = SevenZMethod.DEFLATE;
    byte[] id = method.getId();
    assertEquals(SevenZMethod.DEFLATE.getId(), id);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_DEFLATE64_ZMOx4_eatW0() {
    SevenZMethod method = SevenZMethod.DEFLATE64;
    byte[] id = method.getId();
    assertEquals(SevenZMethod.DEFLATE64.getId(), id);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_BZIP2_Flzn5_cDah0() {
    SevenZMethod method = SevenZMethod.BZIP2;
    byte[] id = method.getId();
    assertEquals(SevenZMethod.BZIP2.getId(), id);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_AES256SHA256_PPTf6_SNQR0() {
    SevenZMethod method = SevenZMethod.AES256SHA256;
    byte[] id = method.getId();
    assertEquals(SevenZMethod.AES256SHA256.getId(), id);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_BCJ_X86_FILTER_iPag7_nOKq0() {
    SevenZMethod method = SevenZMethod.BCJ_X86_FILTER;
    byte[] id = method.getId();
    assertEquals(SevenZMethod.BCJ_X86_FILTER.getId(), id);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_BCJ_PPC_FILTER_Ctsx8_EPIO0() {
    SevenZMethod method = SevenZMethod.BCJ_PPC_FILTER;
    byte[] id = method.getId();
    assertEquals(SevenZMethod.BCJ_PPC_FILTER.getId(), id);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_BCJ_IA64_FILTER_VYFE9_cAzt0() {
    SevenZMethod method = SevenZMethod.BCJ_IA64_FILTER;
    byte[] id = method.getId();
    assertEquals(SevenZMethod.BCJ_IA64_FILTER.getId(), id);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_BCJ_ARM_FILTER_sdra10_nhyl0() {
    SevenZMethod method = SevenZMethod.BCJ_ARM_FILTER;
    byte[] id = method.getId();
    assertEquals(SevenZMethod.BCJ_ARM_FILTER.getId(), id);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetId_BCJ_ARM_THUMB_FILTER_aYtw11_lkgA0() {
    SevenZMethod method = SevenZMethod.BCJ_ARM_THUMB_FILTER;
    byte[] id = method.getId();
    assertEquals(SevenZMethod.BCJ_ARM_THUMB_FILTER.getId(), id);
}
}