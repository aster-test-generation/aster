import unittest
from youtube_dl.extractor.thestar import TheStarIE


class TestTheStarIE(unittest.TestCase):
    def test_valid_url(self):
        ie = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        self.assertTrue(ie._valid_url(url))

    def test_real_extract(self):
        ie = TheStarIE()
        url = 'http://www.thestar.com/life/2016/02/01/mankind-why-this-woman-started-a-men-s-skincare-line.html'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], '4732393888001')
        self.assertEqual(info_dict['ext'], 'mp4')
        self.assertEqual(info_dict['title'], 'Mankind: Why this woman started a men\'s skin care line')
        self.assertEqual(info_dict['description'], 'Robert Cribb talks to Young Lee, the founder of Uncle Peter\'s MAN.')
        self.assertEqual(info_dict['uploader_id'], '794267642001')
        self.assertEqual(info_dict['timestamp'], 1454353482)
        self.assertEqual(info_dict['upload_date'], '20160201')

if __name__ == '__main__':
    unittest.main()