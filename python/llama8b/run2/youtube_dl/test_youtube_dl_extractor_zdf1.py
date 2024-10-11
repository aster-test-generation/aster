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