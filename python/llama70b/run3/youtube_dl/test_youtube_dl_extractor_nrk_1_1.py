import unittest
from youtube_dl.extractor.nrk import NRKPlaylistIE, InfoExtracto


class TestNRKPlaylistIE(unittest.TestCase):
    def test_init(self):
        instance = NRKPlaylistIE()
        self.assertIsInstance(instance, NRKPlaylistIE)

    def test_extract_title(self):
        instance = NRKPlaylistIE()
        webpage = {'title': 'Test Title'}
        result = instance._extract_title(webpage)
        self.assertEqual(result, 'Test Title')

    def test_extract_description(self):
        instance = NRKPlaylistIE()
        webpage = {'description': 'Test Description'}
        result = instance._extract_description(webpage)
        self.assertEqual(result, 'Test Description')

    def test_og_search_title(self):
        instance = NRKPlaylistIE()
        webpage = {'og:title': 'Test OG Title'}
        result = instance._NRKPlaylistIE__og_search_title(webpage, fatal=False)
        self.assertEqual(result, 'Test OG Title')

    def test_og_search_description(self):
        instance = NRKPlaylistIE()
        webpage = {'og:description': 'Test OG Description'}
        result = instance._NRKPlaylistIE__og_search_description(webpage)
        self.assertEqual(result, 'Test OG Description')

    def test_str_method(self):
        instance = NRKPlaylistIE()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = NRKPlaylistIE()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestNRKPlaylistBaseIE(unittest.TestCase):
    def test_init(self):
        instance = NRKPlaylistBaseIE()
        self.assertIsInstance(instance, NRKPlaylistBaseIE)

class TestInfoExtractor(unittest.TestCase):
    def test_init(self):
        instance = InfoExtractor()
        self.assertIsInstance(instance, InfoExtractor)

if __name__ == '__main__':
    unittest.main()