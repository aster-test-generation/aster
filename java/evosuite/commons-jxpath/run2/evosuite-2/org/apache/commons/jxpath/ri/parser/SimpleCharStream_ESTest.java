
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
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
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
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      int int0 = 8;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 210, 8, 7);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.tokenBegin = 210;
      simpleCharStream0.adjustBeginLineColumn(0, 8);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 210
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "M'`B|>81.z,b!");
      assertFalse(boolean0);
      
      StringReader stringReader0 = new StringReader("M'`B|>81.z,b!");
      assertNotNull(stringReader0);
      
      long long0 = stringReader0.skip(1L);
      assertEquals(1L, long0);
      
      stringReader0.reset();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals('M', char0);
      
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, int0);
      
      char[] charArray0 = simpleCharStream0.GetSuffix(1764);
      assertNotNull(charArray0);
      assertEquals(1764, charArray0.length);
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("M~0zfP0T0c");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      stringReader0.reset();
      int int0 = (-1243);
      simpleCharStream0.bufpos = (-1243);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.column = 0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.available = 0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      boolean boolean0 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "M~0zfP0T0c");
      assertFalse(boolean0);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1242
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" 9MLLJNmCHQ");
      assertNotNull(stringReader0);
      
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), 0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals((-1), simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals((-1), simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(' ', char0);
      
      int int0 = simpleCharStream0.getLine();
      assertEquals((-1), simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals((-1), simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), int0);
      
      int int1 = simpleCharStream0.getColumn();
      assertFalse(int1 == int0);
      assertEquals((-1), simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals((-1), simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("!%ML~}<-uzy@)@t7P");
      assertNotNull(stringReader0);
      
      stringReader0.reset();
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0, byteArray0.length);
      assertFalse(boolean0);
      
      long long0 = stringReader0.skip(1L);
      assertEquals(1L, long0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, int0);
      
      boolean boolean1 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals('%', char0);
      
      boolean boolean2 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      assertFalse(boolean2);
      
      int int1 = 4058;
      char[] charArray0 = simpleCharStream0.GetSuffix(4058);
      assertNotNull(charArray0);
      assertEquals(4058, charArray0.length);
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.UpdateLineColumn('%');
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getColumn());
      assertEquals(2, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char char1 = simpleCharStream0.BeginToken();
      assertFalse(char1 == char0);
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(3, simpleCharStream0.getColumn());
      assertEquals(3, simpleCharStream0.getBeginColumn());
      assertEquals(3, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals('M', char1);
      
      simpleCharStream0.maxNextCharInd = 4058;
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(3, simpleCharStream0.getColumn());
      assertEquals(3, simpleCharStream0.getBeginColumn());
      assertEquals(3, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      
      char[] charArray1 = simpleCharStream0.GetSuffix(1);
      assertArrayEquals(new char[] {'M'}, charArray1);
      assertNotSame(charArray1, charArray0);
      assertNotNull(charArray1);
      assertEquals(1, charArray1.length);
      assertFalse(charArray1.equals((Object)charArray0));
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(3, simpleCharStream0.getColumn());
      assertEquals(3, simpleCharStream0.getBeginColumn());
      assertEquals(3, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.UpdateLineColumn('c');
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(4, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(4, simpleCharStream0.getBeginColumn());
      assertEquals(4, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.adjustBeginLineColumn(10, 4060);
      assertEquals(4060, simpleCharStream0.getBeginColumn());
      assertEquals(10, simpleCharStream0.getLine());
      assertEquals(10, simpleCharStream0.getBeginLine());
      assertEquals(4060, simpleCharStream0.getEndColumn());
      assertEquals(10, simpleCharStream0.getEndLine());
      assertEquals(4060, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char char2 = simpleCharStream0.readChar();
      assertFalse(char2 == char0);
      assertFalse(char2 == char1);
      assertEquals(4060, simpleCharStream0.getBeginColumn());
      assertEquals(10, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(11, simpleCharStream0.getEndLine());
      assertEquals(11, simpleCharStream0.getLine());
      assertEquals(2, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals('L', char2);
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals(4060, simpleCharStream0.getBeginColumn());
      assertEquals(10, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(11, simpleCharStream0.getEndLine());
      assertEquals(11, simpleCharStream0.getLine());
      assertEquals(2, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals("ML", string0);
      
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
  public void test05()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "/AI35*%`4B)kH");
      assertFalse(boolean0);
      
      StringReader stringReader0 = new StringReader("/AI35*%`4B)kH");
      assertNotNull(stringReader0);
      
      boolean boolean1 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      
      boolean boolean2 = stringReader0.ready();
      assertFalse(boolean2 == boolean0);
      assertFalse(boolean2 == boolean1);
      assertTrue(boolean2);
      
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)99;
      byteArray0[1] = (byte) (-122);
      boolean boolean3 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertArrayEquals(new byte[] {(byte)99, (byte) (-122)}, byteArray0);
      assertEquals(2, byteArray0.length);
      assertTrue(boolean3 == boolean0);
      assertFalse(boolean3 == boolean2);
      assertTrue(boolean3 == boolean1);
      assertFalse(boolean3);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      char char0 = simpleCharStream0.readChar();
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals('/', char0);
      
      simpleCharStream0.adjustBeginLineColumn((-1237), (-1237));
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      assertEquals((-1237), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginLine());
      assertEquals((-1237), simpleCharStream0.getEndColumn());
      assertEquals((-1237), simpleCharStream0.getLine());
      assertEquals((-1237), simpleCharStream0.getColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      
      char[] charArray0 = new char[8];
      charArray0[0] = '/';
      charArray0[1] = '/';
      charArray0[2] = '/';
      charArray0[3] = '/';
      charArray0[4] = '/';
      charArray0[3] = '/';
      charArray0[2] = '/';
      charArray0[2] = '/';
      int int0 = stringReader0.read(charArray0);
      assertArrayEquals(new char[] {'/', '/', '/', '/', '/', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals(8, charArray0.length);
      assertEquals((-1), int0);
      
      boolean boolean4 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "/AI35*%`4B)kH");
      assertTrue(boolean4 == boolean1);
      assertFalse(boolean4 == boolean2);
      assertTrue(boolean4 == boolean0);
      assertTrue(boolean4 == boolean3);
      assertFalse(boolean4);
      
      simpleCharStream0.ExpandBuff(false);
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      assertEquals((-1237), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginLine());
      assertEquals((-1237), simpleCharStream0.getEndColumn());
      assertEquals((-1237), simpleCharStream0.getLine());
      assertEquals((-1237), simpleCharStream0.getColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      
      char[] charArray1 = simpleCharStream0.GetSuffix(4083);
      assertNotSame(charArray1, charArray0);
      assertNotNull(charArray1);
      assertEquals(4083, charArray1.length);
      assertFalse(charArray1.equals((Object)charArray0));
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      assertEquals((-1237), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginLine());
      assertEquals((-1237), simpleCharStream0.getEndColumn());
      assertEquals((-1237), simpleCharStream0.getLine());
      assertEquals((-1237), simpleCharStream0.getColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      
      simpleCharStream0.UpdateLineColumn('k');
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals((-1236), simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals((-1236), simpleCharStream0.getBeginLine());
      assertEquals((-1236), simpleCharStream0.getLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      
      int int1 = simpleCharStream0.getEndColumn();
      assertFalse(int1 == int0);
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals((-1236), simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals((-1236), simpleCharStream0.getBeginLine());
      assertEquals((-1236), simpleCharStream0.getLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("aQ.");
      assertNotNull(stringReader0);
      
      int int0 = stringReader0.read();
      assertEquals(97, int0);
      
      boolean boolean0 = stringReader0.ready();
      assertTrue(boolean0);
      
      boolean boolean1 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "aQ.");
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
      
      long long0 = stringReader0.skip((-1L));
      assertEquals((-1L), long0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 4066, 4066, 1);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.inputStream = (Reader) stringReader0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals(4066, simpleCharStream0.getColumn());
      assertEquals(4066, simpleCharStream0.getLine());
      assertEquals(4066, simpleCharStream0.getBeginColumn());
      assertEquals(4066, simpleCharStream0.getBeginLine());
      assertEquals(4066, simpleCharStream0.getEndColumn());
      assertEquals(4066, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals('a', char0);
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      stringReader0.mark(1);
      simpleCharStream0.ReInit((Reader) stringReader0, 1, (-3410), 4066);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.column = (-3410);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char char1 = simpleCharStream0.BeginToken();
      assertFalse(char1 == char0);
      assertEquals((-3409), simpleCharStream0.getEndColumn());
      assertEquals((-3409), simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals((-3409), simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals('Q', char1);
      
      int int1 = simpleCharStream0.getColumn();
      assertFalse(int1 == int0);
      assertEquals((-3409), simpleCharStream0.getEndColumn());
      assertEquals((-3409), simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals((-3409), simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-3409), int1);
      
      boolean boolean2 = FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2 == boolean0);
      assertFalse(boolean2);
      
      simpleCharStream0.inBuf = (-1623);
      assertEquals((-3409), simpleCharStream0.getEndColumn());
      assertEquals((-3409), simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals((-3409), simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      
      char char2 = simpleCharStream0.BeginToken();
      assertFalse(char2 == char1);
      assertFalse(char2 == char0);
      assertEquals((-3408), simpleCharStream0.getBeginColumn());
      assertEquals((-3408), simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals((-3408), simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals('.', char2);
      
      simpleCharStream0.ExpandBuff(true);
      assertEquals((-3408), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(4066, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char[] charArray0 = simpleCharStream0.GetSuffix(4066);
      assertNotNull(charArray0);
      assertEquals(4066, charArray0.length);
      assertEquals((-3408), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(4066, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
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
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0, byteArray0.length);
      assertFalse(boolean0);
      
      boolean boolean1 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "/AI35*%`4B)kH");
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      
      StringReader stringReader0 = new StringReader("/AI35*%`4B)kH");
      assertNotNull(stringReader0);
      
      boolean boolean2 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      assertFalse(boolean2);
      
      boolean boolean3 = stringReader0.ready();
      assertFalse(boolean3 == boolean1);
      assertFalse(boolean3 == boolean2);
      assertFalse(boolean3 == boolean0);
      assertTrue(boolean3);
      
      byte[] byteArray1 = new byte[2];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = (byte)99;
      byteArray1[1] = (byte) (-122);
      boolean boolean4 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray1);
      assertArrayEquals(new byte[] {(byte)99, (byte) (-122)}, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(2, byteArray1.length);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(boolean4 == boolean3);
      assertTrue(boolean4 == boolean0);
      assertTrue(boolean4 == boolean1);
      assertTrue(boolean4 == boolean2);
      assertFalse(boolean4);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      char char0 = simpleCharStream0.readChar();
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals('/', char0);
      
      simpleCharStream0.adjustBeginLineColumn((-1237), (-1237));
      assertEquals((-1237), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginLine());
      assertEquals((-1237), simpleCharStream0.getColumn());
      assertEquals((-1237), simpleCharStream0.getEndColumn());
      assertEquals((-1237), simpleCharStream0.getLine());
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char[] charArray0 = new char[8];
      charArray0[0] = '/';
      charArray0[1] = '/';
      charArray0[2] = '/';
      charArray0[3] = '/';
      charArray0[4] = '/';
      charArray0[5] = '/';
      charArray0[6] = '/';
      charArray0[7] = '/';
      simpleCharStream0.maxNextCharInd = 1380;
      assertEquals((-1237), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginLine());
      assertEquals((-1237), simpleCharStream0.getColumn());
      assertEquals((-1237), simpleCharStream0.getEndColumn());
      assertEquals((-1237), simpleCharStream0.getLine());
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      
      int int0 = stringReader0.read(charArray0);
      assertArrayEquals(new char[] {'/', '/', '/', '/', '/', '/', '/', '/'}, charArray0);
      assertEquals(8, charArray0.length);
      assertEquals((-1), int0);
      
      boolean boolean5 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "/AI35*%`4B)kH");
      assertTrue(boolean5 == boolean1);
      assertFalse(boolean5 == boolean3);
      assertTrue(boolean5 == boolean0);
      assertTrue(boolean5 == boolean2);
      assertTrue(boolean5 == boolean4);
      assertFalse(boolean5);
      
      simpleCharStream0.ExpandBuff(false);
      assertEquals((-1237), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginLine());
      assertEquals((-1237), simpleCharStream0.getColumn());
      assertEquals((-1237), simpleCharStream0.getEndColumn());
      assertEquals((-1237), simpleCharStream0.getLine());
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      stringReader0.close();
      char[] charArray1 = simpleCharStream0.GetSuffix(4083);
      assertNotSame(charArray1, charArray0);
      assertNotNull(charArray1);
      assertEquals(4083, charArray1.length);
      assertFalse(charArray1.equals((Object)charArray0));
      assertEquals((-1237), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginLine());
      assertEquals((-1237), simpleCharStream0.getColumn());
      assertEquals((-1237), simpleCharStream0.getEndColumn());
      assertEquals((-1237), simpleCharStream0.getLine());
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals((-1237), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginLine());
      assertEquals((-1237), simpleCharStream0.getColumn());
      assertEquals((-1237), simpleCharStream0.getEndColumn());
      assertEquals((-1237), simpleCharStream0.getLine());
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals("/", string0);
      
      int int1 = simpleCharStream0.getBeginLine();
      assertFalse(int1 == int0);
      assertEquals((-1237), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginLine());
      assertEquals((-1237), simpleCharStream0.getColumn());
      assertEquals((-1237), simpleCharStream0.getEndColumn());
      assertEquals((-1237), simpleCharStream0.getLine());
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1237), int1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("M~0zfP0T0p");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      stringReader0.reset();
      simpleCharStream0.prevCharIsCR = false;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.bufpos = simpleCharStream0.bufpos;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.column = 0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.available = 0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      boolean boolean0 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "M~0zfP0T0p");
      assertFalse(boolean0);
      
      simpleCharStream0.ReInit((Reader) stringReader0, 0, 0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      char char0 = simpleCharStream0.readChar();
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4096, simpleCharStream0.bufpos);
      assertEquals('M', char0);
      
      char char1 = simpleCharStream0.readChar();
      assertFalse(char1 == char0);
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4097, simpleCharStream0.bufpos);
      assertEquals('~', char1);
      
      simpleCharStream0.maxNextCharInd = 4097;
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      simpleCharStream0.tokenBegin = 0;
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4097, simpleCharStream0.bufpos);
      
      stringReader0.close();
      int int0 = simpleCharStream0.getLine();
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4097, simpleCharStream0.bufpos);
      assertEquals(0, int0);
      
      String string1 = simpleCharStream0.GetImage();
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4097, simpleCharStream0.bufpos);
      
      simpleCharStream0.ExpandBuff(false);
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4097, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Tz64(R!yKCE$[u|M");
      assertFalse(boolean0);
      
      StringReader stringReader0 = new StringReader("Tz64(R!yKCE$[u|M");
      assertNotNull(stringReader0);
      
      boolean boolean1 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      
      boolean boolean2 = stringReader0.ready();
      assertFalse(boolean2 == boolean0);
      assertFalse(boolean2 == boolean1);
      assertTrue(boolean2);
      
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)99;
      byteArray0[1] = (byte)99;
      boolean boolean3 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertArrayEquals(new byte[] {(byte)99, (byte)99}, byteArray0);
      assertEquals(2, byteArray0.length);
      assertTrue(boolean3 == boolean1);
      assertFalse(boolean3 == boolean2);
      assertTrue(boolean3 == boolean0);
      assertFalse(boolean3);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char char0 = simpleCharStream0.readChar();
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals('T', char0);
      
      simpleCharStream0.backup(4085);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(11, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.adjustBeginLineColumn((-1237), (-1237));
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals((-1236), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      assertEquals((-1235), simpleCharStream0.getBeginLine());
      assertEquals((-1236), simpleCharStream0.getLine());
      assertEquals(11, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char[] charArray0 = new char[8];
      charArray0[0] = 'T';
      charArray0[1] = 'T';
      charArray0[2] = 'T';
      charArray0[3] = 'T';
      charArray0[4] = 'T';
      charArray0[5] = 'T';
      charArray0[6] = 'T';
      charArray0[7] = 'T';
      int int0 = stringReader0.read(charArray0);
      assertArrayEquals(new char[] {'T', 'T', 'T', 'T', 'T', 'T', 'T', 'T'}, charArray0);
      assertEquals(8, charArray0.length);
      assertEquals((-1), int0);
      
      boolean boolean4 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Tz64(R!yKCE$[u|M");
      assertTrue(boolean4 == boolean3);
      assertTrue(boolean4 == boolean0);
      assertFalse(boolean4 == boolean2);
      assertTrue(boolean4 == boolean1);
      assertFalse(boolean4);
      
      simpleCharStream0.ExpandBuff(false);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals((-1236), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      assertEquals((-1235), simpleCharStream0.getBeginLine());
      assertEquals((-1236), simpleCharStream0.getLine());
      assertEquals(11, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      stringReader0.close();
      char[] charArray1 = simpleCharStream0.GetSuffix(4083);
      assertNotSame(charArray1, charArray0);
      assertNotNull(charArray1);
      assertEquals(4083, charArray1.length);
      assertFalse(charArray1.equals((Object)charArray0));
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals((-1236), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      assertEquals((-1235), simpleCharStream0.getBeginLine());
      assertEquals((-1236), simpleCharStream0.getLine());
      assertEquals(11, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("M~0zfP0T0c");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      stringReader0.reset();
      int int0 = (-1243);
      simpleCharStream0.bufpos = 2025;
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      simpleCharStream0.column = 0;
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      simpleCharStream0.available = 0;
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((InputStream) null, (-2742), 0, 4096);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 210, 8, 7);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      simpleCharStream0.backup(7);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      simpleCharStream0.adjustBeginLineColumn(0, 8);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(16, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "M~0zfP0T0c";
      StringReader stringReader0 = new StringReader("M~0zfP0T0c");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      stringReader0.reset();
      int int0 = (-1243);
      simpleCharStream0.bufpos = (-1243);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.column = 0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)36;
      byteArray0[2] = (byte) (-6);
      boolean boolean0 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertArrayEquals(new byte[] {(byte)10, (byte)36, (byte) (-6)}, byteArray0);
      assertEquals(3, byteArray0.length);
      assertFalse(boolean0);
      
      simpleCharStream0.available = 0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1242
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "/AI35*%`4B)kH");
      assertFalse(boolean0);
      
      StringReader stringReader0 = new StringReader("/AI35*%`4B)kH");
      assertNotNull(stringReader0);
      
      boolean boolean1 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      
      boolean boolean2 = stringReader0.ready();
      assertFalse(boolean2 == boolean1);
      assertFalse(boolean2 == boolean0);
      assertTrue(boolean2);
      
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)99;
      byteArray0[1] = (byte) (-122);
      boolean boolean3 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertArrayEquals(new byte[] {(byte)99, (byte) (-122)}, byteArray0);
      assertEquals(2, byteArray0.length);
      assertTrue(boolean3 == boolean1);
      assertFalse(boolean3 == boolean2);
      assertTrue(boolean3 == boolean0);
      assertFalse(boolean3);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      char char0 = simpleCharStream0.readChar();
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals('/', char0);
      
      simpleCharStream0.adjustBeginLineColumn((-1237), (-1237));
      assertEquals((-1237), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      assertEquals((-1237), simpleCharStream0.getColumn());
      assertEquals((-1237), simpleCharStream0.getLine());
      assertEquals((-1237), simpleCharStream0.getBeginLine());
      assertEquals((-1237), simpleCharStream0.getEndColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      
      char[] charArray0 = new char[8];
      charArray0[0] = '/';
      charArray0[1] = '/';
      charArray0[2] = '/';
      charArray0[3] = '/';
      charArray0[4] = '/';
      charArray0[5] = '/';
      charArray0[6] = '/';
      charArray0[7] = '/';
      int int0 = stringReader0.read(charArray0);
      assertArrayEquals(new char[] {'/', '/', '/', '/', '/', '/', '/', '/'}, charArray0);
      assertEquals(8, charArray0.length);
      assertEquals((-1), int0);
      
      boolean boolean4 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "/AI35*%`4B)kH");
      assertTrue(boolean4 == boolean3);
      assertFalse(boolean4 == boolean2);
      assertTrue(boolean4 == boolean0);
      assertTrue(boolean4 == boolean1);
      assertFalse(boolean4);
      
      simpleCharStream0.ExpandBuff(false);
      assertEquals((-1237), simpleCharStream0.getEndLine());
      assertEquals((-1237), simpleCharStream0.getBeginColumn());
      assertEquals((-1237), simpleCharStream0.getColumn());
      assertEquals((-1237), simpleCharStream0.getLine());
      assertEquals((-1237), simpleCharStream0.getBeginLine());
      assertEquals((-1237), simpleCharStream0.getEndColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      
      simpleCharStream0.UpdateLineColumn('/');
      assertEquals((-1236), simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals((-1236), simpleCharStream0.getLine());
      assertEquals((-1236), simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      
      stringReader0.close();
      char[] charArray1 = simpleCharStream0.GetSuffix(4083);
      assertNotSame(charArray1, charArray0);
      assertNotNull(charArray1);
      assertEquals(4083, charArray1.length);
      assertFalse(charArray1.equals((Object)charArray0));
      assertEquals((-1236), simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals((-1236), simpleCharStream0.getLine());
      assertEquals((-1236), simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      
      int int1 = simpleCharStream0.getLine();
      assertFalse(int1 == int0);
      assertEquals((-1236), simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals((-1236), simpleCharStream0.getLine());
      assertEquals((-1236), simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals((-1236), int1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 210, 8, 7);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      simpleCharStream0.adjustBeginLineColumn(0, 8);
      assertEquals(8, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      simpleCharStream0.adjustBeginLineColumn(210, 7);
      assertEquals(7, simpleCharStream0.getBeginColumn());
      assertEquals(211, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('s');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 210, 8, 7);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      simpleCharStream0.adjustBeginLineColumn(0, 8);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(8, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      int int0 = simpleCharStream0.getBeginColumn();
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(8, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" 9MLLJNmCHQ");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), 0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals((-1), simpleCharStream0.getEndLine());
      assertEquals((-1), simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals((-1), simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(' ', char0);
      
      int int0 = simpleCharStream0.getLine();
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals((-1), simpleCharStream0.getEndLine());
      assertEquals((-1), simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals((-1), simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals((-1), int0);
      
      int int1 = simpleCharStream0.getEndLine();
      assertTrue(int1 == int0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals((-1), simpleCharStream0.getEndLine());
      assertEquals((-1), simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals((-1), simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("M~0zfP0T0c");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      stringReader0.reset();
      long long0 = stringReader0.skip(0L);
      assertEquals(0L, long0);
      
      simpleCharStream0.bufpos = 2025;
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      
      simpleCharStream0.column = 0;
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      
      simpleCharStream0.available = 0;
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      
      simpleCharStream0.ReInit((Reader) stringReader0, (-1243), (-1243));
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char char0 = simpleCharStream0.readChar();
      assertEquals((-1243), simpleCharStream0.getColumn());
      assertEquals((-1243), simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1243), simpleCharStream0.getEndColumn());
      assertEquals((-1243), simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4096, simpleCharStream0.bufpos);
      assertEquals('M', char0);
      
      char char1 = simpleCharStream0.readChar();
      assertFalse(char1 == char0);
      assertEquals((-1243), simpleCharStream0.getLine());
      assertEquals((-1242), simpleCharStream0.getEndColumn());
      assertEquals((-1242), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1243), simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(4097, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals('~', char1);
      
      simpleCharStream0.maxNextCharInd = (-1243);
      assertEquals((-1243), simpleCharStream0.getLine());
      assertEquals((-1242), simpleCharStream0.getEndColumn());
      assertEquals((-1242), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1243), simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals((-1243), simpleCharStream0.getLine());
      assertEquals((-1242), simpleCharStream0.getEndColumn());
      assertEquals((-1242), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1243), simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(4097, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      stringReader0.close();
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" 9MLLJNmCHQ");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), (-9));
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      boolean boolean0 = stringReader0.ready();
      assertTrue(boolean0);
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals((-1), simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.getEndLine());
      assertEquals((-9), simpleCharStream0.getColumn());
      assertEquals((-9), simpleCharStream0.getBeginColumn());
      assertEquals((-9), simpleCharStream0.getEndColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(' ', char0);
      
      int int0 = simpleCharStream0.getLine();
      assertEquals((-1), simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.getEndLine());
      assertEquals((-9), simpleCharStream0.getColumn());
      assertEquals((-9), simpleCharStream0.getBeginColumn());
      assertEquals((-9), simpleCharStream0.getEndColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals((-1), int0);
      
      int int1 = simpleCharStream0.getBeginColumn();
      assertFalse(int1 == int0);
      assertEquals((-1), simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.getEndLine());
      assertEquals((-9), simpleCharStream0.getColumn());
      assertEquals((-9), simpleCharStream0.getBeginColumn());
      assertEquals((-9), simpleCharStream0.getEndColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals((-9), int1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("-!KbjFRZ-");
      assertNotNull(stringReader0);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      int int0 = 1382;
      int int1 = 1;
      int int2 = 0;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1382, 1, 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      boolean boolean1 = stringReader0.ready();
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      
      simpleCharStream0.Done();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.GetImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      assertNotNull(fileDescriptor0);
      assertFalse(fileDescriptor0.valid());
      
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      assertNotNull(mockFileInputStream0);
      
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      assertNotNull(dataInputStream0);
      assertFalse(fileDescriptor0.valid());
      
      boolean boolean0 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      assertFalse(boolean0);
      
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0);
      assertNotNull(bufferedInputStream0);
      assertFalse(fileDescriptor0.valid());
      
      boolean boolean1 = mockFileInputStream0.markSupported();
      assertTrue(boolean1 == boolean0);
      assertFalse(fileDescriptor0.valid());
      assertFalse(boolean1);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0);
      assertNotNull(simpleCharStream0);
      assertFalse(fileDescriptor0.valid());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      simpleCharStream0.prevCharIsCR = true;
      assertFalse(fileDescriptor0.valid());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.Done();
      assertFalse(fileDescriptor0.valid());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Reader reader0 = null;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
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
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4vYz`lM");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-2284), (-1));
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = ")1H7*tHa";
      StringReader stringReader0 = new StringReader(")1H7*tHa");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      int int0 = (-1256);
      simpleCharStream0.available = (-1256);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("4W\b1pS8;Qgk&");
      assertNotNull(stringReader0);
      
      int int0 = 0;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-871), 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertEquals(1, byteArray0.length);
      assertEquals(1, byteArrayInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte) (-1), 1239, (-847));
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertNotNull(simpleCharStream0);
      assertEquals(1, byteArray0.length);
      assertEquals(1, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      boolean boolean0 = byteArrayInputStream0.markSupported();
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertEquals(1, byteArray0.length);
      assertEquals(1, byteArrayInputStream0.available());
      assertTrue(boolean0);
      
      simpleCharStream0.backup((byte) (-1));
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertEquals(1, byteArray0.length);
      assertEquals(1, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      
      byteArrayInputStream0.close();
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertEquals(1, byteArray0.length);
      assertEquals(1, byteArrayInputStream0.available());
      
      simpleCharStream0.backup(1);
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertEquals(1, byteArray0.length);
      assertEquals(1, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4095, simpleCharStream0.bufpos);
      
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertEquals(1, byteArray0.length);
      assertEquals(1, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      StringReader stringReader0 = new StringReader("9U~$");
      assertNotNull(stringReader0);
      
      boolean boolean1 = stringReader0.ready();
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      
      char[] charArray0 = new char[4];
      charArray0[0] = 'w';
      charArray0[1] = 'A';
      charArray0[2] = ':';
      charArray0[3] = '';
      int int0 = stringReader0.read(charArray0);
      assertArrayEquals(new char[] {'9', 'U', '~', '$'}, charArray0);
      assertEquals(4, charArray0.length);
      assertEquals(4, int0);
      
      stringReader0.close();
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertEquals(1, byteArray0.length);
      assertEquals(1, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      long long0 = byteArrayInputStream0.skip((byte) (-1));
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertEquals(1, byteArray0.length);
      assertEquals(1, byteArrayInputStream0.available());
      assertEquals(0L, long0);
      
      String string0 = simpleCharStream0.GetImage();
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertNotNull(string0);
      assertEquals(1, byteArray0.length);
      assertEquals(1, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      int int1 = simpleCharStream0.getBeginLine();
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertEquals(1, byteArray0.length);
      assertFalse(int1 == int0);
      assertEquals(1, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, int1);
      
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
  public void test26()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 0, 0, 756);
      assertNotNull(simpleCharStream0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      long long0 = pipedInputStream0.skip((-213L));
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0L, long0);
      
      simpleCharStream0.column = (-1);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.prevCharIsCR = true;
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int0 = 0;
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn(' ');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("-!KbjFRZ-");
      assertNotNull(stringReader0);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      int int0 = 1382;
      int int1 = 1;
      int int2 = 0;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1382, 1, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      boolean boolean1 = stringReader0.ready();
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals("", string0);
      
      simpleCharStream0.maxNextCharInd = 1;
      simpleCharStream0.bufsize = (-806);
      // Undeclared exception!
      try { 
        simpleCharStream0.ExpandBuff(false);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      long long0 = pipedInputStream0.skip(0L);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0L, long0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("JNK4iW");
      assertNotNull(stringReader0);
      
      boolean boolean0 = stringReader0.ready();
      assertTrue(boolean0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2725, (-2675), 3152);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals((-2675), simpleCharStream0.getEndColumn());
      assertEquals(2725, simpleCharStream0.getLine());
      assertEquals(2725, simpleCharStream0.getEndLine());
      assertEquals(2725, simpleCharStream0.getBeginLine());
      assertEquals((-2675), simpleCharStream0.getBeginColumn());
      assertEquals((-2675), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals('J', char0);
      
      int int0 = simpleCharStream0.getLine();
      assertEquals((-2675), simpleCharStream0.getEndColumn());
      assertEquals(2725, simpleCharStream0.getLine());
      assertEquals(2725, simpleCharStream0.getEndLine());
      assertEquals(2725, simpleCharStream0.getBeginLine());
      assertEquals((-2675), simpleCharStream0.getBeginColumn());
      assertEquals((-2675), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2725, int0);
      
      int int1 = simpleCharStream0.getEndColumn();
      assertFalse(int1 == int0);
      assertEquals((-2675), simpleCharStream0.getEndColumn());
      assertEquals(2725, simpleCharStream0.getLine());
      assertEquals(2725, simpleCharStream0.getEndLine());
      assertEquals(2725, simpleCharStream0.getBeginLine());
      assertEquals((-2675), simpleCharStream0.getBeginColumn());
      assertEquals((-2675), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-2675), int1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader(")l7Exxx`#1q7MbN__x'");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      int int0 = 10;
      simpleCharStream0.tokenBegin = 10;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.ReInit((Reader) stringReader0, 0, 0, 0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      int int1 = 2048;
      // Undeclared exception!
      try { 
        simpleCharStream0.adjustBeginLineColumn(2048, 10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      assertNotNull(stringReader0);
      
      long long0 = stringReader0.skip((-4019L));
      assertEquals(0L, long0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.ReInit((Reader) stringReader0, (-1605), 0, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.ReInit((Reader) stringReader0, 0, 0, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.Done();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('=');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      char[] charArray0 = new char[1];
      charArray0[0] = '9';
      int int0 = stringReader0.read(charArray0);
      assertArrayEquals(new char[] {'9'}, charArray0);
      assertEquals(1, charArray0.length);
      assertEquals((-1), int0);
      
      int int1 = (-1833);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1833), (-1));
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.line = (-1);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.GetSuffix((-1833));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("mt7\"(s|LGOW'*<?~$^");
      assertNotNull(stringReader0);
      
      int int0 = (-1633);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1633), (-1633));
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.inputStream = (Reader) stringReader0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.inBuf = (-1633);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.ExpandBuff(false);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("XMe");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-3293), (-3293), 3766);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.adjustBeginLineColumn(3766, (-3293));
      assertEquals((-3293), simpleCharStream0.getBeginColumn());
      assertEquals(3767, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.prevCharIsCR = false;
      assertEquals((-3293), simpleCharStream0.getBeginColumn());
      assertEquals(3767, simpleCharStream0.getBeginLine());
      
      int int0 = stringReader0.read();
      assertEquals(88, int0);
      
      simpleCharStream0.bufsize = 0;
      assertEquals((-3293), simpleCharStream0.getBeginColumn());
      assertEquals(3767, simpleCharStream0.getBeginLine());
      
      boolean boolean0 = stringReader0.ready();
      assertTrue(boolean0);
      
      char[] charArray0 = new char[4];
      charArray0[0] = 'F';
      simpleCharStream0.prevCharIsLF = false;
      assertEquals((-3293), simpleCharStream0.getBeginColumn());
      assertEquals(3767, simpleCharStream0.getBeginLine());
      
      charArray0[1] = 'q';
      charArray0[2] = ']';
      charArray0[3] = '1';
      simpleCharStream0.buffer = charArray0;
      assertEquals((-3293), simpleCharStream0.getBeginColumn());
      assertEquals(3767, simpleCharStream0.getBeginLine());
      
      int int1 = (-567);
      simpleCharStream0.ReInit((Reader) stringReader0, (-567), 2279);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.bufpos = 2279;
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      
      simpleCharStream0.backup(0);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(2279, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char[] charArray1 = simpleCharStream0.GetSuffix(3766);
      assertNotSame(charArray1, charArray0);
      assertNotNull(charArray1);
      assertEquals(3766, charArray1.length);
      assertFalse(charArray1.equals((Object)charArray0));
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(2279, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.backup(4479);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(1896, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-77);
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-109);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)41;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte) (-33);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-77), (byte)1, (byte) (-109), (byte)1, (byte)1, (byte)41, (byte)0, (byte)0, (byte) (-33)}, byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertEquals(9, byteArray0.length);
      assertEquals(9, byteArrayInputStream0.available());
      
      BufferedInputStream bufferedInputStream0 = null;
      try {
        bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, (-185));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer size <= 0
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 4554, 4554, 4554);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.available = 4554;
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
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]$PQafS");
      assertNotNull(stringReader0);
      
      char[] charArray0 = new char[3];
      charArray0[0] = 't';
      charArray0[1] = 'n';
      charArray0[2] = '-';
      int int0 = stringReader0.read(charArray0);
      assertArrayEquals(new char[] {']', '$', 'P'}, charArray0);
      assertEquals(3, charArray0.length);
      assertEquals(3, int0);
      
      char[] charArray1 = new char[1];
      assertFalse(charArray1.equals((Object)charArray0));
      
      charArray1[0] = 'C';
      int int1 = stringReader0.read(charArray1);
      assertArrayEquals(new char[] {'Q'}, charArray1);
      assertNotSame(charArray1, charArray0);
      assertEquals(1, charArray1.length);
      assertFalse(charArray1.equals((Object)charArray0));
      assertFalse(int1 == int0);
      assertEquals(1, int1);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-2878), (-2878));
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.available = 0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      stringReader0.reset();
      int int2 = simpleCharStream0.getBeginLine();
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, int2);
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      int int3 = simpleCharStream0.getBeginColumn();
      assertTrue(int3 == int2);
      assertFalse(int3 == int0);
      assertFalse(int3 == int1);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, int3);
      
      simpleCharStream0.adjustBeginLineColumn((-368), 0);
      assertEquals((-367), simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char[] charArray2 = simpleCharStream0.GetSuffix(0);
      assertArrayEquals(new char[] {}, charArray2);
      assertNotSame(charArray2, charArray1);
      assertNotSame(charArray2, charArray0);
      assertNotNull(charArray2);
      assertEquals(0, charArray2.length);
      assertFalse(charArray2.equals((Object)charArray1));
      assertFalse(charArray2.equals((Object)charArray0));
      assertEquals((-367), simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      int int4 = simpleCharStream0.getBeginColumn();
      assertFalse(int4 == int1);
      assertFalse(int4 == int0);
      assertTrue(int4 == int3);
      assertTrue(int4 == int2);
      assertEquals((-367), simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, int4);
      
      int int5 = simpleCharStream0.getBeginColumn();
      assertTrue(int5 == int2);
      assertTrue(int5 == int4);
      assertTrue(int5 == int3);
      assertFalse(int5 == int0);
      assertFalse(int5 == int1);
      assertEquals((-367), simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, int5);
      
      int int6 = simpleCharStream0.getBeginLine();
      assertFalse(int6 == int2);
      assertFalse(int6 == int0);
      assertFalse(int6 == int4);
      assertFalse(int6 == int3);
      assertFalse(int6 == int5);
      assertFalse(int6 == int1);
      assertEquals((-367), simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-367), int6);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      int int0 = stringReader0.read();
      assertEquals((-1), int0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 10, (-193), 8);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      StringReader stringReader1 = new StringReader("xSa");
      assertNotNull(stringReader1);
      assertFalse(stringReader1.equals((Object)stringReader0));
      
      simpleCharStream0.inputStream = (Reader) stringReader1;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.FillBuff();
      assertNotSame(stringReader0, stringReader1);
      assertFalse(stringReader0.equals((Object)stringReader1));
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.backup((-193));
      assertNotSame(stringReader0, stringReader1);
      assertFalse(stringReader0.equals((Object)stringReader1));
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(192, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
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
  public void test38()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 8, 8, 8);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      simpleCharStream0.ReInit((Reader) null);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      int int0 = 4096;
      simpleCharStream0.ReInit((Reader) null, 4096, 8);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
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
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      int int0 = 7;
      int int1 = 1268;
      int int2 = 8;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 7, 1268, 8);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('%');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("2%Muwi");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      int int0 = 3217;
      char[] charArray0 = new char[7];
      charArray0[0] = '3';
      charArray0[1] = '/';
      charArray0[2] = 'l';
      charArray0[3] = 'g';
      charArray0[4] = 'W';
      charArray0[5] = '@';
      charArray0[6] = ']';
      int int1 = stringReader0.read(charArray0);
      assertArrayEquals(new char[] {'2', '%', 'M', 'u', 'w', 'i', ']'}, charArray0);
      assertEquals(7, charArray0.length);
      assertFalse(int1 == int0);
      assertEquals(6, int1);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.GetSuffix(3217);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("HA8KQOnWACdIb;");
      assertNotNull(stringReader0);
      
      int int0 = (-1882);
      int int1 = 2173;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1882), (-347), 2173);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      simpleCharStream0.prevCharIsCR = true;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int2 = simpleCharStream0.getBeginLine();
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, int2);
      
      int int3 = simpleCharStream0.getBeginLine();
      assertFalse(int3 == int0);
      assertTrue(int3 == int2);
      assertFalse(int3 == int1);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, int3);
      
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
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char[] charArray0 = simpleCharStream0.GetSuffix(0);
      assertArrayEquals(new char[] {}, charArray0);
      assertNotNull(charArray0);
      assertEquals(0, charArray0.length);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.backup(0);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(4095, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      int int0 = simpleCharStream0.getEndColumn();
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(4095, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, int0);
      
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
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("M~0zfP0T0c");
      assertNotNull(stringReader0);
      
      int int0 = 0;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      stringReader0.reset();
      int int1 = (-1243);
      simpleCharStream0.bufpos = 2025;
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.column = 0;
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.available = 0;
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.ReInit((Reader) stringReader0, (-1243), (-1243));
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      char char0 = simpleCharStream0.readChar();
      assertEquals((-1243), simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1243), simpleCharStream0.getColumn());
      assertEquals((-1243), simpleCharStream0.getEndLine());
      assertEquals((-1243), simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4096, simpleCharStream0.bufpos);
      assertEquals('M', char0);
      
      char char1 = simpleCharStream0.readChar();
      assertFalse(char1 == char0);
      assertEquals((-1243), simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1242), simpleCharStream0.getColumn());
      assertEquals((-1243), simpleCharStream0.getEndLine());
      assertEquals((-1242), simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4097, simpleCharStream0.bufpos);
      assertEquals('~', char1);
      
      simpleCharStream0.maxNextCharInd = (-1243);
      assertEquals((-1243), simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1242), simpleCharStream0.getColumn());
      assertEquals((-1243), simpleCharStream0.getEndLine());
      assertEquals((-1242), simpleCharStream0.getEndColumn());
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
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("O_tM`B&{[e");
      assertNotNull(stringReader0);
      
      int int0 = (-1832);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1832), (-1832));
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      long long0 = stringReader0.skip((-3339L));
      assertEquals(0L, long0);
      
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-55);
      byteArray0[1] = (byte)104;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-55), (byte)104}, byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertEquals(2, byteArray0.length);
      assertEquals(2, byteArrayInputStream0.available());
      
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 10);
      assertArrayEquals(new byte[] {(byte) (-55), (byte)104}, byteArray0);
      assertNotNull(bufferedInputStream0);
      assertEquals(2, byteArray0.length);
      assertEquals(2, byteArrayInputStream0.available());
      
      simpleCharStream0.ReInit((InputStream) bufferedInputStream0, (-1832), (int) (byte)104);
      assertArrayEquals(new byte[] {(byte) (-55), (byte)104}, byteArray0);
      assertEquals(2, byteArray0.length);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(2, byteArrayInputStream0.available());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.backup((-1832));
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1831, simpleCharStream0.bufpos);
      
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("J<esh<3V ,0o");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1319, 0, 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)11;
      byteArray0[2] = (byte) (-89);
      byteArray0[3] = (byte) (-102);
      byteArray0[4] = (byte)36;
      byteArray0[5] = (byte)47;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)10, 1);
      assertArrayEquals(new byte[] {(byte)10, (byte)11, (byte) (-89), (byte) (-102), (byte)36, (byte)47}, byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertEquals(6, byteArray0.length);
      assertEquals((-4), byteArrayInputStream0.available());
      
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)10, (byte)11, (byte) (-89), (byte) (-102), (byte)36, (byte)47}, byteArray0);
      assertNotNull(dataInputStream0);
      assertEquals(6, byteArray0.length);
      assertEquals((-4), byteArrayInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(dataInputStream0);
      assertArrayEquals(new byte[] {(byte)10, (byte)11, (byte) (-89), (byte) (-102), (byte)36, (byte)47}, byteArray0);
      assertNotNull(simpleCharStream0);
      assertEquals(6, byteArray0.length);
      assertEquals((-4), byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      int int0 = simpleCharStream0.getBeginLine();
      assertArrayEquals(new byte[] {(byte)10, (byte)11, (byte) (-89), (byte) (-102), (byte)36, (byte)47}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals((-4), byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), (byte) (-1));
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertEquals(1, byteArray0.length);
      assertEquals((-1), byteArrayInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte) (-1)}, byteArray0);
      assertNotNull(simpleCharStream0);
      assertEquals(1, byteArray0.length);
      assertEquals((-1), byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      StringReader stringReader0 = new StringReader("xyk9q2e");
      assertNotNull(stringReader0);
      
      int int0 = 0;
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
      InputStream inputStream0 = null;
      int int0 = 2098;
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, 2098, 2098);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Reader reader0 = null;
      int int0 = (-788);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 0, (-788));
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
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
  public void test50()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      int int0 = 0;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.Done();
      assertEquals(0, pipedInputStream0.available());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      long long0 = pipedInputStream0.skip(0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0L, long0);
      
      StringReader stringReader0 = new StringReader("b]g[w7ubW");
      assertNotNull(stringReader0);
      
      stringReader0.close();
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      int int1 = 0;
      simpleCharStream0.ReInit((InputStream) pipedInputStream0, 0, 0, 0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      int int2 = (-1342);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0, (-1), (-1342), 3390);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      InputStream inputStream0 = null;
      int int0 = (-409);
      int int1 = 7;
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, 0, (-409), 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("H`i9bD");
      assertNotNull(stringReader0);
      
      long long0 = stringReader0.skip(0L);
      assertEquals(0L, long0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 1968, 786);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char[] charArray0 = new char[5];
      charArray0[0] = '}';
      charArray0[1] = 's';
      charArray0[2] = '>';
      charArray0[3] = '\\';
      simpleCharStream0.maxNextCharInd = 786;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      charArray0[4] = '\"';
      int int0 = stringReader0.read(charArray0);
      assertArrayEquals(new char[] {'H', '`', 'i', '9', 'b'}, charArray0);
      assertEquals(5, charArray0.length);
      assertEquals(5, int0);
      
      simpleCharStream0.ReInit((Reader) stringReader0, 0, 3064, 3064);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.maxNextCharInd = 1464;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int1 = stringReader0.read();
      assertFalse(int1 == int0);
      assertEquals(68, int1);
      
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
  public void test53()  throws Throwable  {
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      int int0 = 1232;
      stringReader0.reset();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1232, 1, 4217);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      int int1 = (-2798);
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((-2798));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Reader reader0 = null;
      int int0 = 0;
      int int1 = (-3167);
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((Reader) null, 0, 0, (-3167));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.Done();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
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
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      assertNotNull(stringReader0);
      
      stringReader0.reset();
      int int0 = (-1);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), (-1));
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
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
  public void test57()  throws Throwable  {
      int int0 = 1943;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 1943, 1943);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.line = 1943;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.Done();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.ReInit((Reader) null);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      char[] charArray0 = simpleCharStream0.GetSuffix(0);
      assertArrayEquals(new char[] {}, charArray0);
      assertNotNull(charArray0);
      assertEquals(0, charArray0.length);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((Reader) null, (-3200), 0, (-3200));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.ReInit((Reader) stringReader0, 0, 0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-24);
      byteArray0[2] = (byte)8;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte) (-25);
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte) (-44);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-977), (-434));
      assertArrayEquals(new byte[] {(byte)0, (byte) (-24), (byte)8, (byte)1, (byte) (-25), (byte) (-1), (byte) (-44)}, byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertEquals(7, byteArray0.length);
      assertEquals((-434), byteArrayInputStream0.available());
      
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-24), (byte)8, (byte)1, (byte) (-25), (byte) (-1), (byte) (-44)}, byteArray0);
      assertNotNull(pushbackInputStream0);
      assertEquals(7, byteArray0.length);
      assertEquals((-434), byteArrayInputStream0.available());
      
      simpleCharStream0.ReInit((InputStream) pushbackInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-24), (byte)8, (byte)1, (byte) (-25), (byte) (-1), (byte) (-44)}, byteArray0);
      assertEquals(7, byteArray0.length);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-434), byteArrayInputStream0.available());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-3607), (-3607));
      assertNotNull(simpleCharStream0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      simpleCharStream0.ReInit((Reader) stringReader0, (-3607), (-1523));
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      StringReader stringReader1 = new StringReader("");
      assertNotNull(stringReader1);
      assertFalse(stringReader1.equals((Object)stringReader0));
      
      simpleCharStream0.ReInit((Reader) stringReader1, (-3607), (-3607));
      assertNotSame(stringReader0, stringReader1);
      assertNotSame(stringReader1, stringReader0);
      assertFalse(stringReader0.equals((Object)stringReader1));
      assertFalse(stringReader1.equals((Object)stringReader0));
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      simpleCharStream0.ReInit((InputStream) pipedInputStream0, (-1523), (-1523));
      assertNotSame(stringReader0, stringReader1);
      assertFalse(stringReader0.equals((Object)stringReader1));
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, pipedInputStream0.available());
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-16);
      byteArray0[1] = (byte)110;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)77;
      byteArray0[5] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)110, (byte)77);
      assertArrayEquals(new byte[] {(byte) (-16), (byte)110, (byte) (-1), (byte)0, (byte)77, (byte) (-1)}, byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertEquals(6, byteArray0.length);
      assertEquals((-104), byteArrayInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte) (-16), (byte)110, (byte) (-1), (byte)0, (byte)77, (byte) (-1)}, byteArray0);
      assertNotNull(simpleCharStream0);
      assertEquals(6, byteArray0.length);
      assertEquals((-104), byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.backup((byte)77);
      assertArrayEquals(new byte[] {(byte) (-16), (byte)110, (byte) (-1), (byte)0, (byte)77, (byte) (-1)}, byteArray0);
      assertEquals(6, byteArray0.length);
      assertEquals((-104), byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(4018, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      stringReader0.ready();
      stringReader0.markSupported();
      int int0 = 0;
      simpleCharStream0.adjustBeginLineColumn(0, 1731);
      simpleCharStream0.GetSuffix(1731);
      char char0 = '\\';
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
  public void test62()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Gz#\u0003O:ULc;/<VG");
      int int0 = 0;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 3669);
      simpleCharStream0.ExpandBuff(false);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte)0;
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = (-699);
      int int1 = 0;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, (-699), 0);
      simpleCharStream0.ReInit((Reader) null, 0, 0);
      simpleCharStream0.GetImage();
      InputStream inputStream0 = null;
      simpleCharStream0.maxNextCharInd = 0;
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((InputStream) null, 0, (-699));
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
      StringReader stringReader0 = new StringReader("9U|.nKp%`]'yl");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.readChar();
      simpleCharStream0.adjustBeginLineColumn(3546, 364);
      assertEquals(364, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      int int0 = 2435;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(mockFileInputStream0, (-3133), 2435);
      simpleCharStream0.bufsize = 0;
      simpleCharStream0.adjustBeginLineColumn(1749, 1996);
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
  public void test66()  throws Throwable  {
      StringReader stringReader0 = new StringReader("NkzgF-B)N#k&D'&\"A");
      stringReader0.read();
      int int0 = 4096;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 4096);
      simpleCharStream0.ReInit((Reader) stringReader0, (-2540), (-2540), 2343);
      stringReader0.close();
      simpleCharStream0.available = 0;
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)39;
      byteArray0[3] = (byte)42;
      byteArray0[4] = (byte)15;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pushbackInputStream0, (-69), (byte)15, (-2114));
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
  public void test68()  throws Throwable  {
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
  public void test69()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
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
  public void test70()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" 9MLLJNmCHQ");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), 0);
      simpleCharStream0.BeginToken();
      simpleCharStream0.getEndLine();
      simpleCharStream0.GetSuffix(0);
      assertEquals(0, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      stringReader0.mark(13);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.maxNextCharInd = 0;
      stringReader0.markSupported();
      simpleCharStream0.inBuf = 262;
      simpleCharStream0.ExpandBuff(false);
      simpleCharStream0.GetSuffix(262);
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
  public void test72()  throws Throwable  {
      StringReader stringReader0 = new StringReader("PO@bJ]%7m\"6^Co");
      stringReader0.markSupported();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.GetImage();
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0, (-3108), 4095);
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
  public void test73()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "/AI35*%`4B)kH");
      StringReader stringReader0 = new StringReader("/AI35*%`4B)kH");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      stringReader0.ready();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)99;
      byteArray0[1] = (byte) (-122);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.readChar();
      simpleCharStream0.adjustBeginLineColumn((-1237), (-1237));
      char[] charArray0 = new char[8];
      charArray0[0] = '/';
      charArray0[1] = '/';
      charArray0[2] = '/';
      charArray0[3] = '/';
      charArray0[4] = '/';
      charArray0[5] = '/';
      charArray0[6] = '/';
      charArray0[7] = '/';
      stringReader0.read(charArray0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "/AI35*%`4B)kH");
      simpleCharStream0.ExpandBuff(false);
      stringReader0.close();
      simpleCharStream0.GetSuffix(4083);
      assertEquals(0, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      int int0 = 0;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 0, 0);
      simpleCharStream0.Done();
      pipedInputStream0.skip(0);
      StringReader stringReader0 = new StringReader("b]g[w7ubW");
      stringReader0.close();
      stringReader0.markSupported();
      stringReader0.markSupported();
      simpleCharStream0.ReInit((Reader) stringReader0);
      int int1 = 0;
      simpleCharStream0.ReInit((InputStream) pipedInputStream0, 0, 0, 0);
      int int2 = (-1342);
      simpleCharStream0.ReInit((InputStream) pipedInputStream0, (-1), (-1342), 3390);
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Reader reader0 = null;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      simpleCharStream0.GetImage();
      simpleCharStream0.adjustBeginLineColumn(4096, 4096);
      simpleCharStream0.GetImage();
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
  public void test76()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-9);
      byteArray0[1] = (byte) (-1);
      // Undeclared exception!
      try { 
        pipedInputStream0.read(byteArray0, (int) (byte) (-9), (int) (byte) (-9));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 210, (-6), 7);
      simpleCharStream0.prevCharIsCR = true;
      simpleCharStream0.adjustBeginLineColumn(0, (-6));
      simpleCharStream0.getBeginColumn();
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('!');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 210, 8, 7);
      simpleCharStream0.adjustBeginLineColumn(0, 8);
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals(8, simpleCharStream0.getBeginColumn());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      StringReader stringReader0 = new StringReader("M~0zfP0T0c");
      stringReader0.read();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      stringReader0.reset();
      simpleCharStream0.bufpos = (-1243);
      simpleCharStream0.column = 0;
      simpleCharStream0.available = 0;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "M~0zfP0T0c");
      simpleCharStream0.ReInit((Reader) stringReader0, (-1243), (-1243));
      simpleCharStream0.readChar();
      simpleCharStream0.readChar();
      simpleCharStream0.maxNextCharInd = (-1243);
      simpleCharStream0.GetImage();
      stringReader0.close();
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }
}
