/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:32:20 GMT 2024
 */

package org.eclipse.cargotracker.domain.shared;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.eclipse.cargotracker.domain.shared.AndSpecification;
import org.eclipse.cargotracker.domain.shared.NotSpecification;
import org.eclipse.cargotracker.domain.shared.OrSpecification;
import org.eclipse.cargotracker.domain.shared.Specification;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OrSpecification_ESTest extends OrSpecification_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OrSpecification<Object> orSpecification0 = new OrSpecification<Object>((Specification<Object>) null, (Specification<Object>) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        orSpecification0.isSatisfiedBy(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.domain.shared.OrSpecification", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Specification<Integer> specification0 = (Specification<Integer>) mock(Specification.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true).when(specification0).isSatisfiedBy(anyInt());
      NotSpecification<Integer> notSpecification0 = new NotSpecification<Integer>(specification0);
      AndSpecification<Integer> andSpecification0 = new AndSpecification<Integer>(notSpecification0, notSpecification0);
      OrSpecification<Integer> orSpecification0 = new OrSpecification<Integer>(andSpecification0, notSpecification0);
      Specification<Integer> specification1 = orSpecification0.not(orSpecification0);
      OrSpecification<Integer> orSpecification1 = new OrSpecification<Integer>(notSpecification0, specification1);
      Integer integer0 = new Integer(0);
      boolean boolean0 = orSpecification1.isSatisfiedBy(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Specification<Integer> specification0 = (Specification<Integer>) mock(Specification.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(specification0).isSatisfiedBy(anyInt());
      NotSpecification<Integer> notSpecification0 = new NotSpecification<Integer>(specification0);
      AndSpecification<Integer> andSpecification0 = new AndSpecification<Integer>(notSpecification0, notSpecification0);
      OrSpecification<Integer> orSpecification0 = new OrSpecification<Integer>(andSpecification0, notSpecification0);
      Integer integer0 = new Integer(0);
      boolean boolean0 = orSpecification0.isSatisfiedBy(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Specification<Integer> specification0 = (Specification<Integer>) mock(Specification.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(specification0).isSatisfiedBy(anyInt());
      AndSpecification<Integer> andSpecification0 = new AndSpecification<Integer>(specification0, specification0);
      NotSpecification<Integer> notSpecification0 = new NotSpecification<Integer>(andSpecification0);
      OrSpecification<Integer> orSpecification0 = new OrSpecification<Integer>(andSpecification0, notSpecification0);
      OrSpecification<Integer> orSpecification1 = new OrSpecification<Integer>(orSpecification0, andSpecification0);
      Integer integer0 = new Integer(0);
      boolean boolean0 = orSpecification1.isSatisfiedBy(integer0);
      assertTrue(boolean0);
  }
}
