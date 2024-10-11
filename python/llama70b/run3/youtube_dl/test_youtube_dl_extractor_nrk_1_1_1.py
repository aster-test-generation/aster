import unittest
from youtube_dl.extractor.nrk import NRKBaseI


class TestNRKBaseIE(unittest.TestCase):
    def test_init(self):
        instance = NRKBaseIE()
        self.assertIsInstance(instance, NRKBaseIE)

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
        json_data = instance._call_api(path, video_id)
        self.assertIsNotNone(json_data)

    def test_str_method(self):
        instance = NRKBaseIE()
        result = instance.__str__()
        self.assertEqual(result, 'NRKBaseIE')

    def test_repr_method(self):
        instance = NRKBaseIE()
        result = instance.__repr__()
        self.assertEqual(result, 'NRKBaseIE()')

class TestInfoExtractor(unittest.TestCase):
    def test_init(self):
        instance = InfoExtractor()
        self.assertIsInstance(instance, InfoExtractor)

    def test_str_method(self):
        instance = InfoExtractor()
        result = instance.__str__()
        self.assertEqual(result, 'InfoExtractor')

    def test_repr_method(self):
        instance = InfoExtractor()
        result = instance.__repr__()
        self.assertEqual(result, 'InfoExtractor()')

if __name__ == '__main__':
    unittest.main()