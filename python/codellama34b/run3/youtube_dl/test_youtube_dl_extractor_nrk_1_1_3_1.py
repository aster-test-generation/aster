import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKTVIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKTVIE()
        result = instance._real_extract("https://www.nrk.no/video/direkte/nrk-tv-100000004/NRK1")
        self.assertEqual(result, "nrk:100000004")

if __name__ == '__main__':
    unittest.main()