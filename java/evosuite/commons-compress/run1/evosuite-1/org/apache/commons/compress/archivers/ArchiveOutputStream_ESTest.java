
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


package org.apache.commons.compress.archivers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArchiveOutputStream_ESTest extends ArchiveOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("_0X{P9Z#//22?OJS'p");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      arArchiveOutputStream0.write((-434));
      int int0 = arArchiveOutputStream0.getCount();
      assertEquals(1L, mockFile0.length());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(65);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      MockFile mockFile0 = new MockFile("X7875_NewUnix length is too short, only ");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "D{nx+:$H=18~");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      long long0 = arArchiveOutputStream0.getBytesWritten();
      assertEquals(68, byteArrayOutputStream0.size());
      assertEquals(60L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(1952257861);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("_0X{P9Z#//22?OJS'p");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[3];
      arArchiveOutputStream0.write(byteArray0, (-3), (int) (byte) (-1));
      assertEquals(0, ArArchiveOutputStream.LONGFILE_ERROR);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockFile mockFile0 = new MockFile("_0X{P9Z#//22?OJ{S'p");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[5];
      arArchiveOutputStream0.write(byteArray0, (int) (byte) (-1), (-2082));
      assertEquals(0, ArArchiveOutputStream.LONGFILE_ERROR);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      long long0 = arArchiveOutputStream0.getBytesWritten();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      int int0 = arArchiveOutputStream0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 1);
      boolean boolean0 = arArchiveOutputStream0.canWriteEntryData(arArchiveEntry0);
      assertTrue(boolean0);
  }
}
