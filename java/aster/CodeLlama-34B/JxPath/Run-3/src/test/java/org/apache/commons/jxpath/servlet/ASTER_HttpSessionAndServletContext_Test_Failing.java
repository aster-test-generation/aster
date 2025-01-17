/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockServletContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_HttpSessionAndServletContext_Test_Failing {
    private ServletContext context;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletContextWithNullSession_lBxL1() {
        ServletContext context = mock(ServletContext.class);
        HttpSessionAndServletContext httpSessionAndServletContext = new HttpSessionAndServletContext(null, context);
        ServletContext actualContext = httpSessionAndServletContext.getServletContext();
        assertNull(actualContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionWithNullSession_IJHM1_DBpI0() {
        HttpSessionAndServletContext httpSessionAndServletContext = new HttpSessionAndServletContext(null, new MockServletContext());
        HttpSession session = httpSessionAndServletContext.getSession();
        assertNull(session);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionWithNullContext_dKkc2_zgKc0() {
        HttpSessionAndServletContext httpSessionAndServletContext = new HttpSessionAndServletContext(new MockHttpSession(), null);
        HttpSession session = httpSessionAndServletContext.getSession();
        assertNull(session);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetSessionWithNullSession_IJHM1_DBpI0_fid1() {
        HttpSessionAndServletContext httpSessionAndServletContext = new HttpSessionAndServletContext(null, new MockServletContext());
        HttpSession session = httpSessionAndServletContext.getSession();
        assertNotNull(session);
    }
}