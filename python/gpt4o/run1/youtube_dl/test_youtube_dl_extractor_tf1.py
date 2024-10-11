import unittest
from youtube_dl.extractor.tf1 import TF1IE
from youtube_dl.utils import ExtractorError
from unittest.mock import patch, MagicMock


class TestTF1IE(unittest.TestCase):
    def setUp(self):
        self.extractor = TF1IE()

    def test__real_extract(self):
        url = 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html'
        result = self.extractor._real_extract(url)
        self.assertEqual(result['id'], '13641379')

    def test__real_extract_invalid_url(self):
        url = 'https://www.invalid-url.com'
        with self.assertRaises(ExtractorError):
            self.extractor._real_extract(url)

    def test__real_extract_no_video(self):
        url = 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/non-existent-video.html'
        with self.assertRaises(KeyError):
            self.extractor._real_extract(url)

    def test__VALID_URL(self):
        self.assertTrue(re.match(TF1IE._VALID_URL, 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html'))

    def test__TESTS(self):
        self.assertIsInstance(TF1IE._TESTS, list)
        self.assertGreater(len(TF1IE._TESTS), 0)

    def test__download_json(self):
        url = 'https://www.tf1.fr/graphql/web'
        query = {
            'id': '9b80783950b85247541dd1d851f9cc7fa36574af015621f853ab111a679ce26f',
            'variables': json.dumps({
                'programSlug': 'quotidien-avec-yann-barthes',
                'slug': 'quotidien-premiere-partie-11-juin-2019',
            })
        }
        result = self.extractor._download_json(url, 'test', query=query)
        self.assertIn('data', result)

    def test__parse_iso8601(self):
        date_str = '2019-06-11T20:59:49+02:00'
        result = parse_iso8601(date_str)
        self.assertEqual(result, 1560273989)

    def test__int_or_none(self):
        self.assertEqual(int_or_none('123'), 123)
        self.assertIsNone(int_or_none(None))

    def test__try_get(self):
        data = {'key': 'value'}
        result = try_get(data, lambda x: x['key'])
        self.assertEqual(result, 'value')

class TestTF1IE(unittest.TestCase):
    def setUp(self):
        self.extractor = TF1IE()

    def test_real_extract(self):
        url = 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html'
        mock_video = {
            'streamId': '13641379',
            'title': 'Quotidien première partie - 11 juin 2019',
            'tags': [{'label': 'intégrale'}, {'label': 'quotidien'}, {'label': 'Replay'}],
            'decoration': {
                'description': 'Some description',
                'programLabel': 'Quotidien avec Yann Barthès',
                'image': {
                    'sources': [{'url': 'http://example.com/image.jpg', 'width': 640}]
                }
            },
            'date': '2019-06-11T12:33:09+00:00',
            'publicPlayingInfos': {'duration': 1738},
            'season': '1',
            'episode': '1'
        }

        with patch.object(self.extractor, '_download_json', return_value={'data': {'videoBySlug': mock_video}}):
            result = self.extractor._real_extract(url)
            self.assertEqual(result['id'], '13641379')
            self.assertEqual(result['url'], 'wat:13641379')
            self.assertEqual(result['title'], 'Quotidien première partie - 11 juin 2019')
            self.assertEqual(result['description'], 'Some description')
            self.assertEqual(result['timestamp'], 1560273989)
            self.assertEqual(result['duration'], 1738)
            self.assertEqual(result['tags'], ['intégrale', 'quotidien', 'Replay'])
            self.assertEqual(result['series'], 'Quotidien avec Yann Barthès')
            self.assertEqual(result['season_number'], 1)
            self.assertEqual(result['episode_number'], 1)
            self.assertEqual(result['thumbnails'][0]['url'], 'http://example.com/image.jpg')
            self.assertEqual(result['thumbnails'][0]['width'], 640)

    def test_protected_method(self):
        # Assuming there's a protected method to test
        pass

    def test_private_method(self):
        # Assuming there's a private method to test
        pass

    def test_str_method(self):
        # Assuming there's a __str__ method to test
        pass

    def test_repr_method(self):
        # Assuming there's a __repr__ method to test
        pass

if __name__ == '__main__':
    unittest.main()