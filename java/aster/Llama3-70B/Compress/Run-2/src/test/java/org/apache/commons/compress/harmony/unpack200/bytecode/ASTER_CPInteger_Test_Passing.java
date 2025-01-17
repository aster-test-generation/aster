/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPInteger_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_bzcL0() {
    CPInteger cpInteger = new CPInteger(10, 1);
    assertEquals("Integer: 10", cpInteger.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_NsAa0_pwtY0_1() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    CPInteger cpInteger = new CPInteger(10, 1);
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    cpInteger.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals(4, bytes.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_NsAa0_pwtY0_2() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    CPInteger cpInteger = new CPInteger(10, 1);
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    cpInteger.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals((byte) 0, bytes[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_NsAa0_pwtY0_3() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    CPInteger cpInteger = new CPInteger(10, 1);
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    cpInteger.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals((byte) 0, bytes[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_NsAa0_pwtY0_4() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    CPInteger cpInteger = new CPInteger(10, 1);
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    cpInteger.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals((byte) 0, bytes[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_NsAa0_pwtY0_5() throws IOException {
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    CPInteger cpInteger = new CPInteger(10, 1);
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    cpInteger.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals((byte) 10, bytes[3]);}
}