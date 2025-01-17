/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_VariablePointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_pgCC0() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        QName name = new QName("prefix", "localName");
        VariablePointer pointer = new VariablePointer(variables, name);
        assertFalse(pointer.isCollection());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_actualFalse_Htye0() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        Object value = new Object();
        try {
            variablePointer.setValue(value);
        } catch (JXPathException e) {
            assertEquals("Cannot set undefined variable: name", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_indexNotWholeCollection_Tbuj1() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        Object value = new Object();
        variablePointer.setIndex(1);
        try {
            variablePointer.setValue(value);
        } catch (JXPathException e) {
            assertEquals("Cannot set undefined variable: name", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_indexWholeCollection_STIR2() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        Object value = new Object();
        variablePointer.setIndex(VariablePointer.WHOLE_COLLECTION);
        try {
            variablePointer.setValue(value);
        } catch (JXPathException e) {
            assertEquals("Cannot set undefined variable: name", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateValuePointer_cfUB0() {
        VariablePointer variablePointer = new VariablePointer(new QName("test"));
        NodePointer nodePointer = variablePointer.getImmediateValuePointer();
        assertNotNull(nodePointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_VVnd0() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        assertTrue(variablePointer.equals(variablePointer));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentObject_BQfA1() {
        VariablePointer variablePointer1 = new VariablePointer(new QName("name1"));
        VariablePointer variablePointer2 = new VariablePointer(new QName("name2"));
        assertFalse(variablePointer1.equals(variablePointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullObject_InzY2() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        assertFalse(variablePointer.equals(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_yNxg3() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        Object object = new Object();
        assertFalse(variablePointer.equals(object));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameVariablesAndName_vViW4() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        QName name = new QName("name");
        VariablePointer variablePointer1 = new VariablePointer(variables, name);
        VariablePointer variablePointer2 = new VariablePointer(variables, name);
        assertTrue(variablePointer1.equals(variablePointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentVariables_wWNs5() {
        KeywordVariables variables1 = new KeywordVariables("keyword1", new Object());
        KeywordVariables variables2 = new KeywordVariables("keyword2", new Object());
        QName name = new QName("name");
        VariablePointer variablePointer1 = new VariablePointer(variables1, name);
        VariablePointer variablePointer2 = new VariablePointer(variables2, name);
        assertFalse(variablePointer1.equals(variablePointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentName_qXhh6() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        QName name1 = new QName("name1");
        QName name2 = new QName("name2");
        VariablePointer variablePointer1 = new VariablePointer(variables, name1);
        VariablePointer variablePointer2 = new VariablePointer(variables, name2);
        assertFalse(variablePointer1.equals(variablePointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameIndex_Ctdn7() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        QName name = new QName("name");
        VariablePointer variablePointer1 = new VariablePointer(variables, name);
        variablePointer1.setIndex(1);
        VariablePointer variablePointer2 = new VariablePointer(variables, name);
        variablePointer2.setIndex(1);
        assertTrue(variablePointer1.equals(variablePointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentIndex_PKrS8() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        QName name = new QName("name");
        VariablePointer variablePointer1 = new VariablePointer(variables, name);
        variablePointer1.setIndex(1);
        VariablePointer variablePointer2 = new VariablePointer(variables, name);
        variablePointer2.setIndex(2);
        assertFalse(variablePointer1.equals(variablePointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithActual_ecDr0() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        QName name = new QName("prefix", "localName");
        VariablePointer pointer = new VariablePointer(variables, name);
        String expected = "$prefix:localName";
        String actual = pointer.asPath();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 0, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_valueNull_GKBf2_hVVL1() {
        VariablePointer variablePointer = new VariablePointer(new QName("name"));
        int length = variablePointer.getLength();
        assertEquals(1, length);
    }
}