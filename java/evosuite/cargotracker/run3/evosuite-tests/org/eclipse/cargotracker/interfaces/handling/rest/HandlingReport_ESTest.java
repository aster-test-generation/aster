/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 15:52:34 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.handling.rest;

import org.junit.Test;
import static org.junit.Assert.*;
import org.eclipse.cargotracker.interfaces.handling.rest.HandlingReport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HandlingReport_ESTest extends HandlingReport_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setVoyageNumber("A@2s1%w6zgnIO");
      String string0 = handlingReport0.getVoyageNumber();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setVoyageNumber("");
      String string0 = handlingReport0.getVoyageNumber();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setUnLocode("^v{G.vAzs%m{f");
      String string0 = handlingReport0.getUnLocode();
      assertEquals("^v{G.vAzs%m{f", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setTrackingId("OY]@ay*ZfRNvJB%4");
      String string0 = handlingReport0.getTrackingId();
      assertEquals("OY]@ay*ZfRNvJB%4", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setTrackingId("");
      String string0 = handlingReport0.getTrackingId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setEventType("z");
      String string0 = handlingReport0.getEventType();
      assertEquals("z", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setEventType("");
      String string0 = handlingReport0.getEventType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setCompletionTime("");
      String string0 = handlingReport0.getCompletionTime();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setUnLocode("");
      String string0 = handlingReport0.getUnLocode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      String string0 = handlingReport0.getEventType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setCompletionTime("b39vuW4");
      String string0 = handlingReport0.getCompletionTime();
      assertEquals("b39vuW4", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      String string0 = handlingReport0.getVoyageNumber();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      String string0 = handlingReport0.getTrackingId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      String string0 = handlingReport0.getCompletionTime();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      String string0 = handlingReport0.getUnLocode();
      assertNull(string0);
  }
}
