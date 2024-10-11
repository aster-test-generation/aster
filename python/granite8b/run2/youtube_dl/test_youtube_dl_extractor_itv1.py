import unittest
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE

class TestITVIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ITVIE(None)
        video_id = '2a4547a0012'
        webpage = '<html><body><div id="video" data-video-id="2a4547a0012" data-video-hmac="123456"></div></body></html>'
        params = {'data-video-id': '2a4547a0012', 'data-video-hmac': '123456'}
        headers = {'Accept': 'application/vnd.itv.vod.playlist.v2+json', 'Content-Type': 'application/json', 'hmac': '123456'}
        ios_playlist = {'Playlist': {'Video': {'Base': 'https://example.com', 'MediaFiles': [{'Href': 'https://example.com/video.mp4'}]}}}
        ios_base_url = 'https://example.com'
        formats = [{'url': 'https://example.com/video.mp4'}]
        subtitles = {'en': [{'url': 'https://example.com/subtitles.vtt', 'ext': 'vtt'}]}
        info = {'id': '2a4547a0012', 'title': 'Test Title', 'duration': 120, 'description': 'Test Description', 'formats': formats, 'subtitles': subtitles}
        self.assertEqual(ie._real_extract(video_id), info)

class TestITVBTCCIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ITVBTCCIE(None)
        playlist_id = 'btcc-2018-all-the-action-from-brands-hatch'
        webpage = '<html><body><div data-video-id="123456"></div></body></html>'
        entries = [
            {'_type': 'url', 'ie_key': 'BrightcoveNew', 'id': '123456', 'url': 'http://players.brightcove.net/1582188683001/HkiHLnNRx_default/index.html?videoId=123456'}
        ]
        title = 'Test Title'
        self.assertEqual(ie._real_extract(playlist_id), {'id': playlist_id, 'title': title, 'entries': entries})

if __name__ == '__main__':
    unittest.main()