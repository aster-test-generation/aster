import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodesIE, NRKPlaylistBaseExtracto


class TestNRKTVEpisodesIE(unittest.TestCase):
    def test_init(self):
        instance = NRKTVEpisodesIE()
        self.assertIsInstance(instance, NRKTVEpisodesIE)

    def test_extract_title(self):
        webpage = '<h1>Test Title</h1>'
        result = NRKTVEpisodesIE()._extract_title(webpage)
        self.assertEqual(result, 'Test Title')

    def test_html_search_regex(self):
        webpage = '<h1>Test Title</h1>'
        result = NRKTVEpisodesIE()._html_search_regex('<h1>([^<]+)</h1>', webpage, 'title', fatal=False)
        self.assertEqual(result, 'Test Title')

    def test__init__(self):
        instance = NRKTVEpisodesIE()
        self.assertIsNone(instance.__init__())

    def test__str__(self):
        instance = NRKTVEpisodesIE()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test__repr__(self):
        instance = NRKTVEpisodesIE()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test__eq__(self):
        instance1 = NRKTVEpisodesIE()
        instance2 = NRKTVEpisodesIE()
        self.assertTrue(instance1.__eq__(instance2))

class TestNRKPlaylistBaseIE(unittest.TestCase):
    def test_init(self):
        instance = NRKPlaylistBaseIE()
        self.assertIsInstance(instance, NRKPlaylistBaseIE)

    def test__init__(self):
        instance = NRKPlaylistBaseIE()
        self.assertIsNone(instance.__init__())

    def test__str__(self):
        instance = NRKPlaylistBaseIE()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test__repr__(self):
        instance = NRKPlaylistBaseIE()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test__eq__(self):
        instance1 = NRKPlaylistBaseIE()
        instance2 = NRKPlaylistBaseIE()
        self.assertTrue(instance1.__eq__(instance2))

if __name__ == '__main__':
    unittest.main()