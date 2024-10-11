import unittest
from unittest.mock import Mock
from youtube_dl.postprocessor.metadatafromtitle import MetadataFromTitlePP


class TestMetadataFromTitlePP(unittest.TestCase):
    def test_init(self):
        downloader = Mock()
        titleformat = '%(artist)s - %(title)s'
        pp = MetadataFromTitlePP(downloader, titleformat)
        self.assertEqual(pp._titleformat, titleformat)
        self.assertEqual(pp._titleregex, r'(?P<artist>.+) \- (?P<title>.+)')

    def test_format_to_regex(self):
        fmt = '%(artist)s - %(title)s'
        pp = MetadataFromTitlePP(Mock(), fmt)
        regex = pp.format_to_regex(fmt)
        self.assertEqual(regex, r'(?P<artist>.+)\ -\ (?P<title>.+)')

    def test_run(self):
        info = {'title': 'Artist - Title', 'artist': None, 'title': None}
        pp = MetadataFromTitlePP(Mock(), '%(artist)s - %(title)s')
        pp.run(info)
        self.assertEqual(info['artist'], 'Artist')
        self.assertEqual(info['title'], 'Title')

if __name__ == '__main__':
    unittest.main()