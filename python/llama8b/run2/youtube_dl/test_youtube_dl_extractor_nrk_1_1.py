import unittest
from youtube_dl.extractor.nrk import NRKPlaylistIE, NRKPlaylistBaseI


class TestNRKPlaylistIE(unittest.TestCase):
    def test_init(self):
        ie = NRKPlaylistIE()
        self.assertIsInstance(ie, NRKPlaylistBaseIE)

    def test_extract_title(self):
        ie = NRKPlaylistIE()
        webpage = "test webpage"
        title = ie._extract_title(webpage)
        self.assertIsInstance(title, str)

    def test_extract_description(self):
        ie = NRKPlaylistIE()
        webpage = "test webpage"
        description = ie._extract_description(webpage)
        self.assertIsInstance(description, str)

    def test_str_method(self):
        ie = NRKPlaylistIE()
        result = str(ie)
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        ie = NRKPlaylistIE()
        result = repr(ie)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()