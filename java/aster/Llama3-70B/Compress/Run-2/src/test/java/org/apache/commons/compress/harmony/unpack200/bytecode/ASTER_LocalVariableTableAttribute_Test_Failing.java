/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LocalVariableTableAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRenumber3_jTKQ2() {
    LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(10, new int[]{1, 2, 3}, new int[]{4, 5, 6}, new CPUTF8[]{}, new CPUTF8[]{}, new int[]{});
    List<Integer> byteCodeOffsets = Arrays.asList(1, 2, 3, 4, 5, 6);
    try {
        attribute.renumber(byteCodeOffsets);
        fail("Expected Pack200Exception");
    } catch (Pack200Exception e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolve_zSCz0() {
    ClassConstantPool pool = new ClassConstantPool();
    int localVariableTableLength = 1;
    int[] startPcs = new int[1];
    int[] lengths = new int[1];
    CPUTF8[] names = new CPUTF8[1];
    CPUTF8[] descriptors = new CPUTF8[1];
    int[] indexes = new int[1];
    LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(localVariableTableLength, startPcs, lengths, names, descriptors, indexes);
    attribute.resolve(pool);
    assertEquals(1, pool.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolveMultipleEntries_gCux1() {
    ClassConstantPool pool = new ClassConstantPool();
    int localVariableTableLength = 2;
    int[] startPcs = new int[2];
    int[] lengths = new int[2];
    CPUTF8[] names = new CPUTF8[2];
    CPUTF8[] descriptors = new CPUTF8[2];
    int[] indexes = new int[2];
    LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(localVariableTableLength, startPcs, lengths, names, descriptors, indexes);
    attribute.resolve(pool);
    assertEquals(2, pool.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody1_qCXo0_pIYa0() throws IOException {
    LocalVariableTableAttribute localVariableTableAttribute = new LocalVariableTableAttribute(2, new int[]{1, 2}, new int[]{3, 4}, new CPUTF8[]{new CPUTF8("name1"), new CPUTF8("name2")}, new CPUTF8[]{new CPUTF8("descriptor1"), new CPUTF8("descriptor2")}, new int[]{5, 6});
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    localVariableTableAttribute.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertArrayEquals(new byte[]{0, 2, 0, 1, 0, 3, 0, 0, 0, 5, 0, 2, 0, 4, 0, 1, 0, 6}, bytes);
}
}