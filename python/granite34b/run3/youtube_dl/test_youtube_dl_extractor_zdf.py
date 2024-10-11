import unittest
from youtube_dl.extractor.zdf import ZDFBaseIE, ZDFIE


class TestZDFBaseIE(unittest.TestCase):
    def test_call_api(self):
        url = "https://api.zdf.de/web/api/v2/content/210222_phx_nachgehakt_corona_protest"
        video_id = "210222_phx_nachgehakt_corona_protest"
        api_token = "your_api_token"
        referrer = "https://www.zdf.de/politik/phoenix-sendungen/wohin-fuehrt-der-protest-in-der-pandemie-100.html"
        headers = {'Api-Auth': 'Bearer %s' % api_token, 'Referer': referrer}
        response = ZDFBaseIE._call_api(url, video_id, "Downloading JSON metadata", api_token, referrer)
        self.assertIsNotNone(response)

    def test_extract_subtitles(self):
        src = {
            'captions': [
                {'uri': 'https://example.com/caption1.vtt', 'language': 'deu'},
                {'uri': 'https://example.com/caption2.vtt', 'language': 'eng'},
            ]
        }
        subtitles = ZDFBaseIE._extract_subtitles(src)
        self.assertEqual(len(subtitles), 2)
        self.assertEqual(subtitles['deu'][0]['url'], 'https://example.com/caption1.vtt')
        self.assertEqual(subtitles['eng'][0]['url'], 'https://example.com/caption2.vtt')

    def test_extract_format(self):
        video_id = "210222_phx_nachgehakt_corona_protest"
        formats = []
        format_urls = set()
        meta = {
            'url': 'https://example.com/video.mp4',
            'mimeType': 'video/mp4',
            'type': 'mp4',
            'quality': 'high',
            'language': 'ger'
        }
        ZDFBaseIE._extract_format(video_id, formats, format_urls, meta)
        self.assertEqual(len(formats), 1)
        self.assertEqual(formats[0]['url'], 'https://example.com/video.mp4')
        self.assertEqual(formats[0]['format_id'], 'http-mp4-high')
        self.assertEqual(formats[0]['format_note'], 'high')
        self.assertEqual(formats[0]['language'], 'ger')
        self.assertEqual(formats[0]['quality'], 1)
        self.assertEqual(formats[0]['preference'], -10)

    def test_extract_ptmd(self):
        ptmd_url = "https://api.zdf.de/web/api/v2/content/210222_phx_nachgehakt_corona_protest"
        video_id = "210222_phx_nachgehakt_corona_protest"
        api_token = "your_api_token"
        referrer = "https://www.zdf.de/politik/phoenix-sendungen/wohin-fuehrt-der-protest-in-der-pandemie-100.html"
        response = ZDFBaseIE._call_api(ptmd_url, video_id, "Downloading JSON metadata", api_token, referrer)
        ptmd = ZDFBaseIE._extract_ptmd(ptmd_url, video_id, api_token, referrer)
        self.assertEqual(ptmd['id'], video_id)
        self.assertIsNotNone(ptmd['formats'])
        self.assertIsNotNone(ptmd['subtitles'])

if __name__ == '__main__':
    unittest.main()