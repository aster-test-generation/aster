/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CPClass_Test_Passing {
private String className;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareTo_SameClass_knTg0_SjMe1() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 utf8 = new org.apache.commons.compress.harmony.pack200.CPUTF8("CPClass");
    CPClass cpClass = new CPClass(utf8);
    int result = cpClass.compareTo(cpClass);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareTo_InnerClass_Rwpk2_fWWh0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 utf8 = new org.apache.commons.compress.harmony.pack200.CPUTF8("CPClass");
    CPClass cpClass = new CPClass(utf8);
    cpClass.isInnerClass();
    int result = cpClass.compareTo(cpClass);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareTo_IndexInCpUtf8_PDii3_cMHa1() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 utf8 = new org.apache.commons.compress.harmony.pack200.CPUTF8("CPClass");
    CPClass cpClass = new CPClass(utf8);
    int index = cpClass.getIndexInCpUtf8();
    int result = cpClass.compareTo(cpClass);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCompareTo_ToString_mUoR4_BUYG0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 utf8 = new org.apache.commons.compress.harmony.pack200.CPUTF8("CPClass");
    CPClass cpClass = new CPClass(utf8);
    String str = cpClass.toString();
    int result = cpClass.compareTo(cpClass);
    assertEquals(0, result);
}
}