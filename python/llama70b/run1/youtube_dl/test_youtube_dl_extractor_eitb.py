import unittest
from youtube_dl.extractor.eitb import EitbIE, InfoExtractor


class TestEitbIE(unittest.TestCase):
    def test_IE_NAME(self):
        instance = EitbIE()
        self.assertEqual(instance.IE_NAME, 'eitb.tv')

    def test__VALID_URL(self):
        instance = EitbIE()
        self.assertEqual(instance._VALID_URL, r'https?://(?:www\.)?eitb\.tv/(?:eu/bideoa|es/video)/[^/]+/\d+/(?P<id>\d+)')

    def test__TEST(self):
        instance = EitbIE()
        self.assertEqual(instance._TEST, {
            'url': 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/',
            'md5': 'edf4436247185adee3ea18ce64c47998',
            'info_dict': {
                'id': '4090227752001',
                'ext': 'mp4',
                'title': '60 minutos (Lasa y Zabala, 30 años)',
                'description': 'Programa de reportajes de actualidad.',
                'duration': 3996.76,
                'timestamp': 1381789200,
                'upload_date': '20131014',
                'tags': list,
            },
        })

    def test__real_extract(self):
        instance = EitbIE()
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        result = instance._real_extract(url)
        self.assertIsNotNone(result)

    def test__match_id(self):
        instance = EitbIE()
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        result = instance._match_id(url)
        self.assertEqual(result, '4090227752001')

    def test__download_json(self):
        instance = EitbIE()
        url = 'http://mam.eitb.eus/mam/REST/ServiceMultiweb/Video/MULTIWEBTV/4090227752001/'
        result = instance._download_json(url, '4090227752001', 'Downloading video JSON')
        self.assertIsNotNone(result)

    def test__extract_m3u8_formats(self):
        instance = EitbIE()
        url = 'http://mam.eitb.eus/mam/REST/ServiceMultiweb/DomainRestrictedSecurity/TokenAuth/'
        token = 'some_token'
        result = instance._extract_m3u8_formats('%s?hdnts=%s' % (url, token), '4090227752001', m3u8_id='hls', fatal=False)
        self.assertIsNotNone(result)

    def test__extract_f4m_formats(self):
        instance = EitbIE()
        url = 'http://mam.eitb.eus/mam/REST/ServiceMultiweb/Video/MULTIWEBTV/4090227752001/'
        result = instance._extract_f4m_formats('%s?hdcore=3.7.0' % url.replace('euskalsvod', 'euskalvod'), '4090227752001', f4m_id='hds', fatal=False)
        self.assertIsNotNone(result)

    def test__sort_formats(self):
        instance = EitbIE()
        formats = [{'url': 'http://example.com'}]
        instance._sort_formats(formats)
        self.assertEqual(formats, [{'url': 'http://example.com'}])

    def test___init__(self):
        instance = EitbIE()
        self.assertIsInstance(instance, InfoExtractor)

    def test___str__(self):
        instance = EitbIE()
        result = instance.__str__()
        self.assertEqual(result, 'EitbIE')

    def test___repr__(self):
        instance = EitbIE()
        result = instance.__repr__()
        self.assertEqual(result, 'EitbIE()')

if __name__ == '__main__':
    unittest.main()