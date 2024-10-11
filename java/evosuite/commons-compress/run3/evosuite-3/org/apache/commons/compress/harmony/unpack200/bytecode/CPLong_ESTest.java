
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
import java.io.File;
import java.io.IOException;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPLong_ESTest extends CPLong_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Long long0 = new Long(4070L);
      CPLong cPLong0 = new CPLong(long0, (-1030));
      MockPrintStream mockPrintStream0 = new MockPrintStream("C");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      cPLong0.writeBody(dataOutputStream0);
      assertEquals((byte)11, ConstantPoolEntry.CP_InterfaceMethodref);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Long long0 = new Long((-2113L));
      CPLong cPLong0 = new CPLong(long0, 0);
      File file0 = MockFile.createTempFile("XdqP", "XdqP", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dataOutputStream0.close();
      try { 
        cPLong0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CPLong cPLong0 = null;
      try {
        cPLong0 = new CPLong((Long) null, (-2339));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // value
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Long long0 = new Long(0L);
      CPLong cPLong0 = new CPLong(long0, (-325));
      String string0 = cPLong0.toString();
      assertEquals("Long: 0", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Long long0 = new Long(0L);
      CPLong cPLong0 = new CPLong(long0, (-325));
      // Undeclared exception!
      try { 
        cPLong0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPLong", e);
      }
  }
}
