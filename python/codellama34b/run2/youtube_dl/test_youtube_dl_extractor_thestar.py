import unittest
from youtube_dl.extractor.thestar import TheStarIE



class TestTheStarIE(unittest.TestCase):
    def test_real_extract(self):
        instance = TheStarIE()
        result = instance._real_extract("http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html")
        self.assertEqual(result, "http://players.brightcove.net/794267642001/default_default/index.html?videoId=4732393888001")

    def test_match_id(self):
        instance = TheStarIE()
        result = instance._match_id("http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html")
        self.assertEqual(result, "mankind-why-this-woman-started-a-men-s-skincare-line")

    def test_search_regex(self):
        instance = TheStarIE()
        result = instance._search_regex(r'mainartBrightcoveVideoId["\']?\s*:\s*["\']?(\d+)', "http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html", "brightcove id")
        self.assertEqual(result, "4732393888001")

    def test_download_webpage(self):
        instance = TheStarIE()
        result = instance._download_webpage("http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html", "4732393888001")
        self.assertEqual(result, "http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html")

    def test_url_result(self):
        instance = TheStarIE()
        result = instance.url_result("http://players.brightcove.net/794267642001/default_default/index.html?videoId=4732393888001", "BrightcoveNew", "4732393888001")
        self.assertEqual(result, "http://players.brightcove.net/794267642001/default_default/index.html?videoId=4732393888001")

    def test_valid_url(self):
        instance = TheStarIE()
        result = instance._VALID_URL
        self.assertEqual(result, "https?://(?:www\.)?thestar\.com/(?:[^/]+/)*(?P<id>.+)\.html")

if __name__ == '__main__':
    unittest.main()