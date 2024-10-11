import unittest
from youtube_dl.extractor.nrk import NRKRadioPodkastIE, NRKI


class TestNRKRadioPodkastIE(unittest.TestCase):
    def test___init__(self):
        instance = NRKRadioPodkastIE()
        self.assertIsInstance(instance, InfoExtractor)

    def test__real_extract(self):
        instance = NRKRadioPodkastIE()
        url = 'https://example.com/nrk/podkast/12345'
        result = instance._real_extract(url)
        self.assertEqual(result.url, 'nrk:12345')

    def test__match_id(self):
        instance = NRKRadioPodkastIE()
        url = 'https://example.com/nrk/podkast/12345'
        result = instance._match_id(url)
        self.assertEqual(result, '12345')

    def test___str__(self):
        instance = NRKRadioPodkastIE()
        result = str(instance)
        self.assertEqual(result, 'NRKRadioPodkastIE')

    def test___repr__(self):
        instance = NRKRadioPodkastIE()
        result = repr(instance)
        self.assertEqual(result, 'NRKRadioPodkastIE()')

    def test___eq__(self):
        instance1 = NRKRadioPodkastIE()
        instance2 = NRKRadioPodkastIE()
        self.assertEqual(instance1, instance2)

class TestInfoExtractor(unittest.TestCase):
    def test___init__(self):
        instance = InfoExtractor()
        self.assertIsInstance(instance, object)

    def test_url_result(self):
        instance = InfoExtractor()
        result = instance.url_result('https://example.com')
        self.assertEqual(result.url, 'https://example.com')

if __name__ == '__main__':
    unittest.main()