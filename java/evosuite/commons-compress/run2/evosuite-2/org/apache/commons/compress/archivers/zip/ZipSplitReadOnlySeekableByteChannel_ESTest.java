
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
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.NonReadableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel;
import org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipSplitReadOnlySeekableByteChannel_ESTest extends ZipSplitReadOnlySeekableByteChannel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Path[] pathArray0 = new Path[1];
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) path0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[2];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.CREATE;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      openOptionArray0[1] = (OpenOption) standardOpenOption0;
      FileChannel fileChannel0 = FileChannel.open(path0, openOptionArray0);
      TreeSet<SeekableByteChannel> treeSet0 = new TreeSet<SeekableByteChannel>();
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels((SeekableByteChannel) fileChannel0, (Iterable<SeekableByteChannel>) treeSet0);
      assertSame(seekableByteChannel0, fileChannel0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Path[] pathArray0 = new Path[9];
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      pathArray0[1] = pathArray0[0];
      pathArray0[2] = path0;
      pathArray0[3] = pathArray0[2];
      MockFile mockFile1 = new MockFile("", "channels must not be null");
      Path path1 = mockFile1.toPath();
      pathArray0[4] = path1;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      Path[] pathArray0 = new Path[6];
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      pathArray0[1] = pathArray0[0];
      pathArray0[2] = pathArray0[0];
      pathArray0[3] = pathArray0[2];
      pathArray0[4] = pathArray0[1];
      pathArray0[5] = pathArray0[0];
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Path> arrayList0 = new ArrayList<Path>();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      MockFile mockFile0 = new MockFile("The first ZIP split segment does not begin with split ZIP file signature");
      Path path0 = mockFile0.toPath();
      arrayList0.add(path0);
      StandardOpenOption standardOpenOption0 = StandardOpenOption.CREATE_NEW;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) arrayList0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector<Path> vector0 = new Vector<Path>(0, 0);
      OpenOption[] openOptionArray0 = new OpenOption[8];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[0] = (OpenOption) linkOption0;
      MockFile mockFile0 = new MockFile((String) null, "WiNeFWmUvxj");
      Path path0 = mockFile0.toPath();
      vector0.add(path0);
      StandardOpenOption standardOpenOption0 = StandardOpenOption.WRITE;
      openOptionArray0[1] = (OpenOption) standardOpenOption0;
      openOptionArray0[2] = (OpenOption) standardOpenOption0;
      openOptionArray0[3] = (OpenOption) standardOpenOption0;
      StandardOpenOption standardOpenOption1 = StandardOpenOption.APPEND;
      openOptionArray0[4] = (OpenOption) standardOpenOption1;
      openOptionArray0[5] = (OpenOption) standardOpenOption0;
      StandardOpenOption standardOpenOption2 = StandardOpenOption.READ;
      openOptionArray0[6] = (OpenOption) standardOpenOption2;
      openOptionArray0[7] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) vector0, openOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector<Path> vector0 = new Vector<Path>();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      vector0.add(path0);
      OpenOption[] openOptionArray0 = new OpenOption[4];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[0] = (OpenOption) linkOption0;
      StandardOpenOption standardOpenOption0 = StandardOpenOption.CREATE_NEW;
      openOptionArray0[1] = (OpenOption) standardOpenOption0;
      openOptionArray0[2] = (OpenOption) standardOpenOption0;
      StandardOpenOption standardOpenOption1 = StandardOpenOption.WRITE;
      openOptionArray0[3] = (OpenOption) standardOpenOption1;
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) vector0, openOptionArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector<Path> vector0 = new Vector<Path>();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      vector0.add(path0);
      vector0.add(0, path0);
      OpenOption[] openOptionArray0 = new OpenOption[0];
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) vector0, openOptionArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("KZtggWA)8a<(Rl>", "KZtggWA)8a<(Rl>");
      Path path0 = mockFile0.toPath();
      Stack<Path> stack0 = new Stack<Path>();
      ArrayList<Path> arrayList0 = new ArrayList<Path>(stack0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) arrayList0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[4];
      MockFile mockFile0 = new MockFile("')14-;gfOhVQ7XO(>f~");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      HashSet<SeekableByteChannel> hashSet0 = new HashSet<SeekableByteChannel>(1972);
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
  public void test15()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[0];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      linkedList0.add(seekableByteChannel0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannel0, (Iterable<SeekableByteChannel>) linkedList0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The first ZIP split segment does not begin with split ZIP file signature
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      File[] fileArray0 = new File[2];
      MockFile mockFile0 = new MockFile("e6&}n^9", "e6&}n^9");
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = (File) mockFile0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      File[] fileArray0 = new File[3];
      fileArray0[0] = (File) mockFile0;
      fileArray0[1] = (File) mockFile0;
      fileArray0[2] = (File) mockFile0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("UHTt\"5", "UHTt\"5");
      TreeSet<File> treeSet0 = new TreeSet<File>();
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) treeSet0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile(") Sk!Zug7`?Ee&wSD");
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
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("channels must not be null");
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      ArrayList<SeekableByteChannel> arrayList0 = new ArrayList<SeekableByteChannel>();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("paths must not be null");
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      arrayList0.add((SeekableByteChannel) fileChannel0);
      ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel0 = null;
      try {
        zipSplitReadOnlySeekableByteChannel0 = new ZipSplitReadOnlySeekableByteChannel(arrayList0);
        fail("Expecting exception: NonReadableChannelException");
      
      } catch(NonReadableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[0];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
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
  public void test29()  throws Throwable  {
      Vector<Path> vector0 = new Vector<Path>();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      vector0.add(path0);
      OpenOption[] openOptionArray0 = new OpenOption[0];
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) vector0, openOptionArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArrayList<Path> arrayList0 = new ArrayList<Path>();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      MockFile mockFile0 = new MockFile("The first ZIP split segment does not begin with split ZIP file signature");
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
  public void test31()  throws Throwable  {
      LinkedList<Path> linkedList0 = new LinkedList<Path>();
      OpenOption[] openOptionArray0 = new OpenOption[2];
      // Undeclared exception!
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths((List<Path>) linkedList0, openOptionArray0);
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
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[1];
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
      assertNull(seekableByteChannel0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      try { 
        ZipSplitReadOnlySeekableByteChannel.forPaths(path0, (Iterable<Path>) path0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Path[] pathArray0 = new Path[6];
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
  public void test36()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[0];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
      SeekableByteChannel[] seekableByteChannelArray1 = new SeekableByteChannel[9];
      seekableByteChannelArray1[0] = seekableByteChannel0;
      try { 
        ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The first ZIP split segment does not begin with split ZIP file signature
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      File[] fileArray0 = new File[1];
      fileArray0[0] = (File) mockFile0;
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      TreeSet<File> treeSet0 = new TreeSet<File>();
      treeSet0.add(mockFile0);
      try { 
        ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) treeSet0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      TreeSet<File> treeSet0 = new TreeSet<File>();
      SeekableByteChannel seekableByteChannel0 = ZipSplitReadOnlySeekableByteChannel.forFiles((File) mockFile0, (Iterable<File>) treeSet0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
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
