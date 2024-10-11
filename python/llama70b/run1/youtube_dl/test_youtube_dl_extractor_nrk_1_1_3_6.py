import unittest
from youtube_dl.extractor.nrk import NRKI


class TestNRKRadioPodkastIE(unittest.TestCase):
    def test___init__(self):
        instance = nrk.NRKRadioPodkastIE()
        self.assertIsInstance(instance, nrk.InfoExtractor)

    def test__real_extract(self):
        instance = nrk.NRKRadioPodkastIE()
        url = 'https://example.com/nrk/radio/podkast/12345'
        result = instance._real_extract(url)
        self.assertEqual(result, {'_type': 'url', 'url': 'nrk:12345', 'ie_key': 'NRKIE', 'video_id': '12345'})

    def test__match_id(self):
        instance = nrk.NRKRadioPodkastIE()
        url = 'https://example.com/nrk/radio/podkast/12345'
        result = instance._match_id(url)
        self.assertEqual(result, '12345')

    def test___str__(self):
        instance = nrk.NRKRadioPodkastIE()
        result = str(instance)
        self.assertEqual(result, '<NRKRadioPodkastIE>')

    def test___repr__(self):
        instance = nrk.NRKRadioPodkastIE()
        result = repr(instance)
        self.assertEqual(result, '<NRKRadioPodkastIE>')

if __name__ == '__main__':
    unittest.main()