import unittest
from youtube_dl.postprocessor.common import PostProcessor, AudioConversionError


class TestPostProcessor(unittest.TestCase):
    def test_init(self):
        pp = PostProcessor()
        self.assertIsNone(pp._downloader)

    def test_init_with_downloader(self):
        pp = PostProcessor(downloader='downloader')
        self.assertEqual(pp._downloader, 'downloader')

    def test_set_downloader(self):
        pp = PostProcessor()
        pp.set_downloader('downloader')
        self.assertEqual(pp._downloader, 'downloader')

    def test_run(self):
        pp = PostProcessor()
        result = pp.run({'info': 'dict'})
        self.assertEqual(result, ([], {'info': 'dict'}))

    def test_try_utime(self):
        pp = PostProcessor()
        pp.try_utime('/path/to/file', 123, 456)
        # test that no exception is raised

    def test_try_utime_error(self):
        pp = PostProcessor()
        with unittest.mock.patch('os.utime') as mock_utime:
            mock_utime.side_effect = Exception('utime error')
            pp.try_utime('/path/to/file', 123, 456)
            pp._downloader.report_warning.assert_called_with('Cannot update utime of file')

    def test_configuration_args(self):
        pp = PostProcessor()
        result = pp._configuration_args(default=['arg1', 'arg2'])
        self.assertEqual(result, ['arg1', 'arg2'])

    def test_private_method(self):
        pp = PostProcessor()
        result = pp._PostProcessor__configuration_args(default=['arg1', 'arg2'])
        self.assertEqual(result, ['arg1', 'arg2'])

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
        ace = AudioConversionError('error message')
        self.assertEqual(str(ace), 'error message')

    def test_str_method(self):
        ace = AudioConversionError('error message')
        result = str(ace)
        self.assertEqual(result, 'error message')

    def test_repr_method(self):
        ace = AudioConversionError('error message')
        result = repr(ace)
        self.assertEqual(result, "AudioConversionError('error message')")

if __name__ == '__main__':
    unittest.main()