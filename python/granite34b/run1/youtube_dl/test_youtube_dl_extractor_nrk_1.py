import unittest
from youtube_dl.extractor.nrk import NRKPlaylistBaseIE


class TestNRKTVEpisodesIE(unittest.TestCase):
    def test_extract_title(self):
        webpage = '<h1>Test Title</h1>'
        ie = NRKTVEpisodesIE()
        title = ie._extract_title(webpage)
        self.assertEqual(title, 'Test Title')

if __name__ == '__main__':
    unittest.main()