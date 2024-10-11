import unittest
from youtube_dl.postprocessor.metadatafromtitle import MetadataFromTitlePP

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

if __name__ == '__main__':
    unittest.main()