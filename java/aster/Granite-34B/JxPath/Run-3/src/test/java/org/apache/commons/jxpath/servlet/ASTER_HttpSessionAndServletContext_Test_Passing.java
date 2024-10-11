/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_HttpSessionAndServletContext_Test_Passing {
    @Mock
    private HttpSession session;
    HttpSessionAndServletContext httpsessionandservletcontext;
    @Mock
    private ServletContext context;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSession() throws Exception {
        httpsessionandservletcontext = new HttpSessionAndServletContext(session, null);
        Field field_session = HttpSessionAndServletContext.class.getDeclaredField("session");
        field_session.setAccessible(true);
        field_session.set(httpsessionandservletcontext, session);
        when(session.getAttribute("test")).thenReturn("testValue");
        assertEquals("testValue", httpsessionandservletcontext.getSession().getAttribute("test"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getServletContext_null_ZUQP1() throws Exception {
        HttpSession session = null;
        ServletContext context = null;
        HttpSessionAndServletContext httpSessionAndServletContext = new HttpSessionAndServletContext(session, context);
        ServletContext result = httpSessionAndServletContext.getServletContext();
        assertEquals(context, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getServletContext_initialized_null_xRYf4() throws Exception {
        HttpSession session = null;
        ServletContext context = null;
        HttpSessionAndServletContext httpSessionAndServletContext = new HttpSessionAndServletContext(session, context);
        ServletContext result = httpSessionAndServletContext.getServletContext();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getServletContext_not_initialized_null_WTEM5() throws Exception {
        HttpSession session = null;
        ServletContext context = null;
        HttpSessionAndServletContext httpSessionAndServletContext = new HttpSessionAndServletContext(session, context);
        ServletContext result = httpSessionAndServletContext.getServletContext();
        assertNull(result);
    }
}