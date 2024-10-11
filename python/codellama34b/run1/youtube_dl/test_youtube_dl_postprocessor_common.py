import unittest
from youtube_dl.postprocessor.common import *


class TestPostProcessor(unittest.TestCase):
    def test_init(self):
        instance = PostProcessor()
        self.assertEqual(instance._downloader, None)

    def test_set_downloader(self):
        instance = PostProcessor()
        instance.set_downloader(1)
        self.assertEqual(instance._downloader, 1)

    def test_run(self):
        instance = PostProcessor()
        result = instance.run(1)
        self.assertEqual(result, ([], 1))

    def test_try_utime(self):
        instance = PostProcessor()
        instance.try_utime(1, 2, 3, 4)

    def test_configuration_args(self):
        instance = PostProcessor()
        result = instance._configuration_args()
        self.assertEqual(result, [])

class TestAudioConversionError(unittest.TestCase):
    def test_init(self):
        instance = AudioConversionError("test")
        self.assertEqual(instance, None)

if __name__ == '__main__':
    unittest.main()