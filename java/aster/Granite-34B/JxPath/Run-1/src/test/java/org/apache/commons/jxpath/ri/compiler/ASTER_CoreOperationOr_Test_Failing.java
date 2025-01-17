/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.EvalContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationOr_Test_Failing {
    CoreOperationOr coreoperationor;
    EvalContext context;
    Expression[] args;
    Expression arg1;
    Expression arg2;
    private CoreOperationOr or;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcomputeValue() throws Exception {
        coreoperationor = new CoreOperationOr(args);
        context = mock(EvalContext.class);
        arg1 = mock(Expression.class);
        arg2 = mock(Expression.class);
        args = new Expression[]{arg1, arg2};
        when(arg1.computeValue(context)).thenReturn(Boolean.TRUE);
        when(arg2.computeValue(context)).thenReturn(Boolean.FALSE);
        Object result = coreoperationor.computeValue(context);
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_1_Sgmy1() {
        final Expression[] args = new Expression[0];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_2_nVGC2() {
        final Expression[] args = new Expression[0];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_3_MXpK3() {
        final Expression[] args = new Expression[0];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 3);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_4_UDnD4() {
        final Expression[] args = new Expression[0];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 4);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_5_vXOd5() {
        final Expression[] args = new Expression[0];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_6_AOLM6() {
        final Expression[] args = new Expression[0];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 6);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_7_zHbW7() {
        final Expression[] args = new Expression[0];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 7);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_8_HkPB8() {
        final Expression[] args = new Expression[0];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 8);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_1_Sgmy1_fid1() {
        final Expression[] args = new Expression[1];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 1);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_2_nVGC2_fid1() {
        final Expression[] args = new Expression[2];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 2);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_5_vXOd5_fid1() {
        final Expression[] args = new Expression[5];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 5);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_6_AOLM6_fid1() {
        final Expression[] args = new Expression[6];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 6);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_7_zHbW7_fid1() {
        final Expression[] args = new Expression[7];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 7);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrecedence_8_HkPB8_fid1() {
        final Expression[] args = new Expression[8];
        CoreOperationOr target = new CoreOperationOr(args);
        int actual = target.getPrecedence();
        assertEquals(actual, 8);
    }
}