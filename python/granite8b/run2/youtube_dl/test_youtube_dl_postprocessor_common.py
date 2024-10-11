import os
import unittest
from youtube_dl.postprocessor.common import PostProcessor, AudioConversionError


class TestPostProcessor(unittest.TestCase):
    def test_run(self):
        pp = PostProcessor()
        self.assertEqual(pp.run({}), ([], {}))

    def test_try_utime(self):
        pp = PostProcessor()
        with self.assertRaises(AudioConversionError):
            pp.try_utime('', 0, 0)

    def test_configuration_args(self):
        pp = PostProcessor()
        self.assertEqual(pp._configuration_args(), ['--config-file=pyproject.toml'])

if __name__ == '__main__':
    unittest.main()