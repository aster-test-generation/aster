/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPString_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNestedClassFileEntries_AmEo0_kCNv0() {
    CPUTF8 cpuTF8 = new CPUTF8("utf8"); 
    CPString cpString = new CPString(new CPUTF8("utf8"), 1);
    ClassFileEntry[] result = cpString.getNestedClassFileEntries();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_WhenHashCodeNotComputed_ThenGenerateHashCode_CvlF0_udpL0() {
    CPUTF8 utf8 = new CPUTF8("utf8");
    CPString cpString = new CPString(new CPUTF8("utf8"), 0);
    int result = cpString.hashCode();
}
@Test
@Timeout(value =0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_HvAZ0_GWom0() throws IOException {
    CPUTF8 utf8 = new CPUTF8("utf8");
    CPString cpString = new CPString(new CPUTF8("utf8",0),0);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    cpString.writeBody(dos);
    assertEquals(1, bos.toByteArray()[0]);
}
}