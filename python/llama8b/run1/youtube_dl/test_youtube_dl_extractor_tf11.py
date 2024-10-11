import unittest
from unittest.mock import patch
from youtube_dl.extractor.tf1 import TF1IE

class TestTF1IE(unittest.TestCase):
    def test__real_extract(self):
        ie = TF1IE()
        with patch('youtube_dl.extractor.tf1.TF1IE._download_json') as mock_download_json:
            mock_download_json.return_value = {'data': {'videoBySlug': {'streamId': '123456'}}}
            result = ie._real_extract('https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html')
            self.assertEqual(result, {
                '_type': 'url_transparent',
                'id': '123456',
                'url': 'wat:123456',
                'title': None,
                'thumbnails': [],
                'description': None,
                'timestamp': None,
                'duration': None,
                'tags': [],
                'series': None,
                'season_number': None,
                'episode_number': None,
            })

    def test__real_extract_invalid_url(self):
        ie = TF1IE()
        with self.assertRaisesRegex(ValueError, 'Invalid URL'):
            ie._real_extract('invalid_url')

    def test__real_extract_invalid_program_slug(self):
        ie = TF1IE()
        with self.assertRaisesRegex(ValueError, 'Invalid program slug'):
            ie._real_extract('https://www.tf1.fr/invalid_program_slug/videos/quotidien-premiere-partie-11-juin-2019.html')

    def test__real_extract_invalid_slug(self):
        ie = TF1IE()
        with self.assertRaisesRegex(ValueError, 'Invalid slug'):
            ie._real_extract('https://www.tf1.fr/tmc/invalid_slug/videos/quotidien-premiere-partie-11-juin-2019.html')

    def test__real_extract_invalid_json(self):
        ie = TF1IE()
        with patch('youtube_dl.extractor.tf1.TF1IE._download_json') as mock_download_json:
            mock_download_json.return_value = {'error': 'Invalid JSON'}
            with self.assertRaisesRegex(ValueError, 'Invalid JSON'):
                ie._real_extract('https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html')

    def test__real_extract_invalid_video(self):
        ie = TF1IE()
        with patch('youtube_dl.extractor.tf1.TF1IE._download_json') as mock_download_json:
            mock_download_json.return_value = {'data': {'videoBySlug': None}}
            with self.assertRaisesRegex(ValueError, 'Invalid video'):
                ie._real_extract('https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html')

if __name__ == '__main__':
    unittest.main()