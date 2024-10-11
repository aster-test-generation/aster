/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.Compiler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CoreFunction_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_VssB0() {
        CoreFunction coreFunction = new CoreFunction(1, null);
        assert coreFunction.getArgumentCount() == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_sSSh1() {
        CoreFunction coreFunction = new CoreFunction(1, new Expression[]{});
        assert coreFunction.getArgumentCount() == 0;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_JnvH0() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_LAST, null);
        assertEquals("last", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_MxkB1() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_POSITION, null);
        assertEquals("position", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test3_vcxb2() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_COUNT, null);
        assertEquals("count", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test4_EGzE3() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_ID, null);
        assertEquals("id", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test5_ENFn4() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_LOCAL_NAME, null);
        assertEquals("local-name", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test6_HNGv5() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_NAMESPACE_URI, null);
        assertEquals("namespace-uri", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test7_LbtE6() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_NAME, null);
        assertEquals("name", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test8_dbJH7() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_STRING, null);
        assertEquals("string", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test9_hBeo8() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_CONCAT, null);
        assertEquals("concat", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test10_pjpg9() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_STARTS_WITH, null);
        assertEquals("starts-with", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test11_lbnS10() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_ENDS_WITH, null);
        assertEquals("ends-with", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test12_tPXO11() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_CONTAINS, null);
        assertEquals("contains", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test13_qyTF12() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_SUBSTRING_BEFORE, null);
        assertEquals("substring-before", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test14_dzdY13() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_SUBSTRING_AFTER, null);
        assertEquals("substring-after", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test15_rcKJ14() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_SUBSTRING, null);
        assertEquals("substring", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test16_NwJf15() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_STRING_LENGTH, null);
        assertEquals("string-length", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test17_IlpQ16() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_NORMALIZE_SPACE, null);
        assertEquals("normalize-space", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test18_DMOI17() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_TRANSLATE, null);
        assertEquals("translate", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test19_ndil18() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_BOOLEAN, null);
        assertEquals("boolean", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test20_TzlV19() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_NOT, null);
        assertEquals("not", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test21_tFRy20() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals("true", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test22_fLyb21() {
        CoreFunction coreFunction = new CoreFunction(Compiler.FUNCTION_FALSE, null);
        assertEquals("false", coreFunction.getFunctionName());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent1_rVeq0() {
        CoreFunction coreFunction = new CoreFunction(1, null);
        boolean actual = coreFunction.computeContextDependent();
        boolean expected = true;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent2_JTrD1() {
        CoreFunction coreFunction = new CoreFunction(2, null);
        boolean actual = coreFunction.computeContextDependent();
        boolean expected = true;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent5_gYGj4() {
        CoreFunction coreFunction = new CoreFunction(5, null);
        boolean actual = coreFunction.computeContextDependent();
        boolean expected = true;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent6_DdMe5() {
        CoreFunction coreFunction = new CoreFunction(6, null);
        boolean actual = coreFunction.computeContextDependent();
        boolean expected = true;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent7_EYvt6() {
        CoreFunction coreFunction = new CoreFunction(7, null);
        boolean actual = coreFunction.computeContextDependent();
        boolean expected = true;
        assert actual == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString1_NKVc0_fid1() {
        CoreFunction coreFunction = new CoreFunction(1, new Expression[0]);
        String actual = coreFunction.toString();
        String expected = "last()";
        assertEquals(expected, actual);
    }
}