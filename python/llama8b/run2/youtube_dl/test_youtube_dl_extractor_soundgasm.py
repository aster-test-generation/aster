import re
import unittest
from youtube_dl.extractor.soundgasm import SoundgasmIE, SoundgasmProfileIE


class TestSoundgasmIE(unittest.TestCase):
    def test_valid_url(self):
        ie = SoundgasmIE()
        mobj = re.match(ie._VALID_URL, 'http://soundgasm.net/u/ytdl/Piano-sample')
        self.assertIsNotNone(mobj)

    def test_real_extract(self):
        ie = SoundgasmIE()
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        result = ie._real_extract(url)
        self.assertIn('id', result)
        self.assertIn('ext', result)
        self.assertIn('title', result)
        self.assertIn('description', result)
        self.assertIn('uploader', result)

    def test_html_search_regex(self):
        ie = SoundgasmIE()
        webpage = '<div class="jp-title">Piano sample</div>'
        title = ie._search_regex(r'<div[^>]+\bclass=["\']jp-title[^>]+>([^<]+)', webpage, 'title')
        self.assertEqual(title, 'Piano sample')

    def test_html_search_regex_fallback(self):
        ie = SoundgasmIE()
        webpage = '<li>Description: Piano sample</li>'
        description = ie._html_search_regex((r'(?s)<div[^>]+\bclass=["\']jp-description[^>]+>(.+?)</div>',
                                            r'(?s)<li>Description:\s(.*?)<\/li>'), webpage, 'description', fatal=False)
        self.assertEqual(description, 'Piano sample')

    def test_search_regex(self):
        ie = SoundgasmIE()
        audio_url = '/ytdl/Piano-sample.m4a'
        audio_id = ie._search_regex(r'/([^/]+)\.m4a', audio_url, 'audio id', default='Piano-sample')
        self.assertEqual(audio_id, 'Piano-sample')

class TestSoundgasmProfileIE(unittest.TestCase):
    def test_valid_url(self):
        ie = SoundgasmProfileIE()
        mobj = re.match(ie._VALID_URL, 'http://soundgasm.net/u/ytdl')
        self.assertIsNotNone(mobj)

    def test_real_extract(self):
        ie = SoundgasmProfileIE()
        url = 'http://soundgasm.net/u/ytdl'
        result = ie._real_extract(url)
        self.assertIn('id', result)
        self.assertIn('playlist_count', result)

    def test_url_result(self):
        ie = SoundgasmProfileIE()
        audio_url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        result = ie.url_result(audio_url, 'Soundgasm')
        self.assertIn('id', result)
        self.assertIn('url', result)

if __name__ == '__main__':
    unittest.main()