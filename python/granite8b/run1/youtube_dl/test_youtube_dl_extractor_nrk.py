import unittest
from youtube_dl.extractor.nrk import NRKSkoleIE


class TestNRKSkoleIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKSkoleIE()
        url = "https://www.nrk.no/skole/fotball/2023/01/24/20/1674668490"
        video_id = "20230124201674668490"
        expected_info = {
            "id": video_id,
            "ext": "mp4",
            "title": "Fotball - 24.01.2023",
            "description": "md5:54089531513e778842b568346136467",
            "timestamp": 1674668490,
            "upload_date": "20230124",
            "duration": 1674668490,
        }
        self.assertEqual(ie._real_extract(url), expected_info)

if __name__ == '__main__':
    unittest.main()