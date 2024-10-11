/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NewAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLayoutIndex_NyRf0() {
        CPUTF8 attributeName = new CPUTF8("attributeName", 0);
        NewAttribute newAttribute = new NewAttribute(attributeName, 1);
        assertEquals(1, newAttribute.getLayoutIndex());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_LLEZ0() {
        CPUTF8 attributeName = new CPUTF8("attributeName");
        NewAttribute newAttribute = new NewAttribute(attributeName, 0);
        int length = newAttribute.getLength();
        assert length == 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRenumber1_kmYI0() {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName", 0), 0);
    List<Integer> byteCodeOffsets = Arrays.asList(1, 2, 3, 4, 5);
    newAttribute.renumber(byteCodeOffsets);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_XKti0_Djxd0() {
    CPUTF8 attributeName = new CPUTF8("attributeName");
    NewAttribute newAttribute = new NewAttribute(attributeName, 0);
    assertEquals("attributeName", newAttribute.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_Kkrl0_XKIb1() {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName"), 0);
    int[] result = newAttribute.getStartPCs();
    int[] expected = new int[0];
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_AttributeName_fwow3_dGba0() {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName", 0), 0);
    ClassFileEntry[] result = newAttribute.getNestedClassFileEntries();
    assert result[0] instanceof CPUTF8;
    assert result[0].equals(new CPUTF8("attributeName", 0));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_NullBody_PWtE4_qQuz0() {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName"), 0);
    newAttribute.renumber(new ArrayList<>());
    ClassFileEntry[] result = newAttribute.getNestedClassFileEntries();
    assert result.length == 1;
    assert result[0] instanceof CPUTF8;
    assert result[0].equals(new CPUTF8("attributeName"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody1_aVJf0_hwzA0() throws IOException {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName", 0), 0);
    DataOutputStream dos = new DataOutputStream(new java.io.ByteArrayOutputStream());
    newAttribute.writeBody(dos);
    assertEquals(0, dos.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddBCIndex_IKRx0_CBEm0() {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName", 0), 0);
    newAttribute.addBCIndex(10, 20);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody3_wVfC2_Ydrx0() throws IOException {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName", 0), 0);
    DataOutputStream dos = new DataOutputStream(new java.io.ByteArrayOutputStream());
    newAttribute.writeBody(dos);
    dos.writeShort(2);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody5_ykgH4_YWJe0() throws IOException {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName", 0), 0);
    DataOutputStream dos = new DataOutputStream(new java.io.ByteArrayOutputStream());
    newAttribute.writeBody(dos);
    dos.writeLong(8);
    assertEquals(8, dos.size());
}
}