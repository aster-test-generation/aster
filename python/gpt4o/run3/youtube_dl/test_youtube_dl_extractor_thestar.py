import unittest
from youtube_dl.extractor.thestar import TheStarIE


class TestTheStarIE(unittest.TestCase):
    def setUp(self):
        self.instance = TheStarIE()

    def test__real_extract(self):
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        result = self.instance._real_extract(url).to_screen()
        self.assertEqual(result['url'], 'http://players.brightcove.net/794267642001/default_default/index.html?videoId=4732393888001')

    def test__match_id(self):
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        result = self.instance._match_id(url)
        self.assertEqual(result, 'mankind-why-this-woman-started-a-men-s-skincare-line')

    def test__download_webpage(self):
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        display_id = 'mankind-why-this-woman-started-a-men-s-skincare-line'
        result = self.instance._download_webpage(url, display_id, to_screen=True)
        self.assertIn('Mankind: Why this woman started a men\'s skin care line', result)

    def test__search_regex(self):
        webpage = '<div>mainartBrightcoveVideoId: "4732393888001"</div>'
        result = self.instance._search_regex(r'mainartBrightcoveVideoId["\']?\s*:\s*["\']?(\d+)', webpage, 'brightcove id', default=None)
        self.assertEqual(result, '4732393888001')

    def test_url_result(self):
        url = 'http://players.brightcove.net/794267642001/default_default/index.html?videoId=4732393888001'
        result = self.instance.url_result(url, 'BrightcoveNew', '4732393888001')
        self.assertEqual(result['url'], url)
        self.assertEqual(result['ie_key'], 'BrightcoveNew')
        self.assertEqual(result['id'], '4732393888001')

if __name__ == '__main__':
    unittest.main()