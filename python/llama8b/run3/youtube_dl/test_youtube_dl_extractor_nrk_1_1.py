import unittest
from youtube_dl.extractor.nrk import NRKPlaylistIE, NRKPlaylistBaseI


class TestNRKPlaylistIE(unittest.TestCase):
    def test_init(self):
        instance = NRKPlaylistIE()
        self.assertEqual(instance, instance)

    def test_extract_title(self):
        instance = NRKPlaylistIE()
        webpage = "test webpage"
        result = instance._extract_title(webpage)
        self.assertEqual(result, instance._og_search_title(webpage, fatal=False))

    def test_extract_description(self):
        instance = NRKPlaylistIE()
        webpage = "test webpage"
        result = instance._extract_description(webpage)
        self.assertEqual(result, instance._og_search_description(webpage))

    def test_str_method(self):
        instance = NRKPlaylistIE()
        result = str(instance)
        self.assertEqual(result, str(instance))

    def test_repr_method(self):
        instance = NRKPlaylistIE()
        result = repr(instance)
        self.assertEqual(result, repr(instance))

if __name__ == '__main__':
    unittest.main()