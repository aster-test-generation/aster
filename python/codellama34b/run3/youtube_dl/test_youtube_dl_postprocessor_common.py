import unittest
from youtube_dl.postprocessor.common import *


class TestPostProcessor(unittest.TestCase):
    def test_set_downloader(self):
        instance = PostProcessor()
        instance.set_downloader(None)
        self.assertEqual(instance._downloader, None)

    def test_run(self):
        instance = PostProcessor()
        result = instance.run(None)
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_try_utime(self):
        instance = PostProcessor()
        instance.try_utime(None, None, None)
        self.assertEqual(instance._downloader.report_warning, None)

    def test_configuration_args(self):
        instance = PostProcessor()
        result = instance._configuration_args()
        self.assertEqual(result, None)

class TestAudioConversionError(unittest.TestCase):
    def test_audio_conversion_error(self):
        instance = AudioConversionError("Error")
        self.assertEqual(instance, None)

if __name__ == '__main__':
    unittest.main()