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
        pp._downloader = {'report_warning': lambda x: None}
        pp.try_utime('/path/to/file', 1, 2)

    def test_configuration_args(self):
        pp = PostProcessor()
        pp._downloader = {'params': {'postprocessor_args': ['arg1', 'arg2']}}
        result = pp._configuration_args()
        self.assertEqual(result, ['arg1', 'arg2'])

    def test_private_method__init__(self):
        pp = PostProcessor.__init__(PostProcessor(), downloader='downloader')
        self.assertEqual(pp._downloader, 'downloader')

    def test_str_method(self):
        pp = PostProcessor()
        result = pp.__str__()
        self.assertEqual(result, 'PostProcessor')

    def test_repr_method(self):
        pp = PostProcessor()
        result = pp.__repr__()
        self.assertEqual(result, 'PostProcessor(downloader=None)')

    def test_eq_method(self):
        pp1 = PostProcessor()
        pp2 = PostProcessor()
        self.assertTrue(pp1 == pp2)

class TestAudioConversionError(unittest.TestCase):
    def test_init(self):
        ace = AudioConversionError('error message')
        self.assertEqual(str(ace), 'error message')

    def test_str_method(self):
        ace = AudioConversionError('error message')
        result = ace.__str__()
        self.assertEqual(result, 'error message')

    def test_repr_method(self):
        ace = AudioConversionError('error message')
        result = ace.__repr__()
        self.assertEqual(result, "AudioConversionError('error message')")

if __name__ == '__main__':
    unittest.main()