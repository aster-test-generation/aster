import json
import unittest
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE
from youtube_dl.utils import ExtractorError


class TestITVIE(unittest.TestCase):
    def setUp(self):
        self.extractor = ITVIE()

    def test_valid_url(self):
        self.assertTrue(self.extractor.suitable('https://www.itv.com/hub/liar/2a4547a0012'))
        self.assertFalse(self.extractor.suitable('https://www.example.com/video/12345'))

    def test_real_extract(self):
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        result = self.extractor._real_extract(url).to_screen()
        self.assertEqual(result['id'], '2a4547a0012')
        self.assertEqual(result['title'], 'Liar - Series 2 - Episode 6')

    def test_protected_method_match_id(self):
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        video_id = self.extractor._match_id(url)
        self.assertEqual(video_id, '2a4547a0012')

    def test_private_method_download_webpage(self):
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        video_id = '2a4547a0012'
        webpage = self.extractor._download_webpage(url, video_id, fatal=False)
        self.assertIn('<html', webpage)

    def test_private_method_search_regex(self):
        webpage = '<div id="video" data-video-id="12345" data-video-hmac="abcdef"></div>'
        params = self.extractor._search_regex(r'(?s)(<[^>]+id="video"[^>]*>)', webpage, 'params', default={})
        self.assertIn('data-video-id="12345"', params)

    def test_private_method_download_json(self):
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        video_id = '2a4547a0012'
        headers = {'Accept': 'application/vnd.itv.vod.playlist.v2+json'}
        data = json.dumps({
            'user': {'itvUserId': '', 'entitlements': [], 'token': ''},
            'device': {'manufacturer': 'Safari', 'model': '5', 'os': {'name': 'Windows NT', 'version': '6.1', 'type': 'desktop'}},
            'client': {'version': '4.1', 'id': 'browser'},
            'variantAvailability': {'featureset': {'min': ['hls', 'aes', 'outband-webvtt'], 'max': ['hls', 'aes', 'outband-webvtt']}, 'platformTag': 'dotcom'}
        }).encode()
        ios_playlist = self.extractor._download_json(url, video_id, data=data, headers=headers).get('to_screen')
        self.assertIn('Playlist', ios_playlist)

class TestITVBTCCIE(unittest.TestCase):
    def setUp(self):
        self.extractor = ITVBTCCIE()

    def test_valid_url(self):
        self.assertTrue(self.extractor.suitable('http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'))
        self.assertFalse(self.extractor.suitable('https://www.example.com/video/12345'))

    def test_real_extract(self):
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        result = self.extractor._real_extract(url).to_screen()
        self.assertEqual(result['id'], 'btcc-2018-all-the-action-from-brands-hatch')
        self.assertEqual(result['title'], 'BTCC 2018: All the action from Brands Hatch')

    def test_protected_method_match_id(self):
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        playlist_id = self.extractor._match_id(url)
        self.assertEqual(playlist_id, 'btcc-2018-all-the-action-from-brands-hatch')

    def test_private_method_download_webpage(self):
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        playlist_id = 'btcc-2018-all-the-action-from-brands-hatch'
        webpage = self.extractor._download_webpage(url, playlist_id, fatal=False)
        self.assertIn('<html', webpage)

    def test_private_method_og_search_title(self):
        webpage = '<meta property="og:title" content="BTCC 2018: All the action from Brands Hatch">'
        title = self.extractor._og_search_title(webpage) if webpage else None
        self.assertEqual(title, 'BTCC 2018: All the action from Brands Hatch')

if __name__ == '__main__':
    unittest.main()