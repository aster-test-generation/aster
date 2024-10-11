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
public class Aster_CPString_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_aSIo0_Rbcg0_1() throws IOException {
    CPUTF8 cpuTF8 = new CPUTF8("utf8");
    CPString cpString = new CPString(cpuTF8, 0);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    cpString.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals(2, bytes.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_aSIo0_Rbcg0_3() throws IOException {
    CPUTF8 cpuTF8 = new CPUTF8("utf8");
    CPString cpString = new CPString(cpuTF8, 0);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    cpString.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals(0, bytes[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_snnx0_YNmT0() {
    CPUTF8 cpuTF8 = new CPUTF8("utf8");
    CPString cpString = new CPString(cpuTF8, 1);
    int result = cpString.hashCode();
    assertNotEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeComputed_Pbry1_nzTN0() {
    CPUTF8 cpuTF8 = new CPUTF8("string", 0);
    CPString cpString = new CPString(cpuTF8, 0); 
    int hashCode1 = cpString.hashCode();
    int hashCode2 = cpString.hashCode();
    assertEquals(hashCode1, hashCode2);
}
}