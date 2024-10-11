/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:13:39 GMT 2024
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
      timerStat0.setTotalTime(1000.0);
      timerStat0.setCount(363);
      double double0 = timerStat0.getAvgSecs();
      assertEquals(1000.0, timerStat0.getTotalTime(), 0.01);
      assertEquals(0.002754820936639118, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setTotalTime(1000.0);
      double double0 = timerStat0.getTotalTime();
      assertEquals(1000.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      assertEquals(Double.NaN, timerStat0.getAvgSecs(), 0.01);
      
      timerStat0.setTotalTime((-1.0));
      double double0 = timerStat0.getTotalTime();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      assertEquals(1.0E9, timerStat0.getMin(), 0.01);
      
      timerStat0.setMin(0.0);
      double double0 = timerStat0.getMinSecs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setMin((-1204.01838));
      double double0 = timerStat0.getMinSecs();
      assertEquals((-1204.01838), timerStat0.getMin(), 0.01);
      assertEquals((-1.20401838), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setMin((-989.612));
      double double0 = timerStat0.getMin();
      assertEquals((-0.9896119999999999), timerStat0.getMinSecs(), 0.01);
      assertEquals((-989.612), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setMax(2549.05);
      double double0 = timerStat0.getMaxSecs();
      assertEquals(2549.05, timerStat0.getMax(), 0.01);
      assertEquals(2.5490500000000003, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setMax((-195.8));
      double double0 = timerStat0.getMaxSecs();
      assertEquals((-195.8), timerStat0.getMax(), 0.01);
      assertEquals((-0.1958), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setMax(1761);
      double double0 = timerStat0.getMax();
      assertEquals(1761.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      assertEquals(0.0, timerStat0.getMaxSecs(), 0.01);
      
      timerStat0.setMax((-1.0));
      double double0 = timerStat0.getMax();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setCount(363);
      int int0 = timerStat0.getCount();
      assertEquals(363, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setCount((-1511));
      int int0 = timerStat0.getCount();
      assertEquals((-1511), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setCount((-4168));
      double double0 = timerStat0.getAvgSecs();
      assertEquals((-4168), timerStat0.getCount());
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      timerStat0.setTotalTime((-41.0));
      double double0 = timerStat0.getAvgSecs();
      assertEquals((-41.0), timerStat0.getTotalTime(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      int int0 = timerStat0.getCount();
      assertEquals(Double.NaN, timerStat0.getAvgSecs(), 0.01);
      assertEquals(1.0E9, timerStat0.getMin(), 0.01);
      assertEquals(0.0, timerStat0.getMax(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      double double0 = timerStat0.getTotalTime();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1000000.0, timerStat0.getMinSecs(), 0.01);
      assertEquals(0.0, timerStat0.getMaxSecs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      double double0 = timerStat0.getMin();
      assertEquals(0.0, timerStat0.getMax(), 0.01);
      assertEquals(1.0E9, double0, 0.01);
      assertEquals(Double.NaN, timerStat0.getAvgSecs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      assertEquals(1000000.0, timerStat0.getMinSecs(), 0.01);
      
      timerStat0.setMin(0.0);
      double double0 = timerStat0.getMin();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      double double0 = timerStat0.getMaxSecs();
      assertEquals(Double.NaN, timerStat0.getAvgSecs(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1000000.0, timerStat0.getMinSecs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      double double0 = timerStat0.getMax();
      assertEquals(1000000.0, timerStat0.getMinSecs(), 0.01);
      assertEquals(Double.NaN, timerStat0.getAvgSecs(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimerStat timerStat0 = new TimerStat();
      double double0 = timerStat0.getMinSecs();
      assertEquals(1000000.0, double0, 0.01);
      assertEquals(0.0, timerStat0.getTotalTime(), 0.01);
      assertEquals(0.0, timerStat0.getMax(), 0.01);
  }
}
