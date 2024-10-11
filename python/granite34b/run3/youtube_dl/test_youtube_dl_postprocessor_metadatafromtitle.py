import unittest
from youtube_dl.postprocessor.metadatafromtitle import MetadataFromTitlePP


class TestMetadataFromTitlePP(unittest.TestCase):
    def test_init(self):
        downloader = None
        titleformat = "example_title_format"
        pp = MetadataFromTitlePP(downloader, titleformat)
        self.assertEqual(pp._titleformat, titleformat)
        self.assertEqual(pp._titleregex, titleformat)

    def test_format_to_regex(self):
        fmt = "example_title_format"
        pp = MetadataFromTitlePP(None, fmt)
        regex = pp.format_to_regex(fmt)
        self.assertEqual(regex, "example_title_format")

class TestMetadataFromTitlePP(unittest.TestCase):
    def test_format_to_regex(self):
        titleformat = '%(artist)s - %(title)s'
        regex = MetadataFromTitlePP.format_to_regex(titleformat)
        self.assertEqual(regex, r'(?P<artist>.+) - (?P<title>.+)')

    def test_run(self):
        titleformat = '%(artist)s - %(title)s'
        title = ' artist - title '
        info = {'title': title}
        pp = MetadataFromTitlePP(None, titleformat)
        pp.run(info)
        self.assertEqual(info['artist'], 'artist')
        self.assertEqual(info['title'], 'title')

class TestMetadataFromTitlePP(unittest.TestCase):
    def setUp(self):
        self.titleformat = '%(artist)s - %(title)s'
        self.postprocessor = MetadataFromTitlePP(None, self.titleformat)
        self.info = {
            'title': ' artist - title ',
            'artist': 'artist',
            'title': 'title',
        }

    def test_format_to_regex(self):
        regex = self.postprocessor.format_to_regex(self.titleformat)
        self.assertEqual(regex, r'(?P<artist>.+) - (?P<title>.+)')

    def test_run(self):
        _, info = self.postprocessor.run(self.info)
        self.assertEqual(info['artist'], 'artist')
        self.assertEqual(info['title'], 'title')

if __name__ == '__main__':
    unittest.main()