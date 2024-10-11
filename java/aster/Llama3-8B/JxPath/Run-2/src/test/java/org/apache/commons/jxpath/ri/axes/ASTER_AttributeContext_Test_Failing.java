/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AttributeContext_Test_Failing {
@Mock
    private SelfContext selfContext;
@Mock
    private NodeTypeTest nodeTypeTest;
@Mock
    private NamespaceContext namespaceContext;
@Mock
    private NodeIterator iterator;
@Mock
    private Object superObject;
private boolean setStarted = false;
private AttributeContext attributeContext;
@Mock
    private NodePointer nodePointer;
private NodePointer currentNodePointer;
private static QName WILDCARD = new QName(null, "*");
private NodeTest nodeTest;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_NodeTypeTestInstance_FuLo0() {
    SelfContext selfContext = new SelfContext(new NamespaceContext(new SelfContext(null, null), new NodeTypeTest(1)), new NodeTypeTest(1));
    AttributeContext attributeContext = new AttributeContext(new NamespaceContext(selfContext, new NodeTypeTest(1)), new NodeTypeTest(1));
    boolean result = attributeContext.nextNode();
    Assertions.assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testsetPosition_Zvqj0() throws Exception{
    MockitoAnnotations.initMocks(this);
    AttributeContext attributeContext = new AttributeContext(namespaceContext, nodeTypeTest);
    int position = 5;
    int currentPosition = 3;
    when(selfContext.getCurrentPosition()).thenReturn(currentPosition);
    boolean result = attributeContext.setPosition(position);
    verify(selfContext, times(1)).reset();
    verify(selfContext, times(position - currentPosition)).nextNode();
    assertEquals(true, result);
}
}