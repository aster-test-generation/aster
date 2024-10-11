import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKIE()
        result = instance._real_extract('https://www.nrk.no/')
        self.assertEqual(result, None)

    def test_call_playback_api(self):
        instance = NRKIE()
        result = instance.call_playback_api('manifest', {'preferredCdn': 'akamai'})
        self.assertEqual(result, None)

    def test_extract_nrk_formats(self):
        instance = NRKIE()
        result = instance._extract_nrk_formats('https://www.nrk.no/', 'video_id')
        self.assertEqual(result, None)

    def test_sort_formats(self):
        instance = NRKIE()
        result = instance._sort_formats([])
        self.assertEqual(result, None)

    def test_raise_error(self):
        instance = NRKIE()
        result = instance._raise_error('nonPlayable')
        self.assertEqual(result, None)

    def test_call_api(self):
        instance = NRKIE()
        result = instance._call_api('playback/manifest/video_id', 'video_id', 'manifest', {'preferredCdn': 'akamai'})
        self.assertEqual(result, None)

    def test_init(self):
        instance = NRKIE()
        result = instance.__init__()
        self.assertEqual(result, None)

    def test_str(self):
        instance = NRKIE()
        result = instance.__str__()
        self.assertEqual(result, 'NRKIE')

    def test_repr(self):
        instance = NRKIE()
        result = instance.__repr__()
        self.assertEqual(result, 'NRKIE')

    def test_eq(self):
        instance = NRKIE()
        result = instance.__eq__()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()