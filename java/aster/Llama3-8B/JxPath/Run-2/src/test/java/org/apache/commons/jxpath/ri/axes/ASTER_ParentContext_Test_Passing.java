/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ParentContext_Test_Passing {
@Mock
    private Object superObject;
ParentContext parentcontext;
@Mock
    private NodeTypeTest nodeTypeTest;
@Mock
    private NamespaceContext namespaceContext;
@Mock
    private SelfContext selfContext;
@Mock
    private ParentContext parentContext;
@Mock
    private NodePointer nodePointer;
@Mock
    private NodeTest nodeTest;
@Mock
    private NodePointer currentNodePointer;
    private boolean setStarted = false;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetDocumentOrder() {
        MockitoAnnotations.initMocks(this);
        parentContext = Mockito.mock(ParentContext.class);
        Mockito.when(parentContext.getDocumentOrder()).thenReturn(1);
        assertEquals(1, parentContext.getDocumentOrder());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentPosition() {
        MockitoAnnotations.initMocks(this);
        parentContext = Mockito.mock(ParentContext.class);
        Mockito.when(parentContext.getCurrentPosition()).thenReturn(1);
        int currentPosition = parentContext.getCurrentPosition();
        assertEquals(1, currentPosition);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testReset_dakq0() throws Exception{
    MockitoAnnotations.initMocks(this);
    ParentContext parentcontext = Mockito.mock(ParentContext.class);
    NamespaceContext namespaceContext = Mockito.mock(NamespaceContext.class);
    SelfContext selfContext = Mockito.mock(SelfContext.class);
    NodeTypeTest nodeTypeTest = Mockito.mock(NodeTypeTest.class);
    parentcontext.reset();
    Mockito.verify(parentcontext).reset();
    Mockito.verify(parentcontext, Mockito.times(0)).getCurrentPosition();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCurrentNodePointer_RWGX0() {
    ParentContext parentContext = new ParentContext(new NamespaceContext(null, new NodeTypeTest(0)), new NodeTypeTest(0));
    int actual = parentContext.getCurrentPosition();
    Assertions.assertEquals(1, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDocumentOrder_fyeM0_BOws0() {
    NodeTypeTest nodeTypeTest = new NodeTypeTest(0);
    ParentContext parentContext = new ParentContext(null, nodeTypeTest);
    SelfContext selfContext = new SelfContext(null, nodeTypeTest);
    NamespaceContext namespaceContext = new NamespaceContext(selfContext, nodeTypeTest);
    int result = parentContext.getCurrentPosition();
    assert result == 1;
}
}