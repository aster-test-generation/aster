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
        path = 'api/path'
        video_id = '12345'
        item = 'item'
        note = 'Downloading item JSON'
        fatal = True
        query = {'param1': 'value1', 'param2': 'value2'}
        ie._call_api(path, video_id, item, note, fatal, query)
        self.assertEqual(ie._download_json.call_count, 1)
        args, kwargs = ie._download_json.call_args
        self.assertEqual(args[0], urljoin('http://psapi.nrk.no/', path))
        self.assertEqual(args[1], video_id)
        self.assertEqual(args[2], note)
        self.assertEqual(args[3], fatal)
        self.assertEqual(kwargs['query'], query)
        self.assertEqual(kwargs['headers']['Accept-Encoding'], 'gzip, deflate, br')

if __name__ == '__main__':
    unittest.main()