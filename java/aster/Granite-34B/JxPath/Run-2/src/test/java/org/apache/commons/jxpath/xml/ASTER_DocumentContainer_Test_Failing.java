/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.xml;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DocumentContainer_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_GIOP0() {
        DocumentContainer documentContainer = new DocumentContainer(null);
        documentContainer.setValue(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue2_zYnm1() {
        DocumentContainer documentContainer = new DocumentContainer(null, "");
        documentContainer.setValue(null);
    }
}