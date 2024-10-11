import unittest
from youtube_dl.extractor.nrk import NRKIE
from unittest.mock import patch, MagicMock


class TestNRKTVEpisodeIE(unittest.TestCase):
    def setUp(self):
        self.instance = NRKTVEpisodeIE()

    def test_init(self):
        self.assertIsInstance(self.instance, NRKTVEpisodeIE)

    @patch('youtube_dl.extractor.nrk.NRKTVEpisodeIE._download_webpage')
    @patch('youtube_dl.extractor.nrk.NRKTVEpisodeIE._search_json_ld')
    @patch('youtube_dl.extractor.nrk.NRKTVEpisodeIE._html_search_meta')
    @patch('youtube_dl.extractor.nrk.NRKTVEpisodeIE._search_regex')
    def test_real_extract(self, mock_search_regex, mock_html_search_meta, mock_search_json_ld, mock_download_webpage):
        url = 'https://example.com/season/1/episode/2'
        display_id = 'example_display_id'
        season_number = '1'
        episode_number = '2'
        webpage = '<html></html>'
        info = {'@id': 'example_id'}
        nrk_id = 'example_nrk_id'

        mock_download_webpage.return_value = webpage
        mock_search_json_ld.return_value = info
        mock_html_search_meta.return_value = None
        mock_search_regex.return_value = nrk_id

        with patch('re.match', return_value=MagicMock(groups=lambda: (display_id, season_number, episode_number))):
            result = self.instance._real_extract(url)

        self.assertEqual(result['id'], nrk_id)
        self.assertEqual(result['url'], 'nrk:%s' % nrk_id)
        self.assertEqual(result['season_number'], int(season_number))
        self.assertEqual(result['episode_number'], int(episode_number))

    @patch('re.match')
    def test_real_extract_invalid_url(self, mock_re_match):
        url = 'https://example.com/invalid'
        mock_re_match.return_value = None

        with self.assertRaises(AttributeError):
            self.instance._real_extract(url)

if __name__ == '__main__':
    unittest.main()