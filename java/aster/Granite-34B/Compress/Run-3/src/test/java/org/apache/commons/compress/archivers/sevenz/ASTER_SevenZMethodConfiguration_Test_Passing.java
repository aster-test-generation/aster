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
public void testEqualsWithSameObject_bPbf0() throws Exception {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.COPY);
    assertTrue(config.equals(config));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithNullObject_oTtj1() throws Exception {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.COPY);
    assertFalse(config.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentClassObject_XANV2() throws Exception {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.COPY);
    assertFalse(config.equals(""));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithEqualObjects_Ltcg3() throws Exception {
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(SevenZMethod.COPY);
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(SevenZMethod.COPY);
    assertTrue(config1.equals(config2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentMethodObjects_LHut4() throws Exception {
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(SevenZMethod.COPY);
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(SevenZMethod.LZMA);
    assertFalse(config1.equals(config2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentOptionsObjects_XdAq5() throws Exception {
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(SevenZMethod.COPY, new Object());
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(SevenZMethod.COPY, new Object());
    assertFalse(config1.equals(config2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOptionsTest_NAFO0() throws Exception {
        SevenZMethodConfiguration objSevenZMethodConfiguration0 = new SevenZMethodConfiguration(SevenZMethod.COPY);
        Object object0 = objSevenZMethodConfiguration0.getOptions();
        assertEquals(object0, null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOptionsTest_1_VVvb1() throws Exception {
        SevenZMethodConfiguration objSevenZMethodConfiguration0 = new SevenZMethodConfiguration(SevenZMethod.COPY, new Object());
        Object object0 = objSevenZMethodConfiguration0.getOptions();
        assertEquals(object0, new Object());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOptionsTest_2_nese2() throws Exception {
        SevenZMethodConfiguration objSevenZMethodConfiguration0 = new SevenZMethodConfiguration(SevenZMethod.LZMA);
        Object object0 = objSevenZMethodConfiguration0.getOptions();
        assertEquals(object0, null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOptionsTest_3_wWCP3() throws Exception {
        SevenZMethodConfiguration objSevenZMethodConfiguration0 = new SevenZMethodConfiguration(SevenZMethod.LZMA, new Object());
        Object object0 = objSevenZMethodConfiguration0.getOptions();
        assertEquals(object0, new Object());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOptionsTest_4_CDtS4() throws Exception {
        SevenZMethodConfiguration objSevenZMethodConfiguration0 = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
        Object object0 = objSevenZMethodConfiguration0.getOptions();
        assertEquals(object0, null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOptionsTest_5_PCVc5() throws Exception {
        SevenZMethodConfiguration objSevenZMethodConfiguration0 = new SevenZMethodConfiguration(SevenZMethod.LZMA2, new Object());
        Object object0 = objSevenZMethodConfiguration0.getOptions();
        assertEquals(object0, new Object());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOptionsTest_6_aqUB6() throws Exception {
        SevenZMethodConfiguration objSevenZMethodConfiguration0 = new SevenZMethodConfiguration(SevenZMethod.DEFLATE);
        Object object0 = objSevenZMethodConfiguration0.getOptions();
        assertEquals(object0, null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOptionsTest_7_Mybd7() throws Exception {
        SevenZMethodConfiguration objSevenZMethodConfiguration0 = new SevenZMethodConfiguration(SevenZMethod.DEFLATE, new Object());
        Object object0 = objSevenZMethodConfiguration0.getOptions();
        assertEquals(object0, new Object());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getOptionsTest_8_rFxh8() throws Exception {
        SevenZMethodConfiguration objSevenZMethodConfiguration0 = new SevenZMethodConfiguration(SevenZMethod.DEFLATE64);
        Object object0 = objSevenZMethodConfiguration0.getOptions();
        assertEquals(object0, null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetMethod_rYNR0() throws Exception {
        SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.COPY);
        assertEquals(SevenZMethod.COPY, config.getMethod());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithMethodNull_ZLtP0() throws Exception {
        SevenZMethodConfiguration config = new SevenZMethodConfiguration(null);
        assertEquals(0, config.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithMethodNotNull_PIwP1() throws Exception {
        SevenZMethod method = SevenZMethod.COPY;
        Object options = new Object();
        SevenZMethodConfiguration config = new SevenZMethodConfiguration(method, options);
        assertEquals(method.hashCode(), config.hashCode());
    }
}