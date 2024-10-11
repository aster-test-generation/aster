
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
import java.math.BigInteger;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Zip64ExtendedInformationExtraField_ESTest extends Zip64ExtendedInformationExtraField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
      zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, (byte)0, 39);
      assertEquals(28, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, (byte)42, 16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 49
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = new byte[17];
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 12);
      zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(false, true, false, true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = new byte[2];
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      ZipEightByteInteger zipEightByteInteger1 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.DD_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger1, zipLong0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      zip64ExtendedInformationExtraField0.setSize(zipEightByteInteger0);
      ZipEightByteInteger zipEightByteInteger1 = zip64ExtendedInformationExtraField0.getSize();
      assertSame(zipEightByteInteger1, zipEightByteInteger0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      ZipEightByteInteger zipEightByteInteger0 = zip64ExtendedInformationExtraField0.getRelativeHeaderOffset();
      assertNull(zipEightByteInteger0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = new ZipLong((-320L));
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      ZipLong zipLong1 = zip64ExtendedInformationExtraField0.getDiskStartNumber();
      assertSame(zipLong0, zipLong1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      ZipLong zipLong0 = new ZipLong(0L);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      ZipLong zipLong1 = zip64ExtendedInformationExtraField0.getDiskStartNumber();
      assertSame(zipLong0, zipLong1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      ZipLong zipLong1 = zip64ExtendedInformationExtraField0.getDiskStartNumber();
      assertEquals(33639248L, zipLong1.getValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      ZipEightByteInteger zipEightByteInteger0 = zip64ExtendedInformationExtraField0.getCompressedSize();
      assertNull(zipEightByteInteger0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null);
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.parseFromLocalFileData((byte[]) null, 63, 63);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField((ZipEightByteInteger) null, (ZipEightByteInteger) null);
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData((byte[]) null, 120, 120);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, (byte) (-67), (-943));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = new byte[17];
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)4, 276);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.getLocalFileDataData();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      zip64ExtendedInformationExtraField0.setCompressedSize(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.getCentralDirectoryData();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getCentralDirectoryLength();
      assertEquals(28, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, (ZipLong) null);
      ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getCentralDirectoryLength();
      assertEquals(24, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = new byte[17];
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 15);
      zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(false, true, false, true);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = new byte[17];
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 15);
      try { 
        zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(true, true, false, true);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length 20 but is 15
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = new byte[17];
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 15);
      zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(false, false, true, true);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(true, true, true, false);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
      zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, (byte)0, (byte)24);
      assertEquals(28, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      byte[] byteArray0 = new byte[8];
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, (ZipLong) null);
      try { 
        zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, (-516), (byte) (-24));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Zip64 extended information must contain both size values in the local file header.
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = new byte[7];
      zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, 1436, 0);
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
      zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray0, (byte)0, 20);
      assertEquals(28, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = new byte[17];
      zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 15);
      zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(true, false, false, false);
      ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getLocalFileDataLength();
      assertEquals(16, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-865L));
      zip64ExtendedInformationExtraField0.setSize(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.getLocalFileDataData();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Zip64 extended information must contain both size values in the local file header.
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      ZipEightByteInteger zipEightByteInteger0 = zip64ExtendedInformationExtraField0.getSize();
      assertNull(zipEightByteInteger0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      ZipShort zipShort0 = zip64ExtendedInformationExtraField0.getHeaderId();
      assertEquals(1, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      ZipEightByteInteger zipEightByteInteger1 = zip64ExtendedInformationExtraField0.getCompressedSize();
      assertSame(zipEightByteInteger0, zipEightByteInteger1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      ZipEightByteInteger zipEightByteInteger1 = zip64ExtendedInformationExtraField0.getRelativeHeaderOffset();
      assertSame(zipEightByteInteger1, zipEightByteInteger0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zip64ExtendedInformationExtraField0.setRelativeHeaderOffset((ZipEightByteInteger) null);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zip64ExtendedInformationExtraField0.setDiskStartNumber((ZipLong) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      ZipLong zipLong0 = zip64ExtendedInformationExtraField0.getDiskStartNumber();
      assertNull(zipLong0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      zip64ExtendedInformationExtraField0.setCompressedSize(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        zip64ExtendedInformationExtraField0.getLocalFileDataData();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Zip64 extended information must contain both size values in the local file header.
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }
}
