import unittest
from youtube_dl.extractor.eitb import EitbIE


class TestEitbIE(unittest.TestCase):
    def test_init(self):
        ie = EitbIE()
        self.assertEqual(ie.IE_NAME, 'eitb.tv')

    def test_valid_url(self):
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        self.assertTrue(EitbIE._VALID_URL.match(url))

    def test_invalid_url(self):
        url = 'http://example.com'
        self.assertFalse(EitbIE._VALID_URL.match(url))

    def test_real_extract(self):
        ie = EitbIE()
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        video_id = '4090227752001'
        video = ie._download_json(
            'http://mam.eitb.eus/mam/REST/ServiceMultiweb/Video/MULTIWEBTV/%s/' % video_id,
            video_id, 'Downloading video JSON')
        self.assertEqual(video['web_media'][0]['NAME_ES'], '60 minutos (Lasa y Zabala, 30 años)')

    def test_formats(self):
        ie = EitbIE()
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        video_id = '4090227752001'
        formats = ie._real_extract(url)
        self.assertEqual(len(formats), 3)

    def test_sort_formats(self):
        ie = EitbIE()
        formats = [
            {'url': 'http://example.com/1', 'format_id': '1'},
            {'url': 'http://example.com/2', 'format_id': '2'},
            {'url': 'http://example.com/3', 'format_id': '3'}
        ]
        ie._sort_formats(formats)
        self.assertEqual(formats[0]['format_id'], '1')

    def test_extract_m3u8_formats(self):
        ie = EitbIE()
        url = 'http://example.com/hls.m3u8'
        video_id = '4090227752001'
        formats = ie._extract_m3u8_formats(url, video_id, m3u8_id='hls', fatal=False)
        self.assertEqual(len(formats), 3)

    def test_extract_f4m_formats(self):
        ie = EitbIE()
        url = 'http://example.com/f4m.m4f'
        video_id = '4090227752001'
        formats = ie._extract_f4m_formats(url, video_id, f4m_id='hds', fatal=False)
        self.assertEqual(len(formats), 2)

    def test_download_json(self):
        ie = EitbIE()
        url = 'http://example.com/video.json'
        video_id = '4090227752001'
        video = ie._download_json(url, video_id, 'Downloading video JSON')
        self.assertEqual(video['web_media'][0]['NAME_ES'], '60 minutos (Lasa y Zabala, 30 años)')

    def test_parse_iso8601(self):
        ie = EitbIE()
        timestamp = '20131014'
        result = ie._parse_iso8601(timestamp, ' ')
        self.assertEqual(result, 1381789200)

    def test_float_or_none(self):
        ie = EitbIE()
        value = 123.456
        result = ie._float_or_none(value, 1000)
        self.assertEqual(result, 123.456)

    def test_int_or_none(self):
        ie = EitbIE()
        value = 123
        result = ie._int_or_none(value)
        self.assertEqual(result, 123)

    def test_sanitized_request(self):
        ie = EitbIE()
        request = ie._sanitized_Request('http://example.com', headers={'Referer': 'http://example.com'})
        self.assertEqual(request.get_full_url(), 'http://example.com')

if __name__ == '__main__':
    unittest.main()