import unittest
from youtube_dl.extractor.eitb import EitbIE


class TestEitbIE(unittest.TestCase):
    def test_real_extract(self):
        ie = EitbIE()
        video_id = '4090227752001'
        video = ie._real_extract('http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/%s/lasa-y-zabala-30-anos/' % video_id)
        self.assertEqual(video['id'], video_id)
        self.assertEqual(video['title'], '60 minutos (Lasa y Zabala, 30 años)')
        self.assertEqual(video['description'], 'Programa de reportajes de actualidad.')
        self.assertEqual(video['duration'], 3996.76)
        self.assertEqual(video['timestamp'], 1381789200)
        self.assertEqual(video['upload_date'], '20131014')
        self.assertTrue(isinstance(video['tags'], list))

if __name__ == '__main__':
    unittest.main()