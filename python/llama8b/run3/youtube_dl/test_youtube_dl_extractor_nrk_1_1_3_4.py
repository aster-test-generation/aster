import unittest
from unittest.mock import patch
from youtube_dl.extractor.nrk import NRKTVSeasonIE, NRKTVSerieBaseI


class TestNRKTVSeasonIE(unittest.TestCase):
    @patch('youtube_dl.extractor.nrk.NRKTVSerieBaseIE.suitable')
    def test_suitable(self, mock_suitable):
        nrk_tv_season_ie = NRKTVSeasonIE()
        mock_suitable.return_value = False
        self.assertFalse(nrk_tv_season_ie.suitable('url'))

    @patch('youtube_dl.extractor.nrk.NRKTVSerieBaseIE.suitable')
    def test_suitable_true(self, mock_suitable):
        nrk_tv_season_ie = NRKTVSeasonIE()
        mock_suitable.return_value = True
        self.assertTrue(nrk_tv_season_ie.suitable('url'))

    @patch('youtube_dl.extractor.nrk.re')
    @patch('youtube_dl.extractor.nrk.NRKTVSerieBaseIE._call_api')
    def test_real_extract(self, mock_call_api, mock_re):
        nrk_tv_season_ie = NRKTVSeasonIE()
        mobj = re.compile('example').match('example')
        mock_re.match.return_value = mobj
        data = {'titles': {'title': 'title'}}
        mock_call_api.return_value = data
        result = nrk_tv_season_ie._real_extract('example')
        self.assertEqual(result, {'title': 'title'})

    @patch('youtube_dl.extractor.nrk.NRKTVSerieBaseIE._call_api')
    def test_real_extract_call_api(self, mock_call_api):
        nrk_tv_season_ie = NRKTVSeasonIE()
        data = {'titles': {'title': 'title'}}
        mock_call_api.return_value = data
        result = nrk_tv_season_ie._real_extract('example')
        self.assertEqual(result, {'title': 'title'})

    @patch('youtube_dl.extractor.nrk.NRKTVSerieBaseIE._entries')
    @patch('youtube_dl.extractor.nrk.NRKTVSerieBaseIE._call_api')
    def test_playlist_result(self, mock_call_api, mock_entries):
        nrk_tv_season_ie = NRKTVSeasonIE()
        data = {'titles': {'title': 'title'}}
        mock_call_api.return_value = data
        entries = [{'title': 'entry'}]
        mock_entries.return_value = entries
        result = nrk_tv_season_ie.playlist_result(entries, 'display_id', 'title')
        self.assertEqual(result, {'entries': entries, 'display_id': 'display_id', 'title': 'title'})

if __name__ == '__main__':
    unittest.main()