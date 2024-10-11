/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NewAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolve_ClassConstantPoolEmpty_eoiN0() {
    NewAttribute attribute = new NewAttribute(new CPUTF8("attributeName"), 1);
    ClassConstantPool pool = new ClassConstantPool();
    attribute.resolve(pool);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_EmptyBody_LCnx0_JaYu0() {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName", 0), 0);
    ClassFileEntry[] result = newAttribute.getNestedClassFileEntries();
    assert result.length == 0;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_Kkrl0_vWao0() {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName", 0), 0);
    int[] result = newAttribute.getStartPCs();
    int[] expected = new int[0];
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_Kkrl0_XKIb1_fid2() {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName"), 0);
    int[] result = newAttribute.getStartPCs();
    int[] expected = new int[0];
    assertArrayEquals(expected, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody3_wVfC2_Ydrx0_fid2() throws IOException {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName", 0), 0);
    DataOutputStream dos = new DataOutputStream(new java.io.ByteArrayOutputStream());
    newAttribute.writeBody(dos);
    dos.writeShort(2);
    assertEquals(3, dos.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody5_ykgH4_YWJe0_fid2() throws IOException {
    NewAttribute newAttribute = new NewAttribute(new CPUTF8("attributeName", 0), 0);
    DataOutputStream dos = new DataOutputStream(new java.io.ByteArrayOutputStream());
    newAttribute.writeBody(dos);
    dos.writeLong(8);
    assertEquals(16, dos.size());
}
}