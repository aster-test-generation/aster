import unittest
from youtube_dl.extractor.eitb import EitbIE


class TestEitbIE(unittest.TestCase):
    def test_real_extract(self):
        ie = EitbIE()
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        video_id = ie._match_id(url)
        video = ie._download_json(
            'http://mam.eitb.eus/mam/REST/ServiceMultiweb/Video/MULTIWEBTV/%s/' % video_id,
            video_id, 'Downloading video JSON')
        media = video['web_media'][0]
        formats = ie._real_extract(url)
        self.assertEqual(formats['id'], video_id)
        self.assertEqual(formats['title'], media.get('NAME_ES') or media.get('name') or media['NAME_EU'])
        self.assertEqual(formats['description'], media.get('SHORT_DESC_ES') or video.get('desc_group') or media.get('SHORT_DESC_EU'))
        self.assertEqual(formats['thumbnail'], media.get('STILL_URL') or media.get('THUMBNAIL_URL'))
        self.assertEqual(formats['duration'], float_or_none(media.get('LENGTH'), 1000))
        self.assertEqual(formats['timestamp'], parse_iso8601(media.get('BROADCST_DATE'), ' '))
        self.assertEqual(formats['tags'], media.get('TAGS'))
        self.assertEqual(formats['formats'], [])

    def test_match_id(self):
        ie = EitbIE()
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        video_id = ie._match_id(url)
        self.assertEqual(video_id, '4090227752001')

    def test_download_json(self):
        ie = EitbIE()
        video_id = '4090227752001'
        video = ie._download_json(
            'http://mam.eitb.eus/mam/REST/ServiceMultiweb/Video/MULTIWEBTV/%s/' % video_id,
            video_id, 'Downloading video JSON')
        self.assertEqual(video['web_media'][0]['NAME_ES'], '60 minutos (Lasa y Zabala, 30 años)')

    def test_sort_formats(self):
        ie = EitbIE()
        formats = [
            {'url': 'http://url1', 'format_id': '1'},
            {'url': 'http://url2', 'format_id': '2'},
            {'url': 'http://url3', 'format_id': '3'},
        ]
        ie._sort_formats(formats)
        self.assertEqual(formats[0]['format_id'], '1')
        self.assertEqual(formats[1]['format_id'], '2')
        self.assertEqual(formats[2]['format_id'], '3')

    def test_extract_m3u8_formats(self):
        ie = EitbIE()
        url = 'http://mam.eitb.eus/mam/REST/ServiceMultiweb/DomainRestrictedSecurity/TokenAuth/'
        request = sanitized_Request(url, headers={'Referer': 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'})
        token_data = ie._download_json(request, '4090227752001', 'Downloading auth token', fatal=False)
        token = token_data.get('token')
        if token:
            formats = ie._extract_m3u8_formats('%s?hdnts=%s' % ('http://mam.eitb.eus/mam/REST/ServiceMultiweb/DomainRestrictedSecurity/TokenAuth/', token), '4090227752001', m3u8_id='hls', fatal=False)
            self.assertEqual(len(formats), 1)

if __name__ == '__main__':
    unittest.main()