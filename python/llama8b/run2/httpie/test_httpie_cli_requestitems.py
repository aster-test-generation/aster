import unittest
from httpie.cli.requestitems import RequestItems, process_header_arg, process_empty_header_arg, process_query_param_arg, process_file_upload_arg, process_data_item_arg, process_data_embed_file_contents_arg, process_data_embed_raw_json_file_arg, process_data_raw_json_embed_arg, load_text_file, load_json
from httpie.cli.argtypes import KeyValueArg
from httpie.cli.constants import SEPARATOR_HEADER, SEPARATOR_HEADER_EMPTY, SEPARATOR_QUERY_PARAM, SEPARATOR_FILE_UPLOAD, SEPARATOR_DATA_STRING, SEPARATOR_DATA_EMBED_FILE_CONTENTS, SEPARATOR_DATA_RAW_JSON, SEPARATOR_DATA_EMBED_RAW_JSON_FILE
from httpie.cli.dicts import RequestDataDict, RequestFilesDict, RequestHeadersDict, RequestJSONDataDict, RequestQueryParamsDict, MultipartRequestDataDict
from httpie.cli.exceptions import ParseError
from httpie.utils import get_content_type, load_json_preserve_order


class TestRequestItems(unittest.TestCase):
    def test_init(self):
        instance = RequestItems()
        self.assertIsInstance(instance.headers, RequestHeadersDict)
        self.assertIsInstance(instance.data, RequestDataDict)
        self.assertIsInstance(instance.files, RequestFilesDict)
        self.assertIsInstance(instance.params, RequestQueryParamsDict)
        self.assertIsInstance(instance.multipart_data, MultipartRequestDataDict)

    def test_from_args(self):
        request_item_args = [KeyValueArg(SEPARATOR_HEADER, 'key', 'value'), KeyValueArg(SEPARATOR_HEADER_EMPTY, 'empty_key', '')]
        instance = RequestItems.from_args(request_item_args)
        self.assertEqual(instance.headers['key'], 'value')
        self.assertEqual(instance.headers['empty_key'], '')

    def test_process_header_arg(self):
        arg = KeyValueArg(SEPARATOR_HEADER, 'key', 'value')
        result = process_header_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_empty_header_arg(self):
        arg = KeyValueArg(SEPARATOR_HEADER_EMPTY, 'empty_key', '')
        result = process_empty_header_arg(arg)
        self.assertEqual(result, '')

    def test_process_query_param_arg(self):
        arg = KeyValueArg(SEPARATOR_QUERY_PARAM, 'key', 'value')
        result = process_query_param_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_file_upload_arg(self):
        arg = KeyValueArg(SEPARATOR_FILE_UPLOAD, 'filename', 'mime_type')
        result = process_file_upload_arg(arg)
        self.assertEqual(result[0], 'filename')
        self.assertEqual(result[1], None)
        self.assertEqual(result[2], 'mime_type')

    def test_process_data_item_arg(self):
        arg = KeyValueArg(SEPARATOR_DATA_STRING, 'key', 'value')
        result = process_data_item_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_data_embed_file_contents_arg(self):
        arg = KeyValueArg(SEPARATOR_DATA_EMBED_FILE_CONTENTS, 'key', 'filename')
        result = process_data_embed_file_contents_arg(arg)
        self.assertEqual(result, 'filename')

    def test_process_data_embed_raw_json_file_arg(self):
        arg = KeyValueArg(SEPARATOR_DATA_EMBED_RAW_JSON_FILE, 'key', 'filename')
        result = process_data_embed_raw_json_file_arg(arg)
        self.assertEqual(result, load_json_preserve_order(load_text_file(arg)))

    def test_process_data_raw_json_embed_arg(self):
        arg = KeyValueArg(SEPARATOR_DATA_RAW_JSON, 'key', 'value')
        result = process_data_raw_json_embed_arg(arg)
        self.assertEqual(result, load_json_preserve_order(arg.value))

    def test_load_text_file(self):
        arg = KeyValueArg(SEPARATOR_DATA_EMBED_FILE_CONTENTS, 'key', 'filename')
        result = load_text_file(arg)
        self.assertEqual(result, load_text_file(arg))

    def test_load_json(self):
        arg = KeyValueArg(SEPARATOR_DATA_RAW_JSON, 'key', 'value')
        result = load_json(arg, arg.value)
        self.assertEqual(result, load_json_preserve_order(arg.value))

if __name__ == '__main__':
    unittest.main()