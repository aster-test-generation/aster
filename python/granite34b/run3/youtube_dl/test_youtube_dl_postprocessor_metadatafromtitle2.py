import unittest
from youtube_dl.postprocessor.metadatafromtitle import MetadataFromTitlePP

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