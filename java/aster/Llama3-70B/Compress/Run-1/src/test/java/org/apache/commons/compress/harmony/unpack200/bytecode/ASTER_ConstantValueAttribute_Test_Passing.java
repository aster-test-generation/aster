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
public class Aster_ConstantValueAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_tmdx0() {
    ByteCode entry = new ByteCode(1);
    ConstantValueAttribute attribute = new ConstantValueAttribute(entry);
    assertEquals("Constant:" + entry.toString(), attribute.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_Vbke0() {
    ByteCode entry = new ByteCode(1);
    ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(entry);
    ClassFileEntry[] result = constantValueAttribute.getNestedClassFileEntries();
    assert(result.length == 2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_pbiZ0() {
    ByteCode entry = new ByteCode(1);
    ConstantValueAttribute attribute = new ConstantValueAttribute(entry);
    assertTrue(attribute.equals(attribute));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SuperClassObject_zfnr1() {
    ByteCode entry = new ByteCode(1);
    ConstantValueAttribute attribute = new ConstantValueAttribute(entry);
    Object obj = new Object();
    assertFalse(attribute.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClassObject_kgCh2() {
    ByteCode entry = new ByteCode(1);
    ConstantValueAttribute attribute = new ConstantValueAttribute(entry);
    Object obj = new ByteCode(1);
    assertFalse(attribute.equals(obj));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameEntry_lSvr3() {
    ByteCode entry = new ByteCode(1);
    ConstantValueAttribute attribute1 = new ConstantValueAttribute(entry);
    ConstantValueAttribute attribute2 = new ConstantValueAttribute(entry);
    assertTrue(attribute1.equals(attribute2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentEntry_hbhp4() {
    ByteCode entry1 = new ByteCode(1);
    ByteCode entry2 = new ByteCode(2);
    ConstantValueAttribute attribute1 = new ConstantValueAttribute(entry1);
    ConstantValueAttribute attribute2 = new ConstantValueAttribute(entry2);
    assertFalse(attribute1.equals(attribute2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_uqdn0() {
    ByteCode byteCode = new ByteCode(1);
    ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(byteCode);
    int length = constantValueAttribute.getLength();
    assertEquals(2, length);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_WewO0_pKCk0() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    ByteCode byteCode = new ByteCode(1);
    ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute(byteCode);
    constantValueAttribute.writeBody(dos);
    assertEquals(2, bos.size());
}
}