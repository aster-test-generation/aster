/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPUTF8_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBody_LrZL0() throws IOException {
        CPUTF8 utf8 = new CPUTF8("sample string");
        DataOutputStream dos = new DataOutputStream(System.out);
        utf8.writeBody(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBodyWithGlobalIndex_YIcL1() throws IOException {
        CPUTF8 utf8 = new CPUTF8("sample string", 10);
        DataOutputStream dos = new DataOutputStream(System.out);
        utf8.writeBody(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBodyWithIOException_Bjuu4() throws IOException {
        CPUTF8 utf8 = new CPUTF8("sample string");
        DataOutputStream dos = new DataOutputStream(System.out);
        dos.close();
        utf8.writeBody(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSimilarObjectWithGlobalIndex_kVfB4_SbxG0() {
    CPUTF8 utf8 = new CPUTF8("utf8", 10);
    CPUTF8 other = new CPUTF8("utf8", 10);
    assertTrue(utf8.equals(other));
}
}