/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPNameAndType_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_CTqE0_wePs0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 name = new org.apache.commons.compress.harmony.pack200.CPUTF8("testName");
    CPSignature signature = new CPSignature("testSignature", name, new java.util.ArrayList<>());
    CPNameAndType cpNameAndType = new CPNameAndType(name, signature);
    assertEquals("testName", cpNameAndType.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_ZzcZ0_jtud0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 name = new org.apache.commons.compress.harmony.pack200.CPUTF8("testName");
    CPSignature signature = new CPSignature("testSignature", name, new java.util.ArrayList<>());
    CPNameAndType cpNameAndType = new CPNameAndType(name, signature);
    assertEquals("testName:testSignature", cpNameAndType.toString());
}
}