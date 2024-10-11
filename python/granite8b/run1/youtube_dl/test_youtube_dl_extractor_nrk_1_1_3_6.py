import unittest
from youtube_dl.extractor.nrk import NRKRadioPodkastIE


class TestNRKRadioPodkastIE(unittest.TestCase):
    def test_real_extract(self):
        ie = NRKRadioPodkastIE()
        url = 'https://www.nrk.no/radio/Podkast-om-Tyskland-og-Norge/id2806155'
        info_dict = ie._real_extract(url)
        self.assertEqual(info_dict['id'], '2806155')
        self.assertEqual(info_dict['ext'], 'mp3')
        self.assertEqual(info_dict['title'], 'Podkast om Tyskland og Norge')
        self.assertEqual(info_dict['description'], 'md5:9517611330e9604f70785d971590363')
        self.assertEqual(info_dict['timestamp'], 1590543600)
        self.assertEqual(info_dict['upload_date'], '20200525')
        self.assertEqual(info_dict['duration'], 254)

if __name__ == '__main__':
    unittest.main()