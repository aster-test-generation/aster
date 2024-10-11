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
        meta = {'url': 'url', 'mimeType': 'mimeType', 'quality': 'quality'}
        ie._extract_format(video_id, formats, format_urls, meta)
        self.assertEqual(formats, [{'url': 'url', 'format_id': 'http', 'format_note': 'quality', 'language': None, 'quality': 'quality', 'preference': -10}])

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
        player = ie._parse_json(ie._search_regex(r'(?s)data-zdfplayer-jsb=(["\'])(?P<json>{.+?})\1', webpage, 'player JSON', default='{}' if not True else None, group='json'), video_id)
        self.assertEqual(ie._extract_player(webpage, video_id, fatal=True), player)

class TestZDFBaseIE(unittest.TestCase):
    def test__call_api(self):
        ie = ZDFBaseIE()
        url = 'https://example.com'
        video_id = 'test_video_id'
        item = 'metadata'
        api_token = 'test_api_token'
        referrer = 'https://example.com/referrer'
        result = ie._call_api(url, video_id, item, api_token, referrer)
        self.assertEqual(result, 'Downloading JSON metadata')

    def test__extract_subtitles(self):
        ie = ZDFBaseIE()
        src = {'captions': [{'uri': 'https://example.com/subtitle1', 'language': 'deu'}, {'uri': 'https://example.com/subtitle2', 'language': 'eng'}]}
        result = ie._extract_subtitles(src)
        self.assertEqual(result, {'deu': [{'url': 'https://example.com/subtitle1'}], 'eng': [{'url': 'https://example.com/subtitle2'}]})

    def test__extract_format(self):
        ie = ZDFBaseIE()
        video_id = 'test_video_id'
        formats = []
        format_urls = set()
        meta = {'url': 'https://example.com/format1', 'mimeType': 'application/x-mpegURL', 'quality': 'auto'}
        ie._extract_format(video_id, formats, format_urls, meta)
        self.assertEqual(formats, [{'url': 'https://example.com/format1', 'format_id': 'auto', 'format_note': 'auto', 'language': None, 'quality': 'auto', 'preference': -10}])

    def test__extract_ptmd(self):
        ie = ZDFBaseIE()
        ptmd_url = 'https://example.com/ptmd'
        video_id = 'test_video_id'
        api_token = 'test_api_token'
        referrer = 'https://example.com/referrer'
        result = ie._extract_ptmd(ptmd_url, video_id, api_token, referrer)
        self.assertEqual(result, {'extractor_key': 'ZDFIE', 'id': 'test_video_id', 'duration': 0, 'formats': [], 'subtitles': {}})

    def test__extract_player(self):
        ie = ZDFBaseIE()
        webpage = 'https://example.com/player'
        video_id = 'test_video_id'
        result = ie._extract_player(webpage, video_id)
        self.assertEqual(result, {'player JSON': 'https://example.com/player'})

    def test__extract_entry(self):
        ie = ZDFBaseIE()
        url = 'https://example.com/entry'
        player = {'apiToken': 'test_api_token'}
        content = {'title': 'test_title', 'mainVideoContent': {'http://zdf.de/rels/target': {'http://zdf.de/rels/streams/ptmd': 'https://example.com/ptmd'}}}
        video_id = 'test_video_id'
        result = ie._extract_entry(url, player, content, video_id)
        self.assertEqual(result, {'id': 'test_video_id', 'title': 'test_title', 'description': None, 'duration': None, 'timestamp': None, 'thumbnails': [], 'subtitles': {}})

    def test__extract_regular(self):
        ie = ZDFBaseIE()
        url = 'https://example.com/regular'
        player = {'apiToken': 'test_api_token'}
        content = {'title': 'test_title', 'mainVideoContent': {'http://zdf.de/rels/target': {'http://zdf.de/rels/streams/ptmd': 'https://example.com/ptmd'}}}
        video_id = 'test_video_id'
        result = ie._extract_regular(url, player, video_id)
        self.assertEqual(result, {'id': 'test_video_id', 'title': 'test_title', 'description': None, 'duration': None, 'timestamp': None, 'thumbnails': [], 'subtitles': {}})

    def test__extract_mobile(self):
        ie = ZDFBaseIE()
        video_id = 'test_video_id'
        result = ie._extract_mobile(video_id)
        self.assertEqual(result, {'id': 'test_video_id', 'title': None, 'description': None, 'duration': None, 'timestamp': None, 'thumbnails': [], 'subtitles': {}, 'formats': []})


