import unittest
from youtube_dl.extractor.heise import HeiseIE


class TestHeiseIE(unittest.TestCase):
    def test_real_extract(self):
        ie = HeiseIE()
        url = 'http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html'
        result = ie._real_extract(url)
        self.assertEqual(result['id'], '1_kkrq94sm')
        self.assertEqual(result['ext'], 'mp4')
        self.assertEqual(result['title'], "Podcast: c't uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone")
        self.assertEqual(result['timestamp'], 1512734959)
        self.assertEqual(result['upload_date'], '20171208')
        self.assertEqual(result['description'], 'md5:c934cbfb326c669c2bcabcbe3d3fcd20')

    def test_extract_title(self):
        ie = HeiseIE()
        webpage = '<div class="videoplayerjw" data-title="Test Title">'
        title = ie._extract_title(webpage)
        self.assertEqual(title, 'Test Title')

    def test_search_regex(self):
        ie = HeiseIE()
        webpage = '<div class="videoplayerjw" data-container="12345" data-sequenz="67890">'
        container_id = ie._search_regex(r'<div class="videoplayerjw"[^>]+data-container="([0-9]+)"', webpage, 'container ID')
        self.assertEqual(container_id, '12345')
        sequenz_id = ie._search_regex(r'<div class="videoplayerjw"[^>]+data-sequenz="([0-9]+)"', webpage, 'sequenz ID')
        self.assertEqual(sequenz_id, '67890')

    def test_download_webpage(self):
        ie = HeiseIE()
        url = 'http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html'
        webpage = ie._download_webpage(url, 'video_id')
        self.assertIsNotNone(webpage)

    def test_make_kaltura_result(self):
        ie = HeiseIE()
        kaltura_url = 'http://kaltura.com/video'
        result = ie._make_kaltura_result(kaltura_url)
        self.assertEqual(result['_type'], 'url_transparent')
        self.assertEqual(result['url'], smuggle_url(kaltura_url, {'source_url': 'http://www.heise.de/video/artikel/Podcast-c-t-uplink-3-3-Owncloud-Tastaturen-Peilsender-Smartphone-2404147.html'}))
        self.assertEqual(result['ie_key'], KalturaIE.ie_key())
        self.assertEqual(result['title'], "Podcast: c't uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone")
        self.assertEqual(result['description'], 'md5:c934cbfb326c669c2bcabcbe3d3fcd20')

    def test_playlist_from_matches(self):
        ie = HeiseIE()
        yt_urls = ['http://youtube.com/video1', 'http://youtube.com/video2']
        result = ie.playlist_from_matches(yt_urls, 'video_id', "Podcast: c't uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone", ie=YoutubeIE.ie_key())
        self.assertEqual(result['id'], 'video_id')
        self.assertEqual(result['title'], "Podcast: c't uplink 3.3 – Owncloud / Tastaturen / Peilsender Smartphone")
        self.assertEqual(result['entries'], [{'url': 'http://youtube.com/video1'}, {'url': 'http://youtube.com/video2'}])

    def test_sort_formats(self):
        ie = HeiseIE()
        formats = [{'url': 'http://video1.mp4', 'format_note': '1080p'}, {'url': 'http://video2.mp4', 'format_note': '720p'}, {'url': 'http://video3.mp4', 'format_note': '480p'}]
        ie._sort_formats(formats)
        self.assertEqual(formats, [{'url': 'http://video1.mp4', 'format_note': '1080p'}, {'url': 'http://video2.mp4', 'format_note': '720p'}, {'url': 'http://video3.mp4', 'format_note': '480p'}])

if __name__ == '__main__':
    unittest.main()