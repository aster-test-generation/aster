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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_HttpSessionAndServletContext_Test_Failing {
    @Mock
    private HttpSession session;
    private HttpSessionAndServletContext httpsessionandservletcontext;
    @Mock
    private ServletContext context;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletContext_WqBe0() throws Exception {
        HttpSessionAndServletContext httpsessionandservletcontext = new HttpSessionAndServletContext(session, context);
        when(context).thenReturn(this.context);
        ServletContext result = httpsessionandservletcontext.getServletContext();
        assertEquals(this.context, result);
    }
}