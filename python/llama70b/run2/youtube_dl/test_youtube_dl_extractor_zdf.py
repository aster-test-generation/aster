from youtube_dl.extractor.zdf import InfoExtractor
import unittest
from youtube_dl.extractor.zdf import ZDFBaseIE, ZDFIE, ZDFChannelIE


class TestZDFBaseIE(unittest.TestCase):
    def test_init(self):
        ie = ZDFBaseIE()
        self.assertIsInstance(ie, InfoExtractor)

    def test__call_api(self):
        ie = ZDFBaseIE()
        url = 'https://example.com/api'
        video_id = '123'
        item = 'metadata'
        api_token = 'token'
        referrer = 'https://example.com/referrer'
        result = ie._call_api(url, video_id, item, api_token, referrer)
        self.assertIsInstance(result, dict)

    def test__extract_subtitles(self):
        ie = ZDFBaseIE()
        src = {'captions': [{'uri': 'https://example.com/subtitle', 'language': 'deu'}]}
        subtitles = ie._extract_subtitles(src)
        self.assertIsInstance(subtitles, dict)
        self.assertIn('deu', subtitles)

    def test__extract_format(self):
        ie = ZDFBaseIE()
        video_id = '123'
        formats = []
        format_urls = set()
        meta = {'url': 'https://example.com/format', 'mimeType': 'video/mp4'}
        ie._extract_format(video_id, formats, format_urls, meta)
        self.assertIsInstance(formats, list)
        self.assertIn({'url': 'https://example.com/format', 'format_id': 'http'}, formats)

class TestZDFIE(unittest.TestCase):
    def test_init(self):
        ie = ZDFIE()
        self.assertIsInstance(ie, ZDFBaseIE)

    def test_extract_entry(self):
        ie = ZDFIE()
        url = 'https://example.com/video'
        player = {'apiToken': 'token', 'content': 'https://example.com/content'}
        content = {'title': 'Video Title', 'mainVideoContent': {'http://zdf.de/rels/target': {'http://zdf.de/rels/streams/ptmd': 'https://example.com/ptmd'}}}
        video_id = '123'
        result = ie._extract_entry(url, player, content, video_id)
        self.assertIsInstance(result, dict)
        self.assertIn('title', result)
        self.assertIn('formats', result)

    def test_extract_regular(self):
        ie = ZDFIE()
        url = 'https://example.com/video'
        player = {'apiToken': 'token', 'content': 'https://example.com/content'}
        video_id = '123'
        result = ie._extract_regular(url, player, video_id)
        self.assertIsInstance(result, dict)
        self.assertIn('title', result)
        self.assertIn('formats', result)

    def test_extract_mobile(self):
        ie = ZDFIE()
        video_id = '123'
        result = ie._extract_mobile(video_id)
        self.assertIsInstance(result, dict)
        self.assertIn('title', result)
        self.assertIn('formats', result)

    def test_real_extract(self):
        ie = ZDFIE()
        url = 'https://example.com/video'
        result = ie._real_extract(url)
        self.assertIsInstance(result, dict)
        self.assertIn('title', result)
        self.assertIn('formats', result)

class TestZDFChannelIE(unittest.TestCase):
    def test_init(self):
        ie = ZDFChannelIE()
        self.assertIsInstance(ie, ZDFBaseIE)

    def test_suitable(self):
        ie = ZDFChannelIE()
        url = 'https://example.com/channel'
        self.assertFalse(ie.suitable(url))

    def test_real_extract(self):
        ie = ZDFChannelIE()
        url = 'https://example.com/channel'
        result = ie._real_extract(url)
        self.assertIsInstance(result, dict)
        self.assertIn('title', result)
        self.assertIn('entries', result)

class TestZDFBaseIE(unittest.TestCase):
    def test_init(self):
        ie = ZDFBaseIE()
        self.assertIsInstance(ie, InfoExtractor)

    def test__call_api(self):
        ie = ZDFBaseIE()
        url = 'https://example.com/api'
        video_id = '123'
        item = 'metadata'
        api_token = 'token'
        referrer = 'https://example.com/referrer'
        result = ie._call_api(url, video_id, item, api_token, referrer)
        self.assertIsInstance(result, dict)

    def test__extract_subtitles(self):
        ie = ZDFBaseIE()
        src = {'captions': [{'uri': 'https://example.com/subtitle', 'language': 'deu'}]}
        subtitles = ie._extract_subtitles(src)
        self.assertEqual(subtitles, {'deu': [{'url': 'https://example.com/subtitle'}]})

    def test__extract_format(self):
        ie = ZDFBaseIE()
        video_id = '123'
        formats = []
        format_urls = set()
        meta = {'url': 'https://example.com/format', 'mimeType': 'video/mp4', 'quality': 'high'}
        ie._extract_format(video_id, formats, format_urls, meta)
        self.assertEqual(len(formats), 1)

class TestZDFIE(unittest.TestCase):
    def test__extract_entry(self):
        ie = ZDFIE()
        url = 'https://example.com/entry'
        player = {'apiToken': 'token', 'content': 'https://example.com/content'}
        content = {'title': 'Title', 'mainVideoContent': {'http://zdf.de/rels/target': {'http://zdf.de/rels/streams/ptmd': 'https://example.com/ptmd'}}}
        video_id = '123'
        result = ie._extract_entry(url, player, content, video_id)
        self.assertIsInstance(result, dict)

    def test__extract_regular(self):
        ie = ZDFIE()
        url = 'https://example.com/regular'
        player = {'apiToken': 'token', 'content': 'https://example.com/content'}
        video_id = '123'
        result = ie._extract_regular(url, player, video_id)
        self.assertIsInstance(result, dict)

    def test__extract_mobile(self):
        ie = ZDFIE()
        video_id = '123'
        result = ie._extract_mobile(video_id)
        self.assertIsInstance(result, dict)

    def test_real_extract(self):
        ie = ZDFIE()
        url = 'https://example.com/video'
        result = ie._real_extract(url)
        self.assertIsInstance(result, dict)

class TestZDFChannelIE(unittest.TestCase):
    def test_suitable(self):
        ie = ZDFChannelIE()
        url = 'https://example.com/channel'
        self.assertFalse(ie.suitable(url))

    def test_real_extract(self):
        ie = ZDFChannelIE()
        url = 'https://example.com/channel'
        result = ie._real_extract(url)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()