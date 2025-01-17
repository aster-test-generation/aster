/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
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
public class Aster_RootContext_Test_Failing {
    @Mock
    private JXPathContextReferenceImpl jxpathContext;
    @Mock
    private DOMNodePointer pointer;
    private RootContext rootcontext;
    private RootContext rootContext;
    @Mock
    private EvalContext evalContext;
    @Mock
    private NodeSet nodeSet;
    @Mock
    private QName qName;
    @Mock
    private Object constant;
    @Mock
    private QName variableName;
    @Mock
    private VariablePointer variablePointer;
    @Mock
    private InitialContext initialContext;
    @Mock
    private Function function;
    private static int MAX_REGISTER = 4;
    private int availableRegister = 0;
    private Object[] registers;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetPosition() throws Exception {
        jxpathContext = mock(JXPathContextReferenceImpl.class);
        pointer = mock(DOMNodePointer.class);
        rootcontext = new RootContext(jxpathContext, pointer);
        boolean result = rootcontext.setPosition(1);
        assertEquals(false, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetConstantContext_NodeSet_1() throws Exception {
        rootContext = new RootContext(jxpathContext, pointer);
        when(constant instanceof NodeSet).thenReturn(true);
        when((NodeSet) constant).thenReturn(nodeSet);
        EvalContext result = rootContext.getConstantContext(constant);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetConstantContext_NodeSet_2() throws Exception {
        rootContext = new RootContext(jxpathContext, pointer);
        when(constant instanceof NodeSet).thenReturn(true);
        when((NodeSet) constant).thenReturn(nodeSet);
        EvalContext result = rootContext.getConstantContext(constant);
        assertTrue(result instanceof NodeSetContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetConstantContext_NodePointer_1() throws Exception {
        rootContext = new RootContext(jxpathContext, pointer);
        when(constant instanceof NodePointer).thenReturn(true);
        when((NodePointer) constant).thenReturn(pointer);
        EvalContext result = rootContext.getConstantContext(constant);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetConstantContext_NodePointer_2() throws Exception {
        rootContext = new RootContext(jxpathContext, pointer);
        when(constant instanceof NodePointer).thenReturn(true);
        when((NodePointer) constant).thenReturn(pointer);
        EvalContext result = rootContext.getConstantContext(constant);
        assertTrue(result instanceof InitialContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetConstantContext_Other_1() throws Exception {
        rootContext = new RootContext(jxpathContext, pointer);
        when(qName.toString()).thenReturn("qName");
        when(NodePointer.newNodePointer(qName, constant, null)).thenReturn(pointer);
        EvalContext result = rootContext.getConstantContext(constant);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetConstantContext_Other_2() throws Exception {
        rootContext = new RootContext(jxpathContext, pointer);
        when(qName.toString()).thenReturn("qName");
        when(NodePointer.newNodePointer(qName, constant, null)).thenReturn(pointer);
        EvalContext result = rootContext.getConstantContext(constant);
        assertTrue(result instanceof InitialContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_Rgir0() throws Exception {
        NodePointer pointer = Mockito.mock(NodePointer.class);
        JXPathContextReferenceImpl jxpathContext = Mockito.mock(JXPathContextReferenceImpl.class);
        DOMNodePointer domNodePointer = Mockito.mock(DOMNodePointer.class);
        RootContext rootcontext = new RootContext(jxpathContext, domNodePointer);
        Mockito.doReturn(pointer).when(rootcontext).getCurrentNodePointer();
        NodePointer result = rootcontext.getCurrentNodePointer();
        assertSame(pointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentPosition_GFGd0() throws Exception {
        NodePointer pointer = mock(NodePointer.class);
        JXPathContextReferenceImpl jxpathContext = mock(JXPathContextReferenceImpl.class);
        DOMNodePointer domNodePointer = mock(DOMNodePointer.class);
        rootContext = new RootContext(jxpathContext, domNodePointer);
        int result = rootContext.getCurrentPosition();
        assertTrue(result >= 0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentNodePointer_Rgir0_fid2() throws Exception {
        NodePointer pointer = Mockito.mock(NodePointer.class);
        JXPathContextReferenceImpl jxpathContext = Mockito.mock(JXPathContextReferenceImpl.class);
        DOMNodePointer domNodePointer = Mockito.mock(DOMNodePointer.class);
        RootContext rootcontext = new RootContext(jxpathContext, domNodePointer);
        Mockito.when(rootcontext.getCurrentNodePointer()).thenReturn(pointer);
        NodePointer result = rootcontext.getCurrentNodePointer();
        assertEquals(pointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetConstantContext_NodeSet() throws Exception {
        rootContext = new RootContext(jxpathContext, pointer);
        when(constant instanceof NodeSet).thenReturn(true);
        when((NodeSet) constant).thenReturn(nodeSet);
        EvalContext result = rootContext.getConstantContext(constant);
        assertNotNull(result);
        assertTrue(result instanceof NodeSetContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetConstantContext_NodePointer() throws Exception {
        rootContext = new RootContext(jxpathContext, pointer);
        when(constant instanceof NodePointer).thenReturn(true);
        when((NodePointer) constant).thenReturn(pointer);
        EvalContext result = rootContext.getConstantContext(constant);
        assertNotNull(result);
        assertTrue(result instanceof InitialContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetConstantContext_Other() throws Exception {
        rootContext = new RootContext(jxpathContext, pointer);
        when(qName.toString()).thenReturn("qName");
        when(NodePointer.newNodePointer(qName, constant, null)).thenReturn(pointer);
        EvalContext result = rootContext.getConstantContext(constant);
        assertNotNull(result);
        assertTrue(result instanceof InitialContext);
    }
}