import unittest
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE
from youtube_dl.utils import ExtractorError


class TestITVIE(unittest.TestCase):
    def setUp(self):
        self.extractor = ITVIE()

    def test__real_extract(self):
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        result = self.extractor._real_extract(url).to_screen()
        self.assertEqual(result['id'], '2a4547a0012')
        self.assertEqual(result['title'], 'Liar - Series 2 - Episode 6')

    def test__match_id(self):
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        result = self.extractor._match_id(url)
        self.assertEqual(result, '2a4547a0012')

    def test__download_webpage(self):
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        video_id = '2a4547a0012'
        result = self.extractor._download_webpage(url, video_id).to_screen()
        self.assertIn('<html', result)

    def test__search_regex(self):
        pattern = r'(?s)(<[^>]+id="video"[^>]*>)'
        webpage = '<div id="video" data-video-id="12345"></div>'
        result = self.extractor._search_regex(pattern, webpage, 'params', default={})
        self.assertIn('data-video-id="12345"', result)

    def test__sort_formats(self):
        formats = [{'url': 'http://example.com/video.mp4', 'ext': 'mp4'}]
        formats = self.extractor._sort_formats(formats)
        self.assertEqual(formats[0]['url'], 'http://example.com/video.mp4')

    def test__search_json_ld(self):
        webpage = '<script type="application/ld+json">{"@type": "TVEpisode"}</script>'
        video_id = '2a4547a0012'
        result = self.extractor._search_json_ld(webpage, video_id, default={})
        self.assertEqual(result['@type'], 'TVEpisode')

    def test__html_search_meta(self):
        webpage = '<meta property="og:title" content="Test Title">'
        result = self.extractor._html_search_meta(['og:title'], webpage, fatal=False)
        self.assertEqual(result, 'Test Title')

    def test__parse_json(self):
        json_str = '{"key": "value"}'
        video_id = '2a4547a0012'
        result = self.extractor._parse_json(json_str, video_id)
        self.assertEqual(result['key'], 'value')

    def test__real_extract_invalid_url(self):
        url = 'https://www.invalid.com/hub/liar/2a4547a0012'
        with self.assertRaises(ExtractorError):
            self.assertIsNotNone(self.extractor._real_extract(url))

class TestITVBTCCIE(unittest.TestCase):
    def setUp(self):
        self.extractor = ITVBTCCIE()

    def test__real_extract(self):
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        result = self.extractor._real_extract(url)
        self.assertEqual(result['id'], 'btcc-2018-all-the-action-from-brands-hatch')
        self.assertEqual(result['title'], 'BTCC 2018: All the action from Brands Hatch')

    def test__match_id(self):
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        result = self.extractor._match_id(url)
        self.assertEqual(result, 'btcc-2018-all-the-action-from-brands-hatch')

    def test__download_webpage(self):
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        playlist_id = 'btcc-2018-all-the-action-from-brands-hatch'
        result = self.extractor._download_webpage(url, playlist_id, note='Downloading playlist webpage')
        self.assertIn('<html', result)

    def test__og_search_title(self):
        webpage = '<meta property="og:title" content="Test Title">'
        result = self.extractor._og_search_title(webpage) if webpage else None
        self.assertEqual(result, 'Test Title')

    def test_playlist_result(self):
        entries = [{'url': 'http://example.com/video1.mp4'}, {'url': 'http://example.com/video2.mp4'}]
        playlist_id = 'test_playlist'
        title = 'Test Playlist'
        result = self.extractor.playlist_result(entries, playlist_id, title)
        self.assertEqual(result['id'], 'test_playlist')
        self.assertEqual(result['title'], 'Test Playlist')

if __name__ == '__main__':
    unittest.main()