import unittest
from youtube_dl.extractor.nrk import NRKI


class TestNRKRadioPodkastIE(unittest.TestCase):
    def test_init(self):
        instance = nrk.NRKRadioPodkastIE()
        self.assertIsInstance(instance, nrk.InfoExtractor)

    def test_real_extract(self):
        instance = nrk.NRKRadioPodkastIE()
        url = 'https://example.com/nrk/radio/podkast/12345'
        result = instance._real_extract(url)
        self.assertEqual(result, instance.url_result('nrk:12345', ie=nrk.NRKIE.ie_key(), video_id='12345'))

    def test_match_id(self):
        instance = nrk.NRKRadioPodkastIE()
        url = 'https://example.com/nrk/radio/podkast/12345'
        result = instance._match_id(url)
        self.assertEqual(result, '12345')

    def test_url_result(self):
        instance = nrk.NRKRadioPodkastIE()
        result = instance.url_result('nrk:12345', ie=nrk.NRKIE.ie_key(), video_id='12345')
        self.assertEqual(result, {'url': 'nrk:12345', 'ie_key': nrk.NRKIE.ie_key(), 'video_id': '12345'})

    def test___init__(self):
        instance = nrk.NRKRadioPodkastIE()
        self.assertIsInstance(instance, nrk.InfoExtractor)

    def test___str__(self):
        instance = nrk.NRKRadioPodkastIE()
        result = instance.__str__()
        self.assertEqual(result, 'NRKRadioPodkastIE')

    def test___repr__(self):
        instance = nrk.NRKRadioPodkastIE()
        result = instance.__repr__()
        self.assertEqual(result, 'NRKRadioPodkastIE()')

if __name__ == '__main__':
    unittest.main()