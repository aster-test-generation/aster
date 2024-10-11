import unittest
from unittest.mock import Mock, patch
from youtube_dl.postprocessor.common import PostProcessor, AudioConversionError
from youtube_dl.utils import PostProcessingError


class TestPostProcessor(unittest.TestCase):
    def test_init(self):
        downloader = Mock()
        pp = PostProcessor(downloader)
        self.assertEqual(pp._downloader, downloader)

    def test_set_downloader(self):
        downloader = Mock()
        pp = PostProcessor()
        pp.set_downloader(downloader)
        self.assertEqual(pp._downloader, downloader)

    def test_run(self):
        pp = PostProcessor()
        information = {'key': 'value'}
        result = pp.run(information)
        self.assertEqual(result, ([], information))

    @patch('os.utime')
    @patch('youtube_dl.postprocessor.common.encodeFilename', side_effect=lambda x: x)
    def test_try_utime_success(self, mock_encodeFilename, mock_utime):
        downloader = Mock()
        pp = PostProcessor(downloader)
        pp.try_utime('test_path', 123, 456)
        mock_utime.assert_called_once_with('test_path', (123, 456))

    @patch('os.utime', side_effect=Exception('Test Exception'))
    @patch('youtube_dl.postprocessor.common.encodeFilename', side_effect=lambda x: x)
    def test_try_utime_failure(self, mock_encodeFilename, mock_utime):
        downloader = Mock()
        downloader.report_warning = Mock()
        pp = PostProcessor(downloader)
        pp.try_utime('test_path', 123, 456, 'Cannot update utime of file')
        downloader.report_warning.assert_called_once_with('Cannot update utime of file')

    def test_configuration_args(self):
        downloader = Mock()
        downloader.params = {'postprocessor_args': ['--arg1', '--arg2']}
        pp = PostProcessor(downloader)
        result = pp._configuration_args()
        self.assertEqual(result, ['--arg1', '--arg2'])

    def test_configuration_args_default(self):
        downloader = Mock()
        downloader.params = {}
        pp = PostProcessor(downloader)
        result = pp._configuration_args(default=['--default'])
        self.assertEqual(result, ['--default'])

class TestAudioConversionError(unittest.TestCase):
    def test_audio_conversion_error(self):
        error = AudioConversionError('Test error message')
        self.assertIsInstance(error, PostProcessingError)
        self.assertEqual(str(error), 'Test error message')

if __name__ == '__main__':
    unittest.main()