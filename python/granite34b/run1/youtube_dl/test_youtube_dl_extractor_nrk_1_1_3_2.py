import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKTVEpisodeIE(unittest.TestCase):
    def test_real_extract(self):
        url = 'https://tv.nrk.no/lyngseide/2022/10/14/14-10-2022-1000'
        display_id = 'lyngseide/2022/10/14/14-10-2022-1000'
        season_number = '2022'
        episode_number = '1000'
        webpage = '<html><head><title>NRK TV</title></head><body>Test</body></html>'
        info = {'@id': 'test_id', 'nrk:program-id': 'test_program_id', '_type': 'url', 'id': 'test_id', 'url': 'nrk:test_id', 'ie_key': 'NRKIE', 'season_number': season_number, 'episode_number': episode_number}
        nrk_id = 'test_id'
        assert re.match(NRKTVIE._EPISODE_RE, nrk_id)
        result = NRKTVEpisodeIE._real_extract(self, url)
        self.assertEqual(result, info)

if __name__ == '__main__':
    unittest.main()