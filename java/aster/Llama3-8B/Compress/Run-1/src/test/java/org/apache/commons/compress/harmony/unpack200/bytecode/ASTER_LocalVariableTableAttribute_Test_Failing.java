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
public class Aster_LocalVariableTableAttribute_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBodyEmpty_XHrc1_Kuhy2() throws IOException {
    LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(2, new int[2], new int[2], new CPUTF8[2], new CPUTF8[2], new int[2]);
    DataOutputStream dos = new DataOutputStream(new java.io.ByteArrayOutputStream());
    attribute.writeBody(dos);
    assertEquals(2, dos.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBodyEmpty_XHrc1_Kuhy0() throws IOException {
    LocalVariableTableAttribute attribute = new LocalVariableTableAttribute(0, new int[0], new int[0], new CPUTF8[0], new CPUTF8[0], new int[0]);
    DataOutputStream dos = new DataOutputStream(new java.io.ByteArrayOutputStream());
    attribute.writeBody(dos);
    assertEquals(0, dos.size());
}
}