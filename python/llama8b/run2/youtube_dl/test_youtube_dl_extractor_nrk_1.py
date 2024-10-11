import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodesIE, NRKPlaylistBaseI


class TestNRKTVEpisodesIE(unittest.TestCase):
    def test_init(self):
        ie = NRKTVEpisodesIE()
        self.assertEqual(ie.__class__, NRKTVEpisodesIE)

    def test__extract_title(self):
        ie = NRKTVEpisodesIE()
        webpage = '<h1>Test Title</h1>'
        title = ie._extract_title(webpage)
        self.assertEqual(title, 'Test Title')

    def test__html_search_regex(self):
        ie = NRKTVEpisodesIE()
        webpage = '<h1>Test Title</h1>'
        pattern = '<h1>([^<]+)</h1>'
        title = ie._html_search_regex(pattern, webpage, 'title', fatal=False)
        self.assertEqual(title, 'Test Title')

    def test__init__(self):
        ie = NRKTVEpisodesIE()
        self.assertEqual(ie.__class__, NRKTVEpisodesIE)

    def test__str__(self):
        ie = NRKTVEpisodesIE()
        result = str(ie)
        self.assertEqual(result, 'NRKTVEpisodesIE')

    def test__repr__(self):
        ie = NRKTVEpisodesIE()
        result = repr(ie)
        self.assertEqual(result, 'NRKTVEpisodesIE()')

if __name__ == '__main__':
    unittest.main()