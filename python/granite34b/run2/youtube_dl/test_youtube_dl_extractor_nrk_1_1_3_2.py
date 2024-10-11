import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKTVEpisodeIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'https://tv.nrk.no/lyngseide/2022/10/14/14-10-2022-1000'
        display_id = 'lyngseide/2022/10/14/14-10-2022-1000'
        season_number = '2022'
        episode_number = '10'
        webpage = '<html><head><title>NRK TV</title></head><body><h1>Test Episode</h1></body></html>'
        info = {
            '@id': 'nrk:program-id',
            'nrk:program-id': 'program-id',
            '_type': 'url',
            'id': 'program-id',
            'url': 'nrk:program-id',
            'ie_key': 'NRKIE',
            'season_number': season_number,
            'episode_number': episode_number
        }
        nrk_id = 'program-id'
        assert re.match(NRKTVIE._EPISODE_RE, nrk_id)
        info.update({'_type': 'url', 'id': nrk_id, 'url': 'nrk:%s' % nrk_id, 'ie_key': NRKIE.ie_key(), 'season_number': int(season_number), 'episode_number': int(episode_number)})
        instance = NRKTVEpisodeIE()
        result = instance._real_extract(url)
        self.assertEqual(result, info)

if __name__ == '__main__':
    unittest.main()