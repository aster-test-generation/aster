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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CPNameAndType_Test_Passing {
@Mock
    private CPSignature signature;
@Test
@Timeout(value =-1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTypeIndex_ctAv0_ISDi0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 name = new org.apache.commons.compress.harmony.pack200.CPUTF8("name");
    CPSignature signature = new CPSignature("signature", new org.apache.commons.compress.harmony.pack200.CPUTF8("signatureForm"), new ArrayList<CPClass>());
    CPNameAndType cpNameAndType = new CPNameAndType(name, signature);
    assertEquals(1, cpNameAndType.getNameIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_ELyG0_yPUN0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 name = new org.apache.commons.compress.harmony.pack200.CPUTF8("name");
    org.apache.commons.compress.harmony.pack200.CPUTF8 signatureForm = new org.apache.commons.compress.harmony.pack200.CPUTF8("signatureForm");
    CPSignature signature = new CPSignature("signature", signatureForm, new ArrayList<CPClass>());
    CPNameAndType cpNameAndType = new CPNameAndType(name, signature);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_Qxmn0_VfhW0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 name = new org.apache.commons.compress.harmony.pack200.CPUTF8("name");
    CPSignature signature = new CPSignature("signature", name, new ArrayList<CPClass>());
    CPNameAndType cpNameAndType = new CPNameAndType(name, signature);
    assertEquals("name:signature", cpNameAndType.toString());
}
@Test
@Timeout(value =-1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNameIndex_Tyxy0_kCFK0() {
    org.apache.commons.compress.harmony.pack200.CPUTF8 name = new org.apache.commons.compress.harmony.pack200.CPUTF8("name");
    org.apache.commons.compress.harmony.pack200.CPUTF8 signatureForm = new org.apache.commons.compress.harmony.pack200.CPUTF8("signatureForm");
    CPSignature signature = new CPSignature("signature", signatureForm, new ArrayList<CPClass>());
    CPNameAndType cpNameAndType = new CPNameAndType(name, signature);
    assertEquals(1, cpNameAndType.getNameIndex());
}
}