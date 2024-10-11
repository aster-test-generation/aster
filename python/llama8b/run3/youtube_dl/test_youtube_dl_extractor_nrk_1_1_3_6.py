import unittest
from unittest.mock import patch
from youtube_dl.extractor import NRKRadioPodkastI


class TestNRKRadioPodkastIE(unittest.TestCase):
    def setUp(self):
        self.ie = NRKRadioPodkastIE()

    def test_init(self):
        self.assertEqual(self.ie.__class__, NRKRadioPodkastIE)

    def test_match_id(self):
        url = 'https://nrk.no/podcast/12345'
        video_id = self.ie._match_id(url)
        self.assertEqual(video_id, '12345')

    def test_real_extract(self):
        url = 'https://nrk.no/podcast/12345'
        video_id = self.ie._match_id(url)
        result = self.ie._real_extract(url)
        self.assertEqual(result['ie'], 'NRKIE')
        self.assertEqual(result['video_id'], video_id)

    def test_url_result(self):
        video_id = '12345'
        result = self.ie.url_result('nrk:%s' % video_id, ie='NRKIE', video_id=video_id)
        self.assertEqual(result['ie'], 'NRKIE')
        self.assertEqual(result['video_id'], video_id)

    def test_str_method(self):
        result = str(self.ie)
        self.assertEqual(result, 'NRKRadioPodkastIE')

    def test_repr_method(self):
        result = repr(self.ie)
        self.assertEqual(result, 'NRKRadioPodkastIE()')

    @patch('youtube_dl.extractor.nrk.NRKIE.ie_key')
    def test_real_extract_ie_key(self, mock_ie_key):
        url = 'https://nrk.no/podcast/12345'
        video_id = self.ie._match_id(url)
        result = self.ie._real_extract(url)
        mock_ie_key.assert_called_once()

if __name__ == '__main__':
    unittest.main()