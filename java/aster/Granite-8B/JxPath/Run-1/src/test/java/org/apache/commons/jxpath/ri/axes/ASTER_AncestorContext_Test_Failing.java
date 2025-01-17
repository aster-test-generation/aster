/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AncestorContext_Test_Failing {
    @Mock
    private NodeTypeTest nodeTest;
    @Mock
    private NamespaceContext namespaceContext;
    @Mock
    private SelfContext selfContext;
    @Mock
    private NodeTypeTest nodeTypeTest;
    @Mock
    private Object superObject;
    private AncestorContext ancestorcontext;
    @Mock
    private NodePointer nodePointer;
    private AncestorContext ancestorContext;
    private boolean setStarted = false;
    private NodePointer currentNodePointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        MockitoAnnotations.initMocks(this);
        AncestorContext ancestorContext = new AncestorContext(namespaceContext, true, nodeTest);
        this.ancestorcontext = ancestorContext;
        // Given
        int currentPosition = 5;
        int newPosition = 8;
        Mockito.when(ancestorcontext.getCurrentPosition()).thenReturn(currentPosition);
        // When
        boolean result = ancestorcontext.setPosition(newPosition);
        // Then
        Mockito.verify(ancestorcontext, Mockito.times(1)).reset();
        Mockito.verify(ancestorcontext, Mockito.times(newPosition - currentPosition)).nextNode();
        Assertions.assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionGreaterThanCurrentPosition_OEvu2() {
        AncestorContext context = new AncestorContext(new SelfContext(null, null), false, new NodeTypeTest(0));
        context.setPosition(1);
        assertTrue(context.getPosition() == 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPositionFailed_XWtc3() {
        AncestorContext context = new AncestorContext(new SelfContext(null, null), false, new NodeTypeTest(0));
        context.setPosition(2);
        assertFalse(context.getPosition() == 2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_IncludeSelf_ReturnsTrue_ZhIX0() {
        AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(null, null), null), true, new NodeTypeTest(1));
        boolean result = ancestorContext.nextNode();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_IncludeSelf_ReturnsFalse_ApBT1() {
        AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(null, null), null), true, new NodeTypeTest(1));
        boolean result = ancestorContext.nextNode();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_DoNotIncludeSelf_ReturnsTrue_pcWJ2() {
        AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(null, null), null), false, new NodeTypeTest(1));
        boolean result = ancestorContext.nextNode();
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_DoNotIncludeSelf_ReturnsFalse_nyEx3() {
        AncestorContext ancestorContext = new AncestorContext(new NamespaceContext(new SelfContext(null, null), null), false, new NodeTypeTest(1));
        boolean result = ancestorContext.nextNode();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_wRdG0() {
        ancestorcontext = new AncestorContext(null, false, null);
        boolean setStarted = true; // initialize setStarted before reset
        ancestorcontext.reset();
        Mockito.verify(ancestorcontext, Mockito.times(1)).reset();
        assertEquals(false, setStarted); // fixed assertEquals statement
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReset_wRdG0_fid2() {
        ancestorcontext = new AncestorContext(null, false, null);
        boolean setStarted = true; // initialize setStarted before reset
        ancestorcontext.reset();
        Mockito.verify(ancestorcontext, Mockito.times(1)).reset();
        assertEquals(true, setStarted); // fixed assertEquals statement
    }
}