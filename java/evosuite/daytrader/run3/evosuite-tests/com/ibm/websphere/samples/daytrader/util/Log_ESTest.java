/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:16:17 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.websphere.samples.daytrader.util.Log;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Log_ESTest extends Log_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      Log.trace("g/.L9[i4pNG#}_hz%c", (Object) "g/.L9[i4pNG#}_hz%c", object0, object0, (Object) "g/.L9[i4pNG#}_hz%c", object0, object0, object1);
      assertFalse(object0.equals((Object)object1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      Log.trace("g/.L9[i4pNG#}_hz%c", (Object) "g/.L9[i4pNG#}_hz%c", object1, object0, (Object) "g/.L9[i4pNG#}_hz%c", object1, object0, object1);
      assertFalse(object0.equals((Object)object1));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Log.trace("Error: ", (Object) "Error: ", (Object) "Error: ", (Object) "Error: ", (Object) integer0, (Object) null, (Object) integer0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(636);
      Integer integer1 = new Integer(1);
      Log.trace("$>m.C)", (Object) integer0, (Object) integer0, (Object) integer1, (Object) integer0, (Object) null, (Object) integer0);
      assertFalse(integer0.equals((Object)integer1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer((-2601));
      Integer integer1 = new Integer((-2601));
      Log.trace("H5Y9 ZU90", (Object) "H5Y9 ZU90", (Object) integer0, (Object) "H5Y9 ZU90", (Object) integer1, (Object) null, (Object) "H5Y9 ZU90");
      assertTrue(integer0.equals((Object)integer1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(636);
      Integer integer1 = new Integer(1);
      Log.trace("$>m.C)", (Object) integer0, (Object) integer0, (Object) integer1, (Object) integer0, (Object) null, (Object) integer1);
      assertFalse(integer1.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer((-12));
      Integer integer1 = new Integer((-12));
      Log.trace("7W\"", (Object) "7W\"", (Object) "7W\"", (Object) integer0, (Object) "7W\"", (Object) integer1);
      assertTrue(integer1.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(4885);
      Log.trace("AfK,l@Xq-0]`", (Object) integer0, (Object) integer0, (Object) null, (Object) integer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      Log.trace("", (Object) "", object0, (Object) "");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.error((Throwable) null, "zIk?q", "WO}~0U", "zIk?q");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      // Undeclared exception!
      try { 
        Log.error((Throwable) mockThrowable0, "", "", "\t\t");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      // Undeclared exception!
      try { 
        Log.error((Throwable) mockThrowable0, "", "daytrader");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      // Undeclared exception!
      try { 
        Log.error("), ", "", "", (Throwable) mockThrowable0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      // Undeclared exception!
      try { 
        Log.error("p/kQ'", "p/kQ'", "{k^", (Throwable) mockThrowable0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("-RX");
      // Undeclared exception!
      try { 
        Log.error("-RX", "inxK+5~'91S0", (Throwable) mockThrowable0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.log((String) null, "/B}uAyy?S4]8vRb2k", (String) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.log(" threadID=", " threadID=", "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.printObject((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.printCollection((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        Log.printCollection((Collection<?>) linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      // Undeclared exception!
      try { 
        Log.error((Throwable) mockThrowable0, "qXn)u.4{.Hn[sY,#0,L");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      // Undeclared exception!
      try { 
        Log.error("xf$g6@", (Throwable) mockThrowable0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.error("y", "y", (Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.error("8N", "8N", "8N", (Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Log.trace("\t---Log.printCollection -- complete");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.error("");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.error("\"Cnvln>V$", (Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.log("");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.debug("\"J_lk;R6s%gbvcYxx%");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      Log.trace("", object0, (Object) "");
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Integer integer0 = new Integer((-2601));
      Object object0 = new Object();
      Log.trace(",}JCuRDhi6.jC3", object0, (Object) ",}JCuRDhi6.jC3", (Object) ",}JCuRDhi6.jC3", (Object) integer0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.traceInterceptor("8N", "8N");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.print("3.#");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = new Object();
      Log.trace((String) null, object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = Log.doDebug();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = Log.doTrace();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.log((String) null, "$>m.C)");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Log.traceEnter("g/.L9[i4pNG#}_hz%c");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        Log.printCollection("", (Collection<?>) linkedList0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Log log0 = new Log();
      assertFalse(log0.doTrace());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.error((Throwable) null, "'.j0,+i^fx&k");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.printObject("A;(?\"'?pTxNISMz;u");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.stat("A?\"'=pTxNISMz;u");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class java.util.logging.LogRecord$CallerFinder
         //
         verifyException("java.util.logging.LogRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      Integer integer0 = new Integer(0);
      Object object0 = new Object();
      Log.trace("3.#", (Object) mockThrowable0, (Object) integer0, object0, object0, object0);
      assertNull(mockThrowable0.getMessage());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object object0 = new Object();
      Log.trace(" threadD=", object0, object0, (Object) " threadD=");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        Log.error((Throwable) null, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.util.Log", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Log.traceExit("");
  }
}
