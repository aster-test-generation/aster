/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_RootContext_Test_Failing {
@Mock
    private JXPathContextReferenceImpl jxpathContext;
@Mock
    private DOMNodePointer pointer;
@InjectMocks
    private RootContext rootContext;
@Mock
    private EvalContext expectedEvalContext;
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private NodePointer mockPointer;
@Mock
    private NodeSet mockNodeSet;
@Mock
    private VariablePointer variablePointer;
@Mock
    private QName variableName;
@Mock
    private Function expectedFunction;
private static final int MAX_REGISTER = 4;
private static final Object UNKNOWN_VALUE = null;
private Object[] registers;
@Mock
    private JXPathContextReferenceImpl mockJXPathContextRefImpl;
@Mock
    private DOMNodePointer mockDOMNodePointer;
    private int availableRegister = 0;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString() throws Exception {
        when(pointer.asPath()).thenReturn("mockedPath");
        String expected = rootContext.getClass().getName() + "@" + Integer.toHexString(rootContext.hashCode()) + ":mockedPath";
        assertEquals(expected, rootContext.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConstantContextWithNodeSet_1() throws Exception {
        rootContext = new RootContext(jxpathContext, null);
        // Setup
        when(mockNodeSet instanceof NodeSet).thenReturn(true);
        // Execution
        EvalContext result = rootContext.getConstantContext(mockNodeSet);
        // Verification
        NodeSetContext nodeSetContext = (NodeSetContext) result;
        assertTrue(result instanceof NodeSetContext);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConstantContextWithNodeSet_2() throws Exception {
        rootContext = new RootContext(jxpathContext, null);
        // Setup
        when(mockNodeSet instanceof NodeSet).thenReturn(true);
        // Execution
        EvalContext result = rootContext.getConstantContext(mockNodeSet);
        // Verification
        NodeSetContext nodeSetContext = (NodeSetContext) result;
        assertEquals(mockNodeSet, nodeSetContext.getNodeSet());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConstantContextWithNodePointer_1() throws Exception {
        rootContext = new RootContext(jxpathContext, null);
        // Setup
        when(mockPointer instanceof NodePointer).thenReturn(true);
        // Execution
        EvalContext result = rootContext.getConstantContext(mockPointer);
        // Verification
        InitialContext initialContext = (InitialContext) result;
        assertTrue(result instanceof InitialContext);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConstantContextWithNodePointer_2() throws Exception {
        rootContext = new RootContext(jxpathContext, null);
        // Setup
        when(mockPointer instanceof NodePointer).thenReturn(true);
        // Execution
        EvalContext result = rootContext.getConstantContext(mockPointer);
        // Verification
        InitialContext initialContext = (InitialContext) result;
        assertEquals(mockPointer, initialContext.getContextNodePointer());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCurrentPosition() throws Exception {
        rootContext = new RootContext(jxpathContext, domNodePointer);
        // Assuming getCurrentPosition should return a fixed value for the test
        int expectedPosition = 5;
        when(rootContext.getCurrentPosition()).thenReturn(expectedPosition);
        int actualPosition = rootContext.getCurrentPosition();
        assertEquals(expectedPosition, actualPosition, "The current position should match the expected value.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_fid2() throws Exception {
        rootContext = new RootContext(jxpathContext, domNodePointer);
        when(domNodePointer.getValue()).thenReturn(pointer);
        assertEquals(pointer, rootContext.getValue(), "The getValue method should return the correct NodePointer instance.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetRegisteredValue_RegisterValueCheck_rSdl3_LDJd0_fid2() {
    JXPathContextReferenceImpl jxpathContext = new JXPathContextReferenceImpl(null, new Object(), null);
    DOMNodePointer pointer = new DOMNodePointer(null, Locale.getDefault());
    RootContext rootContext = new RootContext(jxpathContext, pointer);
    int registerIndex = rootContext.setRegisteredValue("Test Value");
    assertEquals("Test Test Value", rootContext.getRegisteredValue(registerIndex));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRegisteredValue_ValidIndex_ReturnsCorrectValue_yLfF0_1() {
    Object[] registers = new Object[MAX_REGISTER];
    JXPathContextReferenceImpl jxpathContext = null; // Mock or instantiate as required
    DOMNodePointer pointer = null; // Mock or instantiate as required
    RootContext rootContext = new RootContext(jxpathContext, pointer);
    assertEquals("FirstValue", registers[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRegisteredValue_ValidIndex_ReturnsCorrectValue_yLfF0_2_fid2() {
    Object[] registers = new Object[MAX_REGISTER];
    JXPathContextReferenceImpl jxpathContext = null; // Mock or instantiate as required
    DOMNodePointer pointer = null; // Mock or instantiate as required
    RootContext rootContext = new RootContext(jxpathContext, pointer);
    assertEquals("SecondValue", registers[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRegisteredValue_ValidIndex_ReturnsCorrectValue_yLfF0_3() {
    Object[] registers = new Object[MAX_REGISTER];
    JXPathContextReferenceImpl jxpathContext = null; // Mock or instantiate as required
    DOMNodePointer pointer = null; // Mock or instantiate as required
    RootContext rootContext = new RootContext(jxpathContext, pointer);
    assertEquals("ThirdValue", registers[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRegisteredValue_ValidIndex_ReturnsCorrectValue_yLfF0_4() {
    Object[] registers = new Object[MAX_REGISTER];
    JXPathContextReferenceImpl jxpathContext = null; // Mock or instantiate as required
    DOMNodePointer pointer = null; // Mock or instantiate as required
    RootContext rootContext = new RootContext(jxpathContext, pointer);
    assertEquals("FourthValue", registers[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRegisteredValue_NullRegisters_ReturnsUnknownValue_SwyN0_1() {
    Object[] registers = new Object[MAX_REGISTER];
    JXPathContextReferenceImpl jxpathContext = null; // Mock or instantiate as required
    DOMNodePointer pointer = null; // Mock or instantiate as required
    RootContext rootContext = new RootContext(jxpathContext, pointer);
    assertNull(rootContext.getRegisteredValue(0));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRegisteredValue_NullRegisters_ReturnsUnknownValue_SwyN0_2() {
    Object[] registers = new Object[MAX_REGISTER];
    JXPathContextReferenceImpl jxpathContext = null; // Mock or instantiate as required
    DOMNodePointer pointer = null; // Mock or instantiate as required
    RootContext rootContext = new RootContext(jxpathContext, pointer);
    assertNull(rootContext.getRegisteredValue(1));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRegisteredValue_NullRegisters_ReturnsUnknownValue_SwyN0_3() {
    Object[] registers = new Object[MAX_REGISTER];
    JXPathContextReferenceImpl jxpathContext = null; // Mock or instantiate as required
    DOMNodePointer pointer = null; // Mock or instantiate as required
    RootContext rootContext = new RootContext(jxpathContext, pointer);
    assertNull(rootContext.getRegisteredValue(2));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetRegisteredValue_NullRegisters_ReturnsUnknownValue_SwyN0_4() {
    Object[] registers = new Object[MAX_REGISTER];
    JXPathContextReferenceImpl jxpathContext = null; // Mock or instantiate as required
    DOMNodePointer pointer = null; // Mock or instantiate as required
    RootContext rootContext = new RootContext(jxpathContext, pointer);
    assertNull(rootContext.getRegisteredValue(3));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConstantContextWithNodeSet() throws Exception {
        rootContext = new RootContext(jxpathContext, null);
        // Setup
        when(mockNodeSet instanceof NodeSet).thenReturn(true);
        // Execution
        EvalContext result = rootContext.getConstantContext(mockNodeSet);
        // Verification
        assertTrue(result instanceof NodeSetContext);
        NodeSetContext nodeSetContext = (NodeSetContext) result;
        assertEquals(mockNodeSet, nodeSetContext.getNodeSet());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetConstantContextWithNodePointer() throws Exception {
        rootContext = new RootContext(jxpathContext, null);
        // Setup
        when(mockPointer instanceof NodePointer).thenReturn(true);
        // Execution
        EvalContext result = rootContext.getConstantContext(mockPointer);
        // Verification
        assertTrue(result instanceof InitialContext);
        InitialContext initialContext = (InitialContext) result;
        assertEquals(mockPointer, initialContext.getContextNodePointer());
    }
}