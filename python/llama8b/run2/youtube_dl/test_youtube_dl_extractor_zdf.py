import unittest
from unittest.mock import patch
from youtube_dl.extractor.zdf import ZDFBaseIE, ZDFIE, ZDFChannelIE


class TestZDFBaseIE(unittest.TestCase):
    def test__call_api(self):
        ie = ZDFBaseIE()
        with patch('youtube_dl.extractor.zdf.ZDFBaseIE._download_json') as mock_download_json:
            ie._call_api('url', 'video_id', 'item', api_token='api_token', referrer='referrer')
            mock_download_json.assert_called_once_with('url', 'video_id', 'Downloading JSON %s' % 'item', headers={'Api-Auth': 'Bearer api_token', 'Referer': 'referrer'})

    def test__extract_subtitles(self):
        ie = ZDFBaseIE()
        src = {'captions': [{'uri': 'uri', 'language': 'deu'}]}
        subtitles = ie._extract_subtitles(src)
        self.assertEqual(subtitles, {'deu': [{'url': 'uri'}]})

    def test__extract_format(self):
        ie = ZDFBaseIE()
        video_id = 'video_id'
        formats = []
        format_urls = set()
        meta = {'url': 'url', 'mimeType': 'mimeType', 'quality': 'quality', 'language': 'language'}
        ie._extract_format(video_id, formats, format_urls, meta)
        self.assertEqual(formats, [{'url': 'url', 'format_id': 'http', 'format_note': 'quality', 'language': 'language', 'quality': 'quality', 'preference': -10}])

    def test__extract_ptmd(self):
        ie = ZDFBaseIE()
        ptmd_url = 'ptmd_url'
        video_id = 'video_id'
        api_token = 'api_token'
        referrer = 'referrer'
        ptmd = ie._call_api(ptmd_url, video_id, 'metadata', api_token, referrer)
        content_id = ptmd.get('basename') or ptmd_url.split('/')[-1]
        formats = []
        track_uris = set()
        for p in ptmd['priorityList']:
            formitaeten = p.get('formitaeten')
            if not isinstance(formitaeten, list):
                continue
            for f in formitaeten:
                f_qualities = f.get('qualities')
                if not isinstance(f_qualities, list):
                    continue
                for quality in f_qualities:
                    tracks = try_get(quality, lambda x: x['audio']['tracks'], list)
                    if not tracks:
                        continue
                    for track in tracks:
                        ie._extract_format(content_id, formats, track_uris, {'url': track.get('uri'), 'type': f.get('type'), 'mimeType': f.get('mimeType'), 'quality': quality.get('quality'), 'language': track.get('language')})
        ie._sort_formats(formats)
        duration = float_or_none(try_get(ptmd, lambda x: x['attributes']['duration']['value']), scale=1000)
        self.assertEqual(ie._extract_ptmd(ptmd_url, video_id, api_token, referrer), {'extractor_key': ZDFIE.ie_key(), 'id': content_id, 'duration': duration, 'formats': formats, 'subtitles': ie._extract_subtitles(ptmd)})

    def test__extract_player(self):
        ie = ZDFBaseIE()
        webpage = 'webpage'
        video_id = 'video_id'
        player = ie._parse_json(ie._search_regex(r'(?s)data-zdfplayer-jsb=(["\'])(?P<json>{.+?})\1', webpage, 'player JSON', default='{}', group='json'), video_id)
        self.assertEqual(ie._extract_player(webpage, video_id, fatal=True), player)

class TestZDFBaseIE(unittest.TestCase):
    def test__call_api(self):
        ie = ZDFBaseIE()
        url = 'https://example.com'
        video_id = '123'
        item = 'metadata'
        api_token = 'abc'
        referrer = 'https://example.com/referrer'
        result = ie._call_api(url, video_id, item, api_token, referrer)
        self.assertIsInstance(result, dict)

    def test__extract_subtitles(self):
        ie = ZDFBaseIE()
        src = {'captions': [{'uri': 'https://example.com/subtitles', 'language': 'deu'}]}
        result = ie._extract_subtitles(src)
        self.assertIsInstance(result, dict)

    def test__extract_format(self):
        ie = ZDFBaseIE()
        video_id = '123'
        formats = []
        format_urls = set()
        meta = {'url': 'https://example.com/format', 'mimeType': 'video/mp4'}
        ie._extract_format(video_id, formats, format_urls, meta)
        self.assertIsInstance(formats, list)

    def test__extract_ptmd(self):
        ie = ZDFBaseIE()
        ptmd_url = 'https://example.com/ptmd'
        video_id = '123'
        api_token = 'abc'
        referrer = 'https://example.com/referrer'
        result = ie._extract_ptmd(ptmd_url, video_id, api_token, referrer)
        self.assertIsInstance(result, dict)

    def test__extract_player(self):
        ie = ZDFBaseIE()
        webpage = 'https://example.com/player'
        video_id = '123'
        result = ie._extract_player(webpage, video_id)
        self.assertIsInstance(result, dict)

    def test__extract_entry(self):
        ie = ZDFBaseIE()
        url = 'https://example.com/entry'
        player = {'apiToken': 'abc'}
        content = {'title': 'Example Title', 'mainVideoContent': {'http://zdf.de/rels/target': {'http://zdf.de/rels/streams/ptmd': 'https://example.com/ptmd'}}}
        video_id = '123'
        result = ie._extract_entry(url, player, content, video_id)
        self.assertIsInstance(result, dict)

    def test__extract_regular(self):
        ie = ZDFBaseIE()
        url = 'https://example.com/regular'
        player = {'apiToken': 'abc'}
        content = {'document': {'titel': 'Example Title', 'basename': 'example'}}
        video_id = '123'
        result = ie._extract_regular(url, player, video_id)
        self.assertIsInstance(result, dict)

    def test__extract_mobile(self):
        ie = ZDFBaseIE()
        video_id = '123'
        result = ie._extract_mobile(video_id)
        self.assertIsInstance(result, dict)

class TestZDFIE(unittest.TestCase):
    def test__real_extract(self):
        ie = ZDFIE()
        url = 'https://www.zdf.de/politik/phoenix-sendungen/wohin-fuehrt-der-protest-in-der-pandemie-100.html'
        result = ie._real_extract(url)
        self.assertIsInstance(result, dict)

class TestZDFChannelIE(unittest.TestCase):
    def test__real_extract(self):
        ie = ZDFChannelIE()
        url = 'https://www.zdf.de/sport/das-aktuelle-sportstudio'
        result = ie._real_extract(url)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()