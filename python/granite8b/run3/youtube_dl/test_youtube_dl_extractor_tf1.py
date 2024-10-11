import unittest
from youtube_dl.extractor.tf1 import TF1IE


class TestTF1IE(unittest.TestCase):
    def test_real_extract(self):
        ie = TF1IE()
        video = ie._real_extract('https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html')
        self.assertEqual(video['id'], '13641379')
        self.assertEqual(video['ext'], 'mp4')
        self.assertEqual(video['title'], 'md5:f392bc52245dc5ad43771650c96fb620')
        self.assertEqual(video['description'], 'md5:a02cdb217141fb2d469d6216339b052f')
        self.assertEqual(video['upload_date'], '20190611')
        self.assertEqual(video['timestamp'], 1560273989)
        self.assertEqual(video['duration'], 1738)
        self.assertEqual(video['series'], 'Quotidien avec Yann Barthès')
        self.assertEqual(video['tags'], ['intégrale', 'quotidien', 'Replay'])

if __name__ == '__main__':
    unittest.main()