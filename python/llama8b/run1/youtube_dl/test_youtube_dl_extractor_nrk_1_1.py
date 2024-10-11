import unittest
from youtube_dl.extractor.nrk import NRKPlaylistIE, NRKPlaylistBaseI


class TestNRKPlaylistIE(unittest.TestCase):
    def test_init(self):
        ie = NRKPlaylistIE()
        self.assertEqual(ie.__class__, NRKPlaylistIE)

    def test_extract_title(self):
        ie = NRKPlaylistIE()
        webpage = "test webpage"
        title = ie._extract_title(webpage)
        self.assertEqual(title, ie._og_search_title(webpage, fatal=False))

    def test_extract_description(self):
        ie = NRKPlaylistIE()
        webpage = "test webpage"
        description = ie._extract_description(webpage)
        self.assertEqual(description, ie._og_search_description(webpage))

    def test_str_method(self):
        ie = NRKPlaylistIE()
        result = str(ie)
        self.assertEqual(result, "NRKPlaylistIE")

    def test_repr_method(self):
        ie = NRKPlaylistIE()
        result = repr(ie)
        self.assertEqual(result, "NRKPlaylistIE()")

if __name__ == '__main__':
    unittest.main()