/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims;

import java.io.StringWriter;
import java.util.concurrent.TimeUnit;
import javax.json.Json;
import javax.json.stream.JsonGenerator;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_PingJSONPStreaming_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test1_vjdS0() {
    PingJSONPStreaming obj = new PingJSONPStreaming();
    String expected = "Basic JSON generation and parsing in a servlet";
    assertEquals(expected, obj.getServletInfo());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testInit_Qmly0() throws javax.servlet.ServletException {
    PingJSONPStreaming pingJSONPStreaming = new PingJSONPStreaming();
    pingJSONPStreaming.init(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet0_nPSx0() throws Exception {
    PingJSONPStreaming obj = new PingJSONPStreaming();
    HttpServletRequest req = new MockHttpServletRequest();
    HttpServletResponse res = new MockHttpServletResponse();
    obj.doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet1_HEVM1() throws Exception {
    PingJSONPStreaming obj = new PingJSONPStreaming();
    HttpServletRequest req = new MockHttpServletRequest();
    HttpServletResponse res = new MockHttpServletResponse();
    res.setContentType("text/html");
    obj.doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet2_pKpx2() throws Exception {
    PingJSONPStreaming obj = new PingJSONPStreaming();
    HttpServletRequest req = new MockHttpServletRequest();
    HttpServletResponse res = new MockHttpServletResponse();
    res.setContentType("text/html");
    ServletOutputStream out = res.getOutputStream();
    obj.doGet(req, res);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoGet6_iKgW6_YDyP0() throws Exception {
    PingJSONPStreaming obj = new PingJSONPStreaming();
    HttpServletRequest req = new MockHttpServletRequest();
    HttpServletResponse res = new MockHttpServletResponse();
    res.setContentType("text/html");
    ServletOutputStream out = res.getOutputStream();
    int hitCount = 0;
    hitCount++;
    StringWriter sw = new StringWriter();
    JsonGenerator generator = Json.createGenerator(sw);
    generator.writeStartObject();
    obj.doGet(req, res);
  }
}