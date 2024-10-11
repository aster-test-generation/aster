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
        mock_match_id.return_value = 'video_id'
        mock_download_json.return_value = {'psId': 'nrk_id'}
        result = ie._real_extract('url')
        self.assertEqual(result, 'nrk:nrk_id')

    def test_match_id(self):
        ie = NRKSkoleIE()
        url = 'https://nrkno-skole-prod.kube.nrk.no/skole/api/media/video_id'
        video_id = ie._match_id(url)
        self.assertEqual(video_id, 'video_id')

    def test_download_json(self):
        ie = NRKSkoleIE()
        video_id = 'video_id'
        response = ie._download_json('https://nrkno-skole-prod.kube.nrk.no/skole/api/media/%s' % video_id, video_id)
        self.assertEqual(response, {'psId': 'nrk_id'})

    def test_url_result(self):
        ie = NRKSkoleIE()
        nrk_id = 'nrk_id'
        result = ie.url_result('nrk:%s' % nrk_id)
        self.assertEqual(result, 'nrk:nrk_id')

if __name__ == '__main__':
    unittest.main()