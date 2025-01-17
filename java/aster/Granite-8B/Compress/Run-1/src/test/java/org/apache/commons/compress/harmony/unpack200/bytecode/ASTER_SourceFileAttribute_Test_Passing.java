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
public class Aster_SourceFileAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSourceFileAttribute10_WJta9() {
        CPUTF8 cPUTF8 = new CPUTF8("test", 1);
        SourceFileAttribute sourceFileAttribute = new SourceFileAttribute(cPUTF8);
        boolean result = sourceFileAttribute.isSourceFileAttribute();
        assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBody_IUYp0_LSFw0() throws IOException {
        CPUTF8 name = new CPUTF8("example");
        SourceFileAttribute attribute = new SourceFileAttribute(name);
        DataOutputStream dos = new DataOutputStream(System.out);
        attribute.writeBody(dos);
        dos.flush();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSourceFileAttribute_nLBh0_XvyN0() {
        CPUTF8 cPUTF8 = new CPUTF8("test");
        SourceFileAttribute sourceFileAttribute = new SourceFileAttribute(cPUTF8);
        boolean result = sourceFileAttribute.isSourceFileAttribute();
        assertTrue(result);
    }
}