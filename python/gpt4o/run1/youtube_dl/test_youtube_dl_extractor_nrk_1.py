import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodesIE


class TestNRKTVEpisodesIE(unittest.TestCase):
    def test_init(self):
        instance = NRKTVEpisodesIE()
        self.assertIsInstance(instance, NRKTVEpisodesIE)

    def test_extract_title(self):
        instance = NRKTVEpisodesIE()
        webpage = '<html><head><title>Test</title></head><body><h1>Example Title</h1></body></html>'
        result = instance._extract_title(webpage)
        self.assertEqual(result, 'Example Title')

    def test_extract_title_no_title(self):
        instance = NRKTVEpisodesIE()
        webpage = '<html><head><title>Test</title></head><body><h1></h1></body></html>'
        result = instance._extract_title(webpage)
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()