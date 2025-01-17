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
public class Aster_CPNameAndType_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNameIndex_tZPJ0_CrAB0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 name = new org.apache.commons.compress.harmony.pack200.CPUTF8("name");
    org.apache.commons.compress.harmony.pack200.CPUTF8 signatureForm = new org.apache.commons.compress.harmony.pack200.CPUTF8("signatureForm");
    CPSignature signature = new CPSignature("signature", signatureForm, new ArrayList<CPClass>());
    CPNameAndType cpNameAndType = new CPNameAndType(name, signature);
    assertEquals(1, cpNameAndType.getNameIndex());
}
}