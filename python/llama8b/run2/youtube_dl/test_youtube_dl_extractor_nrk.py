import unittest
from unittest.mock import patch
from youtube_dl.extractor import NRKI


class TestNRKSkoleIE(unittest.TestCase):
    def setUp(self):
        self.ie = NRKSkoleIE()

    def test_init(self):
        self.assertEqual(self.ie.__class__, NRKSkoleIE)

    def test_match_id(self):
        with patch.object(self.ie, '_download_json') as mock_download_json:
            mock_download_json.return_value = {'psId': 'test_id'}
            video_id = self.ie._match_id('https://example.com/video_id')
            self.assertEqual(video_id, 'test_id')

    def test_download_json(self):
        with patch('requests.get') as mock_get:
            mock_get.return_value.json.return_value = {'psId': 'test_id'}
            self.ie._download_json('https://example.com/api', 'test_id')
            mock_get.assert_called_once_with('https://example.com/api', headers={'User-Agent': 'youtube-dl'})

    def test_url_result(self):
        result = self.ie.url_result('nrk:test_id')
        self.assertEqual(result, {'id': 'test_id', 'ie_key': 'NRKSkoleIE'})

    def test_real_extract(self):
        with patch.object(self.ie, '_match_id') as mock_match_id, \
             patch.object(self.ie, '_download_json') as mock_download_json:
            mock_match_id.return_value = 'test_id'
            mock_download_json.return_value = {'psId': 'test_id'}
            result = self.ie._real_extract('https://example.com/video_id')
            self.assertEqual(result, {'id': 'test_id', 'ie_key': 'NRKSkoleIE'})

if __name__ == '__main__':
    unittest.main()