/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPString_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEntries_uoBI2() {
    ClassConstantPool pool = new ClassConstantPool();
    List<ClassFileEntry> entries = pool.entries();
    assertEquals(0, entries.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testAddNestedEntries_vWqL5() {
    ClassConstantPool pool = new ClassConstantPool();
    pool.addNestedEntries();
    assertEquals(0, pool.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSize_SMay8() {
    ClassConstantPool pool = new ClassConstantPool();
    int size = pool.size();
    assertEquals(0, size);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBody_GmfQ0_kkKp0() throws IOException {
        CPUTF8 utf8 = new CPUTF8("example");
        CPString cpString = new CPString(utf8, 1);
        DataOutputStream dos = new DataOutputStream(System.out);
        cpString.writeBody(dos);
        dos.flush();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithGlobalIndex_mphF1_dTdM0() {
        CPUTF8 cputf8 = new CPUTF8("test", 1);
        assertEquals(31 * 1 + "test".hashCode(), cputf8.hashCode());
    }
}