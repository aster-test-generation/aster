import unittest
from youtube_dl.extractor.itv import ITVIE
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE


class TestITVIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ITVIE()
        video_id = "2a4547a0012"
        webpage = """
        <html>
        <head>
        <title>Test Video</title>
        </head>
        <body>
        <video id="video" data-video-id="2a4547a0012" data-video-hmac="123456"></video>
        </body>
        </html>
        """
        params = {
            'data-video-id': "2a4547a0012",
            'data-video-hmac': "123456"
        }
        headers = {
            'Accept': 'application/vnd.itv.vod.playlist.v2+json',
            'Content-Type': 'application/json',
            'hmac': "123456".upper()
        }
        ios_playlist = {
            'Playlist': {
                'Video': {
                    'Base': 'https://example.com/video/',
                    'MediaFiles': [
                        {'Href': 'https://example.com/video/1.mp4'},
                        {'Href': 'https://example.com/video/2.mp4'}
                    ],
                    'Subtitles': [
                        {'Href': 'https://example.com/video/subtitles.vtt'}
                    ],
                    'Duration': '10:00'
                }
            }
        }
        ios_base_url = "https://example.com/video/"
        formats = [
            {'url': 'https://example.com/video/1.mp4'},
            {'url': 'https://example.com/video/2.mp4'}
        ]
        subtitles = {'en': [{'url': 'https://example.com/video/subtitles.vtt'}]}
        info = {
            'id': "2a4547a0012",
            'title': "Test Video",
            'formats': formats,
            'subtitles': subtitles,
            'duration': 600
        }
        self.assertEqual(ie._real_extract(video_id), info)

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

class TestITVIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ITVIE(None)
        info_dict = ie._real_extract('https://www.itv.com/hub/liar/2a4547a0012')
        self.assertEqual(info_dict['id'], '2a4547a0012')
        self.assertEqual(info_dict['ext'], 'mp4')
        self.assertEqual(info_dict['title'], 'Liar - Series 2 - Episode 6')
        self.assertEqual(info_dict['description'], 'md5:d0f91536569dec79ea184f0a44cca089')
        self.assertEqual(info_dict['series'], 'Liar')
        self.assertEqual(info_dict['season_number'], 2)
        self.assertEqual(info_dict['episode_number'], 6)

class TestITVBTCCIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ITVBTCCIE(None)
        entries = ie._real_extract('http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch')
        self.assertEqual(len(entries), 9)
        self.assertEqual(entries[0]['id'], 'btcc-2018-all-the-action-from-brands-hatch')
        self.assertEqual(entries[0]['title'], 'BTCC 2018: All the action from Brands Hatch')

if __name__ == '__main__':
    unittest.main()