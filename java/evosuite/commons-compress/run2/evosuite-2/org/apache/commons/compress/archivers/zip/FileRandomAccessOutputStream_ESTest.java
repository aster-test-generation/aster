
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
import java.nio.channels.FileChannel;
import java.nio.file.FileSystem;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FileRandomAccessOutputStream_ESTest extends FileRandomAccessOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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
  public void test1()  throws Throwable  {
      FileSystemProvider fileSystemProvider0 = mock(FileSystemProvider.class, new ViolatedAssumptionAnswer());
      doReturn((FileChannel) null).when(fileSystemProvider0).newFileChannel(any(java.nio.file.Path.class) , anySet() , any(java.nio.file.attribute.FileAttribute[].class));
      FileSystem fileSystem0 = mock(FileSystem.class, new ViolatedAssumptionAnswer());
      doReturn(fileSystemProvider0).when(fileSystem0).provider();
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn(fileSystem0).when(path0).getFileSystem();
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = null;
      try {
        fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(path0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // channel
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OpenOption[] openOptionArray0 = new OpenOption[2];
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn((FileSystem) null).when(path0).getFileSystem();
      FileRandomAccessOutputStream fileRandomAccessOutputStream0 = null;
      try {
        fileRandomAccessOutputStream0 = new FileRandomAccessOutputStream(path0, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.channels.FileChannel", e);
      }
  }
}
