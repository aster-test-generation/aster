/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SourceFileAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_withNullName_hiUu1() {
    SourceFileAttribute sourceFileAttribute = new SourceFileAttribute(null);
    int expected = 31 * sourceFileAttribute.getClass().hashCode();
    int actual = sourceFileAttribute.hashCode();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_NjZk0_YxKx0() {
    SourceFileAttribute attribute = new SourceFileAttribute(new CPUTF8("name", 0));
    assertTrue(attribute.equals(attribute));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_vYbJ2_eRWB0() {
    SourceFileAttribute attribute = new SourceFileAttribute(new CPUTF8("name", 0));
    Object obj = new Object();
    assertFalse(attribute.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameClassSameName_wjCd1_JyNt0() {
    SourceFileAttribute attribute1 = new SourceFileAttribute(new CPUTF8("name", 0));
    SourceFileAttribute attribute2 = new SourceFileAttribute(new CPUTF8("name", 0));
    assertTrue(attribute1.equals(attribute2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentName_lSHi3_eldM0() {
    SourceFileAttribute attribute1 = new SourceFileAttribute(new CPUTF8("name1", 0));
    SourceFileAttribute attribute2 = new SourceFileAttribute(new CPUTF8("name2", 0));
    assertFalse(attribute1.equals(attribute2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_xXaa0_loGf0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    CPUTF8 cpuTF8 = new CPUTF8("test", 0);
    SourceFileAttribute sourceFileAttribute = new SourceFileAttribute(cpuTF8);
    sourceFileAttribute.writeBody(dos);
    assertEquals(2, bos.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_withNonNullName_hvcT0_fJWk0() {
    CPUTF8 cpuTf8 = new CPUTF8("utf8", 0);
    SourceFileAttribute sourceFileAttribute = new SourceFileAttribute(cpuTf8);
    int expected = 31 * sourceFileAttribute.getClass().hashCode() + cpuTf8.hashCode();
    int actual = sourceFileAttribute.hashCode();
}
}