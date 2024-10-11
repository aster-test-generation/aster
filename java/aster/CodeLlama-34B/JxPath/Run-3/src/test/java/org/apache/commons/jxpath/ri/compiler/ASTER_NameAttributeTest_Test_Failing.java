/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NameAttributeTest_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_Null_ODDr2_fid2() {
        NameAttributeTest test = new NameAttributeTest(null, null);
        assertFalse(test.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_EmptyString_lDWB3_fid2() {
        NameAttributeTest test = new NameAttributeTest(new Constant(""), new Constant(""));
        assertFalse(test.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_EmptyNumber_aNfi4_fid2() {
        NameAttributeTest test = new NameAttributeTest(new Constant(0), new Constant(0));
        assertFalse(test.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_InvalidString_QukW5_fid2() {
        NameAttributeTest test = new NameAttributeTest(new Constant("invalid"), new Constant("value"));
        assertFalse(test.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_InvalidNumber_ybWU6_fid2() {
        NameAttributeTest test = new NameAttributeTest(new Constant(1), new Constant(0));
        assertFalse(test.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_NullNamePath_hlPk7_fid2() {
        NameAttributeTest test = new NameAttributeTest(null, new Constant("value"));
        assertFalse(test.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_NullNameValue_Quse8_fid2() {
        NameAttributeTest test = new NameAttributeTest(new Constant("string"), null);
        assertFalse(test.computeContextDependent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeContextDependent_InvalidNameValue_eaFl10_fid2() {
        NameAttributeTest test = new NameAttributeTest(new Constant("string"), new Constant("invalid"));
        assertFalse(test.computeContextDependent());
    }
}