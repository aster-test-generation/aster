/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:33:00 GMT 2024
 */

package org.eclipse.cargotracker.domain.shared;

import org.junit.Test;
import static org.junit.Assert.*;
import org.eclipse.cargotracker.domain.shared.DomainObjectUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DomainObjectUtils_ESTest extends DomainObjectUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      Integer integer2 = DomainObjectUtils.nullSafe(integer0, integer1);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = DomainObjectUtils.nullSafe((Object) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(3033);
      Object object0 = DomainObjectUtils.nullSafe((Object) null, (Object) integer0);
      assertEquals(3033, object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = DomainObjectUtils.nullSafe(object0, object0);
      assertSame(object1, object0);
  }
}