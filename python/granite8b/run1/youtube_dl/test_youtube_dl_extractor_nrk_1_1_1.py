from unittest import TestCase
import unittest
from youtube_dl.extractor.nrk import NRKBaseIE


class TestNRKBaseIE(unittest.TestCase):
    def test_extract_nrk_formats(self):
        ie = NRKBaseIE()
        asset_url = 'https://example.com/asset.mp4'
        video_id = '12345'
        formats = ie._extract_nrk_formats(asset_url, video_id)
        self.assertEqual(len(formats), 1)
        self.assertEqual(formats[0]['url'], asset_url)
        self.assertEqual(formats[0]['format_id'], 'mp4')

    def test_raise_error(self):
        ie = NRKBaseIE()
        data = {'messageType': 'ProgramRightsAreNotReady', 'endUserMessage': 'Du kan dessverre ikke se eller høre programmet'}
        with self.assertRaises(ExtractorError) as cm:
            ie._raise_error(data)
        self.assertEqual(str(cm.exception), 'NRK said: Du kan dessverre ikke se eller høre programmet')

    def test_call_api(self):
        ie = NRKBaseIE()
        path = 'example/path'
        video_id = '12345'
        item = 'example item'
        note = 'Downloading example item JSON'
        fatal = True
        query = {'param1': 'value1', 'param2': 'value2'}
        ie._call_api(path, video_id, item, note, fatal, query)
        # Add assertions for the API call here

if __name__ == '__main__':
    unittest.main()