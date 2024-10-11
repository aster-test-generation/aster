import sys
import unittest
from tqdm._tqdm_pandas import tqdm_pandas


class TestTqdmPandas(unittest.TestCase):
    def test_tqdm_pandas(self):
        tclass = type('TClass', (), {})
        tqdm_pandas(tclass)
        self.assertTrue(hasattr(tclass, 'pandas'))

    def test_tclass_pandas(self):
        tclass = type('TClass', (), {})
        tqdm_pandas(tclass)
        tclass.pandas()
        self.assertTrue(hasattr(tclass, 'pandas'))

    def test_tclass_pandas_kwargs(self):
        tclass = type('TClass', (), {})
        tqdm_pandas(tclass, desc='test')
        tclass.pandas(desc='test')
        self.assertTrue(hasattr(tclass, 'pandas'))

    def test_tclass_pandas_kwargs_file(self):
        tclass = type('TClass', (), {})
        file = open('test.txt', 'w')
        tqdm_pandas(tclass, file=file)
        tclass.pandas(file=file)
        self.assertTrue(hasattr(tclass, 'pandas'))

    def test_tclass_pandas_kwargs_file_write(self):
        tclass = type('TClass', (), {})
        file = open('test.txt', 'w')
        tqdm_pandas(tclass, file=file)
        tclass.pandas(file=file)
        self.assertEqual(file.read(), 'test')

    def test_tclass_pandas_kwargs_file_write_str(self):
        tclass = type('TClass', (), {})
        file = open('test.txt', 'w')
        tqdm_pandas(tclass, file=file)
        tclass.pandas(file=file)
        self.assertEqual(file.read(), 'test')

    def test_tclass_pandas_kwargs_file_write_str_format(self):
        tclass = type('TClass', (), {})
        file = open('test.txt', 'w')
        tqdm_pandas(tclass, file=file)
        tclass.pandas(file=file)
        self.assertEqual(file.read(), 'test')

    def test_tclass_pandas_kwargs_file_write_str_format_args(self):
        tclass = type('TClass', (), {})
        file = open('test.txt', 'w')
        tqdm_pandas(tclass, file=file)
        tclass.pandas(file=file)
        self.assertEqual(file.read(), 'test')

    def test_tclass_pandas_kwargs_file_write_str_format_kwargs(self):
        tclass = type('TClass', (), {})
        file = open('test.txt', 'w')
        tqdm_pandas(tclass, file=file)
        tclass.pandas(file=file)
        self.assertEqual(file.read(), 'test')

    def test_tclass_pandas_kwargs_file_write_str_format_args_kwargs(self):
        tclass = type('TClass', (), {})
        file = open('test.txt', 'w')
        tqdm_pandas(tclass, file=file)
        tclass.pandas(file=file)
        self.assertEqual(file.read(), 'test')

    def test_tclass_pandas_kwargs_file_write_str_format_args_kwargs_deprecated_t(self):
        tclass = type('TClass', (), {})
        file = open('test.txt', 'w')
        tqdm_pandas(tclass, file=file)
        tclass.pandas(file=file)
        self.assertEqual(file.read(), 'test')

    def test_tclass_pandas_kwargs_file_write_str_format_args_kwargs_deprecated_t_kwargs(self):
        tclass = type('TClass', (), {})
        file = open('test.txt', 'w')
        tqdm_pandas(tclass, file=file)
        tclass.pandas(file=file)
        self.assertEqual(file.read(), 'test')

    def test_tclass_pandas_kwargs_file_write_str_format_args_kwargs_deprecated_t_kwargs_desc(self):
        tclass = type('TClass', (), {})
        file = open('test.txt', 'w')
        tqdm_pandas(tclass, file=file)
        tclass.pandas(file=file)
        self.assertEqual(file.read(), 'test')

if __name__ == '__main__':
    unittest.main()