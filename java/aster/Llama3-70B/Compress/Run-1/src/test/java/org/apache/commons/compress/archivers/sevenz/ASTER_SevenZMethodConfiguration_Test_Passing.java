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
public void testGetOptions_withOptions_hiaH0() {
    SevenZMethod method = SevenZMethod.LZMA;
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(method);
    assertNull(config.getOptions());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_nJhJ0() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.LZMA);
    assertTrue(config.equals(config));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_udHx1() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.LZMA);
    assertFalse(config.equals(new Object()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_Null_diut2() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.LZMA);
    assertFalse(config.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameMethod_hsHG3() {
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(SevenZMethod.LZMA);
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(SevenZMethod.LZMA);
    assertTrue(config1.equals(config2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentMethod_HBNl4() {
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(SevenZMethod.LZMA);
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(SevenZMethod.LZMA2);
    assertFalse(config1.equals(config2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetMethod_LZMA_PDgL0() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.LZMA);
    assertEquals(SevenZMethod.LZMA, config.getMethod());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_withMethod_eXGT0() {
    SevenZMethod method = SevenZMethod.LZMA;
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(method);
    assertEquals(method.hashCode(), config.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_withoutMethod_JwmN1() {
    SevenZMethodConfiguration config = new SevenZMethodConfiguration(null);
    assertEquals(0, config.hashCode());
}
}