/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.commons.compress.compressors.gzip;

import org.junit.jupiter.api.Test;

import java.util.zip.Deflater;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests {@link GzipParameters}.
 */
public class GzipParametersTest {

    @Test
    public void testDeflaterStrategy() {
        final GzipParameters gzipParameters = new GzipParameters();
        assertEquals(Deflater.DEFAULT_STRATEGY, gzipParameters.getDeflateStrategy());
        gzipParameters.setDeflateStrategy(Deflater.HUFFMAN_ONLY);
        assertEquals(Deflater.HUFFMAN_ONLY, gzipParameters.getDeflateStrategy());
    }
}
