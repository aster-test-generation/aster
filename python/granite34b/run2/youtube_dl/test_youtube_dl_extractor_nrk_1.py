from youtube_dl.extractor.nrk import NRKPlaylistBaseIE
import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodesIE


class TestNRKTVEpisodesIE(unittest.TestCase):
    def test_extract_title(self):
        webpage = '<h1>Test Title</h1>'
        ie = NRKTVEpisodesIE()
        title = ie._extract_title(webpage)
        self.assertEqual(title, 'Test Title')

    def test_private_method(self):
        webpage = '<h1>Test Title</h1>'
        ie = NRKTVEpisodesIE()
        with self.assertRaises(ExtractorError):
            ie._NRKTVEpisodesIE__private_method(webpage)

    def test_protected_method(self):
        webpage = '<h1>Test Title</h1>'
        ie = NRKTVEpisodesIE()
        with self.assertRaises(ExtractorError):
            ie._protected_method(webpage)

    def test_magic_method(self):
        webpage = '<h1>Test Title</h1>'
        ie = NRKTVEpisodesIE()
        with self.assertRaises(ExtractorError):
            ie.__str__(webpage)

if __name__ == '__main__':
    unittest.main()