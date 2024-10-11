import unittest
from youtube_dl.extractor.thestar import TheStarIE


class TestTheStarIE(unittest.TestCase):
    def test_init(self):
        instance = TheStarIE()
        self.assertIsInstance(instance, TheStarIE)

    def test_valid_url(self):
        instance = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        self.assertTrue(instance.suitable(url))

    def test_match_id(self):
        instance = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        result = instance._match_id(url)
        self.assertEqual(result, 'mankind-why-this-woman-started-a-men-s-skincare-line')

    def test_real_extract(self):
        instance = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        result = instance._real_extract(url)
        self.assertIsInstance(result, dict)

    def test_download_webpage(self):
        instance = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        result = instance._download_webpage(url, 'mankind-why-this-woman-started-a-men-s-skincare-line')
        self.assertIsInstance(result, str)

    def test_search_regex(self):
        instance = TheStarIE()
        webpage = '<html>mainartBrightcoveVideoId: 4732393888001</html>'
        result = instance._search_regex(r'mainartBrightcoveVideoId["\']?\s*:\s*["\']?(\d+)', webpage, 'brightcove id')
        self.assertEqual(result, '4732393888001')

    def test_url_result(self):
        instance = TheStarIE()
        brightcove_id = '4732393888001'
        result = instance.url_result(instance.BRIGHTCOVE_URL_TEMPLATE % brightcove_id, 'BrightcoveNew', brightcove_id)
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
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()