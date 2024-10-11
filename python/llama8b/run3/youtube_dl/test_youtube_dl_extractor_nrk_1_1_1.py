import unittest
from unittest.mock import patch
from youtube_dl.extractor import NRKBaseIE, ExtractorErro


class TestNRKBaseIE(unittest.TestCase):
    def test_init(self):
        ie = NRKBaseIE()
        self.assertEqual(ie.IE_NAME, 'NRKBaseIE')

    @patch('youtube_dl.extractor.nrk.NRKBaseIE._extract_m3u8_formats')
    def test_extract_nrk_formats(self, mock_extract_m3u8_formats):
        ie = NRKBaseIE()
        asset_url = 'https://example.com/asset_url'
        video_id = 'video_id'
        formats = ie._extract_nrk_formats(asset_url, video_id)
        mock_extract_m3u8_formats.assert_called_once_with(asset_url, video_id, 'mp4', 'm3u8_native', fatal=False)

    @patch('youtube_dl.extractor.nrk.NRKBaseIE._extract_m3u8_formats')
    def test_extract_nrk_formats_akamai(self, mock_extract_m3u8_formats):
        ie = NRKBaseIE()
        asset_url = 'https://akamaihd.net/i/asset_url'
        video_id = 'video_id'
        formats = ie._extract_nrk_formats(asset_url, video_id)
        mock_extract_m3u8_formats.assert_called_once_with(asset_url, video_id, 'mp4', 'm3u8_native', fatal=False)

    @patch('youtube_dl.extractor.nrk.NRKBaseIE._extract_m3u8_formats')
    def test_extract_nrk_formats_cdn_repl_regex(self, mock_extract_m3u8_formats):
        ie = NRKBaseIE()
        asset_url = 'https://example.com/asset_url'
        video_id = 'video_id'
        formats = ie._extract_nrk_formats(asset_url, video_id)
        mock_extract_m3u8_formats.assert_called_once_with(re.sub(ie._CDN_REPL_REGEX, '://nrk-od-%02d.akamaized.net/no/' % random.randint(0, 99), asset_url), video_id, 'mp4', 'm3u8_native', fatal=False)

    @patch('youtube_dl.extractor.nrk.NRKBaseIE._raise_error')
    def test_raise_error(self, mock_raise_error):
        ie = NRKBaseIE()
        data = {'messageType': 'ProgramIsGeoBlocked'}
        ie._raise_error(data)
        mock_raise_error.assert_called_once_with(data)

    @patch('youtube_dl.extractor.nrk.NRKBaseIE._download_json')
    def test_call_api(self, mock_download_json):
        ie = NRKBaseIE()
        path = 'path'
        video_id = 'video_id'
        item = 'item'
        note = 'note'
        fatal = True
        query = 'query'
        ie._call_api(path, video_id, item, note, fatal, query)
        mock_download_json.assert_called_once_with(urljoin('http://psapi.nrk.no/', path), video_id, note or 'Downloading %s JSON' % item, fatal=fatal, query=query, headers={'Accept-Encoding': 'gzip, deflate, br'})

if __name__ == '__main__':
    unittest.main()