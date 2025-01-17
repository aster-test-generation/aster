/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RootContext_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableContextWithValidVariableName_QjNp0() {
        JXPathContextReferenceImpl mockJXPathContext = mock(JXPathContextReferenceImpl.class);
        QName variableName = new QName("testVariable");
        VariablePointer mockVariablePointer = mock(VariablePointer.class);
        when(mockJXPathContext.getVariablePointer(variableName)).thenReturn(mockVariablePointer);
        RootContext rootContext = new RootContext(mockJXPathContext, null);
        EvalContext result = rootContext.getVariableContext(variableName);
        assertNotNull(result);
        verify(mockJXPathContext).getVariablePointer(variableName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableContextWithNullVariableName_kXQr1() {
        JXPathContextReferenceImpl mockJXPathContext = mock(JXPathContextReferenceImpl.class);
        QName variableName = null;
        when(mockJXPathContext.getVariablePointer(variableName)).thenReturn(null);
        RootContext rootContext = new RootContext(mockJXPathContext, null);
        EvalContext result = rootContext.getVariableContext(variableName);
        assertNotNull(result);
        verify(mockJXPathContext).getVariablePointer(variableName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetConstantContextWithNonNodePointer_iEoB1_vgkG0_1() {
    JXPathContext parentContext = null; // Assuming null as a valid parent context for simplicity
    Object contextBean = null; // Assuming null context bean
    NodePointer contextPointer = null; // Assuming null context pointer for simplicity
    JXPathContextReferenceImpl jxpathContext = new JXPathContextReferenceImpl(parentContext, contextBean, contextPointer);
    RootContext rootContext = new RootContext(jxpathContext, null);
    String constant = "Test String";
    EvalContext result = rootContext.getConstantContext(constant);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetConstantContextWithNonNodePointer_iEoB1_vgkG0_2() {
    JXPathContext parentContext = null; // Assuming null as a valid parent context for simplicity
    Object contextBean = null; // Assuming null context bean
    NodePointer contextPointer = null; // Assuming null context pointer for simplicity
    JXPathContextReferenceImpl jxpathContext = new JXPathContextReferenceImpl(parentContext, contextBean, contextPointer);
    RootContext rootContext = new RootContext(jxpathContext, null);
    String constant = "Test String";
    EvalContext result = rootContext.getConstantContext(constant);
    assertTrue(result instanceof InitialContext);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetConstantContextWithNonNodePointer_iEoB1_vgkG0_3() {
    JXPathContext parentContext = null; // Assuming null as a valid parent context for simplicity
    Object contextBean = null; // Assuming null context bean
    NodePointer contextPointer = null; // Assuming null context pointer for simplicity
    JXPathContextReferenceImpl jxpathContext = new JXPathContextReferenceImpl(parentContext, contextBean, contextPointer);
    RootContext rootContext = new RootContext(jxpathContext, null);
    String constant = "Test String";
    EvalContext result = rootContext.getConstantContext(constant);
    assertNotNull(((InitialContext) result).getCurrentNodePointer());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetConstantContextWithNonNodePointer_iEoB1_vgkG0_4() {
    JXPathContext parentContext = null; // Assuming null as a valid parent context for simplicity
    Object contextBean = null; // Assuming null context bean
    NodePointer contextPointer = null; // Assuming null context pointer for simplicity
    JXPathContextReferenceImpl jxpathContext = new JXPathContextReferenceImpl(parentContext, contextBean, contextPointer);
    RootContext rootContext = new RootContext(jxpathContext, null);
    String constant = "Test String";
    EvalContext result = rootContext.getConstantContext(constant);
    assertEquals(constant, ((InitialContext) result).getCurrentNodePointer().getValue());}
}