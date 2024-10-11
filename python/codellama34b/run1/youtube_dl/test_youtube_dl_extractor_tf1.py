import unittest
from youtube_dl.extractor.tf1 import *


class TestTF1IE(unittest.TestCase):
    def test_real_extract(self):
        program_slug, slug = re.match(TF1IE._VALID_URL, 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html').groups()
        video = self.test_download_json(
            'https://www.tf1.fr/graphql/web', slug, query={
                'id': '9b80783950b85247541dd1d851f9cc7fa36574af015621f853ab111a679ce26f',
                'variables': json.dumps({
                    'programSlug': program_slug,
                    'slug': slug,
                })
            })['data']['videoBySlug']
        wat_id = video['streamId']
        tags = []
        for tag in (video.get('tags') or []):
            label = tag.get('label')
            if not label:
                continue
            tags.append(label)
        decoration = video.get('decoration') or {}
        thumbnails = []
        for source in (try_get(decoration, lambda x: x['image']['sources'], list) or []):
            source_url = source.get('url')
            if not source_url:
                continue
            thumbnails.append({
                'url': source_url,
                'width': int_or_none(source.get('width')),
            })
        result = {
            '_type': 'url_transparent',
            'id': wat_id,
            'url': 'wat:' + wat_id,
            'title': video.get('title'),
            'thumbnails': thumbnails,
            'description': decoration.get('description'),
            'timestamp': parse_iso8601(video.get('date')),
            'duration': int_or_none(try_get(video, lambda x: x['publicPlayingInfos']['duration'])),
            'tags': tags,
            'series': decoration.get('programLabel'),
            'season_number': int_or_none(video.get('season')),
            'episode_number': int_or_none(video.get('episode')),
        }
        self.assertEqual(result['_type'], 'url_transparent')
        self.assertEqual(result['id'], wat_id)
        self.assertEqual(result['url'], 'wat:' + wat_id)
        self.assertEqual(result['title'], video.get('title'))
        self.assertEqual(result['thumbnails'], thumbnails)
        self.assertEqual(result['description'], decoration.get('description'))
        self.assertEqual(result['timestamp'], parse_iso8601(video.get('date')))
        self.assertEqual(result['duration'], int_or_none(try_get(video, lambda x: x['publicPlayingInfos']['duration'])))
        self.assertEqual(result['tags'], tags)
        self.assertEqual(result['series'], decoration.get('programLabel'))
        self.assertEqual(result['season_number'], int_or_none(video.get('season')))
        self.assertEqual(result['episode_number'], int_or_none(video.get('episode')))

    def test_download_json(self):
        pass

    def test_try_get(self):
        pass

    def test_int_or_none(self):
        pass

    def test_parse_iso8601(self):
        pass


if __name__ == '__main__':
    unittest.main()