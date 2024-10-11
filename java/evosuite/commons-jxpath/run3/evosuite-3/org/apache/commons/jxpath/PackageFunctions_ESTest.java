
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
import java.util.Set;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.Function;
import org.apache.commons.jxpath.PackageFunctions;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
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
      PackageFunctions packageFunctions0 = new PackageFunctions("lib", "Cannot create an attribute for path ");
      TypeUtils.setTypeConverter((TypeConverter) null);
      Object[] objectArray0 = new Object[9];
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction("Cannot create an attribute for path ", "'1o0ii.Q<,wq^+]32j", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions((String) null, (String) null);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(basicNodeSet0).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction((String) null, ":", objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("~!vk.m S", "~!vk.m S");
      Object[] objectArray0 = new Object[10];
      objectArray0[0] = (Object) packageFunctions0;
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction("~!vk.m S", "~!vk.m S", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function ~!vk.m S:~!vk.m S; Class '~!vk/m S~!vk.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions((String) null, (String) null);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(basicNodeSet0).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Object[] objectArray0 = new Object[4];
      Function function0 = packageFunctions0.getFunction((String) null, ":", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions((String) null, "~#wfkDi2X6q&B\"$W>");
      Set set0 = packageFunctions0.getUsedNamespaces();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) set0;
      Function function0 = packageFunctions0.getFunction("~#wfkDi2X6q&B\"$W>", (String) null, objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions((String) null, (String) null);
      Function function0 = packageFunctions0.getFunction((String) null, "", (Object[]) null);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions((String) null, "~#wfkDi2X6q&B\"$W>");
      Object[] objectArray0 = new Object[5];
      Function function0 = packageFunctions0.getFunction("~#wfkDi2X6q&B\"$W>", (String) null, objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions((String) null, "~#wfkDi2X6q&B\"$W>");
      Object[] objectArray0 = new Object[5];
      Function function0 = packageFunctions0.getFunction((String) null, (String) null, objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions(".;t 'w'vg+E]M3l", (String) null);
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        packageFunctions0.getFunction((String) null, "|#", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function |#; 
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PackageFunctions packageFunctions0 = new PackageFunctions("", "");
      Object[] objectArray0 = new Object[4];
      Function function0 = packageFunctions0.getFunction("oZ@", "pD}LHU{<_{p9n", objectArray0);
      assertNull(function0);
  }
}
