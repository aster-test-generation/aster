/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_LangAttributePointer_Test_Passing {
    LangAttributePointer langattributepointer;
    DOMNodePointer parent;
    NodePointer pointer1;
    NodePointer pointer2;
    LangAttributePointer langAttributePointer;
    DOMNodePointer domNodePointer;
    VariablePointer variablePointer;
    @Mock
    NodeTest nodeTest;
    @Mock
    Locale locale;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcompareChildNodePointers() throws Exception {
        parent = mock(DOMNodePointer.class);
        langattributepointer = new LangAttributePointer(parent);
        pointer1 = mock(NodePointer.class);
        pointer2 = mock(NodePointer.class);
        int result = langattributepointer.compareChildNodePointers(pointer1, pointer2);
        assertEquals(0, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() throws Exception {
        parent = mock(DOMNodePointer.class);
        langattributepointer = new LangAttributePointer(parent);
        parent = mock(DOMNodePointer.class);
        langattributepointer = new LangAttributePointer(parent);
        when(parent.asPath()).thenReturn("/parent/path");
        String result = langattributepointer.asPath();
        assertEquals("/parent/path/@xml:lang", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_withNoParent() throws Exception {
        parent = mock(DOMNodePointer.class);
        langattributepointer = new LangAttributePointer(parent);
        langattributepointer = new LangAttributePointer(null);
        String result = langattributepointer.asPath();
        assertEquals("@xml:lang", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath_withParentEndingWithSlash() throws Exception {
        parent = mock(DOMNodePointer.class);
        langattributepointer = new LangAttributePointer(parent);
        when(parent.asPath()).thenReturn("/parent/path/");
        String result = langattributepointer.asPath();
        assertEquals("/parent/path/@xml:lang", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() throws Exception {
        domNodePointer = mock(DOMNodePointer.class);
        langattributepointer = new LangAttributePointer(domNodePointer);
        int length = langattributepointer.getLength();
        assertEquals(1, length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBaseValue() throws Exception {
        locale = Locale.US;
        parent = mock(DOMNodePointer.class);
        when(parent.getLocale()).thenReturn(locale);
        langattributepointer = new LangAttributePointer(parent);
        Object result = langattributepointer.getBaseValue();
        assertEquals("en-US", result);
    }
}