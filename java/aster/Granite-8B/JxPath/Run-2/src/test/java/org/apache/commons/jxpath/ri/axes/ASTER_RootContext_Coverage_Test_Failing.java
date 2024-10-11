/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RootContext_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testSetPosition_wYaV0()
	{
		RootContext rootContext = new RootContext(null, null);
		rootContext.setPosition(0);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetJXPathContext_HjPz0() {
        RootContext rootContext = new RootContext(null, null);
        JXPathContext jxpathContext = rootContext.getJXPathContext();
        assertNotNull(jxpathContext);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextNode_AZgk0() {
    RootContext rootContext = new RootContext(null, null);
    rootContext.nextNode();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNextSet_FRaf0() {
    RootContext rootContext = new RootContext(null, null);
    rootContext.nextSet();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testgetVariableContext_Hiiu0() {
    RootContext rootContext = new RootContext(null, null);
    EvalContext evalContext = rootContext.getVariableContext(null);
    assertNotNull(evalContext);
  }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testgetVariableContext2_bYVe1() {
    RootContext rootContext = new RootContext(null, null);
    EvalContext evalContext = rootContext.getVariableContext(null);
    assertEquals(0, evalContext.getCurrentPosition());
  }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConstantContextWithString_Evvs2() {
        RootContext rootContext = new RootContext(null, null);
        Object constant = "constant";
        EvalContext evalContext = rootContext.getConstantContext(constant);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConstantContextWithInteger_TxIg3() {
        RootContext rootContext = new RootContext(null, null);
        Object constant = 123;
        EvalContext evalContext = rootContext.getConstantContext(constant);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConstantContextWithDouble_Ipvq4() {
        RootContext rootContext = new RootContext(null, null);
        Object constant = 123.456;
        EvalContext evalContext = rootContext.getConstantContext(constant);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConstantContextWithBoolean_EPBY5() {
        RootContext rootContext = new RootContext(null, null);
        Object constant = true;
        EvalContext evalContext = rootContext.getConstantContext(constant);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void getCurrentPositionTest_wDIy0() {
		RootContext rootContext = new RootContext(null, null);
		rootContext.getCurrentPosition();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConstantContextWithNodePointer_Rqjp1_zkll0() {
        RootContext rootContext = new RootContext(null, null);
        Object constant = new DOMNodePointer(null, null, null);
        EvalContext evalContext = rootContext.getConstantContext(constant);
    }
}