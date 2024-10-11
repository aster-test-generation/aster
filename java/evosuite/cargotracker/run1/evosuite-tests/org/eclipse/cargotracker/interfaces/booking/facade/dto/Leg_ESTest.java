/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:07:38 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Location;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Leg_ESTest extends Leg_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.Location", "");
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = null;
      try {
        leg0 = new Leg("", location0, location0, localDateTime0, (LocalDateTime) null);
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
      Location location0 = new Location("|v", "|v");
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg((String) null, location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getVoyageNumber();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.Location", "");
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Leg leg0 = new Leg("", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getVoyageNumber();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Location location0 = new Location("kTRw(,8nte9~aOFE", "kTRw(,8nte9~aOFE");
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("kTRw(,8nte9~aOFE", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getToUnLocode();
      assertEquals("kTRw(,8nte9~aOFE", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Location location0 = new Location("", "");
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Leg leg0 = new Leg("org.eclipse.cargotracker.application.util.DateConverter", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getToUnLocode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Location location0 = new Location("kTRw(,8nte9~aOFE", "kTRw(,8nte9~aOFE");
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("kTRw(,8nte9~aOFE", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getToName();
      assertEquals("kTRw(,8nte9~aOFE", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Location location0 = new Location("", "");
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Leg leg0 = new Leg("org.eclipse.cargotracker.application.util.DateConverter", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getToName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Location location0 = new Location(",gHIEByJigRk6S]!", ",gHIEByJigRk6S]!");
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg(",gHIEByJigRk6S]!", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getTo();
      assertEquals(",gHIEByJigRk6S]! (,gHIEByJigRk6S]!)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Location location0 = new Location("kTRw(,8nte9~aOFE", "kTRw(,8nte9~aOFE");
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("kTRw(,8nte9~aOFE", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFromUnLocode();
      assertEquals("kTRw(,8nte9~aOFE", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Location location0 = new Location("", (String) null);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("D}MEqy/^SyL:3DM*o!", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFromUnLocode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Location location0 = new Location("kTRw(,8nte9~aOFE", "kTRw(,8nte9~aOFE");
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("kTRw(,8nte9~aOFE", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFromName();
      assertEquals("kTRw(,8nte9~aOFE", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.Location", "");
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Leg leg0 = new Leg("org.eclipse.cargotracker.interfaces.booking.facade.dto.Location", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFromName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("", (Location) null, (Location) null, localDateTime0, localDateTime0);
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
  public void test13()  throws Throwable  {
      Location location0 = new Location("!", "!");
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("!", location0, (Location) null, localDateTime0, localDateTime0);
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
      Leg leg0 = new Leg("|v", (Location) null, (Location) null, localDateTime0, localDateTime0);
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
  public void test15()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("", (Location) null, (Location) null, localDateTime0, localDateTime0);
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
  public void test16()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.Location", "");
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      Leg leg0 = new Leg("org.eclipse.cargotracker.interfaces.booking.facade.dto.Location", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getVoyageNumber();
      assertEquals("org.eclipse.cargotracker.interfaces.booking.facade.dto.Location", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("M/d/yyyy h:m a", (Location) null, (Location) null, localDateTime0, localDateTime0);
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
  public void test18()  throws Throwable  {
      Location location0 = new Location((String) null, (String) null);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = MockLocalDateTime.ofEpochSecond(2836L, 0, zoneOffset0);
      Leg leg0 = new Leg((String) null, location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFromUnLocode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Location location0 = new Location((String) null, (String) null);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = MockLocalDateTime.ofEpochSecond(2836L, 0, zoneOffset0);
      Leg leg0 = new Leg((String) null, location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.toString();
      assertEquals("Leg{voyageNumber=null, from=null, to=null, loadTime=1/1/1970 12:47 AM, unloadTime=1/1/1970 12:47 AM}", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Location location0 = new Location((String) null, (String) null);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = MockLocalDateTime.ofEpochSecond(2836L, 0, zoneOffset0);
      Leg leg0 = new Leg((String) null, location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFrom();
      assertEquals("null (null)", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Location location0 = new Location((String) null, (String) null);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = MockLocalDateTime.ofEpochSecond(2836L, 0, zoneOffset0);
      Leg leg0 = new Leg((String) null, location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getUnloadTime();
      assertEquals("1/1/1970 12:47 AM", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Location location0 = new Location((String) null, (String) null);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = MockLocalDateTime.ofEpochSecond(2836L, 0, zoneOffset0);
      Leg leg0 = new Leg((String) null, location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getLoadTime();
      assertEquals("1/1/1970 12:47 AM", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Location location0 = new Location((String) null, (String) null);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = MockLocalDateTime.ofEpochSecond(2836L, 0, zoneOffset0);
      Leg leg0 = new Leg((String) null, location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getToUnLocode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Location location0 = new Location("", (String) null);
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("D}MEqy/^SyL:3DM*o!", location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getToName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Location location0 = new Location((String) null, (String) null);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = MockLocalDateTime.ofEpochSecond(2836L, 0, zoneOffset0);
      Leg leg0 = new Leg((String) null, location0, location0, localDateTime0, localDateTime0);
      String string0 = leg0.getFromName();
      assertNull(string0);
  }
}