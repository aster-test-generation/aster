import unittest
from youtube_dl.extractor.nrk import NRKIE
from youtube_dl.utils import ExtractorError


class TestNRKIE(unittest.TestCase):
    def setUp(self):
        self.instance = NRKIE()

    def test_init(self):
        self.assertIsInstance(self.instance, NRKIE)

    def test_real_extract(self):
        url = 'https://tv.nrk.no/serie/side-om-side/sesong-8/episode-1/avspiller'
        result = self.instance._real_extract(url)
        self.assertIn('id', result)
        self.assertIn('title', result)
        self.assertIn('formats', result)

    def test_call_playback_api(self):
        url = 'https://tv.nrk.no/serie/side-om-side/sesong-8/episode-1/avspiller'
        video_id = self.instance._match_id(url).split('/')[-1]
        path_templ = 'playback/%s/' + video_id
        result = self.instance._NRKIE__call_playback_api(path_templ % 'manifest', video_id, 'manifest', query={'preferredCdn': 'akamai'})
        self.assertIn('playable', result)

    def test_sort_formats(self):
        formats = [{'url': 'http://example.com/video.mp4', 'format_id': 'mp4'}]
        self.instance._sort_formats(formats)
        self.assertEqual(formats[0]['format_id'], 'mp4')

    def test_extract_nrk_formats(self):
        url = 'http://example.com/video.m3u8'
        video_id = '12345'
        result = self.instance._extract_nrk_formats(url, video_id)
        self.assertIsInstance(result, list)

    def test_raise_error(self):
        with self.assertRaises(ExtractorError):
            self.instance._raise_error('This is an error')

    def test_match_id(self):
        url = 'https://tv.nrk.no/serie/side-om-side/sesong-8/episode-1/avspiller'
        result = self.instance._match_id(url)
        self.assertEqual(result, 'side-om-side/sesong-8/episode-1/avspiller')

    def test_search_regex(self):
        pattern = r'Sesong\s+(\d+)'
        string = 'Sesong 8'
        result = self.instance._search_regex(pattern, string, 'season number')
        self.assertEqual(result, '8')

if __name__ == '__main__':
    unittest.main()