/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_LangAttributePointer_Test_Failing {
    LangAttributePointer langattributepointer;
    LangAttributePointer langAttributePointer;
    LangAttributePointer anotherLangAttributePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals() {
        langAttributePointer = Mockito.mock(LangAttributePointer.class);
        anotherLangAttributePointer = Mockito.mock(LangAttributePointer.class);
        // Act
        boolean result = langAttributePointer.equals(anotherLangAttributePointer);
        // Assert
        Mockito.verify(langAttributePointer).equals(anotherLangAttributePointer);
        Mockito.verify(anotherLangAttributePointer).equals(langAttributePointer);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode_gBqH0() {
        LangAttributePointer langattributepointer = new LangAttributePointer(new DOMNodePointer(null, null, null));
        when(langattributepointer.isLeaf()).thenReturn(true);
        boolean result = langattributepointer.isLeaf();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetValue_OvJQ0() throws Exception {
        LangAttributePointer langAttributePointer = new LangAttributePointer(null);
        Object value = "testValue";
        langAttributePointer.setValue(value);
        verifyNoMoreInteractions();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue_SPDE0() throws Exception {
        Locale parentLocale = Locale.US;
        DOMNodePointer parent = new DOMNodePointer(null, parentLocale, null);
        LangAttributePointer langAttributePointer = new LangAttributePointer(parent);
        when(parent.getLocale()).thenReturn(parentLocale);
        String expected = "en-US";
        String actual = (String) langAttributePointer.getBaseValue();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_VariableParent_VzEu3_fid2() {
        VariablePointer parent = new VariablePointer(new QName("prefix", "localName"));
        LangAttributePointer langAttributePointer = new LangAttributePointer(parent);
        assertEquals("@xml:lang", langAttributePointer.asPath());
    }
}