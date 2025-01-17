/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ServletRequestAndContext_Test_Failing {
    private ServletRequest request;
    private ServletContext context;
    private ServletRequestAndContext servletrequestandcontext;
    @Mock
    HttpServletRequest httpServletRequest;
    @Mock
    HttpSession httpSession;
    @Mock
    private ServletRequest mockRequest;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getSession_HttpServletRequest_ReturnsHttpSession_aubp0_DkZK0() {
        HttpServletRequest request = mock(HttpServletRequest.class);
        ServletContext context = mock(ServletContext.class);
        ServletRequestAndContext servletRequestAndContext = new ServletRequestAndContext(request, context);
        HttpSession session = servletRequestAndContext.getSession();
        assertEquals(HttpSession.class, session.getClass());
    }
}