/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonReaderFactory;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Assertions;
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
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJSONPObjectFactory_Test_Passing {
    private static int hitCount;
    private static String initTime;
    PingJSONPObjectFactory pingjsonpobjectfactory;
    HttpServlet httpservlet;
    @Mock
    HttpServlet httpServlet;
    @Mock
    HttpServletResponse httpServletResponse;
    @Mock
    ServletOutputStream servletOutputStream;
    PingJSONPObjectFactory pingJSONPObjectFactory;
    private static JsonBuilderFactory purescriptFactory = Json.createBuilderFactory(null);
    private static JsonReaderFactory purescriptReaderFactory = Json.createReaderFactory(null);
    HttpServletResponse httpservletresponse;
    ServletOutputStream servletoutputstream;
    private static final JsonReaderFactory jSONReaderFactory = Json.createReaderFactory(null);
    private static final JsonBuilderFactory jSONObjectFactory = Json.createBuilderFactory(null);

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitServletConfig_zJuP0() throws ServletException {
        PingJSONPObjectFactory pingJSONPObjectFactory = new PingJSONPObjectFactory();
        ServletConfig config = mock(ServletConfig.class);
        pingJSONPObjectFactory.init(config);
        verify(config).getInitParameter("ping.jsonp.initTime");
        verify(config).getInitParameter("ping.jsonp.hitCount");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testServletInfo_Fpzt0() {
        PingJSONPObjectFactory factory = new PingJSONPObjectFactory();
        String servletInfo = factory.getServletInfo();
        Assertions.assertEquals("Basic JSON generation and parsing in a servlet", servletInfo);
    }
}