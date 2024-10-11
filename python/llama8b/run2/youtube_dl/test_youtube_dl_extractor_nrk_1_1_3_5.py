import unittest
from youtube_dl.extractor.nrk import NRKTVSeriesIE, NRKTVSerieBaseI
from youtube_dl.utils import ExtractorError


class TestNRKTVSeriesIE(unittest.TestCase):
    def test_suitable(self):
        ie = NRKTVSeriesIE()
        self.assertFalse(ie.suitable('https://www.nrk.no/serie/12345'))
        self.assertFalse(ie.suitable('https://www.nrk.no/episode/12345'))
        self.assertFalse(ie.suitable('https://www.nrk.no/radio/podcast/12345'))

    def test_real_extract(self):
        ie = NRKTVSeriesIE()
        url = 'https://www.nrk.no/serie/12345'
        series = {'titles': {'title': 'Test Serie', 'subtitle': 'Test Subtitle'}}
        series_id = '12345'
        site = 'tv'
        serie_kind = 'serie'
        is_radio = False
        domain = 'tv'
        size_prefix = 'embeddedInstalmentsP'
        query = {'p_ageSize': 50}
        self.assertEqual(ie._real_extract(url), self.playlist_result([
            {'id': '12345', 'title': 'Test Serie', 'subtitle': 'Test Subtitle'}
        ], series_id, series['titles']['title'], series['titles']['subtitle']))

    def test_entries(self):
        ie = NRKTVSeriesIE()
        series = {'_embedded': {'seasons': [{'href': 'https://www.nrk.no/serie/12345/sesong/1'}]}}
        series_id = '12345'
        self.assertEqual(ie._entries(series, series_id), [
            {'url': 'https://www.nrk.no/serie/12345/sesong/1', 'video_title': 'Season 1'}
        ])

    def test_playlist_result(self):
        ie = NRKTVSeriesIE()
        entries = [{'id': '12345', 'title': 'Test Serie', 'subtitle': 'Test Subtitle'}]
        series_id = '12345'
        title = 'Test Serie'
        subtitle = 'Test Subtitle'
        self.assertEqual(ie.playlist_result(entries, series_id, title, subtitle), {
            'id': '12345',
            'title': 'Test Serie',
            'subtitle': 'Test Subtitle',
            'entries': [
                {'id': '12345', 'title': 'Test Serie', 'subtitle': 'Test Subtitle'}
            ]
        })

class TestNRKTVSerieBaseIE(unittest.TestCase):
    def test_suitable(self):
        ie = NRKTVSerieBaseIE()
        self.assertFalse(ie.suitable('https://www.nrk.no/serie/12345'))
        self.assertFalse(ie.suitable('https://www.nrk.no/episode/12345'))
        self.assertFalse(ie.suitable('https://www.nrk.no/radio/podcast/12345'))

if __name__ == '__main__':
    unittest.main()