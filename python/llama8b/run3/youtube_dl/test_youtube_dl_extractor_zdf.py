import unittest
from youtube_dl.extractor.zdf import ZDFBaseIE, ZDFIE, ZDFChannelIE


class TestZDFBaseIE(unittest.TestCase):
    def test_call_api(self):
        ie = ZDFBaseIE()
        url = 'https://example.com'
        video_id = 'test_video_id'
        item = 'metadata'
        api_token = 'test_api_token'
        referrer = 'https://example.com/referrer'
        result = ie._call_api(url, video_id, item, api_token, referrer)
        self.assertEqual(result, {'basename': 'test_basename', 'priorityList': [{'formitaeten': [{'uri': 'test_uri'}]}]})

    def test_extract_subtitles(self):
        ie = ZDFBaseIE()
        src = {'captions': [{'uri': 'test_uri', 'language': 'deu'}]}
        result = ie._extract_subtitles(src)
        self.assertEqual(result, {'deu': [{'url': 'test_uri'}]})

    def test_extract_format(self):
        ie = ZDFBaseIE()
        video_id = 'test_video_id'
        formats = []
        format_urls = set()
        meta = {'url': 'test_url', 'mimeType': 'application/x-mpegURL', 'quality': 'test_quality'}
        ie._extract_format(video_id, formats, format_urls, meta)
        self.assertEqual(formats, [{'url': 'test_url', 'format_id': 'http', 'format_note': 'test_quality', 'language': None, 'quality': 'test_quality', 'preference': -10}])

    def test_extract_ptmd(self):
        ie = ZDFBaseIE()
        ptmd_url = 'https://example.com/ptmd_url'
        video_id = 'test_video_id'
        api_token = 'test_api_token'
        referrer = 'https://example.com/referrer'
        result = ie._extract_ptmd(ptmd_url, video_id, api_token, referrer)
        self.assertEqual(result, {'extractor_key': 'ZDFIE', 'id': 'test_content_id', 'duration': 1691, 'formats': [{'url': 'test_url', 'format_id': 'http', 'format_note': 'test_quality', 'language': None, 'quality': 'test_quality', 'preference': -10}], 'subtitles': {'deu': [{'url': 'test_uri'}]}})

    def test_extract_player(self):
        ie = ZDFBaseIE()
        webpage = 'https://example.com/webpage'
        video_id = 'test_video_id'
        result = ie._extract_player(webpage, video_id)
        self.assertEqual(result, {'player_json': 'test_json'})

    def test_extract_entry(self):
        ie = ZDFBaseIE()
        url = 'https://example.com'
        player = {'apiToken': 'test_api_token'}
        content = {'title': 'test_title', 'mainVideoContent': {'http://zdf.de/rels/target': {'http://zdf.de/rels/streams/ptmd': 'test_ptmd_path'}}}
        video_id = 'test_video_id'
        result = ie._extract_entry(url, player, content, video_id)
        self.assertEqual(result, {'id': 'test_content_id', 'title': 'test_title', 'description': 'test_description', 'duration': 1691, 'timestamp': 1613948400, 'thumbnails': [{'url': 'test_url', 'format_id': 'test_format_id'}]})

    def test_extract_regular(self):
        ie = ZDFBaseIE()
        url = 'https://example.com'
        player = {'apiToken': 'test_api_token'}
        content = {'title': 'test_title', 'mainVideoContent': {'http://zdf.de/rels/target': {'http://zdf.de/rels/streams/ptmd': 'test_ptmd_path'}}}
        video_id = 'test_video_id'
        result = ie._extract_regular(url, player, video_id)
        self.assertEqual(result, {'id': 'test_content_id', 'title': 'test_title', 'description': 'test_description', 'duration': 1691, 'timestamp': 1613948400, 'thumbnails': [{'url': 'test_url', 'format_id': 'test_format_id'}]})

if __name__ == '__main__':
    unittest.main()