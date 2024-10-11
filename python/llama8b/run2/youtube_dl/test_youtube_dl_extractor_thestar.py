import unittest
from youtube_dl.extractor.thestar import TheStarIE


class TestTheStarIE(unittest.TestCase):
    def test_valid_url(self):
        ie = TheStarIE()
        self.assertTrue(ie._VALID_URL.match('http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'))

    def test_test(self):
        ie = TheStarIE()
        self.assertEqual(ie._TEST['url'], 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html')

    def test_info_dict(self):
        ie = TheStarIE()
        self.assertEqual(ie._TEST['info_dict']['id'], '4732393888001')

    def test_brightcove_url_template(self):
        ie = TheStarIE()
        self.assertEqual(ie.BRIGHTCOVE_URL_TEMPLATE, 'http://players.brightcove.net/794267642001/default_default/index.html?videoId=%s')

    def test_real_extract(self):
        ie = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        webpage = 'some webpage content'
        brightcove_id = '12345'
        self.assertEqual(ie._real_extract(url), self.url_result(ie.BRIGHTCOVE_URL_TEMPLATE % brightcove_id, 'BrightcoveNew', brightcove_id))

    def test_match_id(self):
        ie = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        self.assertEqual(ie._match_id(url), 'mankind-why-this-woman-started-a-men-s-skincare-line')

    def test_search_regex(self):
        ie = TheStarIE()
        webpage = 'some webpage content'
        self.assertEqual(ie._search_regex(r'mainartBrightcoveVideoId["\']?\s*:\s*["\']?(\d+)', webpage, 'brightcove id'), '12345')

    def test_url_result(self):
        ie = TheStarIE()
        url = 'http://www.example.com/video'
        self.assertEqual(ie.url_result(url, 'BrightcoveNew', '12345'), {'url': url, 'ie_key': 'BrightcoveNew', 'video_id': '12345'})

if __name__ == '__main__':
    unittest.main()