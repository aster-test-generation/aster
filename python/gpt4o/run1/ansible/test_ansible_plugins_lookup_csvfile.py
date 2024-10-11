import csv
import unittest
from unittest.mock import mock_open, patch, MagicMock
from ansible.plugins.lookup.csvfile import CSVRecoder, CSVReader, LookupModule
from ansible.errors import AnsibleError, AnsibleAssertionError
from ansible.module_utils.six import PY2
from ansible.module_utils._text import to_bytes, to_native, to_text
from ansible.module_utils.common._collections_compat import MutableSequence


class TestCSVRecoder(unittest.TestCase):
    def test_init(self):
        with patch('codecs.getreader') as mock_getreader:
            mock_file = MagicMock()
            recoder = CSVRecoder(mock_file, 'utf-8')
            mock_getreader.assert_called_with('utf-8')
            self.assertEqual(recoder.reader, mock_getreader.return_value(mock_file))

    def test_iter(self):
        mock_file = MagicMock()
        recoder = CSVRecoder(mock_file)
        self.assertEqual(iter(recoder), recoder)

    def test_next(self):
        mock_file = MagicMock()
        recoder = CSVRecoder(mock_file)
        recoder.reader = iter([b'line1\n', b'line2\n'])
        self.assertEqual(next(recoder).decode(), 'line1\n')

class TestCSVReader(unittest.TestCase):
    def test_init(self):
        with patch('codecs.getreader') as mock_getreader:
            mock_file = MagicMock()
            reader = CSVReader(mock_file, encoding='utf-8')
            mock_getreader.assert_called_with('utf-8')
            self.assertEqual(list(reader.reader), list(csv.reader(mock_getreader.return_value(mock_file))))

    def test_next(self):
        mock_file = MagicMock()
        reader = CSVReader(mock_file)
        reader.reader = iter([['col1', 'col2'], ['val1', 'val2']])
        self.assertEqual(next(reader), ['col1', 'col2'])

    def test_iter(self):
        mock_file = MagicMock()
        reader = CSVReader(mock_file)
        self.assertEqual(iter(reader), reader)

class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    @patch('builtins.open', new_callable=mock_open, read_data='key1,val1\nkey2,val2\n')
    def test_read_csv(self, mock_open):
        with patch('ansible.plugins.lookup.csvfile.CSVReader') as mock_csvreader:
            mock_csvreader.return_value = iter([['key1', 'val1'], ['key2', 'val2']])
            result = self.lookup.read_csv('dummy.csv', 'key1', ',')
            self.assertEqual(result, 'val1')

    @patch('builtins.open', new_callable=mock_open, read_data='key1,val1\nkey2,val2\n')
    def test_read_csv_default(self, mock_open):
        with patch('ansible.plugins.lookup.csvfile.CSVReader') as mock_csvreader:
            mock_csvreader.return_value = iter([['key1', 'val1'], ['key2', 'val2']])
            result = self.lookup.read_csv('dummy.csv', 'key3', ',', dflt='default')
            self.assertEqual(result, 'default')

    @patch('builtins.open', new_callable=mock_open, read_data='key1,val1\nkey2,val2\n')
    def test_read_csv_exception(self, mock_open):
        with patch('ansible.plugins.lookup.csvfile.CSVReader') as mock_csvreader:
            mock_csvreader.side_effect = Exception('error')
            with self.assertRaises(AnsibleError):
                self.lookup.read_csv('dummy.csv', 'key1', ',')

    @patch('ansible.plugins.lookup.csvfile.LookupModule.find_file_in_search_path')
    @patch('ansible.plugins.lookup.csvfile.LookupModule.read_csv')
    @patch('ansible.plugins.lookup.csvfile.parse_kv')
    def test_run(self, mock_parse_kv, mock_read_csv, mock_find_file):
        mock_parse_kv.return_value = {'_raw_params': 'key1', 'file': 'dummy.csv', 'delimiter': ',', 'encoding': 'utf-8', 'default': None, 'col': 1}
        mock_find_file.return_value = 'dummy.csv'
        mock_read_csv.return_value = 'val1'
        result = self.lookup.get(['key1 file=dummy.csv delimiter=, encoding=utf-8 default=None col=1'])
        self.assertEqual(result, ['val1'])

    @patch('ansible.plugins.lookup.csvfile.LookupModule.find_file_in_search_path')
    @patch('ansible.plugins.lookup.csvfile.LookupModule.read_csv')
    @patch('ansible.plugins.lookup.csvfile.parse_kv')
    def test_run_invalid_option(self, mock_parse_kv, mock_read_csv, mock_find_file):
        mock_parse_kv.return_value = {'_raw_params': 'key1', 'file': 'dummy.csv', 'invalid_option': 'value'}
        with self.assertRaises(AnsibleAssertionError):
            self.lookup.run(['key1 file=dummy.csv'])

if __name__ == '__main__':
    unittest.main()