import unittest
from youtube_dl.extractor.thestar import TheStarIE


class TestTheStarIE(unittest.TestCase):
    def test_real_extract(self):
        ie = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        video_id = '4732393888001'
        expected_brightcove_url = 'http://players.brightcove.net/794267642001/default_default/index.html?videoId=%s' % video_id
        result = ie._real_extract(url)
        self.assertEqual(result.get('id'), video_id)
        self.assertEqual(result.get('url'), expected_brightcove_url)

if __name__ == '__main__':
    unittest.main()