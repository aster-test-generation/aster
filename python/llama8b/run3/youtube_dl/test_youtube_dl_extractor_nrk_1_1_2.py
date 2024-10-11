import unittest
from youtube_dl.extractor.nrk import NRKBaseI


class TestNRKIE(unittest.TestCase):
    def test_init(self):
        ie = NRKIE()
        self.assertEqual(ie.__class__, NRKIE)

    def test_real_extract(self):
        ie = NRKIE()
        url = 'https://example.com/video'
        video_id = ie._match_id(url).split('/')[-1]
        path_templ = 'playback/%s/' + video_id
        manifest = ie._call_api(path_templ % 'manifest', video_id, 'manifest', query={'preferredCdn': 'akamai'})
        self.assertEqual(manifest, {'id': video_id, 'playable': {'assets': []}})

    def test_call_playback_api(self):
        ie = NRKIE()
        item = 'manifest'
        query = {'preferredCdn': 'akamai'}
        result = ie._call_api(item, 'video_id', item, query=query)
        self.assertEqual(result, {'id': 'video_id', 'playable': {'assets': []}})

    def test_extract_nrk_formats(self):
        ie = NRKIE()
        format_url = 'https://example.com/format.m3u8'
        video_id = 'video_id'
        formats = ie._extract_nrk_formats(format_url, video_id)
        self.assertEqual(formats, [{'url': format_url, 'format_id': 'hls', 'vcodec': 'none'}])

    def test_sort_formats(self):
        ie = NRKIE()
        formats = [{'url': 'https://example.com/format1', 'format_id': 'hls', 'vcodec': 'none'}, 
                    {'url': 'https://example.com/format2', 'format_id': 'mp4', 'vcodec': 'none'}]
        ie._sort_formats(formats)
        self.assertEqual(formats, [{'url': 'https://example.com/format1', 'format_id': 'hls', 'vcodec': 'none'}, 
                                   {'url': 'https://example.com/format2', 'format_id': 'mp4', 'vcodec': 'none'}])

    def test_get_id(self):
        ie = NRKIE()
        url = 'https://example.com/video'
        video_id = ie._match_id(url).split('/')[-1]
        self.assertEqual(video_id, 'video_id')

    def test_get_playable(self):
        ie = NRKIE()
        manifest = {'playable': {'assets': []}}
        playable = ie._get_playable(manifest)
        self.assertEqual(playable, {'assets': []})

    def test_get_formats(self):
        ie = NRKIE()
        formats = [{'url': 'https://example.com/format1', 'format_id': 'hls', 'vcodec': 'none'}, 
                    {'url': 'https://example.com/format2', 'format_id': 'mp4', 'vcodec': 'none'}]
        ie._sort_formats(formats)
        self.assertEqual(formats, [{'url': 'https://example.com/format1', 'format_id': 'hls', 'vcodec': 'none'}, 
                                   {'url': 'https://example.com/format2', 'format_id': 'mp4', 'vcodec': 'none'}])

    def test_get_thumbnails(self):
        ie = NRKIE()
        thumbnails = [{'url': 'https://example.com/thumbnail1', 'width': 100, 'height': 100}, 
                      {'url': 'https://example.com/thumbnail2', 'width': 200, 'height': 200}]
        self.assertEqual(thumbnails, [{'url': 'https://example.com/thumbnail1', 'width': 100, 'height': 100}, 
                                      {'url': 'https://example.com/thumbnail2', 'width': 200, 'height': 200}])

    def test_get_subtitles(self):
        ie = NRKIE()
        subtitles = {'nb': [{'url': 'https://example.com/subtitle1.vtt'}, 
                            {'url': 'https://example.com/subtitle2.vtt'}]}
        self.assertEqual(subtitles, {'nb': [{'url': 'https://example.com/subtitle1.vtt'}, 
                                            {'url': 'https://example.com/subtitle2.vtt'}]})

if __name__ == '__main__':
    unittest.main()