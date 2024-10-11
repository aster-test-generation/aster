
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
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.NonReadableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel;
import org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipSplitReadOnlySeekableByteChannel_ESTest extends ZipSplitReadOnlySeekableByteChannel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Path[] pathArray0 = new Path[1];
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Path[] pathArray0 = new Path[5];
      File file0 = MockFile.createTempFile("2kt!-[~hgt", "2kt!-[~hgt");
      Path path0 = file0.toPath();
      pathArray0[0] = path0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      Path[] pathArray0 = new Path[3];
      pathArray0[0] = path0;
      pathArray0[1] = path0;
      pathArray0[2] = path0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<Path> arrayList0 = new ArrayList<Path>();
      MockFile mockFile0 = new MockFile("~ Uk/9,");
      Path path0 = mockFile0.toPath();
      arrayList0.add(path0);
      OpenOption[] openOptionArray0 = new OpenOption[1];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.TRUNCATE_EXISTING;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) arrayList0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Path> linkedList0 = new LinkedList<Path>();
      StandardOpenOption[] standardOpenOptionArray0 = StandardOpenOption.values();
      MockFile mockFile0 = new MockFile("Aaf|Sf");
      Path path0 = mockFile0.toPath();
      linkedList0.add(path0);
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) linkedList0, (OpenOption[]) standardOpenOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "hg,2V-Hl{v`;");
      Path path0 = mockFile0.toPath();
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) path0);
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
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(">~!-(9(<wuZ", false);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[9];
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
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(">~!-(9(<wuZ", false);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[9];
      seekableByteChannelArray0[0] = (SeekableByteChannel) fileChannel0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(">~!-(9(<wuZ");
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      fileChannel0.close();
      LinkedHashSet<FileChannel> linkedHashSet0 = new LinkedHashSet<FileChannel>();
      ArrayDeque<SeekableByteChannel> arrayDeque0 = new ArrayDeque<SeekableByteChannel>(linkedHashSet0);
      arrayDeque0.add(fileChannel0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels((SeekableByteChannel) fileChannel0, (Iterable<SeekableByteChannel>) arrayDeque0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashSet<SeekableByteChannel> hashSet0 = new HashSet<SeekableByteChannel>(1169, 1169);
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels((SeekableByteChannel) null, (Iterable<SeekableByteChannel>) hashSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // lastSegmentChannel
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File[] fileArray0 = new File[4];
      MockFile mockFile0 = new MockFile("M<|>3vkY0", "The first ZIP split segment does not begin with split ZIP file signature");
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = (File) mockFile0;
      fileArray0[2] = (File) mockFile0;
      fileArray0[3] = (File) mockFile0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles((File[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // files must not be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      File[] fileArray0 = new File[6];
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = (File) mockFile0;
      fileArray0[2] = (File) mockFile0;
      fileArray0[3] = (File) mockFile0;
      fileArray0[4] = (File) mockFile0;
      fileArray0[5] = (File) mockFile0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      File file0 = MockFile.createTempFile("k3|", "k3|");
      HashSet<File> hashSet0 = new HashSet<File>();
      ArrayList<File> arrayList0 = new ArrayList<File>(hashSet0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(file0, (Iterable<File>) arrayList0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
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
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%%y|,e8`(YD<Gf");
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
  public void test22()  throws Throwable  {
      Vector<SeekableByteChannel> vector0 = new Vector<SeekableByteChannel>();
      File file0 = MockFile.createTempFile("ZipLong value: ", "ZipLong value: ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      vector0.add((SeekableByteChannel) fileChannel0);
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(vector0);
        fail("Expecting exception: NonReadableChannelException");
      
      } catch(NonReadableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      linkedList0.add((SeekableByteChannel) null);
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Stack<SeekableByteChannel> stack0 = new Stack<SeekableByteChannel>();
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(stack0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArrayList<SeekableByteChannel> arrayList0 = new ArrayList<SeekableByteChannel>();
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      ArrayDeque<Path> arrayDeque0 = new ArrayDeque<Path>(0);
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) arrayDeque0);
      arrayList0.add(seekableByteChannel0);
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(arrayList0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector<Path> vector0 = new Vector<Path>();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      vector0.addElement(path0);
      OpenOption[] openOptionArray0 = new OpenOption[4];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.CREATE_NEW;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[1] = (OpenOption) linkOption0;
      openOptionArray0[2] = (OpenOption) standardOpenOption0;
      openOptionArray0[3] = (OpenOption) standardOpenOption0;
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) vector0, openOptionArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector<Path> vector0 = new Vector<Path>();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      vector0.addElement(path0);
      OpenOption[] openOptionArray0 = new OpenOption[4];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) vector0, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector<Path> vector0 = new Vector<Path>();
      OpenOption[] openOptionArray0 = new OpenOption[4];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) vector0, openOptionArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[9];
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
  public void test30()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[1];
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
      assertNull(seekableByteChannel0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      Path[] pathArray0 = new Path[3];
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
  public void test33()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[0];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
      PriorityQueue<SeekableByteChannel> priorityQueue0 = new PriorityQueue<SeekableByteChannel>();
      priorityQueue0.add(seekableByteChannel0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannel0, (Iterable<SeekableByteChannel>) priorityQueue0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The first ZIP split segment does not begin with split ZIP file signature
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(">~!-(9(<wuZ");
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      LinkedHashSet<FileChannel> linkedHashSet0 = new LinkedHashSet<FileChannel>();
      ArrayDeque<SeekableByteChannel> arrayDeque0 = new ArrayDeque<SeekableByteChannel>(linkedHashSet0);
      arrayDeque0.add(fileChannel0);
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels((SeekableByteChannel) fileChannel0, (Iterable<SeekableByteChannel>) arrayDeque0);
        fail("Expecting exception: NonReadableChannelException");
      
      } catch(NonReadableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      File[] fileArray0 = new File[1];
      MockFile mockFile0 = new MockFile("", "");
      fileArray0[0] = (File) mockFile0;
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[1];
      seekableByteChannelArray0[0] = seekableByteChannel0;
      SeekableByteChannel seekableByteChannel1 = ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
      assertTrue(seekableByteChannel1.isOpen());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      PriorityQueue<File> priorityQueue0 = new PriorityQueue<File>();
      priorityQueue0.add(mockFile0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) priorityQueue0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      PriorityQueue<File> priorityQueue0 = new PriorityQueue<File>();
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) priorityQueue0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      PriorityQueue<SeekableByteChannel> priorityQueue1 = new PriorityQueue<SeekableByteChannel>(4, comparator0);
      SeekableByteChannel seekableByteChannel1 = ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannel0, (Iterable<SeekableByteChannel>) priorityQueue1);
      assertTrue(seekableByteChannel1.isOpen());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TreeSet<File> treeSet0 = new TreeSet<File>();
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles((File) null, (Iterable<File>) treeSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // lastSegmentFile
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment((File) mockFile0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
