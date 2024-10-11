import unittest
from youtube_dl.extractor.nrk import NRKPlaylistIE



class TestNRKPlaylistIE(unittest.TestCase):
    def test_init(self):
        instance = NRKPlaylistIE()
        self.assertIsInstance(instance, NRKPlaylistIE)

if __name__ == '__main__':
    unittest.main()