class TestZDFBaseIE(unittest.TestCase):
    def test__call_api(self):
        ie = ZDFBaseIE()
        url = 'https://example.com'
        video_id = '123'
        item = 'metadata'
        api_token = 'abc'
        referrer = 'https://example.com/referrer'
        result = ie._call_api(url, video_id, item, api_token, referrer)
        self.assertEqual(result, {'basename': 'metadata', 'priorityList': [{'formitaeten': [{'audio': {'tracks': [{'uri': 'https://example.com/track1', 'language': 'deu'}]}}]}]})

    def test__extract_subtitles(self):
        ie = ZDFBaseIE()
        src = {'captions': [{'uri': 'https://example.com/caption1', 'language': 'deu'}, {'uri': 'https://example.com/caption2', 'language': 'eng'}]}
        result = ie._extract_subtitles(src)
        self.assertEqual(result, {'deu': [{'url': 'https://example.com/caption1'}], 'eng': [{'url': 'https://example.com/caption2'}]})

    def test__extract_format(self):
        ie = ZDFBaseIE()
        video_id = '123'
        formats = []
        format_urls = set()
        meta = {'url': 'https://example.com/format1', 'mimeType': 'video/mp4', 'quality': 'high'}
        ie._extract_format(video_id, formats, format_urls, meta)
        self.assertEqual(formats, [{'url': 'https://example.com/format1', 'format_id': 'high', 'quality': 'high', 'language': 'deu', 'preference': -10}])

    def test__extract_ptmd(self):
        ie = ZDFBaseIE()
        ptmd_url = 'https://example.com/ptmd'
        video_id = '123'
        api_token = 'abc'
        referrer = 'https://example.com/referrer'
        result = ie._extract_ptmd(ptmd_url, video_id, api_token, referrer)
        self.assertEqual(result, {'extractor_key': 'ZDFIE', 'id': '123', 'duration': 1691, 'formats': [{'url': 'https://example.com/format1', 'format_id': 'high', 'quality': 'high', 'language': 'deu', 'preference': -10}], 'subtitles': {'deu': [{'url': 'https://example.com/caption1'}]}})

    def test__extract_player(self):
        ie = ZDFBaseIE()
        webpage = 'https://example.com/player'
        video_id = '123'
        result = ie._extract_player(webpage, video_id)
        self.assertEqual(result, {'content': {'title': 'Player', 'mainVideoContent': {'http://zdf.de/rels/target': {'http://zdf.de/rels/streams/ptmd': 'https://example.com/ptmd'}}}})

    def test__extract_entry(self):
        ie = ZDFBaseIE()
        url = 'https://example.com/content'
        player = {'apiToken': 'abc'}
        content = {'title': 'Content', 'mainVideoContent': {'http://zdf.de/rels/target': {'http://zdf.de/rels/streams/ptmd': 'https://example.com/ptmd'}}}
        video_id = '123'
        result = ie._extract_entry(url, player, content, video_id)
        self.assertEqual(result, {'id': '123', 'title': 'Content', 'description': 'Content description', 'duration': 1691, 'timestamp': 1613948400, 'thumbnails': [{'url': 'https://example.com/thumbnail1', 'format_id': 'high', 'width': 1280, 'height': 720}], 'subtitles': {'deu': [{'url': 'https://example.com/caption1'}]}})

if __name__ == '__main__':
    unittest.main()