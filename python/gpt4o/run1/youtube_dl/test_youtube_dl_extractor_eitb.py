import unittest
from youtube_dl.extractor.eitb import EitbIE
from youtube_dl.utils import float_or_none, int_or_none, parse_iso8601, sanitized_Request


class TestEitbIE(unittest.TestCase):
    def setUp(self):
        self.extractor = EitbIE()

    def test_real_extract(self):
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        result = self.extractor._real_extract(url).to_screen()
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
        result = self.extractor._download_json(url, video_id, 'Downloading video JSON', fatal=False)
        self.assertIn('web_media', result)

    def test_sort_formats(self):
        formats = [
            {'format_id': 'http-1000', 'tbr': 1000},
            {'format_id': 'http-500', 'tbr': 500},
        ]
        self.extractor._sort_formats([{'url': 'http://example.com'}])
        self.assertEqual(formats[0]['tbr'], 500)
        self.assertEqual(formats[1]['tbr'], 1000)

    def test_extract_m3u8_formats(self):
        url = 'http://example.com/playlist.m3u8'
        video_id = '4090227752001'
        formats = self.extractor._extract_m3u8_formats(url, video_id, m3u8_id='hls', fatal=False, live=False)
        self.assertIsInstance(formats, list)

    def test_extract_f4m_formats(self):
        url = 'http://example.com/manifest.f4m'
        video_id = '4090227752001'
        formats = self.extractor._extract_f4m_formats(url, video_id, f4m_id='hds', fatal=True)
        self.assertIsInstance(formats, list)

    def test_float_or_none(self):
        result = float_or_none('123.45', 1000)
        self.assertEqual(result, 0.12345)

    def test_int_or_none(self):
        result = int_or_none('123')
        self.assertEqual(result, 123)

    def test_parse_iso8601(self):
        result = parse_iso8601('2013-10-14 00:00:00', ' ')
        self.assertEqual(result, 1381708800)

    def test_sanitized_Request(self):
        url = 'http://example.com'
        request = sanitized_Request(url)
        self.assertEqual(request.get_full_url(), url)

if __name__ == '__main__':
    unittest.main()