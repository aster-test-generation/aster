/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ExceptionsAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testResolveEmptyExceptions_AgQT1_gWYQ0() {
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] exceptions = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[0];
    ExceptionsAttribute exceptionsAttribute = new ExceptionsAttribute(exceptions);
    assertEquals(0, exceptionsAttribute.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_Eqbi0_UDhQ0() {
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] exceptions = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[0];
    ExceptionsAttribute exceptionsAttribute = new ExceptionsAttribute(exceptions);
    int hashCode = exceptionsAttribute.hashCode();
    assertEquals(0, hashCode);
}
}