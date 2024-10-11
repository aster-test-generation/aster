import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKRadioPodkastIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKRadioPodkastIE()
        video_id = '12345'
        result = ie._real_extract('https://www.nrk.no/program/12345')
        self.assertEqual(result['id'], video_id)
        self.assertEqual(result['ie_key'], 'NRK')

if __name__ == '__main__':
    unittest.main()