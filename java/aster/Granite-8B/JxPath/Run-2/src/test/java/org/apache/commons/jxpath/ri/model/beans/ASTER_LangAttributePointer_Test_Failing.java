/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_LangAttributePointer_Test_Failing {
    private LangAttributePointer langattributepointer;
    private NodePointer parent;
    private NodePointer pointer1;
    private NodePointer pointer2;
    private LangAttributePointer otherLangattributepointer;
    private NodeTest test;
    private VariablePointer variablePointer;
    private KeywordVariables keywordVariables;
    private DOMNodePointer domNodePointer;
    private QName qName;
    private QName name;
    private KeywordVariables variables;
    private LangAttributePointer langAttributePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue() {
        langattributepointer = new LangAttributePointer(parent);
        Mockito.doNothing().when(parent).setValue(Mockito.any());
        langattributepointer.setValue("new value");
        Mockito.verify(parent, Mockito.times(1)).setValue("new value");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_OJlA0() {
        LangAttributePointer langAttributePointer = new LangAttributePointer(new DOMNodePointer(null, null, null));
        Object value = new Object();
        langAttributePointer.setValue(value);
        assertEquals(value, langAttributePointer.getValue());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithDifferentObject_fid2() {
        langattributepointer = new LangAttributePointer(Mockito.mock(DOMNodePointer.class));
        otherLangattributepointer = new LangAttributePointer(Mockito.mock(DOMNodePointer.class));
        assertFalse(langattributepointer.equals(otherLangattributepointer));
    }
}