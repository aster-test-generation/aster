import unittest
from youtube_dl.extractor.eitb import EitbIE



class TestEitbIE(unittest.TestCase):
    def test_real_extract(self):
        instance = EitbIE()
        result = instance._real_extract('http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/')
        self.assertEqual(result['id'], '4090227752001')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], '60 minutos (Lasa y Zabala, 30 años)')
        self.assertEqual(result['description'], 'Programa de reportajes de actualidad.')
        self.assertEqual(result['duration'], 3996.76)
        self.assertEqual(result['timestamp'], 1381789200)
        self.assertEqual(result['upload_date'], '20131014')
        self.assertEqual(result['tags'], list)

    def test_real_extract_2(self):
        instance = EitbIE()
        result = instance.to_screen(instance._real_extract('http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'))
        self.assertEqual(result['id'], '4090227752001')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], '60 minutos (Lasa y Zabala, 30 años)')
        self.assertEqual(result['description'], 'Programa de reportajes de actualidad.')
        self.assertEqual(result['duration'], 3996.76)
        self.assertEqual(result['timestamp'], 1381789200)
        self.assertEqual(result['upload_date'], '20131014')
        self.assertEqual(result['tags'], list)

    def test_real_extract_3(self):
        instance = EitbIE()
        result = instance._real_extract('http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/')
        self.assertEqual(result['id'], '4090227752001')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], '60 minutos (Lasa y Zabala, 30 años)')
        self.assertEqual(result['description'], 'Programa de reportajes de actualidad.')
        self.assertEqual(result['duration'], 3996.76)
        self.assertEqual(result['timestamp'], 1381789200)
        self.assertEqual(result['upload_date'], '20131014')
        self.assertEqual(result['tags'], list)

if __name__ == '__main__':
    unittest.main()