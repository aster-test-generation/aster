/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;

import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_HttpSessionHandler_Test_Passing {
    HttpSessionHandler httpsessionhandler;
    HttpSession httpsession;
    HttpSessionAndServletContext httpsessionandservletcontext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetProperty() throws Exception {
        httpsession = mock(HttpSession.class);
        httpsessionandservletcontext = mock(HttpSessionAndServletContext.class);
        httpsessionhandler = new HttpSessionHandler();
        when(httpsessionandservletcontext.getSession()).thenReturn(httpsession);
        httpsessionhandler.setProperty(httpsessionandservletcontext, "property", "value");
        verify(httpsession).setAttribute("property", "value");
    }
}