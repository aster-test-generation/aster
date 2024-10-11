from unittest import mock
import unittest
from youtube_dl.extractor.nrk import NRKBaseIE


class TestNRKBaseIE(unittest.TestCase):
    def test_extract_nrk_formats(self):
        ie = NRKBaseIE()
        asset_url = 'https://example.com/asset.m3u8'
        video_id = '12345'
        formats = ie._extract_nrk_formats(asset_url, video_id)
        self.assertIsInstance(formats, list)
        self.assertGreater(len(formats), 0)

    def test_raise_error(self):
        ie = NRKBaseIE()
        data = {'messageType': 'ProgramRightsAreNotReady', 'endUserMessage': 'Du kan dessverre ikke se eller høre programmet'}
        with self.assertRaises(ExtractorError) as cm:
            ie._raise_error(data)
        self.assertEqual(str(cm.exception), 'NRK said: Du kan dessverre ikke se eller høre programmet')

    def test_call_api(self):
        ie = NRKBaseIE()
        path = 'api/path'
        video_id = '67890'
        item = 'item'
        note = 'Downloading item JSON'
        fatal = True
        query = {'param1': 'value1', 'param2': 'value2'}
        result = ie._call_api(path, video_id, item, note, fatal, query)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()