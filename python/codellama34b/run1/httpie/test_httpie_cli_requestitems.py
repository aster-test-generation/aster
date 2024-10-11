import unittest
from httpie.cli.requestitems import *

class TestRequestItems(unittest.TestCase):
    def test_from_args(self):
        instance = RequestItems.from_args([])
        self.assertEqual(instance.headers, {})
        self.assertEqual(instance.data, {})
        self.assertEqual(instance.files, {})
        self.assertEqual(instance.params, {})
        self.assertEqual(instance.multipart_data, {})

    def test_process_header_arg(self):
        arg = KeyValueArg(key='key', value='value', sep='sep')
        result = process_header_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_empty_header_arg(self):
        arg = KeyValueArg(key='key', value='value', sep='sep')
        result = process_empty_header_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_query_param_arg(self):
        arg = KeyValueArg(key='key', value='value', sep='sep')
        result = process_query_param_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_file_upload_arg(self):
        arg = KeyValueArg(key='key', value='value', sep='sep')
        result = process_file_upload_arg(arg)
        self.assertEqual(result, ('value', None, None))

    def test_process_data_item_arg(self):
        arg = KeyValueArg(key='key', value='value', sep='sep')
        result = process_data_item_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_data_embed_file_contents_arg(self):
        arg = KeyValueArg(key='key', value='value', sep='sep')
        result = process_data_embed_file_contents_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_data_embed_raw_json_file_arg(self):
        arg = KeyValueArg(key='key', value='value', sep='sep')
        result = process_data_embed_raw_json_file_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_data_raw_json_embed_arg(self):
        arg = KeyValueArg(key='key', value='value', sep='sep')
        result = process_data_raw_json_embed_arg(arg)
        self.assertEqual(result, 'value')

    def test_load_text_file(self):
        path = 'path'
        result = load_text_file(path)
        self.assertEqual(result, 'path')

    def test_load_json(self):
        arg = KeyValueArg(key='key', value='value', sep='sep')
        contents = 'contents'
        result = load_json(arg, contents)
        self.assertEqual(result, 'value')

if __name__ == '__main__':
    unittest.main()