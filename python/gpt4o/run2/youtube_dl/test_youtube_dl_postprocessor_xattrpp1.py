import unittest
from unittest.mock import MagicMock, patch
from youtube_dl.postprocessor.xattrpp import XAttrMetadataPP
from youtube_dl.utils import XAttrMetadataError, XAttrUnavailableError

class TestXAttrMetadataPP(unittest.TestCase):
    def setUp(self):
        self.pp = XAttrMetadataPP(downloader=MagicMock())
        self.info = {
            'filepath': 'testfile',
            'webpage_url': 'http://example.com',
            'title': 'Test Title',
            'upload_date': '20230101',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'mp4'
        }

    @patch('youtube_dl.postprocessor.xattrpp.write_xattr')
    @patch('youtube_dl.postprocessor.xattrpp.hyphenate_date', return_value='2023-01-01')
    def test_run_success(self, mock_hyphenate_date, mock_write_xattr):
        result, info = self.pp.run(self.info)
        self.assertEqual(result, [])
        self.assertEqual(info, self.info)
        self.assertEqual(mock_write_xattr.call_count, 6)

    @patch('youtube_dl.postprocessor.xattrpp.write_xattr', side_effect=XAttrUnavailableError('XAttr unavailable'))
    def test_run_xattr_unavailable_error(self, mock_write_xattr):
        result, info = self.pp.run(self.info)
        self.assertEqual(result, [])
        self.assertEqual(info, self.info)
        self.pp._downloader.report_error.assert_called_once_with('XAttr unavailable')

    @patch('youtube_dl.postprocessor.xattrpp.write_xattr', side_effect=XAttrMetadataError('NO_SPACE'))
    def test_run_xattr_metadata_error_no_space(self, mock_write_xattr):
        result, info = self.pp.run(self.info)
        self.assertEqual(result, [])
        self.assertEqual(info, self.info)
        self.pp._downloader.report_warning.assert_called_once_with(
            "There's no disk space left, disk quota exceeded or filesystem xattr limit exceeded. Extended attributes are not written."
        )

    @patch('youtube_dl.postprocessor.xattrpp.write_xattr', side_effect=XAttrMetadataError('VALUE_TOO_LONG'))
    def test_run_xattr_metadata_error_value_too_long(self, mock_write_xattr):
        result, info = self.pp.run(self.info)
        self.assertEqual(result, [])
        self.assertEqual(info, self.info)
        self.pp._downloader.report_warning.assert_called_once_with(
            'Unable to write extended attributes due to too long values.'
        )

    @patch('youtube_dl.postprocessor.xattrpp.write_xattr', side_effect=XAttrMetadataError('UNSUPPORTED'))
    @patch('youtube_dl.postprocessor.xattrpp.compat_os_name', 'nt')
    def test_run_xattr_metadata_error_unsupported_nt(self, mock_write_xattr):
        result, info = self.pp.run(self.info)
        self.assertEqual(result, [])
        self.assertEqual(info, self.info)
        self.pp._downloader.report_error.assert_called_once_with(
            "This filesystem doesn't support extended attributes. You need to use NTFS."
        )

    @patch('youtube_dl.postprocessor.xattrpp.write_xattr', side_effect=XAttrMetadataError('UNSUPPORTED'))
    @patch('youtube_dl.postprocessor.xattrpp.compat_os_name', 'posix')
    def test_run_xattr_metadata_error_unsupported_posix(self, mock_write_xattr):
        result, info = self.pp.run(self.info)
        self.assertEqual(result, [])
        self.assertEqual(info, self.info)
        self.pp._downloader.report_error.assert_called_once_with(
            "This filesystem doesn't support extended attributes. (You may have to enable them in your /etc/fstab)"
        )

if __name__ == '__main__':
    unittest.main()