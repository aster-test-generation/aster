import unittest
from youtube_dl.extractor import NRKI


class TestNRKRadioPodkastIE(unittest.TestCase):
    def test_init(self):
        ie = NRKRadioPodkastIE()
        self.assertEqual(ie.ie_key(), 'NRKIE')

    def test_match_id(self):
        ie = NRKRadioPodkastIE()
        url = 'http://nrk.no/podcast/123456'
        video_id = ie._match_id(url)
        self.assertEqual(video_id, '123456')

    def test_url_result(self):
        ie = NRKRadioPodkastIE()
        video_id = '123456'
        result = ie.url_result('nrk:%s' % video_id, ie=NRKRadioPodkastIE.ie_key(), video_id=video_id)
        self.assertEqual(result, 'nrk:%s' % video_id)

    def test_real_extract(self):
        ie = NRKRadioPodkastIE()
        url = 'http://nrk.no/podcast/123456'
        result = ie._real_extract(url)
        self.assertEqual(result, self.url_result('nrk:%s' % ie._match_id(url), ie=NRKRadioPodkastIE.ie_key(), video_id=ie._match_id(url)))

if __name__ == '__main__':
    unittest.main()