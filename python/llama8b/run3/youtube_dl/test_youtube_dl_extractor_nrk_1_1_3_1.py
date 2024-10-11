import unittest
from youtube_dl.extractor import NRKI


class TestNRKTVIE(unittest.TestCase):
    def test_init(self):
        instance = NRKTVIE()
        self.assertEqual(instance, NRKTVIE())

    def test_match_id(self):
        instance = NRKTVIE()
        url = 'http://www.nrk.no/tv/program/program-id'
        video_id = instance._match_id(url)
        self.assertEqual(video_id, 'program-id')

    def test_url_result(self):
        instance = NRKTVIE()
        video_id = 'program-id'
        ie_key = 'NRKIE'
        result = instance.url_result('nrk:%s' % video_id, ie=ie_key, video_id=video_id)
        self.assertEqual(result, 'nrk:%s' % video_id)

    def test_real_extract(self):
        instance = NRKTVIE()
        url = 'http://www.nrk.no/tv/program/program-id'
        video_id = instance._match_id(url)
        result = instance._real_extract(url)
        self.assertEqual(result, {'ie': 'NRKIE', 'video_id': video_id})

if __name__ == '__main__':
    unittest.main()