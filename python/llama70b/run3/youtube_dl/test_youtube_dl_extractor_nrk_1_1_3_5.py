import unittest
from youtube_dl.extractor.nrk import NRKTVSeriesIE, NRKTVBaseIE, NRKTVIE, NRKTVEpisodeIE, NRKRadioPodkastIE, NRKTVSeasonI


class TestNRKTVSeriesIE(unittest.TestCase):
    def test_init(self):
        instance = NRKTVSeriesIE()
        self.assertIsInstance(instance, NRKTVSeriesIE)

    def test_suitable(self):
        url = 'https://example.com'
        result = NRKTVSeriesIE.suitable(url)
        self.assertFalse(result)

    def test_real_extract(self):
        url = 'https://example.com'
        instance = NRKTVSeriesIE()
        with self.assertRaises(ExtractorError):
            instance._real_extract(url)

    def test__call_api(self):
        instance = NRKTVSeriesIE()
        url = 'https://example.com'
        series_id = '123'
        result = instance._call_api(url, series_id, 'serie', query={'pageSize': 50})
        self.assertIsNone(result)

    def test__entries(self):
        instance = NRKTVSeriesIE()
        series = {'id': '123'}
        series_id = '123'
        result = instance._entries(series, series_id)
        self.assertEqual(result, [])

    def test__catalog_name(self):
        instance = NRKTVSeriesIE()
        serie_kind = 'serie'
        result = instance._catalog_name(serie_kind)
        self.assertEqual(result, 'serie')

    def test_url_result(self):
        instance = NRKTVSeriesIE()
        url = 'https://example.com'
        ie_key = 'NRKTVSeasonIE'
        video_title = 'Test Title'
        result = instance.url_result(url, ie=ie_key, video_title=video_title)
        self.assertEqual(result['url'], url)

    def test_playlist_result(self):
        instance = NRKTVSeriesIE()
        entries = [{'id': '123'}]
        series_id = '123'
        title = 'Test Title'
        subtitle = 'Test Subtitle'
        result = instance.playlist_result(entries, series_id, title, subtitle)
        self.assertEqual(result['id'], series_id)

    def test__str__(self):
        instance = NRKTVSeriesIE()
        result = instance.__str__()
        self.assertEqual(result, 'NRKTVSeriesIE')

    def test__repr__(self):
        instance = NRKTVSeriesIE()
        result = instance.__repr__()
        self.assertEqual(result, 'NRKTVSeriesIE()')

class TestNRKTVSerieBaseIE(unittest.TestCase):
    def test_init(self):
        instance = NRKTVSerieBaseIE()
        self.assertIsInstance(instance, NRKTVSerieBaseIE)

    def test_suitable(self):
        url = 'https://example.com'
        result = NRKTVSerieBaseIE.suitable(url)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()