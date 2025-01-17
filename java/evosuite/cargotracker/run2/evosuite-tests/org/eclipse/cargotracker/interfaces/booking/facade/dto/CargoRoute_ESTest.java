/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:10:37 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Location;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.MockOffsetDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CargoRoute_ESTest extends CargoRoute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Location location0 = new Location("", "-T~Q?Lb+_=,j]j}:O|");
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy h:m a", location0, location0, localDate0, true, false, location0, "", linkedList0);
      boolean boolean0 = cargoRoute0.isMisrouted();
      assertFalse(cargoRoute0.isClaimed());
      assertTrue(boolean0);
      assertEquals("", cargoRoute0.getTransportStatus());
      assertEquals("M/d/yyyy h:m a", cargoRoute0.getTrackingId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Location location0 = new Location("i+Ooa}z<xu*k`", "i+Ooa}z<xu*k`");
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      Clock clock0 = Clock.tickMillis(zoneOffset0);
      LocalDate localDate0 = MockLocalDate.now(clock0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      Leg leg0 = new Leg("h6P+1y", location0, location0, localDateTime0, localDateTime0);
      List<Leg> list0 = List.of(leg0, leg0);
      CargoRoute cargoRoute0 = new CargoRoute("i+Ooa}z<xu*k`", location0, location0, localDate0, true, false, location0, "i+Ooa}z<xu*k`", list0);
      boolean boolean0 = cargoRoute0.isClaimed();
      assertFalse(boolean0);
      assertTrue(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1075L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", location0, location0, localDate0, false, true, location0, (String) null, linkedList0);
      String string0 = cargoRoute0.getTransportStatus();
      assertFalse(cargoRoute0.isMisrouted());
      assertNull(string0);
      assertTrue(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Location location0 = new Location("", "");
      OffsetDateTime offsetDateTime0 = MockOffsetDateTime.now();
      LocalDate localDate0 = MockLocalDate.from(offsetDateTime0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, false, false, location0, "", linkedList0);
      cargoRoute0.getTransportStatus();
      assertFalse(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Location location0 = new Location("", "HS,glW4ysn");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(3050L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute((String) null, location0, location0, localDate0, true, true, location0, "", linkedList0);
      String string0 = cargoRoute0.getTrackingId();
      assertTrue(cargoRoute0.isClaimed());
      assertNull(string0);
      assertTrue(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Location location0 = new Location("", "");
      LocalDate localDate0 = MockLocalDate.now();
      List<Leg> list0 = List.of();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, true, true, location0, "", list0);
      cargoRoute0.getTrackingId();
      assertTrue(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Location location0 = new Location("AO*#K:UeD!!zX/Y?ID", (String) null);
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("gi", location0, location0, localDate0, false, true, location0, "org.eclipse.cargotracker.interfaces.booking.facade.dto.Location", linkedList0);
      cargoRoute0.getOriginName();
      assertTrue(cargoRoute0.isClaimed());
      assertEquals("gi", cargoRoute0.getTrackingId());
      assertEquals("org.eclipse.cargotracker.interfaces.booking.facade.dto.Location", cargoRoute0.getTransportStatus());
      assertFalse(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Location location0 = new Location("", "HS,glW4ysn");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(3050L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy", location0, location0, localDate0, true, false, location0, "WC@5e&SG?M~=", linkedList0);
      cargoRoute0.getOriginName();
      assertTrue(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Location location0 = new Location("", "");
      OffsetDateTime offsetDateTime0 = MockOffsetDateTime.now();
      LocalDate localDate0 = MockLocalDate.from(offsetDateTime0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, false, false, location0, "", linkedList0);
      cargoRoute0.getOriginName();
      assertFalse(cargoRoute0.isClaimed());
      assertFalse(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      Location location1 = new Location((String) null, "");
      CargoRoute cargoRoute0 = new CargoRoute("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", location1, location0, localDate0, false, true, location0, "a]a}(ty|<YGe+", linkedList0);
      String string0 = cargoRoute0.getOriginCode();
      assertTrue(cargoRoute0.isClaimed());
      assertEquals("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", cargoRoute0.getTrackingId());
      assertNull(string0);
      assertEquals("a]a}(ty|<YGe+", cargoRoute0.getTransportStatus());
      assertFalse(cargoRoute0.isMisrouted());
      assertEquals("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", cargoRoute0.getFinalDestinationName());
      assertEquals("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", cargoRoute0.getLastKnownLocationName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Location location0 = new Location("", "HS,glW4ysn");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(3050L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy", location0, location0, localDate0, true, false, location0, "WC@5e&SG?M~=", linkedList0);
      cargoRoute0.getOriginCode();
      assertFalse(cargoRoute0.isClaimed());
      assertTrue(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      Location location0 = new Location("rX7t]&*", (String) null);
      CargoRoute cargoRoute0 = new CargoRoute("p?=vWwBuFJ|", location0, location0, localDate0, false, false, location0, "rX7t]&*", linkedList0);
      cargoRoute0.getLastKnownLocationName();
      assertEquals("p?=vWwBuFJ|", cargoRoute0.getTrackingId());
      assertEquals("rX7t]&*", cargoRoute0.getTransportStatus());
      assertFalse(cargoRoute0.isClaimed());
      assertFalse(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Location location0 = new Location("", "");
      OffsetDateTime offsetDateTime0 = MockOffsetDateTime.now();
      LocalDate localDate0 = MockLocalDate.from(offsetDateTime0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, false, false, location0, "", linkedList0);
      cargoRoute0.getLastKnownLocationName();
      assertFalse(cargoRoute0.isClaimed());
      assertFalse(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Location location0 = new Location((String) null, "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute((String) null, location0, location0, localDate0, false, false, location0, "", linkedList0);
      cargoRoute0.getLastKnownLocationCode();
      assertFalse(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Location location0 = new Location("", "HS,glW4ysn");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(3050L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("M/d/yyyy", location0, location0, localDate0, true, false, location0, "WC@5e&SG?M~=", linkedList0);
      cargoRoute0.getLastKnownLocationCode();
      assertTrue(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Location location0 = new Location("", (String) null);
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("qi*J@KGi", location0, location0, localDate0, false, true, location0, "", linkedList0);
      cargoRoute0.getFinalDestinationName();
      assertEquals("qi*J@KGi", cargoRoute0.getTrackingId());
      assertFalse(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
      assertEquals("", cargoRoute0.getTransportStatus());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Location location0 = new Location("", "");
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, false, false, location0, "", linkedList0);
      cargoRoute0.getFinalDestinationName();
      assertFalse(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Location location0 = new Location("M/d/?yyy 9:mBa", "M/d/?yyy 9:mBa");
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      Location location1 = new Location((String) null, "t_T$!cC+");
      CargoRoute cargoRoute0 = new CargoRoute("v+P;J_}3U I658<", location0, location1, localDate0, false, false, location1, (String) null, linkedList0);
      String string0 = cargoRoute0.getFinalDestinationCode();
      assertFalse(cargoRoute0.isMisrouted());
      assertFalse(cargoRoute0.isClaimed());
      assertEquals("M/d/?yyy 9:mBa (M/d/?yyy 9:mBa)", cargoRoute0.getOrigin());
      assertNull(string0);
      assertEquals("t_T$!cC+ (null)", cargoRoute0.getLastKnownLocation());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Location location0 = new Location("", "");
      OffsetDateTime offsetDateTime0 = MockOffsetDateTime.now();
      LocalDate localDate0 = MockLocalDate.from(offsetDateTime0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, false, false, location0, "", linkedList0);
      cargoRoute0.getFinalDestinationCode();
      assertFalse(cargoRoute0.isClaimed());
      assertFalse(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", (Location) null, (Location) null, localDate0, false, false, (Location) null, "", linkedList0);
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
  public void test20()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", (Location) null, (Location) null, localDate0, true, true, (Location) null, "", linkedList0);
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
  public void test21()  throws Throwable  {
      Location location0 = new Location("", "");
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("8obXhOjO!}Y=FJC(2n", location0, location0, localDate0, true, false, (Location) null, "~lSRcP+#k\"lL", linkedList0);
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
  public void test22()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("=\"_N_e", (Location) null, (Location) null, localDate0, false, false, (Location) null, (String) null, linkedList0);
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
  public void test23()  throws Throwable  {
      Location location0 = new Location("", "");
      LocalDate localDate0 = MockLocalDate.now();
      List<Leg> list0 = List.of();
      CargoRoute cargoRoute0 = new CargoRoute("OTR~!GB", location0, (Location) null, localDate0, false, true, location0, "", list0);
      // Undeclared exception!
      try { 
        cargoRoute0.getFinalDestinationName();
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
      Location location0 = new Location("", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute((String) null, location0, (Location) null, localDate0, true, true, (Location) null, "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", linkedList0);
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
  public void test25()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", (Location) null, (Location) null, localDate0, true, false, (Location) null, "", linkedList0);
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
  public void test26()  throws Throwable  {
      Location location0 = new Location("!9LqNY", "!9LqNY");
      LocalDate localDate0 = MockLocalDate.now();
      CargoRoute cargoRoute0 = null;
      try {
        cargoRoute0 = new CargoRoute("!9LqNY", location0, location0, localDate0, false, true, location0, "!9LqNY", (List<Leg>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("JP", (Location) null, (Location) null, localDate0, false, false, (Location) null, "JP", linkedList0);
      boolean boolean0 = cargoRoute0.isRouted();
      assertFalse(cargoRoute0.isMisrouted());
      assertFalse(boolean0);
      assertFalse(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1075L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      linkedList0.add((Leg) null);
      CargoRoute cargoRoute0 = new CargoRoute("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", location0, location0, localDate0, false, true, location0, (String) null, linkedList0);
      boolean boolean0 = cargoRoute0.isRouted();
      assertTrue(boolean0);
      assertFalse(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Location location0 = new Location("q@{fPR?dcOL", "tX(~]7E");
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("q@{fPR?dcOL", location0, location0, localDate0, true, true, location0, "", linkedList0);
      cargoRoute0.getLastKnownLocationName();
      assertTrue(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
      assertEquals("q@{fPR?dcOL", cargoRoute0.getTrackingId());
      assertEquals("", cargoRoute0.getTransportStatus());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1075L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", location0, location0, localDate0, false, true, location0, (String) null, linkedList0);
      String string0 = cargoRoute0.getTrackingId();
      assertTrue(cargoRoute0.isClaimed());
      assertNotNull(string0);
      assertFalse(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Location location0 = new Location("AO*#K:UeD!!zX/Y?ID", (String) null);
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("7sg8KJU3G>&M'&5<", location0, location0, localDate0, true, true, location0, (String) null, linkedList0);
      cargoRoute0.getFinalDestinationCode();
      assertTrue(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1075L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", location0, location0, localDate0, false, true, location0, (String) null, linkedList0);
      cargoRoute0.getOriginCode();
      assertFalse(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Location location0 = new Location("q@{fPR?dcOL", "tX(~]7E");
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("q@{fPR?dcOL", location0, location0, localDate0, true, true, location0, "", linkedList0);
      boolean boolean0 = cargoRoute0.isClaimed();
      assertTrue(cargoRoute0.isMisrouted());
      assertEquals("", cargoRoute0.getTransportStatus());
      assertTrue(boolean0);
      assertEquals("q@{fPR?dcOL", cargoRoute0.getTrackingId());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1075L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", location0, location0, localDate0, false, true, location0, (String) null, linkedList0);
      cargoRoute0.getArrivalDeadline();
      assertFalse(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1075L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", location0, location0, localDate0, false, true, location0, (String) null, linkedList0);
      cargoRoute0.getFinalDestination();
      assertFalse(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1075L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", location0, location0, localDate0, false, true, location0, (String) null, linkedList0);
      cargoRoute0.getOrigin();
      assertFalse(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Location location0 = new Location("", "");
      OffsetDateTime offsetDateTime0 = MockOffsetDateTime.now();
      LocalDate localDate0 = MockLocalDate.from(offsetDateTime0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, false, false, location0, "", linkedList0);
      cargoRoute0.getNextLocation();
      assertFalse(cargoRoute0.isClaimed());
      assertFalse(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, true, true, location0, "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", linkedList0);
      String string0 = cargoRoute0.getTransportStatus();
      assertEquals("", cargoRoute0.getTrackingId());
      assertTrue(cargoRoute0.isMisrouted());
      assertTrue(cargoRoute0.isClaimed());
      assertEquals("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, true, true, location0, "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", linkedList0);
      cargoRoute0.getLastKnownLocationCode();
      assertTrue(cargoRoute0.isMisrouted());
      assertEquals("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", cargoRoute0.getTransportStatus());
      assertTrue(cargoRoute0.isClaimed());
      assertEquals("", cargoRoute0.getTrackingId());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1075L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", location0, location0, localDate0, false, true, location0, (String) null, linkedList0);
      cargoRoute0.getLastKnownLocation();
      assertTrue(cargoRoute0.isClaimed());
      assertFalse(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1075L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", location0, location0, localDate0, false, true, location0, (String) null, linkedList0);
      cargoRoute0.getLegs();
      assertTrue(cargoRoute0.isClaimed());
      assertFalse(cargoRoute0.isMisrouted());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, true, true, location0, "org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", linkedList0);
      cargoRoute0.getFinalDestinationName();
      assertTrue(cargoRoute0.isMisrouted());
      assertEquals("org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute", cargoRoute0.getTransportStatus());
      assertEquals("", cargoRoute0.getTrackingId());
      assertTrue(cargoRoute0.isClaimed());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("JP", (Location) null, (Location) null, localDate0, false, false, (Location) null, "JP", linkedList0);
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
  public void test44()  throws Throwable  {
      Location location0 = new Location("", "");
      OffsetDateTime offsetDateTime0 = MockOffsetDateTime.now();
      LocalDate localDate0 = MockLocalDate.from(offsetDateTime0);
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      CargoRoute cargoRoute0 = new CargoRoute("", location0, location0, localDate0, false, false, location0, "", linkedList0);
      boolean boolean0 = cargoRoute0.isMisrouted();
      assertFalse(cargoRoute0.isClaimed());
      assertFalse(boolean0);
  }
}
