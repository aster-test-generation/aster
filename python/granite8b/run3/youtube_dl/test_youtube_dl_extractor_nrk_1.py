import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodesIE


class TestNRKTVEpisodesIE(unittest.TestCase):
    def test_extract_title(self):
        webpage = '<html><head><title>NRK TV - Program Title</title></head><body><h1>Program Title</h1></body></html>'
        ie = NRKTVEpisodesIE()
        title = ie._extract_title(webpage)
        self.assertEqual(title, 'Program Title')

    def test_private_method(self):
        ie = NRKTVEpisodesIE()
        result = ie._extract_title('dummy')
        self.assertEqual(result, 'Program Title')

    def test_protected_method(self):
        ie = NRKTVEpisodesIE()
        result = ie._real_extract('dummy')
        self.assertEqual(result, {'id': '12345', 'title': 'Program Title'})

    def test_magic_method(self):
        ie = NRKTVEpisodesIE()
        result = str(ie)
        self.assertEqual(result, 'NRKTVEpisodesIE')

    def test_magic_method(self):
        ie = NRKTVEpisodesIE()
        result = repr(ie)
        self.assertEqual(result, 'NRKTVEpisodesIE(dummy)')

if __name__ == '__main__':
    unittest.main()