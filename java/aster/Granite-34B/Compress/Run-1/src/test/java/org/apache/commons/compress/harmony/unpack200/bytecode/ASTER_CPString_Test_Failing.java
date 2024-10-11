/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200.bytecode;
import java.io.DataOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPString_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolve_lQFW0() {
        CPUTF8 utf8 = new CPUTF8("test");
        int globalIndex = 0;
        CPString cpString = new CPString(utf8, globalIndex);
        ClassConstantPool pool = new ClassConstantPool();
        cpString.resolve(pool);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolveWithNullPool_TBdZ1() {
        CPUTF8 utf8 = new CPUTF8("test");
        int globalIndex = 0;
        CPString cpString = new CPString(utf8, globalIndex);
        cpString.resolve(null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolveWithPoolWithNestedEntries_tDqX4() {
        CPUTF8 utf8 = new CPUTF8("test");
        int globalIndex = 0;
        CPString cpString = new CPString(utf8, globalIndex);
        ClassConstantPool pool = new ClassConstantPool();
        pool.addNestedEntries();
        cpString.resolve(pool);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testResolveWithPoolWithManyNestedEntries_HgKC6() {
        CPUTF8 utf8 = new CPUTF8("test");
        int globalIndex = 0;
        CPString cpString = new CPString(utf8, globalIndex);
        ClassConstantPool pool = new ClassConstantPool();
        for (int i = 0; i < 10; i++) {
            pool.addNestedEntries();
        }
        cpString.resolve(pool);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testWriteBodyWithNullUTF8_GHGS2() throws IOException {
        CPUTF8 utf8 = null;
        CPString cpString = new CPString(utf8, 0);
        DataOutputStream dos = new DataOutputStream(System.out);
        cpString.writeBody(dos);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_ebKo0_KroF0() {
        CPUTF8 utf8 = new CPUTF8("test", 0);
        CPString name = new CPString(utf8, 0);
        int PRIME = 31;
        int result = 1;
        result = PRIME * result + name.hashCode();
        assertEquals(result, name.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_vBzs0_JPrI0() {
        CPUTF8 utf8 = new CPUTF8("Hello", 0);
        CPString cpString = new CPString(utf8, 0);
        String result = cpString.toString();
        String expected = "String: Hello";
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithEmptyValue_BZVh1_SvJW0() {
        CPUTF8 utf8 = new CPUTF8("", 0);
        CPString cpString = new CPString(utf8, 0);
        String result = cpString.toString();
        String expected = "String: ";
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithPositiveGlobalIndex_WyGU5_jJwI0() {
        CPUTF8 utf8 = new CPUTF8("Hello");
        CPString cpString = new CPString(utf8, 1);
        String result = cpString.toString();
        String expected = "String: Hello";
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNegativeGlobalIndex_gFXr3_UGDz0() {
        CPUTF8 utf8 = new CPUTF8("Hello", -1);
        CPString cpString = new CPString(utf8, -1);
        String result = cpString.toString();
        String expected = "String: Hello";
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullCPUTF8_CwEc2_jIzf0() {
        CPUTF8 utf8 = null;
        CPString cpString = new CPString(utf8, 0);
        String result = cpString.toString();
        String expected = "String: null";
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullCPUTF8AndNegativeGlobalIndex_ElTt6_FJlS0() {
        CPUTF8 utf8 = null;
        CPString cpString = new CPString(utf8, -1);
        String result = cpString.toString();
        String expected = "String: null";
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNullCPUTF8AndPositiveGlobalIndex_HWKf8_GZar0() {
        CPUTF8 utf8 = null;
        CPString cpString = new CPString(utf8, 1);
        String result = cpString.toString();
        String expected = "String: null";
        assertEquals(expected, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithEmptyValueAndNegativeGlobalIndex_bvaK9_XFTA0() {
        CPUTF8 utf8 = new CPUTF8("");
        CPString cpString = new CPString(utf8, -1);
        String result = cpString.toString();
        String expected = "String: ";
        assertEquals(expected, result);
    }
}