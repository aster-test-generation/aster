import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodesIE, NRKPlaylistBaseIE


class TestNRKTVEpisodesIE(unittest.TestCase):
    def setUp(self):
        self.instance = NRKTVEpisodesIE()

    def test_init(self):
        self.assertIsInstance(self.instance, NRKTVEpisodesIE)

    def test_extract_title(self):
        webpage = '<html><head><title>Test</title></head><body><h1>Example Title</h1></body></html>'
        result = self.instance._extract_title(webpage)
        self.assertEqual(result, 'Example Title')

    def test_extract_title_no_title(self):
        webpage = '<html><head><title>Test</title></head><body><h1></h1></body></html>'
        result = self.instance._extract_title(webpage)
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()