import unittest
from youtube_dl.extractor.nrk import NRKIE
from youtube_dl.extractor.nrk import NRKBaseIE


class TestNRKIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKIE()
        result = instance._real_extract('https://www.nrk.no/')
        self.assertEqual(result, None)

    def test_call_playback_api(self):
        instance = NRKIE()
        result = instance._call_playback_api('manifest', {'preferredCdn': 'akamai'})
        self.assertEqual(result, None)

    def test_extract_nrk_formats(self):
        instance = NRKIE()
        result = instance._extract_nrk_formats('https://www.nrk.no/', 'https://www.nrk.no/')
        self.assertEqual(result, None)

    def test_sort_formats(self):
        instance = NRKIE()
        result = instance._sort_formats([])
        self.assertEqual(result, None)

    def test_raise_error(self):
        instance = NRKIE()
        result = instance._raise_error({'nonPlayable': 'nonPlayable'})
        self.assertEqual(result, None)

    def test_call_api(self):
        instance = NRKIE()
        result = instance._call_api('playback/', 'https://www.nrk.no/', 'manifest', {'preferredCdn': 'akamai'})
        self.assertEqual(result, None)


class TestNRKBaseIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKBaseIE()
        result = instance._real_extract('https://www.nrk.no/')
        self.assertEqual(result, None)

    def test_call_api(self):
        instance = NRKBaseIE()
        result = instance._call_api('playback/', 'https://www.nrk.no/', 'manifest', {'preferredCdn': 'akamai'})
        self.assertEqual(result, None)


if __name__ == '__main__':
    unittest.main()