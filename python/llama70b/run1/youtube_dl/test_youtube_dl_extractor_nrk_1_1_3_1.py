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

    def test___str__(self):
        instance = NRKTVIE()
        result = instance.__str__()
        self.assertEqual(result, 'NRKTVIE')

    def test___repr__(self):
        instance = NRKTVIE()
        result = instance.__repr__()
        self.assertEqual(result, 'NRKTVIE()')

class TestInfoExtractor(unittest.TestCase):
    def test___init__(self):
        instance = InfoExtractor()
        self.assertIsInstance(instance, InfoExtractor)

    def test___str__(self):
        instance = InfoExtractor()
        result = instance.__str__()
        self.assertEqual(result, 'InfoExtractor')

    def test___repr__(self):
        instance = InfoExtractor()
        result = instance.__repr__()
        self.assertEqual(result, 'InfoExtractor()')

if __name__ == '__main__':
    unittest.main()