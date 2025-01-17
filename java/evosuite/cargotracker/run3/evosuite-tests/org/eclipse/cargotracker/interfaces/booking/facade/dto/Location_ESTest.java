/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:12:58 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Location;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Location_ESTest extends Location_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Location location0 = new Location("org.eclipse.cargotracker.interfaces.booking.facade.dto.Location", (String) null);
      location0.getUnLocode();
      assertEquals("null (org.eclipse.cargotracker.interfaces.booking.facade.dto.Location)", location0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Location location0 = new Location("", "");
      String string0 = location0.getUnLocode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Location location0 = new Location("?[", "iv]orjr#I*+_M$");
      location0.getName();
      assertEquals("iv]orjr#I*+_M$ (?[)", location0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Location location0 = new Location("", "");
      String string0 = location0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Location location0 = new Location((String) null, (String) null);
      String string0 = location0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Location location0 = new Location((String) null, (String) null);
      String string0 = location0.toString();
      assertEquals("null (null)", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Location location0 = new Location((String) null, (String) null);
      String string0 = location0.getUnLocode();
      assertNull(string0);
  }
}
