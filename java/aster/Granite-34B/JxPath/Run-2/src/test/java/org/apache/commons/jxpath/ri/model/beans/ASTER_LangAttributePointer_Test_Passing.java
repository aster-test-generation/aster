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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_LangAttributePointer_Test_Passing {
    LangAttributePointer langattributepointer;
    @Mock
    DOMNodePointer parent;
    Locale locale;
    VariablePointer variablePointer;
    QName name;
    String qualifiedName;
    String prefix;
    String localName;
    String root;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetValue() throws Exception {
        langattributepointer = new LangAttributePointer(parent);
        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            langattributepointer.setValue("test");
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() throws Exception {
        parent = mock(DOMNodePointer.class);
        langattributepointer = new LangAttributePointer(parent);
        final StringBuilder buffer = new StringBuilder();
        when(parent.asPath()).thenReturn("test");
        buffer.append("test");
        if (buffer.length() == 0 || buffer.charAt(buffer.length() - 1) != '/') {
            buffer.append('/');
        }
        buffer.append("@xml:lang");
        assertEquals(buffer.toString(), langattributepointer.asPath());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithoutParent_dBAw1() {
        LangAttributePointer pointer = new LangAttributePointer(null);
        assertEquals(pointer.asPath(), "@xml:lang");
    }
}