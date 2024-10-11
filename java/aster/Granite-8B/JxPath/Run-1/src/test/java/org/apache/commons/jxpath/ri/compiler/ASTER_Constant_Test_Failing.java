/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Constant_Test_Failing {
    private Object value;
    @Mock
    private EvalContext evalContext;
    @Mock
    private EvalContext mockEvalContext;
    @Mock
    private EvalContext evalContext2;
    @Mock
    private NodeTypeTest nodeTypeTest;
    @Mock
    private SelfContext selfContext;
    @Mock
    private NamespaceContext namespaceContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompute_BqET0_bsgH0() {
        Constant constant = new Constant("test");
        EvalContext context = Mockito.mock(EvalContext.class);
        Object result = constant.compute(context);
        assert result == null;
    }
}