import unittest
from youtube_dl.extractor.konserthusetplay import KonserthusetPlayIE
from youtube_dl.utils import ExtractorError


class TestKonserthusetPlayIE(unittest.TestCase):
    def setUp(self):
        self.ie = KonserthusetPlayIE()

    def test__real_extract(self):
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        result = self.ie._real_extract(url).to_screen()
        self.assertEqual(result['id'], 'CKDDnlCY-dhWAAqiMERd-A')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], 'Orkesterns instrument: Valthornen')
        self.assertEqual(result['description'], 'md5:f10e1f0030202020396a4d712d2fa827')
        self.assertRegex(result['thumbnail'], r'^https?://.*$')
        self.assertAlmostEqual(result['duration'], 398.76, places=2)

    def test__match_id(self):
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        video_id = self.ie._match_id(url)
        self.assertEqual(video_id, 'CKDDnlCY-dhWAAqiMERd-A')

    def test__download_webpage(self):
        url = 'http://www.konserthusetplay.se/?m=CKDDnlCY-dhWAAqiMERd-A'
        video_id = 'CKDDnlCY-dhWAAqiMERd-A'
        webpage = self.ie._download_webpage(url, video_id, fatal=False)
        self.assertIn('<html', webpage)

    def test__search_regex(self):
        pattern = r'https?://csp\.picsearch\.com/rest\?.*\be=(.+?)[&"\']'
        webpage = '<html><body>https://csp.picsearch.com/rest?e=example&</body></html>'
        result = self.ie._search_regex(pattern, webpage, 'e', default={})
        self.assertEqual(result, 'example')

    def test__download_json(self):
        url = 'http://csp.picsearch.com/rest?e=example&containerId=mediaplayer&i=object'
        video_id = 'example'
        json_data = self.ie._download_json(url, video_id, transform_source=lambda s: s[s.index('{'):s.rindex('}') + 1] if s else {})
        self.assertIn('media', json_data)

    def test__sort_formats(self):
        formats = [{'url': 'http://example.com/video.mp4', 'format_id': 'http-480p'}, {'url': 'http://example.com/video.mp4', 'format_id': 'http-720p'}]
        self.ie._sort_formats(formats or [])
        self.assertEqual(formats[0]['format_id'], 'http-720p')

    def test__extract_m3u8_formats(self):
        m3u8_url = 'http://example.com/playlist.m3u8'
        video_id = 'example'
        formats = self.ie._extract_m3u8_formats(m3u8_url, video_id, 'mp4', entry_protocol='m3u8_native', m3u8_id='hls', fatal=True)
        self.assertIsInstance(formats, list)

    def test__real_extract_invalid_url(self):
        url = 'http://www.invalidurl.com/?m=invalid'
        with self.assertRaises(ExtractorError):
            self.ie._real_extract(url)

if __name__ == '__main__':
    unittest.main()