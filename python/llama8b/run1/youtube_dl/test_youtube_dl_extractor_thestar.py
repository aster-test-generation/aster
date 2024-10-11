import unittest
from youtube_dl.extractor.thestar import TheStarIE


class TestTheStarIE(unittest.TestCase):
    def test_valid_url(self):
        ie = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        self.assertTrue(ie._VALID_URL.match(url))

    def test_invalid_url(self):
        ie = TheStarIE()
        url = 'http://example.com'
        self.assertFalse(ie._VALID_URL.match(url))

    def test_real_extract(self):
        ie = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        webpage = 'some webpage content'
        brightcove_id = '123456'
        ie._download_webpage = lambda url, display_id: webpage
        ie._search_regex = lambda pattern, webpage, name: brightcove_id
        result = ie._real_extract(url)
        self.assertEqual(result['id'], brightcove_id)
        self.assertEqual(result['url'], self.BRIGHTCOVE_URL_TEMPLATE % brightcove_id)

    def test_url_result(self):
        ie = TheStarIE()
        url = 'http://example.com'
        result = ie.url_result(url, 'BrightcoveNew', '123456')
        self.assertEqual(result, self.BRIGHTCOVE_URL_TEMPLATE % '123456')

    def test_str_method(self):
        ie = TheStarIE()
        result = str(ie)
        self.assertEqual(result, 'TheStarIE')

    def test_repr_method(self):
        ie = TheStarIE()
        result = repr(ie)
        self.assertEqual(result, 'TheStarIE()')

    def test_eq_method(self):
        ie1 = TheStarIE()
        ie2 = TheStarIE()
        self.assertTrue(ie1 == ie2)

if __name__ == '__main__':
    unittest.main()