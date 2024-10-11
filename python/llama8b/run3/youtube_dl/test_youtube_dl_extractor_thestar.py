import unittest
from youtube_dl.extractor.thestar import TheStarIE


class TestTheStarIE(unittest.TestCase):
    def test_valid_url(self):
        ie = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        self.assertTrue(ie._VALID_URL.match(url))

    def test_invalid_url(self):
        ie = TheStarIE()
        url = 'http://www.example.com'
        self.assertFalse(ie._VALID_URL.match(url))

    def test_real_extract(self):
        ie = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        webpage = 'test_webpage'
        brightcove_id = '123456'
        self.assertEqual(ie._real_extract(url), self.url_result(self.BRIGHTCOVE_URL_TEMPLATE % brightcove_id, 'BrightcoveNew', brightcove_id))

    def test_match_id(self):
        ie = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        self.assertEqual(ie._match_id(url), '4732393888001')

    def test_search_regex(self):
        ie = TheStarIE()
        webpage = 'test_webpage'
        self.assertEqual(ie._search_regex(r'mainartBrightcoveVideoId["\']?\s*:\s*["\']?(\d+)', webpage, 'brightcove id'), '123456')

    def test_url_result(self):
        ie = TheStarIE()
        url = 'http://players.brightcove.net/794267642001/default_default/index.html?videoId=123456'
        self.assertEqual(ie.url_result(url, 'BrightcoveNew', '123456'), url)

if __name__ == '__main__':
    unittest.main()