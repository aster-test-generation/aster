import unittest
from youtube_dl.extractor.zdf import ZDFBaseIE, ZDFIE, ZDFChannelIE

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