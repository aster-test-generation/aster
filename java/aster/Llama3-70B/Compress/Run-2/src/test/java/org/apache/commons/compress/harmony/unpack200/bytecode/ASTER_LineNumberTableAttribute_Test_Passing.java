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
public void testEquals_SameObject_fVUF0() {
    LineNumberTableAttribute attribute = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
    assertTrue(attribute.equals(attribute));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_plYJ1() {
    LineNumberTableAttribute attribute1 = new LineNumberTableAttribute(1, new int[]{1}, new int[]{1});
    LineNumberTableAttribute attribute2 = new LineNumberTableAttribute(2, new int[]{2}, new int[]{2});
    assertFalse(attribute1.equals(attribute2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NuqN0() {
    LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(5, new int[]{1, 2, 3}, new int[]{4, 5, 6});
    assertEquals("LineNumberTable: 5 lines", lineNumberTableAttribute.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetStartPCs_VgZC0() {
    LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(10, new int[]{1, 2, 3}, new int[]{4, 5, 6});
    int[] expected = new int[]{1, 2, 3};
    assertArrayEquals(expected, lineNumberTableAttribute.getStartPCs());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_uVfy0() {
    LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{3, 4});
    assertEquals(10, lineNumberTableAttribute.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody1_oczt0_xlOD0() throws IOException {
    LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(2, new int[]{1, 2}, new int[]{3, 4});
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    lineNumberTableAttribute.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertArrayEquals(new byte[]{0, 2, 0, 1, 0, 3, 0, 2, 0, 4}, bytes);
}
}