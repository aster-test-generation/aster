import unittest
from youtube_dl.extractor.itv import ITVIE, ITVBTCCIE


class TestITVIE(unittest.TestCase):
    def test_valid_url(self):
        ie = ITVIE()
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], '2a4547a0012')
        self.assertEqual(info_dict['ext'], 'mp4')
        self.assertEqual(info_dict['title'], 'Liar - Series 2 - Episode 6')
        self.assertEqual(info_dict['description'], 'md5:d0f91536569dec79ea184f0a44cca089')
        self.assertEqual(info_dict['series'], 'Liar')
        self.assertEqual(info_dict['season_number'], 2)
        self.assertEqual(info_dict['episode_number'], 6)

    def test_invalid_url(self):
        ie = ITVIE()
        url = 'https://www.itv.com/hub/invalid/2a4547a0012'
        with self.assertRaisesRegex(Exception, 'Invalid URL'):
            ie._real_extract(url)

    def test_geo_verification_headers(self):
        ie = ITVIE()
        headers = ie.geo_verification_headers()
        self.assertIn('Accept', headers)
        self.assertIn('Content-Type', headers)
        self.assertIn('hmac', headers)

    def test_extract_m3u8_formats(self):
        ie = ITVIE()
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        formats = ie._extract_m3u8_formats(url, '2a4547a0012', 'mp4', entry_protocol='m3u8_native', m3u8_id='hls', fatal=False)
        self.assertGreater(len(formats), 0)

    def test_search_json_ld(self):
        ie = ITVIE()
        url = 'https://www.itv.com/hub/liar/2a4547a0012'
        json_ld = ie._search_json_ld(url, '2a4547a0012', default={})
        self.assertIsNotNone(json_ld)

    def test_parse_json(self):
        ie = ITVIE()
        json_data = '{"@type": "BreadcrumbList", "itemListElement": [{"item": {"@type": "TVEpisode"}}]}'
        json_ld = ie._parse_json(json_data, '2a4547a0012', fatal=False)
        self.assertIsNotNone(json_ld)

    def test_merge_dicts(self):
        ie = ITVIE()
        dict1 = {'id': '2a4547a0012', 'title': 'Liar - Series 2 - Episode 6'}
        dict2 = {'duration': 60, 'description': 'Liar'}
        merged_dict = ie._merge_dicts(dict1, dict2)
        self.assertEqual(merged_dict['id'], '2a4547a0012')
        self.assertEqual(merged_dict['title'], 'Liar - Series 2 - Episode 6')
        self.assertEqual(merged_dict['duration'], 60)
        self.assertEqual(merged_dict['description'], 'Liar')

class TestITVBTCCIE(unittest.TestCase):
    def test_valid_url(self):
        ie = ITVBTCCIE()
        url = 'http://www.itv.com/btcc/races/btcc-2018-all-the-action-from-brands-hatch'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], 'btcc-2018-all-the-action-from-brands-hatch')
        self.assertEqual(info_dict['title'], 'BTCC 2018: All the action from Brands Hatch')

    def test_invalid_url(self):
        ie = ITVBTCCIE()
        url = 'http://www.itv.com/btcc/invalid'
        with self.assertRaisesRegex(Exception, 'Invalid URL'):
            ie._real_extract(url)

if __name__ == '__main__':
    unittest.main()