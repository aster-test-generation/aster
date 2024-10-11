
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
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.NonReadableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.ServiceLoader;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;
import org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel;
import org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipSplitReadOnlySeekableByteChannel_ESTest extends ZipSplitReadOnlySeekableByteChannel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      Path[] pathArray0 = new Path[1];
      pathArray0[0] = path0;
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      ArrayList<Path> arrayList0 = new ArrayList<Path>();
      PriorityQueue<Path> priorityQueue0 = new PriorityQueue<Path>(arrayList0);
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) priorityQueue0);
      TreeSet<ZipSplitReadOnlySeekableByteChannel> treeSet0 = new TreeSet<ZipSplitReadOnlySeekableByteChannel>();
      PriorityQueue<SeekableByteChannel> priorityQueue1 = new PriorityQueue<SeekableByteChannel>((SortedSet<? extends SeekableByteChannel>) treeSet0);
      SeekableByteChannel seekableByteChannel1 = ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannel0, (Iterable<SeekableByteChannel>) priorityQueue1);
      assertSame(seekableByteChannel0, seekableByteChannel1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Path[] pathArray0 = new Path[9];
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      pathArray0[1] = pathArray0[0];
      pathArray0[2] = pathArray0[1];
      pathArray0[3] = pathArray0[0];
      pathArray0[4] = pathArray0[0];
      MockFile mockFile1 = new MockFile("", " XG2-1Re[(B?k=");
      Path path1 = mockFile1.toPath();
      pathArray0[5] = path1;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Path[] pathArray0 = new Path[0];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Path[] pathArray0 = new Path[4];
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      pathArray0[1] = path0;
      pathArray0[2] = pathArray0[0];
      pathArray0[3] = path0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Path> linkedList0 = new LinkedList<Path>();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      MockFile mockFile0 = new MockFile("<poqq1;", "<poqq1;");
      Path path0 = mockFile0.toPath();
      linkedList0.addLast(path0);
      StandardOpenOption standardOpenOption0 = StandardOpenOption.SYNC;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) linkedList0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("^g&?%qUM7%E", "^g&?%qUM7%E");
      Path path0 = mockFile0.toPath();
      ArrayDeque<Path> arrayDeque0 = new ArrayDeque<Path>();
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) arrayDeque0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((Path) null, (Iterable<Path>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // paths
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) path0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("@smd:5;|");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[2];
      seekableByteChannelArray0[0] = (SeekableByteChannel) fileChannel0;
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
        fail("Expecting exception: NonReadableChannelException");
      
      } catch(NonReadableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[0];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.util.Arrays$ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("@smd:5;|");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      Comparator<SeekableByteChannel> comparator0 = (Comparator<SeekableByteChannel>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<SeekableByteChannel> priorityQueue0 = new PriorityQueue<SeekableByteChannel>(comparator0);
      priorityQueue0.add(fileChannel0);
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels((SeekableByteChannel) fileChannel0, (Iterable<SeekableByteChannel>) priorityQueue0);
        fail("Expecting exception: NonReadableChannelException");
      
      } catch(NonReadableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<SeekableByteChannel> class0 = SeekableByteChannel.class;
      ServiceLoader<SeekableByteChannel> serviceLoader0 = ServiceLoader.load(class0);
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels((SeekableByteChannel) null, (Iterable<SeekableByteChannel>) serviceLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // lastSegmentChannel
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("@smd:5;|");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("@smd:5;|");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      Comparator<SeekableByteChannel> comparator0 = (Comparator<SeekableByteChannel>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<SeekableByteChannel> priorityQueue0 = new PriorityQueue<SeekableByteChannel>(comparator0);
      priorityQueue0.add(fileChannel0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels((SeekableByteChannel) fileChannel0, (Iterable<SeekableByteChannel>) priorityQueue0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File[] fileArray0 = new File[3];
      MockFile mockFile0 = new MockFile("'.O`UJHd|^i(T/D", "'.O`UJHd|^i(T/D");
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = (File) mockFile0;
      fileArray0[2] = (File) mockFile0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      File[] fileArray0 = new File[1];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      File[] fileArray0 = new File[2];
      MockFile mockFile0 = new MockFile("");
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = (File) mockFile0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel");
      Class<File> class0 = File.class;
      ServiceLoader<File> serviceLoader0 = ServiceLoader.loadInstalled(class0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) serviceLoader0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("0Xt", "org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel");
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // files
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      PriorityQueue<File> priorityQueue0 = new PriorityQueue<File>();
      priorityQueue0.add(mockFile0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) priorityQueue0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(path0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("}&4");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(path0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/FilenameUtils
         //
         verifyException("org.apache.commons.compress.utils.FileNameUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment((File) mockFile0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/FilenameUtils
         //
         verifyException("org.apache.commons.compress.utils.FileNameUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("@smd:5;|");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      linkedList0.push(fileChannel0);
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(linkedList0);
        fail("Expecting exception: NonReadableChannelException");
      
      } catch(NonReadableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel((List<SeekableByteChannel>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // channels must not be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArrayList<SeekableByteChannel> arrayList0 = new ArrayList<SeekableByteChannel>();
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(arrayList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector<SeekableByteChannel> vector0 = new Vector<SeekableByteChannel>();
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(vector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ArrayList<Path> arrayList0 = new ArrayList<Path>();
      OpenOption[] openOptionArray0 = new OpenOption[3];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.SYNC;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      arrayList0.add(path0);
      openOptionArray0[1] = (OpenOption) standardOpenOption0;
      openOptionArray0[2] = (OpenOption) standardOpenOption0;
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) arrayList0, openOptionArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ArrayList<Path> arrayList0 = new ArrayList<Path>();
      OpenOption[] openOptionArray0 = new OpenOption[3];
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      arrayList0.add(path0);
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) arrayList0, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ArrayList<Path> arrayList0 = new ArrayList<Path>();
      OpenOption[] openOptionArray0 = new OpenOption[3];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) arrayList0, openOptionArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[1];
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
      assertNull(seekableByteChannel0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Path[] pathArray0 = new Path[1];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[0];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
      linkedList0.add(seekableByteChannel0);
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(linkedList0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // The first ZIP split segment does not begin with split ZIP file signature
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      File[] fileArray0 = new File[0];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      File[] fileArray0 = new File[1];
      MockFile mockFile0 = new MockFile("");
      fileArray0[0] = (File) mockFile0;
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[2];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      PriorityQueue<File> priorityQueue0 = new PriorityQueue<File>();
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) priorityQueue0);
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[6];
      seekableByteChannelArray0[0] = seekableByteChannel0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", e);
      }
  }
}
