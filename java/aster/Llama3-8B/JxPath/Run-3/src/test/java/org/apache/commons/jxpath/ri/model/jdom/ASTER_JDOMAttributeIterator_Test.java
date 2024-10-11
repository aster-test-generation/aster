/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.jdom;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JDOMAttributeIterator_Test {
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private QName qName;
@Mock
    private VariablePointer variablePointer;
@Mock
    private KeywordVariables keywordVariables;
private JDOMAttributeIterator jdomattributeiterator;
@Mock
    private List attributes;
private NodePointer parent;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPosition() throws Exception {
        jdomattributeiterator = new JDOMAttributeIterator(domNodePointer, qName);
    

        // Arrange
        jdomattributeiterator.setPosition(5);

        // Act
        int actualPosition = jdomattributeiterator.getPosition();

        // Assert
        assertEquals(5, actualPosition);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNodePointer_1() throws Exception{
        attributes = new ArrayList<>();
        Attribute attribute1 = mock(Attribute.class);
        Attribute attribute2 = mock(Attribute.class);
        attributes.add(attribute1);
        attributes.add(attribute2);
        parent = mock(NodePointer.class);
        jdomattributeiterator = new JDOMAttributeIterator(parent, mock(QName.class));
    

        // Test when position is 0
        NodePointer nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is 1
        jdomattributeiterator.setPosition(2);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is greater than length
        jdomattributeiterator.setPosition(3);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is less than 1
        jdomattributeiterator.setPosition(0);
        nodePointer = jdomattributeiterator.getNodePointer();
        assertEquals(parent, nodePointer.getParent());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNodePointer_2() throws Exception{
        attributes = new ArrayList<>();
        Attribute attribute1 = mock(Attribute.class);
        Attribute attribute2 = mock(Attribute.class);
        attributes.add(attribute1);
        attributes.add(attribute2);
        parent = mock(NodePointer.class);
        jdomattributeiterator = new JDOMAttributeIterator(parent, mock(QName.class));
    

        // Test when position is 0
        NodePointer nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is 1
        jdomattributeiterator.setPosition(2);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is greater than length
        jdomattributeiterator.setPosition(3);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is less than 1
        jdomattributeiterator.setPosition(0);
        nodePointer = jdomattributeiterator.getNodePointer();
        assertEquals(attributes.get(0), nodePointer.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNodePointer_3() throws Exception{
        attributes = new ArrayList<>();
        Attribute attribute1 = mock(Attribute.class);
        Attribute attribute2 = mock(Attribute.class);
        attributes.add(attribute1);
        attributes.add(attribute2);
        parent = mock(NodePointer.class);
        jdomattributeiterator = new JDOMAttributeIterator(parent, mock(QName.class));
    

        // Test when position is 0
        NodePointer nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is 1
        jdomattributeiterator.setPosition(2);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is greater than length
        jdomattributeiterator.setPosition(3);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is less than 1
        jdomattributeiterator.setPosition(0);
        nodePointer = jdomattributeiterator.getNodePointer();
        assertEquals(parent, nodePointer.getParent());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNodePointer_4() throws Exception{
        attributes = new ArrayList<>();
        Attribute attribute1 = mock(Attribute.class);
        Attribute attribute2 = mock(Attribute.class);
        attributes.add(attribute1);
        attributes.add(attribute2);
        parent = mock(NodePointer.class);
        jdomattributeiterator = new JDOMAttributeIterator(parent, mock(QName.class));
    

        // Test when position is 0
        NodePointer nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is 1
        jdomattributeiterator.setPosition(2);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is greater than length
        jdomattributeiterator.setPosition(3);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is less than 1
        jdomattributeiterator.setPosition(0);
        nodePointer = jdomattributeiterator.getNodePointer();
        assertEquals(attributes.get(1), nodePointer.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNodePointer_5() throws Exception{
        attributes = new ArrayList<>();
        Attribute attribute1 = mock(Attribute.class);
        Attribute attribute2 = mock(Attribute.class);
        attributes.add(attribute1);
        attributes.add(attribute2);
        parent = mock(NodePointer.class);
        jdomattributeiterator = new JDOMAttributeIterator(parent, mock(QName.class));
    

        // Test when position is 0
        NodePointer nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is 1
        jdomattributeiterator.setPosition(2);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is greater than length
        jdomattributeiterator.setPosition(3);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is less than 1
        jdomattributeiterator.setPosition(0);
        nodePointer = jdomattributeiterator.getNodePointer();
        assertNull(nodePointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNodePointer_6() throws Exception{
        attributes = new ArrayList<>();
        Attribute attribute1 = mock(Attribute.class);
        Attribute attribute2 = mock(Attribute.class);
        attributes.add(attribute1);
        attributes.add(attribute2);
        parent = mock(NodePointer.class);
        jdomattributeiterator = new JDOMAttributeIterator(parent, mock(QName.class));
    

        // Test when position is 0
        NodePointer nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is 1
        jdomattributeiterator.setPosition(2);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is greater than length
        jdomattributeiterator.setPosition(3);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is less than 1
        jdomattributeiterator.setPosition(0);
        nodePointer = jdomattributeiterator.getNodePointer();
        assertEquals(parent, nodePointer.getParent());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNodePointer_7() throws Exception{
        attributes = new ArrayList<>();
        Attribute attribute1 = mock(Attribute.class);
        Attribute attribute2 = mock(Attribute.class);
        attributes.add(attribute1);
        attributes.add(attribute2);
        parent = mock(NodePointer.class);
        jdomattributeiterator = new JDOMAttributeIterator(parent, mock(QName.class));
    

        // Test when position is 0
        NodePointer nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is 1
        jdomattributeiterator.setPosition(2);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is greater than length
        jdomattributeiterator.setPosition(3);
        nodePointer = jdomattributeiterator.getNodePointer();

        // Test when position is less than 1
        jdomattributeiterator.setPosition(0);
        nodePointer = jdomattributeiterator.getNodePointer();
        assertEquals(attributes.get(0), nodePointer.getValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPositionNullAttributes_PLDd2() throws Exception {
    JDOMAttributeIterator iterator = new JDOMAttributeIterator(null, new QName("prefix", "localName"));
    assertEquals(false, iterator.setPosition(1));

}
}