
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
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
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
      StringReader stringReader0 = new StringReader(",~+`t0~C9");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.bufpos = 0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      
      long long0 = stringReader0.skip(0L);
      assertEquals(0L, long0);
      
      simpleCharStream0.backup(0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char char0 = simpleCharStream0.readChar();
      assertEquals(',', char0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      
      char[] charArray0 = simpleCharStream0.GetSuffix(2034);
      assertNotNull(charArray0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(2034, charArray0.length);
      
      simpleCharStream0.UpdateLineColumn('5');
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(2, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      
      int int0 = simpleCharStream0.getEndLine();
      assertEquals(1, int0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(2, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      
      int int1 = simpleCharStream0.getEndColumn();
      assertFalse(int1 == int0);
      assertEquals(2, int1);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(2, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      assertNotNull(stringReader0);
      
      int int0 = stringReader0.read();
      assertEquals(111, int0);
      
      int int1 = stringReader0.read();
      assertFalse(int1 == int0);
      assertEquals(114, int1);
      
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      byteArray0[0] = (byte) (-23);
      byte byte0 = (byte) (-27);
      byteArray0[1] = (byte) (-27);
      byte byte1 = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte) (-1);
      boolean boolean1 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
      assertArrayEquals(new byte[] {(byte) (-23), (byte) (-27), (byte)0, (byte)8, (byte) (-1)}, byteArray0);
      assertEquals(5, byteArray0.length);
      
      boolean boolean2 = stringReader0.markSupported();
      assertTrue(boolean2 == boolean0);
      assertFalse(boolean2 == boolean1);
      assertTrue(boolean2);
      
      long long0 = stringReader0.skip(0L);
      assertEquals(0L, long0);
      
      long long1 = stringReader0.skip(114);
      assertFalse(long1 == long0);
      assertEquals(50L, long1);
      
      int int2 = stringReader0.read();
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals((-1), int2);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 300, 300, 300);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ReInit((Reader) stringReader0, 300, 300);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.backup((byte)8);
      assertEquals(4087, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      simpleCharStream0.inputStream = (Reader) stringReader0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      simpleCharStream0.adjustBeginLineColumn(0, (-1));
      assertEquals(4087, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      int int3 = simpleCharStream0.getEndLine();
      assertFalse(int3 == int1);
      assertFalse(int3 == int2);
      assertFalse(int3 == int0);
      assertEquals(0, int3);
      assertEquals(4087, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      simpleCharStream0.Done();
      assertEquals(4087, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      int int4 = 4065;
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndColumn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("|\u0007XJhGFB!h@S-Y");
      assertNotNull(stringReader0);
      
      boolean boolean0 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "7ldo4:g))");
      assertFalse(boolean0);
      
      long long0 = stringReader0.skip(1);
      assertEquals(1L, long0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1, 1, 1);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals(0, int0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ReInit((Reader) stringReader0, 0, 0, 1551);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char char0 = simpleCharStream0.readChar();
      assertEquals('\u0007', char0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int1 = simpleCharStream0.getBeginLine();
      assertTrue(int1 == int0);
      assertEquals(0, int1);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char char1 = simpleCharStream0.BeginToken();
      assertFalse(char1 == char0);
      assertEquals('X', char1);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      
      int int2 = simpleCharStream0.getColumn();
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(1, int2);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("QTE?cI#URh5s{\"x9-");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals('Q', char0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getColumn());
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      // Undeclared exception!
      try { 
        stringReader0.read((CharBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 0, (-911));
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = simpleCharStream0.getBeginColumn();
      assertEquals(0, int0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.adjustBeginLineColumn(0, (-911));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, pipedInputStream0.available());
      assertEquals((-911), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      boolean boolean0 = false;
      pipedInputStream0.mark((-911));
      assertEquals(0, pipedInputStream0.available());
      
      simpleCharStream0.ExpandBuff(false);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, pipedInputStream0.available());
      assertEquals((-911), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      simpleCharStream0.adjustBeginLineColumn(1894, (-911));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2042, 2042, 2042);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      stringReader0.close();
      simpleCharStream0.ReInit((Reader) stringReader0, 2042, 4065, 2042);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = 2048;
      stringReader0.close();
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
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      assertNotNull(stringReader0);
      
      int int0 = stringReader0.read();
      assertEquals(111, int0);
      
      int int1 = stringReader0.read();
      assertFalse(int1 == int0);
      assertEquals(114, int1);
      
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      byteArray0[0] = (byte) (-23);
      byteArray0[1] = (byte) (-27);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte) (-1);
      boolean boolean1 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
      assertArrayEquals(new byte[] {(byte) (-23), (byte) (-27), (byte)0, (byte)8, (byte) (-1)}, byteArray0);
      assertEquals(5, byteArray0.length);
      
      boolean boolean2 = stringReader0.markSupported();
      assertTrue(boolean2 == boolean0);
      assertFalse(boolean2 == boolean1);
      assertTrue(boolean2);
      
      long long0 = stringReader0.skip(0L);
      assertEquals(0L, long0);
      
      long long1 = stringReader0.skip(114);
      assertFalse(long1 == long0);
      assertEquals(50L, long1);
      
      int int2 = stringReader0.read();
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals((-1), int2);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 300, 300, 300);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.ReInit((Reader) stringReader0, 300, 300);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.backup((byte)8);
      assertEquals(4087, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      simpleCharStream0.inputStream = (Reader) stringReader0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      simpleCharStream0.adjustBeginLineColumn(0, (-1));
      assertEquals(4087, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      int int3 = simpleCharStream0.getEndLine();
      assertFalse(int3 == int0);
      assertFalse(int3 == int2);
      assertFalse(int3 == int1);
      assertEquals(0, int3);
      assertEquals(4087, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      simpleCharStream0.Done();
      assertEquals(4087, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)5;
      byteArray0[2] = (byte)18;
      byteArray0[3] = (byte) (-6);
      byteArray0[4] = (byte) (-126);
      byteArray0[5] = (byte) (-79);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 4096, (byte) (-6));
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)5, (byte)18, (byte) (-6), (byte) (-126), (byte) (-79)}, byteArray0);
      assertEquals((-4090), byteArrayInputStream0.available());
      assertEquals(6, byteArray0.length);
      
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertArrayEquals(new byte[] {(byte)0, (byte)5, (byte)18, (byte) (-6), (byte) (-126), (byte) (-79)}, byteArray0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-4090), byteArrayInputStream0.available());
      assertEquals(6, byteArray0.length);
      
      simpleCharStream0.bufpos = 1;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      int int0 = simpleCharStream0.getEndColumn();
      assertEquals(0, int0);
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      intArray0[1] = 0;
      intArray0[2] = 1;
      intArray0[3] = 1;
      intArray0[4] = 0;
      simpleCharStream0.bufline = intArray0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      StringReader stringReader1 = null;
      try {
        stringReader1 = new StringReader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.backup((-1));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
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
      
      simpleCharStream0.UpdateLineColumn('$');
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      
      boolean boolean0 = FileSystemHandling.createFolder((EvoSuiteFile) null);
      assertFalse(boolean0);
      
      int int0 = simpleCharStream0.getEndLine();
      assertEquals(1, int0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals("\u0000", string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      
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
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.backup((-1));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.available = 0;
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.tokenBegin = (-1233);
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      simpleCharStream0.UpdateLineColumn('$');
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1233
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char[] charArray0 = new char[5];
      charArray0[0] = '+';
      int int0 = stringReader0.read(charArray0);
      assertEquals(5, int0);
      assertArrayEquals(new char[] {'o', 'r', 'g', '.', 'a'}, charArray0);
      assertEquals(5, charArray0.length);
      
      simpleCharStream0.bufpos = 908;
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      boolean boolean0 = FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      assertFalse(boolean0);
      
      charArray0[1] = 'U';
      charArray0[2] = 'm';
      charArray0[3] = 'b';
      simpleCharStream0.prevCharIsCR = true;
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      charArray0[4] = '?';
      simpleCharStream0.buffer = charArray0;
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int1 = simpleCharStream0.getColumn();
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      assertEquals(908, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.GetSuffix(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      assertNotNull(stringReader0);
      
      int int0 = stringReader0.read();
      assertEquals(111, int0);
      
      int int1 = stringReader0.read();
      assertFalse(int1 == int0);
      assertEquals(114, int1);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      boolean boolean1 = stringReader0.ready();
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      
      boolean boolean2 = stringReader0.ready();
      assertTrue(boolean2 == boolean1);
      assertTrue(boolean2 == boolean0);
      assertTrue(boolean2);
      
      long long0 = stringReader0.skip(0L);
      assertEquals(0L, long0);
      
      long long1 = stringReader0.skip(114);
      assertFalse(long1 == long0);
      assertEquals(50L, long1);
      
      int int2 = stringReader0.read();
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals((-1), int2);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), 11, 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals("", string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = (-1);
      simpleCharStream0.backup((-1));
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
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
      
      simpleCharStream0.UpdateLineColumn('$');
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      
      int int1 = simpleCharStream0.getBeginColumn();
      assertFalse(int1 == int0);
      assertEquals(1, int1);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      
      boolean boolean0 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      assertFalse(boolean0);
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals("\u0000", string0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      
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
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("|\u0007XJhGFB!h@S-Y");
      assertNotNull(stringReader0);
      
      boolean boolean0 = FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "7ldo4:g))");
      assertFalse(boolean0);
      
      long long0 = stringReader0.skip(1);
      assertEquals(1L, long0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1, 1, 1);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals(0, int0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ReInit((Reader) stringReader0, 0, 0, 1551);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char char0 = simpleCharStream0.readChar();
      assertEquals('\u0007', char0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      int int1 = simpleCharStream0.getBeginLine();
      assertTrue(int1 == int0);
      assertEquals(0, int1);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      char char1 = simpleCharStream0.BeginToken();
      assertFalse(char1 == char0);
      assertEquals('X', char1);
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      int int2 = simpleCharStream0.getEndLine();
      assertTrue(int2 == int1);
      assertTrue(int2 == int0);
      assertEquals(0, int2);
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      
      char[] charArray0 = simpleCharStream0.GetSuffix(1551);
      assertNotNull(charArray0);
      assertEquals(1, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(1551, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 1996;
      intArray0[1] = 1996;
      intArray0[2] = 1996;
      intArray0[3] = 1;
      intArray0[4] = 1996;
      intArray0[6] = 1996;
      intArray0[7] = 1996;
      StringReader stringReader0 = new StringReader("AW\"rZjC");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1996, 1996, 1996);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals(0, int0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.adjustBeginLineColumn(1996, 1996);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1997, simpleCharStream0.getBeginLine());
      assertEquals(1996, simpleCharStream0.getBeginColumn());
      
      int int1 = simpleCharStream0.getBeginLine();
      assertFalse(int1 == int0);
      assertEquals(1997, int1);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1997, simpleCharStream0.getBeginLine());
      assertEquals(1996, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader(",~+`t0:C9");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.bufpos = 0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      
      simpleCharStream0.column = 0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      
      stringReader0.mark(0);
      long long0 = stringReader0.skip(0L);
      assertEquals(0L, long0);
      
      simpleCharStream0.backup(0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char[] charArray0 = simpleCharStream0.GetSuffix(2034);
      assertNotNull(charArray0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(2034, charArray0.length);
      
      simpleCharStream0.adjustBeginLineColumn(2034, 4062);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4062, simpleCharStream0.getBeginColumn());
      assertEquals(2035, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.ReInit((Reader) stringReader0, 1215, 2034, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.adjustBeginLineColumn(2034, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.backup((-33));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(32, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      
      simpleCharStream0.available = 32;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      
      simpleCharStream0.UpdateLineColumn('$');
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(32, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(32, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      
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
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (-1971), (-4036), 19);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.tokenBegin = 4078;
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals(0, int0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      pipedInputStream0.close();
      assertEquals(0, pipedInputStream0.available());
      
      simpleCharStream0.ExpandBuff(false);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      boolean boolean0 = pipedInputStream0.markSupported();
      assertFalse(boolean0);
      assertEquals(0, pipedInputStream0.available());
      
      int int0 = simpleCharStream0.getBeginColumn();
      assertEquals(0, int0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      pipedInputStream0.close();
      assertEquals(0, pipedInputStream0.available());
      
      simpleCharStream0.prevCharIsLF = true;
      assertEquals(0, pipedInputStream0.available());
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
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      stringReader0.reset();
      stringReader0.close();
      simpleCharStream0.adjustBeginLineColumn((-1), 10);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(10, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(10, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        CharBuffer.wrap((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertFalse(boolean0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0, byteArray0.length);
      
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      boolean boolean1 = stringReader0.ready();
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
      
      boolean boolean2 = stringReader0.markSupported();
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2 == boolean0);
      assertTrue(boolean2);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-4700), (-4700));
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
      
      simpleCharStream0.backup((-1019));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1018, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getColumn());
      
      simpleCharStream0.UpdateLineColumn('<');
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1018, simpleCharStream0.bufpos);
      assertEquals((-4700), simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals((-4700), simpleCharStream0.getColumn());
      assertEquals((-4700), simpleCharStream0.getLine());
      assertEquals((-4700), simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
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
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 79, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.bufpos = 0;
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.line = 0;
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int0 = simpleCharStream0.getEndLine();
      assertEquals(0, int0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "d6");
      assertFalse(boolean0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
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
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("X O86~5qdZK?3y(.Oo");
      assertNotNull(stringReader0);
      
      char[] charArray0 = new char[6];
      charArray0[0] = 'B';
      charArray0[1] = ']';
      charArray0[2] = 'Z';
      charArray0[3] = 'z';
      charArray0[4] = ' ';
      charArray0[5] = 'b';
      int int0 = stringReader0.read(charArray0);
      assertEquals(6, int0);
      assertArrayEquals(new char[] {'X', ' ', 'O', '8', '6', '~'}, charArray0);
      assertEquals(6, charArray0.length);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2251, 4096, 3557);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int1 = simpleCharStream0.getBeginLine();
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char char0 = simpleCharStream0.readChar();
      assertEquals('5', char0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(2251, simpleCharStream0.getEndLine());
      assertEquals(4096, simpleCharStream0.getColumn());
      assertEquals(4096, simpleCharStream0.getBeginColumn());
      assertEquals(4096, simpleCharStream0.getEndColumn());
      assertEquals(2251, simpleCharStream0.getLine());
      assertEquals(2251, simpleCharStream0.getBeginLine());
      
      char[] charArray1 = simpleCharStream0.GetSuffix(1);
      assertFalse(charArray1.equals((Object)charArray0));
      assertNotNull(charArray1);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertNotSame(charArray1, charArray0);
      assertArrayEquals(new char[] {'5'}, charArray1);
      assertEquals(2251, simpleCharStream0.getEndLine());
      assertEquals(4096, simpleCharStream0.getColumn());
      assertEquals(4096, simpleCharStream0.getBeginColumn());
      assertEquals(4096, simpleCharStream0.getEndColumn());
      assertEquals(2251, simpleCharStream0.getLine());
      assertEquals(2251, simpleCharStream0.getBeginLine());
      assertEquals(1, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      assertNotNull(fileSystemHandling0);
      
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.Done();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      long long0 = stringReader0.skip((-1536L));
      assertEquals(0L, long0);
      
      boolean boolean0 = stringReader0.ready();
      assertTrue(boolean0);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('/');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("o^n");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 1);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((InputStream) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("&y(G`.hoR?3K!^");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 7, 7, 7);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int[] intArray0 = new int[2];
      long long0 = stringReader0.skip(0L);
      assertEquals(0L, long0);
      
      intArray0[0] = 7;
      intArray0[1] = 7;
      simpleCharStream0.bufcolumn = intArray0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(7, simpleCharStream0.getBeginColumn());
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals('&', char0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(7, simpleCharStream0.getColumn());
      assertEquals(7, simpleCharStream0.getEndLine());
      assertEquals(7, simpleCharStream0.getEndColumn());
      assertEquals(7, simpleCharStream0.getBeginColumn());
      assertEquals(7, simpleCharStream0.getBeginLine());
      assertEquals(7, simpleCharStream0.getLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.GetSuffix((-1052));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      stringReader0.reset();
      int int0 = (-1027);
      boolean boolean0 = stringReader0.ready();
      assertTrue(boolean0);
      
      stringReader0.close();
      int int1 = 0;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1027), (-1027), 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.inputStream = (Reader) stringReader0;
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      sequenceInputStream0.close();
      int int0 = sequenceInputStream0.read();
      assertEquals((-1), int0);
      
      int int1 = sequenceInputStream0.available();
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      
      int int2 = sequenceInputStream0.read();
      assertTrue(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals((-1), int2);
      
      simpleCharStream0.maxNextCharInd = 2498;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int3 = sequenceInputStream0.available();
      assertFalse(int3 == int2);
      assertTrue(int3 == int1);
      assertFalse(int3 == int0);
      assertEquals(0, int3);
      
      sequenceInputStream0.close();
      int int4 = 3863;
      char[] charArray0 = simpleCharStream0.GetSuffix(3863);
      assertNotNull(charArray0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(3863, charArray0.length);
      
      int int5 = sequenceInputStream0.available();
      assertFalse(int5 == int2);
      assertTrue(int5 == int3);
      assertFalse(int5 == int0);
      assertTrue(int5 == int1);
      assertFalse(int5 == int4);
      assertEquals(0, int5);
      
      char char0 = simpleCharStream0.readChar();
      assertEquals('\u0000', char0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      
      simpleCharStream0.Done();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      
      boolean boolean0 = sequenceInputStream0.markSupported();
      assertFalse(boolean0);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.GetSuffix(721);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      assertNotNull(dataInputStream0);
      
      int int0 = 1;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(dataInputStream0, 1, 1, 1);
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
      
      simpleCharStream0.backup(1);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4094, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
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
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)99;
      byte byte0 = (byte) (-1);
      byteArray0[1] = (byte) (-1);
      int int0 = 8;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 8, (-1023));
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)99, (byte) (-1)}, byteArray0);
      assertEquals((-1023), byteArrayInputStream0.available());
      assertEquals(2, byteArray0.length);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 0, 2717);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertArrayEquals(new byte[] {(byte)99, (byte) (-1)}, byteArray0);
      assertEquals((-1023), byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(2, byteArray0.length);
      
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      assertNotNull(pushbackInputStream0);
      assertArrayEquals(new byte[] {(byte)99, (byte) (-1)}, byteArray0);
      assertEquals((-1023), byteArrayInputStream0.available());
      assertEquals(2, byteArray0.length);
      
      byte[] byteArray1 = new byte[4];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = (byte) (-1);
      simpleCharStream0.Done();
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertNotSame(byteArray0, byteArray1);
      assertArrayEquals(new byte[] {(byte)99, (byte) (-1)}, byteArray0);
      assertEquals((-1023), byteArrayInputStream0.available());
      assertEquals(2, byteArray0.length);
      
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((Reader) stringReader0, (int) (byte) (-1), 2708, (int) (byte) (-1));
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
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      stringReader0.close();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.inputStream = (Reader) stringReader0;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int[] intArray0 = new int[1];
      intArray0[0] = (-1);
      simpleCharStream0.bufcolumn = intArray0;
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      stringReader0.close();
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = 1136;
      simpleCharStream0.bufpos = 1136;
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int1 = simpleCharStream0.getBeginColumn();
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      assertEquals(1136, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("|H=Q=+;!u`7x\"j-?J");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 2094);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char[] charArray0 = simpleCharStream0.GetSuffix(0);
      assertNotNull(charArray0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertArrayEquals(new char[] {}, charArray0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("XPAO%9BXZ $q}s)%&");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char char0 = simpleCharStream0.readChar();
      assertEquals('X', char0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getColumn());
      
      stringReader0.close();
      simpleCharStream0.prevCharIsCR = true;
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getColumn());
      
      simpleCharStream0.Done();
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.column = (-1);
      int int0 = (-2289);
      simpleCharStream0.available = 0;
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
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
  public void test34()  throws Throwable  {
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(sequenceInputStream0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int0 = sequenceInputStream0.read();
      assertEquals((-1), int0);
      
      long long0 = sequenceInputStream0.skip(6909L);
      assertEquals(0L, long0);
      
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
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("gk86O");
      assertNotNull(stringReader0);
      
      long long0 = stringReader0.skip(258L);
      assertEquals(5L, long0);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      boolean boolean1 = stringReader0.markSupported();
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
      
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "gk86O", 0, 0);
      assertNotNull(charBuffer0);
      assertEquals("", charBuffer0.toString());
      assertEquals(0, charBuffer0.length());
      assertEquals(0, charBuffer0.position());
      assertFalse(charBuffer0.isDirect());
      assertFalse(charBuffer0.hasArray());
      assertFalse(charBuffer0.hasRemaining());
      assertEquals(0, charBuffer0.limit());
      assertTrue(charBuffer0.isReadOnly());
      assertEquals(5, charBuffer0.capacity());
      assertEquals(0, charBuffer0.remaining());
      
      int int0 = stringReader0.read(charBuffer0);
      assertEquals(0, int0);
      assertEquals("", charBuffer0.toString());
      assertEquals(0, charBuffer0.length());
      assertEquals(0, charBuffer0.position());
      assertFalse(charBuffer0.isDirect());
      assertFalse(charBuffer0.hasArray());
      assertFalse(charBuffer0.hasRemaining());
      assertEquals(0, charBuffer0.limit());
      assertTrue(charBuffer0.isReadOnly());
      assertEquals(5, charBuffer0.capacity());
      assertEquals(0, charBuffer0.remaining());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char[] charArray0 = simpleCharStream0.GetSuffix(263);
      assertNotNull(charArray0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(263, charArray0.length);
      
      simpleCharStream0.ReInit((Reader) stringReader0, 0, (-1));
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("|\u0007XJhGFB!h@S-Y");
      assertNotNull(stringReader0);
      
      long long0 = stringReader0.skip(1);
      assertEquals(1L, long0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1, 1, 1);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals(0, int0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ReInit((Reader) stringReader0, 0, 0, 1551);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char char0 = simpleCharStream0.readChar();
      assertEquals('\u0007', char0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      int int1 = simpleCharStream0.getBeginLine();
      assertTrue(int1 == int0);
      assertEquals(0, int1);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.backup((-1));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.available = (-1);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.UpdateLineColumn('&');
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertEquals("\u0000", string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getColumn());
      assertEquals(1, simpleCharStream0.getLine());
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, simpleCharStream0.getEndColumn());
      assertEquals(1, simpleCharStream0.getEndLine());
      assertEquals(1, simpleCharStream0.getBeginLine());
      
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
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("C|/Z");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-2585), (-602));
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.available = (-602);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.Done();
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
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Reader reader0 = null;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 0, (-1));
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      simpleCharStream0.bufpos = 0;
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.UpdateLineColumn('c');
      assertEquals(0, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.column = (-4032);
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals((-1), simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals((-1), simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = sequenceInputStream0.read();
      assertEquals((-1), int0);
      
      long long0 = sequenceInputStream0.skip((-1));
      assertEquals(0L, long0);
      
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0, 549, 549, 1575);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int[] intArray0 = new int[7];
      intArray0[0] = 549;
      intArray0[1] = 1575;
      intArray0[2] = 1575;
      intArray0[3] = 548;
      intArray0[4] = 0;
      intArray0[5] = (-1);
      intArray0[6] = (-4032);
      simpleCharStream0.bufcolumn = intArray0;
      assertEquals(549, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.prevCharIsLF = true;
      assertEquals(549, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.Done();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      assertNotNull(bufferedInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0, 1, 1);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.adjustBeginLineColumn(1, 1);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getBeginLine());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getBeginLine());
      
      StringReader stringReader0 = new StringReader(string0);
      assertNotNull(stringReader0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.inputStream = (Reader) stringReader0;
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getBeginLine());
      
      char char0 = simpleCharStream0.BeginToken();
      assertEquals('\u0000', char0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(2, simpleCharStream0.getColumn());
      assertEquals(2, simpleCharStream0.getEndColumn());
      assertEquals(2, simpleCharStream0.getLine());
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getEndLine());
      assertEquals(2, simpleCharStream0.getBeginLine());
      
      int[] intArray0 = new int[7];
      intArray0[0] = 0;
      intArray0[1] = 1;
      intArray0[2] = 4422;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 1;
      intArray0[6] = 0;
      simpleCharStream0.bufcolumn = intArray0;
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(2, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getEndLine());
      assertEquals(2, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.ReInit((InputStream) bufferedInputStream0, 1, 0, 1);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(2, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      stringReader0.reset();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), (-1), 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
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
  public void test42()  throws Throwable  {
      InputStream inputStream0 = null;
      int int0 = 1486;
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, 1486, 1486, 1486);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("|pt|7k9U:yJw\"\"");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1, (-803));
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals(0, int0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.ReInit((Reader) stringReader0, (-803), 3558, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.Done();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.Done();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, (-3316), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Reader reader0 = null;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = (-443);
      simpleCharStream0.backup((-443));
      assertEquals(442, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.Done();
      assertEquals(442, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      int int1 = 1;
      simpleCharStream0.ReInit((Reader) null, (-443), 1);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1554, 1554, 1554);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ReInit((Reader) stringReader0, 1554, (-773));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      char[] charArray0 = new char[5];
      charArray0[0] = 'L';
      charArray0[1] = '<';
      charArray0[2] = 'r';
      charArray0[3] = '=';
      charArray0[4] = 'b';
      simpleCharStream0.buffer = charArray0;
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      StringReader stringReader1 = new StringReader("");
      assertFalse(stringReader1.equals((Object)stringReader0));
      assertNotNull(stringReader1);
      
      simpleCharStream0.ReInit((Reader) stringReader1, (-773), 1554);
      assertFalse(stringReader0.equals((Object)stringReader1));
      assertFalse(stringReader1.equals((Object)stringReader0));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertNotSame(stringReader0, stringReader1);
      assertNotSame(stringReader1, stringReader0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int0 = 10;
      // Undeclared exception!
      try { 
        simpleCharStream0.ReInit((Reader) stringReader0, (-773), 10, (-1891));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      CharBuffer charBuffer0 = CharBuffer.allocate(4347);
      assertNotNull(charBuffer0);
      assertFalse(charBuffer0.isReadOnly());
      assertEquals(4347, charBuffer0.length());
      assertEquals(4347, charBuffer0.remaining());
      assertEquals(0, charBuffer0.position());
      assertFalse(charBuffer0.isDirect());
      assertTrue(charBuffer0.hasArray());
      assertTrue(charBuffer0.hasRemaining());
      assertEquals(4347, charBuffer0.limit());
      assertEquals(4347, charBuffer0.capacity());
      assertEquals(0, charBuffer0.arrayOffset());
      
      int int0 = stringReader0.read(charBuffer0);
      assertEquals((-1), int0);
      assertFalse(charBuffer0.isReadOnly());
      assertEquals(4347, charBuffer0.length());
      assertEquals(4347, charBuffer0.remaining());
      assertEquals(0, charBuffer0.position());
      assertFalse(charBuffer0.isDirect());
      assertTrue(charBuffer0.hasArray());
      assertTrue(charBuffer0.hasRemaining());
      assertEquals(4347, charBuffer0.limit());
      assertEquals(4347, charBuffer0.capacity());
      assertEquals(0, charBuffer0.arrayOffset());
      
      Buffer buffer0 = charBuffer0.limit(0);
      assertNotNull(buffer0);
      assertEquals(0, charBuffer0.remaining());
      assertFalse(charBuffer0.isReadOnly());
      assertEquals(0, charBuffer0.length());
      assertFalse(charBuffer0.hasRemaining());
      assertEquals(0, charBuffer0.limit());
      assertEquals(0, charBuffer0.position());
      assertFalse(charBuffer0.isDirect());
      assertTrue(charBuffer0.hasArray());
      assertEquals("", charBuffer0.toString());
      assertEquals(4347, charBuffer0.capacity());
      assertEquals(0, charBuffer0.arrayOffset());
      assertFalse(buffer0.isDirect());
      assertEquals(0, buffer0.limit());
      assertFalse(buffer0.hasRemaining());
      assertEquals(0, buffer0.arrayOffset());
      assertEquals(0, buffer0.remaining());
      assertFalse(buffer0.isReadOnly());
      assertEquals(0, buffer0.position());
      assertEquals(4347, buffer0.capacity());
      assertTrue(buffer0.hasArray());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      int int1 = sequenceInputStream0.available();
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0, (-1), 0, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.available = (-1);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.BeginToken();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
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
  public void test50()  throws Throwable  {
      Reader reader0 = null;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      assertNotNull(simpleCharStream0);
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
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int int0 = 1534;
      PipedInputStream pipedInputStream0 = new PipedInputStream(1534);
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      pipedInputStream0.mark((-1141));
      assertEquals(0, pipedInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      char[] charArray0 = new char[4];
      charArray0[0] = 'I';
      charArray0[1] = '<';
      charArray0[2] = '*';
      charArray0[3] = '1';
      simpleCharStream0.buffer = charArray0;
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.FillBuff();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)1;
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)28;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)1, (byte)28}, byteArray0);
      assertEquals(2, byteArrayInputStream0.available());
      assertEquals(2, byteArray0.length);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertArrayEquals(new byte[] {(byte)1, (byte)28}, byteArray0);
      assertEquals(2, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(2, byteArray0.length);
      
      int int0 = byteArrayInputStream0.read(byteArray0);
      assertEquals(2, int0);
      assertArrayEquals(new byte[] {(byte)1, (byte)28}, byteArray0);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(2, byteArray0.length);
      
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
  public void test53()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      pipedInputStream0.close();
      assertEquals(0, pipedInputStream0.available());
      
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
  public void test54()  throws Throwable  {
      Reader reader0 = null;
      int int0 = 0;
      int int1 = 1704;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null, 0, 1704);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
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
  public void test55()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 0, (-911));
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = simpleCharStream0.getBeginColumn();
      assertEquals(0, int0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.adjustBeginLineColumn(0, (-911));
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals((-911), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      pipedInputStream0.mark((-911));
      assertEquals(0, pipedInputStream0.available());
      
      simpleCharStream0.ExpandBuff(false);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals((-911), simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      long long0 = stringReader0.skip(0);
      assertEquals(0L, long0);
      
      simpleCharStream0.ReInit((Reader) stringReader0, 0, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader("nbhw}");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.FillBuff();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = "";
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      int int0 = (-339);
      int int1 = (-4342);
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream(stringReader0, (-339), (-339), (-4342));
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
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int0 = 1962;
      simpleCharStream0.inBuf = 1962;
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      int int1 = 2674;
      // Undeclared exception!
      try { 
        simpleCharStream0.UpdateLineColumn('T');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-5572), (-5572));
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)81;
      byteArray0[1] = (byte) (-56);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-85);
      byteArray0[5] = (byte)16;
      byteArray0[6] = (byte)1;
      byteArray0[7] = (byte) (-44);
      byteArray0[8] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)81, (byte) (-56), (byte)0, (byte)0, (byte) (-85), (byte)16, (byte)1, (byte) (-44), (byte)0}, byteArray0);
      assertEquals(9, byteArrayInputStream0.available());
      assertEquals(9, byteArray0.length);
      
      simpleCharStream0.ReInit((InputStream) byteArrayInputStream0, (int) (byte)0, (int) (byte)0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertArrayEquals(new byte[] {(byte)81, (byte) (-56), (byte)0, (byte)0, (byte) (-85), (byte)16, (byte)1, (byte) (-44), (byte)0}, byteArray0);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(9, byteArrayInputStream0.available());
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      boolean boolean0 = stringReader0.markSupported();
      assertTrue(boolean0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      stringReader0.reset();
      stringReader0.close();
      simpleCharStream0.adjustBeginLineColumn(76, 0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(77, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      String string0 = simpleCharStream0.GetImage();
      assertNotNull(string0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(77, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        CharBuffer.wrap((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)76;
      byteArray0[1] = (byte) (-5);
      byteArray0[2] = (byte) (-26);
      byteArray0[3] = (byte)45;
      byteArray0[4] = (byte) (-67);
      byteArray0[5] = (byte) (-23);
      byteArray0[6] = (byte)8;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)8, (-2838));
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)76, (byte) (-5), (byte) (-26), (byte)45, (byte) (-67), (byte) (-23), (byte)8}, byteArray0);
      assertEquals((-2838), byteArrayInputStream0.available());
      assertEquals(7, byteArray0.length);
      
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      assertNotNull(sequenceInputStream0);
      assertArrayEquals(new byte[] {(byte)76, (byte) (-5), (byte) (-26), (byte)45, (byte) (-67), (byte) (-23), (byte)8}, byteArray0);
      assertEquals((-2838), byteArrayInputStream0.available());
      assertEquals(7, byteArray0.length);
      
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0, (-1), (int) (byte) (-5), (int) (byte)45);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertArrayEquals(new byte[] {(byte)76, (byte) (-5), (byte) (-26), (byte)45, (byte) (-67), (byte) (-23), (byte)8}, byteArray0);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-2838), byteArrayInputStream0.available());
      assertEquals(7, byteArray0.length);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      assertNotNull(fileDescriptor0);
      assertFalse(fileDescriptor0.valid());
      
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      assertNotNull(mockFileInputStream0);
      
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      assertNotNull(pushbackInputStream0);
      assertFalse(fileDescriptor0.valid());
      
      mockFileInputStream0.mark((-1));
      assertFalse(fileDescriptor0.valid());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pushbackInputStream0, 2557, 943, 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(fileDescriptor0.valid());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.backup(0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4095, simpleCharStream0.bufpos);
      assertFalse(fileDescriptor0.valid());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      char[] charArray0 = simpleCharStream0.GetSuffix(2012);
      assertNotNull(charArray0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(4095, simpleCharStream0.bufpos);
      assertFalse(fileDescriptor0.valid());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getEndLine());
      assertEquals(2012, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      char[] charArray0 = new char[4];
      charArray0[0] = '5';
      charArray0[1] = 'f';
      charArray0[2] = '9';
      charArray0[3] = 'Q';
      int int0 = stringReader0.read(charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'5', 'f', '9', 'Q'}, charArray0);
      assertEquals(4, charArray0.length);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), 0, 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      
      stringReader0.reset();
      simpleCharStream0.bufsize = 0;
      stringReader0.reset();
      simpleCharStream0.backup((-1));
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      
      char[] charArray1 = new char[0];
      assertFalse(charArray1.equals((Object)charArray0));
      
      int int1 = stringReader0.read(charArray1);
      assertFalse(charArray1.equals((Object)charArray0));
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      assertNotSame(charArray1, charArray0);
      assertArrayEquals(new char[] {}, charArray1);
      assertEquals(0, charArray1.length);
      
      simpleCharStream0.Done();
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.bufpos);
      
      // Undeclared exception!
      try { 
        simpleCharStream0.adjustBeginLineColumn(2128, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      assertNotNull(fileDescriptor0);
      assertFalse(fileDescriptor0.valid());
      
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      assertNotNull(mockFileInputStream0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(mockFileInputStream0, 0, (-1));
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(fileDescriptor0.valid());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ReInit((InputStream) mockFileInputStream0, (-768), 0, 4374);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertFalse(fileDescriptor0.valid());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)118;
      byteArray0[3] = (byte)9;
      byteArray0[4] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)118, (byte)9, (byte)0}, byteArray0);
      assertEquals(5, byteArrayInputStream0.available());
      assertEquals(5, byteArray0.length);
      
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      assertNotNull(pushbackInputStream0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)118, (byte)9, (byte)0}, byteArray0);
      assertEquals(5, byteArrayInputStream0.available());
      assertEquals(5, byteArray0.length);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pushbackInputStream0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)118, (byte)9, (byte)0}, byteArray0);
      assertEquals(5, byteArrayInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 79, 0);
      assertNotNull(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
      
      simpleCharStream0.adjustBeginLineColumn(0, 0);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StringReader stringReader0 = new StringReader("O");
      assertNotNull(stringReader0);
      
      int int0 = 0;
      boolean boolean0 = stringReader0.ready();
      assertTrue(boolean0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.Done();
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      
      simpleCharStream0.ReInit((Reader) stringReader0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.backup(0);
      assertEquals(4095, simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getLine());
      assertEquals(0, simpleCharStream0.getColumn());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      assertEquals(0, simpleCharStream0.getEndColumn());
      assertEquals(0, simpleCharStream0.getEndLine());
      
      boolean boolean1 = false;
      // Undeclared exception!
      try { 
        simpleCharStream0.readChar();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4096
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = "%SUq6mL%^%t";
      boolean boolean0 = FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "%SUq6mL%^%t");
      assertFalse(boolean0);
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int0 = simpleCharStream0.getBeginLine();
      assertEquals(0, int0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.adjustBeginLineColumn((-1460), (-1460));
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals((-1460), simpleCharStream0.getBeginColumn());
      assertEquals((-1459), simpleCharStream0.getBeginLine());
      
      boolean boolean1 = pipedInputStream0.markSupported();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
      assertEquals(0, pipedInputStream0.available());
      
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)96;
      byteArray0[1] = (byte)9;
      byteArray0[2] = (byte) (-88);
      byteArray0[3] = (byte) (-22);
      try { 
        pipedInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 0, (-911));
      assertNotNull(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      int int0 = simpleCharStream0.getBeginColumn();
      assertEquals(0, int0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.adjustBeginLineColumn(0, (-911));
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-911), simpleCharStream0.getBeginColumn());
      
      pipedInputStream0.mark((-911));
      assertEquals(0, pipedInputStream0.available());
      
      simpleCharStream0.bufpos = (-992);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-911), simpleCharStream0.getBeginColumn());
      
      simpleCharStream0.ExpandBuff(false);
      assertEquals((-992), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals((-911), simpleCharStream0.getBeginColumn());
      
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      long long0 = stringReader0.skip(0);
      assertEquals(0L, long0);
      
      simpleCharStream0.ReInit((Reader) stringReader0, 0, 0);
      assertEquals((-1), simpleCharStream0.bufpos);
      assertFalse(SimpleCharStream.staticFlag);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(0, simpleCharStream0.getBeginLine());
      assertEquals(0, simpleCharStream0.getBeginColumn());
      
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndColumn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      stringReader0.read();
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.shouldAllThrowIOExceptions();
      byteArray0[0] = (byte) (-23);
      byteArray0[1] = (byte) (-27);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte) (-1);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      stringReader0.markSupported();
      stringReader0.skip(0L);
      stringReader0.skip(111);
      stringReader0.read();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 300, 300, 300);
      simpleCharStream0.GetImage();
      simpleCharStream0.ReInit((Reader) stringReader0, 300, 300);
      simpleCharStream0.backup((byte)8);
      simpleCharStream0.inputStream = (Reader) stringReader0;
      simpleCharStream0.adjustBeginLineColumn(0, (-1));
      simpleCharStream0.getEndLine();
      simpleCharStream0.Done();
      // Undeclared exception!
      try { 
        simpleCharStream0.getBeginLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.apache.commons.jxpath.ri.parser.SimpleCharStream");
      stringReader0.read();
      stringReader0.read();
      stringReader0.markSupported();
      stringReader0.ready();
      stringReader0.skip(0L);
      stringReader0.skip(114);
      stringReader0.read();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 300, 300, 300);
      simpleCharStream0.GetImage();
      simpleCharStream0.ReInit((Reader) stringReader0, 300, 300);
      simpleCharStream0.inputStream = (Reader) stringReader0;
      simpleCharStream0.adjustBeginLineColumn(0, (-1));
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
  public void test72()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@`=2=\"n1");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.BeginToken();
      stringReader0.markSupported();
      // Undeclared exception!
      try { 
        stringReader0.read((CharBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      StringReader stringReader0 = new StringReader(",~+`t0:C9");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.bufpos = 0;
      stringReader0.mark(0);
      stringReader0.skip(0L);
      simpleCharStream0.backup(0);
      simpleCharStream0.ReInit((Reader) stringReader0);
      stringReader0.read();
      simpleCharStream0.GetSuffix(2034);
      // Undeclared exception!
      try { 
        simpleCharStream0.getEndLine();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, (-1971), (-4036), 0);
      simpleCharStream0.GetImage();
      simpleCharStream0.ReInit((InputStream) pipedInputStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      pipedInputStream0.close();
      pipedInputStream0.markSupported();
      pipedInputStream0.close();
      StringReader stringReader0 = new StringReader("#Nf8Xfj;z\"X5~4W6");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 0);
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
  public void test76()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.backup((-1));
      simpleCharStream0.available = 0;
      simpleCharStream0.UpdateLineColumn('$');
      simpleCharStream0.GetImage();
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
}
