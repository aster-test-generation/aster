/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:03:55 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.web.prims.beanval;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.websphere.samples.daytrader.web.prims.beanval.CDIMethodConstraintBean;
import java.time.LocalDateTime;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CDIMethodConstraintBean_ESTest extends CDIMethodConstraintBean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CDIMethodConstraintBean cDIMethodConstraintBean0 = new CDIMethodConstraintBean();
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      int int0 = cDIMethodConstraintBean0.getHitCount(localDateTime0);
      assertEquals(1, int0);
      
      List<Integer> list0 = cDIMethodConstraintBean0.hitList();
      assertTrue(list0.contains(int0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CDIMethodConstraintBean cDIMethodConstraintBean0 = new CDIMethodConstraintBean();
      List<Integer> list0 = cDIMethodConstraintBean0.hitList();
      assertTrue(list0.isEmpty());
  }
}
