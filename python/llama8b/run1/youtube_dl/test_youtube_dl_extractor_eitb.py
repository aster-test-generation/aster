import unittest
from youtube_dl.extractor.eitb import EitbIE


class TestEitbIE(unittest.TestCase):
    def test__real_extract(self):
        ie = EitbIE()
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        video_id = '4090227752001'
        video = ie._download_json(
            'http://mam.eitb.eus/mam/REST/ServiceMultiweb/Video/MULTIWEBTV/%s/' % video_id,
            video_id, 'Downloading video JSON')
        media = video['web_media'][0]
        formats = []
        for rendition in media['RENDITIONS']:
            video_url = rendition.get('PMD_URL')
            if not video_url:
                continue
            tbr = float_or_none(rendition.get('ENCODING_RATE'), 1000)
            format_id = 'http'
            if tbr:
                format_id += '-%d' % int(tbr)
            formats.append({
                'url': rendition['PMD_URL'],
                'format_id': format_id,
                'width': int_or_none(rendition.get('FRAME_WIDTH')),
                'height': int_or_none(rendition.get('FRAME_HEIGHT')),
                'tbr': tbr,
            })
        hls_url = media.get('HLS_SURL')
        if hls_url:
            request = ie._download_json(
                'http://mam.eitb.eus/mam/REST/ServiceMultiweb/DomainRestrictedSecurity/TokenAuth/',
                video_id, 'Downloading auth token', fatal=False)
            if request:
                token = request.get('token')
                if token:
                    formats.extend(ie._extract_m3u8_formats(
                        '%s?hdnts=%s' % (hls_url, token), video_id, m3u8_id='hls', fatal=False))
        hds_url = media.get('HDS_SURL')
        if hds_url:
            formats.extend(ie._extract_f4m_formats(
                '%s?hdcore=3.7.0' % hds_url.replace('euskalsvod', 'euskalvod'),
                video_id, f4m_id='hds', fatal=False))
        self._sort_formats(formats)
        result = ie._real_extract(url)
        self.assertEqual(result['id'], video_id)
        self.assertEqual(result['title'], media.get('NAME_ES') or media.get('name') or media['NAME_EU'])
        self.assertEqual(result['description'], media.get('SHORT_DESC_ES') or video.get('desc_group') or media.get('SHORT_DESC_EU'))
        self.assertEqual(result['thumbnail'], media.get('STILL_URL') or media.get('THUMBNAIL_URL'))
        self.assertEqual(result['duration'], float_or_none(media.get('LENGTH'), 1000))
        self.assertEqual(result['timestamp'], parse_iso8601(media.get('BROADCST_DATE'), ' '))
        self.assertEqual(result['tags'], media.get('TAGS'))
        self.assertEqual(result['formats'], formats)

    def test__match_id(self):
        ie = EitbIE()
        url = 'http://www.eitb.tv/es/video/60-minutos-60-minutos-2013-2014/4104995148001/4090227752001/lasa-y-zabala-30-anos/'
        video_id = ie._match_id(url)
        self.assertEqual(video_id, '4090227752001')

    def test__download_json(self):
        ie = EitbIE()
        url = 'http://mam.eitb.eus/mam/REST/ServiceMultiweb/Video/MULTIWEBTV/4090227752001/'
        video_id = '4090227752001'
        result = ie._download_json(url, video_id, 'Downloading video JSON')
        self.assertEqual(result, {'web_media': [{'RENDITIONS': [{'PMD_URL': 'http://example.com/video.mp4'}]}]})

if __name__ == '__main__':
    unittest.main()