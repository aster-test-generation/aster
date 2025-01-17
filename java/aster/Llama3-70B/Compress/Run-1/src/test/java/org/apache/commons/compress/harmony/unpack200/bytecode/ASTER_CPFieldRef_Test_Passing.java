/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPFieldRef_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_WhenClassNameAndNameAndTypeAreNotNull_ThenReturnHashCode_uWNi0_ZrzI0() {
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 classNameUTF8 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("className");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass className = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass(classNameUTF8, 1);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 nameUTF8 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("name");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 descriptorUTF8 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("descriptor");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType nameAndType = new org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType(nameUTF8, descriptorUTF8, 2);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef cpFieldRef = new org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef(className, nameAndType, 3);
    int hashCode = cpFieldRef.hashCode();
    assertNotEquals(0, hashCode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_RQfG0_NkxG0_1() throws IOException {
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 className = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("className");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 name = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("name");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 descriptor = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("descriptor");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass classNameObj = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass(className, 1);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType nameAndType = new org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType(new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("name"), new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("descriptor"), 2);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef cpFieldRef = new org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef(classNameObj, nameAndType, 3);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    cpFieldRef.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals(4, bytes.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_RQfG0_NkxG0_2() throws IOException {
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 className = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("className");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 name = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("name");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 descriptor = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("descriptor");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass classNameObj = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass(className, 1);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType nameAndType = new org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType(new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("name"), new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("descriptor"), 2);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef cpFieldRef = new org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef(classNameObj, nameAndType, 3);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    cpFieldRef.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals(0, bytes[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_RQfG0_NkxG0_4() throws IOException {
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 className = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("className");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 name = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("name");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 descriptor = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("descriptor");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass classNameObj = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass(className, 1);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType nameAndType = new org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType(new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("name"), new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("descriptor"), 2);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef cpFieldRef = new org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef(classNameObj, nameAndType, 3);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    cpFieldRef.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals(0, bytes[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_WhenClassNameOrNameAndTypeIsNull_ThenReturnHashCode_HatI1_fid2() {
    CPFieldRef cpFieldRef = new CPFieldRef(null, null, 1);
    int hashCode = cpFieldRef.hashCode();
}
@Test
@Timeout(value =0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_RQfG0_NkxG0_3_fid2() throws IOException {
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 className = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("className");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 name = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("name");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 descriptor = new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("descriptor");
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass classNameObj = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass(className,0);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType nameAndType = new org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType(new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("name"), new org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8("descriptor"), 2);
    org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef cpFieldRef = new org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef(classNameObj, nameAndType, 3);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    cpFieldRef.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals(1, bytes[1]);}
}