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
public class Aster_CPMember_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoWrite_Ospd0() throws IOException {
        CPUTF8 name = new CPUTF8("testName", 0);
        CPUTF8 descriptor = new CPUTF8("testDescriptor", 0);
        List<Attribute> attributes = new ArrayList<>();
        CPMember member = new CPMember(name, descriptor, 0, attributes);
        DataOutputStream dos = new DataOutputStream(new java.io.ByteArrayOutputStream());
        member.doWrite(dos);
        assert dos.size() == 8 + 2 + 2 + 2 + attributes.size() * 4;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_AUOx0() {
        CPUTF8 name = new CPUTF8("testName");
        CPUTF8 descriptor = new CPUTF8("testDescriptor");
        List<Attribute> attributes = new ArrayList<>();
        CPMember member = new CPMember(name, descriptor, 1, attributes);
        int expected = 1 + 31 * attributes.hashCode() + 31 * descriptor.hashCode() + 1 + 31 * name.hashCode();
        assertEquals(expected, member.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_OUfN0_CnAy0_fid1() {
    CPUTF8 name = new CPUTF8("testName");
    CPUTF8 descriptor = new CPUTF8("testDescriptor");
    CPMember cpmember = new CPMember(name, descriptor, 0, null);
    String result = cpmember.toString();
    assertEquals("CPMember: testName(testDescriptor)", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentAttributes_ABaS3_qdup0_fid1() {
    CPUTF8 name = new CPUTF8("name", 0);
    CPUTF8 descriptor = new CPUTF8("descriptor", 0);
    CPMember cpmember = new CPMember(name, descriptor, 0, new ArrayList<>());
    CPUTF8 otherName = new CPUTF8("name", 0);
    CPUTF8 otherDescriptor = new CPUTF8("descriptor", 0);
    CPMember other = new CPMember(otherName, otherDescriptor, 0, new ArrayList<>());
    boolean result = cpmember.equals(other);
    assert !result;
}
}