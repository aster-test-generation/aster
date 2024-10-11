import unittest
from youtube_dl.extractor.eitb import EitbIE


class TestEitbIE(unittest.TestCase):
    def test_real_extract(self):
        instance = EitbIE()
        result = instance._real_extract("http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/")
        self.assertEqual(result, {'id': '4090227752001', 'ext': 'mp4', 'title': '60 minutos (Lasa y Zabala, 30 años)', 'description': 'Programa de reportajes de actualidad.', 'duration': 3996.76, 'timestamp': 1381789200, 'upload_date': '20131014', 'tags': list})

    def test_info_extractor(self):
        instance = EitbIE()
        result = instance.info_extractor("http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/")
        self.assertEqual(result, {'id': '4090227752001', 'ext': 'mp4', 'title': '60 minutos (Lasa y Zabala, 30 años)', 'description': 'Programa de reportajes de actualidad.', 'duration': 3996.76, 'timestamp': 1381789200, 'upload_date': '20131014', 'tags': list})

    def test_IE_NAME(self):
        instance = EitbIE()
        result = instance.IE_NAME
        self.assertEqual(result, 'eitb.tv')

    def test_valid_url(self):
        instance = EitbIE()
        result = instance._VALID_URL
        self.assertEqual(result, r'https?://(?:www\.)?eitb\.tv/(?:eu/bideoa|es/video)/[^/]+/\d+/(?P<id>\d+)')

    def test_test(self):
        instance = EitbIE()
        result = instance._TEST
        self.assertEqual(result, {'url': 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/', 'md5': 'edf4436247185adee3ea18ce64c47998', 'info_dict': {'id': '4090227752001', 'ext': 'mp4', 'title': '60 minutos (Lasa y Zabala, 30 años)', 'description': 'Programa de reportajes de actualidad.', 'duration': 3996.76, 'timestamp': 1381789200, 'upload_date': '20131014', 'tags': list}})

if __name__ == '__main__':
    unittest.main()