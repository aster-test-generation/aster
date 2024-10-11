import unittest
from httpie.cli.requestitems import (
    RequestItems, process_header_arg, process_empty_header_arg,
    process_query_param_arg, process_file_upload_arg, process_data_item_arg,
    process_data_embed_file_contents_arg, process_data_embed_raw_json_file_arg,
    process_data_raw_json_embed_arg, load_text_file, load_json
)


class TestRequestItems(unittest.TestCase):
    def test_init(self):
        instance = RequestItems()
        self.assertIsInstance(instance.headers, RequestHeadersDict)
        self.assertIsInstance(instance.data, RequestJSONDataDict)
        self.assertIsInstance(instance.files, RequestFilesDict)
        self.assertIsInstance(instance.params, RequestQueryParamsDict)
        self.assertIsInstance(instance.multipart_data, MultipartRequestDataDict)

    def test_from_args(self):
        args = [KeyValueArg('header', 'key', 'value', SEPARATOR_HEADER)]
        instance = RequestItems.from_args(args)
        self.assertEqual(instance.headers, {'key': 'value'})

    def test_private_method__init__(self):
        instance = RequestItems()
        result = instance._RequestItems__init__()
        self.assertIsNone(result)

    def test_str_method(self):
        instance = RequestItems()
        result = instance.__str__()
        self.assertEqual(result, 'RequestItems()')

    def test_repr_method(self):
        instance = RequestItems()
        result = instance.__repr__()
        self.assertEqual(result, 'RequestItems()')

class TestFunctions(unittest.TestCase):
    def test_process_header_arg(self):
        arg = KeyValueArg('header', 'key', 'value', SEPARATOR_HEADER)
        result = process_header_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_empty_header_arg(self):
        arg = KeyValueArg('header', 'key', '', SEPARATOR_HEADER_EMPTY)
        result = process_empty_header_arg(arg)
        self.assertEqual(result, '')

    def test_process_query_param_arg(self):
        arg = KeyValueArg('query', 'key', 'value', SEPARATOR_QUERY_PARAM)
        result = process_query_param_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_file_upload_arg(self):
        arg = KeyValueArg('file', 'key', 'path/to/file.txt', SEPARATOR_FILE_UPLOAD)
        result = process_file_upload_arg(arg)
        self.assertIsInstance(result, tuple)
        self.assertEqual(len(result), 3)

    def test_process_data_item_arg(self):
        arg = KeyValueArg('data', 'key', 'value', SEPARATOR_DATA_STRING)
        result = process_data_item_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_data_embed_file_contents_arg(self):
        arg = KeyValueArg('data', 'key', 'path/to/file.txt', SEPARATOR_DATA_EMBED_FILE_CONTENTS)
        result = process_data_embed_file_contents_arg(arg)
        self.assertIsInstance(result, str)

    def test_process_data_embed_raw_json_file_arg(self):
        arg = KeyValueArg('data', 'key', 'path/to/file.json', SEPARATOR_DATA_EMBED_RAW_JSON_FILE)
        result = process_data_embed_raw_json_file_arg(arg)
        self.assertIsInstance(result, dict)

    def test_process_data_raw_json_embed_arg(self):
        arg = KeyValueArg('data', 'key', '{"key": "value"}', SEPARATOR_DATA_RAW_JSON)
        result = process_data_raw_json_embed_arg(arg)
        self.assertIsInstance(result, dict)

    def test_load_text_file(self):
        arg = KeyValueArg('data', 'key', 'path/to/file.txt', SEPARATOR_DATA_EMBED_FILE_CONTENTS)
        result = load_text_file(arg)
        self.assertIsInstance(result, str)

    def test_load_json(self):
        arg = KeyValueArg('data', 'key', '{"key": "value"}', SEPARATOR_DATA_RAW_JSON)
        result = load_json(arg, '{"key": "value"}')
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()