import unittest
from unittest.mock import patch
from youtube_dl.extractor import nr


class TestNRKTVEpisodeIE(unittest.TestCase):
    def setUp(self):
        self.ie = NRKTVEpisodeIE()

    def test_init(self):
        self.assertEqual(self.ie.__init__(), None)

    def test_real_extract(self):
        with patch('youtube_dl.extractor.nrk.NRKTVEpisodeIE._download_webpage') as mock_download_webpage:
            mock_download_webpage.return_value = 'webpage content'
            info = self.ie._real_extract('https://example.com/episode')
            self.assertEqual(info, {'_type': 'url', 'id': 'nrk id', 'url': 'nrk:nrk id', 'ie_key': 'NRKIE.ie_key()', 'season_number': 1, 'episode_number': 1})

    def test_search_json_ld(self):
        webpage = 'webpage content'
        info = self.ie._search_json_ld(webpage, 'display_id', default={})
        self.assertEqual(info, {})

    def test_html_search_meta(self):
        webpage = 'webpage content'
        nrk_id = self.ie._html_search_meta('nrk:program-id', webpage, default=None)
        self.assertEqual(nrk_id, None)

    def test_search_regex(self):
        webpage = 'webpage content'
        nrk_id = self.ie._search_regex('data-program-id=["\\\'](%s)' % NRKTVIE._EPISODE_RE, webpage, 'nrk id')
        self.assertEqual(nrk_id, 'nrk id')

    def test__init__(self):
        self.ie.__init__()
        self.assertEqual(self.ie.__init__(), None)

    def test__str__(self):
        self.assertEqual(str(self.ie), 'NRKTVEpisodeIE')

    def test__repr__(self):
        self.assertEqual(repr(self.ie), 'NRKTVEpisodeIE()')

    def test__eq__(self):
        ie2 = NRKTVEpisodeIE()
        self.assertEqual(self.ie, ie2)

    def test__real_extract_with_extractor_error(self):
        with patch('youtube_dl.extractor.nrk.NRKTVEpisodeIE._download_webpage') as mock_download_webpage:
            mock_download_webpage.side_effect = ExtractorError('Extractor error')
            with self.assertRaises(ExtractorError):
                self.ie._real_extract('https://example.com/episode')

if __name__ == '__main__':
    unittest.main()