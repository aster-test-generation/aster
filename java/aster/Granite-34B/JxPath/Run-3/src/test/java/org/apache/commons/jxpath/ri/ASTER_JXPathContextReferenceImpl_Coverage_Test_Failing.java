/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathContextReferenceImpl_Coverage_Test_Failing {
    JXPathContextReferenceImpl jxpathcontextreferenceimpl;

    @BeforeEach
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIteratePointers_LgAa0() {
        JXPathContextReferenceImpl jxPathContextReferenceImpl = new JXPathContextReferenceImpl(null, null, null);
        String xpath = "";
        Iterator iterator = jxPathContextReferenceImpl.iteratePointers(xpath);
        assertNotNull(iterator);
    }
}