import unittest
from unittest.mock import MagicMock
from youtube_dl.postprocessor.metadatafromtitle import MetadataFromTitlePP

class TestMetadataFromTitlePP(unittest.TestCase):
    def setUp(self):
        self.downloader = MagicMock()
        self.titleformat = '%(artist)s - %(title)s'
        self.instance = MetadataFromTitlePP(self.downloader, self.titleformat)

    def test_init(self):
        self.assertEqual(self.instance._titleformat, self.titleformat)
        import re
        self.assertEqual(self.instance._titleregex, self.instance.format_to_regex(self.titleformat))

    def test_format_to_regex(self):
        fmt = '%(artist)s - %(title)s'
        expected_regex = r'(?P<artist>.+)\ \-\ (?P<title>.+)'
        result = self.instance.format_to_regex(fmt)
        self.assertEqual(result, expected_regex)

    def test_run_success(self):
        info = {'title': 'Artist - Song Title'}
        self.instance._titleregex = r'(?P<artist>.+)\ \-\ (?P<title>.+)'
        self.instance._downloader.to_screen = MagicMock()
        _, result_info = self.instance.run(info)
        self.assertEqual(result_info['artist'], 'Artist')
        self.assertEqual(result_info['title'], 'Song Title')

    def test_run_failure(self):
        info = {'title': 'Invalid Title'}
        self.instance._titleregex = r'(?P<artist>.+)\ \-\ (?P<title>.+)'
        self.instance._downloader.to_screen = MagicMock()
        _, result_info = self.instance.run(info)
        self.instance._downloader.to_screen.assert_called_with(
            '[fromtitle] Could not interpret title of video as "%s"' % self.titleformat)
        self.assertEqual(result_info, info)

    def test_protected_format_to_regex(self):
        fmt = '%(album)s - %(track)s'
        expected_regex = r'(?P<album>.+)\ \-\ (?P<track>.+)'
        result = self.instance.format_to_regex(fmt)
        self.assertEqual(result, expected_regex)

if __name__ == '__main__':
    unittest.main()