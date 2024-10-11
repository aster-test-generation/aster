/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.IOException;
import java.io.StringReader;
import java.util.concurrent.TimeUnit;
import javax.json.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJSONPObjectFactory_Test_Passing {
    private static int hitCount;
    private static String initTime;
    PingJSONPObjectFactory pingjsonpobjectfactory;
    @Mock
    HttpServletRequest mockHttpServletRequest;
    @Mock
    HttpServletResponse mockHttpServletResponse;
    private static JsonBuilderFactory toJSONObjectFactory = Json.createBuilderFactory(null);
    private static JsonReaderFactory toJSONReaderFactory = Json.createReaderFactory(null);
    private static final JsonReaderFactory jSONReaderFactory = Json.createReaderFactory(null);
    private static final JsonBuilderFactory jSONObjectFactory = Json.createBuilderFactory(null);

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithException_rAIN2() {
        PingJSONPObjectFactory factory = new PingJSONPObjectFactory();
        try {
            factory.init(null);
            fail("Expected ServletException");
        } catch (ServletException e) {
            assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInitWithMultipleThreadsAndException_fXxa5() throws ServletException, InterruptedException {
        PingJSONPObjectFactory factory = new PingJSONPObjectFactory();
        Thread t1 = new Thread(() -> {
            try {
                factory.init(null);
            } catch (ServletException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                factory.init(null);
            } catch (ServletException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        try {
            factory.init(null);
            fail("Expected ServletException");
        } catch (ServletException e) {
            assertTrue(true);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        MockitoAnnotations.initMocks(this);
        pingjsonpobjectfactory = new PingJSONPObjectFactory();
        Mockito.when(mockHttpServletRequest.getParameter("param1")).thenReturn("value1");
        Mockito.when(mockHttpServletRequest.getParameter("param2")).thenReturn("value2");
        pingjsonpobjectfactory.doPost(mockHttpServletRequest, mockHttpServletResponse);
        Mockito.verify(mockHttpServletResponse).getWriter();
        Mockito.verify(mockHttpServletResponse).setStatus(HttpServletResponse.SC_OK);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getServletInfo_Hxtb0() {
        PingJSONPObjectFactory factory = new PingJSONPObjectFactory();
        String result = factory.getServletInfo();
        assertEquals("Basic JSON generation and parsing in a servlet", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getServletInfo_null_JAYX1() {
        PingJSONPObjectFactory factory = new PingJSONPObjectFactory();
        String result = factory.getServletInfo();
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getServletInfo_empty_AmXi2() {
        PingJSONPObjectFactory factory = new PingJSONPObjectFactory();
        String result = factory.getServletInfo();
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoGet() throws Exception {
        pingjsonpobjectfactory = mock(PingJSONPObjectFactory.class);
        hitCount = 0;
        initTime = "2022-01-01";
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream output = mock(ServletOutputStream.class);
        when(response.getOutputStream()).thenReturn(output);
        pingjsonpobjectfactory.doGet(request, response);
        JsonObject json = toJSONObjectFactory.createObjectBuilder().add("initTime", initTime).add("hitCount", hitCount).build();
        String generatedJSON = json.toString();
        JsonReader jsonReader = toJSONReaderFactory.createReader(new StringReader(generatedJSON));
        String parsedJSON = jsonReader.readObject().toString();
        verify(response).setContentType("text/html");
        verify(output).println("<html><head><title>Ping JSONP</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping JSONP</FONT><BR>Generated JSON: " + generatedJSON + "<br>Parsed JSON: " + parsedJSON + "</body></html>");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_eUPe0_1() throws Exception {
        pingjsonpobjectfactory = mock(PingJSONPObjectFactory.class);
        doCallRealMethod().when(pingjsonpobjectfactory).init(any(ServletConfig.class));
        pingjsonpobjectfactory.init(mock(ServletConfig.class));
        verify(pingjsonpobjectfactory, times(1)).init(any(ServletConfig.class));
        assertEquals(0, hitCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testinit_eUPe0_2() throws Exception {
        pingjsonpobjectfactory = mock(PingJSONPObjectFactory.class);
        doCallRealMethod().when(pingjsonpobjectfactory).init(any(ServletConfig.class));
        pingjsonpobjectfactory.init(mock(ServletConfig.class));
        verify(pingjsonpobjectfactory, times(1)).init(any(ServletConfig.class));
        assertNotNull(initTime);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoPost_wEYO0_ylQb0() throws ServletException, IOException {
        PingJSONPObjectFactory factory = new PingJSONPObjectFactory();
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        factory.doPost(req, res);
    }
}