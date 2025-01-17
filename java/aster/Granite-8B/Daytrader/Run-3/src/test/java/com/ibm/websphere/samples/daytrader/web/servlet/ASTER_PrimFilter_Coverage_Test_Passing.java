/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PrimFilter_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDestroy1_yuKJ0() {
        PrimFilter primFilter = new PrimFilter();
        primFilter.destroy();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoFilterWithNullFilterConfig_yPSw1() throws IOException, ServletException {
        PrimFilter primFilter = new PrimFilter();
        ServletRequest req = null;
        ServletResponse resp = null;
        FilterChain chain = null;
        primFilter.doFilter(req, resp, chain);
    }
}