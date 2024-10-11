/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

public class Aster_VariablePointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreateChild1_UXOF1() throws Exception {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFindVariables1_XDFa0() {
        VariablePointer variablePointer = new VariablePointer(null);
        variablePointer.findVariables(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode2_tZdQ1() {
        VariablePointer variablePointer = new VariablePointer(new KeywordVariables("", ""), new QName(""));
        Object value = variablePointer.getBaseValue();
        Object result = variablePointer.getImmediateNode();
        assertEquals(ValueUtils.getValue(value), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAttributeIterator_zPXZ0() {
        VariablePointer variablePointer = new VariablePointer(new QName(""));
        NodeIterator nodeIterator = variablePointer.attributeIterator(new QName(""));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_GtzP0() {
        VariablePointer variablePointer = new VariablePointer(new QName(""));
        variablePointer.getImmediateValuePointer();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath2_fvQZ1() {
        VariablePointer variablePointer = new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("prefix", "localName"));
        String actual = variablePointer.asPath();
        String expected = "$prefix:localName";
        assert actual.equals(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath3_bzMZ2() {
        VariablePointer variablePointer = new VariablePointer(new QName("prefix", "localName"));
        String actual = variablePointer.asPath();
        String expected = "$prefix:localName";
        assert actual.equals(expected);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWhenValueIsAtomic_TKqe1_XDyf0() {
        Object value = new Object();
        when(JXPathIntrospector.getBeanInfo(value.getClass()).isAtomic()).thenReturn(true);
        VariablePointer variablePointer = new VariablePointer(null, new QName(value.toString()));
        boolean isLeaf = variablePointer.isLeaf();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath1_UOnt0_waXL1() {
        VariablePointer variablePointer = new VariablePointer(new KeywordVariables("keyword", new QName("prefix", "localName")), new QName("prefix", "localName"));
        String actual = variablePointer.asPath();
        String expected = "$prefix:localName";
        assert actual.equals(expected);
    }
}