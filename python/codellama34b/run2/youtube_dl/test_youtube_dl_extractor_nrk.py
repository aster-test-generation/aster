import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKSkoleIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKSkoleIE()
        result = instance._real_extract("https://nrkno-skole-prod.kube.nrk.no/skole/api/media/123")
        self.assertEqual(result, "nrk:123")

    def test_match_id(self):
        instance = NRKSkoleIE()
        result = instance._match_id("https://nrkno-skole-prod.kube.nrk.no/skole/api/media/123")
        self.assertEqual(result, "123")

    def test_download_json(self):
        instance = NRKSkoleIE()
        result = instance._download_json("https://nrkno-skole-prod.kube.nrk.no/skole/api/media/123", "123")
        self.assertEqual(result, {'psId': '123'})

    def test_url_result(self):
        instance = NRKSkoleIE()
        result = instance.url_result("nrk:123")
        self.assertEqual(result, "nrk:123")

if __name__ == '__main__':
    unittest.main()