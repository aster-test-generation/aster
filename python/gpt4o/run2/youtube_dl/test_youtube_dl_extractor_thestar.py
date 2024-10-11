import unittest
from youtube_dl.extractor.thestar import TheStarIE


class TestTheStarIE(unittest.TestCase):
    def setUp(self):
        self.instance = TheStarIE()

    def test__real_extract(self):
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        result = self.instance._real_extract(url).to_screen()
        self.assertIn('url', result)
        self.assertIn('id', result)
        self.assertEqual(result['id'], '4732393888001')

    def test__match_id(self):
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        result = self.instance._match_id(url)
        self.assertEqual(result, 'mankind-why-this-woman-started-a-men-s-skincare-line')

    def test__download_webpage(self):
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        display_id = 'mankind-why-this-woman-started-a-men-s-skincare-line'
        result = self.instance._download_webpage(url, display_id, note='Downloading webpage')
        self.assertIn('<html', result)

    def test__search_regex(self):
        webpage = '<html><body>mainartBrightcoveVideoId: "4732393888001"</body></html>'
        regex = r'mainartBrightcoveVideoId["\']?\s*:\s*["\']?(\d+)'
        result = self.instance._search_regex(regex, webpage, 'brightcove id', default='')
        self.assertEqual(result, '4732393888001')

    def test_BRIGHTCOVE_URL_TEMPLATE(self):
        brightcove_id = '4732393888001'
        result = self.instance.BRIGHTCOVE_URL_TEMPLATE % brightcove_id
        self.assertEqual(result, 'http://players.brightcove.net/794267642001/default_default/index.html?videoId=4732393888001')

if __name__ == '__main__':
    unittest.main()