/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_HttpSessionAndServletContext_Test_Passing {
@Mock
    private HttpSession session;
@Mock
    private ServletContext context;
private HttpSessionAndServletContext httpsessionandservletcontext;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetSession() {
        httpsessionandservletcontext = new HttpSessionAndServletContext(session, context);
        // Arrange
        HttpSession expectedSession = session;
        // Act
        HttpSession actualSession = httpsessionandservletcontext.getSession();
        // Assert
        assertEquals(expectedSession, actualSession);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletContext() {
        httpsessionandservletcontext = new HttpSessionAndServletContext(session, context);
        // Act
        ServletContext result = httpsessionandservletcontext.getServletContext();
        // Assert
        Assertions.assertEquals(context, result);
    }
}