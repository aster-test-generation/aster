import re
import unittest
from youtube_dl.extractor.soundgasm import SoundgasmIE, SoundgasmProfileIE
from youtube_dl.extractor.common import InfoExtractor


class TestSoundgasmIE(unittest.TestCase):
    def setUp(self):
        self.instance = SoundgasmIE()

    def test_real_extract(self):
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        self.instance._download_webpage = lambda url, display_id: '<div class="jp-title">Piano sample</div><div class="jp-description">Royalty Free Sample Music</div><a href="http://example.com/audio.m4a">audio</a>'
        self.instance._html_search_regex = lambda pattern, string, name, group=None, fatal=True, default=None: 'http://example.com/audio.m4a'
        self.instance._search_regex = lambda pattern, string, name, fatal=True, default=None: 'Piano sample'
        
        result = self.instance._real_extract(url)
        self.assertEqual(result['id'], 'Piano sample')
        self.assertEqual(result['display_id'], 'Piano-sample')
        self.assertEqual(result['url'], 'http://example.com/audio.m4a')
        self.assertEqual(result['vcodec'], 'none')
        self.assertEqual(result['title'], 'Piano sample')
        self.assertEqual(result['description'], 'Royalty Free Sample Music')
        self.assertEqual(result['uploader'], 'ytdl')

    def test_valid_url(self):
        self.assertTrue(re.match(SoundgasmIE._VALID_URL, 'http://soundgasm.net/u/ytdl/Piano-sample'))

class TestSoundgasmProfileIE(unittest.TestCase):
    def setUp(self):
        self.instance = SoundgasmProfileIE()

    def test_real_extract(self):
        url = 'http://soundgasm.net/u/ytdl'
        self.instance._download_webpage = lambda url, profile_id: '<a href="http://soundgasm.net/u/ytdl/audio1">audio1</a><a href="http://soundgasm.net/u/ytdl/audio2">audio2</a>'
        self.instance.url_result = lambda url, ie: {'url': url, 'ie_key': ie}
        
        result = self.instance._real_extract(url)
        self.assertEqual(result['entries'][0]['url'], 'http://soundgasm.net/u/ytdl/audio1')
        self.assertEqual(result['entries'][1]['url'], 'http://soundgasm.net/u/ytdl/audio2')
        self.assertEqual(result['id'], 'ytdl')

    def test_valid_url(self):
        self.assertTrue(re.match(SoundgasmProfileIE._VALID_URL, 'http://soundgasm.net/u/ytdl'))

if __name__ == '__main__':
    unittest.main()