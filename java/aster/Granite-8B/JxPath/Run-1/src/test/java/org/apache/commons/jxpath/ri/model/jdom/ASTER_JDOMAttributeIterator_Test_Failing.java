/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMAttributeIterator_Test_Failing {
    @Mock
    private DOMNodePointer domNodePointer;
    @Mock
    private QName qName;
    private List<String> attributes;
    private JDOMAttributeIterator jdomattributeiterator;
    @Mock
    private NodePointer parent;
    private int position = 0;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPosition() throws Exception {
        jdomattributeiterator = new JDOMAttributeIterator(domNodePointer, qName);
        // Set the position to 5
        jdomattributeiterator.setPosition(5);
        // Assert that the position is 5
        assertEquals(5, jdomattributeiterator.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPosition_fid1() throws Exception {
        jdomattributeiterator = new JDOMAttributeIterator(domNodePointer, qName);
        // Set the position to0
        jdomattributeiterator.setPosition(5);
        // Assert that the position is0
        assertEquals(5, jdomattributeiterator.getPosition());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_xcDT0_1() {
        attributes = new ArrayList<>();
        attributes.add("attr1");
        attributes.add("attr2");
        jdomattributeiterator = Mockito.mock(JDOMAttributeIterator.class);
        Mockito.when(attributes).thenReturn(attributes);
        boolean result = jdomattributeiterator.setPosition(2);
        Mockito.verify(jdomattributeiterator).setPosition(2);
        result = jdomattributeiterator.setPosition(3);
        Mockito.verify(jdomattributeiterator).setPosition(3);
        Mockito.when(attributes).thenReturn(null);
        result = jdomattributeiterator.setPosition(2);
        Mockito.verify(jdomattributeiterator).setPosition(2);
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition_xcDT0_2() {
        attributes = new ArrayList<>();
        attributes.add("attr1");
        attributes.add("attr2");
        jdomattributeiterator = Mockito.mock(JDOMAttributeIterator.class);
        Mockito.when(attributes).thenReturn(attributes);
        boolean result = jdomattributeiterator.setPosition(2);
        Mockito.verify(jdomattributeiterator).setPosition(2);
        result = jdomattributeiterator.setPosition(3);
        Mockito.verify(jdomattributeiterator).setPosition(3);
        Mockito.when(attributes).thenReturn(null);
        result = jdomattributeiterator.setPosition(2);
        Mockito.verify(jdomattributeiterator).setPosition(2);
        Assertions.assertFalse(result);
    }
}