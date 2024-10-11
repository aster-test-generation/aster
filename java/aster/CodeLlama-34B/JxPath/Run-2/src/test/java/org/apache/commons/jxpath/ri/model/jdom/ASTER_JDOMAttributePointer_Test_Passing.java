/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.jdom.Attribute;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMAttributePointer_Test_Passing {
    private Attribute attr;
    JDOMAttributePointer jdomattributepointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNodeWithNullInput_tert1() {
        DOMNodePointer parent = null;
        Attribute attr = null;
        JDOMAttributePointer pointer = new JDOMAttributePointer(parent, attr);
        Object result = pointer.getImmediateNode();
        assertNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLength() throws Exception {
        jdomattributepointer = new JDOMAttributePointer(Mockito.mock(DOMNodePointer.class), Mockito.mock(Attribute.class));
        Assertions.assertEquals(1, jdomattributepointer.getLength());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithNullParentAndAttribute_UAjk3() {
        JDOMAttributePointer attr = new JDOMAttributePointer(null, null);
        int length = attr.getLength();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActualWithNullParent_stkd3() {
        JDOMAttributePointer attribute = new JDOMAttributePointer(null, new Attribute("attr", "value"));
        assertTrue(attribute.isActual());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActualWithNullParentAndAttribute_YjHb5() {
        JDOMAttributePointer attribute = new JDOMAttributePointer(null, null);
        assertTrue(attribute.isActual());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode_J_S_l_vepH0() throws Exception {
        attr = mock(Attribute.class);
        DOMNodePointer parent = mock(DOMNodePointer.class);
        jdomattributepointer = new JDOMAttributePointer(parent, attr);
        assertEquals(attr, jdomattributepointer.getImmediateNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthWithNullAttribute_UoAZ2_wcGa0() {
        DOMNodePointer parent = new DOMNodePointer(null, new Locale("en"));
        JDOMAttributePointer attr = new JDOMAttributePointer(parent, null);
        int length = attr.getLength();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_PGPU0_itjn0() {
        QName qName = new QName("prefix", "localName");
        VariablePointer variablePointer = new VariablePointer(qName);
        DOMNodePointer domNodePointer = new DOMNodePointer(null, null, null);
        JDOMAttributePointer jdomAttributePointer = new JDOMAttributePointer(domNodePointer, null);
        assertTrue(jdomAttributePointer.isLeaf());
    }
}