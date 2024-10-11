/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:38:07 GMT 2024
 */

package org.eclipse.cargotracker.domain.model.voyage;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.cargotracker.domain.model.voyage.CarrierMovement;
import org.eclipse.cargotracker.domain.model.voyage.Schedule;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Schedule_ESTest extends Schedule_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Schedule schedule0 = Schedule.EMPTY;
      Object object0 = new Object();
      boolean boolean0 = schedule0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Schedule schedule0 = Schedule.EMPTY;
      boolean boolean0 = schedule0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Schedule schedule0 = new Schedule();
      boolean boolean0 = schedule0.equals(schedule0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Schedule schedule0 = new Schedule();
      Schedule schedule1 = new Schedule();
      boolean boolean0 = schedule0.equals(schedule1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Schedule schedule0 = new Schedule();
      // Undeclared exception!
      try { 
        schedule0.hashCode();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/builder/HashCodeBuilder
         //
         verifyException("org.eclipse.cargotracker.domain.model.voyage.Schedule", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<CarrierMovement> linkedList0 = new LinkedList<CarrierMovement>();
      Schedule schedule0 = null;
      try {
        schedule0 = new Schedule(linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.eclipse.cargotracker.domain.model.voyage.Schedule", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Schedule schedule0 = new Schedule();
      List<CarrierMovement> list0 = schedule0.EMPTY.getCarrierMovements();
      assertTrue(list0.isEmpty());
  }
}
