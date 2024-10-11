
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


package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Set;
import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DumpArchiveEntry_ESTest extends DumpArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry("15>r", "", 760, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertEquals("", dumpArchiveEntry1.getSimpleName());
      assertEquals(0L, dumpArchiveEntry1.getOffset());
      assertFalse(dumpArchiveEntry1.equals((Object)dumpArchiveEntry0));
      assertFalse(boolean0);
      assertEquals("15>r", dumpArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[39];
      byteArray0[33] = (byte) (-112);
      // Undeclared exception!
      try { 
        DumpArchiveEntry.parse(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 40
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.find(8);
      assertEquals(DumpArchiveEntry.TYPE.FILE, dumpArchiveEntry_TYPE0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      byte[] byteArray0 = new byte[22];
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.update(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 160
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, (String) null, 7, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.toString();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", (-941), dumpArchiveEntry_TYPE0);
      String string0 = dumpArchiveEntry0.toString();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", "$VALUES", 5, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setDeleted(true);
      boolean boolean0 = dumpArchiveEntry0.isDeleted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("GROUP_READ", "", 183, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setVolume(96);
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals(96, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setVolume((-1886));
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals((-1886), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, (String) null);
      dumpArchiveEntry0.setUserId(607);
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals(607, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./<]-3Sk{$kTdpT=wPe", "./<]-3Sk{$kTdpT=wPe", 2798, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setUserId((byte) (-120));
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals((-120), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./", "ADDR");
      dumpArchiveEntry0.getType();
      assertFalse(dumpArchiveEntry0.isDirectory());
      assertEquals("ADDR", dumpArchiveEntry0.getSimpleName());
      assertEquals("", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setSize(3242L);
      long long0 = dumpArchiveEntry0.getSize();
      assertEquals(3242L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", "org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader");
      dumpArchiveEntry0.getSimpleName();
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", 32, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.getSimpleName();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("@D19~_FA", "ADDR", (-4221), dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.getOriginalName();
      assertEquals("ADDR", dumpArchiveEntry0.getSimpleName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("@D19~_FA", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setName("");
      dumpArchiveEntry0.getOriginalName();
      assertEquals("", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, (String) null, 7, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setOffset(1695L);
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals(1695L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("GROUP_READ", "", 183, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setOffset((-2144L));
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals((-2144L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setNlink((-321));
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals((-321), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("Zip slip '%s' + '%s' -> '%s'", "Zip slip '%s' + '%s' -> '%s'", 0, dumpArchiveEntry_TYPE0);
      String string0 = dumpArchiveEntry0.getName();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("Zip slip '%s' + '%s' -> '%s'", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setMode((-1280));
      int int0 = dumpArchiveEntry0.getMode();
      assertEquals(2816, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      dumpArchiveEntry0.setGroupId(1128);
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals(1128, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setGroupId((-1676));
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals((-1676), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setGeneration((-964));
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals((-964), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "J5[^iM", 140, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setSize(140);
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals(140L, dumpArchiveEntry0.getSize());
      assertEquals(140L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setSize((-478L));
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals((-478L), dumpArchiveEntry0.getSize());
      assertEquals((-478L), long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.update((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.SOCKET;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "t", (-345), dumpArchiveEntry_TYPE0);
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.setLastModifiedDate((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.setCreationTime((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.setAccessTime((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        DumpArchiveEntry.parse((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("_%", "_%");
      // Undeclared exception!
      try { 
        dumpArchiveEntry0.isSparseRecord(1778);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1778
         //
         verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setName("WORLD_WRITE");
      assertEquals((-1L), dumpArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./", "ADDR");
      dumpArchiveEntry0.setName("./");
      assertEquals("ADDR", dumpArchiveEntry0.getSimpleName());
      assertFalse(dumpArchiveEntry0.isDirectory());
      assertEquals("", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("_%", "_%");
      boolean boolean0 = dumpArchiveEntry0.isDirectory();
      assertEquals("_%", dumpArchiveEntry0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./43H", "./43H", (-189), dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isDirectory();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("43H/", dumpArchiveEntry0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Set<DumpArchiveEntry.PERMISSION> set0 = DumpArchiveEntry.PERMISSION.find(0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Set<DumpArchiveEntry.PERMISSION> set0 = DumpArchiveEntry.PERMISSION.find(496);
      assertEquals(5, set0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getCdata(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getIno();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      dumpArchiveEntry_TapeSegmentHeader0.getType();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./", "ADDR");
      String string0 = dumpArchiveEntry0.getName();
      assertEquals(0L, dumpArchiveEntry0.getSize());
      assertEquals("", string0);
      assertEquals("ADDR", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getHoles();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(".//", ".//", 1020, dumpArchiveEntry_TYPE0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("/", dumpArchiveEntry0.getName());
      assertTrue(dumpArchiveEntry0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setName((String) null);
      assertNull(dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.SOCKET;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("F~ENnS^hl,9N3AfC[", ")=vN1H0F`#>d`8", 2666, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isSocket();
      assertEquals("F~ENnS^hl,9N3AfC[", dumpArchiveEntry0.getName());
      assertTrue(boolean0);
      assertEquals(")=vN1H0F`#>d`8", dumpArchiveEntry0.getSimpleName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("rh'O!N#QR)G;^", "rh'O!N#QR)G;^", 0, (DumpArchiveEntry.TYPE) null);
      boolean boolean0 = dumpArchiveEntry0.isSocket();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("rh'O!N#QR)G;^", dumpArchiveEntry0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("WHITEOUT", "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE", (-633), dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFile();
      assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE", dumpArchiveEntry0.getSimpleName());
      assertTrue(boolean0);
      assertEquals("WHITEOUT", dumpArchiveEntry0.toString());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("GROUP_READ", "", 183, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFile();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertFalse(boolean0);
      assertEquals("GROUP_READ", dumpArchiveEntry0.toString());
      assertEquals("", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("es_43<ldgq4dOCjbWV", "es_43<ldgq4dOCjbWV", 616, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isFifo();
      assertTrue(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("es_43<ldgq4dOCjbWV", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.isFifo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", "$VALUES", 6, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isChrDev();
      assertTrue(boolean0);
      assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.isChrDev();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("GROUP_READ", "GROUP_READ", 6, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isBlkDev();
      assertEquals("GROUP_READ", dumpArchiveEntry0.getName());
      assertTrue(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("Zip slip '%s' + '%s' -> '%s'", "Zip slip '%s' + '%s' -> '%s'", 0, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isBlkDev();
      assertEquals("Zip slip '%s' + '%s' -> '%s'", dumpArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
      long long0 = dumpArchiveEntry0.getSize();
      assertTrue(dumpArchiveEntry0.isDirectory());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./<]-3Sk{$kTdpT=wPe", "./<]-3Sk{$kTdpT=wPe", 2798, dumpArchiveEntry_TYPE0);
      long long0 = dumpArchiveEntry0.getSize();
      assertEquals("<]-3Sk{$kTdpT=wPe", dumpArchiveEntry0.toString());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", "$VALUES", 6, dumpArchiveEntry_TYPE0);
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry("$VALUES", "$VALUES", 6, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertEquals(0L, dumpArchiveEntry1.getOffset());
      assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
      assertTrue(boolean0);
      assertEquals("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", "$VALUES", 6, dumpArchiveEntry_TYPE0);
      Object object0 = new Object();
      boolean boolean0 = dumpArchiveEntry0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
      assertEquals("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("s_", "s_");
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry0);
      assertEquals("s_", dumpArchiveEntry0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", "$VALUES", 5, dumpArchiveEntry_TYPE0);
      DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry();
      boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
      assertFalse(boolean0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
      assertFalse(dumpArchiveEntry1.equals((Object)dumpArchiveEntry0));
      assertEquals("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.find((byte)12);
      assertEquals(DumpArchiveEntry.TYPE.SOCKET, dumpArchiveEntry_TYPE0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      dumpArchiveEntry_TapeSegmentHeader0.setIno(768);
      assertEquals(768, dumpArchiveEntry_TapeSegmentHeader0.getIno());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", "$VALUES", 5, dumpArchiveEntry_TYPE0);
      boolean boolean0 = dumpArchiveEntry0.isSparseRecord(6);
      assertEquals("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", dumpArchiveEntry0.toString());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
      int int0 = dumpArchiveEntry_TapeSegmentHeader0.getVolume();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      Date date0 = dumpArchiveEntry0.getLastModifiedDate();
      dumpArchiveEntry0.setCreationTime(date0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("rh'O!N#QR)G;^", "rh'O!N#QR)G;^", 0, (DumpArchiveEntry.TYPE) null);
      dumpArchiveEntry0.getHeaderType();
      assertEquals("rh'O!N#QR)G;^", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("GROUP_READ", "", 183, dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getHeaderCount();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("GROUP_READ", dumpArchiveEntry0.getName());
      assertEquals(0, int0);
      assertEquals("", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./<]-3Sk{$kTdpT=wPe", "./<]-3Sk{$kTdpT=wPe", 2798, dumpArchiveEntry_TYPE0);
      Date date0 = dumpArchiveEntry0.getCreationTime();
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("<]-3Sk{$kTdpT=wPe", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./<]-3Sk{$kTdpT=wPe", "./<]-3Sk{$kTdpT=wPe", 2798, dumpArchiveEntry_TYPE0);
      long long0 = dumpArchiveEntry0.getEntrySize();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals(0L, long0);
      assertEquals("<]-3Sk{$kTdpT=wPe", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.hashCode();
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("s_", "s_");
      int int0 = dumpArchiveEntry0.getVolume();
      assertEquals(0, int0);
      assertEquals("s_", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      Date date0 = dumpArchiveEntry0.getLastModifiedDate();
      dumpArchiveEntry0.setAccessTime(date0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.getSimpleName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("GROUP_READ", "", 183, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.setNlink(1606);
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals(1606, int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", "$VALUES", 5, dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getUserId();
      assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals(0, int0);
      assertEquals("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", "$VALUES", 5, dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getHeaderHoles();
      assertEquals(0, int0);
      assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.SOCKET;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("F~ENnS^hl,9N3AfC[", ")=vN1H0F`#>d`8", 2666, dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getMode();
      assertEquals("F~ENnS^hl,9N3AfC[", dumpArchiveEntry0.getName());
      assertEquals(0, int0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals(")=vN1H0F`#>d`8", dumpArchiveEntry0.getSimpleName());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "", (-1521), dumpArchiveEntry_TYPE0);
      String string0 = dumpArchiveEntry0.toString();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("rh'O!N#QR)G;^", "rh'O!N#QR)G;^", 0, (DumpArchiveEntry.TYPE) null);
      int int0 = dumpArchiveEntry0.getIno();
      assertEquals("rh'O!N#QR)G;^", dumpArchiveEntry0.toString());
      assertEquals(0, int0);
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("rh'O!N#QR)G;^", "rh'O!N#QR)G;^", 0, (DumpArchiveEntry.TYPE) null);
      dumpArchiveEntry0.setSimpleName("rh'O!N#QR)G;^");
      assertEquals("rh'O!N#QR)G;^", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", "$VALUES", 5, dumpArchiveEntry_TYPE0);
      dumpArchiveEntry0.isDeleted();
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
      assertEquals("org.apache.commonscompress.archivers.dump.DumpArchivqConstants$SEGMEN_TYPE", dumpArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      dumpArchiveEntry0.setGeneration(2083);
      int int0 = dumpArchiveEntry0.getGeneration();
      assertEquals(2083, int0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("+-N!Fxm`q+R&;G PW", "+-N!Fxm`q+R&;G PW");
      Date date0 = dumpArchiveEntry0.getAccessTime();
      dumpArchiveEntry0.setLastModifiedDate(date0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
      assertEquals("+-N!Fxm`q+R&;G PW", dumpArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      Set<DumpArchiveEntry.PERMISSION> set0 = dumpArchiveEntry0.getPermissions();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("rh'O!N#QR)G;^", "rh'O!N#QR)G;^", 0, (DumpArchiveEntry.TYPE) null);
      dumpArchiveEntry0.getType();
      assertEquals("rh'O!N#QR)G;^", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./<]-3Sk{$kTdpT=wPe", "./<]-3Sk{$kTdpT=wPe", 2798, dumpArchiveEntry_TYPE0);
      int int0 = dumpArchiveEntry0.getGroupId();
      assertEquals("<]-3Sk{$kTdpT=wPe", dumpArchiveEntry0.getName());
      assertEquals(0L, dumpArchiveEntry0.getOffset());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      String string0 = dumpArchiveEntry0.getOriginalName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      long long0 = dumpArchiveEntry0.getOffset();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
      int int0 = dumpArchiveEntry0.getNlink();
      assertEquals(0, int0);
  }
}
