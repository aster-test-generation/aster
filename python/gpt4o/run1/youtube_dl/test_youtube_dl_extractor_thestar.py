import unittest
from youtube_dl.extractor.thestar import TheStarIE


class TestTheStarIE(unittest.TestCase):
    def setUp(self):
        self.instance = TheStarIE()

    def test__real_extract(self):
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        result = self.instance._real_extract(url)
        self.assertEqual(result['id'], '4732393888001')

    def test__match_id(self):
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        result = self.instance._match_id(url)
        self.assertEqual(result, 'mankind-why-this-woman-started-a-men-s-skincare-line')

    def test__download_webpage(self):
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        display_id = 'mankind-why-this-woman-started-a-men-s-skincare-line'
        result = self.instance._download_webpage(url, display_id)
        self.assertIn('Mankind: Why this woman started a men\'s skin care line', result)

    def test__search_regex(self):
        webpage = '<div>mainartBrightcoveVideoId: "4732393888001"</div>'
        result = self.instance._search_regex(
            r'mainartBrightcoveVideoId["\']?\s*:\s*["\']?(\d+)',
            webpage, 'brightcove id')
        self.assertEqual(result, '4732393888001')

    def test_url_result(self):
        brightcove_id = '4732393888001'
        result = self.instance.url_result(
            self.instance.BRIGHTCOVE_URL_TEMPLATE % brightcove_id,
            'BrightcoveNew', brightcove_id)
        self.assertEqual(result['id'], brightcove_id)

if __name__ == '__main__':
    unittest.main()