import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKBaseIE(unittest.TestCase):
    def test_extract_nrk_formats(self):
        # Test with valid asset URL
        asset_url = 'https://ps-p3-e1.akamaized.net/play/.../master.m3u8?hdnea=st=1648686400~exp=1648686700~acl=/*~data=eyJ'
        video_id = '12345'
        formats = NRKBaseIE._extract_nrk_formats(asset_url, video_id)
        self.assertGreater(len(formats), 0)

        # Test with invalid asset URL
        asset_url = 'https://invalid-url.com'
        with self.assertRaises(ExtractorError):
            NRKBaseIE._extract_nrk_formats(asset_url, video_id)

    def test_raise_error(self):
        # Test with valid data
        data = {'messageType': 'ProgramRightsAreNotReady'}
        with self.assertRaises(ExtractorError) as cm:
            NRKBaseIE._raise_error(data)
        self.assertEqual(str(cm.exception), 'NRK said: Du kan dessverre ikke se eller høre programmet')

        # Test with invalid data
        data = {'messageType': 'InvalidMessageType'}
        with self.assertRaises(ExtractorError) as cm:
            NRKBaseIE._raise_error(data)
        self.assertEqual(str(cm.exception), 'NRK said: InvalidMessageType')

    def test_call_api(self):
        # Test with valid path and query
        path = 'api/path'
        video_id = '12345'
        query = {'param1': 'value1', 'param2': 'value2'}
        data = NRKBaseIE._call_api(path, video_id, query=query)
        self.assertIsNotNone(data)

        # Test with invalid path
        path = 'invalid/path'
        with self.assertRaises(ExtractorError):
            NRKBaseIE._call_api(path, video_id)

if __name__ == '__main__':
    unittest.main()