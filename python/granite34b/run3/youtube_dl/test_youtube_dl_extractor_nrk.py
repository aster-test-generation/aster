import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKBaseIE(unittest.TestCase):
    def test_extract_nrk_formats(self):
        asset_url = 'https://ps-in-akamaihd-net.akamaized.net/play/.../master.m3u8?hdnea=st=1594705699~exp=1594709299~acl=/*~data=eyJ'
        video_id = '12345'
        formats = NRKBaseIE._extract_nrk_formats(asset_url, video_id)
        self.assertIsNotNone(formats)

    def test_raise_error(self):
        data = {'messageType': 'ProgramRightsAreNotReady', 'endUserMessage': 'You cannot watch or listen to the program'}
        with self.assertRaises(ExtractorError) as context:
            NRKBaseIE._raise_error(data)
        self.assertTrue('You cannot watch or listen to the program' in str(context.exception))

    def test_call_api(self):
        path = 'api/path'
        video_id = '12345'
        item = 'item'
        note = 'Downloading item JSON'
        query = {'key': 'value'}
        data = NRKBaseIE._call_api(path, video_id, item, note, True, query)
        self.assertIsNotNone(data)

if __name__ == '__main__':
    unittest.main()