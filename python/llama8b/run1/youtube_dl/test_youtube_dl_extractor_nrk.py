import unittest
from unittest.mock import patch
from youtube_dl.extractor import NRKI


class TestNRKSkoleIE(unittest.TestCase):
    def test_init(self):
        ie = NRKSkoleIE()
        self.assertEqual(ie.__class__, NRKSkoleIE)

    @patch('youtube_dl.extractor.nrk.NRKSkoleIE._match_id')
    @patch('youtube_dl.extractor.nrk.NRKSkoleIE._download_json')
    def test_real_extract(self, mock_download_json, mock_match_id):
        ie = NRKSkoleIE()
        url = 'https://example.com/video'
        mock_match_id.return_value = 'video_id'
        mock_download_json.return_value = {'psId': 'nrk_id'}
        result = ie._real_extract(url)
        self.assertEqual(result, 'nrk:nrk_id')
        mock_match_id.assert_called_once_with(url)
        mock_download_json.assert_called_once_with('https://nrkno-skole-prod.kube.nrk.no/skole/api/media/video_id', 'video_id')

    def test_match_id(self):
        ie = NRKSkoleIE()
        url = 'https://example.com/video'
        result = ie._match_id(url)
        self.assertIsNone(result)

    def test_download_json(self):
        ie = NRKSkoleIE()
        url = 'https://example.com/video'
        result = ie._download_json(url, 'video_id')
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()