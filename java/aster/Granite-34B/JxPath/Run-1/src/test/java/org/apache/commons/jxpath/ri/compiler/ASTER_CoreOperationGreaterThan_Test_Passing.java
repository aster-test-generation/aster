/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CoreOperationGreaterThan_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareWithPositiveCompare_pqPo0() {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(new Constant(1), new Constant(0));
        boolean actual = coreOperationGreaterThan.evaluateCompare(1);
        boolean expected = true;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEvaluateCompareWithNegativeCompare_ybOI1() {
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(new Constant(1), new Constant(0));
        boolean actual = coreOperationGreaterThan.evaluateCompare(-1);
        boolean expected = false;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbol_qjyW0() {
        Constant constant1 = new Constant("1");
        Constant constant2 = new Constant("2");
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(constant1, constant2);
        String symbol = coreOperationGreaterThan.getSymbol();
        assert symbol.equals(">");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithNumberConstants_iWeE1() {
        Constant constant1 = new Constant(1);
        Constant constant2 = new Constant(2);
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(constant1, constant2);
        String symbol = coreOperationGreaterThan.getSymbol();
        assert symbol.equals(">");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithZeroConstants_juuS2() {
        Constant constant1 = new Constant(0);
        Constant constant2 = new Constant(0);
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(constant1, constant2);
        String symbol = coreOperationGreaterThan.getSymbol();
        assert symbol.equals(">");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithNegativeConstants_XCvi3() {
        Constant constant1 = new Constant(-1);
        Constant constant2 = new Constant(-2);
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(constant1, constant2);
        String symbol = coreOperationGreaterThan.getSymbol();
        assert symbol.equals(">");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithPositiveConstants_PaNV4() {
        Constant constant1 = new Constant(1);
        Constant constant2 = new Constant(1);
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(constant1, constant2);
        String symbol = coreOperationGreaterThan.getSymbol();
        assert symbol.equals(">");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithConstantsOfDifferentTypes_aGAV5() {
        Constant constant1 = new Constant("1");
        Constant constant2 = new Constant(1);
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(constant1, constant2);
        String symbol = coreOperationGreaterThan.getSymbol();
        assert symbol.equals(">");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithConstantsOfSameType_MPiz6() {
        Constant constant1 = new Constant("1");
        Constant constant2 = new Constant("1");
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(constant1, constant2);
        String symbol = coreOperationGreaterThan.getSymbol();
        assert symbol.equals(">");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSymbolWithConstantsOfDifferentTypesAndValues_zUBn9() {
        Constant constant1 = new Constant("1");
        Constant constant2 = new Constant(2);
        CoreOperationGreaterThan coreOperationGreaterThan = new CoreOperationGreaterThan(constant1, constant2);
        String symbol = coreOperationGreaterThan.getSymbol();
        assert symbol.equals(">");
    }
}