import unittest
from youtube_dl.extractor.tf1 import TF1IE


class TestTF1IE(unittest.TestCase):
    def test_init(self):
        instance = TF1IE()
        self.assertIsInstance(instance, InfoExtractor)

    def test_valid_url(self):
        instance = TF1IE()
        url = 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html'
        self.assertTrue(instance.suitable(url))

    def test_real_extract(self):
        instance = TF1IE()
        url = 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test_private__real_extract(self):
        instance = TF1IE()
        url = 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html'
        result = instance._TF1IE__real_extract(url)
        self.assertIsInstance(result, dict)

    def test_download_json(self):
        instance = TF1IE()
        slug = 'quotidien-premiere-partie-11-juin-2019'
        result = instance._download_json('https://www.tf1.fr/graphql/web', slug, query={'id': '9b80783950b85247541dd1d851f9cc7fa36574af015621f853ab111a679ce26f', 'variables': json.dumps({'programSlug': 'tmc', 'slug': slug})})
        self.assertIsInstance(result, dict)

    def test_str_method(self):
        instance = TF1IE()
        result = instance.__str__()
        self.assertEqual(result, 'TF1IE')

    def test_repr_method(self):
        instance = TF1IE()
        result = instance.__repr__()
        self.assertEqual(result, 'TF1IE()')

if __name__ == '__main__':
    unittest.main()