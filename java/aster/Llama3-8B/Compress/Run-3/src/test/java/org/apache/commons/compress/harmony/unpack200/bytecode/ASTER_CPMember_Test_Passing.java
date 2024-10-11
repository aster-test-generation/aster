/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPMember_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_iWvs0_1() {
    CPUTF8 name = new CPUTF8("name");
    CPUTF8 descriptor = new CPUTF8("descriptor");
    CPMember cpmember = new CPMember(name, descriptor, 0, new ArrayList<>());
    ClassFileEntry[] result = cpmember.getNestedClassFileEntries();
    assertEquals(name, result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_iWvs0_2() {
    CPUTF8 name = new CPUTF8("name");
    CPUTF8 descriptor = new CPUTF8("descriptor");
    CPMember cpmember = new CPMember(name, descriptor, 0, new ArrayList<>());
    ClassFileEntry[] result = cpmember.getNestedClassFileEntries();
    assertEquals(descriptor, result[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_iWvs0_3() {
    CPUTF8 name = new CPUTF8("name");
    CPUTF8 descriptor = new CPUTF8("descriptor");
    CPMember cpmember = new CPMember(name, descriptor, 0, new ArrayList<>());
    ClassFileEntry[] result = cpmember.getNestedClassFileEntries();
    assertEquals(0, result.length - 2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoWrite_FSFe0() throws IOException {
        CPUTF8 name = new CPUTF8("name", 0);
        CPUTF8 descriptor = new CPUTF8("descriptor", 0);
        List<Attribute> attributes = new ArrayList<>();
        CPMember member = new CPMember(name, descriptor, 0, attributes);
        DataOutputStream dos = new DataOutputStream(new java.io.ByteArrayOutputStream());
        member.doWrite(dos);
        assert dos.size() == 8 + 2 + 2 + 2 + attributes.size() * 4;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_PwRb0_jSBE0() {
    CPUTF8 name = new CPUTF8("name");
    CPUTF8 descriptor = new CPUTF8("descriptor");
    CPMember cpmember = new CPMember(name, descriptor, 0, new ArrayList<>());
    boolean result = cpmember.equals(cpmember);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_vJrL1_Dajm0() {
    CPUTF8 name = new CPUTF8("name", 0);
    CPUTF8 descriptor = new CPUTF8("descriptor", 0);
    CPMember cpmember = new CPMember(name, descriptor, 0, new ArrayList<>());
    boolean result = cpmember.equals(null);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_Tgjp2_VZqg0() {
    CPUTF8 name = new CPUTF8("name", 0);
    CPUTF8 descriptor = new CPUTF8("descriptor", 0);
    CPMember cpmember = new CPMember(name, descriptor, 0, new ArrayList<>());
    boolean result = cpmember.equals(new Object());
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentAttributes_vJBe3_JcEr0() {
    CPUTF8 name = new CPUTF8("name", 0);
    CPUTF8 descriptor = new CPUTF8("descriptor", 0);
    CPMember cpmember = new CPMember(name, descriptor, 0, new ArrayList<>());
    CPMember other = new CPMember(name, descriptor, 0, new ArrayList<Attribute>());
    boolean result = cpmember.equals(other);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentDescriptor_QyxW4_SNqe0() {
    CPUTF8 name = new CPUTF8("name", 0);
    CPUTF8 descriptor1 = new CPUTF8("descriptor1", 0);
    CPUTF8 descriptor2 = new CPUTF8("descriptor2", 0);
    CPMember cpmember = new CPMember(name, descriptor1, 0, new ArrayList<>());
    CPMember other = new CPMember(name, descriptor2, 0, new ArrayList<>());
    boolean result = cpmember.equals(other);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentFlags_LTxg5_MONY0() {
    CPUTF8 name = new CPUTF8("name");
    CPUTF8 descriptor = new CPUTF8("descriptor");
    CPMember cpmember = new CPMember(name, descriptor, 1, new ArrayList<>());
    CPMember other = new CPMember(name, descriptor, 0, new ArrayList<>());
    boolean result = cpmember.equals(other);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentName_OgdB6_SBwh0() {
    CPUTF8 cputf8 = new CPUTF8("name1", 0);
    CPMember cpmember = new CPMember(cputf8, new CPUTF8("descriptor", 0), 0, new ArrayList<>());
    CPUTF8 cputf8Other = new CPUTF8("name2", 0);
    CPMember other = new CPMember(cputf8Other, new CPUTF8("descriptor", 0), 0, new ArrayList<>());
    boolean result = cpmember.equals(other);
    assert !result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObjectWithDifferentAttributes_qfnI7_QzSn0() {
    CPUTF8 name = new CPUTF8("name", 0);
    CPUTF8 descriptor = new CPUTF8("descriptor", 0);
    CPMember cpmember = new CPMember(name, descriptor, 0, new ArrayList<>());
    boolean result = cpmember.equals(cpmember);
    assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_nIhV0_IMlI0() {
    CPUTF8 name = new CPUTF8("testName", 0);
    CPUTF8 descriptor = new CPUTF8("testDescriptor", 0);
    List<Attribute> attributes = new ArrayList<>();
    CPMember member = new CPMember(name, descriptor, 1, attributes);
    int expectedHashCode = 1 + 31 * (attributes.hashCode() + 31 * (descriptor.hashCode() + 1) + 1 + 31 * name.hashCode());
    int actualHashCode = member.hashCode();
    assert actualHashCode == expectedHashCode;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_iWvs0() {
    CPUTF8 name = new CPUTF8("name");
    CPUTF8 descriptor = new CPUTF8("descriptor");
    CPMember cpmember = new CPMember(name, descriptor, 0, new ArrayList<>());
    ClassFileEntry[] result = cpmember.getNestedClassFileEntries();
    assertEquals(name, result[0]);
    assertEquals(descriptor, result[1]);
    assertEquals(0, result.length - 2);
}
}