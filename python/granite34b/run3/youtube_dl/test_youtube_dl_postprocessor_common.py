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
        path = '/path/to/file'
        atime = 100
        mtime = 200
        self.assertIsNone(pp.try_utime(path, atime, mtime))
        # No exception should be raised

    def test_configuration_args(self):
        pp = PostProcessor()
        default = ['--arg1', '--arg2']
        result = pp._configuration_args(default)
        self.assertEqual(result, default)

class TestAudioConversionError(unittest.TestCase):
    def test_init(self):
        error = AudioConversionError('error message')
        self.assertEqual(error.msg, 'error message')

if __name__ == '__main__':
    unittest.main()