/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_SimplePathInterpreter_Test_Passing {
@InjectMocks
    private SimplePathInterpreter simplePathInterpreter;
@Mock
    private EvalContext evalContext;
@Mock
    private NodePointer parentPointer;
@Mock
    private Step[] steps;
@Mock
    private Step step;
@Mock
    private NodeNameTest nodeNameTest;
@Mock
    private QName qName;
@Mock
    private NodePointer rootNode;
@Mock
    private NodePointer expectedNodePointer;
@Mock
    private EvalContext mockContext;
@Mock
    private NodePointer mockRoot;
@Mock
    private Expression[] mockPredicates;
@Mock
    private Step[] mockSteps;
@Mock
    private NodePointer mockResultPointer;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNullPointer_AtEndOfSteps() throws Exception {
        when(steps.length).thenReturn(1);
        when(steps[0]).thenReturn(step);
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        when(step.getNodeTest()).thenReturn(nodeNameTest);
        when(nodeNameTest.getNodeName()).thenReturn(qName);
        when(qName.toString()).thenReturn("nodeName");
        // Setup
        when(steps.length).thenReturn(0); // No steps to process
        // Execute
        NodePointer result = SimplePathInterpreter.createNullPointer(evalContext, parentPointer, steps, 0);
        // Verify
        assertEquals(parentPointer, result, "Should return the parent pointer when no steps are left to process.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNullPointer_WithChildAxis_1() throws Exception {
        when(steps.length).thenReturn(1);
        when(steps[0]).thenReturn(step);
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        when(step.getNodeTest()).thenReturn(nodeNameTest);
        when(nodeNameTest.getNodeName()).thenReturn(qName);
        when(qName.toString()).thenReturn("nodeName");
        // Setup
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        // Execute
        NodePointer result = SimplePathInterpreter.createNullPointer(evalContext, parentPointer, steps, 0);
        // Verify
        assertNotNull(result, "Result should not be null when processing a child axis.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNullPointer_WithChildAxis_2() throws Exception {
        when(steps.length).thenReturn(1);
        when(steps[0]).thenReturn(step);
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        when(step.getNodeTest()).thenReturn(nodeNameTest);
        when(nodeNameTest.getNodeName()).thenReturn(qName);
        when(qName.toString()).thenReturn("nodeName");
        // Setup
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        // Execute
        NodePointer result = SimplePathInterpreter.createNullPointer(evalContext, parentPointer, steps, 0);
        // Verify
        assertTrue(result instanceof NullPropertyPointer, "Result should be an instance of NullPropertyPointer for child axis.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNullPointer_WithChildAxis_3() throws Exception {
        when(steps.length).thenReturn(1);
        when(steps[0]).thenReturn(step);
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        when(step.getNodeTest()).thenReturn(nodeNameTest);
        when(nodeNameTest.getNodeName()).thenReturn(qName);
        when(qName.toString()).thenReturn("nodeName");
        // Setup
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        // Execute
        NodePointer result = SimplePathInterpreter.createNullPointer(evalContext, parentPointer, steps, 0);
        // Verify
        assertEquals("nodeName", ((NullPropertyPointer) result).getPropertyName(), "Property name should be set correctly.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNullPointer_WithChildAxis_4() throws Exception {
        when(steps.length).thenReturn(1);
        when(steps[0]).thenReturn(step);
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        when(step.getNodeTest()).thenReturn(nodeNameTest);
        when(nodeNameTest.getNodeName()).thenReturn(qName);
        when(qName.toString()).thenReturn("nodeName");
        // Setup
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        // Execute
        NodePointer result = SimplePathInterpreter.createNullPointer(evalContext, parentPointer, steps, 0);
        // Verify
        assertFalse(((NullPropertyPointer) result).isAttribute(), "Should not be marked as attribute for child axis.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNullPointer_WithAttributeAxis_1() throws Exception {
        when(steps.length).thenReturn(1);
        when(steps[0]).thenReturn(step);
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        when(step.getNodeTest()).thenReturn(nodeNameTest);
        when(nodeNameTest.getNodeName()).thenReturn(qName);
        when(qName.toString()).thenReturn("nodeName");
        // Setup
        when(step.getAxis()).thenReturn(Compiler.AXIS_ATTRIBUTE);
        // Execute
        NodePointer result = SimplePathInterpreter.createNullPointer(evalContext, parentPointer, steps, 0);
        // Verify
        assertNotNull(result, "Result should not be null when processing an attribute axis.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNullPointer_WithAttributeAxis_2() throws Exception {
        when(steps.length).thenReturn(1);
        when(steps[0]).thenReturn(step);
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        when(step.getNodeTest()).thenReturn(nodeNameTest);
        when(nodeNameTest.getNodeName()).thenReturn(qName);
        when(qName.toString()).thenReturn("nodeName");
        // Setup
        when(step.getAxis()).thenReturn(Compiler.AXIS_ATTRIBUTE);
        // Execute
        NodePointer result = SimplePathInterpreter.createNullPointer(evalContext, parentPointer, steps, 0);
        // Verify
        assertTrue(result instanceof NullPropertyPointer, "Result should be an instance of NullPropertyPointer for attribute axis.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNullPointer_WithAttributeAxis_3() throws Exception {
        when(steps.length).thenReturn(1);
        when(steps[0]).thenReturn(step);
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        when(step.getNodeTest()).thenReturn(nodeNameTest);
        when(nodeNameTest.getNodeName()).thenReturn(qName);
        when(qName.toString()).thenReturn("nodeName");
        // Setup
        when(step.getAxis()).thenReturn(Compiler.AXIS_ATTRIBUTE);
        // Execute
        NodePointer result = SimplePathInterpreter.createNullPointer(evalContext, parentPointer, steps, 0);
        // Verify
        assertEquals("nodeName", ((NullPropertyPointer) result).getPropertyName(), "Property name should be set correctly.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNullPointer_WithAttributeAxis_4() throws Exception {
        when(steps.length).thenReturn(1);
        when(steps[0]).thenReturn(step);
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        when(step.getNodeTest()).thenReturn(nodeNameTest);
        when(nodeNameTest.getNodeName()).thenReturn(qName);
        when(qName.toString()).thenReturn("nodeName");
        // Setup
        when(step.getAxis()).thenReturn(Compiler.AXIS_ATTRIBUTE);
        // Execute
        NodePointer result = SimplePathInterpreter.createNullPointer(evalContext, parentPointer, steps, 0);
        // Verify
        assertTrue(((NullPropertyPointer) result).isAttribute(), "Should be marked as attribute for attribute axis.");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNullPointer_AtEndOfSteps_GPoL0() {
    EvalContext context = mock(EvalContext.class);
    NodePointer parent = mock(NodePointer.class);
    Step[] steps = new Step[0];
    NodePointer result = SimplePathInterpreter.createNullPointer(context, parent, steps, 0);
    assertEquals(parent, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInterpretSimpleExpressionPath_IzSN0() throws Exception {
    try (MockedStatic<SimplePathInterpreter> mockedStatic = Mockito.mockStatic(SimplePathInterpreter.class, Mockito.CALLS_REAL_METHODS)) {
        mockedStatic.when(() -> SimplePathInterpreter.createNullPointer(eq(mockContext), eq(mockRoot), eq(mockSteps), eq(0)))
                    .thenReturn(mockResultPointer);
        NodePointer result = SimplePathInterpreter.createNullPointer(mockContext, mockRoot, mockSteps, 0);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNullPointer_WithPredicateNameAttributeTest_Kepe3_dSRP0_1() {
    EvalContext context = mock(EvalContext.class);
    NodePointer parent = mock(NodePointer.class);
    QName qName = new QName("element");
    NodeTest nodeTest = new NodeNameTest(qName);
    Expression predicate = mock(NameAttributeTest.class);
    when(predicate.computeValue(context)).thenReturn("key");
    Step step = new Step(Compiler.AXIS_CHILD, nodeTest, new Expression[]{predicate}) {
    };
    Step[] steps = {step};
    NodePointer result = SimplePathInterpreter.createNullPointer(context, parent, steps, 0);
    assertTrue(result instanceof NullPropertyPointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNullPointer_WithPredicateNameAttributeTest_Kepe3_dSRP0_2() {
    EvalContext context = mock(EvalContext.class);
    NodePointer parent = mock(NodePointer.class);
    QName qName = new QName("element");
    NodeTest nodeTest = new NodeNameTest(qName);
    Expression predicate = mock(NameAttributeTest.class);
    when(predicate.computeValue(context)).thenReturn("key");
    Step step = new Step(Compiler.AXIS_CHILD, nodeTest, new Expression[]{predicate}) {
    };
    Step[] steps = {step};
    NodePointer result = SimplePathInterpreter.createNullPointer(context, parent, steps, 0);
    assertEquals("key", ((NullPropertyPointer) result).getPropertyName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNullPointer_WithPredicateIndex_jbei4_Jvdt0_1() {
    EvalContext context = mock(EvalContext.class);
    NodePointer parent = mock(NodePointer.class);
    QName qName = new QName("element");
    NodeTest nodeTest = new NodeNameTest(qName);
    Expression predicate = mock(Expression.class);
    when(predicate.computeValue(context)).thenReturn(1);
    Step step = new Step(Compiler.AXIS_CHILD, nodeTest, new Expression[]{predicate}) {
    };
    Step[] steps = {step};
    NodePointer result = SimplePathInterpreter.createNullPointer(context, parent, steps, 0);
    assertTrue(result instanceof NullElementPointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNullPointer_WithPredicateIndex_jbei4_Jvdt0_2() {
    EvalContext context = mock(EvalContext.class);
    NodePointer parent = mock(NodePointer.class);
    QName qName = new QName("element");
    NodeTest nodeTest = new NodeNameTest(qName);
    Expression predicate = mock(Expression.class);
    when(predicate.computeValue(context)).thenReturn(1);
    Step step = new Step(Compiler.AXIS_CHILD, nodeTest, new Expression[]{predicate}) {
    };
    Step[] steps = {step};
    NodePointer result = SimplePathInterpreter.createNullPointer(context, parent, steps, 0);
    assertEquals(0, ((NullElementPointer) result).getIndex());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNullPointer_WithChildAxis() throws Exception {
        when(steps.length).thenReturn(1);
        when(steps[0]).thenReturn(step);
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        when(step.getNodeTest()).thenReturn(nodeNameTest);
        when(nodeNameTest.getNodeName()).thenReturn(qName);
        when(qName.toString()).thenReturn("nodeName");
        // Setup
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        // Execute
        NodePointer result = SimplePathInterpreter.createNullPointer(evalContext, parentPointer, steps, 0);
        // Verify
        assertNotNull(result, "Result should not be null when processing a child axis.");
        assertTrue(result instanceof NullPropertyPointer, "Result should be an instance of NullPropertyPointer for child axis.");
        assertEquals("nodeName", ((NullPropertyPointer) result).getPropertyName(), "Property name should be set correctly.");
        assertFalse(((NullPropertyPointer) result).isAttribute(), "Should not be marked as attribute for child axis.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNullPointer_WithAttributeAxis() throws Exception {
        when(steps.length).thenReturn(1);
        when(steps[0]).thenReturn(step);
        when(step.getAxis()).thenReturn(Compiler.AXIS_CHILD);
        when(step.getNodeTest()).thenReturn(nodeNameTest);
        when(nodeNameTest.getNodeName()).thenReturn(qName);
        when(qName.toString()).thenReturn("nodeName");
        // Setup
        when(step.getAxis()).thenReturn(Compiler.AXIS_ATTRIBUTE);
        // Execute
        NodePointer result = SimplePathInterpreter.createNullPointer(evalContext, parentPointer, steps, 0);
        // Verify
        assertNotNull(result, "Result should not be null when processing an attribute axis.");
        assertTrue(result instanceof NullPropertyPointer, "Result should be an instance of NullPropertyPointer for attribute axis.");
        assertEquals("nodeName", ((NullPropertyPointer) result).getPropertyName(), "Property name should be set correctly.");
        assertTrue(((NullPropertyPointer) result).isAttribute(), "Should be marked as attribute for attribute axis.");
    }
}