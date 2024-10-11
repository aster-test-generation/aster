import unittest
from youtube_dl.postprocessor.xattrpp import XAttrMetadataPP


class TestXAttrMetadataPP(unittest.TestCase):
    def test_run(self):
        pp = XAttrMetadataPP()
        info = {
            'filepath': 'test.mp4',
            'title': 'Test Title',
            'upload_date': '2023-01-01',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'Test Format',
        }
        pp.run(info)
        self.assertEqual(info['filepath'], 'test.mp4')
        self.assertEqual(info['title'], 'Test Title')
        self.assertEqual(info['upload_date'], '2023-01-01')
        self.assertEqual(info['description'], 'Test Description')
        self.assertEqual(info['uploader'], 'Test Uploader')
        self.assertEqual(info['format'], 'Test Format')

class TestXAttrMetadataPP(unittest.TestCase):
    def test_run(self):
        info = {
            'filepath': 'test_file.mp4',
            'title': 'Test Title',
            'upload_date': '2023-01-01',
            'description': 'Test Description',
            'uploader': 'Test Uploader',
            'format': 'Test Format',
        }
        pp = XAttrMetadataPP()
        pp._downloader = DummyDownloader()
        pp.run(info)
        self.assertEqual(pp._downloader.screen_output, '[metadata] Writing metadata to file\'s xattrs')
        self.assertEqual(pp._downloader.num_written, 5)

    def test_private_method(self):
        pp = XAttrMetadataPP()
        pp._downloader = DummyDownloader()
        pp._write_xattr('test_file.mp4', 'user.xdg.referrer.url', 'test_url')
        self.assertEqual(pp._downloader.xattr_values, {'user.xdg.referrer.url': 'test_url'})

    def test_protected_method(self):
        pp = XAttrMetadataPP()
        pp._downloader = DummyDownloader()
        pp._write_xattr('test_file.mp4', 'user.dublincore.title', 'test_title')
        self.assertEqual(pp._downloader.xattr_values, {'user.dublincore.title': 'test_title'})

    def test_magic_method(self):
        pp = XAttrMetadataPP()
        pp._downloader = DummyDownloader()
        pp.__str__()
        self.assertEqual(pp._downloader.screen_output, 'XAttrMetadataPP')

class DummyDownloader:
    def __init__(self):
        self.screen_output = ''
        self.num_written = 0
        self.xattr_values = {}

    def to_screen(self, msg):
        self.screen_output = msg

    def report_error(self, msg):
        self.screen_output = msg

    def report_warning(self, msg):
        self.screen_output = msg

    def write_xattr(self, filename, xattrname, value):
        self.xattr_values[xattrname] = value
        self.num_written += 1

if __name__ == '__main__':
    unittest.main()