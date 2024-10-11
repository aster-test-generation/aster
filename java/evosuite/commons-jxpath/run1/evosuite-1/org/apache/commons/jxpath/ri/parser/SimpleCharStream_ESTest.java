
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


package org.apache.commons.jxpath.ri.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.Enumeration;
import org.apache.commons.jxpath.ri.parser.SimpleCharStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SimpleCharStream_ESTest extends SimpleCharStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      long long0 = pipedInputStream0.skip((-156L));
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0L, long0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 454, 454, 454);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.maxNextCharInd = 454;
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char char0 = simpleCharStream0.readChar();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(454, simpleCharStream0.getBeginColumn());
      assertEquals(454, simpleCharStream0.getBeginLine());
      assertEquals(454, simpleCharStream0.getColumn());
      assertEquals(454, simpleCharStream0.getLine());
      assertEquals(454, simpleCharStream0.getEndLine());
      assertEquals(454, simpleCharStream0.getEndColumn());
      assertEquals('\u0000', char0);
      
      char char1 = simpleCharStream0.readChar();
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertTrue(char1 == char0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(454, simpleCharStream0.getBeginColumn());
      assertEquals(454, simpleCharStream0.getBeginLine());
      assertEquals(455, simpleCharStream0.getColumn());
      assertEquals(454, simpleCharStream0.getLine());
      assertEquals(454, simpleCharStream0.getEndLine());
      assertEquals(455, simpleCharStream0.getEndColumn());
      assertEquals('\u0000', char1);
      
      char char2 = simpleCharStream0.readChar();
      assertEquals(2, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertTrue(char2 == char1);
      assertTrue(char2 == char0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(454, simpleCharStream0.getBeginColumn());
      assertEquals(454, simpleCharStream0.getBeginLine());
      assertEquals(454, simpleCharStream0.getLine());
      assertEquals(456, simpleCharStream0.getEndColumn());
      assertEquals(454, simpleCharStream0.getEndLine());
      assertEquals(456, simpleCharStream0.getColumn());
      assertEquals('\u0000', char2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 0, 4140);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.available = 4140;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.adjustBeginLineColumn(1, 1);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getBeginLine());
      
      int int0 = sequenceInputStream0.read();
      assertEquals((-1), int0);
      
      simpleCharStream0.bufpos = 0;
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getEndLine());
      assertEquals(2, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(2, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      
      sequenceInputStream0.close();
      simpleCharStream0.UpdateLineColumn('_');
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2, simpleCharStream0.getEndLine());
      assertEquals(2, simpleCharStream0.getBeginLine());
      assertEquals(2, simpleCharStream0.getColumn());
      assertEquals(2, simpleCharStream0.getLine());
      assertEquals(2, simpleCharStream0.getEndColumn());
      assertEquals(2, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.adjustBeginLineColumn(4140, (-1));
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals(4140, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(4140, simpleCharStream0.getEndLine());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(4140, simpleCharStream0.getBeginLine());
      
      int int1 = simpleCharStream0.getEndColumn();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertTrue(int1 == int0);
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals(4140, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(4140, simpleCharStream0.getEndLine());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(4140, simpleCharStream0.getBeginLine());
      assertEquals((-1), int1);
      
      int int2 = simpleCharStream0.getEndLine();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals(4140, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(4140, simpleCharStream0.getEndLine());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(4140, simpleCharStream0.getBeginLine());
      assertEquals(4140, int2);
      
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(4140, simpleCharStream0.getBeginLine());
      
      int int3 = simpleCharStream0.getBeginLine();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(int3 == int1);
      assertTrue(int3 == int2);
      assertFalse(int3 == int0);
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(4140, simpleCharStream0.getBeginLine());
      assertEquals(4140, int3);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      assertFalse(boolean0);
      
      StringReader stringReader0 = new StringReader("(Dd@/ ETf");
      assertNotNull(stringReader0);
      
      stringReader0.reset();
      int int0 = 0;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, true).when(enumeration0).hasMoreElements();
      doReturn((MockFileInputStream) null).when(enumeration0).nextElement();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.available = 0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = sequenceInputStream0.read();
      assertEquals((-1), int0);
      
      simpleCharStream0.bufpos = 0;
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      sequenceInputStream0.close();
      simpleCharStream0.UpdateLineColumn('_');
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.adjustBeginLineColumn(0, (-1));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int1 = simpleCharStream0.getEndLine();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(int1 == int0);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int1);
      
      simpleCharStream0.tokenBegin = 2504;
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int2 = simpleCharStream0.getBeginLine();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int2);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "AD-05N;n!sgQ");
      assertFalse(boolean0);
      
      StringReader stringReader0 = new StringReader("AD-05N;n!sgQ");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 10, 10);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-44);
      byteArray0[1] = (byte) (-54);
      byteArray0[2] = (byte)7;
      byteArray0[3] = (byte) (-91);
      byteArray0[4] = (byte)109;
      boolean boolean1 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertTrue(boolean1 == boolean0);
      assertArrayEquals(new byte[] {(byte) (-44), (byte) (-54), (byte)7, (byte) (-91), (byte)109}, byteArray0);
      assertEquals(5, byteArray0.length);
      assertFalse(boolean1);
      
      simpleCharStream0.backup(1);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4094, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      int int0 = simpleCharStream0.getLine();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4094, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      StringReader stringReader0 = new StringReader(" 8t[JeQ%");
      assertNotNull(stringReader0);
      
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      assertNotNull(charBuffer0);
      assertArrayEquals(new char[] {}, charArray0);
      assertEquals(0, charArray0.length);
      assertEquals("", charBuffer0.toString());
      assertFalse(charBuffer0.isDirect());
      assertTrue(charBuffer0.hasArray());
      assertEquals(0, charBuffer0.length());
      assertEquals(0, charBuffer0.position());
      assertFalse(charBuffer0.isReadOnly());
      assertEquals(0, charBuffer0.remaining());
      assertEquals(0, charBuffer0.capacity());
      assertFalse(charBuffer0.hasRemaining());
      assertEquals(0, charBuffer0.limit());
      assertEquals(0, charBuffer0.arrayOffset());
      
      int int0 = stringReader0.read(charBuffer0);
      assertArrayEquals(new char[] {}, charArray0);
      assertEquals(0, charArray0.length);
      assertEquals("", charBuffer0.toString());
      assertFalse(charBuffer0.isDirect());
      assertTrue(charBuffer0.hasArray());
      assertEquals(0, charBuffer0.length());
      assertEquals(0, charBuffer0.position());
      assertFalse(charBuffer0.isReadOnly());
      assertEquals(0, charBuffer0.remaining());
      assertEquals(0, charBuffer0.capacity());
      assertFalse(charBuffer0.hasRemaining());
      assertEquals(0, charBuffer0.limit());
      assertEquals(0, charBuffer0.arrayOffset());
      assertEquals(0, int0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 7, 1);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.bufsize = 1;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.bufsize = 1;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int1 = simpleCharStream0.getBeginColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertTrue(int1 == int0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int1);
      
      CharBuffer charBuffer1 = CharBuffer.allocate(4063);
      assertNotNull(charBuffer1);
      assertFalse(charBuffer1.equals((Object)charBuffer0));
      assertNotSame(charBuffer1, charBuffer0);
      assertEquals(4063, charBuffer1.limit());
      assertEquals(4063, charBuffer1.remaining());
      assertEquals(0, charBuffer1.arrayOffset());
      assertTrue(charBuffer1.hasRemaining());
      assertFalse(charBuffer1.isDirect());
      assertTrue(charBuffer1.hasArray());
      assertEquals(0, charBuffer1.position());
      assertFalse(charBuffer1.isReadOnly());
      assertEquals(4063, charBuffer1.capacity());
      assertEquals(4063, charBuffer1.length());
      
      Buffer buffer0 = charBuffer1.limit(1);
      assertNotNull(buffer0);
      assertFalse(charBuffer1.equals((Object)charBuffer0));
      assertNotSame(charBuffer1, charBuffer0);
      assertEquals(1, charBuffer1.limit());
      assertEquals(1, charBuffer1.remaining());
      assertEquals(0, charBuffer1.arrayOffset());
      assertTrue(charBuffer1.hasRemaining());
      assertFalse(charBuffer1.isDirect());
      assertEquals("\u0000", charBuffer1.toString());
      assertTrue(charBuffer1.hasArray());
      assertEquals(1, charBuffer1.length());
      assertEquals(0, charBuffer1.position());
      assertFalse(charBuffer1.isReadOnly());
      assertEquals(4063, charBuffer1.capacity());
      assertEquals(4063, buffer0.capacity());
      assertFalse(buffer0.isReadOnly());
      assertEquals(1, buffer0.remaining());
      assertTrue(buffer0.hasArray());
      assertTrue(buffer0.hasRemaining());
      assertEquals(0, buffer0.position());
      assertFalse(buffer0.isDirect());
      assertEquals(0, buffer0.arrayOffset());
      assertEquals(1, buffer0.limit());
      
      int int2 = stringReader0.read(charBuffer1);
      assertTrue(charBuffer1.equals((Object)charBuffer0));
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertNotSame(charBuffer1, charBuffer0);
      assertEquals(1, charBuffer1.limit());
      assertEquals(0, charBuffer1.remaining());
      assertFalse(charBuffer1.hasRemaining());
      assertEquals(1, charBuffer1.position());
      assertEquals(0, charBuffer1.arrayOffset());
      assertFalse(charBuffer1.isDirect());
      assertEquals("", charBuffer1.toString());
      assertEquals(0, charBuffer1.length());
      assertTrue(charBuffer1.hasArray());
      assertFalse(charBuffer1.isReadOnly());
      assertEquals(4063, charBuffer1.capacity());
      assertEquals(1, int2);
      
      int int3 = stringReader0.read();
      assertFalse(int3 == int1);
      assertFalse(int3 == int2);
      assertFalse(int3 == int0);
      assertEquals(56, int3);
      
      char char0 = simpleCharStream0.readChar();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(7, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(7, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(7, simpleCharStream0.getEndLine());
      assertEquals('t', char0);
      
      simpleCharStream0.UpdateLineColumn('t');
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(2, simpleCharStream0.getColumn());
      assertEquals(7, simpleCharStream0.getLine());
      assertEquals(7, simpleCharStream0.getBeginLine());
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getEndColumn());
      assertEquals(7, simpleCharStream0.getEndLine());
      
      boolean boolean1 = FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
      
      int int4 = simpleCharStream0.getLine();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(int4 == int1);
      assertFalse(int4 == int0);
      assertFalse(int4 == int2);
      assertFalse(int4 == int3);
      assertEquals(2, simpleCharStream0.getColumn());
      assertEquals(7, simpleCharStream0.getLine());
      assertEquals(7, simpleCharStream0.getBeginLine());
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getEndColumn());
      assertEquals(7, simpleCharStream0.getEndLine());
      assertEquals(7, int4);
      
      int int5 = simpleCharStream0.getLine();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(int5 == int3);
      assertTrue(int5 == int4);
      assertFalse(int5 == int1);
      assertFalse(int5 == int2);
      assertFalse(int5 == int0);
      assertEquals(2, simpleCharStream0.getColumn());
      assertEquals(7, simpleCharStream0.getLine());
      assertEquals(7, simpleCharStream0.getBeginLine());
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getEndColumn());
      assertEquals(7, simpleCharStream0.getEndLine());
      assertEquals(7, int5);
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(2, simpleCharStream0.getColumn());
      assertEquals(7, simpleCharStream0.getLine());
      assertEquals(7, simpleCharStream0.getBeginLine());
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getEndColumn());
      assertEquals(7, simpleCharStream0.getEndLine());
      assertEquals("t", string0);
      
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      assertFalse(boolean0);
      
      StringReader stringReader0 = new StringReader("D Y'u[!>N");
      assertNotNull(stringReader0);
      
      stringReader0.mark(10);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.Done();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      char[] charArray0 = new char[9];
      charArray0[0] = 'z';
      charArray0[1] = '2';
      charArray0[2] = 'w';
      charArray0[3] = '0';
      charArray0[4] = 'H';
      charArray0[5] = 'z';
      charArray0[6] = 'O';
      charArray0[7] = 'K';
      charArray0[8] = 'V';
      int int0 = stringReader0.read(charArray0);
      assertArrayEquals(new char[] {'D', ' ', 'Y', '\'', 'u', '[', '!', '>', 'N'}, charArray0);
      assertEquals(9, charArray0.length);
      assertEquals(9, int0);
      
      simpleCharStream0.bufpos = 1300;
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((Reader) stringReader0, 0, (-3130), (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^q'zL*AadQ8k~b");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.inBuf = 0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.inBuf = (-885);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.bufpos = 747;
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals(747, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, int0);
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals(748, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals('\u0000', char0);
      
      simpleCharStream0.line = 0;
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      
      long long0 = stringReader0.skip(0L);
      assertEquals(0L, long0);
      
      simpleCharStream0.bufsize = 747;
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      
      simpleCharStream0.column = 0;
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      
      simpleCharStream0.adjustBeginLineColumn(0, 0);
      assertEquals(748, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = "!@g,vh$uu^y=1@";
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      assertNotNull(fileSystemHandling0);
      
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)69;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, (byte)69, (byte)69);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      assertNotNull(fileSystemHandling1);
      assertFalse(fileSystemHandling1.equals((Object)fileSystemHandling0));
      
      char[] charArray0 = simpleCharStream0.GetSuffix((byte)69);
      assertNotNull(charArray0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(69, charArray0.length);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      byteArray0[2] = (byte)0;
      boolean boolean0 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)69, (byte)0}, byteArray0);
      assertEquals(3, byteArray0.length);
      assertFalse(boolean0);
      
      StringReader stringReader0 = new StringReader("!@g,vh$uu^y=1@");
      assertNotNull(stringReader0);
      
      boolean boolean1 = stringReader0.ready();
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
      
      boolean boolean2 = stringReader0.markSupported();
      assertFalse(boolean2 == boolean0);
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2);
      
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(stringReader0, 0, 0, 0);
      assertNotNull(simpleCharStream1);
      assertEquals((-1), simpleCharStream1.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(simpleCharStream1.equals((Object)simpleCharStream0));
      
      int int0 = 0;
      int int1 = 2158;
      // Undeclared exception!
      try { 
        simpleCharStream1.getBeginColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      boolean boolean0 = sequenceInputStream0.markSupported();
      assertFalse(boolean0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 58, 4096);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.available = 4096;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int0 = sequenceInputStream0.read();
      assertEquals((-1), int0);
      
      simpleCharStream0.bufpos = 58;
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      sequenceInputStream0.close();
      simpleCharStream0.UpdateLineColumn('_');
      assertEquals(58, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(58, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(4096, simpleCharStream0.getColumn());
      assertEquals(58, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(4096, simpleCharStream0.getEndColumn());
      
      simpleCharStream0.adjustBeginLineColumn(4096, (-1));
      assertEquals(58, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4096, simpleCharStream0.getBeginLine());
      assertEquals(4096, simpleCharStream0.getColumn());
      assertEquals(4097, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(4097, simpleCharStream0.getEndLine());
      assertEquals(4096, simpleCharStream0.getEndColumn());
      
      int int1 = simpleCharStream0.getEndLine();
      assertEquals(58, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(int1 == int0);
      assertEquals(4096, simpleCharStream0.getBeginLine());
      assertEquals(4096, simpleCharStream0.getColumn());
      assertEquals(4097, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(4097, simpleCharStream0.getEndLine());
      assertEquals(4096, simpleCharStream0.getEndColumn());
      assertEquals(4097, int1);
      
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4096, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      
      int int2 = simpleCharStream0.getBeginLine();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(4096, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(4096, int2);
      
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, true).when(enumeration0).hasMoreElements();
      doReturn((Object) null).when(enumeration0).nextElement();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.available = 0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = sequenceInputStream0.read();
      assertEquals((-1), int0);
      
      simpleCharStream0.bufpos = 0;
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      sequenceInputStream0.close();
      simpleCharStream0.UpdateLineColumn('_');
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      simpleCharStream0.adjustBeginLineColumn(0, (-1));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      int int1 = simpleCharStream0.getEndLine();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(int1 == int0);
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, int1);
      
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int2 = simpleCharStream0.getBeginLine();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int2);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^q'zL*AadQ8k~b");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.inBuf = 0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = simpleCharStream0.getBeginLine();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int0);
      
      char char0 = simpleCharStream0.BeginToken();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals('^', char0);
      
      simpleCharStream0.line = 0;
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      
      long long0 = stringReader0.skip(0L);
      assertEquals(0L, long0);
      
      simpleCharStream0.bufsize = 747;
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      
      simpleCharStream0.column = 0;
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      
      simpleCharStream0.adjustBeginLineColumn(0, 0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      
      char char1 = simpleCharStream0.BeginToken();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(char1 == char0);
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals('q', char1);
      
      simpleCharStream0.prevCharIsLF = false;
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      
      int int1 = simpleCharStream0.getBeginColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(int1 == int0);
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, int1);
      
      int int2 = simpleCharStream0.getBeginColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, int2);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(747);
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 1);
      assertNotNull(pushbackInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      simpleCharStream0.ReInit((InputStream) pushbackInputStream0, 0, 2166, 0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, pipedInputStream0.available());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      pipedInputStream0.close();
      assertEquals(0, pipedInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 1757, 2048);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.bufpos = 2048;
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.maxNextCharInd = (-1);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char[] charArray0 = simpleCharStream0.GetSuffix(2048);
      assertNotNull(charArray0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2048, simpleCharStream0.bufpos);
      assertEquals(2048, charArray0.length);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = simpleCharStream0.getColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2048, simpleCharStream0.bufpos);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int0);
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2048, simpleCharStream0.bufpos);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      StringReader stringReader0 = new StringReader(")kY");
      assertNotNull(stringReader0);
      
      int int1 = 0;
      // Undeclared exception!
      try { 
        stringReader0.read(charArray0, 4534, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "2Gs;I");
      assertFalse(boolean0);
      
      boolean boolean1 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      
      StringReader stringReader0 = new StringReader("cSqmsAmwI,9LT");
      assertNotNull(stringReader0);
      
      boolean boolean2 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      assertTrue(boolean2 == boolean0);
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2);
      
      stringReader0.close();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1, (-1684));
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int[] intArray0 = new int[9];
      intArray0[0] = (-1684);
      simpleCharStream0.bufpos = (-2109);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      intArray0[1] = (-1684);
      intArray0[2] = (-2109);
      intArray0[3] = (-2109);
      intArray0[4] = (-2109);
      intArray0[5] = (-2109);
      intArray0[6] = 1;
      intArray0[7] = 1;
      intArray0[8] = 1;
      simpleCharStream0.bufcolumn = intArray0;
      assertEquals((-1684), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.adjustBeginLineColumn((-698), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      assertFalse(boolean0);
      
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      assertNotNull(bufferedInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0, (-1294), 718);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.maxNextCharInd = 718;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int0 = simpleCharStream0.getBeginColumn();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, int0);
      
      long long0 = bufferedInputStream0.skip(0L);
      assertEquals(0L, long0);
      
      simpleCharStream0.ExpandBuff(false);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.column = 4096;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.available = (-1068);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^q'zL*AadQ8k~b");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.bufpos = 0;
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      simpleCharStream0.inBuf = (-869);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      simpleCharStream0.inBuf = 747;
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      int int0 = simpleCharStream0.getBeginLine();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, int0);
      
      char char0 = simpleCharStream0.BeginToken();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals('\u0000', char0);
      
      simpleCharStream0.line = 0;
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      long long0 = stringReader0.skip(0L);
      assertEquals(0L, long0);
      
      simpleCharStream0.bufsize = 747;
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      simpleCharStream0.column = 0;
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      simpleCharStream0.adjustBeginLineColumn(0, 0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      char char1 = simpleCharStream0.BeginToken();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2, simpleCharStream0.bufpos);
      assertTrue(char1 == char0);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals('\u0000', char1);
      
      simpleCharStream0.prevCharIsLF = false;
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      int int1 = simpleCharStream0.getBeginColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2, simpleCharStream0.bufpos);
      assertTrue(int1 == int0);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, int1);
      
      int int2 = simpleCharStream0.getBeginColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2, simpleCharStream0.bufpos);
      assertTrue(int2 == int1);
      assertTrue(int2 == int0);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, int2);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(747);
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      PushbackInputStream pushbackInputStream0 = null;
      try {
        pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // size <= 0
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("J$mP2CO uyNWb90");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.Done();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getColumn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      assertNotNull(fileSystemHandling0);
      
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)69;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, (byte)69, (byte)69);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char[] charArray0 = simpleCharStream0.GetSuffix((byte)69);
      assertNotNull(charArray0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(69, charArray0.length);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      byteArray0[2] = (byte)0;
      boolean boolean0 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)69, (byte)0}, byteArray0);
      assertEquals(3, byteArray0.length);
      assertFalse(boolean0);
      
      StringReader stringReader0 = new StringReader("!@g,vh$uu^y=1@");
      assertNotNull(stringReader0);
      
      int int0 = 0;
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(stringReader0, 0, 0, 0);
      assertNotNull(simpleCharStream1);
      assertEquals((-1), simpleCharStream1.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(simpleCharStream1.equals((Object)simpleCharStream0));
      
      int int1 = 0;
      int int2 = 0;
      // Undeclared exception!
      try { 
        CharBuffer.wrap((CharSequence) "!@g,vh$uu^y=1@", 0, 2158);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader(")eQ-K]D>I$p2SRZg");
      assertNotNull(stringReader0);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      int int0 = (-1);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, (-1));
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char char0 = simpleCharStream0.readChar();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(')', char0);
      
      stringReader0.close();
      int int1 = simpleCharStream0.getBeginLine();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(int1 == int0);
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int1);
      
      int int2 = simpleCharStream0.getColumn();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(int2 == int1);
      assertTrue(int2 == int0);
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), int2);
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("EnCC.\"[4DU");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      intArray0[1] = (-1);
      intArray0[2] = 4554;
      intArray0[3] = (-1);
      intArray0[4] = (-1);
      intArray0[5] = (-1);
      simpleCharStream0.bufline = intArray0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.adjustBeginLineColumn(0, (-835));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("nrX)3bWCx");
      assertNotNull(stringReader0);
      
      boolean boolean0 = stringReader0.ready();
      assertTrue(boolean0);
      
      char[] charArray0 = new char[4];
      charArray0[0] = 'V';
      charArray0[1] = 'w';
      charArray0[2] = '0';
      charArray0[3] = '';
      int int0 = stringReader0.read(charArray0);
      assertArrayEquals(new char[] {'n', 'r', 'X', ')'}, charArray0);
      assertEquals(4, charArray0.length);
      assertEquals(4, int0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2048, (-2650));
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-2650), simpleCharStream0.getEndColumn());
      assertEquals((-2650), simpleCharStream0.getBeginColumn());
      assertEquals(2048, simpleCharStream0.getEndLine());
      assertEquals(2048, simpleCharStream0.getBeginLine());
      assertEquals((-2650), simpleCharStream0.getColumn());
      assertEquals(2048, simpleCharStream0.getLine());
      assertEquals('3', char0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"quW]V|Wu1");
      assertNotNull(stringReader0);
      
      int int0 = (-1);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), (-1));
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int1 = (-1394);
      simpleCharStream0.bufpos = (-1394);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.Done();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1394), simpleCharStream0.bufpos);
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int2 = (-299);
      simpleCharStream0.adjustBeginLineColumn((-1), (-299));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals((-299), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      int int3 = (-113);
      simpleCharStream0.ReInit((Reader) stringReader0, (-113), (-113), 0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("AtD^{");
      assertNotNull(stringReader0);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.prevCharIsLF = true;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char char0 = simpleCharStream0.BeginToken();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals('A', char0);
      
      simpleCharStream0.tokenBegin = 0;
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      
      int int0 = simpleCharStream0.getColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, int0);
      
      int int1 = simpleCharStream0.getEndLine();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertTrue(int1 == int0);
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, int1);
      
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-106);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-111);
      byteArray0[6] = (byte)111;
      byteArray0[7] = (byte)115;
      byteArray0[8] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-106), (byte)0, (byte) (-111), (byte)111, (byte)115, (byte)1}, byteArray0);
      assertEquals(9, byteArray0.length);
      assertEquals(9, byteArrayInputStream0.available());
      
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-106), (byte)0, (byte) (-111), (byte)111, (byte)115, (byte)1}, byteArray0);
      assertEquals(9, byteArray0.length);
      assertEquals(9, byteArrayInputStream0.available());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.Done();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("p5LuETa Vck1?!h@WR");
      assertNotNull(stringReader0);
      
      char[] charArray0 = new char[9];
      charArray0[0] = 'M';
      charArray0[1] = '7';
      charArray0[2] = '<';
      charArray0[3] = 'q';
      charArray0[4] = 'K';
      charArray0[5] = '[';
      charArray0[6] = '$';
      charArray0[7] = 'L';
      int int0 = stringReader0.read();
      assertEquals(112, int0);
      
      charArray0[8] = '[';
      int int1 = stringReader0.read(charArray0);
      assertFalse(int1 == int0);
      assertArrayEquals(new char[] {'5', 'L', 'u', 'E', 'T', 'a', ' ', 'V', 'c'}, charArray0);
      assertEquals(9, charArray0.length);
      assertEquals(9, int1);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int2 = simpleCharStream0.getBeginColumn();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int2);
      
      simpleCharStream0.backup((-1));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int3 = simpleCharStream0.getColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(int3 == int1);
      assertTrue(int3 == int2);
      assertFalse(int3 == int0);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int3);
      
      char char0 = simpleCharStream0.BeginToken();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals('k', char0);
      
      int int4 = simpleCharStream0.getEndColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(int4 == int2);
      assertFalse(int4 == int3);
      assertFalse(int4 == int1);
      assertFalse(int4 == int0);
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, int4);
      
      simpleCharStream0.line = 9;
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      
      int int5 = simpleCharStream0.getBeginColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(int5 == int3);
      assertFalse(int5 == int1);
      assertFalse(int5 == int0);
      assertTrue(int5 == int4);
      assertFalse(int5 == int2);
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, int5);
      
      int int6 = simpleCharStream0.getBeginColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(int6 == int2);
      assertTrue(int6 == int4);
      assertFalse(int6 == int3);
      assertFalse(int6 == int0);
      assertTrue(int6 == int5);
      assertFalse(int6 == int1);
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, int6);
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals("k", string0);
      
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0, 0, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      boolean boolean0 = stringReader0.ready();
      assertTrue(boolean0);
      
      simpleCharStream0.prevCharIsLF = true;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.backup((-2108));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2107, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2107, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      int int0 = simpleCharStream0.getBeginColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2107, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, int0);
      
      boolean boolean1 = stringReader0.ready();
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      
      simpleCharStream0.prevCharIsCR = true;
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      int int1 = simpleCharStream0.getColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2107, simpleCharStream0.bufpos);
      assertTrue(int1 == int0);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, int1);
      
      simpleCharStream0.backup(0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2107, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      int int2 = simpleCharStream0.getColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2107, simpleCharStream0.bufpos);
      assertTrue(int2 == int0);
      assertTrue(int2 == int1);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, int2);
      
      int int3 = simpleCharStream0.getEndColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2107, simpleCharStream0.bufpos);
      assertTrue(int3 == int1);
      assertTrue(int3 == int2);
      assertTrue(int3 == int0);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, int3);
      
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)0);
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertEquals(2, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, (-1), (int) (byte)0, (-1836));
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertEquals(2, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-100);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-32);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      int int0 = sequenceInputStream0.read(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-100), (byte) (-1), (byte) (-32), (byte)0, (byte) (-1), (byte)0}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals((-1), int0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.backup(4096);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int1 = simpleCharStream0.getBeginLine();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(int1 == int0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int1);
      
      char char0 = simpleCharStream0.readChar();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("J$mP2CO uyNWb90");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((InputStream) null, 823, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-36);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-10);
      byteArray0[5] = (byte) (-2);
      byteArray0[6] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1020), 2321);
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-36), (byte)0, (byte)0, (byte) (-10), (byte) (-2), (byte) (-1)}, byteArray0);
      assertEquals(7, byteArray0.length);
      assertEquals(1027, byteArrayInputStream0.available());
      
      long long0 = byteArrayInputStream0.skip(0L);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-36), (byte)0, (byte)0, (byte) (-10), (byte) (-2), (byte) (-1)}, byteArray0);
      assertEquals(7, byteArray0.length);
      assertEquals(1027, byteArrayInputStream0.available());
      assertEquals(0L, long0);
      
      byteArrayInputStream0.reset();
      assertArrayEquals(new byte[] {(byte)0, (byte) (-36), (byte)0, (byte)0, (byte) (-10), (byte) (-2), (byte) (-1)}, byteArray0);
      assertEquals(7, byteArray0.length);
      assertEquals(1027, byteArrayInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte) (-10), 970, 4577);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-36), (byte)0, (byte)0, (byte) (-10), (byte) (-2), (byte) (-1)}, byteArray0);
      assertEquals(7, byteArray0.length);
      assertEquals(1027, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      byteArrayInputStream0.mark(1905);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-36), (byte)0, (byte)0, (byte) (-10), (byte) (-2), (byte) (-1)}, byteArray0);
      assertEquals(7, byteArray0.length);
      assertEquals(1027, byteArrayInputStream0.available());
      
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      char[] charArray0 = new char[0];
      simpleCharStream0.buffer = charArray0;
      assertEquals(1027, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.ReInit((Reader) stringReader0, (int) (byte)0, (int) (byte) (-10), (int) (byte)0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-36), (byte)0, (byte)0, (byte) (-10), (byte) (-2), (byte) (-1)}, byteArray0);
      assertEquals(7, byteArray0.length);
      assertEquals(1027, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((Reader) stringReader0, 0, (int) (byte)0, (int) (byte) (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("sD>:|xsdfXlOK:G");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1173, 1173);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1173, simpleCharStream0.getLine());
      assertEquals(1173, simpleCharStream0.getBeginLine());
      assertEquals(1173, simpleCharStream0.getColumn());
      assertEquals(1173, simpleCharStream0.getEndColumn());
      assertEquals(1173, simpleCharStream0.getEndLine());
      assertEquals(1173, simpleCharStream0.getBeginColumn());
      assertEquals('s', char0);
      
      stringReader0.reset();
      int int0 = stringReader0.read();
      assertEquals(115, int0);
      
      simpleCharStream0.backup(1173);
      assertEquals(2923, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1173, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(1173, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      
      simpleCharStream0.column = 1173;
      assertEquals(1173, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(1173, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      
      int int1 = simpleCharStream0.getBeginColumn();
      assertEquals(2923, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(int1 == int0);
      assertEquals(1173, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(1173, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(1173, int1);
      
      char[] charArray0 = new char[4];
      charArray0[0] = 's';
      charArray0[1] = 's';
      simpleCharStream0.inBuf = 115;
      assertEquals(1173, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(1173, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      
      int[] intArray0 = new int[2];
      intArray0[0] = (int) 's';
      intArray0[1] = 1173;
      simpleCharStream0.bufcolumn = intArray0;
      assertEquals(1173, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(115, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      charArray0[2] = 's';
      simpleCharStream0.column = 1173;
      assertEquals(1173, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(115, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      charArray0[3] = '_';
      int int2 = stringReader0.read(charArray0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertArrayEquals(new char[] {'D', '>', ':', '|'}, charArray0);
      assertEquals(4, charArray0.length);
      assertEquals(4, int2);
      
      simpleCharStream0.backup(1);
      assertEquals(2922, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1173, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(115, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(1173, simpleCharStream0.getBeginLine());
      assertEquals(115, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.backup(1173);
      assertEquals(2922, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1173, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(115, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      int int3 = simpleCharStream0.getBeginColumn();
      assertEquals(2922, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertTrue(int3 == int0);
      assertFalse(int3 == int2);
      assertFalse(int3 == int1);
      assertEquals(1173, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(115, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(115, int3);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((Reader) null, 1163, (-3106), (-1666));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{*W$0mh");
      assertNotNull(stringReader0);
      
      int int0 = 959;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 959, 959);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char char0 = simpleCharStream0.readChar();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(959, simpleCharStream0.getBeginLine());
      assertEquals(959, simpleCharStream0.getEndColumn());
      assertEquals(959, simpleCharStream0.getEndLine());
      assertEquals(959, simpleCharStream0.getBeginColumn());
      assertEquals(959, simpleCharStream0.getColumn());
      assertEquals(959, simpleCharStream0.getLine());
      assertEquals('{', char0);
      
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      assertNotNull(fileDescriptor0);
      assertFalse(fileDescriptor0.valid());
      
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      assertNotNull(mockFileInputStream0);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      char[] charArray0 = new char[2];
      charArray0[0] = '{';
      charArray0[1] = '{';
      int int1 = stringReader0.read(charArray0);
      assertFalse(int1 == int0);
      assertArrayEquals(new char[] {'{', '{'}, charArray0);
      assertEquals(2, charArray0.length);
      assertEquals((-1), int1);
      
      simpleCharStream0.ReInit((InputStream) mockFileInputStream0, 959, 0, (-646));
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(959, simpleCharStream0.getBeginLine());
      assertEquals(959, simpleCharStream0.getBeginColumn());
      assertFalse(fileDescriptor0.valid());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(959, simpleCharStream0.getBeginLine());
      assertEquals(959, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(959, simpleCharStream0.getBeginLine());
      assertEquals(959, simpleCharStream0.getBeginColumn());
      
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("A@|9Z2");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      simpleCharStream0.prevCharIsLF = true;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.inBuf = 0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      long long0 = stringReader0.skip(1L);
      assertEquals(1L, long0);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn(';');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.prevCharIsCR = true;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.adjustBeginLineColumn(0, (-1));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = 4096;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 4096, 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      boolean boolean0 = true;
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = (-1);
      intArray0[3] = (-1);
      intArray0[4] = (-1);
      simpleCharStream0.bufline = intArray0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int1 = 1623;
      // Undeclared exception!
      try { 
        simpleCharStream0.adjustBeginLineColumn(1623, 2048);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Reader reader0 = null;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals("", string0);
      
      simpleCharStream0.bufsize = 0;
      simpleCharStream0.maxNextCharInd = 0;
      simpleCharStream0.ReInit((Reader) null);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ReInit((Reader) null, 0, 0, 0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      simpleCharStream0.ReInit((Reader) null, 3058, 3058);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.available = 3058;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char[] charArray0 = new char[2];
      charArray0[0] = 'Y';
      simpleCharStream0.bufsize = 0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      charArray0[1] = '_';
      simpleCharStream0.buffer = charArray0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-100);
      byteArray0[4] = (byte)123;
      byteArray0[5] = (byte) (-15);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, (byte)0);
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-100), (byte)123, (byte) (-15)}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      
      int int0 = byteArrayInputStream0.read();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-100), (byte)123, (byte) (-15)}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals((-1), int0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte) (-15), (byte)0, (byte)0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-100), (byte)123, (byte) (-15)}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-100), (byte)123, (byte) (-15)}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.Done();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-100), (byte)123, (byte) (-15)}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      
      simpleCharStream0.Done();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-100), (byte)123, (byte) (-15)}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('q');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      assertNotNull(stringReader0);
      
      char[] charArray0 = new char[0];
      int int0 = 0;
      stringReader0.mark(0);
      boolean boolean0 = stringReader0.ready();
      assertTrue(boolean0);
      
      int int1 = stringReader0.read(charArray0);
      assertTrue(int1 == int0);
      assertArrayEquals(new char[] {}, charArray0);
      assertEquals(0, charArray0.length);
      assertEquals(0, int1);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char char0 = simpleCharStream0.BeginToken();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals('o', char0);
      
      // Undeclared exception!
      try { 
        stringReader0.read(charArray0, 0, (-196));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("KyDmH4H");
      assertNotNull(stringReader0);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char[] charArray0 = new char[3];
      charArray0[0] = '+';
      simpleCharStream0.line = 0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      charArray0[1] = 'h';
      charArray0[2] = '`';
      simpleCharStream0.buffer = charArray0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.backup(0);
      assertEquals(4095, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 2134);
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(1, byteArray0.length);
      assertEquals(1, byteArrayInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(1, byteArray0.length);
      assertEquals(1, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.FillBuff();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(1, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("|Kq_jK-");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 696, 696);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char char0 = simpleCharStream0.BeginToken();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(696, simpleCharStream0.getBeginLine());
      assertEquals(696, simpleCharStream0.getEndLine());
      assertEquals(696, simpleCharStream0.getEndColumn());
      assertEquals(696, simpleCharStream0.getLine());
      assertEquals(696, simpleCharStream0.getBeginColumn());
      assertEquals(696, simpleCharStream0.getColumn());
      assertEquals('|', char0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 1, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      simpleCharStream0.ReInit((Reader) stringReader0, 0, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      assertNotNull(bufferedInputStream0);
      
      simpleCharStream0.ReInit((InputStream) bufferedInputStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      int int0 = sequenceInputStream0.read(byteArray0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(1, byteArray0.length);
      assertEquals((-1), int0);
      
      simpleCharStream0.backup((-1));
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char[] charArray0 = simpleCharStream0.GetSuffix(0);
      assertNotNull(charArray0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertArrayEquals(new char[] {}, charArray0);
      assertEquals(0, charArray0.length);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int1 = simpleCharStream0.getBeginLine();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(int1 == int0);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, int1);
      
      simpleCharStream0.Done();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.available = (-1);
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0, 1, 4096, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int2 = simpleCharStream0.getBeginColumn();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, int2);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      pipedInputStream0.close();
      assertEquals(0, pipedInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 1757, 2048);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.bufpos = (-305);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.maxNextCharInd = (-1);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.GetSuffix(2048);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("jb");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-128);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)120;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte) (-128), (byte) (-1), (byte)0, (byte)120}, byteArray0);
      assertEquals(4, byteArray0.length);
      assertEquals(4, byteArrayInputStream0.available());
      
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      assertNotNull(pushbackInputStream0);
      assertArrayEquals(new byte[] {(byte) (-128), (byte) (-1), (byte)0, (byte)120}, byteArray0);
      assertEquals(4, byteArray0.length);
      assertEquals(4, byteArrayInputStream0.available());
      
      simpleCharStream0.ReInit((InputStream) pushbackInputStream0, (int) (byte)0, (-402), (-402));
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertArrayEquals(new byte[] {(byte) (-128), (byte) (-1), (byte)0, (byte)120}, byteArray0);
      assertEquals(4, byteArray0.length);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(4, byteArrayInputStream0.available());
      
      simpleCharStream0.backup((-1));
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("`XPmcP(");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = simpleCharStream0.getBeginColumn();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int0);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((InputStream) null, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      assertNotNull(fileDescriptor0);
      assertFalse(fileDescriptor0.valid());
      
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      assertNotNull(mockFileInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(mockFileInputStream0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(fileDescriptor0.valid());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char[] charArray0 = simpleCharStream0.GetSuffix(0);
      assertNotNull(charArray0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertArrayEquals(new char[] {}, charArray0);
      assertEquals(0, charArray0.length);
      assertFalse(fileDescriptor0.valid());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 797, 1501, 1501);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-89);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)40;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), 1367);
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte) (-89), (byte)0, (byte)0, (byte)40}, byteArray0);
      assertEquals(4, byteArray0.length);
      assertEquals(5, byteArrayInputStream0.available());
      
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      assertNotNull(sequenceInputStream0);
      assertArrayEquals(new byte[] {(byte) (-89), (byte)0, (byte)0, (byte)40}, byteArray0);
      assertEquals(4, byteArray0.length);
      assertEquals(5, byteArrayInputStream0.available());
      
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertArrayEquals(new byte[] {(byte) (-89), (byte)0, (byte)0, (byte)40}, byteArray0);
      assertEquals(4, byteArray0.length);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(5, byteArrayInputStream0.available());
      
      simpleCharStream0.adjustBeginLineColumn(1501, 1);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(1502, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.bufsize = 4922;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.backup(4922);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.ExpandBuff(true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(82);
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 82);
      assertNotNull(pushbackInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-115);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)15;
      byteArray0[7] = (byte)14;
      byteArray0[8] = (byte)88;
      pushbackInputStream0.unread(byteArray0, 0, (int) (byte)0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-115), (byte)0, (byte)0, (byte)0, (byte)0, (byte)15, (byte)14, (byte)88}, byteArray0);
      assertEquals(9, byteArray0.length);
      assertEquals(0, pipedInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pushbackInputStream0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.GetSuffix((-684));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      assertNotNull(pushbackInputStream0);
      
      long long0 = pushbackInputStream0.skip(0L);
      assertEquals(0L, long0);
      
      int int0 = pushbackInputStream0.read();
      assertEquals((-1), int0);
      
      int int1 = 8;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pushbackInputStream0, 8, (-1004));
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, (-3248), 0, 70);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-100);
      byteArray0[3] = (byte) (-98);
      byteArray0[4] = (byte)0;
      int int0 = sequenceInputStream0.read(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-100), (byte) (-98), (byte)0}, byteArray0);
      assertEquals(5, byteArray0.length);
      assertEquals((-1), int0);
      
      StringReader stringReader0 = new StringReader("DG&vX!>q&le]h;=~oR");
      assertNotNull(stringReader0);
      
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0, (-544), (-544), (-544));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      stringReader0.reset();
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ReInit((Reader) stringReader0, (-544), 10);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int1 = simpleCharStream0.getBeginColumn();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(int1 == int0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, int1);
      
      simpleCharStream0.ReInit((Reader) stringReader0, (-3248), 2625);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.Done();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-108);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-65);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte) (-34);
      byteArray0[5] = (byte) (-26);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte) (-108), (byte)0, (byte) (-65), (byte)1, (byte) (-34), (byte) (-26)}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals(6, byteArrayInputStream0.available());
      
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      assertNotNull(pushbackInputStream0);
      assertArrayEquals(new byte[] {(byte) (-108), (byte)0, (byte) (-65), (byte)1, (byte) (-34), (byte) (-26)}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals(6, byteArrayInputStream0.available());
      
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      assertNotNull(dataInputStream0);
      assertArrayEquals(new byte[] {(byte) (-108), (byte)0, (byte) (-65), (byte)1, (byte) (-34), (byte) (-26)}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals(6, byteArrayInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(dataInputStream0, (byte) (-108), (byte) (-65), (byte) (-65));
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertArrayEquals(new byte[] {(byte) (-108), (byte)0, (byte) (-65), (byte)1, (byte) (-34), (byte) (-26)}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals(6, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      assertNotNull(bufferedInputStream0);
      
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(bufferedInputStream0, bufferedInputStream0);
      assertNotNull(sequenceInputStream0);
      
      sequenceInputStream0.close();
      int int0 = (-526);
      int int1 = (-2001);
      int int2 = 1579;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, (-526), (-2001), 1579);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      String string0 = "";
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('\\');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Reader reader0 = null;
      int int0 = 0;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.ReInit((Reader) null);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ExpandBuff(false);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<g");
      assertNotNull(stringReader0);
      
      stringReader0.reset();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-80), (-80));
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.prevCharIsCR = true;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.Done();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)31;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-1);
      byteArray0[7] = (byte)31;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 4096);
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)31, (byte)0, (byte)0, (byte) (-1), (byte)31}, byteArray0);
      assertEquals(8, byteArray0.length);
      assertEquals(8, byteArrayInputStream0.available());
      
      int int0 = byteArrayInputStream0.read(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)31, (byte)0, (byte)0, (byte) (-1), (byte)31}, byteArray0);
      assertEquals(8, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(8, int0);
      
      boolean boolean0 = byteArrayInputStream0.markSupported();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)31, (byte)0, (byte)0, (byte) (-1), (byte)31}, byteArray0);
      assertEquals(8, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertTrue(boolean0);
      
      boolean boolean1 = byteArrayInputStream0.markSupported();
      assertTrue(boolean1 == boolean0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)31, (byte)0, (byte)0, (byte) (-1), (byte)31}, byteArray0);
      assertEquals(8, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertTrue(boolean1);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 0, 1, (byte) (-1));
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)31, (byte)0, (byte)0, (byte) (-1), (byte)31}, byteArray0);
      assertEquals(8, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int1 = simpleCharStream0.getBeginLine();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(int1 == int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)31, (byte)0, (byte)0, (byte) (-1), (byte)31}, byteArray0);
      assertEquals(8, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, int1);
      
      simpleCharStream0.bufpos = 1765;
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 1378, 2241, 1);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.adjustBeginLineColumn(1023, 2241);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(1023, simpleCharStream0.getBeginLine());
      assertEquals(2241, simpleCharStream0.getBeginColumn());
      
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream("<g");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      InputStream inputStream0 = null;
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      assertNotNull(bufferedInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      char[] charArray0 = new char[2];
      charArray0[0] = 'f';
      charArray0[1] = '~';
      int int0 = stringReader0.read(charArray0);
      assertArrayEquals(new char[] {'f', '~'}, charArray0);
      assertEquals(2, charArray0.length);
      assertEquals((-1), int0);
      
      stringReader0.mark(0);
      char[] charArray1 = new char[3];
      assertFalse(charArray1.equals((Object)charArray0));
      
      charArray1[0] = '!';
      boolean boolean0 = stringReader0.ready();
      assertTrue(boolean0);
      
      charArray1[1] = 'k';
      stringReader0.reset();
      charArray1[2] = '%';
      int int1 = stringReader0.read(charArray1, 0, 0);
      assertFalse(charArray1.equals((Object)charArray0));
      assertFalse(int1 == int0);
      assertArrayEquals(new char[] {'!', 'k', '%'}, charArray1);
      assertEquals(3, charArray1.length);
      assertNotSame(charArray1, charArray0);
      assertEquals(0, int1);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1, 1);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ReInit((Reader) stringReader0, 147, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int2 = simpleCharStream0.getBeginColumn();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(int2 == int0);
      assertTrue(int2 == int1);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, int2);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.ExpandBuff(true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 3528, 3528, 456);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.maxNextCharInd = 456;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ReInit((Reader) null);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-127);
      byteArray0[2] = (byte) (-80);
      byteArray0[3] = (byte) (-84);
      byteArray0[4] = (byte)51;
      byteArray0[5] = (byte) (-37);
      byteArray0[6] = (byte)50;
      byteArray0[7] = (byte)92;
      byteArray0[8] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-127), (byte) (-80), (byte) (-84), (byte)51, (byte) (-37), (byte)50, (byte)92, (byte)0}, byteArray0);
      assertEquals(9, byteArray0.length);
      assertEquals(9, byteArrayInputStream0.available());
      
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, 1486, 4082);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-127), (byte) (-80), (byte) (-84), (byte)51, (byte) (-37), (byte)50, (byte)92, (byte)0}, byteArray0);
      assertEquals(9, byteArray0.length);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(9, byteArrayInputStream0.available());
      
      simpleCharStream0.ReInit((Reader) null, 0, (int) (byte)92);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^q'zL*AadQ8k~b");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.inBuf = 0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.inBuf = (-869);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.inBuf = 747;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int0);
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals('\u0000', char0);
      
      simpleCharStream0.line = 0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      long long0 = stringReader0.skip(0L);
      assertEquals(0L, long0);
      
      simpleCharStream0.bufsize = 747;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.column = 0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.adjustBeginLineColumn(0, 0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char char1 = simpleCharStream0.BeginToken();
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertTrue(char1 == char0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals('\u0000', char1);
      
      simpleCharStream0.prevCharIsLF = false;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int1 = simpleCharStream0.getBeginColumn();
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertTrue(int1 == int0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int1);
      
      int int2 = simpleCharStream0.getBeginColumn();
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertTrue(int2 == int0);
      assertTrue(int2 == int1);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, int2);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(747);
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      PushbackInputStream pushbackInputStream0 = null;
      try {
        pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // size <= 0
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      InputStream inputStream0 = null;
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringReader stringReader0 = new StringReader("94<");
      assertNotNull(stringReader0);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      boolean boolean1 = stringReader0.markSupported();
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      
      stringReader0.reset();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2837, 0, 2837);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.tokenBegin = (-1794);
      simpleCharStream0.tokenBegin = 0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, 3189, 3189, 3189);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bvRcB:}J?mNT|Wp~");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = (-1);
      StringReader stringReader1 = new StringReader("bvRcB:}J?mNT|Wp~");
      assertNotNull(stringReader1);
      assertFalse(stringReader1.equals((Object)stringReader0));
      
      simpleCharStream0.ReInit((Reader) stringReader1, 8, (-1), 8);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(stringReader0.equals((Object)stringReader1));
      assertFalse(stringReader1.equals((Object)stringReader0));
      assertNotSame(stringReader0, stringReader1);
      assertNotSame(stringReader1, stringReader0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        stringReader0.mark((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Read-ahead limit < 0
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-2516), 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char[] charArray0 = new char[1];
      int[] intArray0 = new int[3];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      simpleCharStream0.ReInit((InputStream) pipedInputStream0, 0, 0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, pipedInputStream0.available());
      
      intArray0[0] = 0;
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      simpleCharStream0.bufcolumn = intArray0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      charArray0[0] = '(';
      simpleCharStream0.buffer = charArray0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      int int0 = (-2260);
      int int1 = 0;
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream(stringReader0, (-2260), 0, (-2260));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      byte[] byteArray0 = new byte[0];
      int int0 = (-256);
      int int1 = 1673;
      int int2 = sequenceInputStream0.read(byteArray0, (-256), 1673);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0, byteArray0.length);
      assertEquals((-1), int2);
      
      int int3 = sequenceInputStream0.available();
      assertFalse(int3 == int1);
      assertFalse(int3 == int0);
      assertFalse(int3 == int2);
      assertEquals(0, int3);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 1, 1, 1);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)93;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)10;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)81;
      byteArray0[5] = (byte) (-78);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2048, (-2610));
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)93, (byte)0, (byte)10, (byte)0, (byte)81, (byte) (-78)}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals((-2610), byteArrayInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertArrayEquals(new byte[] {(byte)93, (byte)0, (byte)10, (byte)0, (byte)81, (byte) (-78)}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals((-2610), byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"quW]V|Wu1");
      int int0 = (-1);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), (-1));
      int int1 = (-1394);
      simpleCharStream0.bufpos = (-1394);
      stringReader0.markSupported();
      simpleCharStream0.Done();
      simpleCharStream0.ReInit((Reader) stringReader0);
      int int2 = (-299);
      simpleCharStream0.adjustBeginLineColumn((-1), (-299));
      stringReader0.markSupported();
      int int3 = (-113);
      simpleCharStream0.ReInit((Reader) stringReader0, (-113), (-113), 0);
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      stringReader0.skip((-687L));
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      stringReader0.reset();
      stringReader0.skip(2048);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2048, 2048);
      simpleCharStream0.backup(0);
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-907), 2021);
      simpleCharStream0.Done();
      simpleCharStream0.ReInit((Reader) stringReader0, (-284), 364);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      pipedInputStream0.close();
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      simpleCharStream0.adjustBeginLineColumn(2021, 0);
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-2516), 0);
      char[] charArray0 = new char[1];
      int[] intArray0 = new int[3];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      simpleCharStream0.ReInit((InputStream) pipedInputStream0, 0, 0);
      intArray0[0] = 0;
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      simpleCharStream0.bufcolumn = intArray0;
      charArray0[0] = 'f';
      simpleCharStream0.buffer = charArray0;
      simpleCharStream0.ReInit((Reader) stringReader0);
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      String string0 = "e,`Sz4zm:";
      StringReader stringReader0 = new StringReader("e,`Sz4zm:");
      int int0 = 917;
      int int1 = (-3572);
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream(stringReader0, 917, (-3572), (-3572));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 0, 4096);
      simpleCharStream0.available = 4096;
      sequenceInputStream0.read();
      simpleCharStream0.bufpos = 0;
      sequenceInputStream0.close();
      simpleCharStream0.UpdateLineColumn('_');
      simpleCharStream0.adjustBeginLineColumn(4096, (-1));
      simpleCharStream0.getEndLine();
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0);
      simpleCharStream0.getBeginLine();
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, true).when(enumeration0).hasMoreElements();
      doReturn((MockFileInputStream) null).when(enumeration0).nextElement();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 0, 0);
      simpleCharStream0.available = 0;
      sequenceInputStream0.read();
      simpleCharStream0.bufpos = 0;
      sequenceInputStream0.close();
      simpleCharStream0.UpdateLineColumn('_');
      simpleCharStream0.adjustBeginLineColumn(0, (-1));
      simpleCharStream0.getEndLine();
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0);
      simpleCharStream0.getBeginLine();
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 0, 0);
      pipedInputStream0.mark(0);
      simpleCharStream0.ReInit((Reader) null, (-3384), 805);
      simpleCharStream0.ExpandBuff(false);
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      pipedInputStream0.close();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 1757, 2048);
      simpleCharStream0.bufpos = (-305);
      simpleCharStream0.bufpos = 1;
      char[] charArray0 = simpleCharStream0.GetSuffix(2048);
      simpleCharStream0.getColumn();
      simpleCharStream0.GetImage();
      StringReader stringReader0 = new StringReader(")kY");
      int int0 = 0;
      // Undeclared exception!
      try { 
        stringReader0.read(charArray0, 4534, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^q'zL*AadQ8k~b");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.GetImage();
      simpleCharStream0.inBuf = 0;
      simpleCharStream0.inBuf = (-869);
      stringReader0.mark(0);
      simpleCharStream0.inBuf = 747;
      simpleCharStream0.getBeginLine();
      simpleCharStream0.BeginToken();
      simpleCharStream0.line = 0;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      stringReader0.skip(0L);
      simpleCharStream0.bufsize = 747;
      simpleCharStream0.column = 0;
      simpleCharStream0.adjustBeginLineColumn(0, 0);
      simpleCharStream0.BeginToken();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      simpleCharStream0.prevCharIsLF = false;
      simpleCharStream0.getBeginColumn();
      simpleCharStream0.getBeginColumn();
      simpleCharStream0.GetSuffix(0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(747);
      PushbackInputStream pushbackInputStream0 = null;
      try {
        pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // size <= 0
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }
}
