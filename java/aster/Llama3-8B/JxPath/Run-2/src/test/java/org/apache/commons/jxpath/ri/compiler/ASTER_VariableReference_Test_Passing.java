/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_VariableReference_Test_Passing {
@Mock
    private EvalContext evalContext;
@Mock
    private RootContext rootContext;
@Mock
    private QName varName;
@Mock
    private NodeTypeTest nodeTypeTest;
@Mock
    private NamespaceContext namespaceContext;
@Mock
    private SelfContext selfContext;
private VariableReference variablereference;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableName_oWHW0() {
        QName qName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(qName);
        QName result = variableReference.getVariableName();
        assertEquals(qName, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContextDependent_wMBh0() {
        VariableReference variableReference = new VariableReference(new QName("prefix", "localName"));
        QName qName = new QName("qualifiedName");
        assertFalse(variableReference.isContextDependent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContextDependent2_YbMw1() {
        VariableReference variableReference = new VariableReference(new QName("qualifiedName"));
        QName qName = new QName("qualifiedName");
        assertFalse(variableReference.isContextDependent());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_krCC0() {
        QName qName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(qName);
        String result = variableReference.toString();
        assertEquals("$prefix:localName", result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithQName_lJGo1() {
        QName qName = new QName("qualifiedName");
        VariableReference variableReference = new VariableReference(qName);
        String result = variableReference.toString();
        assertEquals("$qualifiedName", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_qiGr0() {
        QName qName = new QName("prefix", "localName");
        VariableReference variableReference = new VariableReference(qName);
        boolean result = variableReference.computeContextDependent();
        assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent2_Vmhi1() {
        QName qName = new QName("qualifiedName");
        VariableReference variableReference = new VariableReference(qName);
        boolean result = variableReference.computeContextDependent();
        assertFalse(result);
    }
}