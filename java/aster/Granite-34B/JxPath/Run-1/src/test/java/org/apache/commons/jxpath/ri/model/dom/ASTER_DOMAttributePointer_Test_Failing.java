/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.w3c.dom.Attr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DOMAttributePointer_Test_Failing {
    DOMAttributePointer domattributepointer;
    NodePointer nodepointer;
    NodePointer nodepointer2;
    private KeywordVariables variables;
    @Mock
    private Locale locale;
    @Mock
    private Object object;
    VariablePointer variablepointer;
    QName qname;
    KeywordVariables keywordVariables;
    @Mock
    VariablePointer variablePointer;
    @Mock
    QName name;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithoutParent_nIxW1_vTPB0() {
        Attr attr = mock(Attr.class);
        when(attr.getName()).thenReturn("attr");
        DOMAttributePointer pointer = new DOMAttributePointer(null, attr);
        assertEquals("@attr", pointer.asPath());
    }
}