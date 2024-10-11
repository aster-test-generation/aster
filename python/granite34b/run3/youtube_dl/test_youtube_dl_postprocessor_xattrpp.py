import unittest
from youtube_dl.postprocessor.xattrpp import XAttrMetadataPP


class TestXAttrMetadataPP(unittest.TestCase):
    def test_run(self):
        pp = XAttrMetadataPP()
        info = {
            'filepath': 'test_file.mp4',
            'title': 'Test Title',
            'upload_date': '2023-01-01',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'Test Format',
        }
        pp.run(info)
        self.assertEqual(info['filepath'], 'test_file.mp4')
        self.assertEqual(info['title'], 'Test Title')
        self.assertEqual(info['upload_date'], '2023-01-01')
        self.assertEqual(info['description'], 'Test Description')
        self.assertEqual(info['uploader'], 'Test Uploader')
        self.assertEqual(info['format'], 'Test Format')

class TestXAttrMetadataPP(unittest.TestCase):
    def test_run_with_all_metadata(self):
        info = {
            'filepath': 'test.mp4',
            'title': 'Test Title',
            'upload_date': '2023-01-01',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'Test Format',
        }
        pp = XAttrMetadataPP()
        pp._downloader = DummyDownloader()
        pp.run(info)
        self.assertEqual(pp._downloader.messages, [
            '[metadata] Writing metadata to file\'s xattrs',
        ])

    def test_run_with_insufficient_disk_space(self):
        info = {
            'filepath': 'test.mp4',
            'title': 'Test Title',
            'upload_date': '2023-01-01',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'Test Format',
        }
        pp = XAttrMetadataPP()
        pp._downloader = DummyDownloader()
        pp._downloader.side_effect = XAttrMetadataError('NO_SPACE')
        pp.run(info)
        self.assertEqual(pp._downloader.messages, [
            '[metadata] Writing metadata to file\'s xattrs',
            'There\'s no disk space left, disk quota exceeded or filesystem xattr limit exceeded. Some extended attributes are not written.',
        ])

    def test_run_with_long_values(self):
        info = {
            'filepath': 'test.mp4',
            'title': 'Test Title' * 100,
            'upload_date': '2023-01-01',
            'description': 'Test Description' * 100,
            'uploader': 'Test Uploader' * 100,
            'format': 'Test Format' * 100,
        }
        pp = XAttrMetadataPP()
        pp._downloader = DummyDownloader()
        pp._downloader.side_effect = XAttrMetadataError('VALUE_TOO_LONG')
        pp.run(info)
        self.assertEqual(pp._downloader.messages, [
            '[metadata] Writing metadata to file\'s xattrs',
            'Unable to write extended attributes due to too long values.',
        ])

    def test_run_with_unsupported_filesystem(self):
        info = {
            'filepath': 'test.mp4',
            'title': 'Test Title',
            'upload_date': '2023-01-01',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'Test Format',
        }
        pp = XAttrMetadataPP()
        pp._downloader = DummyDownloader()
        pp._downloader.side_effect = XAttrMetadataError('UNSUPPORTED_FILESYSTEM')
        pp.run(info)
        self.assertEqual(pp._downloader.messages, [
            '[metadata] Writing metadata to file\'s xattrs',
            'This filesystem doesn\'t support extended attributes. You need to use NTFS.',
        ])

class DummyDownloader:
    def __init__(self):
        self.messages = []

    def to_screen(self, message):
        self.messages.append(message)

    def report_error(self, message):
        self.messages.append(message)

    def report_warning(self, message):
        self.messages.append(message)

if __name__ == '__main__':
    unittest.main()