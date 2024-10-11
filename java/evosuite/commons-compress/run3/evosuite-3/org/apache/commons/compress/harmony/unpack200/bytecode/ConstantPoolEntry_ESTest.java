
/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */


package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConstantPoolEntry_ESTest extends ConstantPoolEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Float float0 = new Float(1541.08F);
      CPFloat cPFloat0 = new CPFloat(float0, 5);
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      cPFloat0.doWrite(dataOutputStream0);
      assertEquals(5, cPFloat0.getGlobalIndex());
      assertEquals((byte)4, cPFloat0.getTag());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Long long0 = new Long(2534L);
      CPLong cPLong0 = new CPLong(long0, 232);
      assertEquals((byte)5, cPLong0.getTag());
      
      cPLong0.tag = (byte)0;
      byte byte0 = cPLong0.getTag();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Long long0 = new Long(153L);
      CPLong cPLong0 = new CPLong(long0, 4);
      cPLong0.tag = (byte) (-117);
      byte byte0 = cPLong0.getTag();
      assertEquals((byte) (-117), byte0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(0);
      CPInteger cPInteger0 = new CPInteger(integer0, 0);
      int int0 = cPInteger0.getGlobalIndex();
      assertEquals((byte)3, cPInteger0.getTag());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Double double0 = new Double((-1588.8227));
      CPDouble cPDouble0 = new CPDouble(double0, (-354));
      int int0 = cPDouble0.getGlobalIndex();
      assertEquals((byte)6, cPDouble0.getTag());
      assertEquals((-354), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Float float0 = new Float((-516.7));
      CPFloat cPFloat0 = new CPFloat(float0, 0);
      cPFloat0.equals(float0);
      assertEquals((byte)4, cPFloat0.getTag());
      assertEquals(0, cPFloat0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Integer integer0 = new Integer(0);
      CPInteger cPInteger0 = new CPInteger(integer0, 0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cPInteger0.doWrite(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Long long0 = new Long(126L);
      CPLong cPLong0 = new CPLong(long0, 4);
      byte byte0 = cPLong0.getTag();
      assertEquals((byte)5, byte0);
      assertEquals(4, cPLong0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Long long0 = new Long(2539L);
      CPLong cPLong0 = new CPLong(long0, 207);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      try { 
        cPLong0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Long long0 = new Long(126L);
      CPLong cPLong0 = new CPLong(long0, 4);
      int int0 = cPLong0.getGlobalIndex();
      assertEquals((byte)5, cPLong0.getTag());
      assertEquals(4, int0);
  }
}
