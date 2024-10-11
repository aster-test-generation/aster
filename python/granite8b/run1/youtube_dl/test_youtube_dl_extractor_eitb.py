import unittest
from youtube_dl.extractor.eitb import EitbIE


class TestEitbIE(unittest.TestCase):
    def test_real_extract(self):
        ie = EitbIE()
        video_id = '4090227752001'
        expected_info_dict = {
            'id': '4090227752001',
            'ext': 'mp4',
            'title': '60 minutos (Lasa y Zabala, 30 años)',
            'description': 'Programa de reportajes de actualidad.',
            'duration': 3996.76,
            'timestamp': 1381789200,
            'upload_date': '20131014',
            'tags': list,
        }
        actual_info_dict = ie._real_extract('http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/')
        self.assertEqual(actual_info_dict, expected_info_dict)

if __name__ == '__main__':
    unittest.main()