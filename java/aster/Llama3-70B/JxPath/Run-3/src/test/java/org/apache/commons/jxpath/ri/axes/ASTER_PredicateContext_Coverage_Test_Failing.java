/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Constant;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PredicateContext_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_doneFalse_DgaG3() {
        PredicateContext predicateContext = new PredicateContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new Constant("string"));
        assertTrue(predicateContext.nextNode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNextNode_computeValueNumber_uYgZ8() {
        PredicateContext predicateContext = new PredicateContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new Constant(1));
        assertTrue(predicateContext.nextNode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_InfoSetUtilBooleanValue_RHAw2_xmlh0() {
    PredicateContext predicateContext = new PredicateContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new Constant(Boolean.TRUE.toString()));
    assertTrue(predicateContext.nextSet());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testsetPosition_NameTestExpressionNull_ungR1_YzBL0() throws Exception {
    PredicateContext predicateContext = new PredicateContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new Constant("string"));
    assertTrue(predicateContext.nextSet());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_computeValueNodePointer_guSX7_QfaJ0() {
    PredicateContext predicateContext = new PredicateContext(new NamespaceContext(new SelfContext(new NamespaceContext(null, new NodeTypeTest(1)), new NodeTypeTest(1)), new NodeTypeTest(1)), new Constant("string"));
    assertFalse(predicateContext.nextSet());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testsetPosition_SetPositionStandard_UXbv3_rbyr0() throws Exception {
    NamespaceContext namespaceContext = new NamespaceContext(null, null);
    Constant constant = new Constant("string");
    PredicateContext predicateContext = new PredicateContext(namespaceContext, constant);
    predicateContext.nextSet();
    assertTrue(predicateContext.nextSet());
}
}