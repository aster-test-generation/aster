/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.jaxrs;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JAXRSSyncService_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_kZVA0() {
    JAXRSSyncService service = new JAXRSSyncService();
    XMLObject xmlObject = new XMLObject();
    assertEquals(xmlObject, service.echoObject(xmlObject));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_hfbu0() {
    TestJSONObject testJSONObject = new TestJSONObject();
    JAXRSSyncService jAXRSSyncService = new JAXRSSyncService();
    TestJSONObject result = jAXRSSyncService.echoObject(testJSONObject);
    assertEquals(testJSONObject, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObjectWithNullParam_KaaF1() {
    TestJSONObject testJSONObject = null;
    JAXRSSyncService jAXRSSyncService = new JAXRSSyncService();
    TestJSONObject result = jAXRSSyncService.echoObject(testJSONObject);
    assertEquals(testJSONObject, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObjectWithAllPropertiesSet_YneK2() {
    TestJSONObject testJSONObject = new TestJSONObject();
    testJSONObject.setProp0001("value1");
    testJSONObject.setProp0002("value2");
    testJSONObject.setProp0003("value3");
    testJSONObject.setProp0004("value4");
    testJSONObject.setProp0005("value5");
    testJSONObject.setProp0006("value6");
    testJSONObject.setProp0007("value7");
    testJSONObject.setProp0008("value8");
    testJSONObject.setProp0009("value9");
    testJSONObject.setProp0010("value10");
    testJSONObject.setProp0011("value11");
    testJSONObject.setProp0012("value12");
    testJSONObject.setProp0013("value13");
    testJSONObject.setProp0014("value14");
    testJSONObject.setProp0015("value15");
    testJSONObject.setProp0016("value16");
    JAXRSSyncService jAXRSSyncService = new JAXRSSyncService();
    TestJSONObject result = jAXRSSyncService.echoObject(testJSONObject);
    assertEquals(testJSONObject, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoString_bqoO0() {
    JAXRSSyncService service = new JAXRSSyncService();
    String input = "Hello, World!";
    String expected = input;
    String actual = service.echoString(input);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoStringWithEmptyInput_QsiP1() {
    JAXRSSyncService service = new JAXRSSyncService();
    String input = "";
    String expected = input;
    String actual = service.echoString(input);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoStringWithNullInput_QndI2() {
    JAXRSSyncService service = new JAXRSSyncService();
    String input = null;
    String expected = input;
    String actual = service.echoString(input);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoStringWithSpecialCharacters_hBRz3() {
    JAXRSSyncService service = new JAXRSSyncService();
    String input = " special!@#$%^&*()";
    String expected = input;
    String actual = service.echoString(input);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoStringWithUnicodeCharacters_gDBp4() {
    JAXRSSyncService service = new JAXRSSyncService();
    String input = "Unicode Characters: \u00C0\u00C1\u00C2\u00C3\u00C4\u00C5";
    String expected = input;
    String actual = service.echoString(input);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoStringWithMaxInputLength_zQtq5() {
    JAXRSSyncService service = new JAXRSSyncService();
    String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
    String expected = input;
    String actual = service.echoString(input);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoStringWithMinInputLength_GJov6() {
    JAXRSSyncService service = new JAXRSSyncService();
    String input = "a";
    String expected = input;
    String actual = service.echoString(input);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoStringWithInputLength5_bwKc7() {
    JAXRSSyncService service = new JAXRSSyncService();
    String input = "abcde";
    String expected = input;
    String actual = service.echoString(input);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoStringWithInputLength10_FvxX8() {
    JAXRSSyncService service = new JAXRSSyncService();
    String input = "abcdefghij";
    String expected = input;
    String actual = service.echoString(input);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoStringWithInputLength15_wtLK9() {
    JAXRSSyncService service = new JAXRSSyncService();
    String input = "abcdefghijklmno";
    String expected = input;
    String actual = service.echoString(input);
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoStringWithInputLength20_Tvrh10() {
    JAXRSSyncService service = new JAXRSSyncService();
    String input = "abcdefghijklmnopqrst";
    String expected = input;
    String actual = service.echoString(input);
    assertEquals(expected, actual);
  }
}