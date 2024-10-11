/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ContainerPointer_Test_Failing {
    @Mock
    private DOMNodePointer parent;
    @Mock
    private ValueUtils valueUtils;
    @Mock
    private NodeIterator nodeIterator;
    @Mock
    private Locale locale;
    @Mock
    private Object value;
    @Mock
    private DOMNodePointer domNodePointer;
    @Mock
    private NodePointer valuePointer;
    @Mock
    private DOMNodePointer dOMNodePointer;
    @Mock
    private QName qName;
    @Mock
    private NodePointer nodePointer1;
    @Mock
    private NodePointer nodePointer2;
    private ContainerPointer containerpointer;
    @Mock
    private ContainerPointer otherContainerPointer;
    private ContainerPointer containerPointer;
    @Mock
    private VariablePointer variablePointer;
    @Mock
    private NodeTest nodeTest;
    @Mock
    private NodePointer nodePointer;
    @Mock
    private JXPathContext jXPathContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(valueUtils.getValue(value)).thenReturn("Test Value");
        when(containerPointer.getBaseValue()).thenReturn(value);
        assertEquals("Test Value", containerPointer.getImmediateNode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testTestNode_MwyH0_fid3() {
        ContainerPointer containerPointer = new ContainerPointer(new DOMNodePointer(null, null, null), null);
        when(variablePointer.testNode(nodeTest)).thenReturn(true);
        boolean result = containerPointer.testNode(nodeTest);
        assertEquals(true, result);
    }
}