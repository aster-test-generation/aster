import unittest
from youtube_dl.postprocessor.common import PostProcessor, AudioConversionError


class TestPostProcessor(unittest.TestCase):
    def test_set_downloader(self):
        pp = PostProcessor()
        pp.set_downloader(None)
        self.assertIsNone(pp._downloader)

    def test_run(self):
        pp = PostProcessor()
        ret, info = pp.run({})
        self.assertEqual(ret, [])
        self.assertEqual(info, {})

    def test_try_utime(self):
        pp = PostProcessor()
        with self.assertRaises(AudioConversionError):
            pp.try_utime('test', 0, 0)

    def test_configuration_args(self):
        pp = PostProcessor()
        args = pp._configuration_args()
        self.assertEqual(args, [])

if __name__ == '__main__':
    unittest.main()