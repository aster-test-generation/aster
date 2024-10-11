
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


package org.apache.commons.jxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.PackageFunctions;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PackageFunctions_ESTest extends PackageFunctions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("", "/w=C SA`y|");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("java.util.concurrent.atomic.AtomicLong", "java.util.concurrent.atomic.AtomicLong");
      Set set0 = packageFunctions0.getUsedNamespaces();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) set0;
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction("java.util.concurrent.atomic.AtomicLong", (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("XZygH^.# ", "XZygH^.# ");
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction("XZygH^.# ", "XZygH^.# ", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function XZygH^.# :XZygH^.# ; Class 'XZygH^/# XZygH^.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions((String) null, (String) null);
      Set set0 = packageFunctions0.getUsedNamespaces();
      Object[] objectArray0 = new Object[26];
      objectArray0[0] = (Object) set0;
      Function function0 = packageFunctions0.getFunction((String) null, (String) null, objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("Y", "Y");
      Object[] objectArray0 = new Object[6];
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      Locale locale0 = Locale.FRANCE;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, objectArray0[1], locale0);
      basicNodeSet0.add((Pointer) nodePointer0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null, basicNodeSet0).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      packageFunctions0.getFunction("Y", "Y", objectArray0);
      Function function0 = packageFunctions0.getFunction("Y", "Y", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("Y", "Y");
      Object[] objectArray0 = new Object[6];
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(objectArray0[0], basicNodeSet0).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      packageFunctions0.getFunction("Y", (String) null, objectArray0);
      Function function0 = packageFunctions0.getFunction("Y", "|", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions((String) null, (String) null);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) packageFunctions0;
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction((String) null, "org.apache.commons.jxpath.PackageFunctions", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function org.apache.commons.jxpath.PackageFunctions; Class 'nullorg/apache/commons/jxpath.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("m >(O0*VNLDF1:", "m >(O0*VNLDF1:");
      Function function0 = packageFunctions0.getFunction("m >(O0*VNLDF1:", "m >(O0*VNLDF1:", (Object[]) null);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions((String) null, (String) null);
      Object[] objectArray0 = new Object[4];
      Function function0 = packageFunctions0.getFunction("", "", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("Y", "Y");
      Object[] objectArray0 = new Object[6];
      Function function0 = packageFunctions0.getFunction((String) null, "Y", objectArray0);
      assertNull(function0);
  }
}
