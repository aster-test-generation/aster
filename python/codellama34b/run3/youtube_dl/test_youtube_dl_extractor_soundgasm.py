import unittest
from youtube_dl.extractor.soundgasm import *



class TestSoundgasmIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SoundgasmIE()
        result = instance._real_extract("http://soundgasm.net/u/ytdl/Piano-sample")
        self.assertEqual(result, {'id': '88abd86ea000cafe98f96321b23cc1206cbcbcc9', 'ext': 'm4a', 'title': 'Piano sample', 'description': 'Royalty Free Sample Music', 'uploader': 'ytdl'})

    def test_real_extract_2(self):
        instance = SoundgasmIE()
        result = instance._real_extract("http://soundgasm.net/u/ytdl/Piano-sample")
        self.assertEqual(result, {'id': '88abd86ea000cafe98f96321b23cc1206cbcbcc9', 'ext': 'm4a', 'title': 'Piano sample', 'description': 'Royalty Free Sample Music', 'uploader': 'ytdl'})

    def test_real_extract_3(self):
        instance = SoundgasmIE()
        result = instance._real_extract("http://soundgasm.net/u/ytdl/Piano-sample")
        self.assertEqual(result, {'id': '88abd86ea000cafe98f96321b23cc1206cbcbcc9', 'ext': 'm4a', 'title': 'Piano sample', 'description': 'Royalty Free Sample Music', 'uploader': 'ytdl'})

    def test_real_extract_4(self):
        instance = SoundgasmIE()
        result = instance._real_extract("http://soundgasm.net/u/ytdl/Piano-sample")
        self.assertEqual(result, {'id': '88abd86ea000cafe98f96321b23cc1206cbcbcc9', 'ext': 'm4a', 'title': 'Piano sample', 'description': 'Royalty Free Sample Music', 'uploader': 'ytdl'})

    def test_real_extract_5(self):
        instance = SoundgasmIE()
        result = instance._real_extract("http://soundgasm.net/u/ytdl/Piano-sample")
        self.assertEqual(result, {'id': '88abd86ea000cafe98f96321b23cc1206cbcbcc9', 'ext': 'm4a', 'title': 'Piano sample', 'description': 'Royalty Free Sample Music', 'uploader': 'ytdl'})

    def test_real_extract_6(self):
        instance = SoundgasmIE()
        result = instance._real_extract("http://soundgasm.net/u/ytdl/Piano-sample")
        self.assertEqual(result, {'id': '88abd86ea000cafe98f96321b23cc1206cbcbcc9', 'ext': 'm4a', 'title': 'Piano sample', 'description': 'Royalty Free Sample Music', 'uploader': 'ytdl'})

    def test_real_extract_7(self):
        instance = SoundgasmIE()
        result = instance._real_extract("http://soundgasm.net/u/ytdl/Piano-sample")
        self.assertEqual(result, {'id': '88abd86ea000cafe98f96321b23cc1206cbcbcc9', 'ext': 'm4a', 'title': 'Piano sample', 'description': 'Royalty Free Sample Music', 'uploader': 'ytdl'})

if __name__ == '__main__':
    unittest.main()