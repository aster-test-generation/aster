import unittest
from youtube_dl.extractor.eitb import EitbIE
from youtube_dl.utils import float_or_none, int_or_none, parse_iso8601, sanitized_Request
from unittest.mock import patch, MagicMock


class TestEitbIE(unittest.TestCase):
    def setUp(self):
        self.extractor = EitbIE()

    def test_real_extract(self):
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        result = self.extractor._real_extract(url)
        self.assertEqual(result['id'], '4090227752001')
        self.assertEqual(result['title'], '60 minutos (Lasa y Zabala, 30 años)')
        self.assertEqual(result['description'], 'Programa de reportajes de actualidad.')
        self.assertEqual(result['duration'], 3996.76)
        self.assertEqual(result['timestamp'], 1381789200)
        self.assertEqual(result['upload_date'], '20131014')
        self.assertIsInstance(result['tags'], list)

    def test_match_id(self):
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        video_id = self.extractor._match_id(url)
        self.assertEqual(video_id, '4090227752001')

    def test_download_json(self):
        url = 'http://mam.eitb.eus/mam/REST/ServiceMultiweb/Video/MULTIWEBTV/4090227752001/'
        video_id = '4090227752001'
        result = self.extractor._download_json(url, video_id, 'Downloading video JSON')
        self.assertIn('web_media', result)

    def test_sort_formats(self):
        formats = [
            {'format_id': 'http-1000', 'tbr': 1000},
            {'format_id': 'http-500', 'tbr': 500},
        ]
        self.extractor._sort_formats(formats)
        self.assertEqual(formats[0]['tbr'], 500)
        self.assertEqual(formats[1]['tbr'], 1000)

    def test_extract_m3u8_formats(self):
        hls_url = 'http://example.com/playlist.m3u8'
        video_id = '4090227752001'
        formats = self.extractor._extract_m3u8_formats(hls_url, video_id, m3u8_id='hls', fatal=False)
        self.assertIsInstance(formats, list)

    def test_extract_f4m_formats(self):
        hds_url = 'http://example.com/manifest.f4m'
        video_id = '4090227752001'
        formats = self.extractor._extract_f4m_formats(hds_url, video_id, f4m_id='hds', fatal=False)
        self.assertIsInstance(formats, list)

    def test_float_or_none(self):
        result = float_or_none('123.45', 1000)
        self.assertEqual(result, 123.45)

    def test_int_or_none(self):
        result = int_or_none('123')
        self.assertEqual(result, 123)

    def test_parse_iso8601(self):
        result = parse_iso8601('2013-10-14 00:00:00', ' ')
        self.assertEqual(result, 1381789200)

    def test_sanitized_Request(self):
        url = 'http://example.com'
        request = sanitized_Request(url)
        self.assertEqual(request.get_full_url(), url)

class TestEitbIE(unittest.TestCase):
    def setUp(self):
        self.extractor = EitbIE()

    def test_real_extract(self):
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        video_id = '4090227752001'
        video_json = {
            'web_media': [{
                'RENDITIONS': [
                    {'PMD_URL': 'http://example.com/video.mp4', 'ENCODING_RATE': '1000', 'FRAME_WIDTH': '1280', 'FRAME_HEIGHT': '720'},
                    {'PMD_URL': 'http://example.com/video2.mp4', 'ENCODING_RATE': '500', 'FRAME_WIDTH': '640', 'FRAME_HEIGHT': '360'}
                ],
                'HLS_SURL': 'http://example.com/hls.m3u8',
                'HDS_SURL': 'http://example.com/hds.f4m',
                'NAME_ES': 'Test Video',
                'SHORT_DESC_ES': 'Test Description',
                'STILL_URL': 'http://example.com/thumbnail.jpg',
                'LENGTH': '3996.76',
                'BROADCST_DATE': '2013-10-14 00:00:00',
                'TAGS': ['tag1', 'tag2']
            }],
            'desc_group': 'Test Group Description'
        }
        token_json = {'token': 'test_token'}

        with patch.object(self.extractor, '_download_json', side_effect=[video_json, token_json]) as mock_download_json, \
             patch.object(self.extractor, '_sort_formats') as mock_sort_formats, \
             patch.object(self.extractor, '_extract_m3u8_formats', return_value=[]) as mock_extract_m3u8_formats, \
             patch.object(self.extractor, '_extract_f4m_formats', return_value=[]) as mock_extract_f4m_formats:

            result = self.extractor._real_extract(url)

            self.assertEqual(result['id'], video_id)
            self.assertEqual(result['title'], 'Test Video')
            self.assertEqual(result['description'], 'Test Description')
            self.assertEqual(result['thumbnail'], 'http://example.com/thumbnail.jpg')
            self.assertEqual(result['duration'], 3996.76)
            self.assertEqual(result['timestamp'], parse_iso8601('2013-10-14 00:00:00', ' '))
            self.assertEqual(result['tags'], ['tag1', 'tag2'])

            mock_download_json.assert_any_call(
                'http://mam.eitb.eus/mam/REST/ServiceMultiweb/Video/MULTIWEBTV/%s/' % video_id,
                video_id, 'Downloading video JSON'
            )
            mock_download_json.assert_any_call(
                sanitized_Request(
                    'http://mam.eitb.eus/mam/REST/ServiceMultiweb/DomainRestrictedSecurity/TokenAuth/',
                    headers={'Referer': url}
                ), video_id, 'Downloading auth token', fatal=False
            )
            mock_sort_formats.assert_called_once()
            mock_extract_m3u8_formats.assert_called_once_with(
                'http://example.com/hls.m3u8?hdnts=test_token', video_id, m3u8_id='hls', fatal=False
            )
            mock_extract_f4m_formats.assert_called_once_with(
                'http://example.com/hds.f4m?hdcore=3.7.0', video_id, f4m_id='hds', fatal=False
            )

    def test_private_methods(self):
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        video_id = '4090227752001'
        self.assertEqual(self.extractor._match_id(url), video_id)

    def test_protected_methods(self):
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        video_id = '4090227752001'
        video_json = {
            'web_media': [{
                'RENDITIONS': [
                    {'PMD_URL': 'http://example.com/video.mp4', 'ENCODING_RATE': '1000', 'FRAME_WIDTH': '1280', 'FRAME_HEIGHT': '720'},
                    {'PMD_URL': 'http://example.com/video2.mp4', 'ENCODING_RATE': '500', 'FRAME_WIDTH': '640', 'FRAME_HEIGHT': '360'}
                ],
                'HLS_SURL': 'http://example.com/hls.m3u8',
                'HDS_SURL': 'http://example.com/hds.f4m',
                'NAME_ES': 'Test Video',
                'SHORT_DESC_ES': 'Test Description',
                'STILL_URL': 'http://example.com/thumbnail.jpg',
                'LENGTH': '3996.76',
                'BROADCST_DATE': '2013-10-14 00:00:00',
                'TAGS': ['tag1', 'tag2']
            }],
            'desc_group': 'Test Group Description'
        }
        with patch.object(self.extractor, '_download_json', return_value=video_json):
            result = self.extractor._real_extract(url)
            self.assertEqual(result['id'], video_id)

if __name__ == '__main__':
    unittest.main()