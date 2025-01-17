/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute;
import org.apache.commons.compress.archivers.sevenz.Archive;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.compressors.bzip2.BlockSort;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.compressors.CompressorException;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream;
import org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveUtil;
import org.apache.commons.compress.compressors.bzip2.CRC;
import org.apache.commons.compress.archivers.zip.UnicodePathExtraField;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IMethodRefForm;
import org.apache.commons.compress.archivers.examples.CloseableConsumer;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm;
import org.apache.commons.compress.archivers.dump.TapeInputStream;
import org.apache.commons.compress.archivers.zip.Zip64Mode;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.compressors.gzip.GzipParameters;
import org.apache.commons.compress.harmony.unpack200.CpBands;
import org.apache.commons.compress.archivers.tar.TarArchiveSparseZeroInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.archivers.zip.PKWareExtraHeader;
import org.apache.commons.compress.archivers.arj.MainHeader;
import org.apache.commons.compress.archivers.sevenz.NID;
import org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream;
import org.apache.commons.compress.harmony.unpack200.ClassBands;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.archivers.zip.ExtraFieldUtils;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.MultiANewArrayForm;
import org.apache.commons.compress.harmony.pack200.CPSignature;
import org.apache.commons.compress.compressors.pack200.Pack200Utils;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SingleByteReferenceForm;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.commons.compress.archivers.zip.SeekableChannelRandomAccessOutputStream;
import org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore;
import org.apache.commons.compress.archivers.sevenz.StartHeader;
import org.apache.commons.compress.utils.Sets;
import org.apache.commons.compress.utils.Iterators;
import org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.utils.CountingInputStream;
import org.apache.commons.compress.harmony.unpack200.SegmentUtils;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm;
import org.apache.commons.compress.archivers.zip.BitStream;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.compressors.deflate64.HuffmanState;
import org.apache.commons.compress.compressors.CompressorStreamFactory;
import org.apache.commons.compress.archivers.arj.ArjArchiveEntry;
import org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.ChecksumCalculatingInputStream;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.apache.commons.compress.harmony.pack200.MetadataBandGroup;
import org.apache.commons.compress.archivers.Lister;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.CPNameAndType;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream;
import org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream;
import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.archivers.sevenz.BoundedSeekableByteChannelInputStream;
import org.apache.commons.compress.archivers.zip.InflaterInputStreamWithStatistics;
import org.apache.commons.compress.utils.ByteUtils;
import org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.utils.ServiceLoaderIterator;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.pack200.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.utils.SeekableInMemoryByteChannel;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPConstant;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ShortForm;
import org.apache.commons.compress.archivers.sevenz.AES256Options;
import org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream;
import org.apache.commons.compress.archivers.zip.BinaryTree;
import org.apache.commons.compress.harmony.pack200.FileBands;
import org.apache.commons.compress.utils.CRC32VerifyingInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntryPredicate;
import org.apache.commons.compress.archivers.sevenz.StreamMap;
import org.apache.commons.compress.archivers.sevenz.CLI;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewClassRefForm;
import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;
import org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader;
import org.apache.commons.compress.utils.BitInputStream;
import org.apache.commons.compress.utils.TimeUtils;
import org.apache.commons.compress.compressors.lzw.LZWInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.archivers.zip.UnrecognizedExtraField;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;
import org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands;
import org.apache.commons.compress.utils.FixedLengthBlockOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm;
import org.apache.commons.compress.harmony.pack200.CPConstant;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute;
import org.apache.commons.compress.harmony.pack200.Archive;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream;
import org.apache.commons.compress.archivers.examples.CloseableConsumerAdapter;
import org.apache.commons.compress.harmony.pack200.RunCodec;
import org.apache.commons.compress.harmony.pack200.CpBands;
import org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.MemoryLimitException;
import org.apache.commons.compress.compressors.lz77support.AbstractLZ77CompressorInputStream;
import org.apache.commons.compress.harmony.unpack200.Archive;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.apache.commons.compress.archivers.zip.ScatterStatistics;
import org.apache.commons.compress.java.util.jar.Pack200;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.utils.OsgiUtils;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.LZMA2Decoder;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm;
import org.apache.commons.compress.archivers.dump.Dirent;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod;
import org.apache.commons.compress.archivers.sevenz.BindPair;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.MethodRefForm;
import org.apache.commons.compress.archivers.sevenz.LZMADecoder;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;
import org.apache.commons.compress.utils.ExactMath;
import org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMember;
import org.apache.commons.compress.changes.ChangeSetResults;
import org.apache.commons.compress.harmony.pack200.CPInt;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute;
import org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream;
import org.apache.commons.compress.parallel.ScatterGatherBackingStore;
import org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger;
import org.apache.commons.compress.harmony.pack200.PackingUtils;
import org.apache.commons.compress.parallel.InputStreamSupplier;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.archivers.zip.RandomAccessOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef;
import org.apache.commons.compress.harmony.archive.internal.nls.Messages;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.archivers.sevenz.AbstractCoder;
import org.apache.commons.compress.harmony.unpack200.IMatcher;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.apache.commons.compress.harmony.unpack200.AttrDefinitionBands;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.DoubleForm;
import org.apache.commons.compress.harmony.unpack200.SegmentOptions;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveConstants;
import org.apache.commons.compress.archivers.zip.AsiExtraField;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPString;
import org.apache.commons.compress.harmony.pack200.CPString;
import org.apache.commons.compress.archivers.examples.Expander;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPConstantNumber;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream;
import org.apache.commons.compress.compressors.pack200.InMemoryCachingStreamBridge;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;
import org.apache.commons.compress.changes.ChangeSetPerformer;
import org.apache.commons.compress.archivers.tar.TarUtils;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.compressors.snappy.FramedSnappyDialect;
import org.apache.commons.compress.changes.ChangeSet;
import org.apache.commons.compress.archivers.EntryStreamOffsets;
import org.apache.commons.compress.harmony.pack200.PopulationCodec;
import org.apache.commons.compress.utils.CharsetNames;
import org.apache.commons.compress.compressors.bzip2.Rand;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm;
import org.apache.commons.compress.archivers.sevenz.SevenZOutputFile;
import org.apache.commons.compress.harmony.pack200.CPLong;
import org.apache.commons.compress.archivers.zip.Zip64RequiredException;
import org.apache.commons.compress.archivers.sevenz.Folder;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.IcBands;
import org.apache.commons.compress.compressors.z.ZCompressorInputStream;
import org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration;
import org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream;
import org.apache.commons.compress.compressors.CompressorStreamProvider;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.apache.commons.compress.archivers.zip.ZipConstants;
import org.apache.commons.compress.harmony.pack200.PackingOptions;
import org.apache.commons.compress.archivers.tar.TarArchiveStructSparse;
import org.apache.commons.compress.archivers.zip.JarMarker;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LongForm;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies;
import org.apache.commons.compress.archivers.zip.CircularBuffer;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm;
import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.BandSet;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.archivers.zip.ZipMethod;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.InitMethodReferenceForm;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry;
import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache;
import org.apache.commons.compress.utils.CloseShieldFilterInputStream;
import org.apache.commons.compress.utils.BoundedArchiveInputStream;
import org.apache.commons.compress.compressors.brotli.BrotliUtils;
import org.apache.commons.compress.harmony.pack200.Segment;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPField;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.dump.ShortFileException;
import org.apache.commons.compress.compressors.CompressorOutputStream;
import org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2Utils;
import org.apache.commons.compress.compressors.zstandard.ZstdUtils;
import org.apache.commons.compress.archivers.zip.NioZipEncoding;
import org.apache.commons.compress.compressors.pack200.AbstractStreamBridge;
import org.apache.commons.compress.compressors.xz.XZUtils;
import org.apache.commons.compress.utils.Charsets;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm;
import org.apache.commons.compress.archivers.zip.UnshrinkingInputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm;
import org.apache.commons.compress.utils.ChecksumVerifyingInputStream;
import org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NarrowClassRefForm;
import org.apache.commons.compress.archivers.dump.DumpArchiveException;
import org.apache.commons.compress.archivers.sevenz.SubStreamsInfo;
import org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute;
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
import org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge;
import org.apache.commons.compress.archivers.sevenz.SevenZMethod;
import org.apache.commons.compress.harmony.pack200.SegmentHeader;
import org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream;
import org.apache.commons.compress.harmony.pack200.BcBands;
import org.apache.commons.compress.harmony.pack200.CPFloat;
import org.apache.commons.compress.compressors.pack200.Pack200Strategy;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.archivers.zip.ZipExtraField;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.pack200.CPUTF8;
import org.apache.commons.compress.harmony.pack200.IntList;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.harmony.pack200.BandSet;
import org.apache.commons.compress.harmony.pack200.IcBands;
import org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder;
import org.apache.commons.compress.harmony.unpack200.NewAttributeBands;
import org.apache.commons.compress.changes.Change;
import org.apache.commons.compress.utils.Lists;
import org.apache.commons.compress.PasswordRequiredException;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm;
import org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;
import org.apache.commons.compress.harmony.pack200.Pack200ClassReader;
import org.apache.commons.compress.harmony.pack200.NewAttributeBands;
import org.apache.commons.compress.compressors.deflate64.HuffmanDecoder;
import org.apache.commons.compress.compressors.deflate.DeflateParameters;
import org.apache.commons.compress.archivers.sevenz.SevenZFileOptions;
import org.apache.commons.compress.harmony.pack200.CPDouble;
import org.apache.commons.compress.archivers.dump.UnrecognizedFormatException;
import org.apache.commons.compress.utils.CountingOutputStream;
import org.apache.commons.compress.utils.InputStreamStatistics;
import org.apache.commons.compress.compressors.xz.XZCompressorOutputStream;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldBehavior;
import org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute;
import org.apache.commons.compress.harmony.unpack200.Pack200UnpackerAdapter;
import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.compress.archivers.zip.X7875_NewUnix;
import org.apache.commons.compress.archivers.tar.TarGnuSparseKeys;
import org.apache.commons.compress.utils.FlushShieldFilterOutputStream;
import org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisInitMethodRefForm;
import org.apache.commons.compress.archivers.tar.TarFile;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.compress.harmony.unpack200.IcTuple;
import org.apache.commons.compress.harmony.unpack200.AttributeLayout;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPRef;
import org.apache.commons.compress.archivers.sevenz.Coders;
import org.apache.commons.compress.archivers.zip.ScatterZipOutputStream;
import org.apache.commons.compress.archivers.arj.LocalFileHeader;
import org.apache.commons.compress.utils.ParsingUtils;
import org.apache.commons.compress.archivers.zip.CharsetAccessor;
import org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException;
import org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile;
import org.apache.commons.compress.archivers.zip.ZipSplitOutputStream;
import org.apache.commons.compress.harmony.pack200.Pack200PackerAdapter;
import org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField;
import org.apache.commons.compress.archivers.sevenz.Coder;
import org.apache.commons.compress.archivers.StreamingNotSupportedException;
import org.apache.commons.compress.archivers.dump.DumpArchiveSummary;
import org.apache.commons.compress.compressors.lz4.XXHash32;
import org.apache.commons.compress.archivers.ArchiveStreamProvider;
import org.apache.commons.compress.harmony.pack200.CodecEncoding;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewInitMethodRefForm;
import org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField;
import org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList;
import org.apache.commons.compress.compressors.gzip.GzipUtils;
import org.apache.commons.compress.harmony.unpack200.MetadataBandGroup;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.apache.commons.compress.archivers.zip.ExplodingInputStream;
import org.apache.commons.compress.archivers.zip.X0014_X509Certificates;
import org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm;
import org.apache.commons.compress.utils.BoundedInputStream;
import org.apache.commons.compress.harmony.pack200.ConstantPoolEntry;
import org.apache.commons.compress.archivers.zip.StreamCompressor;
import org.apache.commons.compress.harmony.pack200.CPMethodOrField;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm;
import org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile;
import org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest;
import org.apache.commons.compress.compressors.lzma.LZMAUtils;
import org.apache.commons.compress.harmony.unpack200.BcBands;
import org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel;
import org.apache.commons.compress.harmony.pack200.ClassBands;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.archivers.zip.ZipIoUtil;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.utils.SkipShieldingInputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.examples.Archiver;
import org.apache.commons.compress.harmony.unpack200.SegmentHeader;
import org.apache.commons.compress.harmony.unpack200.FileBands;
import org.apache.commons.compress.archivers.zip.ZipUtil;
import org.apache.commons.compress.harmony.pack200.Pack200Adapter;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.archivers.sevenz.DeltaDecoder;
import org.apache.commons.compress.archivers.cpio.CpioUtil;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.*;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.*;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Folder_Test_Passing {
@Test(expected = IOException.class)
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCoders_DuplicateCoders_rcGL5() throws IOException {
    Folder folder = new Folder();
    Coder coder = new Coder();
    folder.packedStreams = new int[]{0, 0};
    folder.coders = new Coder[]{coder};
    folder.getOrderedCoders();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForInStream_WithValidIndex_ReturnsCorrectIndex_mNNv0() {
    Folder folder = new Folder();
    folder.bindPairs = new BindPair[]{new BindPair(0), new BindPair(1), new BindPair(2)};
    int result = folder.findBindPairForInStream(1);
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForInStream_WithIndexNotPresent_ReturnsNegativeOne_GgGy1() {
    Folder folder = new Folder();
    folder.bindPairs = new BindPair[]{new BindPair(0), new BindPair(1), new BindPair(2)};
    int result = folder.findBindPairForInStream(3);
    assertEquals(-1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForInStream_WithNullBindPairs_ReturnsNegativeOne_xHig2() {
    Folder folder = new Folder();
    folder.bindPairs = null;
    int result = folder.findBindPairForInStream(0);
    assertEquals(-1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForInStream_WithEmptyBindPairs_ReturnsNegativeOne_BVIl3() {
    Folder folder = new Folder();
    folder.bindPairs = new BindPair[]{};
    int result = folder.findBindPairForInStream(0);
    assertEquals(-1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForOutStream_WithValidIndex_ReturnsCorrectIndex_OOiY0() {
    Folder folder = new Folder();
    folder.bindPairs = new BindPair[] { new BindPair(0), new BindPair(1), new BindPair(2) };
    int result = folder.findBindPairForOutStream(1);
    assertEquals(1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForOutStream_WithInvalidIndex_ReturnsNegativeOne_DkMn1() {
    Folder folder = new Folder();
    folder.bindPairs = new BindPair[] { new BindPair(0), new BindPair(1), new BindPair(2) };
    int result = folder.findBindPairForOutStream(3);
    assertEquals(-1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForOutStream_WithNullBindPairs_ReturnsNegativeOne_ztnt2() {
    Folder folder = new Folder();
    folder.bindPairs = null;
    int result = folder.findBindPairForOutStream(0);
    assertEquals(-1, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFindBindPairForOutStream_WithMultipleMatches_ReturnsFirstMatchIndex_RcPs3() {
    Folder folder = new Folder();
    folder.bindPairs = new BindPair[] { new BindPair(1), new BindPair(1), new BindPair(2) };
    int result = folder.findBindPairForOutStream(1);
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnpackSize_WhenTotalOutputStreamsIsZero_ShouldReturnZero_Qsdb0() {
    Folder folder = new Folder();
    folder.totalOutputStreams = 0; // Assuming totalOutputStreams is accessible
    long result = folder.getUnpackSize();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnpackSize_WhenNoBindPairs_ShouldReturnUnpackSize_azLT1() {
    Folder folder = new Folder();
    folder.totalOutputStreams = 3; // Assuming totalOutputStreams is accessible
    folder.unpackSizes = new long[]{100, 200, 300}; // Assuming unpackSizes is accessible
    folder.bindPairs = new int[]{-1, -1, -1}; // Assuming bindPairs is accessible
    long result = folder.getUnpackSize();
    assertEquals(300, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnpackSize_WhenSomeBindPairsExist_ShouldReturnFirstUnboundUnpackSize_yatM2() {
    Folder folder = new Folder();
    folder.totalOutputStreams = 3; // Assuming totalOutputStreams is accessible
    folder.unpackSizes = new long[]{100, 200, 300}; // Assuming unpackSizes is accessible
    folder.bindPairs = new int[]{0, -1, 1}; // Assuming bindPairs is accessible
    long result = folder.getUnpackSize();
    assertEquals(200, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnpackSize_WhenAllBindPairsExist_ShouldReturnZero_cHqK3() {
    Folder folder = new Folder();
    folder.totalOutputStreams = 3; // Assuming totalOutputStreams is accessible
    folder.unpackSizes = new long[]{100, 200, 300}; // Assuming unpackSizes is accessible
    folder.bindPairs = new int[]{0, 1, 2}; // Assuming bindPairs is accessible
    long result = folder.getUnpackSize();
    assertEquals(0, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCoders_EmptyPackedStreamsAndCoders_sHYG0() throws IOException {
    Folder folder = new Folder();
    folder.packedStreams = null;
    folder.coders = null;
    Iterable<Coder> result = folder.getOrderedCoders();
    assertFalse(result.iterator().hasNext());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCoders_EmptyPackedStreams_yTif1() throws IOException {
    Folder folder = new Folder();
    folder.packedStreams = new int[0];
    folder.coders = new Coder[1];
    Iterable<Coder> result = folder.getOrderedCoders();
    assertFalse(result.iterator().hasNext());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCoders_EmptyCoders_jHXZ2() throws IOException {
    Folder folder = new Folder();
    folder.packedStreams = new int[1];
    folder.coders = null;
    Iterable<Coder> result = folder.getOrderedCoders();
    assertFalse(result.iterator().hasNext());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCoders_SingleCoder_ZtIE3() throws IOException {
    Folder folder = new Folder();
    folder.packedStreams = new int[]{0};
    folder.coders = new Coder[]{new Coder()};
    Iterable<Coder> result = folder.getOrderedCoders();
    assertEquals(1, ((Collection<?>) result).size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCoders_MultipleCoders_NoDuplicates_YxkY4() throws IOException {
    Folder folder = new Folder();
    folder.packedStreams = new int[]{0, 1};
    folder.coders = new Coder[]{new Coder(), new Coder()};
    Iterable<Coder> result = folder.getOrderedCoders();
    assertEquals(2, ((Collection<?>) result).size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCoders_ValidChain_YRNC6_1() throws IOException {
    Folder folder = new Folder();
    Coder coder1 = new Coder();
    Coder coder2 = new Coder();
    folder.packedStreams = new int[]{0, 1};
    folder.coders = new Coder[]{coder1, coder2};
    Iterable<Coder> result = folder.getOrderedCoders();
    assertTrue(result.iterator().hasNext());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCoders_ValidChain_YRNC6_2() throws IOException {
    Folder folder = new Folder();
    Coder coder1 = new Coder();
    Coder coder2 = new Coder();
    folder.packedStreams = new int[]{0, 1};
    folder.coders = new Coder[]{coder1, coder2};
    Iterable<Coder> result = folder.getOrderedCoders();
    assertEquals(coder1, result.iterator().next());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCoders_ValidChain_YRNC6_4() throws IOException {
    Folder folder = new Folder();
    Coder coder1 = new Coder();
    Coder coder2 = new Coder();
    folder.packedStreams = new int[]{0, 1};
    folder.coders = new Coder[]{coder1, coder2};
    Iterable<Coder> result = folder.getOrderedCoders();
    assertEquals(coder2, result.iterator().next());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCoders_ChainWithNonConsecutiveIndexes_danQ7() throws IOException {
    Folder folder = new Folder();
    Coder coder1 = new Coder();
    Coder coder2 = new Coder();
    folder.packedStreams = new int[]{0, 2};
    folder.coders = new Coder[]{coder1, new Coder(), coder2};
    Iterable<Coder> result = folder.getOrderedCoders();
    assertEquals(2, ((Collection<?>) result).size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrderedCoders_ChainWithInvalidIndex_PcTR8() throws IOException {
    Folder folder = new Folder();
    folder.packedStreams = new int[]{0, -1};
    folder.coders = new Coder[]{new Coder()};
    Iterable<Coder> result = folder.getOrderedCoders();
    assertEquals(1, ((Collection<?>) result).size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithNoCodersAndStreams_ZDqf0() {
    Folder folder = new Folder();
    String expected = "Folder with 0 coders, 0 input streams, 0 output streams, 0 bind pairs, 0 packed streams, 0 unpack sizes, without CRC and 0 unpack streams";
    assertEquals(expected, folder.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithCodersAndStreams_tNek1() {
    Folder folder = new Folder();
    folder.coders = new Coder[2]; // Assuming Coder is a class
    folder.totalInputStreams = 3;
    folder.totalOutputStreams = 4;
    folder.bindPairs = new BindPair[1]; // Assuming BindPair is a class
    folder.packedStreams = new PackedStream[2]; // Assuming PackedStream is a class
    folder.unpackSizes = new int[5];
    folder.hasCrc = true;
    folder.crc = "123456";
    folder.numUnpackSubStreams = 6;
    String expected = "Folder with 2 coders, 3 input streams, 4 output streams, 1 bind pairs, 2 packed streams, 5 unpack sizes, with CRC 123456 and 6 unpack streams";
    assertEquals(expected, folder.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnpackSizeForCoder_WithValidCoder_ReturnsCorrectSize_Psfa0() {
    Folder folder = new Folder();
    Coder coder = new Coder();
    long expectedSize = 100; // Example expected size
    folder.addCoder(coder, expectedSize); // Hypothetical method to add coder and size
    long actualSize = folder.getUnpackSizeForCoder(coder);
    assertEquals(expectedSize, actualSize);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnpackSizeForCoder_WithNullCoder_ReturnsZero_bvkG1() {
    Folder folder = new Folder();
    long actualSize = folder.getUnpackSizeForCoder(null);
    assertEquals(0, actualSize);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnpackSizeForCoder_WithCoderNotInList_ReturnsZero_Rkai2() {
    Folder folder = new Folder();
    Coder coder1 = new Coder();
    Coder coder2 = new Coder();
    long actualSize = folder.getUnpackSizeForCoder(coder2);
    assertEquals(0, actualSize);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnpackSizeForCoder_WithMultipleCoders_ReturnsCorrectSize_GAYW3() {
    Folder folder = new Folder();
    Coder coder1 = new Coder();
    Coder coder2 = new Coder();
    long expectedSize = 200; // Example expected size for coder2
    folder.addCoder(coder1, 100); // Hypothetical method to add coder and size
    folder.addCoder(coder2, expectedSize);
    long actualSize = folder.getUnpackSizeForCoder(coder2);
    assertEquals(expectedSize, actualSize);
}
}