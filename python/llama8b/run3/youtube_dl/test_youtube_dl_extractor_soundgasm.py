import unittest
from youtube_dl.extractor.soundgasm import SoundgasmIE, SoundgasmProfileIE


class TestSoundgasmIE(unittest.TestCase):
    def test_valid_url(self):
        ie = SoundgasmIE()
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        result = ie._real_extract(url)
        self.assertEqual(result['id'], '88abd86ea000cafe98f96321b23cc1206cbcbcc9')
        self.assertEqual(result['ext'], 'm4a')
        self.assertEqual(result['title'], 'Piano sample')
        self.assertEqual(result['description'], 'Royalty Free Sample Music')
        self.assertEqual(result['uploader'], 'ytdl')

    def test_invalid_url(self):
        ie = SoundgasmIE()
        url = 'http://invalid.url'
        with self.assertRaisesRegex(ValueError, 'Invalid URL'):
            ie._real_extract(url)

    def test_private_method(self):
        ie = SoundgasmIE()
        url = 'http://soundgasm.net/u/ytdl/Piano-sample'
        result = ie._real_extract(url)
        self.assertEqual(result['id'], '88abd86ea000cafe98f96321b23cc1206cbcbcc9')

    def test_str_method(self):
        ie = SoundgasmIE()
        result = str(ie)
        self.assertEqual(result, 'SoundgasmIE')

    def test_repr_method(self):
        ie = SoundgasmIE()
        result = repr(ie)
        self.assertEqual(result, 'SoundgasmIE()')

class TestSoundgasmProfileIE(unittest.TestCase):
    def test_valid_url(self):
        ie = SoundgasmProfileIE()
        url = 'http://soundgasm.net/u/ytdl'
        result = ie._real_extract(url)
        self.assertEqual(result['id'], 'ytdl')

    def test_invalid_url(self):
        ie = SoundgasmProfileIE()
        url = 'http://invalid.url'
        with self.assertRaisesRegex(ValueError, 'Invalid URL'):
            ie._real_extract(url)

    def test_private_method(self):
        ie = SoundgasmProfileIE()
        url = 'http://soundgasm.net/u/ytdl'
        result = ie._real_extract(url)
        self.assertEqual(result['id'], 'ytdl')

    def test_str_method(self):
        ie = SoundgasmProfileIE()
        result = str(ie)
        self.assertEqual(result, 'SoundgasmProfileIE')

    def test_repr_method(self):
        ie = SoundgasmProfileIE()
        result = repr(ie)
        self.assertEqual(result, 'SoundgasmProfileIE()')

if __name__ == '__main__':
    unittest.main()