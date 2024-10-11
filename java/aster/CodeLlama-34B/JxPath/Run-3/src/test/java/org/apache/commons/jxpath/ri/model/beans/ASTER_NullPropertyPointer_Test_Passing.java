/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NullPropertyPointer_Test_Passing {
    private String propertyName = "*";
    NullPropertyPointer nullpropertypointer;
    private boolean byNameAttribute = false;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNameWithNullParent_AdHz3() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
        assertNull(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode_NonNullParent_NullNode_DrTe3() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(new DOMNodePointer(null, new Locale("en", "US"), "id"));
        assertNull(nullPropertyPointer.getImmediateNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode_NonNullParent_NullNode_NullLocale_GBNc7() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(new DOMNodePointer(null, null, "id"));
        assertNull(nullPropertyPointer.getImmediateNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode_NonNullParent_NullNode_NonNullLocale_eDpd13() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(new DOMNodePointer(null, new Locale("en", "US"), "id"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer_NullParent_kbLD2() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer_NullNode_NMxM3() {
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(new DOMNodePointer(null, new Locale("en"), "id"));
        assertTrue(nullPropertyPointer.isContainer());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameWithVariablePointer_sNZO2_1() {
        VariablePointer variablePointer = new VariablePointer(new QName("variableName"));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(variablePointer);
        QName name = nullPropertyPointer.getName();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValueWithKeywordVariables_vPFK2() {
        KeywordVariables variables = new KeywordVariables("keyword", new Object());
        QName name = new QName("qualifiedName");
        VariablePointer variablePointer = new VariablePointer(variables, name);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(variablePointer);
        Object baseValue = nullPropertyPointer.getBaseValue();
        assertNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValueWithQName_JXkX3() {
        QName name = new QName("qualifiedName");
        VariablePointer variablePointer = new VariablePointer(name);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(variablePointer);
        Object baseValue = nullPropertyPointer.getBaseValue();
        assertNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValueWithVariablePointer_kedb6() {
        VariablePointer variablePointer = new VariablePointer(new QName("qualifiedName"));
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(variablePointer);
        Object baseValue = nullPropertyPointer.getBaseValue();
        assertNull(baseValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPropertyCount() throws Exception {
        nullpropertypointer = new NullPropertyPointer(mock(DOMNodePointer.class));
        assertEquals(0, nullpropertypointer.getPropertyCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafWithParent_PLMi1_Dcny0() {
        QName qName = new QName("qualifiedName");
        VariablePointer pointer = new VariablePointer(qName);
        DOMNodePointer parent = new DOMNodePointer(pointer, null);
        NullPropertyPointer nullPropertyPointer = new NullPropertyPointer(parent);
        assertTrue(nullPropertyPointer.isLeaf());
    }
}