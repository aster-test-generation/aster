import unittest
from youtube_dl.extractor.nrk import NRKRadioPodkastIE


class TestNRKRadioPodkastIE(unittest.TestCase):
    def setUp(self):
        self.instance = NRKRadioPodkastIE()

    def test_init(self):
        self.assertIsInstance(self.instance, NRKRadioPodkastIE)

    def test_real_extract(self):
        url = 'https://radio.nrk.no/podkast/some_podcast'
        self.instance._match_id = lambda x: 'some_podcast'
        self.instance.url_result = lambda x, ie, video_id: {'url': x, 'ie_key': ie, 'video_id': video_id}
        result = self.instance._real_extract(url)
        self.assertEqual(result, {'url': 'nrk:some_podcast', 'ie_key': 'NRK', 'video_id': 'some_podcast'})

    def test_match_id(self):
        url = 'https://radio.nrk.no/podkast/some_podcast'
        self.instance._match_id = lambda x: 'some_podcast'
        result = self.instance._match_id(url)
        self.assertEqual(result, 'some_podcast')

    def test_url_result(self):
        url = 'nrk:some_podcast'
        ie_key = 'NRK'
        video_id = 'some_podcast'
        result = self.instance.url_result(url, ie=ie_key, video_id=video_id)
        self.assertEqual(result, {'url': url, 'ie_key': ie_key, 'video_id': video_id})

if __name__ == '__main__':
    unittest.main()