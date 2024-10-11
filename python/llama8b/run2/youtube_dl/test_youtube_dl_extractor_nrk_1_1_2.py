import unittest
from youtube_dl.extractor.nrk import NRKBaseI


class TestNRKIE(unittest.TestCase):
    def test_init(self):
        ie = NRKIE()
        self.assertEqual(ie.__class__, NRKIE)

    def test__real_extract(self):
        ie = NRKIE()
        url = 'https://example.com/video'
        video_id = 'video_id'
        path_templ = 'playback/%s/' + video_id
        manifest = {'id': video_id, 'playable': {'assets': [{'url': 'format_url', 'format': 'hls'}]}}
        formats = ie._real_extract(url)
        self.assertEqual(formats, [{'url': 'format_url', 'format_id': 'hls', 'vcodec': 'none'}])

    def test_call_playback_api(self):
        ie = NRKIE()
        item = 'manifest'
        query = {'preferredCdn': 'akamai'}
        result = ie._call_api(path_templ % item, video_id, item, query=query)
        self.assertEqual(result, manifest)

    def test_extract_nrk_formats(self):
        ie = NRKIE()
        format_url = 'format_url'
        video_id = 'video_id'
        formats = ie._extract_nrk_formats(format_url, video_id)
        self.assertEqual(formats, [{'url': format_url, 'format_id': 'hls', 'vcodec': 'none'}])

    def test_sort_formats(self):
        ie = NRKIE()
        formats = [{'url': 'format_url1', 'format_id': 'hls'}, {'url': 'format_url2', 'format_id': 'mp4'}]
        ie._sort_formats(formats)
        self.assertEqual(formats, [{'url': 'format_url1', 'format_id': 'hls'}, {'url': 'format_url2', 'format_id': 'mp4'}])

    def test_determine_ext(self):
        ie = NRKIE()
        format_url = 'format_url'
        self.assertEqual(ie.determine_ext(format_url), 'm3u8')

    def test_int_or_none(self):
        ie = NRKIE()
        value = 1
        self.assertEqual(ie.int_or_none(value), 1)
        value = None
        self.assertEqual(ie.int_or_none(value), None)

    def test_parse_duration(self):
        ie = NRKIE()
        duration = '00:01:00'
        self.assertEqual(ie.parse_duration(duration), 3600)

    def test_str_or_none(self):
        ie = NRKIE()
        value = 'value'
        self.assertEqual(ie.str_or_none(value), 'value')
        value = None
        self.assertEqual(ie.str_or_none(value), None)

    def test_url_or_none(self):
        ie = NRKIE()
        url = 'url'
        self.assertEqual(ie.url_or_none(url), url)
        url = None
        self.assertEqual(ie.url_or_none(url), None)

    def test_try_get(self):
        ie = NRKIE()
        value = {'id': 'video_id'}
        self.assertEqual(ie.try_get(value, lambda x: x['id'], compat_str), 'video_id')
        value = None
        self.assertEqual(ie.try_get(value, lambda x: x['id'], compat_str), None)

    def test__match_id(self):
        ie = NRKIE()
        url = 'https://example.com/video/video_id'
        self.assertEqual(ie._match_id(url), 'video_id')

    def test__raise_error(self):
        ie = NRKIE()
        manifest = {'nonPlayable': 'error'}
        ie._raise_error(manifest)

    def test__search_regex(self):
        ie = NRKIE()
        text = 'Sesong 1'
        pattern = 'Sesong\\s+(\\d+)'
        self.assertEqual(ie._search_regex(pattern, text, 'season number'), '1')

if __name__ == '__main__':
    unittest.main()