/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:14:38 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.util;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.websphere.samples.daytrader.util.TimerStat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimerStat_ESTest extends TimerStat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setTotalTime((-507.3669));
      double double0 = timerStat0.getTotalTime();
      assertEquals((-507.3669), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      assertEquals(1.0E9, timerStat0.getMin(), 0.01);
      
      timerStat0.setMin(0.0);
      double double0 = timerStat0.getMinSecs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setMin((-2809.9995917));
      double double0 = timerStat0.getMinSecs();
      assertEquals((-2809.9995917), timerStat0.getMin(), 0.01);
      assertEquals((-2.8099995917), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      assertEquals(1000000.0, timerStat0.getMinSecs(), 0.01);
      
      timerStat0.setMin(0.0);
      double double0 = timerStat0.getMin();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setMin((-2809.9995917));
      double double0 = timerStat0.getMin();
      assertEquals((-2.8099995917), timerStat0.getMinSecs(), 0.01);
      assertEquals((-2809.9995917), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      assertEquals(0.0, timerStat0.getMax(), 0.01);
      
      timerStat0.setMax(1.0);
      double double0 = timerStat0.getMaxSecs();
      assertEquals(0.001, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      assertEquals(0.0, timerStat0.getMax(), 0.01);
      
      timerStat0.setMax((-1.0));
      double double0 = timerStat0.getMaxSecs();
      assertEquals((-0.001), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      assertEquals(0.0, timerStat0.getMaxSecs(), 0.01);
      
      timerStat0.setMax(1.0);
      double double0 = timerStat0.getMax();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      assertEquals(0.0, timerStat0.getMaxSecs(), 0.01);
      
      timerStat0.setMax((-1.0));
      double double0 = timerStat0.getMax();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setCount(1);
      int int0 = timerStat0.getCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setCount((-2698));
      int int0 = timerStat0.getCount();
      assertEquals((-2698), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setCount(1);
      double double0 = timerStat0.getAvgSecs();
      assertEquals(1, timerStat0.getCount());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setTotalTime(3548.2928463876415);
      double double0 = timerStat0.getAvgSecs();
      assertEquals(3548.2928463876415, timerStat0.getTotalTime(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setTotalTime(3548.2928463876415);
      timerStat0.setCount((-1));
      double double0 = timerStat0.getAvgSecs();
      assertEquals(3548.2928463876415, timerStat0.getTotalTime(), 0.01);
      assertEquals((-3.5482928463876413), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      int int0 = timerStat0.getCount();
      assertEquals(0.0, timerStat0.getMaxSecs(), 0.01);
      assertEquals(1000000.0, timerStat0.getMinSecs(), 0.01);
      assertEquals(Double.NaN, timerStat0.getAvgSecs(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      double double0 = timerStat0.getTotalTime();
      assertEquals(0.0, timerStat0.getMaxSecs(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1000000.0, timerStat0.getMinSecs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      double double0 = timerStat0.getMin();
      assertEquals(1.0E9, double0, 0.01);
      assertEquals(Double.NaN, timerStat0.getAvgSecs(), 0.01);
      assertEquals(0.0, timerStat0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      assertEquals(0.0, timerStat0.getTotalTime(), 0.01);
      
      timerStat0.setTotalTime(1.0);
      double double0 = timerStat0.getTotalTime();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      double double0 = timerStat0.getMaxSecs();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0E9, timerStat0.getMin(), 0.01);
      assertEquals(0.0, timerStat0.getTotalTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      double double0 = timerStat0.getMax();
      assertEquals(0.0, double0, 0.01);
      assertEquals(Double.NaN, timerStat0.getAvgSecs(), 0.01);
      assertEquals(1000000.0, timerStat0.getMinSecs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      double double0 = timerStat0.getMinSecs();
      assertEquals(0.0, timerStat0.getMaxSecs(), 0.01);
      assertEquals(Double.NaN, timerStat0.getAvgSecs(), 0.01);
      assertEquals(1000000.0, double0, 0.01);
  }
}
