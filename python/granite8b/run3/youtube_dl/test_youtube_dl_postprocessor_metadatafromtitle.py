import unittest
from youtube_dl.postprocessor.metadatafromtitle import MetadataFromTitlePP


class TestMetadataFromTitlePP(unittest.TestCase):
    def test_format_to_regex(self):
        fmt = '%(artist)s - %(title)s'
        regex = MetadataFromTitlePP.format_to_regex(fmt, flags)
        self.assertEqual(regex, r'(?P<artist>.+) - (?P<title>.+)')

    def test_run(self):
        info = {'title': 'Artist - Title'}
        pp = MetadataFromTitlePP(None, '%(artist)s - %(title)s')
        _, new_info = pp.run(info)
        self.assertEqual(new_info['artist'], 'Artist')
        self.assertEqual(new_info['title'], 'Title')

if __name__ == '__main__':
    unittest.main()