/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.jdom.Attribute;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMAttributeIterator_Test_Passing {
    private int position = 0;
    private JDOMAttributeIterator jdomattributeiterator;
    @Mock
    private DOMNodePointer parent;
    @Mock
    private QName name;
    private List attributes;
    @Mock
    private KeywordVariables variables;
    @Mock
    private NodePointer parentMock;
    @Mock
    private Attribute attributeMock;
    @Mock
    private List attributesMock;
    @Mock
    private JDOMAttributeIterator jdomattributeiteratorMock;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition1_oBel0() {
        JDOMAttributeIterator jDOMAttributeIterator = new JDOMAttributeIterator(null, null);
        boolean result = jDOMAttributeIterator.setPosition(0);
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition2_WJQv1() {
        JDOMAttributeIterator jDOMAttributeIterator = new JDOMAttributeIterator(null, null);
        boolean result = jDOMAttributeIterator.setPosition(1);
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition3_mJly2() {
        JDOMAttributeIterator jDOMAttributeIterator = new JDOMAttributeIterator(null, null);
        boolean result = jDOMAttributeIterator.setPosition(-1);
        Assertions.assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPosition4_YJaH3() {
        JDOMAttributeIterator jDOMAttributeIterator = new JDOMAttributeIterator(null, null);
        boolean result = jDOMAttributeIterator.setPosition(100);
        Assertions.assertFalse(result);
    }
}