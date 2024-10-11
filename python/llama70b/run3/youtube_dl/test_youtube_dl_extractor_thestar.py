import unittest
from youtube_dl.extractor.thestar import TheStarIE


class TestTheStarIE(unittest.TestCase):
    def test_init(self):
        instance = TheStarIE()
        self.assertIsInstance(instance, TheStarIE)

    def test_valid_url(self):
        instance = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        result = instance.suitable(url)
        self.assertTrue(result)

    def test_invalid_url(self):
        instance = TheStarIE()
        url = 'https://example.com'
        result = instance.suitable(url)
        self.assertFalse(result)

    def test_real_extract(self):
        instance = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test_match_id(self):
        instance = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        result = instance._match_id(url)
        self.assertEqual(result, 'mankind-why-this-woman-started-a-men-s-skincare-line')

    def test_download_webpage(self):
        instance = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        display_id = 'mankind-why-this-woman-started-a-men-s-skincare-line'
        result = instance._download_webpage(url, display_id)
        self.assertIsInstance(result, str)

    def test_search_regex(self):
        instance = TheStarIE()
        webpage = '<html>mainartBrightcoveVideoId: 4732393888001</html>'
        pattern = r'mainartBrightcoveVideoId["\']?\s*:\s*["\']?(\d+)'
        result = instance._search_regex(pattern, webpage, 'brightcove id')
        self.assertEqual(result, '4732393888001')

    def test_url_result(self):
        instance = TheStarIE()
        url = 'http://players.brightcove.net/794267642001/default_default/index.html?videoId=4732393888001'
        ie_key = 'BrightcoveNew'
        video_id = '4732393888001'
        result = instance.url_result(url, ie_key, video_id)
        self.assertIsInstance(result, dict)

    def test_str_method(self):
        instance = TheStarIE()
        result = instance.__str__()
        self.assertEqual(result, 'TheStarIE')

    def test_repr_method(self):
        instance = TheStarIE()
        result = instance.__repr__()
        self.assertEqual(result, 'TheStarIE()')

    def test_eq_method(self):
        instance1 = TheStarIE()
        instance2 = TheStarIE()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()