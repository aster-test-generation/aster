import unittest
from youtube_dl.postprocessor.common import PostProcessor, AudioConversionError


class TestPostProcessor(unittest.TestCase):
    def test_init(self):
        pp = PostProcessor()
        self.assertIsNone(pp._downloader)
        pp = PostProcessor(1)
        self.assertEqual(pp._downloader, 1)

    def test_set_downloader(self):
        pp = PostProcessor()
        pp.set_downloader(1)
        self.assertEqual(pp._downloader, 1)

    def test_run(self):
        pp = PostProcessor()
        information = {}
        result = pp.run(information)
        self.assertEqual(result, ([], information))

    def test_try_utime(self):
        pp = PostProcessor()
        path = 'path'
        atime = 1
        mtime = 2
        errnote = 'errnote'
        self.assertIsNone(pp.try_utime(path, atime, mtime, errnote))

    def test_configuration_args(self):
        pp = PostProcessor()
        default = []
        result = pp._configuration_args(default)
        self.assertEqual(result, [])

class TestAudioConversionError(unittest.TestCase):
    def test_init(self):
        err = AudioConversionError("msg")
        self.assertIsInstance(err, PostProcessingError)

if __name__ == '__main__':
    unittest.main()