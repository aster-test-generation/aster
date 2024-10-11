import unittest
from unittest.mock import patch, Mock
from youtube_dl.extractor.nrk import NRKTVSeriesIE, NRKTVSerieBaseI


class TestNRKTVSeriesIE(unittest.TestCase):
    def setUp(self):
        self.ie = NRKTVSeriesIE()

    def test_suitable(self):
        url = 'https://www.nrk.no/serie/123456'
        self.assertFalse(self.ie.suitable(url))

    def test_real_extract(self):
        url = 'https://www.nrk.no/serie/123456'
        series_id = '123456'
        site = 'tv'
        serie_kind = 'serie'
        series = {'titles': {'title': 'Test Serie', 'subtitle': 'Test Subtitle'}}
        with patch.object(self.ie, '_call_api', return_value=series):
            with patch.object(self.ie, '_entries', return_value=[]):
                result = self.ie._real_extract(url)
                self.assertEqual(result['entries'], [])
                self.assertEqual(result['title'], 'Test Serie')
                self.assertEqual(result['subtitle'], 'Test Subtitle')

    def test_call_api(self):
        url = 'https://www.nrk.no/api/serie/123456'
        with patch('requests.get') as mock_get:
            mock_response = Mock()
            mock_response.json.return_value = {'titles': {'title': 'Test Serie', 'subtitle': 'Test Subtitle'}}
            mock_get.return_value = mock_response
            result = self.ie._call_api(url)
            self.assertEqual(result, {'titles': {'title': 'Test Serie', 'subtitle': 'Test Subtitle'}})

    def test_entries(self):
        series = {'titles': {'title': 'Test Serie', 'subtitle': 'Test Subtitle'}, '_embedded': {'seasons': [{'href': 'https://www.nrk.no/serie/123456/sesong/1'}]}}
        with patch.object(self.ie, '_real_extract', return_value={'entries': []}):
            result = self.ie._entries(series, '123456')
            self.assertEqual(result, [])

    def test_playlist_result(self):
        entries = [{'title': 'Test Entry'}]
        result = self.ie.playlist_result(entries, '123456', 'Test Serie', 'Test Subtitle')
        self.assertEqual(result, {'entries': entries, 'title': 'Test Serie', 'subtitle': 'Test Subtitle'})

if __name__ == '__main__':
    unittest.main()