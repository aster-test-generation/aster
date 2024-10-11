import unittest
from youtube_dl.postprocessor.common import *


class TestPostProcessor(unittest.TestCase):
    def test_init(self):
        downloader = None
        instance = PostProcessor(downloader)
        self.assertEqual(instance._downloader, downloader)

    def test_set_downloader(self):
        downloader = None
        instance = PostProcessor()
        instance.set_downloader(downloader)
        self.assertEqual(instance._downloader, downloader)

    def test_run(self):
        information = None
        instance = PostProcessor()
        result = instance.run(information)
        self.assertEqual(result, ([], information))

    def test_try_utime(self):
        path = None
        atime = None
        mtime = None
        errnote = None
        instance = PostProcessor()
        instance.try_utime(path, atime, mtime)

    def test_configuration_args(self):
        default = None
        instance = PostProcessor()
        result = instance._configuration_args(default)
        self.assertEqual(result, cli_configuration_args(instance._downloader.params, 'postprocessor_args', default))

class TestAudioConversionError(unittest.TestCase):
    def test_init(self):
        instance = AudioConversionError("test")
        self.assertEqual(instance.__str__(), "Audio conversion failed")

if __name__ == '__main__':
    unittest.main()