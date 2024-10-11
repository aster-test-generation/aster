/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZMethodConfiguration_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameObject_UqTa0() {
    SevenZMethodConfiguration obj = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    assertTrue(obj.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNull_uZmY1() {
    SevenZMethodConfiguration obj = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    assertFalse(obj.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentClass_ZJnN2() {
    SevenZMethodConfiguration obj = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    assertFalse(obj.equals(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentMethod_IEPh3() {
    SevenZMethodConfiguration obj1 = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    SevenZMethodConfiguration obj2 = new SevenZMethodConfiguration(SevenZMethod.LZMA, null);
    assertFalse(obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentOptions_aBoY4() {
    SevenZMethodConfiguration obj1 = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    SevenZMethodConfiguration obj2 = new SevenZMethodConfiguration(SevenZMethod.COPY, new Object());
    assertFalse(obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameMethodAndOptions_LCXO5() {
    SevenZMethodConfiguration obj1 = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    SevenZMethodConfiguration obj2 = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    assertTrue(obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptions_iMkp0() {
        SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.COPY, new Object());
        assertEquals(new Object(), config.getOptions());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testOptions2_LYKT1() {
        SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        assertEquals(null, config.getOptions());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_1() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.COPY, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_2() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.LZMA, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_3() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.LZMA2, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_4() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.DEFLATE, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_5() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.DEFLATE64, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_6() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.BZIP2, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_7() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.AES256SHA256, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_8() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.BCJ_X86_FILTER, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_9() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.BCJ_PPC_FILTER, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_10() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.BCJ_IA64_FILTER, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_11() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.BCJ_ARM_FILTER, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_12() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.BCJ_ARM_THUMB_FILTER, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_13() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.BCJ_SPARC_FILTER, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_fmME0_14() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        assertEquals(SevenZMethod.DELTA_FILTER, configuration.getMethod());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithNullMethod_MNTt0() {
    SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(null, null);
    assertEquals(0, configuration.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithNonNullMethod_kwFq1() {
    SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    assertEquals(SevenZMethod.COPY.hashCode(), configuration.hashCode());
}
}