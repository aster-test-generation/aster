/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:51:42 GMT 2024
 */

package org.eclipse.cargotracker.domain.model.handling;

import org.junit.Test;
import static org.junit.Assert.*;
import org.eclipse.cargotracker.domain.model.handling.CannotCreateHandlingEventException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CannotCreateHandlingEventException_ESTest extends CannotCreateHandlingEventException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CannotCreateHandlingEventException cannotCreateHandlingEventException0 = new CannotCreateHandlingEventException();
      CannotCreateHandlingEventException cannotCreateHandlingEventException1 = new CannotCreateHandlingEventException(cannotCreateHandlingEventException0);
      assertFalse(cannotCreateHandlingEventException1.equals((Object)cannotCreateHandlingEventException0));
  }
}
