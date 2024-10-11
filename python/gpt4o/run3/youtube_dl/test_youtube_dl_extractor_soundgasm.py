import re
import unittest
from youtube_dl.extractor.soundgasm import SoundgasmIE, SoundgasmProfileIE
from youtube_dl.extractor.common import InfoExtractor


class TestSoundgasmIE(unittest.TestCase):
    def setUp(self):
        self.instance = SoundgasmIE()

    def test_real_extract(self):
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        result = self.instance._real_extract(url).to_screen()
        self.assertEqual(result['id'], '88abd86ea000cafe98f96321b23cc1206cbcbcc9')
        self.assertEqual(result['title'], 'Piano sample')
        self.assertEqual(result['description'], 'Royalty Free Sample Music')
        self.assertEqual(result['uploader'], 'ytdl')

    def test_valid_url(self):
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        self.assertTrue(re.match(SoundgasmIE._VALID_URL, url))

    def test_private_methods(self):
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        mobj = re.match(SoundgasmIE._VALID_URL, url)
        display_id = mobj.group('display_id')
        webpage = '<html><div class="jp-title">Piano sample</div><div class="jp-description">Royalty Free Sample Music</div></html>'
        audio_url = 'http://soundgasm.net/u/ytdl/Piano-sample.m4a'

        title = self.instance._search_regex('params',
            r'<div[^>]+\bclass=["\']jp-title[^>]+>([^<]+)',
            webpage, 'title', default=display_id)
        self.assertEqual(title, 'Piano sample')

        description = self.instance._html_search_regex(
            (r'(?s)<div[^>]+\bclass=["\']jp-description[^>]+>(.+?)</div>',
             r'(?s)<li>Description:\s(.*?)<\/li>'),
            webpage, 'description', fatal=False)
        self.assertEqual(description, 'Royalty Free Sample Music')

        audio_id = self.instance._search_regex(
            r'/([^/]+)\.m4a', audio_url, 'audio id', default=display_id)
        self.assertEqual(audio_id, 'Piano-sample')

class TestSoundgasmProfileIE(unittest.TestCase):
    def setUp(self):
        self.instance = SoundgasmProfileIE()

    def test_real_extract(self):
        url = 'http://soundgasm.net/u/ytdl'
        result = self.instance._real_extract(url).to_screen()
        self.assertEqual(result['id'], 'ytdl')
        self.assertEqual(len(result['entries']), 1)

    def test_valid_url(self):
        url = 'http://soundgasm.net/u/ytdl'
        self.assertTrue(re.match(SoundgasmProfileIE._VALID_URL, url))

    def test_private_methods(self):
        url = 'http://soundgasm.net/u/ytdl'
        profile_id = self.instance._match_id(url)
        self.assertEqual(profile_id, 'ytdl')

        webpage = '<html><a href="http://soundgasm.net/u/ytdl/Piano-sample">Sample</a></html>'
        entries = [
            self.instance.url_result(audio_url, 'Soundgasm')
            for audio_url in re.findall(r'href="([^"]+/u/%s/[^"]+)' % profile_id, webpage)]
        self.assertEqual(len(entries), 1)

if __name__ == '__main__':
    unittest.main()