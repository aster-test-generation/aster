/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.util.concurrent.TimeUnit;
import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonReaderFactory;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

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
    private static JsonBuilderFactory sesFactory = Json.createBuilderFactory(null);
    private static JsonReaderFactory sesReaderFactory = Json.createReaderFactory(null);
    HttpServletResponse httpservletresponse;
    ServletOutputStream servletoutputstream;
    private static final JsonReaderFactory jSONReaderFactory = Json.createReaderFactory(null);
    private static final JsonBuilderFactory jSONObjectFactory = Json.createBuilderFactory(null);

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_1() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingjsonpobjectfactory = new PingJSONPObjectFactory();
        pingjsonpobjectfactory.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
        assertEquals(0, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_2() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingjsonpobjectfactory = new PingJSONPObjectFactory();
        pingjsonpobjectfactory.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
        assertNotNull(initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetServletInfo_rSqw0() {
        PingJSONPObjectFactory pingJSONPObjectFactory = new PingJSONPObjectFactory();
        String actualServletInfo = pingJSONPObjectFactory.getServletInfo();
        String expectedServletInfo = "Basic JSON generation and parsing in a servlet";
        assertEquals(expectedServletInfo, actualServletInfo);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit() throws Exception {
        httpservlet = mock(HttpServlet.class);
        pingjsonpobjectfactory = new PingJSONPObjectFactory();
        pingjsonpobjectfactory.init(httpservlet);
        verify(httpservlet, times(1)).init(any());
        assertEquals(0, hitCount);
        assertNotNull(initTime);
    }
}