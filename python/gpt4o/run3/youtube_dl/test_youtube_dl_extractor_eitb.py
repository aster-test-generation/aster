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

    def test_sort_formats(self):
        formats = [
            {'format_id': 'http-1000', 'tbr': 1000},
            {'format_id': 'http-500', 'tbr': 500},
        ]
        formats = [{'url': 'http://example.com/video.mp4'}]
        self.assertEqual(formats[0]['tbr'], 500)
        self.assertEqual(formats[1]['tbr'], 1000)

    def test_float_or_none(self):
        self.assertEqual(float_or_none('123.45'), 123.45)
        self.assertEqual(float_or_none(None), None)

    def test_int_or_none(self):
        self.assertEqual(int_or_none('123'), 123)
        self.assertEqual(int_or_none(None), None)

    def test_parse_iso8601(self):
        self.assertEqual(parse_iso8601('2013-10-14T00:00:00Z'), 1381789200)
        self.assertEqual(parse_iso8601(None), None)

    def test_sanitized_Request(self):
        request = sanitized_Request('http://example.com', headers={'Referer': 'http://example.com'})
        self.assertEqual(request.get_full_url(), 'http://example.com')
        self.assertEqual(request.headers['Referer'], 'http://example.com')

if __name__ == '__main__':
    unittest.main()