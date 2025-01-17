/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPUTF8_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NullString_qRzB3() {
    CPUTF8 cputf8 = new CPUTF8("");
    assertEquals("UTF-8:null", cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_NullDataOutputStream_ZRMS7() throws IOException {
    String utf8 = "Hello, world!";
    int globalIndex = 0;
    CPUTF8 cputf8 = new CPUTF8(utf8, globalIndex);
    DataOutputStream dos = null;
    cputf8.writeBody(dos);
    assertNotNull(dos);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_NullDataOutputStreamAndUTF8_ZGgb8() throws IOException {
    String utf8 = "";
    int globalIndex = 0;
    CPUTF8 cputf8 = new CPUTF8(utf8, globalIndex);
    DataOutputStream dos = null;
    cputf8.writeBody(dos);
    assertNull(dos);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_NullString_qRzB3_fid1() {
    CPUTF8 cputf8 = new CPUTF8(null);
    assertEquals("UTF-8:null", cputf8.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetGlobalIndexWithNullString_zEAZ5_fid1() {
    CPUTF8 cputf8 = new CPUTF8(null, 0);
    cputf8.setGlobalIndex(1);
    assertEquals(1, cputf8.getGlobalIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_NullDataOutputStream_ZRMS7_fid1() throws IOException {
    String utf8 = "Hello, world!";
    int globalIndex = 0;
    CPUTF8 cputf8 = new CPUTF8(utf8, globalIndex);
    DataOutputStream dos = null;
    cputf8.writeBody(dos);
    assertNull(dos);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWriteBody_NullDataOutputStreamAndUTF8_ZGgb8_fid1() throws IOException {
    String utf8 = null;
    int globalIndex = 0;
    CPUTF8 cputf8 = new CPUTF8(utf8, globalIndex);
    DataOutputStream dos = null;
    cputf8.writeBody(dos);
    assertNull(dos);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentObject_DifferentGlobalIndex_TsuV2_Ytvt0_fid1() {
    CPUTF8 cpUTF8 = new CPUTF8("test", 1);
    CPUTF8 other = new CPUTF8("test", 2);
    assertFalse(cpUTF8.equals(other));
}
}