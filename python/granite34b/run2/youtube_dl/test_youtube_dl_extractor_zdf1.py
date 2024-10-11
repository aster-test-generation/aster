import unittest
from youtube_dl.extractor.zdf import ZDFBaseIE, ZDFIE, ZDFChannelIE

class TestZDFBaseIE(unittest.TestCase):
    def test_call_api(self):
        url = "https://api.zdf.de/content/210222_phx_nachgehakt_corona_protest"
        video_id = "210222_phx_nachgehakt_corona_protest"
        api_token = "your_api_token"
        referrer = "https://www.zdf.de/politik/phoenix-sendungen/wohin-fuehrt-der-protest-in-der-pandemie-100.html"
        headers = {
            "Api-Auth": f"Bearer {api_token}",
            "Referer": referrer
        }
        result = ZDFBaseIE._call_api(url, video_id, "Downloading JSON metadata", api_token, referrer)
        self.assertIsNotNone(result)

    def test_extract_subtitles(self):
        src = {
            "captions": [
                {
                    "uri": "https://example.com/caption.vtt",
                    "language": "deu"
                }
            ]
        }
        result = ZDFBaseIE._extract_subtitles(src)
        self.assertEqual(result, {"deu": [{"url": "https://example.com/caption.vtt"}]})

    def test_extract_format(self):
        video_id = "210222_phx_nachgehakt_corona_protest"
        formats = []
        format_urls = set()
        meta = {
            "url": "https://example.com/video.mp4",
            "mimeType": "video/mp4",
            "quality": "high",
            "language": "deu"
        }
        ZDFBaseIE._extract_format(video_id, formats, format_urls, meta)
        self.assertEqual(formats, [{
            "url": "https://example.com/video.mp4",
            "format_id": "http-high",
            "format_note": "high",
            "language": "deu",
            "quality": 2,
            "preference": -10
        }])

    def test_extract_ptmd(self):
        ptmd_url = "https://api.zdf.de/content/210222_phx_nachgehakt_corona_protest"
        video_id = "210222_phx_nachgehakt_corona_protest"
        api_token = "your_api_token"
        referrer = "https://www.zdf.de/politik/phoenix-sendungen/wohin-fuehrt-der-protest-in-der-pandemie-100.html"
        result = ZDFBaseIE._extract_ptmd(ptmd_url, video_id, api_token, referrer)
        self.assertIsNotNone(result)
        self.assertEqual(result["id"], video_id)
        self.assertIsNotNone(result["formats"])
        self.assertIsNotNone(result["subtitles"])

    def test_extract_player(self):
        webpage = """
        <html>
            <head>
                <script>
                    var player = {
                        "apiToken": "your_api_token",
                        "content": "https://api.zdf.de/content/210222_phx_nachgehakt_corona_protest"
                    };
                </script>
            </head>
        </html>
        """
        video_id = "210222_phx_nachgehakt_corona_protest"
        result = ZDFBaseIE._extract_player(webpage, video_id)
        self.assertEqual(result["apiToken"], "your_api_token")
        self.assertEqual(result["content"], "https://api.zdf.de/content/210222_phx_nachgehakt_corona_protest")


if __name__ == '__main__':
    unittest.main()