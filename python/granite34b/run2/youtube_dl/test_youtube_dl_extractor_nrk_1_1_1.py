import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKBaseIE(unittest.TestCase):
    def test_extract_nrk_formats(self):
        # Test with Akamai asset URL
        asset_url = 'https://some-akamai-url.akamaihd.net/i/'
        video_id = 'some_video_id'
        formats = NRKBaseIE._extract_nrk_formats(asset_url, video_id)
        self.assertIsNotNone(formats)

        # Test with M3U8 asset URL
        asset_url = 'https://some-m3u8-url.m3u8'
        formats = NRKBaseIE._extract_nrk_formats(asset_url, video_id)
        self.assertIsNotNone(formats)

    def test_raise_error(self):
        # Test with geo-restricted data
        data = {'messageType': 'ProgramIsGeoBlocked'}
        with self.assertRaises(ExtractorError) as context:
            NRKBaseIE._raise_error(data)
        self.assertTrue('NRK har ikke rettigheter til å vise dette programmet utenfor Norge' in str(context.exception))

        # Test with other data
        data = {'messageType': 'SomeRandomMessageType'}
        with self.assertRaises(ExtractorError) as context:
            NRKBaseIE._raise_error(data)
        self.assertTrue('SomeRandomMessageType' in str(context.exception))

    def test_call_api(self):
        # Test with valid path and query
        path = 'some/api/path'
        video_id = 'some_video_id'
        query = {'param1': 'value1', 'param2': 'value2'}
        data = NRKBaseIE._call_api(path, video_id, query=query)
        self.assertIsNotNone(data)

        # Test with invalid path
        path = 'invalid/api/path'
        with self.assertRaises(ExtractorError):
            NRKBaseIE._call_api(path, video_id)

if __name__ == '__main__':
    unittest.main()