import unittest
from youtube_dl.extractor.konserthusetplay import KonserthusetPlayIE


class TestKonserthusetPlayIE(unittest.TestCase):
    def test_valid_url(self):
        ie = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        self.assertTrue(ie._VALID_URL.match(url))

    def test_invalid_url(self):
        ie = KonserthusetPlayIE()
        url = 'http://www.example.com'
        self.assertFalse(ie._VALID_URL.match(url))

    def test_real_extract(self):
        ie = KonserthusetPlayIE()
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        info = ie._real_extract(url)
        self.assertIn('id', info)
        self.assertIn('title', info)
        self.assertIn('description', info)
        self.assertIn('thumbnail', info)
        self.assertIn('duration', info)
        self.assertIn('formats', info)
        self.assertIn('subtitles', info)

    def test_search_regex(self):
        ie = KonserthusetPlayIE()
        webpage = 'https://csp.picsearch.com/rest?e=123456&containerId=mediaplayer&i=object'
        e = ie._search_regex(r'https?://csp\.picsearch\.com/rest\?.*\be=(.+?)[&"\']', webpage, 'e')
        self.assertEqual(e, '123456')

    def test_download_json(self):
        ie = KonserthusetPlayIE()
        url = 'http://csp.picsearch.com/rest?e=123456&containerId=mediaplayer&i=object'
        video_id = 'CKDDnlCY-dhWAAqiMERd-A'
        result = ie._download_json(url, video_id, transform_source=lambda s: s[s.index('{'):s.rindex('}') + 1])
        self.assertIn('media', result)

    def test_extract_m3u8_formats(self):
        ie = KonserthusetPlayIE()
        m3u8_url = 'http://example.com/m3u8_url'
        video_id = 'CKDDnlCY-dhWAAqiMERd-A'
        formats = ie._extract_m3u8_formats(m3u8_url, video_id, 'mp4', entry_protocol='m3u8_native', m3u8_id='hls', fatal=False)
        self.assertIsInstance(formats, list)

    def test_search_regex_format_id(self):
        ie = KonserthusetPlayIE()
        url = 'http://example.com/video_url_h264m.mp4'
        format_id = ie._search_regex(r'_([^_]+)_h264m\.mp4', url, 'format id', default=None)
        self.assertEqual(format_id, 'h264m')

    def test_sort_formats(self):
        ie = KonserthusetPlayIE()
        formats = [
            {'url': 'http://example.com/format1', 'format_id': 'format1'},
            {'url': 'http://example.com/format2', 'format_id': 'format2'},
        ]
        ie._sort_formats(formats)
        self.assertEqual(formats, sorted(formats, key=lambda x: x['format_id']))

    def test_get_title(self):
        ie = KonserthusetPlayIE()
        player_config = {'title': 'Title'}
        title = ie._get_title(player_config)
        self.assertEqual(title, 'Title')

    def test_get_description(self):
        ie = KonserthusetPlayIE()
        player_config = {'mediaInfo': {'description': 'Description'}}
        description = ie._get_description(player_config)
        self.assertEqual(description, 'Description')

    def test_get_thumbnail(self):
        ie = KonserthusetPlayIE()
        media = {'image': 'http://example.com/thumbnail'}
        thumbnail = ie._get_thumbnail(media)
        self.assertEqual(thumbnail, 'http://example.com/thumbnail')

    def test_get_duration(self):
        ie = KonserthusetPlayIE()
        media = {'duration': 398.76}
        duration = ie._get_duration(media)
        self.assertEqual(duration, 398.76)

if __name__ == '__main__':
    unittest.main()