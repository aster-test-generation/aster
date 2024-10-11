import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKSkoleIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKSkoleIE()
        result = instance._real_extract("https://nrkno-skole-prod.kube.nrk.no/skole/api/media/123")
        self.assertEqual(result, "nrk:123")

if __name__ == '__main__':
    unittest.main()