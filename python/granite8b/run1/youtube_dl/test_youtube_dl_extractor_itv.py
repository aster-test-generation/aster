import unittest
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE


class TestITVIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ITVIE(None)
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        info_dict = ie._real_extract(url)
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
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        playlist_id = ie._match_id(url)
        webpage = ie._download_webpage(url, playlist_id)
        entries = [
            ie.url_result(
                smuggle_url(
                    'http://players.brightcove.net/1582188683001/HkiHLnNRx_default/index.html?videoId=%s' % video_id,
                    {
                        'geo_ip_blocks': [
                            '193.113.0.0/16', '54.36.162.0/23', '159.65.16.0/21'
                        ],
                        'referrer': url,
                    }),
                ie=BrightcoveNewIE.ie_key(), video_id=video_id)
            for video_id in re.findall(r'data-video-id=["\'](\d+)', webpage)]
        title = ie._og_search_title(webpage, fatal=False)
        self.assertEqual(ie.playlist_result(entries, playlist_id, title)['entries'], entries)

class TestITVIE(unittest.TestCase):
    def test_real_extract(self):
        ie = ITVIE()
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
        ie = ITVBTCCIE()
        entries = ie._real_extract('http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch')
        self.assertEqual(len(entries), 9)
        self.assertEqual(entries[0]['id'], 'btcc-2018-all-the-action-from-brands-hatch')
        self.assertEqual(entries[0]['title'], 'BTCC 2018: All the action from Brands Hatch')

if __name__ == '__main__':
    unittest.main()