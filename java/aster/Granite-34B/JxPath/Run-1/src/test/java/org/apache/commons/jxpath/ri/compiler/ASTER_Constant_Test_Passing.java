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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_Constant_Test_Passing {
    private Object value;
    Constant constant;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContextDependentWithString_kNYZ0() {
        Constant constant = new Constant("test");
        boolean result = constant.isContextDependent();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContextDependentWithNumber_Nlak1() {
        Constant constant = new Constant(10);
        boolean result = constant.isContextDependent();
        assertFalse(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNumber_Vwlq0() {
        Constant constant = new Constant(10);
        assertEquals("10", constant.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithString_xuBd1() {
        Constant constant = new Constant("hello");
        assertEquals("'hello'", constant.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithString_Xfoe0() {
        Constant constant = new Constant("test");
        boolean result = constant.computeContextDependent();
        assert result == false;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithNumber_IiVE1() {
        Constant constant = new Constant(10);
        boolean result = constant.computeContextDependent();
        assert result == false;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependentWithBothStringAndNumber_jtqG2() {
        Constant constant1 = new Constant("test");
        boolean result1 = constant1.computeContextDependent();
        assert result1 == false;
        Constant constant2 = new Constant(10);
        boolean result2 = constant2.computeContextDependent();
        assert result2 == false;
    }
}