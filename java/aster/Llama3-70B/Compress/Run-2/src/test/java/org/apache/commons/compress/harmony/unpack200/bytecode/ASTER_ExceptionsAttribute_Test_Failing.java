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
public class Aster_ExceptionsAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_cMkP0_repY0_1() throws IOException {
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] exceptions = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[0];
    ExceptionsAttribute exceptionsAttribute = new ExceptionsAttribute(exceptions);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    exceptionsAttribute.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals(2, bytes[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_cMkP0_repY0_2() throws IOException {
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] exceptions = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[0];
    ExceptionsAttribute exceptionsAttribute = new ExceptionsAttribute(exceptions);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    exceptionsAttribute.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals(0, bytes[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_cMkP0_repY0_2_fid2() throws IOException {
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] exceptions = new org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[0];
    ExceptionsAttribute exceptionsAttribute = new ExceptionsAttribute(exceptions);
    assertNotNull(exceptionsAttribute);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    exceptionsAttribute.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals(8, bytes.length);
}
}