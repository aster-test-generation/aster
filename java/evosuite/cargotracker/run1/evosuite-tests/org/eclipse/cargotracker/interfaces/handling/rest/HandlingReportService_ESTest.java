/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 15:53:13 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.handling.rest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.format.DateTimeParseException;
import org.eclipse.cargotracker.interfaces.handling.rest.HandlingReport;
import org.eclipse.cargotracker.interfaces.handling.rest.HandlingReportService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HandlingReportService_ESTest extends HandlingReportService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandlingReportService handlingReportService0 = new HandlingReportService();
      HandlingReport handlingReport0 = new HandlingReport();
      handlingReport0.setCompletionTime("5Q@IV2GuK]");
      // Undeclared exception!
      try { 
        handlingReportService0.submitReport(handlingReport0);
        fail("Expecting exception: DateTimeParseException");
      
      } catch(DateTimeParseException e) {
         //
         // Text '5Q@IV2GuK]' could not be parsed at index 1
         //
         verifyException("java.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandlingReportService handlingReportService0 = new HandlingReportService();
      HandlingReport handlingReport0 = new HandlingReport();
      // Undeclared exception!
      try { 
        handlingReportService0.submitReport(handlingReport0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // text
         //
         verifyException("java.util.Objects", e);
      }
  }
}
