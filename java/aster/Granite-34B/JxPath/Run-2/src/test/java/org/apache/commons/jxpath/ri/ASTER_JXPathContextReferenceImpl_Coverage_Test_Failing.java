/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.Pointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathContextReferenceImpl_Coverage_Test_Failing {
    JXPathContextReferenceImpl jxpathcontextreferenceimpl;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIteratePointers_UlXI0() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        String xpath = "";
        Iterator iterator = jxPathContextReferenceImpl.iteratePointers(xpath);
        assertNotNull(iterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testremoveAll_2_TauY2() throws Exception {
        jxpathcontextreferenceimpl.removeAll("xpath", null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void createPathAndSetValueTest1_Tnzj0() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Pointer pointer = jxPathContextReferenceImpl.createPathAndSetValue("xpath", null);
        assertEquals(null, pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void createPathAndSetValueTest2_mKdG1() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Pointer pointer = jxPathContextReferenceImpl.createPathAndSetValue("xpath", new Object());
        assertEquals(null, pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePath_MZpS0() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null, null);
        context.removePath("xpath");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemovePath2_LTwI1() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null, null);
        context.removePath("xpath", null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_SJeb0() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Function function = jxPathContextReferenceImpl.getFunction(null, null);
        assertEquals(null, function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_ZiTL1() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Function function = jxPathContextReferenceImpl.getFunction(new QName("name"), null);
        assertEquals(null, function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_vrED2() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Function function = jxPathContextReferenceImpl.getFunction(new QName("name"), new Object[0]);
        assertEquals(null, function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_Oxae3() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Function function = jxPathContextReferenceImpl.getFunction(new QName("name"), new Object[1]);
        assertEquals(null, function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_fJck4() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Function function = jxPathContextReferenceImpl.getFunction(new QName("name"), new Object[2]);
        assertEquals(null, function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test6_cRUn5() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Function function = jxPathContextReferenceImpl.getFunction(new QName("name"), new Object[3]);
        assertEquals(null, function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test7_jHoK6() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Function function = jxPathContextReferenceImpl.getFunction(new QName("name"), new Object[4]);
        assertEquals(null, function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test8_YNTY7() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Function function = jxPathContextReferenceImpl.getFunction(new QName("name"), new Object[5]);
        assertEquals(null, function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test9_cvGM8() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Function function = jxPathContextReferenceImpl.getFunction(new QName("name"), new Object[6]);
        assertEquals(null, function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test10_XJAB9() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Function function = jxPathContextReferenceImpl.getFunction(new QName("name"), new Object[7]);
        assertEquals(null, function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test11_QZYJ10() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Function function = jxPathContextReferenceImpl.getFunction(new QName("name"), new Object[8]);
        assertEquals(null, function);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test12_zDXx11() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        Function function = jxPathContextReferenceImpl.getFunction(new QName("name"), new Object[9]);
        assertEquals(null, function);
    }
}