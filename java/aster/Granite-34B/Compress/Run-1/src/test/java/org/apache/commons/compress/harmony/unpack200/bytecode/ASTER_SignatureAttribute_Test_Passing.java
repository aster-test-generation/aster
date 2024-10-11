/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SignatureAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setAttributeName_WhenValidInput_SetsAttributeName_QrBv0() {
        CPUTF8 cpUTF8Value = new CPUTF8("validValue");
        SignatureAttribute.setAttributeName(cpUTF8Value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setAttributeName_WhenNullInput_SetsAttributeNameToNull_qHpl1() {
        CPUTF8 cpUTF8Value = null;
        SignatureAttribute.setAttributeName(cpUTF8Value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void setAttributeName_WhenEmptyInput_SetsAttributeNameToEmpty_hfct2() {
        CPUTF8 cpUTF8Value = new CPUTF8("");
        SignatureAttribute.setAttributeName(cpUTF8Value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCPUTF8_1_dkOY0_bxjC0() {
        CPUTF8 cputF8 = new CPUTF8("string");
        SignatureAttribute signatureAttribute = new SignatureAttribute(cputF8);
        int actual = signatureAttribute.getLength();
        int expected = 2;
        assert actual == expected;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCPUTF8_2_bpif1_xcZx0() {
        CPUTF8 cputF8 = new CPUTF8("utf8", 10);
        SignatureAttribute signatureAttribute = new SignatureAttribute(cputF8);
        int actual = signatureAttribute.getLength();
        int expected = 2;
        assert actual == expected;
    }
}