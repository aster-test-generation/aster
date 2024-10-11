import unittest
from youtube_dl.extractor.nrk import NRKPlaylistBaseIE


class TestNRKPlaylistIE(unittest.TestCase):
    def test_extract_title(self):
        webpage = "<html><head><title>Test Title</title></head><body></body></html>"
        ie = NRKPlaylistIE()
        title = ie._extract_title(webpage)
        self.assertEqual(title, "Test Title")

    def test_extract_description(self):
        webpage = "<html><head><meta property='og:description' content='Test Description'></head><body></body></html>"
        ie = NRKPlaylistIE()
        description = ie._extract_description(webpage)
        self.assertEqual(description, "Test Description")

if __name__ == '__main__':
    unittest.main()