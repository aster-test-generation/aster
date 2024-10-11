import unittest
from youtube_dl.extractor.nrk import NRKRadioPodkastIE


class TestNRKRadioPodkastIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKRadioPodkastIE()
        url = 'https://www.nrk.no/sprak/radio/podkast/id2838000'
        video_id = '2838000'
        expected_info = {
            'id': video_id,
            'ext': 'mp3',
            'title': 'NRK P2 Plass - 20.02.2023',
            'description': 'md5:91c665195673246848878b23371875c',
            'timestamp': 1677020800,
            'upload_date': '20230220',
            'duration': 1800,
        }
        self.assertEqual(ie._real_extract(url), expected_info)

if __name__ == '__main__':
    unittest.main()