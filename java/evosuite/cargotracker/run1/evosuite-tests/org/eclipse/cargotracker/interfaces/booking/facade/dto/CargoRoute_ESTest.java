/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:10:09 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.IsoChronology;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Location;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CargoRoute_ESTest extends CargoRoute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Location location0 = new Location("?aOvo_E^M6B", "M/d/yyyy");
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-2388L));
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      Location location1 = new Location("VoS[aq<9~3374W*.", "");
      CargoRoute cargoRoute0 = new CargoRoute("org.eclipse.cargotracker.application.util.DateConverter", location1, location0, localDate0, false, true, location1, "M/d/yyyy", linkedList0);
      assertTrue(cargoRoute0.isClaimed());
      assertEquals("M/d/yyyy", cargoRoute0.getTransportStatus());
      assertEquals("org.eclipse.cargotracker.application.util.DateConverter", cargoRoute0.getTrackingId());
      assertFalse(cargoRoute0.isMisrouted());
      assertEquals(" (VoS[aq<9~3374W*.)", cargoRoute0.getOrigin());
      assertEquals("?aOvo_E^M6B", cargoRoute0.getFinalDestinationCode());
      assertEquals(" (VoS[aq<9~3374W*.)", cargoRoute0.getLastKnownLocation());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Location location0 = new Location("?aOvo_E^M6B", "M/d/yyyy");
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-2388L));
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("org.eclipse.cargotracker.application.util.DateConverter", location0, location0, localDate0, false, true, location0, "M/d/yyyy", linkedList0);
      boolean boolean0 = cargoRoute0.isMisrouted();
      assertFalse(boolean0);
      assertTrue(cargoRoute0.isClaimed());
      assertEquals("M/d/yyyy", cargoRoute0.getTransportStatus());
      assertEquals("org.eclipse.cargotracker.application.util.DateConverter", cargoRoute0.getTrackingId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-806L));
      List<Leg> list0 = List.of();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy h:m a", (Location) null, (Location) null, localDate0, true, false, (Location) null, "", list0);
      boolean boolean0 = cargoRoute0.isClaimed();
      assertFalse(boolean0);
      assertTrue(cargoRoute0.isMisrouted());
      assertEquals("M/d/yyyy h:m a", cargoRoute0.getTrackingId());
      assertEquals("", cargoRoute0.getTransportStatus());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg");
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy h:m a", location0, location0, localDate0, true, false, location0, (String) null, linkedList0);
      String string0 = cargoRoute0.getTransportStatus();
      assertTrue(cargoRoute0.isMisrouted());
      assertNull(string0);
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      List<Leg> list0 = List.of();
      CargoRoute cargoRoute0 = new CargoRoute(":)'qOmP0", (Location) null, (Location) null, localDate0, false, false, (Location) null, "", list0);
      String string0 = cargoRoute0.getTransportStatus();
      assertEquals("", string0);
      assertFalse(cargoRoute0.isClaimed());
      assertFalse(cargoRoute0.isMisrouted());
      assertEquals(":)'qOmP0", cargoRoute0.getTrackingId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Location location0 = new Location("2YW{1ax2vb#Js|,~R)", (String) null);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute((String) null, location0, location0, localDate0, false, false, location0, "z'A7!vNf:-I+U]o8|", linkedList0);
      String string0 = cargoRoute0.getTrackingId();
      assertNull(string0);
      assertFalse(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Location location0 = new Location("", "");
      Period period0 = Period.of(0, 577, 577);
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, false, false, location0, "", linkedList0);
      cargoRoute0.getTrackingId();
      assertFalse(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Location location0 = new Location("", "M/d/yyyy");
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      CargoRoute cargoRoute0 = new CargoRoute("KJR|3v ", location0, location0, localDate0, true, false, location0, "q-m&", linkedList0);
      cargoRoute0.getOriginName();
      assertEquals("KJR|3v ", cargoRoute0.getTrackingId());
      assertTrue(cargoRoute0.isMisrouted());
      assertEquals("q-m&", cargoRoute0.getTransportStatus());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Location location0 = new Location("?aOvo_E^M6B", "M/d/yyyy");
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-2388L));
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      Location location1 = new Location("VoS[aq<9~3374W*.", "");
      CargoRoute cargoRoute0 = new CargoRoute("[=X0\"3I", location1, location1, localDate0, true, true, location0, "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", linkedList0);
      String string0 = cargoRoute0.getOriginName();
      assertEquals("[=X0\"3I", cargoRoute0.getTrackingId());
      assertEquals("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", cargoRoute0.getTransportStatus());
      assertTrue(cargoRoute0.isClaimed());
      assertEquals("", string0);
      assertTrue(cargoRoute0.isMisrouted());
      assertEquals("M/d/yyyy (?aOvo_E^M6B)", cargoRoute0.getLastKnownLocation());
      assertEquals("VoS[aq<9~3374W*.", cargoRoute0.getFinalDestinationCode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Location location0 = new Location((String) null, "e&MGK0]Hc:75*kup-q#");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(887L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, true, true, location0, "", linkedList0);
      cargoRoute0.getOriginCode();
      assertTrue(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Location location0 = new Location("", "M/d/yyyy");
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      CargoRoute cargoRoute0 = new CargoRoute("KJR|3v ", location0, location0, localDate0, true, false, location0, "q-m&", linkedList0);
      cargoRoute0.getOriginCode();
      assertFalse(cargoRoute0.isClaimed());
      assertEquals("q-m&", cargoRoute0.getTransportStatus());
      assertTrue(cargoRoute0.isMisrouted());
      assertEquals("KJR|3v ", cargoRoute0.getTrackingId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Location location0 = new Location("?aOvo_E^M6B", "Wq0.sUIO )/}b9Ah0B");
      Period period0 = Period.of(46, (-2942), (-2942));
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      List<Leg> list0 = List.of();
      CargoRoute cargoRoute0 = new CargoRoute("?aOvo_E^M6B", location0, location0, localDate0, true, true, location0, "Wq0.sUIO )/}b9Ah0B", list0);
      cargoRoute0.getLastKnownLocationName();
      assertTrue(cargoRoute0.isClaimed());
      assertTrue(cargoRoute0.isMisrouted());
      assertEquals("Wq0.sUIO )/}b9Ah0B", cargoRoute0.getTransportStatus());
      assertEquals("?aOvo_E^M6B", cargoRoute0.getTrackingId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Location location0 = new Location("", "");
      Period period0 = Period.of(0, 577, 577);
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, false, false, location0, "", linkedList0);
      cargoRoute0.getLastKnownLocationName();
      assertFalse(cargoRoute0.isClaimed());
      assertFalse(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Location location0 = new Location((String) null, "%DqU");
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute((String) null, location0, location0, localDate0, false, false, location0, "", linkedList0);
      cargoRoute0.getLastKnownLocationCode();
      assertFalse(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Location location0 = new Location("", "M/d/yyyy");
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      CargoRoute cargoRoute0 = new CargoRoute("KJR|3v ", location0, location0, localDate0, true, false, location0, "q-m&", linkedList0);
      cargoRoute0.getLastKnownLocationCode();
      assertFalse(cargoRoute0.isClaimed());
      assertEquals("q-m&", cargoRoute0.getTransportStatus());
      assertEquals("KJR|3v ", cargoRoute0.getTrackingId());
      assertTrue(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Location location0 = new Location("Evf", (String) null);
      Period period0 = Period.ofDays(1261);
      IsoChronology isoChronology0 = period0.getChronology();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-1));
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0, (ZoneId) zoneOffset0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("Z&^U/V2l", location0, location0, localDate0, false, false, location0, "+\"BO,-(NJJ|bl", linkedList0);
      cargoRoute0.getFinalDestinationName();
      assertEquals("Z&^U/V2l", cargoRoute0.getTrackingId());
      assertEquals("+\"BO,-(NJJ|bl", cargoRoute0.getTransportStatus());
      assertFalse(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Location location0 = new Location("", "");
      Period period0 = Period.of(0, 577, 577);
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, false, false, location0, "", linkedList0);
      cargoRoute0.getFinalDestinationName();
      assertFalse(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Location location0 = new Location((String) null, "e&MGK0]Hc:75*kup-q#");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(887L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, true, true, location0, "", linkedList0);
      cargoRoute0.getFinalDestinationCode();
      assertTrue(cargoRoute0.isClaimed());
      assertTrue(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Location location0 = new Location("", "M/d/yyyy");
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      CargoRoute cargoRoute0 = new CargoRoute("KJR|3v ", location0, location0, localDate0, true, false, location0, "q-m&", linkedList0);
      cargoRoute0.getFinalDestinationCode();
      assertEquals("q-m&", cargoRoute0.getTransportStatus());
      assertEquals("KJR|3v ", cargoRoute0.getTrackingId());
      assertTrue(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("Yk5u#*~7lXHd", (Location) null, (Location) null, localDate0, true, true, (Location) null, "Yk5u#*~7lXHd", linkedList0);
      // Undeclared exception!
      try { 
        cargoRoute0.getOriginName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-806L));
      List<Leg> list0 = List.of();
      CargoRoute cargoRoute0 = new CargoRoute("", (Location) null, (Location) null, localDate0, false, false, (Location) null, "", list0);
      // Undeclared exception!
      try { 
        cargoRoute0.getOriginCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("pm w3T=pn=t)S%6", (Location) null, (Location) null, localDate0, false, false, (Location) null, "pm w3T=pn=t)S%6", linkedList0);
      // Undeclared exception!
      try { 
        cargoRoute0.getOrigin();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-806L));
      List<Leg> list0 = List.of();
      CargoRoute cargoRoute0 = new CargoRoute("", (Location) null, (Location) null, localDate0, true, true, (Location) null, "", list0);
      // Undeclared exception!
      try { 
        cargoRoute0.getLastKnownLocationName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-806L));
      List<Leg> list0 = List.of();
      CargoRoute cargoRoute0 = new CargoRoute("", (Location) null, (Location) null, localDate0, false, false, (Location) null, "", list0);
      // Undeclared exception!
      try { 
        cargoRoute0.getLastKnownLocationCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      List<Leg> list0 = List.of();
      CargoRoute cargoRoute0 = new CargoRoute("Uf0$J!F7$:_", (Location) null, (Location) null, localDate0, false, false, (Location) null, "Uf0$J!F7$:_", list0);
      // Undeclared exception!
      try { 
        cargoRoute0.getLastKnownLocation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-806L));
      List<Leg> list0 = List.of();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy h:m a", (Location) null, (Location) null, localDate0, true, false, (Location) null, "", list0);
      // Undeclared exception!
      try { 
        cargoRoute0.getFinalDestinationCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("u", (Location) null, (Location) null, localDate0, false, false, (Location) null, "u", linkedList0);
      // Undeclared exception!
      try { 
        cargoRoute0.getFinalDestination();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      CargoRoute cargoRoute0 = null;
      try {
        cargoRoute0 = new CargoRoute("Jf", (Location) null, (Location) null, localDate0, false, false, (Location) null, "Jf", (List<Leg>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Location location0 = new Location("M/d/yyyy h:m a", "M/d/yyyy");
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy", location0, location0, localDate0, true, true, location0, "M/d/yyyy h:m a", linkedList0);
      boolean boolean0 = cargoRoute0.isRouted();
      assertFalse(boolean0);
      assertEquals("M/d/yyyy", cargoRoute0.getTrackingId());
      assertEquals("M/d/yyyy h:m a", cargoRoute0.getTransportStatus());
      assertTrue(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      linkedList0.push((Leg) null);
      CargoRoute cargoRoute0 = new CargoRoute("Uf0$J!F7$:_", (Location) null, (Location) null, localDate0, true, true, (Location) null, "Uf0$J!F7$:_", linkedList0);
      boolean boolean0 = cargoRoute0.isRouted();
      assertTrue(boolean0);
      assertTrue(cargoRoute0.isClaimed());
      assertTrue(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Location location0 = new Location("Evf", (String) null);
      Period period0 = Period.ofDays(1261);
      IsoChronology isoChronology0 = period0.getChronology();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-1));
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0, (ZoneId) zoneOffset0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("Z&^U/V2l", location0, location0, localDate0, false, false, location0, "+\"BO,-(NJJ|bl", linkedList0);
      cargoRoute0.getLastKnownLocationName();
      assertEquals("Z&^U/V2l", cargoRoute0.getTrackingId());
      assertEquals("+\"BO,-(NJJ|bl", cargoRoute0.getTransportStatus());
      assertFalse(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Location location0 = new Location("Evf", (String) null);
      Period period0 = Period.ofDays(1261);
      IsoChronology isoChronology0 = period0.getChronology();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-1));
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0, (ZoneId) zoneOffset0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("Z&^U/V2l", location0, location0, localDate0, false, false, location0, "+\"BO,-(NJJ|bl", linkedList0);
      String string0 = cargoRoute0.getTrackingId();
      assertEquals("Z&^U/V2l", string0);
      assertFalse(cargoRoute0.isClaimed());
      assertEquals("+\"BO,-(NJJ|bl", cargoRoute0.getTransportStatus());
      assertFalse(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Location location0 = new Location("M/d/yyyy h:m a", "M/d/yyyy");
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy", location0, location0, localDate0, true, true, location0, "M/d/yyyy h:m a", linkedList0);
      cargoRoute0.getFinalDestinationCode();
      assertEquals("M/d/yyyy", cargoRoute0.getTrackingId());
      assertTrue(cargoRoute0.isClaimed());
      assertTrue(cargoRoute0.isMisrouted());
      assertEquals("M/d/yyyy h:m a", cargoRoute0.getTransportStatus());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Location location0 = new Location("M/d/yyyy h:m a", "M/d/yyyy");
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy", location0, location0, localDate0, true, true, location0, "M/d/yyyy h:m a", linkedList0);
      cargoRoute0.getOriginCode();
      assertTrue(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
      assertEquals("M/d/yyyy h:m a", cargoRoute0.getTransportStatus());
      assertEquals("M/d/yyyy", cargoRoute0.getTrackingId());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Location location0 = new Location("?aOvo_E^M6B", "Wq0.sUIO )/}b9Ah0B");
      Period period0 = Period.of(46, (-2942), (-2942));
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      List<Leg> list0 = List.of();
      CargoRoute cargoRoute0 = new CargoRoute("?aOvo_E^M6B", location0, location0, localDate0, true, true, location0, "Wq0.sUIO )/}b9Ah0B", list0);
      boolean boolean0 = cargoRoute0.isClaimed();
      assertEquals("Wq0.sUIO )/}b9Ah0B", cargoRoute0.getTransportStatus());
      assertEquals("?aOvo_E^M6B", cargoRoute0.getTrackingId());
      assertTrue(cargoRoute0.isMisrouted());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Location location0 = new Location("Evf", (String) null);
      Period period0 = Period.ofDays(1261);
      IsoChronology isoChronology0 = period0.getChronology();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-1));
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0, (ZoneId) zoneOffset0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("Z&^U/V2l", location0, location0, localDate0, false, false, location0, "+\"BO,-(NJJ|bl", linkedList0);
      cargoRoute0.getArrivalDeadline();
      assertFalse(cargoRoute0.isClaimed());
      assertFalse(cargoRoute0.isMisrouted());
      assertEquals("+\"BO,-(NJJ|bl", cargoRoute0.getTransportStatus());
      assertEquals("Z&^U/V2l", cargoRoute0.getTrackingId());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Location location0 = new Location("M/d/yyyy h:m a", "M/d/yyyy");
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy", location0, location0, localDate0, true, true, location0, "M/d/yyyy h:m a", linkedList0);
      cargoRoute0.getFinalDestination();
      assertEquals("M/d/yyyy", cargoRoute0.getTrackingId());
      assertTrue(cargoRoute0.isClaimed());
      assertTrue(cargoRoute0.isMisrouted());
      assertEquals("M/d/yyyy h:m a", cargoRoute0.getTransportStatus());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Location location0 = new Location("M/d/yyyy h:m a", "M/d/yyyy");
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy", location0, location0, localDate0, true, true, location0, "M/d/yyyy h:m a", linkedList0);
      cargoRoute0.getOrigin();
      assertEquals("M/d/yyyy h:m a", cargoRoute0.getTransportStatus());
      assertTrue(cargoRoute0.isClaimed());
      assertEquals("M/d/yyyy", cargoRoute0.getTrackingId());
      assertTrue(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Location location0 = new Location("M/d/yyyy", (String) null);
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-2388L));
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("R*`Gb3@", location0, location0, localDate0, true, true, location0, "R*`Gb3@", linkedList0);
      cargoRoute0.getNextLocation();
      assertTrue(cargoRoute0.isClaimed());
      assertTrue(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Location location0 = new Location("M/d/yyyy", (String) null);
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-2388L));
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("R*`Gb3@", location0, location0, localDate0, true, true, location0, "R*`Gb3@", linkedList0);
      cargoRoute0.getTransportStatus();
      assertTrue(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Location location0 = new Location("M/d/yyyy", (String) null);
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-2388L));
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("R*`Gb3@", location0, location0, localDate0, true, true, location0, "R*`Gb3@", linkedList0);
      cargoRoute0.getLastKnownLocationCode();
      assertTrue(cargoRoute0.isClaimed());
      assertTrue(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Location location0 = new Location("M/d/yyyy h:m a", "M/d/yyyy");
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy", location0, location0, localDate0, true, true, location0, "M/d/yyyy h:m a", linkedList0);
      cargoRoute0.getLastKnownLocation();
      assertTrue(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
      assertEquals("M/d/yyyy h:m a", cargoRoute0.getTransportStatus());
      assertEquals("M/d/yyyy", cargoRoute0.getTrackingId());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Location location0 = new Location("2YW{1ax2vb#Js|,~R)", (String) null);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute((String) null, location0, location0, localDate0, false, false, location0, "z'A7!vNf:-I+U]o8|", linkedList0);
      cargoRoute0.getLegs();
      assertFalse(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Location location0 = new Location("M/d/yyyy h:m a", "M/d/yyyy");
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy", location0, location0, localDate0, true, true, location0, "M/d/yyyy h:m a", linkedList0);
      cargoRoute0.getFinalDestinationName();
      assertEquals("M/d/yyyy", cargoRoute0.getTrackingId());
      assertEquals("M/d/yyyy h:m a", cargoRoute0.getTransportStatus());
      assertTrue(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Location location0 = new Location("2YW{1ax2vb#Js|,~R)", (String) null);
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute((String) null, location0, location0, localDate0, false, false, location0, "z'A7!vNf:-I+U]o8|", linkedList0);
      cargoRoute0.getOriginName();
      assertFalse(cargoRoute0.isClaimed());
      assertFalse(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Location location0 = new Location("M/d/yyyy", (String) null);
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-2388L));
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("R*`Gb3@", location0, location0, localDate0, true, true, location0, "R*`Gb3@", linkedList0);
      boolean boolean0 = cargoRoute0.isMisrouted();
      assertTrue(boolean0);
      assertTrue(cargoRoute0.isClaimed());
  }
}