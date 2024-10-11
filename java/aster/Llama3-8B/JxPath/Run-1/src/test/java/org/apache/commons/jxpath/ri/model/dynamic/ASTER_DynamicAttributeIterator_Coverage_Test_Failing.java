/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DynamicAttributeIterator_Coverage_Test_Failing {
    public void superMethodCallVerification(DynamicAttributeIterator dynamicAttributeIterator) {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrepareForIndividualProperty_SuperMethodCall_pQWG1() {
        DynamicAttributeIterator dynamicAttributeIterator = new DynamicAttributeIterator(null, null);
        dynamicAttributeIterator.prepareForIndividualProperty("test");
        superMethodCallVerification(dynamicAttributeIterator);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrepareForIndividualProperty_ExceptionHandling_IOap2() {
        DynamicAttributeIterator dynamicAttributeIterator = new DynamicAttributeIterator(null, null);
        try {
            dynamicAttributeIterator.prepareForIndividualProperty(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("propertyName", e.getMessage());
        }
    }
}