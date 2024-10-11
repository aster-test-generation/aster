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

    @patch('youtube_dl.postprocessor.common.os.utime')
    @patch('youtube_dl.postprocessor.common.encodeFilename', side_effect=lambda x: x)
    def test_try_utime_success(self, mock_encodeFilename, mock_utime):
        downloader = Mock()
        pp = PostProcessor(downloader)
        pp.try_utime('test_path', 1234567890, 1234567890)
        mock_utime.assert_called_once_with('test_path', (1234567890, 1234567890))

    @patch('youtube_dl.postprocessor.common.os.utime', side_effect=Exception)
    @patch('youtube_dl.postprocessor.common.encodeFilename', side_effect=lambda x: x)
    def test_try_utime_failure(self, mock_encodeFilename, mock_utime):
        downloader = Mock()
        downloader.report_warning = Mock()
        pp = PostProcessor(downloader)
        pp.try_utime('test_path', 1234567890, 1234567890)
        downloader.report_warning.assert_called_once_with('Cannot update utime of file')

    @patch('youtube_dl.postprocessor.common.cli_configuration_args', return_value=['--arg1', '--arg2'])
    def test_configuration_args(self, mock_cli_configuration_args):
        downloader = Mock()
        downloader.params = {'postprocessor_args': ['--arg1', '--arg2']}
        pp = PostProcessor(downloader)
        result = pp._configuration_args()
        self.assertEqual(result, ['--arg1', '--arg2'])

class TestAudioConversionError(unittest.TestCase):
    def test_audio_conversion_error_is_instance_of_post_processing_error(self):
        error = AudioConversionError('test error')
        self.assertIsInstance(error, PostProcessingError)

if __name__ == '__main__':
    unittest.main()