import unittest
from youtube_dl.extractor.eitb import EitbIE


class TestEitbIE(unittest.TestCase):
    def test_real_extract(self):
        instance = EitbIE()
        result = instance._real_extract("http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/")
        self.assertEqual(result, {
            'id': '4090227752001',
            'ext': 'mp4',
            'title': '60 minutos (Lasa y Zabala, 30 años)',
            'description': 'Programa de reportajes de actualidad.',
            'duration': 3996.76,
            'timestamp': 1381789200,
            'upload_date': '20131014',
            'tags': list,
        })

    def test_real_extract_2(self):
        instance = EitbIE()
        result = instance.to_screen(instance._real_extract("http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/"))
        self.assertEqual(result, {
            'id': '4090227752001',
            'ext': 'mp4',
            'title': '60 minutos (Lasa y Zabala, 30 años)',
            'description': 'Programa de reportajes de actualidad.',
            'duration': 3996.76,
            'timestamp': 1381789200,
            'upload_date': '20131014',
            'tags': list,
        })

if __name__ == '__main__':
    unittest.main()