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
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_HttpSessionHandler_Test_Passing {
    @Mock
    HttpSession httpsession;
    @Mock
    HttpSessionAndServletContext httpsessionandservletcontext;
    @Mock
    HttpSessionHandler httpsessionhandler;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetProperty() {
        httpsessionhandler = new HttpSessionHandler();
        when(httpsessionandservletcontext.getSession()).thenReturn(httpsession);
        httpsessionhandler.setProperty(httpsessionandservletcontext, "testProperty", "testValue");
        verify(httpsession).setAttribute("testProperty", "testValue");
    }
}