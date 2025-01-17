/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 15:50:39 GMT 2024
 */

package org.eclipse.cargotracker.interfaces;

import org.junit.Test;
import static org.junit.Assert.*;
import org.eclipse.cargotracker.interfaces.Coordinates;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Coordinates_ESTest extends Coordinates_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Coordinates coordinates0 = new Coordinates(553.181891462, 0.0);
      assertEquals(0.0, coordinates0.getLongitude(), 0.01);
      assertEquals(553.181891462, coordinates0.getLatitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Coordinates coordinates0 = new Coordinates(1.0, 1.0);
      double double0 = coordinates0.getLongitude();
      assertEquals(1.0, coordinates0.getLatitude(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Coordinates coordinates0 = new Coordinates((-1.0), (-1.0));
      double double0 = coordinates0.getLongitude();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), coordinates0.getLatitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Coordinates coordinates0 = new Coordinates(0.0, 0.0);
      double double0 = coordinates0.getLatitude();
      assertEquals(0.0, coordinates0.getLongitude(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Coordinates coordinates0 = new Coordinates((-1.0), (-1.0));
      double double0 = coordinates0.getLatitude();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), coordinates0.getLongitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Coordinates coordinates0 = new Coordinates(0.0, 0.0);
      double double0 = coordinates0.getLongitude();
      assertEquals(0.0, coordinates0.getLatitude(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Coordinates coordinates0 = new Coordinates(299.417769, 299.417769);
      double double0 = coordinates0.getLatitude();
      assertEquals(299.417769, double0, 0.01);
      assertEquals(299.417769, coordinates0.getLongitude(), 0.01);
  }
}
