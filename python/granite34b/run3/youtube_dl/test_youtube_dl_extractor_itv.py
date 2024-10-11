import unittest
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE


class TestITVIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ITVIE()
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        video_id = '2a4547a0012'
        webpage = '<html>...content...</html>'
        params = {'data-video-playlist': '...playlist_url...', 'data-video-id': '...video_id...', 'data-video-hmac': '...hmac...'}
        ios_playlist = {
            'Playlist': {
                'Video': {
                    'Base': '...base_url...',
                    'MediaFiles': [
                        {'Href': '...media_file_url...'},
                        ...
                    ],
                    'Subtitles': [
                        {'Href': '...subtitle_url...'},
                        ...
                    ],
                    'Duration': '...duration...',
                    'Description': '...description...',
                }
            }
        }
        expected_info = {
            'id': video_id,
            'title': '...title...',
            'formats': [
                {'url': '...format_url...'},
                ...
            ],
            'subtitles': {
                'en': [
                    {'url': '...subtitle_url...'},
                    ...
                ]
            },
            'duration': '...duration...',
            'description': '...description...',
        }
        headers = {'Accept': '...accept_header...', 'Content-Type': '...content_type_header...', 'hmac': '...hmac_header...'}
        result = ie._real_extract(url)
        self.assertEqual(result, expected_info)

class TestITVBTCCIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ITVBTCCIE()
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        playlist_id = 'btcc-2018-all-the-action-from-brands-hatch'
        webpage = '<html>...content...</html>'
        expected_entries = [
            {
                'url': 'smuggled_url(...brightcove_url...)',
                'ie_key': 'BrightcoveNew',
                'video_id': '...video_id...'
            },
            ...
        ]
        expected_title = '...title...'
        expected_playlist = {
            'id': playlist_id,
            'title': expected_title,
            'entries': expected_entries
        }
        result = ie._real_extract(url)
        self.assertEqual(result, expected_playlist)

if __name__ == '__main__':
    unittest.main()