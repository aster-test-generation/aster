import re
import unittest
from youtube_dl.extractor.tf1 import TF1IE
from youtube_dl.utils import int_or_none, parse_iso8601, try_get
from unittest.mock import patch, Mock


class TestTF1IE(unittest.TestCase):
    def setUp(self):
        self.extractor = TF1IE()

    def test__real_extract(self):
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
            'date': '2019-06-11T12:33:09Z',
            'publicPlayingInfos': {'duration': 1738},
            'season': '1',
            'episode': '1'
        }

        with patch.object(self.extractor, '_download_json', return_value={'data': {'videoBySlug': mock_video}}):
            result = self.extractor._real_extract(url)
            self.assertEqual(result['id'], '13641379')
            self.assertEqual(result['title'], 'Quotidien première partie - 11 juin 2019')
            self.assertEqual(result['tags'], ['intégrale', 'quotidien', 'Replay'])
            self.assertEqual(result['description'], 'Some description')
            self.assertEqual(result['series'], 'Quotidien avec Yann Barthès')
            self.assertEqual(result['thumbnails'][0]['url'], 'http://example.com/image.jpg')
            self.assertEqual(result['timestamp'], parse_iso8601('2019-06-11T12:33:09Z'))
            self.assertEqual(result['duration'], 1738)
            self.assertEqual(result['season_number'], 1)
            self.assertEqual(result['episode_number'], 1)

    def test__VALID_URL(self):
        self.assertTrue(re.match(TF1IE._VALID_URL, 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html'))

    def test__TESTS(self):
        self.assertEqual(len(TF1IE._TESTS), 3)
        self.assertIn('url', TF1IE._TESTS[0])
        self.assertIn('info_dict', TF1IE._TESTS[0])

if __name__ == '__main__':
    unittest.main()