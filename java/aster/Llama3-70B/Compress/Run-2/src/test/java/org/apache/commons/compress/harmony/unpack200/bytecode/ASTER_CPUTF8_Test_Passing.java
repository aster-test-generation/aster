/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPUTF8_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullObject_hEPL1_OUVA1() {
    CPUTF8 obj = new CPUTF8("test", 0);
    assertFalse(obj.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_lezH2_tWFr0() {
    CPUTF8 obj = new CPUTF8("test", 0);
    assertFalse(obj.equals(new Object()));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentUtf8_kfVj3_nxfx0() {
    CPUTF8 obj1 = new CPUTF8("test1", 0);
    CPUTF8 obj2 = new CPUTF8("test2", 0);
    assertFalse(obj1.equals(obj2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_tAFD0_bkvj0() {
    CPUTF8 cpuTF8 = new CPUTF8("utf8");
    cpuTF8.hashCode();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_QbEZ0_RlDy0() throws IOException {
    CPUTF8 cpuTF8 = new CPUTF8("testString", 0);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    cpuTF8.writeBody(dos);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_1_VizR0_IpsU0() {
    CPUTF8 cpuTF8 = new CPUTF8("string", 0);
    int result = cpuTF8.hashCode();
    assertNotEquals(0, result);
}
}