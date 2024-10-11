/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CPFieldRef_Test_Passing {
private CPFieldRef cpFieldRef;
    private int cachedHashCode;
    private boolean hashCodeComputed;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentClass_AuAq2_zwDK0() {
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass cpClass = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass(new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("TestClass"), 1);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType cpNameAndType = new org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType(new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("TestName"), new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("TestType"), 2);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef cpFieldRef = new org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef(cpClass, cpNameAndType, 1);
    Object differentClassObject = new Object();
    assertFalse(cpFieldRef.equals(differentClassObject));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_rKvz0_GrnF0() {
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 classNameUTF = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("TestClass");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass className = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass(classNameUTF, 1);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 nameUTF = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("TestName");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 descriptorUTF = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("TestDescriptor");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType nameAndType = new org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType(nameUTF, descriptorUTF, 2);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef fieldRef = new org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef(className, nameAndType, 3);
    org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] expected = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] { className, nameAndType };
    org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] actual = fieldRef.getNestedClassFileEntries();
    assertArrayEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolve_TcGW0_QfFG0_1() {
    ClassConstantPool pool = mock(ClassConstantPool.class);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass className = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass(new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("TestClass"), 1);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType nameAndType = new org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType(new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("TestName"), new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("TestDescriptor"), 2);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef fieldRef = new org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef(className, nameAndType, 3);
    when(pool.indexOf((ClassFileEntry) className)).thenReturn(10);
    when(pool.indexOf((ClassFileEntry) nameAndType)).thenReturn(20);
    fieldRef.resolve(pool);
    verify(pool).indexOf((ClassFileEntry) className);
    verify(pool).indexOf((ClassFileEntry) nameAndType);
    assertEquals(10, fieldRef.classNameIndex);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolve_TcGW0_QfFG0_2() {
    ClassConstantPool pool = mock(ClassConstantPool.class);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass className = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass(new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("TestClass"), 1);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType nameAndType = new org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType(new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("TestName"), new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("TestDescriptor"), 2);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef fieldRef = new org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef(className, nameAndType, 3);
    when(pool.indexOf((ClassFileEntry) className)).thenReturn(10);
    when(pool.indexOf((ClassFileEntry) nameAndType)).thenReturn(20);
    fieldRef.resolve(pool);
    verify(pool).indexOf((ClassFileEntry) className);
    verify(pool).indexOf((ClassFileEntry) nameAndType);
    assertEquals(20, fieldRef.nameAndTypeIndex);}
}