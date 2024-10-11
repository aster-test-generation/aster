/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DynamicPropertyPointer_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_setValue_1_ZVIp1() throws Exception {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("name")), new PageContextHandler());
        dynamicPropertyPointer.setValue(new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_ympD1() {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("name")), new PageContextHandler());
        Object value = dynamicPropertyPointer.getImmediateNode();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_HExa1() {
        DynamicPropertyPointer dp = new DynamicPropertyPointer(new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("name")), new PageContextHandler());
        dp.getPropertyNames();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_SOqB3() {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("name")), new PageContextHandler());
        Object value = dynamicPropertyPointer.getImmediateNode();
        assertNotNull(value);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_HExa1_fid1() {
        DynamicPropertyPointer dp = new DynamicPropertyPointer(new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("name")), new PageContextHandler());
        dp.getPropertyNames();
        fail("Should have thrown an exception");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_fQEx4() {
        DynamicPropertyPointer dp = new DynamicPropertyPointer(new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("name")), new PageContextHandler());
        dp.getPropertyNames();
        fail("Should have thrown a NullPointerException");
    }
}