import unittest
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE


class TestITVIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ITVIE(None)
        video_id = "2a4547a0012"
        webpage = """
        <html>
            <body>
                <div id="video" data-video-id="2a4547a0012" data-video-hmac="123456"></div>
            </body>
        </html>
        """
        headers = {
            'Accept': 'application/vnd.itv.vod.playlist.v2+json',
            'Content-Type': 'application/json',
            'hmac': '123456'.upper(),
        }
        ios_playlist = {
            "Playlist": {
                "Video": {
                    "Base": "https://example.com/",
                    "MediaFiles": [
                        {
                            "Href": "https://example.com/video.m3u8"
                        }
                    ],
                    "Subtitles": [
                        {
                            "Href": "https://example.com/subtitles.vtt"
                        }
                    ],
                    "Duration": "PT1H"
                }
            }
        }
        ios_playlist_url = "https://example.com/playlist"
        info_dict = ie._real_extract(video_id)
        self.assertEqual(info_dict['id'], video_id)
        self.assertEqual(info_dict['title'], "Liar - Series 2 - Episode 6")
        self.assertEqual(info_dict['description'], "md5:d0f91536569dec79ea184f0a44cca089")
        self.assertEqual(info_dict['series'], "Liar")
        self.assertEqual(info_dict['season_number'], 2)
        self.assertEqual(info_dict['episode_number'], 6)
        self.assertEqual(info_dict['duration'], 3600)
        self.assertEqual(info_dict['formats'][0]['url'], "https://example.com/video.m3u8")
        self.assertEqual(info_dict['subtitles']['en'][0]['url'], "https://example.com/subtitles.vtt")

class TestITVBTCCIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ITVBTCCIE(None)
        playlist_id = "btcc-2018-all-the-action-from-brands-hatch"
        webpage = """
        <html>
            <body>
                <div id="video" data-video-id="123456"></div>
            </body>
        </html>
        """
        entries = [
            {
                "_type": "url",
                "ie_key": "BrightcoveNew",
                "url": "http://players.brightcove.net/1582188683001/HkiHLnNRx_default/index.html?videoId=123456",
                "id": "123456",
                "title": "Video 1",
            },
            {
                "_type": "url",
                "ie_key": "BrightcoveNew",
                "url": "http://players.brightcove.net/1582188683001/HkiHLnNRx_default/index.html?videoId=654321",
                "id": "654321",
                "title": "Video 2",
            },
        ]
        info_dict = ie._real_extract(playlist_id)
        self.assertEqual(info_dict['id'], playlist_id)
        self.assertEqual(info_dict['title'], "BTCC 2018: All the action from Brands Hatch")
        self.assertEqual(len(info_dict['entries']), 2)
        for i, entry in enumerate(info_dict['entries']):
            self.assertEqual(entry['id'], entries[i]['id'])
            self.assertEqual(entry['title'], entries[i]['title'])

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