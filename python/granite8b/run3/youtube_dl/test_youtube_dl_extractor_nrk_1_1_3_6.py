import unittest
from youtube_dl.extractor.nrk import NRKRadioPodkastIE


class TestNRKRadioPodkastIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKRadioPodkastIE()
        url = 'https://www.nrk.no/radio/Podkast-fra-Sveriges-Tyske- radio/id2421129'
        video_id = '2421129'
        expected_info = {
            'id': video_id,
            'display_id': video_id,
            'ext': 'mp3',
            'title': 'Podkast fra Sveriges Tyske radio',
            'description': 'md5:748527531037657485',
            'timestamp': 1591888000,
            'upload_date': '20200612',
            'duration': 120,
            'age_limit': 0,
        }
        self.assertEqual(ie._real_extract(url), expected_info)

if __name__ == '__main__':
    unittest.main()