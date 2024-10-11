import unittest
from youtube_dl.postprocessor.common import PostProcessor, AudioConversionError


class TestPostProcessor(unittest.TestCase):
    def test_init(self):
        post_processor = PostProcessor()
        self.assertIsNone(post_processor._downloader)

    def test_set_downloader(self):
        post_processor = PostProcessor()
        downloader = object()
        post_processor.set_downloader(downloader)
        self.assertEqual(post_processor._downloader, downloader)

    def test_run(self):
        post_processor = PostProcessor()
        information = object()
        result = post_processor.run(information)
        self.assertEqual(result, ([], information))

    def test_try_utime(self):
        post_processor = PostProcessor()
        path = 'path'
        atime = 1
        mtime = 2
        post_processor.try_utime(path, atime, mtime)
        self.assertEqual(post_processor._downloader.report_warning.call_count, 0)

    def test_configuration_args(self):
        post_processor = PostProcessor()
        default = [1, 2]
        result = post_processor._configuration_args(default)
        self.assertEqual(result, cli_configuration_args(post_processor._downloader.params, 'postprocessor_args', default))

    def test_str(self):
        post_processor = PostProcessor()
        result = str(post_processor)
        self.assertEqual(result, 'PostProcessor')

    def test_repr(self):
        post_processor = PostProcessor()
        result = repr(post_processor)
        self.assertEqual(result, 'PostProcessor()')

    def test_eq(self):
        post_processor1 = PostProcessor()
        post_processor2 = PostProcessor()
        self.assertEqual(post_processor1, post_processor2)

    def test_ne(self):
        post_processor1 = PostProcessor()
        post_processor2 = object()
        self.assertNotEqual(post_processor1, post_processor2)

class TestAudioConversionError(unittest.TestCase):
    def test_init(self):
        error = AudioConversionError()
        self.assertIsInstance(error, PostProcessingError)

if __name__ == '__main__':
    unittest.main()