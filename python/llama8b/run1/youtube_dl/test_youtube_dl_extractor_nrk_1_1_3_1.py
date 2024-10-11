import unittest
from youtube_dl.extractor import NRKI


class TestNRKTVIE(unittest.TestCase):
    def test_init(self):
        instance = NRKTVIE()
        self.assertEqual(instance, NRKTVIE())

    def test__match_id(self):
        instance = NRKTVIE()
        url = 'https://nrk.no/video/123456'
        result = instance._match_id(url)
        self.assertEqual(result, '123456')

    def test_url_result(self):
        instance = NRKTVIE()
        video_id = '123456'
        result = instance.url_result('nrk:%s' % video_id, ie='NRKIE.ie_key()', video_id=video_id)
        self.assertEqual(result, 'nrk:%s' % video_id)

    def test_real_extract(self):
        instance = NRKTVIE()
        url = 'https://nrk.no/video/123456'
        result = instance._real_extract(url)
        self.assertEqual(result, {'ie': 'NRKIE.ie_key()', 'video_id': '123456'})

    def test_str_method(self):
        instance = NRKTVIE()
        result = str(instance)
        self.assertEqual(result, 'NRKTVIE')

    def test_repr_method(self):
        instance = NRKTVIE()
        result = repr(instance)
        self.assertEqual(result, 'NRKTVIE()')

if __name__ == '__main__':
    unittest.main()