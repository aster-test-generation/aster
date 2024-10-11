
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


package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MultiReadOnlySeekableByteChannel_ESTest extends MultiReadOnlySeekableByteChannel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[5];
      seekableByteChannelArray0[0] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
      // Undeclared exception!
      try { 
        ((MultiReadOnlySeekableByteChannel) seekableByteChannel0).close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkedHashSet<StandardOpenOption> linkedHashSet0 = new LinkedHashSet<StandardOpenOption>();
      FileAttribute<File>[] fileAttributeArray0 = (FileAttribute<File>[]) Array.newInstance(FileAttribute.class, 0);
      FileChannel fileChannel0 = FileChannel.open(path0, (Set<? extends OpenOption>) linkedHashSet0, (FileAttribute<?>[]) fileAttributeArray0);
      linkedList0.add((SeekableByteChannel) fileChannel0);
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      long long0 = multiReadOnlySeekableByteChannel0.size();
      assertEquals(768L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File[] fileArray0 = new File[1];
      MockFile mockFile0 = new MockFile((String) null, "");
      fileArray0[0] = (File) mockFile0;
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forFiles(fileArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      linkedList0.addFirst((SeekableByteChannel) null);
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      // Undeclared exception!
      try { 
        multiReadOnlySeekableByteChannel0.size();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.stream.MatchOps$1MatchSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      // Undeclared exception!
      try { 
        multiReadOnlySeekableByteChannel0.read((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      linkedList0.add((SeekableByteChannel) null);
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      // Undeclared exception!
      try { 
        multiReadOnlySeekableByteChannel0.position(538L, 1057L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.stream.MatchOps$1MatchSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      // Undeclared exception!
      try { 
        multiReadOnlySeekableByteChannel0.position(1847L, (-1L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      // Undeclared exception!
      try { 
        multiReadOnlySeekableByteChannel0.position((-3553L), (-3553L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative position: -3553
         //
         verifyException("org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[6];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
      // Undeclared exception!
      try { 
        seekableByteChannel0.position(1014L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.stream.MatchOps$1MatchSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      linkedList0.add(0, (SeekableByteChannel) null);
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      // Undeclared exception!
      try { 
        multiReadOnlySeekableByteChannel0.isOpen();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.stream.MatchOps$1MatchSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        MultiReadOnlySeekableByteChannel.forSeekableByteChannels((SeekableByteChannel[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // channels must not be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Path[] pathArray0 = new Path[4];
      MockFile mockFile0 = new MockFile("l~od:", "l~od:");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      try { 
        MultiReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File[] fileArray0 = new File[1];
      MockFile mockFile0 = new MockFile((File) null, "52l8a,.");
      fileArray0[0] = (File) mockFile0;
      try { 
        MultiReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = null;
      try {
        multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel((List<SeekableByteChannel>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // channels must not be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[6];
      seekableByteChannelArray0[0] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[1] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[2] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[3] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[4] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[5] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
      seekableByteChannel0.position(1014L);
      assertEquals(1014L, seekableByteChannel0.position());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      linkedList0.add((SeekableByteChannel) multiReadOnlySeekableByteChannel0);
      linkedList0.add((SeekableByteChannel) multiReadOnlySeekableByteChannel0);
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel1 = new MultiReadOnlySeekableByteChannel(linkedList0);
      SeekableByteChannel seekableByteChannel0 = multiReadOnlySeekableByteChannel1.position(0L);
      assertSame(multiReadOnlySeekableByteChannel1, seekableByteChannel0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkedHashSet<StandardOpenOption> linkedHashSet0 = new LinkedHashSet<StandardOpenOption>();
      FileAttribute<File>[] fileAttributeArray0 = (FileAttribute<File>[]) Array.newInstance(FileAttribute.class, 0);
      FileChannel fileChannel0 = FileChannel.open(path0, (Set<? extends OpenOption>) linkedHashSet0, (FileAttribute<?>[]) fileAttributeArray0);
      linkedList0.add((SeekableByteChannel) fileChannel0);
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      multiReadOnlySeekableByteChannel0.position(449L);
      assertEquals(449L, multiReadOnlySeekableByteChannel0.position());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      SeekableByteChannel seekableByteChannel0 = multiReadOnlySeekableByteChannel0.position(449L);
      long long0 = seekableByteChannel0.position();
      assertEquals(449L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      boolean boolean0 = multiReadOnlySeekableByteChannel0.isOpen();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      linkedList0.add((SeekableByteChannel) multiReadOnlySeekableByteChannel0);
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel1 = new MultiReadOnlySeekableByteChannel(linkedList0);
      long long0 = multiReadOnlySeekableByteChannel1.size();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      byte[] byteArray0 = new byte[6];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[5];
      seekableByteChannelArray0[0] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[1] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[2] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[3] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[4] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
      int int0 = seekableByteChannel0.read(byteBuffer0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[5];
      seekableByteChannelArray0[0] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[1] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[2] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[3] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[4] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel1 = (MultiReadOnlySeekableByteChannel)MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
      multiReadOnlySeekableByteChannel1.position((-9L), 4L);
      assertEquals(4L, multiReadOnlySeekableByteChannel1.position());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Path[] pathArray0 = new Path[0];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forPaths(pathArray0);
      // Undeclared exception!
      try { 
        seekableByteChannel0.position((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative position: -1
         //
         verifyException("org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[5];
      seekableByteChannelArray0[0] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[1] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[2] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[3] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      seekableByteChannelArray0[4] = (SeekableByteChannel) multiReadOnlySeekableByteChannel0;
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel1 = (MultiReadOnlySeekableByteChannel)MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
      assertNotSame(multiReadOnlySeekableByteChannel1, multiReadOnlySeekableByteChannel0);
      
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel2 = (MultiReadOnlySeekableByteChannel)multiReadOnlySeekableByteChannel1.position((long) (byte)1, 0L);
      assertEquals(0L, multiReadOnlySeekableByteChannel2.position());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      multiReadOnlySeekableByteChannel0.close();
      assertEquals(0L, multiReadOnlySeekableByteChannel0.position());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[1];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
      assertNull(seekableByteChannel0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Path[] pathArray0 = new Path[1];
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forPaths(pathArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Path[] pathArray0 = new Path[1];
      // Undeclared exception!
      try { 
        MultiReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      File[] fileArray0 = new File[4];
      // Undeclared exception!
      try { 
        MultiReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(4591);
      // Undeclared exception!
      try { 
        multiReadOnlySeekableByteChannel0.write(byteBuffer0);
        fail("Expecting exception: NonWritableChannelException");
      
      } catch(NonWritableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      long long0 = multiReadOnlySeekableByteChannel0.position();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      // Undeclared exception!
      try { 
        multiReadOnlySeekableByteChannel0.truncate((byte)75);
        fail("Expecting exception: NonWritableChannelException");
      
      } catch(NonWritableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      int int0 = multiReadOnlySeekableByteChannel0.read(byteBuffer0);
      assertEquals(0, int0);
  }
}
