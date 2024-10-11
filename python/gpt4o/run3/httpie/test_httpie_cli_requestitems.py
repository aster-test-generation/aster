import unittest
from unittest.mock import patch, mock_open
from httpie.cli.requestitems import (
    RequestItems, process_header_arg, process_empty_header_arg,
    process_query_param_arg, process_file_upload_arg, process_data_item_arg,
    process_data_embed_file_contents_arg, process_data_embed_raw_json_file_arg,
    process_data_raw_json_embed_arg, load_text_file, load_json
)
from httpie.cli.argtypes import KeyValueArg
from httpie.cli.exceptions import ParseError
from httpie.utils import load_json_preserve_order


class TestRequestItems(unittest.TestCase):
    def test_init(self):
        instance = RequestItems(as_form=True)
        self.assertIsInstance(instance.headers, dict)
        self.assertIsInstance(instance.data, dict)
        self.assertIsInstance(instance.files, dict)
        self.assertIsInstance(instance.params, dict)
        self.assertIsInstance(instance.multipart_data, dict)

    def test_from_args(self):
        args = [KeyValueArg('Header', 'value', ':')]
        instance = RequestItems.from_args(args)
        self.assertIn('Header', instance.headers)

    def test_process_header_arg(self):
        arg = KeyValueArg('Header', 'value', ':')
        result = process_header_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_empty_header_arg(self):
        arg = KeyValueArg('Header', '', ';')
        result = process_empty_header_arg(arg)
        self.assertEqual(result, '')

    def test_process_empty_header_arg_with_value(self):
        arg = KeyValueArg('Header', 'value', ';')
        with self.assertRaises(ParseError):
            process_empty_header_arg(arg)

    def test_process_query_param_arg(self):
        arg = KeyValueArg('param', 'value', '=')
        result = process_query_param_arg(arg)
        self.assertEqual(result, 'value')

    @patch('builtins.open', new_callable=mock_open, read_data='file content')
    def test_process_file_upload_arg(self, mock_file):
        arg = KeyValueArg('file', 'test.txt', '@')
        result = process_file_upload_arg(arg)
        self.assertEqual(result[0], 'test.txt')
        self.assertEqual(result[2], 'text/plain')

    @patch('builtins.open', side_effect=IOError('File not found'))
    def test_process_file_upload_arg_file_not_found(self, mock_file):
        arg = KeyValueArg('file', 'nonexistent.txt', '@')
        with self.assertRaises(ParseError):
            process_file_upload_arg(arg)

    def test_process_data_item_arg(self):
        arg = KeyValueArg('data', 'value', '=')
        result = process_data_item_arg(arg)
        self.assertEqual(result, 'value')

    @patch('builtins.open', new_callable=mock_open, read_data='file content')
    def test_process_data_embed_file_contents_arg(self, mock_file):
        arg = KeyValueArg('data', 'test.txt', '=')
        result = process_data_embed_file_contents_arg(arg)
        self.assertEqual(result, 'file content')

    @patch('builtins.open', new_callable=mock_open, read_data='{"key": "value"}')
    def test_process_data_embed_raw_json_file_arg(self, mock_file):
        arg = KeyValueArg('data', 'test.json', '=')
        result = process_data_embed_raw_json_file_arg(arg)
        self.assertEqual(result, {"key": "value"})

    def test_process_data_raw_json_embed_arg(self):
        arg = KeyValueArg('data', '{"key": "value"}', '=')
        result = process_data_raw_json_embed_arg(arg)
        self.assertEqual(result, {"key": "value"})

    @patch('builtins.open', new_callable=mock_open, read_data='file content')
    def test_load_text_file(self, mock_file):
        arg = KeyValueArg('data', 'test.txt', '=')
        result = load_text_file(arg)
        self.assertEqual(result, 'file content')

    @patch('builtins.open', side_effect=IOError('File not found'))
    def test_load_text_file_file_not_found(self, mock_file):
        arg = KeyValueArg('data', 'nonexistent.txt', '=')
        with self.assertRaises(ParseError):
            load_text_file(arg)

    @patch('httpie.utils.load_json_preserve_order', return_value={"key": "value"})
    def test_load_json(self, mock_load_json):
        arg = KeyValueArg('data', '{"key": "value"}', '=')
        result = load_json(arg, '{"key": "value"}')
        self.assertEqual(result, {"key": "value"})

    @patch('httpie.utils.load_json_preserve_order', side_effect=ValueError('Invalid JSON'))
    def test_load_json_invalid(self, mock_load_json):
        arg = KeyValueArg('data', 'invalid json', '=')
        with self.assertRaises(ParseError):
            load_json(arg, 'invalid json')

if __name__ == '__main__':
    unittest.main()