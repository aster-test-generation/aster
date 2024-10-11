import unittest
from youtube_dl.extractor.nrk import NRKSkoleI


class TestNRKSkoleIE(unittest.TestCase):
    def test___init__(self):
        instance = NRKSkoleIE()
        self.assertIsInstance(instance, NRKSkoleIE)

    def test__real_extract(self):
        instance = NRKSkoleIE()
        url = 'https://example.com/video/12345'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test__match_id(self):
        instance = NRKSkoleIE()
        url = 'https://example.com/video/12345'
        result = instance._match_id(url)
        self.assertIsInstance(result, str)

    def test__download_json(self):
        instance = NRKSkoleIE()
        url = 'https://example.com/api/data'
        result = instance._download_json(url, 'video_id')
        self.assertIsInstance(result, dict)

    def test_url_result(self):
        instance = NRKSkoleIE()
        url = 'nrk:12345'
        result = instance.url_result(url)
        self.assertIsInstance(result, dict)

    def test___str__(self):
        instance = NRKSkoleIE()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = NRKSkoleIE()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestInfoExtractor(unittest.TestCase):
    def test___init__(self):
        instance = InfoExtractor()
        self.assertIsInstance(instance, InfoExtractor)

    def test___str__(self):
        instance = InfoExtractor()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = InfoExtractor()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()