/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PrimFilter_Coverage_Test_Passing {
    PrimFilter filter = new PrimFilter();
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void test1_jVLe1() throws java.io.IOException, javax.servlet.ServletException {
    PrimFilter filter = new PrimFilter();
    ServletRequest req = null;
    ServletResponse resp = null;
    FilterChain chain = null;
    try {
        filter.doFilter(req, resp, chain);
    } catch (IOException | ServletException e) {
    }
}
}