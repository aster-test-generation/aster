/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SignatureAttribute_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_ONmD0() throws Exception {
        CPUTF8 cputf8 = new CPUTF8("example");
        SignatureAttribute signatureAttribute = new SignatureAttribute(cputf8);
        assertEquals("Signature: example", signatureAttribute.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_DHBU1() throws Exception {
        CPUTF8 cputf8 = new CPUTF8("example", 1);
        SignatureAttribute signatureAttribute = new SignatureAttribute(cputf8);
        assertEquals("Signature: example", signatureAttribute.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntries_WXHI0_1() throws Exception {
        CPUTF8 utf8 = new CPUTF8("example");
        CPUTF8 value = new CPUTF8("value");
        SignatureAttribute signatureAttribute = new SignatureAttribute(value);
        ClassFileEntry[] result = signatureAttribute.getNestedClassFileEntries();
        assertEquals(2, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntries_WXHI0_2() throws Exception {
        CPUTF8 utf8 = new CPUTF8("example");
        CPUTF8 value = new CPUTF8("value");
        SignatureAttribute signatureAttribute = new SignatureAttribute(value);
        ClassFileEntry[] result = signatureAttribute.getNestedClassFileEntries();
        assertEquals(utf8, result[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNestedClassFileEntries_WXHI0_3() throws Exception {
        CPUTF8 utf8 = new CPUTF8("example");
        CPUTF8 value = new CPUTF8("value");
        SignatureAttribute signatureAttribute = new SignatureAttribute(value);
        ClassFileEntry[] result = signatureAttribute.getNestedClassFileEntries();
        assertEquals(value, result[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLength_ABvZ0() throws Exception {
        CPUTF8 utf8 = new CPUTF8("example");
        SignatureAttribute attribute = new SignatureAttribute(utf8);
        assertEquals(2, attribute.getLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLengthWithGlobalIndex_fOIs1() throws Exception {
        CPUTF8 utf8 = new CPUTF8("example", 10);
        SignatureAttribute attribute = new SignatureAttribute(utf8);
        assertEquals(2, attribute.getLength());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolve_vfEK0() throws Exception {
        CPUTF8 utf8 = new CPUTF8("UTF8");
        ClassConstantPool pool = new ClassConstantPool();
        SignatureAttribute signatureAttribute = new SignatureAttribute(utf8);
        signatureAttribute.resolve(pool);
        assertEquals(1, pool.size());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBody_TvKf0() throws IOException {
        CPUTF8 cPUTF8 = new CPUTF8("test");
        SignatureAttribute signatureAttribute = new SignatureAttribute(cPUTF8);
        DataOutputStream dos = new DataOutputStream(System.out);
        signatureAttribute.writeBody(dos);
        dos.flush();
    }
}