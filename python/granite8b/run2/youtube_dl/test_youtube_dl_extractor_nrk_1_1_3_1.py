import unittest
from youtube_dl.extractor.nrk import NRKTVIE


class TestNRKTVIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKTVIE()
        url = 'https://tv.nrk.no/serier/00000000-0000-0000-0000-000000000000/ episode/00000000-0000-0000-0000-000000000000/00000000-0000-0000-0000-000000000000'
        video_id = '00000000-0000-0000-0000-000000000000'
        result = ie._real_extract(url)
        self.assertEqual(result['id'], video_id)

if __name__ == '__main__':
    unittest.main()