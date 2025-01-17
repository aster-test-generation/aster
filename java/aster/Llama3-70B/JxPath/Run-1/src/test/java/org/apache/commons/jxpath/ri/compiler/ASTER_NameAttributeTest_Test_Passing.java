/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NameAttributeTest_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_ttkA0() {
        Constant namePath = new Constant("path");
        Constant nameValue = new Constant(1);
        NameAttributeTest nameAttributeTest = new NameAttributeTest(namePath, nameValue);
        assertTrue(nameAttributeTest.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNameTestExpression_waBN0() {
        Constant namePath = new Constant("path");
        Constant nameValue = new Constant(1);
        NameAttributeTest nameAttributeTest = new NameAttributeTest(namePath, nameValue);
        Expression actual = nameAttributeTest.getNameTestExpression();
        assertNotNull(actual);
    }
}