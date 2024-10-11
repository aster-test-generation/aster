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
public class Aster_LineNumberTableAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_ZLxK0() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
    assertTrue(attribute.equals(attribute));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_HuoS1() {
    LineNumberTableAttribute attribute1 = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
    LineNumberTableAttribute attribute2 = new LineNumberTableAttribute(2, new int[]{2}, new int[]{2});
    assertFalse(attribute1.equals(attribute2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_uevf0() {
    LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(10, new int[10], new int[10]);
    assertEquals("LineNumberTable: 10 lines", lineNumberTableAttribute.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_EXrD0() {
    LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
    ClassFileEntry[] result = lineNumberTableAttribute.getNestedClassFileEntries();
    assert(result.length == 1);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_Vmwj0() {
    LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(10, new int[]{1, 2, 3}, new int[]{10, 20, 30});
    int[] expected = new int[]{1, 2, 3};
    assertArrayEquals(expected, lineNumberTableAttribute.getStartPCs());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_uNhw0() {
    LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{3, 4});
    assertEquals(10, lineNumberTableAttribute.getLength());
}
@Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBody_sQMY0_GYoS1_1() throws IOException {
        LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{3, 4});
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
        lineNumberTableAttribute.writeBody(dos);
        byte[] bytes = bos.toByteArray();
        assertEquals(10, bytes.length);}
@Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBody_sQMY0_GYoS1_2() throws IOException {
        LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{3, 4});
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
        lineNumberTableAttribute.writeBody(dos);
        byte[] bytes = bos.toByteArray();
        assertEquals(2, bytes[0] & 0xFF | bytes[1] << 8);}
@Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBody_sQMY0_GYoS1_3() throws IOException {
        LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{3, 4});
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
        lineNumberTableAttribute.writeBody(dos);
        byte[] bytes = bos.toByteArray();
        assertEquals(1, bytes[2] & 0xFF | bytes[3] << 8);}
@Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBody_sQMY0_GYoS1_4() throws IOException {
        LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{3, 4});
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
        lineNumberTableAttribute.writeBody(dos);
        byte[] bytes = bos.toByteArray();
        assertEquals(3, bytes[4] & 0xFF | bytes[5] << 8);}
@Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBody_sQMY0_GYoS1_5() throws IOException {
        LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{3, 4});
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
        lineNumberTableAttribute.writeBody(dos);
        byte[] bytes = bos.toByteArray();
        assertEquals(2, bytes[6] & 0xFF | bytes[7] << 8);}
@Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBody_sQMY0_GYoS1_6() throws IOException {
        LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{3, 4});
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
        lineNumberTableAttribute.writeBody(dos);
        byte[] bytes = bos.toByteArray();
        assertEquals(4, bytes[8] & 0xFF | bytes[9] << 8);}
}