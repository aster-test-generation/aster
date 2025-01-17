/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;
import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonReaderFactory;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingJSONPObjectFactory_Test_Passing {
private static int hitCount;
private static String initTime;
@Mock
    private ServletConfig servletConfig;
@InjectMocks
    private PingJSONPObjectFactory pingJSONPObjectFactory;
PingJSONPObjectFactory pingjsonpobjectfactory;
HttpServletResponse httpservletresponse;
ServletOutputStream servletoutputstream;
HttpServletRequest httprequest;
HttpServlet httpservlet;
private static JsonBuilderFactory jSONObjectFactory = Json.createBuilderFactory(null);
private static JsonReaderFactory jSONReaderFactory = Json.createReaderFactory(null);
@Mock
    private HttpServletRequest httpServletRequest;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoPost() throws Exception {
        httpservletresponse = mock(HttpServletResponse.class);
        servletoutputstream = mock(ServletOutputStream.class);
        httprequest = mock(HttpServletRequest.class);
        httpservlet = mock(HttpServlet.class);
        pingjsonpobjectfactory = new PingJSONPObjectFactory();
        when(httpservletresponse.getOutputStream()).thenReturn(servletoutputstream);
        pingjsonpobjectfactory.doPost(httprequest, httpservletresponse);
        verify(httpservletresponse, times(1)).setStatus(HttpServletResponse.SC_OK);
        verify(servletoutputstream, times(1)).write("Hello, World!".getBytes());
        verify(servletoutputstream, times(1)).flush();
        verify(servletoutputstream, times(1)).close();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetServletInfo_BCNx0() {
        PingJSONPObjectFactory factory = new PingJSONPObjectFactory();
        String result = factory.getServletInfo();
        assertEquals("Basic JSON generation and parsing in a servlet", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInit_wDtw0_1() throws ServletException {
    hitCount = 0;
    initTime = null;
    pingJSONPObjectFactory.init(servletConfig);
    assertEquals(0, hitCount);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInit_wDtw0_2() throws ServletException {
    hitCount = 0;
    initTime = null;
    pingJSONPObjectFactory.init(servletConfig);
    assertEquals(null, initTime);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testdoGet_PnaZ0() throws Exception{
    hitCount = 0;
    initTime = "2022-01-01 00:00:00";
    ServletOutputStream servletOutputStream = mock(ServletOutputStream.class);
    HttpServletResponse servletResponse = mock(HttpServletResponse.class);
    when(servletResponse.getOutputStream()).thenReturn(servletOutputStream);
    pingjsonpobjectfactory.doGet(httpServletRequest, servletResponse);
    verify(servletOutputStream).println(anyString());
    verify(servletOutputStream).flush();
    verify(servletOutputStream).close();
    assertEquals(1, hitCount);
}
}