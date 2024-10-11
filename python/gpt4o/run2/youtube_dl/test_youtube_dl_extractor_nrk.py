import unittest
from youtube_dl.extractor.nrk import NRKIE
from youtube_dl.utils import ExtractorError


class TestNRKSkoleIE(unittest.TestCase):
    def setUp(self):
        self.instance = NRKSkoleIE()

    def test_init(self):
        self.assertIsInstance(self.instance, NRKSkoleIE)

    def test_real_extract(self):
        url = 'https://example.com/video/12345'
        self.instance._match_id = lambda x: '12345'
        self.instance._download_json = lambda x, y: {'psId': '67890'}
        self.instance.url_result = lambda x: x
        result = self.instance._real_extract(url)
        self.assertEqual(result, 'nrk:67890')

    def test_real_extract_invalid_url(self):
        url = 'https://example.com/video/invalid'
        self.instance._match_id = lambda x: 'invalid'
        self.instance._download_json = lambda x, y: {'psId': None}
        self.instance.url_result = lambda x: x
        with self.assertRaises(ExtractorError):
            self.instance._real_extract(url)

    def test_protected_match_id(self):
        url = 'https://example.com/video/12345'
        self.instance._match_id = lambda x: '12345'
        result = self.instance._match_id(url)
        self.assertEqual(result, '12345')

    def test_private_download_json(self):
        url = 'https://example.com/video/12345'
        self.instance._download_json = lambda x, y: {'psId': '67890'}
        result = self.instance._download_json(url, '12345')
        self.assertEqual(result, {'psId': '67890'})

    def test_private_url_result(self):
        url = 'nrk:67890'
        self.instance.url_result = lambda x: x
        result = self.instance.url_result(url)
        self.assertEqual(result, 'nrk:67890')

if __name__ == '__main__':
    unittest.main()