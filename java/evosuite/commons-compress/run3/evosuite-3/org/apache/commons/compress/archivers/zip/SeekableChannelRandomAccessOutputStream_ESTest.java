
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.channels.SeekableByteChannel;
import org.apache.commons.compress.archivers.zip.SeekableChannelRandomAccessOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SeekableChannelRandomAccessOutputStream_ESTest extends SeekableChannelRandomAccessOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream((SeekableByteChannel) null);
      byte[] byteArray0 = new byte[6];
      seekableChannelRandomAccessOutputStream0.write(byteArray0, 0, 0);
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream((SeekableByteChannel) null);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        seekableChannelRandomAccessOutputStream0.write(byteArray0, (-2247), 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream((SeekableByteChannel) null);
      byte[] byteArray0 = new byte[29];
      // Undeclared exception!
      try { 
        seekableChannelRandomAccessOutputStream0.writeFully(byteArray0, (int) (byte) (-31), (int) (byte) (-31), (long) (byte) (-31));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.SeekableChannelRandomAccessOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream((SeekableByteChannel) null);
      // Undeclared exception!
      try { 
        seekableChannelRandomAccessOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.SeekableChannelRandomAccessOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream((SeekableByteChannel) null);
      // Undeclared exception!
      try { 
        seekableChannelRandomAccessOutputStream0.position();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.SeekableChannelRandomAccessOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream((SeekableByteChannel) null);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        seekableChannelRandomAccessOutputStream0.write(byteArray0, 0, (int) (byte)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipIoUtil", e);
      }
  }
}
