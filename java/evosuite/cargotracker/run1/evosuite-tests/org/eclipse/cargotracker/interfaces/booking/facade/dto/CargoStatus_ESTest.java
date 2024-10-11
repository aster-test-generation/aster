/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:11:23 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoStatus;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.TrackingEvents;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CargoStatus_ESTest extends CargoStatus_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("3/Q", (String) null, (String) null, false, (String) null, "", linkedList0);
      boolean boolean0 = cargoStatus0.isMisdirected();
      assertEquals("3/Q", cargoStatus0.getTrackingId());
      assertEquals("", cargoStatus0.getNextExpectedActivity());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TrackingEvents trackingEvents0 = new TrackingEvents(true, "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoStatus", "");
      List<TrackingEvents> list0 = List.of(trackingEvents0, trackingEvents0, trackingEvents0, trackingEvents0);
      CargoStatus cargoStatus0 = new CargoStatus((String) null, "", "Q T(Cqk`/}", true, "sJThb@:Hp{e<q~a>o", "", list0);
      String string0 = cargoStatus0.getTrackingId();
      assertEquals("sJThb@:Hp{e<q~a>o", cargoStatus0.getEta());
      assertEquals("Q T(Cqk`/}", cargoStatus0.getStatusText());
      assertEquals("", cargoStatus0.getDestination());
      assertTrue(cargoStatus0.isMisdirected());
      assertNull(string0);
      assertEquals("", cargoStatus0.getNextExpectedActivity());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("3/Q", (String) null, (String) null, false, (String) null, "", linkedList0);
      String string0 = cargoStatus0.getTrackingId();
      assertEquals("", cargoStatus0.getNextExpectedActivity());
      assertFalse(cargoStatus0.isMisdirected());
      assertNotNull(string0);
      assertEquals("3/Q", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TrackingEvents trackingEvents0 = new TrackingEvents(true, "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoStatus", "");
      List<TrackingEvents> list0 = List.of(trackingEvents0, trackingEvents0, trackingEvents0, trackingEvents0);
      CargoStatus cargoStatus0 = new CargoStatus((String) null, "", "Q T(Cqk`/}", true, "sJThb@:Hp{e<q~a>o", "", list0);
      String string0 = cargoStatus0.getStatusText();
      assertTrue(cargoStatus0.isMisdirected());
      assertEquals("", cargoStatus0.getNextExpectedActivity());
      assertEquals("sJThb@:Hp{e<q~a>o", cargoStatus0.getEta());
      assertNotNull(string0);
      assertEquals("Q T(Cqk`/}", string0);
      assertEquals("", cargoStatus0.getDestination());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("org.eclipse.cargotracker.interfaces.booking.facade.dto.TrackingEvents", "", "", true, "EW.9B?)rl", "org.eclipse.cargotracker.interfaces.booking.facade.dto.TrackingEvents", linkedList0);
      String string0 = cargoStatus0.getStatusText();
      assertEquals("org.eclipse.cargotracker.interfaces.booking.facade.dto.TrackingEvents", cargoStatus0.getNextExpectedActivity());
      assertEquals("EW.9B?)rl", cargoStatus0.getEta());
      assertTrue(cargoStatus0.isMisdirected());
      assertEquals("org.eclipse.cargotracker.interfaces.booking.facade.dto.TrackingEvents", cargoStatus0.getTrackingId());
      assertEquals("", cargoStatus0.getDestination());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TrackingEvents trackingEvents0 = new TrackingEvents(false, "3C))f+8}}}", "");
      List<TrackingEvents> list0 = List.of(trackingEvents0, trackingEvents0, trackingEvents0, trackingEvents0);
      CargoStatus cargoStatus0 = new CargoStatus((String) null, "qr`&F", (String) null, true, "qr`&F", "3C))f+8}}}", list0);
      String string0 = cargoStatus0.getNextExpectedActivity();
      assertNotNull(string0);
      assertTrue(cargoStatus0.isMisdirected());
      assertEquals("qr`&F", cargoStatus0.getDestination());
      assertEquals("qr`&F", cargoStatus0.getEta());
      assertEquals("3C))f+8}}}", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("3/Q", (String) null, (String) null, false, (String) null, "", linkedList0);
      String string0 = cargoStatus0.getNextExpectedActivity();
      assertFalse(cargoStatus0.isMisdirected());
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals("3/Q", cargoStatus0.getTrackingId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("3/Q", (String) null, (String) null, false, (String) null, "", linkedList0);
      String string0 = cargoStatus0.getEta();
      assertNull(string0);
      assertEquals("3/Q", cargoStatus0.getTrackingId());
      assertEquals("", cargoStatus0.getNextExpectedActivity());
      assertFalse(cargoStatus0.isMisdirected());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("", "", "", false, "", "", linkedList0);
      cargoStatus0.getEta();
      assertFalse(cargoStatus0.isMisdirected());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("3/Q", (String) null, (String) null, false, (String) null, "", linkedList0);
      String string0 = cargoStatus0.getDestination();
      assertNull(string0);
      assertEquals("3/Q", cargoStatus0.getTrackingId());
      assertFalse(cargoStatus0.isMisdirected());
      assertEquals("", cargoStatus0.getNextExpectedActivity());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("", "", ")3x^", true, ")3x^", (String) null, linkedList0);
      String string0 = cargoStatus0.getDestination();
      assertNotNull(string0);
      assertEquals(")3x^", cargoStatus0.getEta());
      assertEquals("", string0);
      assertEquals("", cargoStatus0.getTrackingId());
      assertTrue(cargoStatus0.isMisdirected());
      assertEquals(")3x^", cargoStatus0.getStatusText());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CargoStatus cargoStatus0 = null;
      try {
        cargoStatus0 = new CargoStatus("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoStatus", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoStatus", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoStatus", true, "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoStatus", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoStatus", (List<TrackingEvents>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoStatus", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TrackingEvents trackingEvents0 = new TrackingEvents(false, "3C))f+8}}}", "");
      List<TrackingEvents> list0 = List.of(trackingEvents0, trackingEvents0, trackingEvents0, trackingEvents0);
      CargoStatus cargoStatus0 = new CargoStatus((String) null, "qr`&F", (String) null, true, "qr`&F", "3C))f+8}}}", list0);
      String string0 = cargoStatus0.getStatusText();
      assertEquals("3C))f+8}}}", cargoStatus0.getNextExpectedActivity());
      assertEquals("qr`&F", cargoStatus0.getEta());
      assertEquals("qr`&F", cargoStatus0.getDestination());
      assertNull(string0);
      assertTrue(cargoStatus0.isMisdirected());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("", "", ")3x^", true, ")3x^", (String) null, linkedList0);
      boolean boolean0 = cargoStatus0.isMisdirected();
      assertEquals(")3x^", cargoStatus0.getStatusText());
      assertTrue(boolean0);
      assertEquals(")3x^", cargoStatus0.getEta());
      assertEquals("", cargoStatus0.getTrackingId());
      assertEquals("", cargoStatus0.getDestination());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("", "", ")3x^", true, ")3x^", (String) null, linkedList0);
      String string0 = cargoStatus0.getNextExpectedActivity();
      assertNull(string0);
      assertTrue(cargoStatus0.isMisdirected());
      assertEquals(")3x^", cargoStatus0.getStatusText());
      assertEquals("", cargoStatus0.getDestination());
      assertEquals("", cargoStatus0.getTrackingId());
      assertEquals(")3x^", cargoStatus0.getEta());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("", "", ")3x^", true, ")3x^", (String) null, linkedList0);
      String string0 = cargoStatus0.getTrackingId();
      assertEquals("", string0);
      assertTrue(cargoStatus0.isMisdirected());
      assertNotNull(string0);
      assertEquals("", cargoStatus0.getDestination());
      assertEquals(")3x^", cargoStatus0.getEta());
      assertEquals(")3x^", cargoStatus0.getStatusText());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("", "", ")3x^", true, ")3x^", (String) null, linkedList0);
      cargoStatus0.getEvents();
      assertTrue(cargoStatus0.isMisdirected());
      assertEquals(")3x^", cargoStatus0.getStatusText());
      assertEquals(")3x^", cargoStatus0.getEta());
      assertEquals("", cargoStatus0.getTrackingId());
      assertEquals("", cargoStatus0.getDestination());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("", "", ")3x^", true, ")3x^", (String) null, linkedList0);
      String string0 = cargoStatus0.getEta();
      assertNotNull(string0);
      assertTrue(cargoStatus0.isMisdirected());
      assertEquals(")3x^", string0);
      assertEquals("", cargoStatus0.getTrackingId());
      assertEquals("", cargoStatus0.getDestination());
      assertEquals(")3x^", cargoStatus0.getStatusText());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<TrackingEvents> linkedList0 = new LinkedList<TrackingEvents>();
      CargoStatus cargoStatus0 = new CargoStatus("Ho}])_[})&", "Ho}])_[})&", "Ho}])_[})&", true, "Ho}])_[})&", "Ho}])_[})&", linkedList0);
      cargoStatus0.getDestination();
      assertTrue(cargoStatus0.isMisdirected());
  }
}