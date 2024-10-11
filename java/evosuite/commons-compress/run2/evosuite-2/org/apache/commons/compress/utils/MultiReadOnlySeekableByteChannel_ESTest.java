
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
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MultiReadOnlySeekableByteChannel_ESTest extends MultiReadOnlySeekableByteChannel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Path[] pathArray0 = new Path[6];
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      pathArray0[1] = path0;
      pathArray0[2] = path0;
      pathArray0[3] = pathArray0[1];
      pathArray0[4] = pathArray0[0];
      pathArray0[5] = pathArray0[0];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forPaths(pathArray0);
      long long0 = seekableByteChannel0.size();
      assertEquals(3840L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      multiReadOnlySeekableByteChannel0.position(0L, 1654L);
      long long0 = multiReadOnlySeekableByteChannel0.position();
      assertEquals(1654L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File[] fileArray0 = new File[1];
      MockFile mockFile0 = new MockFile("", "");
      fileArray0[0] = (File) mockFile0;
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forFiles(fileArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[17];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
      // Undeclared exception!
      try { 
        seekableByteChannel0.size();
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
      File[] fileArray0 = new File[0];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forFiles(fileArray0);
      // Undeclared exception!
      try { 
        seekableByteChannel0.read((ByteBuffer) null);
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
        multiReadOnlySeekableByteChannel0.position((-1781L), 0L);
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
        multiReadOnlySeekableByteChannel0.position(0L, (-1750L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative position: -1750
         //
         verifyException("org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      linkedList0.add((SeekableByteChannel) null);
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      // Undeclared exception!
      try { 
        multiReadOnlySeekableByteChannel0.position(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.stream.MatchOps$1MatchSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      linkedList0.add((SeekableByteChannel) null);
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      Path[] pathArray0 = new Path[6];
      MockFile mockFile0 = new MockFile("Negative position: ");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      try { 
        MultiReadOnlySeekableByteChannel.forPaths(pathArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        MultiReadOnlySeekableByteChannel.forPaths((Path[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // paths must not be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File[] fileArray0 = new File[5];
      MockFile mockFile0 = new MockFile("");
      fileArray0[0] = (File) mockFile0;
      MockFile mockFile1 = new MockFile("M+t9", "M+t9");
      fileArray0[1] = (File) mockFile1;
      fileArray0[2] = (File) mockFile1;
      fileArray0[3] = (File) mockFile1;
      fileArray0[4] = (File) mockFile0;
      try { 
        MultiReadOnlySeekableByteChannel.forFiles(fileArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SeekableByteChannel[] seekableByteChannelArray0 = new SeekableByteChannel[17];
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      File[] fileArray0 = new File[0];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forFiles(fileArray0);
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      linkedList0.add(seekableByteChannel0);
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      multiReadOnlySeekableByteChannel0.position(1L);
      assertEquals(1L, multiReadOnlySeekableByteChannel0.position());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      boolean boolean0 = multiReadOnlySeekableByteChannel0.isOpen();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      linkedList0.addFirst(multiReadOnlySeekableByteChannel0);
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel1 = new MultiReadOnlySeekableByteChannel(linkedList0);
      long long0 = multiReadOnlySeekableByteChannel1.size();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      linkedList0.addFirst(multiReadOnlySeekableByteChannel0);
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel1 = new MultiReadOnlySeekableByteChannel(linkedList0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1073741824);
      int int0 = multiReadOnlySeekableByteChannel1.read(byteBuffer0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      int int0 = multiReadOnlySeekableByteChannel0.read(byteBuffer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Path[] pathArray0 = new Path[6];
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      pathArray0[1] = path0;
      pathArray0[2] = path0;
      pathArray0[3] = pathArray0[0];
      pathArray0[4] = path0;
      pathArray0[5] = pathArray0[4];
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = (MultiReadOnlySeekableByteChannel)MultiReadOnlySeekableByteChannel.forPaths(pathArray0);
      // Undeclared exception!
      try { 
        multiReadOnlySeekableByteChannel0.position(1708L, (-1197L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 6, Size: 6
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Path[] pathArray0 = new Path[6];
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      pathArray0[1] = path0;
      pathArray0[2] = pathArray0[1];
      pathArray0[3] = path0;
      pathArray0[4] = path0;
      pathArray0[5] = pathArray0[1];
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = (MultiReadOnlySeekableByteChannel)MultiReadOnlySeekableByteChannel.forPaths(pathArray0);
      multiReadOnlySeekableByteChannel0.close();
      try { 
        multiReadOnlySeekableByteChannel0.position(1708L, (-1197L));
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      linkedList0.add((SeekableByteChannel) multiReadOnlySeekableByteChannel0);
      linkedList0.addFirst(multiReadOnlySeekableByteChannel0);
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel1 = new MultiReadOnlySeekableByteChannel(linkedList0);
      SeekableByteChannel seekableByteChannel0 = multiReadOnlySeekableByteChannel1.position(0L);
      assertSame(multiReadOnlySeekableByteChannel1, seekableByteChannel0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      File[] fileArray0 = new File[0];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forFiles(fileArray0);
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      linkedList0.add(seekableByteChannel0);
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      multiReadOnlySeekableByteChannel0.position((-293L), 3262L);
      assertEquals(3262L, multiReadOnlySeekableByteChannel0.position());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      File[] fileArray0 = new File[0];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forFiles(fileArray0);
      // Undeclared exception!
      try { 
        seekableByteChannel0.position((-1162L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative position: -1162
         //
         verifyException("org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel", e);
      }
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
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      pathArray0[0] = path0;
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forPaths(pathArray0);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      File[] fileArray0 = new File[5];
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
  public void test28()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      byte[] byteArray0 = new byte[3];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
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
  public void test29()  throws Throwable  {
      File[] fileArray0 = new File[0];
      SeekableByteChannel seekableByteChannel0 = MultiReadOnlySeekableByteChannel.forFiles(fileArray0);
      long long0 = seekableByteChannel0.position();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<SeekableByteChannel> linkedList0 = new LinkedList<SeekableByteChannel>();
      MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel0 = new MultiReadOnlySeekableByteChannel(linkedList0);
      // Undeclared exception!
      try { 
        multiReadOnlySeekableByteChannel0.truncate(3499L);
        fail("Expecting exception: NonWritableChannelException");
      
      } catch(NonWritableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel", e);
      }
  }
}
