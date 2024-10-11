import unittest
from unittest.mock import patch
from youtube_dl.extractor import NRKI


class TestNRKRadioPodkastIE(unittest.TestCase):
    def test_init(self):
        ie = NRKRadioPodkastIE()
        self.assertEqual(ie.ie_key(), 'NRKIE')

    @patch('youtube_dl.extractor.nrk.NRKIE.ie_key')
    def test_match_id(self, mock_ie_key):
        ie = NRKRadioPodkastIE()
        url = 'https://nrk.no/podcast/12345'
        video_id = ie._match_id(url)
        self.assertEqual(video_id, '12345')
        mock_ie_key.assert_called_once()

    @patch('youtube_dl.extractor.nrk.NRKIE.ie_key')
    def test_real_extract(self, mock_ie_key):
        ie = NRKRadioPodkastIE()
        url = 'https://nrk.no/podcast/12345'
        video_id = '12345'
        result = ie._real_extract(url)
        self.assertEqual(result['ie_key'], 'NRKIE')
        self.assertEqual(result['video_id'], video_id)

    def test_str_method(self):
        ie = NRKRadioPodkastIE()
        result = str(ie)
        self.assertEqual(result, 'NRKRadioPodkastIE')

    def test_repr_method(self):
        ie = NRKRadioPodkastIE()
        result = repr(ie)
        self.assertEqual(result, 'NRKRadioPodkastIE()')

if __name__ == '__main__':
    unittest.main()