/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CoreOperationAdd_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_xoZG0() {
        CoreOperationAdd add = new CoreOperationAdd(new Expression[0]);
        assertEquals("+", add.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithArguments_EiPN1() {
        Expression[] args = new Expression[2];
        args[0] = new Constant(1);
        args[1] = new Constant(2);
        CoreOperationAdd add = new CoreOperationAdd(args);
        assertEquals("+", add.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithDifferentArguments_Zcbn2() {
        Expression[] args = new Expression[2];
        args[0] = new Constant(1);
        args[1] = new Constant(3);
        CoreOperationAdd add = new CoreOperationAdd(args);
        assertEquals("+", add.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithNullArguments_KsQC3() {
        Expression[] args = new Expression[2];
        args[0] = null;
        args[1] = null;
        CoreOperationAdd add = new CoreOperationAdd(args);
        assertEquals("+", add.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithEmptyArguments_ZgrT4() {
        Expression[] args = new Expression[0];
        CoreOperationAdd add = new CoreOperationAdd(args);
        assertEquals("+", add.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithInvalidArguments3_POMX7() {
        Expression[] args = new Expression[2];
        args[0] = new Constant(1);
        args[1] = new Constant(4);
        CoreOperationAdd add = new CoreOperationAdd(args);
        assertEquals("+", add.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithInvalidArguments4_vmuX8() {
        Expression[] args = new Expression[2];
        args[0] = new Constant(1);
        args[1] = new Constant(5);
        CoreOperationAdd add = new CoreOperationAdd(args);
        assertEquals("+", add.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithInvalidArguments5_HCgz9() {
        Expression[] args = new Expression[2];
        args[0] = new Constant(1);
        args[1] = new Constant(6);
        CoreOperationAdd add = new CoreOperationAdd(args);
        assertEquals("+", add.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithInvalidArguments6_pCvB10() {
        Expression[] args = new Expression[2];
        args[0] = new Constant(1);
        args[1] = new Constant(7);
        CoreOperationAdd add = new CoreOperationAdd(args);
        assertEquals("+", add.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithInvalidArguments7_odis11() {
        Expression[] args = new Expression[2];
        args[0] = new Constant(1);
        args[1] = new Constant(8);
        CoreOperationAdd add = new CoreOperationAdd(args);
        assertEquals("+", add.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithInvalidArguments8_tFtu12() {
        Expression[] args = new Expression[2];
        args[0] = new Constant(1);
        args[1] = new Constant(9);
        CoreOperationAdd add = new CoreOperationAdd(args);
        assertEquals("+", add.getSymbol());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetric_BUil0() {
        CoreOperationAdd add = new CoreOperationAdd(new Expression[]{new Constant(1), new Constant(2)});
        assertTrue(add.isSymmetric());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsNotSymmetric_QHgi1() {
        CoreOperationAdd add = new CoreOperationAdd(new Expression[]{new Constant(1), new Constant(3)});
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSymmetricComplex_XBrt2() {
        CoreOperationAdd add = new CoreOperationAdd(new Expression[]{new Constant(1), new Constant(2), new Constant(3)});
        assertTrue(add.isSymmetric());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsNotSymmetricComplex_PTZM3() {
        CoreOperationAdd add = new CoreOperationAdd(new Expression[]{new Constant(1), new Constant(2), new Constant(4)});
        assertTrue(add.isSymmetric());
    }
}