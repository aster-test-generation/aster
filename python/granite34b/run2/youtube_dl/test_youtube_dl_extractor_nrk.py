import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKSkoleIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKSkoleIE()
        url = 'https://nrkskole.nrk.no/video/12345'
        video_id = '12345'
        nrk_id = '67890'
        expected_result = {
            'id': nrk_id,
            'url': 'nrk:%s' % nrk_id,
        }
        result = ie._real_extract(url)
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()