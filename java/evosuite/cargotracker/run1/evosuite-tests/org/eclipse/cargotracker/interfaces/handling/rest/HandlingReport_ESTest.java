/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 15:52:04 GMT 2024
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
      handlingReport0.setVoyageNumber("jWdB$b,:'5Im/J~S^ah");
      String string0 = handlingReport0.getVoyageNumber();
      assertEquals("jWdB$b,:'5Im/J~S^ah", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setUnLocode("]\"+=O<|l<");
      String string0 = handlingReport0.getUnLocode();
      assertEquals("]\"+=O<|l<", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setUnLocode("");
      String string0 = handlingReport0.getUnLocode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setTrackingId("ttI4{^-].Ev/%N");
      String string0 = handlingReport0.getTrackingId();
      assertEquals("ttI4{^-].Ev/%N", string0);
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
      handlingReport0.setEventType("Dls1bB8T^y_15");
      String string0 = handlingReport0.getEventType();
      assertEquals("Dls1bB8T^y_15", string0);
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
      handlingReport0.setCompletionTime("Dls1bB8T^y_15");
      String string0 = handlingReport0.getCompletionTime();
      assertEquals("Dls1bB8T^y_15", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      String string0 = handlingReport0.getEventType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setCompletionTime("");
      String string0 = handlingReport0.getCompletionTime();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      String string0 = handlingReport0.getVoyageNumber();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      String string0 = handlingReport0.getTrackingId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      String string0 = handlingReport0.getCompletionTime();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setVoyageNumber("");
      String string0 = handlingReport0.getVoyageNumber();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HandlingReport handlingReport0 = new HandlingReport();
      String string0 = handlingReport0.getUnLocode();
      assertNull(string0);
  }
}
