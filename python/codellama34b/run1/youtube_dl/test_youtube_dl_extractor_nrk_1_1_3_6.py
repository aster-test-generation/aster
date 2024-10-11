import unittest
from youtube_dl.extractor.nrk import NRKIE


class TestNRKRadioPodkastIE(unittest.TestCase):
    def test_real_extract(self):
        instance = NRKRadioPodkastIE()
        result = instance._real_extract('https://www.nrk.no/programmer/p3/podkast/')
        self.assertEqual(result, 'nrk:')

    def test_match_id(self):
        instance = NRKRadioPodkastIE()
        result = instance._match_id('https://www.nrk.no/programmer/p3/podkast/')
        self.assertEqual(result, 'p3/podkast/')

if __name__ == '__main__':
    unittest.main()