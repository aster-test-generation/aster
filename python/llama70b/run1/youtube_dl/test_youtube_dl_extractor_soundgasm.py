import unittest
from youtube_dl.extractor.soundgasm import SoundgasmIE, SoundgasmProfileIE


class TestSoundgasmIE(unittest.TestCase):
    def test_IE_NAME(self):
        instance = SoundgasmIE()
        self.assertEqual(instance.IE_NAME, 'soundgasm')

    def test__VALID_URL(self):
        instance = SoundgasmIE()
        self.assertEqual(instance._VALID_URL, r'https?://(?:www\.)?soundgasm\.net/u/(?P<user>[0-9a-zA-Z_-]+)/(?P<display_id>[0-9a-zA-Z_-]+)')

    def test__TEST(self):
        instance = SoundgasmIE()
        self.assertEqual(instance._TEST, {
            'url': 'http://soundgasm.net/u/ytdl/Piano-sample',
            'md5': '010082a2c802c5275bb00030743e75ad',
            'info_dict': {
                'id': '88abd86ea000cafe98f96321b23cc1206cbcbcc9',
                'ext': 'm4a',
                'title': 'Piano sample',
                'description': 'Royalty Free Sample Music',
                'uploader': 'ytdl',
            }
        })

    def test__real_extract(self):
        instance = SoundgasmIE()
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        result = instance._real_extract(url)
        self.assertEqual(result, {
            'id': '88abd86ea000cafe98f96321b23cc1206cbcbcc9',
            'display_id': 'Piano-sample',
            'url': 'https://example.com/audio.m4a',
            'vcodec': 'none',
            'title': 'Piano sample',
            'description': 'Royalty Free Sample Music',
            'uploader': 'ytdl',
        })

    def test___init__(self):
        instance = SoundgasmIE()
        self.assertIsInstance(instance, SoundgasmIE)

    def test___str__(self):
        instance = SoundgasmIE()
        self.assertEqual(str(instance), 'SoundgasmIE')

    def test___repr__(self):
        instance = SoundgasmIE()
        self.assertEqual(repr(instance), 'SoundgasmIE()')

class TestSoundgasmProfileIE(unittest.TestCase):
    def test_IE_NAME(self):
        instance = SoundgasmProfileIE()
        self.assertEqual(instance.IE_NAME, 'soundgasm:profile')

    def test__VALID_URL(self):
        instance = SoundgasmProfileIE()
        self.assertEqual(instance._VALID_URL, r'https?://(?:www\.)?soundgasm\.net/u/(?P<id>[^/]+)/?(?:')

    def test__TEST(self):
        instance = SoundgasmProfileIE()
        self.assertEqual(instance._TEST, {
            'url': 'http://soundgasm.net/u/ytdl',
            'info_dict': {
                'id': 'ytdl',
            },
            'playlist_count': 1,
        })

    def test__real_extract(self):
        instance = SoundgasmProfileIE()
        url = 'http://soundgasm.net/u/ytdl'
        result = instance._real_extract(url)
        self.assertEqual(result, {
            '_type': 'playlist',
            'entries': [
                {'_type': 'url', 'url': 'https://example.com/audio1.m4a', 'ie_key': 'Soundgasm'},
                {'_type': 'url', 'url': 'https://example.com/audio2.m4a', 'ie_key': 'Soundgasm'},
            ],
            'id': 'ytdl',
        })

    def test___init__(self):
        instance = SoundgasmProfileIE()
        self.assertIsInstance(instance, SoundgasmProfileIE)

    def test___str__(self):
        instance = SoundgasmProfileIE()
        self.assertEqual(str(instance), 'SoundgasmProfileIE')

    def test___repr__(self):
        instance = SoundgasmProfileIE()
        self.assertEqual(repr(instance), 'SoundgasmProfileIE()')

if __name__ == '__main__':
    unittest.main()