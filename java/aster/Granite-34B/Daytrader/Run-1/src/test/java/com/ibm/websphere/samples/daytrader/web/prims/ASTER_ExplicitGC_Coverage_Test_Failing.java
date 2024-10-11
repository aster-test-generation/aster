/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ExplicitGC_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_uyWv0() {
        ExplicitGC obj = new ExplicitGC();
        assertEquals("Generate Explicit GC to VM", obj.getServletInfo());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_PldH0() throws javax.servlet.ServletException, java.io.IOException {
        ExplicitGC explicitGC = new ExplicitGC();
        explicitGC.doPost(null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_WBqP0() throws javax.servlet.ServletException, java.io.IOException {
        ExplicitGC explicitGC = new ExplicitGC();
        explicitGC.doGet(null, null);
    }
}