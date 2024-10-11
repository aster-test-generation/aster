import unittest
from ansible.plugins.lookup.csvfile import CSVRecoder, CSVReader, LookupModule
from ansible.errors import AnsibleError, AnsibleAssertionError
from ansible.module_utils.six import PY2
from ansible.module_utils._text import to_bytes, to_native, to_text
from unittest.mock import mock_open, patch


class TestCSVRecoder(unittest.TestCase):
    def test_init(self):
        with patch('codecs.getreader') as mock_getreader:
            mock_getreader.return_value = iter(['line1', 'line2'])
            f = mock_open(read_data='line1\nline2\n')
            instance = CSVRecoder(f, encoding='utf-8')
            self.assertIsNotNone(instance.reader)

    def test_iter(self):
        f = mock_open(read_data='line1\nline2\n')
        instance = CSVRecoder(f, 'utf-8')
        self.assertEqual(iter(instance), instance)

    def test_next(self):
        with patch('codecs.getreader') as mock_getreader:
            mock_getreader.return_value = iter(['line1\n', 'line2\n'])
            f = mock_open(read_data='line1\nline2\n')
            instance = CSVRecoder(f, encoding='utf-8')
            result = instance.__next__()
            self.assertEqual(result, b'line1\n')

class TestCSVReader(unittest.TestCase):
    def test_init(self):
        with patch('codecs.getreader') as mock_getreader:
            mock_getreader.return_value = iter(['line1', 'line2'])
            f = mock_open(read_data='line1\nline2\n')
            instance = CSVReader(f, encoding='utf-8')
            self.assertIsNotNone(instance.reader)

    def test_next(self):
        with patch('codecs.getreader') as mock_getreader:
            mock_getreader.return_value = iter(['line1\n', 'line2\n'])
            f = mock_open(read_data='line1\nline2\n')
            instance = CSVReader(f, encoding=b'utf-8')
            with patch('csv.reader') as mock_csv_reader:
                mock_csv_reader.return_value = iter([['col1', 'col2']])
                result = instance.__next__()
                self.assertEqual(result, ['col1', 'col2'])

    def test_iter(self):
        f = mock_open(read_data='line1\nline2\n')
        instance = CSVReader(f, encoding='utf-8')
        self.assertEqual(iter(instance), instance)

class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_read_csv(self):
        with patch('builtins.open', mock_open(read_data='key1,value1\nkey2,value2\n')) as mock_file:
            result = self.lookup.read_csv(b'dummy.csv', 'key1', ',', 'utf-8')
            self.assertEqual(result, 'value1')

    def test_read_csv_exception(self):
        with patch('builtins.open', side_effect=Exception('File not found')):
            with self.assertRaises(AnsibleError):
                self.lookup.read_csv('dummy.csv', 'key1', ',', 'utf-8')

    def test_run(self):
        terms = ['key1']
        variables = {'file': 'dummy.csv', 'delimiter': ',', 'encoding': 'utf-8', 'default': None, 'col': 1}
        with patch.object(self.lookup, 'find_file_in_search_path', return_value='dummy.csv'):
            with patch('builtins.open', mock_open(read_data='key1,value1\nkey2,value2\n')):
                result = self.lookup.get_name(terms, variables)
                self.assertEqual(result, ['value1'])

    def test_run_no_raw_params(self):
        terms = ['key1']
        variables = {'file': 'dummy.csv', 'delimiter': ',', 'encoding': 'utf-8', 'default': None, 'col': 1}
        with self.assertRaises(AnsibleError):
            self.lookup.run([], {}, variables)

    def test_run_invalid_option(self):
        terms = ['key1']
        variables = {'file': 'dummy.csv', 'delimiter': ',', 'encoding': 'utf-8', 'default': None, 'col': 1}
        with patch.object(self.lookup, 'find_file_in_search_path', return_value='dummy.csv'):
            with patch('builtins.open', mock_open(read_data='key1,value1\nkey2,value2\n')):
                with self.assertRaises(AnsibleAssertionError):
                    self.lookup.run(terms, variables)

if __name__ == '__main__':
    unittest.main()