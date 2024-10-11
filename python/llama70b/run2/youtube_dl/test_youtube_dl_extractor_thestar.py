from youtube_dl.extractor.thestar import InfoExtractor
import unittest
from youtube_dl.extractor.thestar import TheStarIE


class TestTheStarIE(unittest.TestCase):
    def test_init(self):
        instance = TheStarIE()
        self.assertIsInstance(instance, InfoExtractor)

    def test_valid_url(self):
        instance = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        self.assertTrue(instance.suitable(url))

    def test_test(self):
        instance = TheStarIE()
        self.assertEqual(instance._TEST, {
            'url': 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html',
            'md5': '2c62dd4db2027e35579fefb97a8b6554',
            'info_dict': {
                'id': '4732393888001',
                'ext': 'mp4',
                'title': 'Mankind: Why this woman started a men\'s skin care line',
                'description': 'Robert Cribb talks to Young Lee, the founder of Uncle Peter\'s MAN.',
                'uploader_id': '794267642001',
                'timestamp': 1454353482,
                'upload_date': '20160201',
            },
            'params': {
                'skip_download': True,
            }
        })

    def test_brightcove_url_template(self):
        instance = TheStarIE()
        self.assertEqual(instance.BRIGHTCOVE_URL_TEMPLATE, 'http://players.brightcove.net/794267642001/default_default/index.html?videoId=%s')

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
        webpage = '<html>mainartBrightcoveVideoId: 12345</html>'
        result = instance._search_regex(r'mainartBrightcoveVideoId["\']?\s*:\s*["\']?(\d+)', webpage, 'brightcove id')
        self.assertEqual(result, '12345')

    def test_url_result(self):
        instance = TheStarIE()
        url = 'http://players.brightcove.net/794267642001/default_default/index.html?videoId=12345'
        result = instance.url_result(url, 'BrightcoveNew', '12345')
        self.assertIsInstance(result, dict)

    def test_str(self):
        instance = TheStarIE()
        result = instance.__str__()
        self.assertEqual(result, 'TheStarIE')

    def test_repr(self):
        instance = TheStarIE()
        result = instance.__repr__()
        self.assertEqual(result, 'TheStarIE()')

if __name__ == '__main__':
    unittest.main()