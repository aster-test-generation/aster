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
public void testEqualsWithSameObject_KDiV0() {
    SevenZMethodConfiguration obj = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    assertTrue(obj.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNull_fDJB1() {
    SevenZMethodConfiguration obj = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    assertFalse(obj.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentClass_LjAO2() {
    SevenZMethodConfiguration obj = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    assertFalse(obj.equals(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentMethod_uHuw3() {
    SevenZMethodConfiguration obj1 = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    SevenZMethodConfiguration obj2 = new SevenZMethodConfiguration(SevenZMethod.LZMA, null);
    assertFalse(obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameMethodAndOptions_JxTO5() {
    SevenZMethodConfiguration obj1 = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    SevenZMethodConfiguration obj2 = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    assertTrue(obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithMethodOnly_IFiV1() {
        SevenZMethod method = SevenZMethod.LZMA;
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(method);
        int expectedHashCode = method.hashCode();
        int actualHashCode = configuration.hashCode();
        assertEquals(expectedHashCode, actualHashCode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_vFVT0() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.COPY, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod2_HBMo1() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.LZMA, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod3_jjDq2() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.LZMA2, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod4_hwuF3() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.DEFLATE, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod5_TvKC4() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.DEFLATE64, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod6_yLHU5() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.BZIP2);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.BZIP2, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod7_joBR6() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.AES256SHA256);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.AES256SHA256, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod8_UpbZ7() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_X86_FILTER);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.BCJ_X86_FILTER, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod9_BlMt8() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_PPC_FILTER);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.BCJ_PPC_FILTER, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod10_wRpT9() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_IA64_FILTER);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.BCJ_IA64_FILTER, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod11_DNpP10() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_FILTER);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.BCJ_ARM_FILTER, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod12_NgMV11() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_ARM_THUMB_FILTER);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.BCJ_ARM_THUMB_FILTER, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod13_ZOfK12() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.BCJ_SPARC_FILTER);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.BCJ_SPARC_FILTER, method);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod14_cOku13() {
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(SevenZMethod.DELTA_FILTER);
        SevenZMethod method = configuration.getMethod();
        assertEquals(SevenZMethod.DELTA_FILTER, method);
    }
}