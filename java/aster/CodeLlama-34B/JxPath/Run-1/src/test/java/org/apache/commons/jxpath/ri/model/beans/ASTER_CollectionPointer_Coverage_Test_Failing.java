/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CollectionPointer_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueWholeCollection_XMmp0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.ENGLISH);
        Object value = new Object();
        collectionPointer.setValue(value);
        assertEquals(value, collectionPointer.getParent().getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueNullValue_LbVa2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.ENGLISH);
        Object value = null;
        collectionPointer.setValue(value);
        assertTrue(collectionPointer.getParent().getValue() == null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueNullLocale_wXZr5() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), null);
        Object value = new Object();
        collectionPointer.setValue(value);
        assertTrue(collectionPointer.getParent().getValue() == null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithNullContext_lbQT1() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.ENGLISH);
        Object value = new Object();
        NodePointer ptr = collectionPointer.createPath(null, value);
        assertNotNull(ptr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueNullParent_NKcP4_IdQl0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.ENGLISH);
        collectionPointer.setValue(null);
        Object value = new Object();
        collectionPointer.setValue(value);
        assertNull(collectionPointer.getParent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndexWithKeywordVariables_Ruqv2_NLeR0() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(variables, new QName("prefix", "localName"));
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        collectionPointer.setIndex(1);
        assertNull(collectionPointer.getValuePointer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNode_NullTest_RCuf1_fid1() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        NodeTest test = null;
        assertFalse(collectionPointer.testNode(test));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_OfjA0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        int length = collectionPointer.getLength();
        assertEquals(0, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithKeywordVariables_zJvF2_fid1() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        VariablePointer variablePointer = new VariablePointer(variables, new QName("prefix", "localName"));
        CollectionPointer collectionPointer = new CollectionPointer(variablePointer, new Object());
        int length = collectionPointer.getLength();
        assertEquals(0, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithNullContext_lbQT1_fid1() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.ENGLISH);
        Object value = new Object();
        NodePointer ptr = collectionPointer.createPath(null, value);
        assertNull(ptr);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueNullParent_NKcP4_IdQl0_fid1() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.ENGLISH);
        collectionPointer.setValue(null);
        Object value = new Object();
        collectionPointer.setValue(value);
        assertTrue(collectionPointer.getParent() == null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetIndex_xVyB0_lETx0_fid1() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        collectionPointer.setIndex(1);
        assertNull(collectionPointer.getBaseValue());
    }
}