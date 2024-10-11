/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ClassConstantPool_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexOf_entryNull_lbnc0() {
    ClassConstantPool pool = new ClassConstantPool();
    assertEquals(0, pool.indexOf(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGet_Resolved_KSFq0() {
    ClassConstantPool pool = new ClassConstantPool();
    ClassFileEntry entry = pool.get(1);
    assertNotNull(entry);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGet_Resolved_OutOfBounds_WbQV2() {
    ClassConstantPool pool = new ClassConstantPool();
    try {
        pool.get(0);
        fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
        assertEquals("Index 0 out of bounds for length 0", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddWithNestedEntries_null_UDBx2() {
    ClassConstantPool pool = new ClassConstantPool();
    ClassFileEntry entry = null;
    pool.addWithNestedEntries(entry);
    assertEquals(0, pool.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEntries_null_kiJq2_fid1() {
    ClassConstantPool constantPool = new ClassConstantPool();
    List<ClassFileEntry> entries = constantPool.entries();
    assertNull(entries);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIndexOf_entryNull_lbnc0_fid1() {
    ClassConstantPool pool = new ClassConstantPool();
    assertEquals(-1, pool.indexOf(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGet_Resolved_OutOfBounds_WbQV2_fid1() {
    ClassConstantPool pool = new ClassConstantPool();
    try {
        pool.get(-1);
        fail("Expected IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
        assertEquals("Index -1 out of bounds for length 0", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddByteCodeWithHashCode_VkeJ6_uxWD0() {
    ClassConstantPool pool = new ClassConstantPool();
    ByteCode byteCode = new ByteCode(123);
    ClassFileEntry entry = pool.add(byteCode);
    assertNotNull(entry);
}
}