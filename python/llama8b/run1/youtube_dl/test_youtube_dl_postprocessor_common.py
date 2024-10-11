import unittest
from youtube_dl.postprocessor.common import PostProcessor, AudioConversionError


class TestPostProcessor(unittest.TestCase):
    def test_init(self):
        instance = PostProcessor()
        self.assertIsNone(instance._downloader)

    def test_set_downloader(self):
        instance = PostProcessor()
        downloader = object()
        instance.set_downloader(downloader)
        self.assertEqual(instance._downloader, downloader)

    def test_run(self):
        instance = PostProcessor()
        information = object()
        result = instance.run(information)
        self.assertEqual(result, ([], information))

    def test_try_utime(self):
        instance = PostProcessor()
        path = 'path'
        atime = 1
        mtime = 2
        instance.try_utime(path, atime, mtime)
        self.assertEqual(instance._downloader.report_warning.call_count, 0)

    def test_configuration_args(self):
        instance = PostProcessor()
        default = [1, 2]
        result = instance._configuration_args(default)
        self.assertEqual(result, cli_configuration_args(instance._downloader.params, 'postprocessor_args', default))

    def test_str_method(self):
        instance = PostProcessor()
        result = str(instance)
        self.assertEqual(result, 'youtube_dl.postprocessor.common.PostProcessor')

    def test_repr_method(self):
        instance = PostProcessor()
        result = repr(instance)
        self.assertEqual(result, 'youtube_dl.postprocessor.common.PostProcessor()')

    def test_eq_method(self):
        instance1 = PostProcessor()
        instance2 = PostProcessor()
        self.assertEqual(instance1, instance2)

    def test_non_equal_method(self):
        instance1 = PostProcessor()
        instance2 = object()
        self.assertNotEqual(instance1, instance2)

class TestAudioConversionError(unittest.TestCase):
    def test_init(self):
        instance = AudioConversionError()
        self.assertIsInstance(instance, PostProcessingError)

if __name__ == '__main__':
    unittest.main()