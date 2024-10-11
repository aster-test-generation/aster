/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.zip;

import org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.InputStream;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ScatterZipOutputStream_Test_Passing {
@Mock
    private FileBasedScatterGatherBackingStore backingStore;
@Mock
    private ZipArchiveEntryRequest zipArchiveEntryRequest;
@Mock
    private InputStream inputStream;
}