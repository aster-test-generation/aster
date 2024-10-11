import unittest
from youtube_dl.extractor.nrk import NRKTVIE, NRKIE, InfoExtracto


class TestNRKTVIE(unittest.TestCase):
    def test_init(self):
        instance = NRKTVIE()
        self.assertIsInstance(instance, NRKTVIE)

    def test_real_extract(self):
        instance = NRKTVIE()
        url = 'https://example.com/video'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test_match_id(self):
        instance = NRKTVIE()
        url = 'https://example.com/video?id=123'
        result = instance._match_id(url)
        self.assertEqual(result, '123')

    def test_url_result(self):
        instance = NRKTVIE()
        url = 'https://example.com/video'
        result = instance.url_result(url)
        self.assertIsInstance(result, dict)

    def test_ie_key(self):
        instance = NRKTVIE()
        result = instance.ie_key()
        self.assertEqual(result, 'NRKTV')

    def test___init__(self):
        instance = NRKTVIE()
        self.assertIsInstance(instance, NRKTVIE)

    def test___str__(self):
        instance = NRKTVIE()
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = NRKTVIE()
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        instance1 = NRKTVIE()
        instance2 = NRKTVIE()
        self.assertEqual(instance1, instance2)

class TestInfoExtractor(unittest.TestCase):
    def test___init__(self):
        instance = InfoExtractor()
        self.assertIsInstance(instance, InfoExtractor)

    def test___str__(self):
        instance = InfoExtractor()
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = InfoExtractor()
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        instance1 = InfoExtractor()
        instance2 = InfoExtractor()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()