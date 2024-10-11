import unittest
from youtube_dl.extractor.tf1 import TF1IE


class TestTF1IE(unittest.TestCase):
    def test_real_extract(self):
        instance = TF1IE()
        result = instance._real_extract("https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html")
        self.assertEqual(result['id'], '13641379')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], 'md5:f392bc52245dc5ad43771650c96fb620')
        self.assertEqual(result['description'], 'md5:a02cdb217141fb2d469d6216339b052f')
        self.assertEqual(result['upload_date'], '20190611')
        self.assertEqual(result['timestamp'], 1560273989)
        self.assertEqual(result['duration'], 1738)
        self.assertEqual(result['series'], 'Quotidien avec Yann Barthès')
        self.assertEqual(result['tags'], ['intégrale', 'quotidien', 'Replay'])

    def test_real_extract_2(self):
        instance = TF1IE()
        result = instance._real_extract("http://www.tf1.fr/tf1/koh-lanta/videos/replay-koh-lanta-22-mai-2015.html")
        self.assertEqual(result['id'], '13641379')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], 'md5:f392bc52245dc5ad43771650c96fb620')
        self.assertEqual(result['description'], 'md5:a02cdb217141fb2d469d6216339b052f')
        self.assertEqual(result['upload_date'], '20190611')
        self.assertEqual(result['timestamp'], 1560273989)
        self.assertEqual(result['duration'], 1738)
        self.assertEqual(result['series'], 'Quotidien avec Yann Barthès')
        self.assertEqual(result['tags'], ['intégrale', 'quotidien', 'Replay'])

    def test_real_extract_3(self):
        instance = TF1IE()
        result = instance._real_extract("http://www.tf1.fr/hd1/documentaire/videos/mylene-farmer-d-une-icone.html")
        self.assertEqual(result['id'], '13641379')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], 'md5:f392bc52245dc5ad43771650c96fb620')
        self.assertEqual(result['description'], 'md5:a02cdb217141fb2d469d6216339b052f')
        self.assertEqual(result['upload_date'], '20190611')
        self.assertEqual(result['timestamp'], 1560273989)
        self.assertEqual(result['duration'], 1738)
        self.assertEqual(result['series'], 'Quotidien avec Yann Barthès')
        self.assertEqual(result['tags'], ['intégrale', 'quotidien', 'Replay'])

if __name__ == '__main__':
    unittest.main()