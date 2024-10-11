import unittest
from unittest.mock import patch
from youtube_dl.extractor.tf1 import TF1IE, InfoExtractor


class TestTF1IE(unittest.TestCase):
    def test_valid_url(self):
        ie = TF1IE()
        url = 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html'
        result = ie._real_extract(url)
        self.assertIn('_type', result)
        self.assertIn('id', result)
        self.assertIn('title', result)
        self.assertIn('thumbnails', result)
        self.assertIn('description', result)
        self.assertIn('timestamp', result)
        self.assertIn('duration', result)
        self.assertIn('tags', result)
        self.assertIn('series', result)
        self.assertIn('season_number', result)
        self.assertIn('episode_number', result)

    def test_invalid_url(self):
        ie = TF1IE()
        url = 'https://www.tf1.fr/invalid-url'
        with self.assertRaisesRegex(Exception, 'Invalid URL'):
            ie._real_extract(url)

    @patch('youtube_dl.extractor.tf1.TF1IE._download_json')
    def test_download_json(self, mock_download_json):
        ie = TF1IE()
        url = 'https://www.tf1.fr/graphql/web'
        query = {
            'id': '9b80783950b85247541dd1d851f9cc7fa36574af015621f853ab111a679ce26f',
            'variables': json.dumps({
                'programSlug': 'program_slug',
                'slug': 'slug',
            })
        }
        video = {'data': {'videoBySlug': {'streamId': 'wat_id'}}}
        mock_download_json.return_value = video
        result = ie._real_extract(url)
        self.assertEqual(result['id'], 'wat_id')

    def test_private_method(self):
        ie = TF1IE()
        result = ie._TF1IE__private_method()
        self.assertIsNone(result)

    def test_protected_method(self):
        ie = TF1IE()
        result = ie._protected_method()
        self.assertIsNone(result)

    def test_str_method(self):
        ie = TF1IE()
        result = str(ie)
        self.assertEqual(result, 'TF1IE')

    def test_repr_method(self):
        ie = TF1IE()
        result = repr(ie)
        self.assertEqual(result, 'TF1IE()')

    def test_eq_method(self):
        ie1 = TF1IE()
        ie2 = TF1IE()
        self.assertTrue(ie1 == ie2)

if __name__ == '__main__':
    unittest.main()