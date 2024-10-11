import unittest
from youtube_dl.extractor.nrk import NRKTVIE


class TestNRKTVIE(unittest.TestCase):
    def test_real_extract(self):
        IE = NRKTVIE()
        video_id = "abc123"
        result = IE._real_extract("https://www.nrk.no/video/%s" % video_id)
        self.assertEqual(result["id"], video_id)
        self.assertEqual(result["ie_key"], "NRK")

if __name__ == '__main__':
    unittest.main()