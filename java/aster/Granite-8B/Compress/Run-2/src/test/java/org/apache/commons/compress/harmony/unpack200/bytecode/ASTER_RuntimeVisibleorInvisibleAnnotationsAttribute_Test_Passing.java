/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RuntimeVisibleorInvisibleAnnotationsAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testClassConstantPoolConstructor_jUmz2() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        assertNotNull(classConstantPool);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEntries_TKIp4() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        List<ClassFileEntry> entries = classConstantPool.entries();
        assertNotNull(entries);
        assertTrue(entries.isEmpty());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAddNestedEntries_drgq7() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        classConstantPool.addNestedEntries();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSize_MKxj10() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        int size = classConstantPool.size();
        assertEquals(0, size);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEntries_TKIp4_1() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        List<ClassFileEntry> entries = classConstantPool.entries();
        assertNotNull(entries);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEntries_TKIp4_2() {
        ClassConstantPool classConstantPool = new ClassConstantPool();
        List<ClassFileEntry> entries = classConstantPool.entries();
        assertTrue(entries.isEmpty());}
}