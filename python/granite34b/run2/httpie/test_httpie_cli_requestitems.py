import unittest
from httpie.cli.requestitems import RequestItems
from httpie.cli.argtypes import KeyValueArg
from httpie.cli.constants import (
    SEPARATOR_HEADER, SEPARATOR_HEADER_EMPTY,
    SEPARATOR_QUERY_PARAM,
    SEPARATOR_FILE_UPLOAD,
    SEPARATOR_DATA_STRING, SEPARATOR_DATA_EMBED_FILE_CONTENTS,
    SEPARATOR_DATA_EMBED_RAW_JSON_FILE,
    SEPARATOR_DATA_RAW_JSON,
)
from httpie.cli.dicts import (
    RequestHeadersDict, RequestDataDict, RequestFilesDict,
    RequestQueryParamsDict, MultipartRequestDataDict,
)
from httpie.utils import (get_content_type, load_json_preserve_order)

class TestRequestItems(unittest.TestCase):

    def test_init(self):
        request_items = RequestItems()
        self.assertIsInstance(request_items.headers, RequestHeadersDict)
        self.assertIsInstance(request_items.data, RequestDataDict)
        self.assertIsInstance(request_items.files, RequestFilesDict)
        self.assertIsInstance(request_items.params, RequestQueryParamsDict)
        self.assertIsInstance(request_items.multipart_data, MultipartRequestDataDict)

    def test_from_args_header(self):
        request_item_args = [
            KeyValueArg(SEPARATOR_HEADER, 'Content-Type', 'application/json'),
            KeyValueArg(SEPARATOR_HEADER, 'Authorization', 'Bearer token'),
        ]
        request_items = RequestItems.from_args(request_item_args)
        self.assertEqual(request_items.headers['Content-Type'], 'application/json')
        self.assertEqual(request_items.headers['Authorization'], 'Bearer token')

    def test_from_args_header_empty(self):
        request_item_args = [
            KeyValueArg(SEPARATOR_HEADER_EMPTY, 'Content-Type', ''),
        ]
        request_items = RequestItems.from_args(request_item_args)
        self.assertEqual(request_items.headers['Content-Type'], '')

    def test_from_args_query_param(self):
        request_item_args = [
            KeyValueArg(SEPARATOR_QUERY_PARAM, 'page', '1'),
            KeyValueArg(SEPARATOR_QUERY_PARAM, 'per_page', '10'),
        ]
        request_items = RequestItems.from_args(request_item_args)
        self.assertEqual(request_items.params['page'], '1')
        self.assertEqual(request_items.params['per_page'], '10')

    def test_from_args_file_upload(self):
        request_item_args = [
            KeyValueArg(SEPARATOR_FILE_UPLOAD, 'file', 'path/to/file.txt'),
        ]
        request_items = RequestItems.from_args(request_item_args)
        self.assertEqual(request_items.files['file'], ('file.txt', open('path/to/file.txt', 'rb'), 'text/plain'))

    def test_from_args_data_string(self):
        request_item_args = [
            KeyValueArg(SEPARATOR_DATA_STRING, 'name', 'John'),
            KeyValueArg(SEPARATOR_DATA_STRING, 'age', '30'),
        ]
        request_items = RequestItems.from_args(request_item_args)
        self.assertEqual(request_items.data['name'], 'John')
        self.assertEqual(request_items.data['age'], '30')

    def test_from_args_data_embed_file_contents(self):
        request_item_args = [
            KeyValueArg(SEPARATOR_DATA_EMBED_FILE_CONTENTS, 'file', 'path/to/file.txt'),
        ]
        request_items = RequestItems.from_args(request_item_args)
        self.assertEqual(request_items.data['file'], 'file content')

    def test_from_args_data_raw_json(self):
        request_item_args = [
            KeyValueArg(SEPARATOR_DATA_RAW_JSON, 'data', '{"name": "John", "age": 30}'),
        ]
        request_items = RequestItems.from_args(request_item_args)
        self.assertEqual(request_items.data['data'], {'name': 'John', 'age': 30})

if __name__ == '__main__':
    unittest.main()