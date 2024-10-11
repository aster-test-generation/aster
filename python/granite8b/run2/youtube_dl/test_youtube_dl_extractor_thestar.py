import unittest
from youtube_dl.extractor.thestar import TheStarIE


class TestTheStarIE(unittest.TestCase):
    def test_valid_url(self):
        ie = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        self.assertTrue(re.match(ie._VALID_URL, url))

    def test_brightcove_url_template(self):
        ie = TheStarIE()
        brightcove_id = '4732393888001'
        expected_url = 'http://players.brightcove.net/794267642001/default_default/index.html?videoId=4732393888001'
        self.assertEqual(ie.BRIGHTCOVE_URL_TEMPLATE % brightcove_id, expected_url)

    def test_real_extract(self):
        ie = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        expected_info_dict = {
            'id': '4732393888001',
            'ext': 'mp4',
            'title': 'Mankind: Why this woman started a men\'s skin care line',
            'description': 'Robert Cribb talks to Young Lee, the founder of Uncle Peter\'s MAN.',
            'uploader_id': '794267642001',
            'timestamp': 1454353482,
            'upload_date': '20160201',
        }
        self.assertEqual(ie._real_extract(url), expected_info_dict)

if __name__ == '__main__':
    unittest.main()