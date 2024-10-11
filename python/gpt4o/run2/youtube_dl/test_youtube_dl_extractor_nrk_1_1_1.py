import unittest
from youtube_dl.extractor.nrk import NRKIE
from youtube_dl.utils import ExtractorError


class TestNRKBaseIE(unittest.TestCase):
    def setUp(self):
        self.instance = NRKBaseIE()

    def test_init(self):
        self.assertIsInstance(self.instance, NRKBaseIE)

    def test_extract_nrk_formats_akamai(self):
        asset_url = 'https://example.akamaihd.net/i/video.mp4/master.m3u8'
        video_id = '12345'
        self.instance._extract_akamai_formats = lambda x, y: [{'format_id': 'akamai'}]
        result = self.instance._extract_nrk_formats(asset_url, video_id)
        self.assertEqual(result, [{'format_id': 'akamai'}])

    def test_extract_nrk_formats_m3u8(self):
        asset_url = 'https://example.com/video.mp4/master.m3u8'
        video_id = '12345'
        self.instance._extract_m3u8_formats = lambda x, y, z, a, fatal: [{'format_id': 'm3u8'}]
        result = self.instance._extract_nrk_formats(asset_url, video_id)
        self.assertEqual(result, [{'format_id': 'm3u8'}])

    def test_raise_error_geo_blocked(self):
        data = {'messageType': 'IsGeoBlocked'}
        self.instance._GEO_COUNTRIES = ['NO']
        with self.assertRaises(ExtractorError) as cm:
            self.instance._raise_error(data)
        self.assertIn('NRK has not rights to show this program outside Norway', str(cm.exception))

    def test_raise_error_program_rights_expired(self):
        data = {'messageType': 'ProgramRightsHasExpired'}
        with self.assertRaises(ExtractorError) as cm:
            self.instance._raise_error(data)
        self.assertIn('Programmet har gått ut', str(cm.exception))

    def test_call_api(self):
        path = 'path/to/resource'
        video_id = '12345'
        self.instance._download_json = lambda url, video_id, note, fatal, query, headers: {'key': 'value'}
        result = self.instance._call_api(path, video_id)
        self.assertEqual(result, {'key': 'value'})

if __name__ == '__main__':
    unittest.main()