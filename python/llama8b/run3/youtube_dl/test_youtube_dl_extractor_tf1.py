import unittest
from unittest.mock import patch
from youtube_dl.extractor.tf1 import TF1IE


class TestTF1IE(unittest.TestCase):
    def test_valid_url(self):
        ie = TF1IE()
        result = ie._real_extract('https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html')
        self.assertEqual(result['id'], '13641379')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], 'md5:f392bc52245dc5ad43771650c96fb620')
        self.assertEqual(result['description'], 'md5:a02cdb217141fb2d469d6216339b052f')
        self.assertEqual(result['upload_date'], '20190611')
        self.assertEqual(result['timestamp'], 1560273989)
        self.assertEqual(result['duration'], 1738)
        self.assertEqual(result['series'], 'Quotidien avec Yann Barthès')
        self.assertEqual(result['tags'], ['intégrale', 'quotidien', 'Replay'])

    def test_invalid_url(self):
        ie = TF1IE()
        with self.assertRaisesRegex(ValueError, 'Invalid URL'):
            ie._real_extract('invalid_url')

    @patch('youtube_dl.extractor.tf1.TF1IE._download_json')
    def test_download_json(self, mock_download_json):
        ie = TF1IE()
        ie._real_extract('https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html')
        mock_download_json.assert_called_once()

    @patch('youtube_dl.extractor.tf1.TF1IE._download_json')
    def test_download_json_with_query(self, mock_download_json):
        ie = TF1IE()
        ie._real_extract('https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html')
        mock_download_json.assert_called_once_with('https://www.tf1.fr/graphql/web', 'slug', query={'id': '9b80783950b85247541dd1d851f9cc7fa36574af015621f853ab111a679ce26f', 'variables': json.dumps({'programSlug': 'program_slug', 'slug': 'slug'})})

    def test_get_tags(self):
        ie = TF1IE()
        video = {'tags': [{'label': 'tag1'}, {'label': 'tag2'}]}
        tags = ie._get_tags(video)
        self.assertEqual(tags, ['tag1', 'tag2'])

    def test_get_thumbnails(self):
        ie = TF1IE()
        decoration = {'image': {'sources': [{'url': 'url1', 'width': 100}, {'url': 'url2', 'width': 200}]}}
        thumbnails = ie._get_thumbnails(decoration)
        self.assertEqual(thumbnails, [{'url': 'url1', 'width': 100}, {'url': 'url2', 'width': 200}])

    def test_get_description(self):
        ie = TF1IE()
        decoration = {'description': 'description'}
        description = ie._get_description(decoration)
        self.assertEqual(description, 'description')

    def test_get_timestamp(self):
        ie = TF1IE()
        video = {'date': '20190611'}
        timestamp = ie._get_timestamp(video)
        self.assertEqual(timestamp, 1560273989)

    def test_get_duration(self):
        ie = TF1IE()
        video = {'publicPlayingInfos': {'duration': 1738}}
        duration = ie._get_duration(video)
        self.assertEqual(duration, 1738)

    def test_get_season_number(self):
        ie = TF1IE()
        video = {'season': 1}
        season_number = ie._get_season_number(video)
        self.assertEqual(season_number, 1)

    def test_get_episode_number(self):
        ie = TF1IE()
        video = {'episode': 1}
        episode_number = ie._get_episode_number(video)
        self.assertEqual(episode_number, 1)

if __name__ == '__main__':
    unittest.main()