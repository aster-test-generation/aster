import unittest
from youtube_dl.extractor.itv import *
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE



class TestITVIE(unittest.TestCase):
    def test_real_extract(self):
        url = "https://www.itv.com/hub/liar/2a4547a0012"
        video_id = "2a4547a0012"
        webpage = "mock webpage"
        params = "mock params"
        hmac = "mock hmac"
        headers = "mock headers"
        ios_playlist_url = "mock ios_playlist_url"
        ios_playlist = "mock ios_playlist"
        video_data = "mock video_data"
        ios_base_url = "mock ios_base_url"
        formats = "mock formats"
        subtitles = "mock subtitles"
        info = "mock info"
        result = ITVIE()._real_extract(url)
        self.assertEqual(result, {
            'id': video_id,
            'title': self._html_search_meta(['og:title', 'twitter:title'], webpage),
            'formats': formats,
            'subtitles': subtitles,
            'duration': parse_duration(video_data.get('Duration')),
            'description': clean_html(get_element_by_class('episode-info__synopsis', webpage)),
        })

    def test_real_extract_with_no_params(self):
        url = "https://www.itv.com/hub/liar/2a4547a0012"
        video_id = "2a4547a0012"
        webpage = "mock webpage"
        params = "mock params"
        hmac = "mock hmac"
        headers = "mock headers"
        ios_playlist_url = "mock ios_playlist_url"
        ios_playlist = "mock ios_playlist"
        video_data = "mock video_data"
        ios_base_url = "mock ios_base_url"
        formats = "mock formats"
        subtitles = "mock subtitles"
        info = "mock info"
        result = ITVIE()._real_extract(url)
        self.assertEqual(result, {
            'id': video_id,
            'title': self._html_search_meta(['og:title', 'twitter:title'], webpage),
            'formats': formats,
            'subtitles': subtitles,
            'duration': parse_duration(video_data.get('Duration')),
            'description': clean_html(get_element_by_class('episode-info__synopsis', webpage)),
        })

    def test_real_extract_with_no_params_and_no_video_data(self):
        url = "https://www.itv.com/hub/liar/2a4547a0012"
        video_id = "2a4547a0012"
        webpage = "mock webpage"
        params = "mock params"
        hmac = "mock hmac"
        headers = "mock headers"
        ios_playlist_url = "mock ios_playlist_url"
        ios_playlist = "mock ios_playlist"
        video_data = "mock video_data"
        ios_base_url = "mock ios_base_url"
        formats = "mock formats"
        subtitles = "mock subtitles"
        info = "mock info"
        result = ITVIE()._real_extract(url)
        self.assertEqual(result, {
            'id': video_id,
            'title': self._html_search_meta(['og:title', 'twitter:title'], webpage),
            'formats': formats,
            'subtitles': subtitles,
            'duration': parse_duration(video_data.get('Duration')),
            'description': clean_html(get_element_by_class('episode-info__synopsis', webpage)),
        })


class TestITVIE(unittest.TestCase):
    def test_real_extract(self):
        instance = ITVIE()
        result = instance._real_extract("https://www.itv.com/hub/liar/2a4547a0012")
        self.assertEqual(result['id'], '2a4547a0012')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], 'Liar - Series 2 - Episode 6')
        self.assertEqual(result['description'], 'md5:d0f91536569dec79ea184f0a44cca089')
        self.assertEqual(result['series'], 'Liar')
        self.assertEqual(result['season_number'], 2)
        self.assertEqual(result['episode_number'], 6)

    def test_real_extract_2(self):
        instance = ITVIE()
        result = instance._real_extract("https://www.itv.com/hub/through-the-keyhole/2a2271a0033")
        self.assertEqual(result['id'], '2a2271a0033')

    def test_real_extract_3(self):
        instance = ITVIE()
        result = instance._real_extract("https://www.itv.com/hub/james-martins-saturday-morning/2a5159a0034")
        self.assertEqual(result['id'], '2a5159a0034')

    def test_real_extract_4(self):
        instance = ITVIE()
        result = instance._real_extract("https://www.itv.com/hub/whos-doing-the-dishes/2a2898a0024")
        self.assertEqual(result['id'], '2a2898a0024')

class TestITVBTCCIE(unittest.TestCase):
    def test_real_extract(self):
        instance = ITVBTCCIE()
        result = instance._real_extract("http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch")
        self.assertEqual(result['id'], 'btcc-2018-all-the-action-from-brands-hatch')
        self.assertEqual(result['title'], 'BTCC 2018: All the action from Brands Hatch')

if __name__ == '__main__':
    unittest.main()