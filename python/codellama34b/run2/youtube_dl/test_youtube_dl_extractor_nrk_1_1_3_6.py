import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKRadioPodkastIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKRadioPodkastIE()
        result = instance._real_extract("https://www.nrk.no/avsnitt/1234567890")
        self.assertEqual(result, "nrk:1234567890")

if __name__ == '__main__':
    unittest.main()