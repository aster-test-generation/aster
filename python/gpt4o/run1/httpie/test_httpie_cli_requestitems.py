import unittest
from httpie.cli.requestitems import *
from httpie.cli.argtypes import KeyValueArg
from httpie.cli.exceptions import ParseError
from unittest.mock import patch, mock_open


class TestRequestItems(unittest.TestCase):
    def test_init(self):
        instance = RequestItems(as_form=True)
        self.assertIsInstance(instance.headers, RequestHeadersDict)
        self.assertIsInstance(instance.data, RequestDataDict)
        self.assertIsInstance(instance.files, RequestFilesDict)
        self.assertIsInstance(instance.params, RequestQueryParamsDict)
        self.assertIsInstance(instance.multipart_data, MultipartRequestDataDict)

    def test_from_args(self):
        args = [KeyValueArg('Header', 'value', SEPARATOR_HEADER)]
        instance = RequestItems.from_args(args)
        self.assertEqual(instance.headers['Header'], 'value')

    def test_process_header_arg(self):
        arg = KeyValueArg('Header', 'value', SEPARATOR_HEADER)
        result = process_header_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_empty_header_arg(self):
        arg = KeyValueArg('Header', '', SEPARATOR_HEADER_EMPTY)
        result = process_empty_header_arg(arg)
        self.assertEqual(result, '')

    def test_process_empty_header_arg_with_value(self):
        arg = KeyValueArg('Header', 'value', SEPARATOR_HEADER_EMPTY)
        with self.assertRaises(ParseError):
            process_empty_header_arg(arg)

    def test_process_query_param_arg(self):
        arg = KeyValueArg('param', 'value', SEPARATOR_QUERY_PARAM)
        result = process_query_param_arg(arg)
        self.assertEqual(result, 'value')

    @patch('builtins.open', new_callable=mock_open, read_data='file content')
    def test_process_file_upload_arg(self, mock_file):
        arg = KeyValueArg('file', 'test.txt', SEPARATOR_FILE_UPLOAD)
        result = process_file_upload_arg(arg)
        self.assertEqual(result[0], 'test.txt')
        self.assertEqual(result[2], 'text/plain')

    @patch('builtins.open', new_callable=mock_open, read_data='file content')
    def test_process_data_embed_file_contents_arg(self, mock_file):
        arg = KeyValueArg('data', 'test.txt', SEPARATOR_DATA_EMBED_FILE_CONTENTS)
        result = process_data_embed_file_contents_arg(arg)
        self.assertEqual(result, 'file content')

    @patch('httpie.cli.requestitems.load_json_preserve_order', return_value={'key': 'value'})
    def test_process_data_embed_raw_json_file_arg(self, mock_load_json):
        arg = KeyValueArg('data', 'test.json', SEPARATOR_DATA_EMBED_RAW_JSON_FILE)
        with patch('builtins.open', mock_open(read_data='{"key": "value"}')):
            result = process_data_embed_raw_json_file_arg(arg)
            self.assertEqual(result, {'key': 'value'})

    @patch('httpie.cli.requestitems.load_json_preserve_order', return_value={'key': 'value'})
    def test_process_data_raw_json_embed_arg(self, mock_load_json):
        arg = KeyValueArg('data', '{"key": "value"}', SEPARATOR_DATA_RAW_JSON)
        result = process_data_raw_json_embed_arg(arg)
        self.assertEqual(result, {'key': 'value'})

    @patch('builtins.open', new_callable=mock_open, read_data='file content')
    def test_load_text_file(self, mock_file):
        arg = KeyValueArg('data', 'test.txt', SEPARATOR_DATA_EMBED_FILE_CONTENTS)
        result = load_text_file(arg)
        self.assertEqual(result, 'file content')

    @patch('builtins.open', new_callable=mock_open, read_data='file content')
    def test_load_text_file_io_error(self, mock_file):
        mock_file.side_effect = IOError('File not found')
        arg = KeyValueArg('data', 'test.txt', SEPARATOR_DATA_EMBED_FILE_CONTENTS)
        with self.assertRaises(ParseError):
            load_text_file(arg)

    @patch('builtins.open', new_callable=mock_open, read_data=b'\x80\x81')
    def test_load_text_file_unicode_error(self, mock_file):
        arg = KeyValueArg('data', 'test.txt', SEPARATOR_DATA_EMBED_FILE_CONTENTS)
        with self.assertRaises(ParseError):
            load_text_file(arg)

    @patch('httpie.cli.requestitems.load_json_preserve_order', side_effect=ValueError('Invalid JSON'))
    def test_load_json_value_error(self, mock_load_json):
        arg = KeyValueArg('data', '{"key": "value"}', SEPARATOR_DATA_RAW_JSON)
        with self.assertRaises(ParseError):
            load_json(arg, '{"key": "value"}')

if __name__ == '__main__':
    unittest.main()