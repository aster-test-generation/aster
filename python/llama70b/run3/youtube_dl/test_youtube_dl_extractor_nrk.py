import unittest
from youtube_dl.extractor.nrk import NRKSkoleI


class TestNRKSkoleIE(unittest.TestCase):
    def test_init(self):
        instance = NRKSkoleIE()
        self.assertIsInstance(instance, NRKSkoleIE)

    def test_real_extract(self):
        instance = NRKSkoleIE()
        url = 'https://example.com/video'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test_match_id(self):
        instance = NRKSkoleIE()
        url = 'https://example.com/video?id=123'
        result = instance._match_id(url)
        self.assertEqual(result, '123')

    def test_download_json(self):
        instance = NRKSkoleIE()
        url = 'https://example.com/api'
        result = instance._download_json(url, 'video_id')
        self.assertIsInstance(result, dict)

    def test_url_result(self):
        instance = NRKSkoleIE()
        url = 'nrk:123'
        result = instance.url_result(url)
        self.assertIsInstance(result, dict)

    def test_private__match_id(self):
        instance = NRKSkoleIE()
        url = 'https://example.com/video?id=123'
        result = instance._NRKSkoleIE__match_id(url)
        self.assertEqual(result, '123')

    def test_str_method(self):
        instance = NRKSkoleIE()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = NRKSkoleIE()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = NRKSkoleIE()
        instance2 = NRKSkoleIE()
        self.assertTrue(instance1 == instance2)

class TestInfoExtractor(unittest.TestCase):
    def test_init(self):
        instance = InfoExtractor()
        self.assertIsInstance(instance, InfoExtractor)

    def test_str_method(self):
        instance = InfoExtractor()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = InfoExtractor()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = InfoExtractor()
        instance2 = InfoExtractor()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()