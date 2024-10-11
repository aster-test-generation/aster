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

    def test_private_method__real_extract(self):
        instance = TF1IE()
        url = 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html'
        result = instance._TF1IE__real_extract(url)
        self.assertIsInstance(result, dict)

    def test_protected_method_download_json(self):
        instance = TF1IE()
        url = 'https://www.tf1.fr/graphql/web'
        slug = 'quotidien-premiere-partie-11-juin-2019'
        query = {'id': '9b80783950b85247541dd1d851f9cc7fa36574af015621f853ab111a679ce26f', 'variables': json.dumps({'programSlug': 'tmc', 'slug': slug})}
        result = instance._download_json(url, slug, query)
        self.assertIsInstance(result, dict)

    def test_magic_method_str(self):
        instance = TF1IE()
        result = str(instance)
        self.assertIsInstance(result, str)

    def test_magic_method_repr(self):
        instance = TF1IE()
        result = repr(instance)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()