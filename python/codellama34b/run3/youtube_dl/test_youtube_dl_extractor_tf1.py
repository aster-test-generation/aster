import unittest
from youtube_dl.extractor.tf1 import TF1IE



class TestTF1IE(unittest.TestCase):
    def test_real_extract(self):
        url = 'https://www.tf1.fr/tmc/quotidien-avec-yann-barthes/videos/quotidien-premiere-partie-11-juin-2019.html'
        program_slug, slug = re.match(TF1IE._VALID_URL, url).groups()
        video = TF1IE._download_json(
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
        result = TF1IE._real_extract(url)
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

    def test_download_webpage(self):
        pass

    def test_download_xml(self):
        pass

    def test_download_json_from_url(self):
        pass

    def test_download_xml_from_url(self):
        pass

    def test_download_webpage_from_url(self):
        pass

    def test_download_webpage_handle(self):
        pass

    def test_download_webpage_handle_no_redirect(self):
        pass

    def test_download_webpage_handle_no_redirect_with_content(self):
        pass

    def test_download_webpage_handle_with_content(self):
        pass

    def test_download_webpage_handle_with_retries(self):
        pass

    def test_download_webpage_handle_with_retries_no_redirect(self):
        pass

    def test_download_webpage_handle_with_retries_no_redirect_with_content(self):
        pass

    def test_download_webpage_handle_with_retries_with_content(self):
        pass


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