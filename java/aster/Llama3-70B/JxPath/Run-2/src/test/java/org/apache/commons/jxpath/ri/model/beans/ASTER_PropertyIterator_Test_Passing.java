/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PropertyIterator_Test_Passing {
    private int position = 0;
    PropertyIterator propertyiterator;
    private String name;
    @Mock
    private BeanPointer pointer;
    @Mock
    private DOMNodePointer startWith;
    @Mock
    private PropertyPointer propertyNodePointer;
    @Mock
    private BeanPointer beanPointer;
    private PropertyIterator propertyIterator;
    private boolean empty = false;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private PropertyPointer mockPropertyNodePointer;
    private int startPropertyIndex;
    private int startIndex = 0;
    private boolean includeStart = false;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNodePointer_positionNot0_abyq3_IWtL0() {
        QName name = new QName("qualifiedName");
        BeanPointer pointer = new BeanPointer(name, new Object(), new JXPathBasicBeanInfo(Object.class), Locale.US);
        PropertyIterator propertyIterator = new PropertyIterator(pointer, "name", false, null);
        NodePointer nodePointer = propertyIterator.getNodePointer();
        assertNull(nodePointer);
    }
}