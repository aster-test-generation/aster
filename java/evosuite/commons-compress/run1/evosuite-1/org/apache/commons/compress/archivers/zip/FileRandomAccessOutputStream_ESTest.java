
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FileRandomAccessOutputStream_ESTest extends FileRandomAccessOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn(1, 3455, 1, 1, 3455).when(fileChannel0).write(any(java.nio.ByteBuffer.class) , anyLong());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      fileRandomAccessOutputStream0.writeFully(byteArray0, 0, (int) (byte)1, 0L);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(fileChannel0).write(any(java.nio.ByteBuffer.class) , anyLong());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[7];
      try { 
        fileRandomAccessOutputStream0.writeFully(byteArray0, 0, (int) (byte)1, 0L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to fully write to file: written=0
         //
         verifyException("org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[7];
      fileRandomAccessOutputStream0.write(byteArray0, (int) (byte)1, (int) (byte)0);
      assertEquals(0L, fileRandomAccessOutputStream0.position());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn(1, 0).when(fileChannel0).write(any(java.nio.ByteBuffer.class) , anyLong());
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      StandardOpenOption standardOpenOption0 = StandardOpenOption.WRITE;
      StandardOpenOption standardOpenOption1 = StandardOpenOption.CREATE_NEW;
      LinkOption linkOption1 = LinkOption.NOFOLLOW_LINKS;
      StandardOpenOption standardOpenOption2 = StandardOpenOption.CREATE;
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)95;
      byteArray0[1] = (byte)2;
      fileRandomAccessOutputStream0.position();
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte) (-75);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)1;
      try { 
        fileRandomAccessOutputStream0.writeFully(byteArray0, 0, (int) (byte)1, 0L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to fully write to file: written=0
         //
         verifyException("org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.writeFully((byte[]) null, 0, (int) (byte)1, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.writeFully(byteArray0, (int) (byte)95, 513, (long) (byte)95);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.write((byte[]) null, 0, (int) (byte) (-24));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.write(byteArray0, (int) (byte)95, (int) (byte) (-75));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(fileChannel0).toString();
      doReturn(0).when(fileChannel0).write(any(java.nio.ByteBuffer.class));
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[7];
      try { 
        fileRandomAccessOutputStream0.write(byteArray0, (int) (byte)1, (int) (byte)2);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to fully write: channel=null length=2 written=0
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipIoUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = null;
      try {
        fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream((FileChannel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // channel
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1, 1, (-1)).when(fileChannel0).write(any(java.nio.ByteBuffer.class) , anyLong());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[7];
      try { 
        fileRandomAccessOutputStream0.writeFully(byteArray0, (int) (byte)1, (int) (byte)1, (long) (byte)95);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to fully write to file: written=-1
         //
         verifyException("org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      byte[] byteArray0 = new byte[19];
      fileRandomAccessOutputStream0.writeFully(byteArray0, (int) (byte)0, (int) (byte)0, (long) (byte)1);
      assertEquals(19, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      doReturn("channel").when(fileChannel0).toString();
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      FileChannel fileChannel1 = fileRandomAccessOutputStream0.channel();
      assertFalse(fileChannel1.isOpen());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileChannel fileChannel0 = mock(FileChannel.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(fileChannel0);
      // Undeclared exception!
      try { 
        fileRandomAccessOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.channels.spi.AbstractInterruptibleChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = null;
      try {
        fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.channels.FileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = null;
      try {
        fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(path0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.channels.FileChannel", e);
      }
  }
}
