import unittest
from youtube_dl.extractor.nrk import NRKTVIE


class TestNRKTVIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKTVIE()
        video_id = "1.234567"
        url = "https://tv.nrk.no/program/1.234567"
        result = ie._real_extract(url)
        self.assertEqual(result["id"], video_id)
        self.assertEqual(result["title"], "NRK TV - Program Title")
        self.assertEqual(result["description"], "Program description")
        self.assertEqual(result["thumbnail"], "https://example.com/thumbnail.jpg")
        self.assertEqual(result["duration"], 3600)
        self.assertEqual(result["timestamp"], 1632982400)
        self.assertEqual(result["view_count"], 1000)
        self.assertEqual(result["age_limit"], 0)
        self.assertEqual(result["formats"], [
            {"format_id": "sd", "width": 640, "height": 360, "ext": "mp4", "url": "https://example.com/sd.mp4"},
            {"format_id": "hd", "width": 1280, "height": 720, "ext": "mp4", "url": "https://example.com/hd.mp4"},
        ])
        self.assertEqual(result["subtitles"], {
            "en": [{"url": "https://example.com/en.vtt", "ext": "vtt"}],
            "no": [{"url": "https://example.com/no.vtt", "ext": "vtt"}],
        })
        self.assertEqual(result["categories"], ["News", "Sports"])
        self.assertEqual(result["tags"], ["tag1", "tag2"])
        self.assertEqual(result["series"], "Series Title")
        self.assertEqual(result["season_number"], 1)
        self.assertEqual(result["season"], "Season 1")
        self.assertEqual(result["episode_number"], 1)
        self.assertEqual(result["episode"], "Episode 1")
        self.assertEqual(result["channel"], "NRK")
        self.assertEqual(result["channel_id"], "channel_id")
        self.assertEqual(result["channel_url"], "https://tv.nrk.no/channel/channel_id")
        self.assertEqual(result["uploader"], "Uploader Name")
        self.assertEqual(result["uploader_id"], "uploader_id")
        self.assertEqual(result["uploader_url"], "https://tv.nrk.no/profile/uploader_id")
        self.assertEqual(result["http_headers"], {
            "Cookie": "example_cookie=1234567890",
        })

if __name__ == '__main__':
    unittest.main()