import unittest
from unittest.mock import patch
from youtube_dl.extractor.nrk import NRKTVSeriesIE, NRKTVSerieBaseI


class TestNRKTVSeriesIE(unittest.TestCase):
    def test_suitable(self):
        ie = NRKTVSeriesIE()
        self.assertFalse(ie.suitable('https://www.example.com'))

    @patch('youtube_dl.extractor.nrk.NRKTVSeriesIE._call_api')
    def test_real_extract(self, mock_call_api):
        ie = NRKTVSeriesIE()
        url = 'https://www.example.com'
        site, serie_kind, series_id = 'tv', 'serie', '123'
        series = {'titles': {'title': 'Test Serie', 'subtitle': 'Test Subtitle'}}
        mock_call_api.return_value = series
        result = ie._real_extract(url)
        self.assertEqual(result, {'entries': [], 'title': 'Test Serie', 'subtitle': 'Test Subtitle'})

    @patch('youtube_dl.extractor.nrk.NRKTVSeriesIE._entries')
    @patch('youtube_dl.extractor.nrk.NRKTVSeriesIE._call_api')
    def test_real_extract_entries(self, mock_call_api, mock_entries):
        ie = NRKTVSeriesIE()
        url = 'https://www.example.com'
        site, serie_kind, series_id = 'tv', 'serie', '123'
        series = {'titles': {'title': 'Test Serie', 'subtitle': 'Test Subtitle'}}
        mock_call_api.return_value = series
        mock_entries.return_value = [{'title': 'Test Entry'}]
        result = ie._real_extract(url)
        self.assertEqual(result, {'entries': [{'title': 'Test Entry'}], 'title': 'Test Serie', 'subtitle': 'Test Subtitle'})

    @patch('youtube_dl.extractor.nrk.NRKTVSeriesIE._call_api')
    def test_real_extract_linked_seasons(self, mock_call_api):
        ie = NRKTVSeriesIE()
        url = 'https://www.example.com'
        site, serie_kind, series_id = 'tv', 'serie', '123'
        series = {'_links': {'seasons': [{'href': 'https://www.example.com/season1'}]}}
        mock_call_api.return_value = series
        result = ie._real_extract(url)
        self.assertEqual(result, {'entries': [], 'title': '', 'subtitle': ''})

    @patch('youtube_dl.extractor.nrk.NRKTVSeriesIE._call_api')
    def test_real_extract_embedded_seasons(self, mock_call_api):
        ie = NRKTVSeriesIE()
        url = 'https://www.example.com'
        site, serie_kind, series_id = 'tv', 'serie', '123'
        series = {'_embedded': {'seasons': [{'title': 'Test Season'}]}}
        mock_call_api.return_value = series
        result = ie._real_extract(url)
        self.assertEqual(result, {'entries': [], 'title': '', 'subtitle': ''})

    @patch('youtube_dl.extractor.nrk.NRKTVSeriesIE._call_api')
    def test_real_extract_extra_material(self, mock_call_api):
        ie = NRKTVSeriesIE()
        url = 'https://www.example.com'
        site, serie_kind, series_id = 'tv', 'serie', '123'
        series = {'_embedded': {'extraMaterial': [{'title': 'Test Extra Material'}]}}
        mock_call_api.return_value = series
        result = ie._real_extract(url)
        self.assertEqual(result, {'entries': [], 'title': '', 'subtitle': ''})

if __name__ == '__main__':
    unittest.main()