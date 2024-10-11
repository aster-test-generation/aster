import unittest
from youtube_dl.postprocessor.common import PostProcessor, AudioConversionError


class TestPostProcessor(unittest.TestCase):
    def test_init(self):
        pp = PostProcessor()
        self.assertIsNone(pp._downloader)

    def test_init_with_downloader(self):
        pp = PostProcessor(downloader='dummy_downloader')
        self.assertEqual(pp._downloader, 'dummy_downloader')

    def test_set_downloader(self):
        pp = PostProcessor()
        pp.set_downloader('new_downloader')
        self.assertEqual(pp._downloader, 'new_downloader')

    def test_run(self):
        pp = PostProcessor()
        result = pp.run({'dummy': 'information'})
        self.assertEqual(result, ([], {'dummy': 'information'}))

    def test_try_utime(self):
        pp = PostProcessor()
        pp.try_utime('/dummy/path', 123, 456)
        # no exception raised, so test passes

    def test_try_utime_exception(self):
        pp = PostProcessor()
        with self.assertRaises(OSError):
            pp.try_utime('/non/existent/path', 123, 456)

    def test_configuration_args(self):
        pp = PostProcessor()
        result = pp._configuration_args(default=['dummy_arg'])
        self.assertEqual(result, ['dummy_arg'])

    def test_private_method(self):
        pp = PostProcessor()
        result = pp._PostProcessor__configuration_args(default=['dummy_arg'])
        self.assertEqual(result, ['dummy_arg'])

    def test_str_method(self):
        pp = PostProcessor()
        result = str(pp)
        self.assertEqual(result, 'PostProcessor')

    def test_repr_method(self):
        pp = PostProcessor()
        result = repr(pp)
        self.assertEqual(result, 'PostProcessor(downloader=None)')

class TestAudioConversionError(unittest.TestCase):
    def test_init(self):
        ace = AudioConversionError('dummy_message')
        self.assertEqual(ace.msg, 'dummy_message')

    def test_str_method(self):
        ace = AudioConversionError('dummy_message')
        result = str(ace)
        self.assertEqual(result, 'AudioConversionError: dummy_message')

    def test_repr_method(self):
        ace = AudioConversionError('dummy_message')
        result = repr(ace)
        self.assertEqual(result, "AudioConversionError('dummy_message')")

if __name__ == '__main__':
    unittest.main()