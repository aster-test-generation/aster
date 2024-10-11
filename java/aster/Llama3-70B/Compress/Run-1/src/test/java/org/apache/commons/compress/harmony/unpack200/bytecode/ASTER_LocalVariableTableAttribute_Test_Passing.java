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
public class Aster_LocalVariableTableAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody2_tICr1_KWIN0_1() throws IOException {
    LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(0, new int[0], new int[0], new CPUTF8[0], new CPUTF8[0], new int[0]);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    attribute.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals(2, bytes.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody2_tICr1_KWIN0_2() throws IOException {
    LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(0, new int[0], new int[0], new CPUTF8[0], new CPUTF8[0], new int[0]);
    java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream dos = new java.io.DataOutputStream(bos);
    attribute.writeBody(dos);
    byte[] bytes = bos.toByteArray();
    assertEquals(0, bytes[0] << 8 | bytes[1]);}
}