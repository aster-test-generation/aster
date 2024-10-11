import unittest
from youtube_dl.extractor.nrk import NRKBaseI


class TestNRKBaseIE(unittest.TestCase):
    def test_init(self):
        instance = NRKBaseIE()
        self.assertIsInstance(instance, InfoExtractor)

    def test_extract_nrk_formats(self):
        instance = NRKBaseIE()
        asset_url = 'https://example.akamaihd.net/i/some/video'
        video_id = 'some_video_id'
        formats = instance._extract_nrk_formats(asset_url, video_id)
        self.assertIsNotNone(formats)

    def test_extract_akamai_formats(self):
        instance = NRKBaseIE()
        asset_url = 'https://example.akamaihd.net/i/some/video'
        video_id = 'some_video_id'
        formats = instance._NRKBaseIE__extract_akamai_formats(asset_url, video_id)
        self.assertIsNotNone(formats)

    def test_extract_m3u8_formats(self):
        instance = NRKBaseIE()
        asset_url = 'https://example.com/some/video.m3u8'
        video_id = 'some_video_id'
        formats = instance._extract_m3u8_formats(asset_url, video_id, 'mp4', 'm3u8_native', fatal=False)
        self.assertIsNotNone(formats)

    def test_raise_error(self):
        instance = NRKBaseIE()
        data = {'messageType': 'ProgramRightsAreNotReady'}
        with self.assertRaises(ExtractorError):
            instance._raise_error(data)

    def test_call_api(self):
        instance = NRKBaseIE()
        path = 'some/path'
        video_id = 'some_video_id'
        result = instance._call_api(path, video_id)
        self.assertIsNotNone(result)

    def test_str_method(self):
        instance = NRKBaseIE()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = NRKBaseIE()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = NRKBaseIE()
        instance2 = NRKBaseIE()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()