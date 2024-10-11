import unittest
from unittest.mock import patch
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE


class TestITVIE(unittest.TestCase):
    def test_valid_url(self):
        ie = ITVIE()
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        video_id = ie._match_id(url)
        self.assertEqual(video_id, '2a4547a0012')

    def test_geo_verification_headers(self):
        ie = ITVIE()
        headers = ie.geo_verification_headers()
        self.assertIn('Accept', headers)
        self.assertIn('Content-Type', headers)
        self.assertIn('hmac', headers)

    def test_real_extract(self):
        ie = ITVIE()
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        video_id = '2a4547a0012'
        webpage = 'test webpage'
        params = {'data-video-playlist': 'playlist_url', 'data-video-hmac': 'hmac'}
        ios_playlist_url = 'ios_playlist_url'
        headers = {'Accept': 'application/vnd.itv.vod.playlist.v2+json', 'Content-Type': 'application/json', 'hmac': 'hmac'}
        ios_playlist = {'Playlist': {'Video': {'Base': 'base_url', 'MediaFiles': [{'Href': 'href'}]}}}
        video_data = ios_playlist['Playlist']['Video']
        formats = [{'url': 'url'}]
        subtitles = {'en': [{'url': 'url', 'ext': 'vtt'}]}
        info = {'title': 'title', 'description': 'description'}
        result = ie._real_extract(url)
        self.assertEqual(result['id'], video_id)
        self.assertEqual(result['title'], 'title')
        self.assertEqual(result['formats'], formats)
        self.assertEqual(result['subtitles'], subtitles)
        self.assertEqual(result['duration'], 'duration')
        self.assertEqual(result['description'], 'description')

    def test_search_json_ld(self):
        ie = ITVIE()
        webpage = 'test webpage'
        video_id = 'video_id'
        result = ie._search_json_ld(webpage, video_id)
        self.assertEqual(result, {})

    def test_search_regex(self):
        ie = ITVIE()
        webpage = 'test webpage'
        pattern = r'(?s)(<[^>]+id="video"[^>]*>)'
        result = ie._search_regex(pattern, webpage, 'params')
        self.assertEqual(result, 'params')

    def test_sort_formats(self):
        ie = ITVIE()
        formats = [{'url': 'url1'}, {'url': 'url2'}]
        ie._sort_formats(formats)
        self.assertEqual(formats, [{'url': 'url1'}, {'url': 'url2'}])

class TestITVBTCCIE(unittest.TestCase):
    def test_valid_url(self):
        ie = ITVBTCCIE()
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        video_id = ie._match_id(url)
        self.assertEqual(video_id, 'btcc-2018-all-the-action-from-brands-hatch')

    def test_real_extract(self):
        ie = ITVBTCCIE()
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        playlist_id = 'btcc-2018-all-the-action-from-brands-hatch'
        webpage = 'test webpage'
        entries = [{'url': 'url'}]
        title = 'title'
        result = ie._real_extract(url)
        self.assertEqual(result, self.playlist_result(entries, playlist_id, title))

    def test_playlist_result(self):
        ie = ITVBTCCIE()
        entries = [{'url': 'url'}]
        playlist_id = 'playlist_id'
        title = 'title'
        result = ie.playlist_result(entries, playlist_id, title)
        self.assertEqual(result, {'id': playlist_id, 'title': title, 'entries': entries})

if __name__ == '__main__':
    unittest.main()