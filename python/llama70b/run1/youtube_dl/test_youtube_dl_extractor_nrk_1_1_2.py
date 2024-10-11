import unittest
from youtube_dl.extractor.nrk import NRKBaseIE, NRKI


class TestNRKIE(unittest.TestCase):
    def test_init(self):
        instance = NRKIE()
        self.assertIsInstance(instance, NRKIE)

    def test_real_extract(self):
        instance = NRKIE()
        url = 'https://example.com/video'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test_match_id(self):
        instance = NRKIE()
        url = 'https://example.com/video/12345'
        result = instance._match_id(url)
        self.assertEqual(result, '12345')

    def test_call_api(self):
        instance = NRKIE()
        path_templ = 'playback/%s/'
        video_id = '12345'
        item = 'manifest'
        query = {'preferredCdn': 'akamai'}
        result = instance._call_api(path_templ % item, video_id, item, query=query)
        self.assertIsInstance(result, dict)

    def test_extract_nrk_formats(self):
        instance = NRKIE()
        format_url = 'https://example.com/format.m3u8'
        video_id = '12345'
        result = instance._extract_nrk_formats(format_url, video_id)
        self.assertIsInstance(result, list)

    def test_sort_formats(self):
        instance = NRKIE()
        formats = [{'url': 'https://example.com/format1.m3u8'}, {'url': 'https://example.com/format2.m3u8'}]
        instance._sort_formats(formats)
        self.assertEqual(formats, sorted(formats, key=lambda x: x['url']))

    def test_raise_error(self):
        instance = NRKIE()
        manifest = {'nonPlayable': 'Error message'}
        with self.assertRaises(ExtractorError):
            instance._raise_error(manifest)

    def test_str_method(self):
        instance = NRKIE()
        result = instance.__str__()
        self.assertEqual(result, 'NRKIE')

    def test_repr_method(self):
        instance = NRKIE()
        result = instance.__repr__()
        self.assertEqual(result, 'NRKIE()')

class TestNRKBaseIE(unittest.TestCase):
    def test_init(self):
        instance = NRKBaseIE()
        self.assertIsInstance(instance, NRKBaseIE)

    def test_search_regex(self):
        instance = NRKBaseIE()
        pattern = 'regex pattern'
        string = 'string to search'
        default = 'default value'
        result = instance._search_regex(pattern, string, 'group name', default=default)
        self.assertEqual(result, default)

if __name__ == '__main__':
    unittest.main()