/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:53:03 GMT 2024
 */

package org.eclipse.cargotracker.domain.model.handling;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.eclipse.cargotracker.domain.model.handling.UnknownVoyageException;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnknownVoyageException_ESTest extends UnknownVoyageException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VoyageNumber voyageNumber0 = new VoyageNumber();
      UnknownVoyageException unknownVoyageException0 = new UnknownVoyageException(voyageNumber0);
      String string0 = unknownVoyageException0.getMessage();
      assertEquals("No voyage with number null exists in the system.", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnknownVoyageException unknownVoyageException0 = new UnknownVoyageException((VoyageNumber) null);
      // Undeclared exception!
      try { 
        unknownVoyageException0.getMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.domain.model.handling.UnknownVoyageException", e);
      }
  }
}