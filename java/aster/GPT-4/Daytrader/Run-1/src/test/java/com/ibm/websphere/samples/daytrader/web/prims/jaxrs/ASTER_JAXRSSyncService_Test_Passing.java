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
  public void testEchoObject_QviP0() {
    JAXRSSyncService service = new JAXRSSyncService();
    XMLObject originalObject = new XMLObject();
    XMLObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject, returnedObject);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_1() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0001(), returnedObject.getProp0001());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_2() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0002(), returnedObject.getProp0002());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_3() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0003(), returnedObject.getProp0003());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_4() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0004(), returnedObject.getProp0004());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_5() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0005(), returnedObject.getProp0005());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_6() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0006(), returnedObject.getProp0006());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_7() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0007(), returnedObject.getProp0007());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_8() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0008(), returnedObject.getProp0008());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_9() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0009(), returnedObject.getProp0009());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_10() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0010(), returnedObject.getProp0010());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_11() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0011(), returnedObject.getProp0011());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_12() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0012(), returnedObject.getProp0012());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_13() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0013(), returnedObject.getProp0013());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_14() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0014(), returnedObject.getProp0014());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_15() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0015(), returnedObject.getProp0015());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoObject_iTCm0_16() {
    JAXRSSyncService service = new JAXRSSyncService();
    TestJSONObject originalObject = new TestJSONObject();
    originalObject.setProp0001("value1");
    originalObject.setProp0002("value2");
    originalObject.setProp0003("value3");
    originalObject.setProp0004("value4");
    originalObject.setProp0005("value5");
    originalObject.setProp0006("value6");
    originalObject.setProp0007("value7");
    originalObject.setProp0008("value8");
    originalObject.setProp0009("value9");
    originalObject.setProp0010("value10");
    originalObject.setProp0011("value11");
    originalObject.setProp0012("value12");
    originalObject.setProp0013("value13");
    originalObject.setProp0014("value14");
    originalObject.setProp0015("value15");
    originalObject.setProp0016("value16");
    TestJSONObject returnedObject = service.echoObject(originalObject);
    assertEquals(originalObject.getProp0016(), returnedObject.getProp0016());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEchoString_jdRt0() {
    JAXRSSyncService service = new JAXRSSyncService();
    String input = "Hello World";
    String result = service.echoString(input);
    assertEquals(input, result);
  }
}