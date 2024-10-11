import unittest
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE


class TestITVIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ITVIE()
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        video_id = '2a4547a0012'
        webpage = '<html><body>Test</body></html>'
        params = {'data-video-playlist': 'test', 'data-video-id': 'test', 'data-video-hmac': 'test'}
        ios_playlist_url = 'test'
        hmac = 'test'
        headers = {'Accept': 'application/vnd.itv.vod.playlist.v2+json', 'Content-Type': 'application/json', 'hmac': hmac.upper()}
        ios_playlist = {'Playlist': {'Video': {'Base': 'test', 'MediaFiles': [{'Href': 'test'}]}}}
        video_data = {'Duration': 'test', 'Subtitles': [{'Href': 'test'}]}
        formats = []
        subtitles = {}
        info = {}
        result = ie._real_extract(url)
        self.assertEqual(result, {'id': video_id, 'title': 'Test', 'formats': formats, 'subtitles': subtitles, 'duration': 'test', 'description': 'Test'})

class TestITVBTCCIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ITVBTCCIE()
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        playlist_id = 'btcc-2018-all-the-action-from-brands-hatch'
        webpage = '<html><body>Test</body></html>'
        entries = []
        title = 'Test'
        result = ie._real_extract(url)
        self.assertEqual(result, {'_type': 'playlist', 'id': playlist_id, 'title': title, 'entries': entries})

if __name__ == '__main__':
    unittest.main()