import unittest
from youtube_dl.extractor.nrk import NRKPlaylistBaseI


class TestNRKTVEpisodesIE(unittest.TestCase):
    def test_init(self):
        instance = nrk.NRKTVEpisodesIE()
        self.assertIsInstance(instance, nrk.NRKPlaylistBaseIE)

    def test_extract_title(self):
        webpage = '<h1>Test Title</h1>'
        instance = nrk.NRKTVEpisodesIE()
        result = instance._extract_title(webpage)
        self.assertEqual(result, 'Test Title')

    def test_html_search_regex(self):
        webpage = '<h1>Test Title</h1>'
        instance = nrk.NRKTVEpisodesIE()
        result = instance._NRKTVEpisodesIE__html_search_regex('<h1>([^<]+)</h1>', webpage, 'title', fatal=False)
        self.assertEqual(result, 'Test Title')

    def test_str_method(self):
        instance = nrk.NRKTVEpisodesIE()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = nrk.NRKTVEpisodesIE()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = nrk.NRKTVEpisodesIE()
        instance2 = nrk.NRKTVEpisodesIE()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()