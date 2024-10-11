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
            self.assertEqual(result['url'], 'wat:13641379')
            self.assertEqual(result['title'], 'Quotidien première partie - 11 juin 2019')
            self.assertEqual(result['description'], 'Some description')
            self.assertEqual(result['timestamp'], parse_iso8601('2019-06-11T12:33:09Z'))
            self.assertEqual(result['duration'], 1738)
            self.assertEqual(result['tags'], ['intégrale', 'quotidien', 'Replay'])
            self.assertEqual(result['series'], 'Quotidien avec Yann Barthès')
            self.assertEqual(result['season_number'], 1)
            self.assertEqual(result['episode_number'], 1)
            self.assertEqual(result['thumbnails'][0]['url'], 'http://example.com/image.jpg')
            self.assertEqual(result['thumbnails'][0]['width'], 640)

    def test__real_extract_no_tags(self):
        url = 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html'
        mock_video = {
            'streamId': '13641379',
            'title': 'Quotidien première partie - 11 juin 2019',
            'tags': [],
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
            self.assertEqual(result['tags'], [])

    def test__real_extract_no_thumbnails(self):
        url = 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html'
        mock_video = {
            'streamId': '13641379',
            'title': 'Quotidien première partie - 11 juin 2019',
            'tags': [{'label': 'intégrale'}, {'label': 'quotidien'}, {'label': 'Replay'}],
            'decoration': {
                'description': 'Some description',
                'programLabel': 'Quotidien avec Yann Barthès',
                'image': {
                    'sources': []
                }
            },
            'date': '2019-06-11T12:33:09Z',
            'publicPlayingInfos': {'duration': 1738},
            'season': '1',
            'episode': '1'
        }

        with patch.object(self.extractor, '_download_json', return_value={'data': {'videoBySlug': mock_video}}):
            result = self.extractor._real_extract(url)
            self.assertEqual(result['thumbnails'], [])

    def test__real_extract_no_decoration(self):
        url = 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html'
        mock_video = {
            'streamId': '13641379',
            'title': 'Quotidien première partie - 11 juin 2019',
            'tags': [{'label': 'intégrale'}, {'label': 'quotidien'}, {'label': 'Replay'}],
            'decoration': None,
            'date': '2019-06-11T12:33:09Z',
            'publicPlayingInfos': {'duration': 1738},
            'season': '1',
            'episode': '1'
        }

        with patch.object(self.extractor, '_download_json', return_value={'data': {'videoBySlug': mock_video}}):
            result = self.extractor._real_extract(url)
            self.assertEqual(result['description'], None)
            self.assertEqual(result['series'], None)
            self.assertEqual(result['thumbnails'], [])

if __name__ == '__main__':
    unittest.main()