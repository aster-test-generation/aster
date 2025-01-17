/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZMethodConfiguration_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsWithCopyMethod_mvqn0() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    Object options = config.getOptions();
    assertNull(options);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsWithLZMAMethod_Vdlr1() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.LZMA, null);
    Object options = config.getOptions();
    assertNull(options);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsWithLZMA2Method_zQIF2() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.LZMA2, null);
    Object options = config.getOptions();
    assertNull(options);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsWithDEFLATEMethod_ClmN3() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.DEFLATE, null);
    Object options = config.getOptions();
    assertNull(options);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsWithDEFLATE64Method_qAiM4() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64, null);
    Object options = config.getOptions();
    assertNull(options);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsWithBZIP2Method_jyBB5() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.BZIP2, null);
    Object options = config.getOptions();
    assertNull(options);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsWithAES256SHA256Method_cHkJ6() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256, null);
    Object options = config.getOptions();
    assertNull(options);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsWithBCJ_X86_FILTERMethod_aEzX7() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER, null);
    Object options = config.getOptions();
    assertNull(options);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsWithBCJ_PPC_FILTERMethod_lXoa8() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER, null);
    Object options = config.getOptions();
    assertNull(options);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOptionsWithBCJ_IA64_FILTERMethod_VCJB9() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER, null);
    Object options = config.getOptions();
    assertNull(options);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_eejT0() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    assertTrue(config.equals(config));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObjects_qCOU1() {
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(SevenZMethod.LZMA, null);
    assertFalse(config1.equals(config2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentOptions_NlaL3() {
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    assertTrue(config1.equals(config2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullMethod_vCOK6() {
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(null, null);
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(null, null);
    assertTrue(config1.equals(config2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_COPY_rrwQ0() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    assertEquals(SevenZMethod.COPY, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_LZMA_KVlz1() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.LZMA, null);
    assertEquals(SevenZMethod.LZMA, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_LZMA2_eSkG2() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.LZMA2, null);
    assertEquals(SevenZMethod.LZMA2, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_DEFLATE_aftb3() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.DEFLATE, null);
    assertEquals(SevenZMethod.DEFLATE, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_DEFLATE64_Qldn4() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64, null);
    assertEquals(SevenZMethod.DEFLATE64, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_BZIP2_Ldoc5() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.BZIP2, null);
    assertEquals(SevenZMethod.BZIP2, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_AES256SHA256_xKfm6() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256, null);
    assertEquals(SevenZMethod.AES256SHA256, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_BCJ_X86_FILTER_pfgd7() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER, null);
    assertEquals(SevenZMethod.BCJ_X86_FILTER, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_BCJ_PPC_FILTER_SnzU8() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER, null);
    assertEquals(SevenZMethod.BCJ_PPC_FILTER, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_BCJ_IA64_FILTER_GvfF9() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER, null);
    assertEquals(SevenZMethod.BCJ_IA64_FILTER, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_BCJ_ARM_FILTER_zjrX10() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER, null);
    assertEquals(SevenZMethod.BCJ_ARM_FILTER, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_BCJ_ARM_THUMB_FILTER_MjtJ11() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER, null);
    assertEquals(SevenZMethod.BCJ_ARM_THUMB_FILTER, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_BCJ_SPARC_FILTER_mnBq12() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER, null);
    assertEquals(SevenZMethod.BCJ_SPARC_FILTER, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_NullMethod_OKQt0() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(null);
    assertEquals(0, config.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_NonNullMethod_wVlU1() {
    SevenZMethod method = SevenZMethod.LZMA;
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(method);
    assertEquals(method.hashCode(), config.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_CopyMethod_bmrh2() {
    SevenZMethod method = SevenZMethod.COPY;
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(method);
    assertEquals(method.hashCode(), config.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_LZMA2Method_KJcg4() {
    SevenZMethod method = SevenZMethod.LZMA2;
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(method);
    assertEquals(method.hashCode(), config.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_DeflateMethod_ELCD5() {
    SevenZMethod method = SevenZMethod.DEFLATE;
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(method);
    assertEquals(method.hashCode(), config.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_Deflate64Method_Ljyn6() {
    SevenZMethod method = SevenZMethod.DEFLATE64;
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(method);
    assertEquals(method.hashCode(), config.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_BZip2Method_apCy7() {
    SevenZMethod method = SevenZMethod.BZIP2;
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(method);
    assertEquals(method.hashCode(), config.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_AES256SHA256Method_RCNd8() {
    SevenZMethod method = SevenZMethod.AES256SHA256;
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(method);
    assertEquals(method.hashCode(), config.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_BCJX86FilterMethod_xQLO9() {
    SevenZMethod method = SevenZMethod.BCJ_X86_FILTER;
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(method);
    assertEquals(method.hashCode(), config.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_BCJPPCFilterMethod_KwEf10() {
    SevenZMethod method = SevenZMethod.BCJ_PPC_FILTER;
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(method);
    assertEquals(method.hashCode(), config.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_BCJIA64FilterMethod_UhDG11() {
    SevenZMethod method = SevenZMethod.BCJ_IA64_FILTER;
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(method);
    assertEquals(method.hashCode(), config.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_BCJARMFilterMethod_yfGB12() {
    SevenZMethod method = SevenZMethod.BCJ_ARM_FILTER;
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(method);
    assertEquals(method.hashCode(), config.hashCode());
}
}