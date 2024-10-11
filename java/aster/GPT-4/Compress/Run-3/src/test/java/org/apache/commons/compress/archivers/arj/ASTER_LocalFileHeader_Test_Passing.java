/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.arj;
import java.util.Arrays;
import java.util.Objects;
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
public class Aster_LocalFileHeader_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithNullName_Ikjh0() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    assertEquals(0, localFileHeader.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCodeWithNonNullName_MXoT1() {
    LocalFileHeader localFileHeader = new LocalFileHeader();
    assertEquals("testName".hashCode(), localFileHeader.hashCode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString_qaTr0() {
    LocalFileHeader header = new LocalFileHeader();
    header.archiverVersionNumber = 1;
    header.minVersionToExtract = 1;
    header.hostOS = "Windows";
    header.arjFlags = 0;
    header.method = "store";
    header.fileType = "file";
    header.reserved = 0;
    header.dateTimeModified = "2023-10-01T12:00:00";
    header.compressedSize = 1024;
    header.originalSize = 2048;
    header.originalCrc32 = 123456789;
    header.fileSpecPosition = 0;
    header.fileAccessMode = "read";
    header.firstChapter = 1;
    header.lastChapter = 1;
    header.extendedFilePosition = 0;
    header.dateTimeAccessed = "2023-10-01T12:00:00";
    header.dateTimeCreated = "2023-10-01T12:00:00";
    header.originalSizeEvenForVolumes = 2048;
    header.name = "testfile.txt";
    header.comment = "This is a test file.";
    header.extendedHeaders = new String[]{"header1", "header2"};
    String expected = "LocalFileHeader [archiverVersionNumber=1, minVersionToExtract=1, hostOS=Windows, arjFlags=0, method=store, fileType=file, reserved=0, dateTimeModified=2023-10-01T12:00:00, compressedSize=1024, originalSize=2048, originalCrc32=123456789, fileSpecPosition=0, fileAccessMode=read, firstChapter=1, lastChapter=1, extendedFilePosition=0, dateTimeAccessed=2023-10-01T12:00:00, dateTimeCreated=2023-10-01T12:00:00, originalSizeEvenForVolumes=2048, name=testfile.txt, comment=This is a test file., extendedHeaders=[header1, header2]]";
    assertEquals(expected, header.toString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_SameObject_sLxz0() {
    LocalFileHeader header = new LocalFileHeader();
    assertTrue(header.equals(header));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullObject_fczd1() {
    LocalFileHeader header = new LocalFileHeader();
    assertFalse(header.equals(null));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentClass_xTzs2() {
    LocalFileHeader header = new LocalFileHeader();
    assertFalse(header.equals("String"));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_EqualObjects_uplA3() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    assertTrue(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentArchiverVersionNumber_xObb4() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.archiverVersionNumber = 1;
    header2.archiverVersionNumber = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentMinVersionToExtract_RaKh5() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.minVersionToExtract = 1;
    header2.minVersionToExtract = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentHostOS_FlBa6() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.hostOS = 1;
    header2.hostOS = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentArjFlags_LJPH7() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.arjFlags = 1;
    header2.arjFlags = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentMethod_zDmv8() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.method = 1;
    header2.method = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentFileType_ezlY9() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.fileType = 1;
    header2.fileType = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentReserved_quoa10() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.reserved = 1;
    header2.reserved = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentDateTimeModified_cmws11() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.dateTimeModified = 1;
    header2.dateTimeModified = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentCompressedSize_gkbQ12() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.compressedSize = 1;
    header2.compressedSize = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentOriginalSize_PihF13() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.originalSize = 1;
    header2.originalSize = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentOriginalCrc32_ClzK14() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.originalCrc32 = 1;
    header2.originalCrc32 = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentFileSpecPosition_SQBo15() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.fileSpecPosition = 1;
    header2.fileSpecPosition = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentFileAccessMode_UDvE16() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.fileAccessMode = 1;
    header2.fileAccessMode = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentFirstChapter_IpmQ17() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.firstChapter = 1;
    header2.firstChapter = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentLastChapter_YpgR18() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.lastChapter = 1;
    header2.lastChapter = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentExtendedFilePosition_ZcMa19() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.extendedFilePosition = 1;
    header2.extendedFilePosition = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentDateTimeAccessed_hmLi20() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.dateTimeAccessed = 1;
    header2.dateTimeAccessed = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentDateTimeCreated_bXBV21() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.dateTimeCreated = 1;
    header2.dateTimeCreated = 2;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentOriginalSizeEvenForVolumes_FXkF22() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.originalSizeEvenForVolumes = true;
    header2.originalSizeEvenForVolumes = false;
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentName_Raxq23() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.name = "File1";
    header2.name = "File2";
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentComment_stGQ24() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.comment = "Comment1";
    header2.comment = "Comment2";
    assertFalse(header1.equals(header2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentExtendedHeaders_Cgqb25() {
    LocalFileHeader header1 = new LocalFileHeader();
    LocalFileHeader header2 = new LocalFileHeader();
    header1.extendedHeaders = new String[]{"Header1"};
    header2.extendedHeaders = new String[]{"Header2"};
    assertFalse(header1.equals(header2));
}
}