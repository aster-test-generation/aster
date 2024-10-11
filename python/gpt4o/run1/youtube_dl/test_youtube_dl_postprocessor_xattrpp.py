import unittest
from unittest.mock import MagicMock, patch
from youtube_dl.postprocessor.xattrpp import XAttrMetadataPP
from youtube_dl.utils import XAttrMetadataError, XAttrUnavailableError


class TestXAttrMetadataPP(unittest.TestCase):
    def setUp(self):
        self.downloader = MagicMock()
        self.pp = XAttrMetadataPP(downloader=self.downloader)

    def test_run_success(self):
        info = {
            'filepath': 'testfile',
            'webpage_url': 'http://example.com',
            'title': 'Test Title',
            'upload_date': '20230101',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'mp4'
        }
        with patch('youtube_dl.postprocessor.xattrpp.write_xattr') as mock_write_xattr, \
             patch('youtube_dl.postprocessor.xattrpp.hyphenate_date', return_value='2023-01-01'):
            result = self.pp.run(info)
            self.assertEqual(result, ([], info))
            self.assertEqual(mock_write_xattr.call_count, 6)

    def test_run_xattr_unavailable_error(self):
        info = {'filepath': 'testfile'}
        with patch('youtube_dl.postprocessor.xattrpp.write_xattr', side_effect=XAttrUnavailableError('XAttr unavailable')):
            result = self.pp.run(info)
            self.downloader.report_error.assert_called_once_with('XAttr unavailable')
            self.assertEqual(result, ([], info))

    def test_run_xattr_metadata_error_no_space(self):
        info = {'filepath': 'testfile'}
        error = XAttrMetadataError('NO_SPACE')
        with patch('youtube_dl.postprocessor.xattrpp.write_xattr', side_effect=error):
            result = self.pp.run(info)
            self.downloader.report_warning.assert_called_once_with(
                'There\'s no disk space left, disk quota exceeded or filesystem xattr limit exceeded. Extended attributes are not written.')
            self.assertEqual(result, ([], info))

    def test_run_xattr_metadata_error_value_too_long(self):
        info = {'filepath': 'testfile'}
        error = XAttrMetadataError('VALUE_TOO_LONG')
        with patch('youtube_dl.postprocessor.xattrpp.write_xattr', side_effect=error):
            result = self.pp.run(info)
            self.downloader.report_warning.assert_called_once_with(
                'Unable to write extended attributes due to too long values.')
            self.assertEqual(result, ([], info))

    def test_run_xattr_metadata_error_unsupported_filesystem(self):
        info = {'filepath': 'testfile'}
        error = XAttrMetadataError('UNSUPPORTED')
        with patch('youtube_dl.postprocessor.xattrpp.write_xattr', side_effect=error), \
             patch('youtube_dl.postprocessor.xattrpp.compat_os_name', 'posix'):
            result = self.pp.run(info)
            self.downloader.report_error.assert_called_once_with(
                'This filesystem doesn\'t support extended attributes. (You may have to enable them in your /etc/fstab)')
            self.assertEqual(result, ([], info))

    def test_run_xattr_metadata_error_unsupported_filesystem_nt(self):
        info = {'filepath': 'testfile'}
        error = XAttrMetadataError('UNSUPPORTED')
        with patch('youtube_dl.postprocessor.xattrpp.write_xattr', side_effect=error), \
             patch('youtube_dl.postprocessor.xattrpp.compat_os_name', 'nt'):
            result = self.pp.run(info)
            self.downloader.report_error.assert_called_once_with(
                'This filesystem doesn\'t support extended attributes. You need to use NTFS.')
            self.assertEqual(result, ([], info))

if __name__ == '__main__':
    unittest.main()