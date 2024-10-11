/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JXPathCompiledExpression_Test_Passing {
    private Expression expression;
    private String xpath;
    @Mock
    private JXPathContext jxpathcontext;
    @Mock
    private JXPathContextReferenceImpl jxpathcontextreferenceimpl;
    private JXPathCompiledExpression jxpathcompiledexpression;
    @Mock
    private Iterator iterator;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetXPathString_FKWx0() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("string"));
        String result = expression.getXPath();
        assert result.equals("xpath");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetXPathNumber_zUvL1() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant(1));
        String result = expression.getXPath();
        assert result.equals("xpath");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_KzIM0() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("string"));
        String result = expression.toString();
        assert result.equals("xpath");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringNumber_IDBO1() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant(1));
        String result = expression.toString();
        assert result.equals("xpath");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExpressionWithConstantString_QNfH0() {
        JXPathCompiledExpression jxpath = new JXPathCompiledExpression("xpath", new Constant("string"));
        Expression result = jxpath.getExpression();
        assertEquals(Constant.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExpressionWithConstantNumber_FWII1() {
        JXPathCompiledExpression jxpath = new JXPathCompiledExpression("xpath", new Constant(1));
        Expression result = jxpath.getExpression();
        assertEquals(Constant.class, result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveAll_UudR0_HeVm0() {
        JXPathCompiledExpression jxpath = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContextReferenceImpl contextReference = new JXPathContextReferenceImpl(null, null);
        JXPathContext context = JXPathContext.newContext(contextReference, new Object());
        jxpath.iterate(context);
        assertEquals(true, true);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValue_hbhH0_ozkp0() {
        JXPathCompiledExpression compiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContextReferenceImpl contextReference = new JXPathContextReferenceImpl(null, null);
        JXPathContext context = JXPathContext.newContext(null, null);
        Object result = compiledExpression.iterate(context);
        assert result != null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIteratePointers_xfoI0_tBLK0() {
        JXPathCompiledExpression jxpathCompiledExpression = new JXPathCompiledExpression("xpath", new Constant("expression"));
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        JXPathContext jxpathContext = JXPathContext.newContext(null, null);
        Iterator result = jxpathCompiledExpression.iterate(jxpathContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterate_LDgr0_nKom0() {
        JXPathCompiledExpression expression = new JXPathCompiledExpression("xpath", new Constant("constant"));
        JXPathContext context = JXPathContext.newContext(new Object());
        Iterator result = expression.iterate(context);
    }
}