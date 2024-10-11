import unittest
from youtube_dl.extractor.soundgasm import SoundgasmIE, SoundgasmProfileIE


class TestSoundgasmIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SoundgasmIE()
        result = instance._real_extract('http://soundgasm.net/u/ytdl/Piano-sample')
        self.assertEqual(result['id'], '88abd86ea000cafe98f96321b23cc1206cbcbcc9')
        self.assertEqual(result['ext'], 'm4a')
        self.assertEqual(result['title'], 'Piano sample')
        self.assertEqual(result['description'], 'Royalty Free Sample Music')
        self.assertEqual(result['uploader'], 'ytdl')

    def test_real_extract_2(self):
        instance = SoundgasmIE()
        result = instance._real_extract('http://soundgasm.net/u/ytdl/Piano-sample')
        self.assertEqual(result['id'], '88abd86ea000cafe98f96321b23cc1206cbcbcc9')
        self.assertEqual(result['ext'], 'm4a')
        self.assertEqual(result['title'], 'Piano sample')
        self.assertEqual(result['description'], 'Royalty Free Sample Music')
        self.assertEqual(result['uploader'], 'ytdl')

class TestSoundgasmProfileIE(unittest.TestCase):
    def test_real_extract(self):
        instance = SoundgasmProfileIE()
        result = instance._real_extract('http://soundgasm.net/u/ytdl')
        self.assertEqual(result['id'], 'ytdl')

    def test_real_extract_2(self):
        instance = SoundgasmProfileIE()
        result = instance._real_extract('http://soundgasm.net/u/ytdl')
        self.assertEqual(result['id'], 'ytdl')

if __name__ == '__main__':
    unittest.main()