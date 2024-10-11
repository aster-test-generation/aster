/**
 * Generated by Aster
 */
package org.apache.commons.compress.changes;

import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ChangeSetPerformer_Test_Passing {
@Mock
    private ChangeSet<ZipArchiveEntry> mockChangeSet;
@Mock
    private ZipFile mockZipFile;
@Mock
    private ArchiveInputStream mockInputStream;
@InjectMocks
    private ChangeSetPerformer changesetperformer;
}