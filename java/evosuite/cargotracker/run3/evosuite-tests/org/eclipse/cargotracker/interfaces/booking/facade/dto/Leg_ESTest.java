/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:08:05 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Location;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.MockLocalTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Leg_ESTest extends Leg_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Leg leg0 = null;
      try {
        leg0 = new Leg("Vx8TC", (Location) null, (Location) null, localDateTime0, (LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.application.util.DateConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Location location0 = new Location("", "");
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3611);
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Leg leg0 = new Leg("", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.toString();
      assertEquals("Leg{voyageNumber=, from=, to=, loadTime=2/14/2014 9:21 PM, unloadTime=2/14/2014 9:21 PM}", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.application.util.DateConverter", "org.eclipse.cargotracker.application.util.DateConverter");
      ZoneId zoneId0 = ZoneId.systemDefault();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(zoneId0);
      Leg leg0 = new Leg("org.eclipse.cargotracker.application.util.DateConverter", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getVoyageNumber();
      assertEquals("org.eclipse.cargotracker.application.util.DateConverter", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Location location0 = new Location("", "");
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Leg leg0 = new Leg("", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getVoyageNumber();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Location location0 = new Location((String) null, "'C^)GY&");
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getToUnLocode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Location location0 = new Location("", "");
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3611);
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Leg leg0 = new Leg("", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getToUnLocode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.application.util.DateConverter", "org.eclipse.cargotracker.application.util.DateConverter");
      ZoneId zoneId0 = ZoneId.systemDefault();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(zoneId0);
      Leg leg0 = new Leg("org.eclipse.cargotracker.application.util.DateConverter", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getToName();
      assertEquals("org.eclipse.cargotracker.application.util.DateConverter", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Location location0 = new Location("", "");
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3611);
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Leg leg0 = new Leg("", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getToName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      LocalTime localTime0 = MockLocalTime.ofNanoOfDay(0L);
      LocalDateTime localDateTime0 = MockLocalDateTime.of(localDate0, localTime0);
      Location location0 = new Location((String) null, (String) null);
      Leg leg0 = new Leg(" g##Npql;>.=", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFromUnLocode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Location location0 = new Location("", "");
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3611);
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Leg leg0 = new Leg("", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFromUnLocode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", " g##Npql;>.=");
      LocalDate localDate0 = MockLocalDate.now();
      LocalTime localTime0 = MockLocalTime.ofNanoOfDay(0L);
      LocalDateTime localDateTime0 = MockLocalDateTime.of(localDate0, localTime0);
      Leg leg0 = new Leg((String) null, location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFromName();
      assertEquals(" g##Npql;>.=", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Location location0 = new Location("", "");
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(3611);
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Leg leg0 = new Leg("", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFromName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("V82dtAw", (Location) null, (Location) null, localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        leg0.getToUnLocode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("V82dtAw", (Location) null, (Location) null, localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        leg0.getToName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("org.eclipse.cargotracker.application.util.DateConverter", (Location) null, (Location) null, localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        leg0.getTo();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.application.util.DateConverter", "org.eclipse.cargotracker.application.util.DateConverter");
      ZoneId zoneId0 = ZoneId.systemDefault();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(zoneId0);
      Leg leg0 = new Leg("org.eclipse.cargotracker.application.util.DateConverter", (Location) null, location0, localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        leg0.getFromUnLocode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("org.eclipse.cargotracker.application.util.DateConverter", (Location) null, (Location) null, localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        leg0.getFromName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("H@^i`", (Location) null, (Location) null, localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        leg0.getFrom();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", " g##Npql;>.=");
      LocalDate localDate0 = MockLocalDate.now();
      LocalTime localTime0 = MockLocalTime.ofNanoOfDay(0L);
      LocalDateTime localDateTime0 = MockLocalDateTime.of(localDate0, localTime0);
      Leg leg0 = new Leg((String) null, location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getVoyageNumber();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Location location0 = new Location("7w>EcIL", (String) null);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getTo();
      assertEquals("null (7w>EcIL)", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", " g##Npql;>.=");
      LocalDate localDate0 = MockLocalDate.now();
      LocalTime localTime0 = MockLocalTime.ofNanoOfDay(0L);
      LocalDateTime localDateTime0 = MockLocalDateTime.of(localDate0, localTime0);
      Leg leg0 = new Leg((String) null, location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFromUnLocode();
      assertEquals("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("o_+O2e", (Location) null, (Location) null, localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        leg0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Location location0 = new Location("7w>EcIL", (String) null);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFrom();
      assertEquals("null (7w>EcIL)", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Location location0 = new Location("7w>EcIL", (String) null);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getUnloadTime();
      assertEquals("2/14/2014 8:21 PM", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Location location0 = new Location("7w>EcIL", (String) null);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getLoadTime();
      assertEquals("2/14/2014 8:21 PM", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", "org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg");
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getToUnLocode();
      assertEquals("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Location location0 = new Location("", (String) null);
      Instant instant0 = MockInstant.ofEpochSecond((-1L));
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = MockLocalDateTime.ofInstant(instant0, zoneOffset0);
      Leg leg0 = new Leg(")=y(hD", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getToName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Location location0 = new Location("7w>EcIL", (String) null);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFromName();
      assertNull(string0);
  }
}
