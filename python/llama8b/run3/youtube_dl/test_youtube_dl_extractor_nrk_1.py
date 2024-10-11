import unittest
from youtube_dl.extractor.nrk import NRKTVEpisodesIE, NRKPlaylistBaseI


class TestNRKTVEpisodesIE(unittest.TestCase):
    def test_init(self):
        ie = NRKTVEpisodesIE()
        self.assertEqual(ie.__class__, NRKTVEpisodesIE)

    def test_extract_title(self):
        ie = NRKTVEpisodesIE()
        webpage = '<h1>Test Title</h1>'
        title = ie._extract_title(webpage)
        self.assertEqual(title, 'Test Title')

    def test_extract_title_fatal(self):
        ie = NRKTVEpisodesIE()
        webpage = ''
        with self.assertRaises(ExtractorError):
            ie._extract_title(webpage)

    def test_html_search_regex(self):
        ie = NRKTVEpisodesIE()
        webpage = '<h1>Test Title</h1>'
        pattern = '<h1>([^<]+)</h1>'
        title = ie._html_search_regex(pattern, webpage, 'title', fatal=False)
        self.assertEqual(title, 'Test Title')

    def test_html_search_regex_fatal(self):
        ie = NRKTVEpisodesIE()
        webpage = ''
        pattern = '<h1>([^<]+)</h1>'
        with self.assertRaises(ExtractorError):
            ie._html_search_regex(pattern, webpage, 'title', fatal=True)

if __name__ == '__main__':
    unittest.main()