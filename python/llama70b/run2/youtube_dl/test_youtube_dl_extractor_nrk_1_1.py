import unittest
from youtube_dl.extractor.nrk import NRKPlaylistBaseI


class TestNRKPlaylistIE(unittest.TestCase):
    def test___init__(self):
        instance = nrk.NRKPlaylistIE()
        self.assertIsInstance(instance, nrk.NRKPlaylistIE)

    def test__extract_title(self):
        instance = nrk.NRKPlaylistIE()
        webpage = '<html><title>Test Title</title></html>'
        result = instance._extract_title(webpage)
        self.assertEqual(result, 'Test Title')

    def test__extract_description(self):
        instance = nrk.NRKPlaylistIE()
        webpage = '<html><meta property="og:description" content="Test Description"></html>'
        result = instance._extract_description(webpage)
        self.assertEqual(result, 'Test Description')

    def test__og_search_title(self):
        instance = nrk.NRKPlaylistIE()
        webpage = '<html><meta property="og:title" content="Test Title"></html>'
        result = instance._NRKPlaylistIE__og_search_title(webpage, fatal=False)
        self.assertEqual(result, 'Test Title')

    def test__og_search_description(self):
        instance = nrk.NRKPlaylistIE()
        webpage = '<html><meta property="og:description" content="Test Description"></html>'
        result = instance._NRKPlaylistIE__og_search_description(webpage)
        self.assertEqual(result, 'Test Description')

    def test___str__(self):
        instance = nrk.NRKPlaylistIE()
        result = instance.__str__()
        self.assertEqual(result, 'NRKPlaylistIE')

    def test___repr__(self):
        instance = nrk.NRKPlaylistIE()
        result = instance.__repr__()
        self.assertEqual(result, 'NRKPlaylistIE()')

if __name__ == '__main__':
    unittest.main()