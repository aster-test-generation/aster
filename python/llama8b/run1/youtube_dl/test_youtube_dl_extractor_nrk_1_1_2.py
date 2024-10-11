import unittest
from unittest.mock import patch
from youtube_dl.extractor.nrk import NRKIE, NRKBaseI


class TestNRKIE(unittest.TestCase):
    def test_init(self):
        ie = NRKIE()
        self.assertEqual(ie.__class__, NRKIE)

    def test__real_extract(self):
        ie = NRKIE()
        with patch('youtube_dl.extractor.nrk.NRKBaseIE._match_id') as mock_match_id:
            mock_match_id.return_value = 'video_id'
            with patch('youtube_dl.extractor.nrk.NRKBaseIE._call_api') as mock_call_api:
                mock_call_api.return_value = {'id': 'video_id', 'playable': {'assets': [{'url': 'format_url'}]}}
                result = ie._real_extract('url')
                self.assertEqual(result['id'], 'video_id')
                self.assertEqual(result['formats'], [{'url': 'format_url'}])

    def test_call_playback_api(self):
        ie = NRKIE()
        with patch('youtube_dl.extractor.nrk.NRKBaseIE._call_api') as mock_call_api:
            mock_call_api.return_value = {'id': 'video_id'}
            result = ie.call_playback_api('item', query=None)
            self.assertEqual(result, {'id': 'video_id'})

    def test__sort_formats(self):
        ie = NRKIE()
        formats = [{'url': 'format_url1'}, {'url': 'format_url2'}]
        ie._sort_formats(formats)
        self.assertEqual(formats, sorted(formats, key=lambda x: x['url']))

    def test__extract_nrk_formats(self):
        ie = NRKIE()
        format_url = 'format_url'
        video_id = 'video_id'
        result = ie._extract_nrk_formats(format_url, video_id)
        self.assertEqual(result, [])

    def test__raise_error(self):
        ie = NRKIE()
        manifest = {'nonPlayable': 'error'}
        ie._raise_error(manifest)
        self.fail('Expected ExtractorError')

    def test__str__(self):
        ie = NRKIE()
        self.assertEqual(str(ie), 'NRKIE')

    def test__repr__(self):
        ie = NRKIE()
        self.assertEqual(repr(ie), 'NRKIE()')

    def test__eq__(self):
        ie1 = NRKIE()
        ie2 = NRKIE()
        self.assertEqual(ie1, ie2)

if __name__ == '__main__':
    unittest.main()