import unittest
from unittest.mock import patch
from youtube_dl.extractor import nr


class TestNRKBaseIE(unittest.TestCase):
    def setUp(self):
        self.ie = NRKBaseIE()

    def test__extract_nrk_formats(self):
        asset_url = 'https://example.com/asset_url'
        video_id = 'video_id'
        formats = self.ie._extract_nrk_formats(asset_url, video_id)
        self.assertEqual(formats, [])

    @patch('youtube_dl.extractor.nrk.NRKBaseIE._extract_m3u8_formats')
    def test__extract_nrk_formats_m3u8_formats(self, mock_extract_m3u8_formats):
        asset_url = 'https://example.com/asset_url'
        video_id = 'video_id'
        mock_extract_m3u8_formats.return_value = ['format1', 'format2']
        formats = self.ie._extract_nrk_formats(asset_url, video_id)
        self.assertEqual(formats, ['format1', 'format2'])
        mock_extract_m3u8_formats.assert_called_once_with(asset_url, video_id, 'mp4', 'm3u8_native', fatal=False)

    @patch('youtube_dl.extractor.nrk.NRKBaseIE._extract_m3u8_formats')
    def test__extract_nrk_formats_m3u8_formats_fatal(self, mock_extract_m3u8_formats):
        asset_url = 'https://example.com/asset_url'
        video_id = 'video_id'
        mock_extract_m3u8_formats.return_value = []
        with self.assertRaises(ExtractorError):
            self.ie._extract_nrk_formats(asset_url, video_id)
        mock_extract_m3u8_formats.assert_called_once_with(asset_url, video_id, 'mp4', 'm3u8_native', fatal=True)

    def test__raise_error(self):
        data = {'messageType': 'ProgramRightsAreNotReady'}
        self.ie._raise_error(data)
        self.assertEqual(self.ie.IE_NAME, 'NRKBaseIE')
        self.assertEqual(self.ie._GEO_COUNTRIES, [])

    @patch('youtube_dl.extractor.nrk.NRKBaseIE.raise_geo_restricted')
    def test__raise_error_geo_restricted(self, mock_raise_geo_restricted):
        data = {'messageType': 'ProgramIsGeoBlocked'}
        self.ie._raise_error(data)
        mock_raise_geo_restricted.assert_called_once_with(msg='Ikke tilgjengelig', countries=self.ie._GEO_COUNTRIES)

    @patch('youtube_dl.extractor.nrk.NRKBaseIE._download_json')
    def test__call_api(self, mock_download_json):
        path = 'path'
        video_id = 'video_id'
        item = 'item'
        note = 'note'
        fatal = True
        query = {'query': 'query'}
        self.ie._call_api(path, video_id, item, note, fatal, query)
        mock_download_json.assert_called_once_with('http://psapi.nrk.no/' + path, video_id, note or 'Downloading ' + item + ' JSON', fatal=fatal, query=query, headers={'Accept-Encoding': 'gzip, deflate, br'})

if __name__ == '__main__':
    unittest.main()