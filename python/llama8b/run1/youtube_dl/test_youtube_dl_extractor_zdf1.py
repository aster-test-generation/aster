import unittest
from youtube_dl.extractor.zdf import ZDFBaseIE, ZDFIE, ZDFChannelIE

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


if __name__ == '__main__':
    unittest.main()