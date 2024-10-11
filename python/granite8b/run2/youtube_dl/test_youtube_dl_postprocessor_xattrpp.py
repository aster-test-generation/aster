import unittest
from youtube_dl.postprocessor.xattrpp import XAttrMetadataPP


class TestXAttrMetadataPP(unittest.TestCase):
    def test_run(self):
        pp = XAttrMetadataPP()
        info = {
            'filepath': 'test.mp4',
            'webpage_url': 'https://www.example.com',
            'title': 'Test Video',
            'upload_date': '20230101',
            'description': 'Test video description',
            'uploader': 'Test User',
            'format': 'mp4',
        }
        pp._downloader = MockDownloader()
        pp.run(info)
        self.assertEqual(pp._downloader.to_screen_calls, ['[metadata] Writing metadata to file\'s xattrs'])
        self.assertEqual(pp._downloader.report_warning_calls, [])
        self.assertEqual(pp._downloader.report_error_calls, [])
        self.assertEqual(info, {
            'filepath': 'test.mp4',
            'webpage_url': 'https://www.example.com',
            'title': 'Test Video',
            'upload_date': '20230101',
            'description': 'Test video description',
            'uploader': 'Test User',
            'format': 'mp4',
        })

    def test_run_xattr_unavailable(self):
        pp = XAttrMetadataPP()
        pp._downloader = MockDownloader()
        info = {
            'filepath': 'test.mp4',
        }
        with self.assertRaises(XAttrUnavailableError):
            pp.run(info)
        self.assertEqual(pp._downloader.to_screen_calls, [])
        self.assertEqual(pp._downloader.report_warning_calls, [])
        self.assertEqual(pp._downloader.report_error_calls, [
            'This filesystem doesn\'t support extended attributes. You need to use NTFS.'
        ])

    def test_run_xattr_metadata_error(self):
        pp = XAttrMetadataPP()
        pp._downloader = MockDownloader()
        info = {
            'filepath': 'test.mp4',
            'webpage_url': 'https://www.example.com',
            'title': 'Test Video',
            'upload_date': '20230101',
            'description': 'Test video description',
            'uploader': 'Test User',
            'format': 'mp4',
        }
        with self.assertRaises(XAttrMetadataError):
            pp.run(info)
        self.assertEqual(pp._downloader.to_screen_calls, ['[metadata] Writing metadata to file\'s xattrs'])
        self.assertEqual(pp._downloader.report_warning_calls, [
            'Unable to write extended attributes due to too long values.'
        ])
        self.assertEqual(pp._downloader.report_error_calls, [])
        self.assertEqual(info, {
            'filepath': 'test.mp4',
            'webpage_url': 'https://www.example.com',
            'title': 'Test Video',
            'upload_date': '20230101',
            'description': 'Test video description',
            'uploader': 'Test User',
            'format': 'mp4',
        })

class MockDownloader:
    def __init__(self):
        self.to_screen_calls = []
        self.report_warning_calls = []
        self.report_error_calls = []

    def to_screen(self, message):
        self.to_screen_calls.append(message)

    def report_warning(self, message):
        self.report_warning_calls.append(message)

    def report_error(self, message):
        self.report_error_calls.append(message)

if __name__ == '__main__':
    unittest.main()