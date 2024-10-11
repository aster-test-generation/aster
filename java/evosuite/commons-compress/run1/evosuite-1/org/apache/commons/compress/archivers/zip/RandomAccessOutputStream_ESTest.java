
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
import java.nio.channels.FileChannel;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream;
import org.apache.commons.compress.archivers.zip.SeekableChannelRandomAccessOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RandomAccessOutputStream_ESTest extends RandomAccessOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile((String) null, "");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.CREATE_NEW;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      FileChannel fileChannel0 = FileChannel.open(path0, openOptionArray0);
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream(fileChannel0);
      long long0 = seekableChannelRandomAccessOutputStream0.position();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream((SeekableByteChannel) null);
      // Undeclared exception!
      try { 
        seekableChannelRandomAccessOutputStream0.write(405);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipIoUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
  public void test3()  throws Throwable  {
      SeekableChannelRandomAccessOutputStream seekableChannelRandomAccessOutputStream0 = new SeekableChannelRandomAccessOutputStream((SeekableByteChannel) null);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        seekableChannelRandomAccessOutputStream0.writeFully(byteArray0, (byte)0);
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
      MockFile mockFile0 = new MockFile((String) null, "");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[2];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.DSYNC;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      openOptionArray0[1] = (OpenOption) standardOpenOption0;
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(path0, openOptionArray0);
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.write(671);
        fail("Expecting exception: NonWritableChannelException");
      
      } catch(NonWritableChannelException e) {
      }
  }
}
