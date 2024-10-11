import unittest
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE


class TestITVIE(unittest.TestCase):
    def test_valid_url(self):
        ie = ITVIE()
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        info_dict = ie._real_extract(url)
        self.assertIn('id', info_dict)
        self.assertIn('title', info_dict)
        self.assertIn('formats', info_dict)
        self.assertIn('subtitles', info_dict)
        self.assertIn('duration', info_dict)
        self.assertIn('description', info_dict)

    def test_invalid_url(self):
        ie = ITVIE()
        url = 'https://www.example.com'
        with self.assertRaises(ExtractorError):
            ie._real_extract(url)

    def test_geo_verification_headers(self):
        ie = ITVIE()
        headers = ie.geo_verification_headers()
        self.assertIn('Accept', headers)
        self.assertIn('Content-Type', headers)

    def test_extract_m3u8_formats(self):
        ie = ITVIE()
        url = 'https://example.com/playlist.m3u8'
        formats = ie._extract_m3u8_formats(url, 'test', 'mp4', entry_protocol='m3u8_native')
        self.assertGreater(len(formats), 0)

    def test_sort_formats(self):
        ie = ITVIE()
        formats = [
            {'url': 'https://example.com/video1.mp4', 'ext': 'mp4'},
            {'url': 'https://example.com/video2.mp4', 'ext': 'mp4'},
        ]
        ie._sort_formats(formats)
        self.assertEqual(formats[0]['url'], 'https://example.com/video1.mp4')

    def test_search_json_ld(self):
        ie = ITVIE()
        webpage = '<html><body><script type="application/ld+json">{"@context": "http://schema.org", "@type": "TVEpisode", "title": "Test Title"}</script></body></html>'
        info = ie._search_json_ld(webpage, 'test', default={})
        self.assertIn('title', info)

    def test_parse_json(self):
        ie = ITVIE()
        json_data = '{"@type": "TVEpisode", "title": "Test Title"}'
        info = ie._parse_json(json_data, 'test', fatal=False)
        self.assertIn('title', info)

class TestITVBTCCIE(unittest.TestCase):
    def test_valid_url(self):
        ie = ITVBTCCIE()
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        info_dict = ie._real_extract(url)
        self.assertIn('id', info_dict)
        self.assertIn('title', info_dict)
        self.assertIn('playlist_mincount', info_dict)

    def test_invalid_url(self):
        ie = ITVBTCCIE()
        url = 'https://www.example.com'
        with self.assertRaises(ExtractorError):
            ie._real_extract(url)

    def test_brightcove_url_template(self):
        ie = ITVBTCCIE()
        video_id = 'test_video_id'
        url = ie.BRIGHTCOVE_URL_TEMPLATE % video_id
        self.assertEqual(url, 'http://players.brightcove.net/1582188683001/HkiHLnNRx_default/index.html?videoId=test_video_id')

if __name__ == '__main__':
    unittest.main()