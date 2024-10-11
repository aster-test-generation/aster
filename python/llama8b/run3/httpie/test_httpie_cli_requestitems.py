import unittest
from httpie.cli.requestitems import RequestItems, process_header_arg, process_empty_header_arg, process_query_param_arg, process_file_upload_arg, process_data_item_arg, process_data_embed_file_contents_arg, process_data_embed_raw_json_file_arg, process_data_raw_json_embed_arg, load_text_file, load_json
from httpie.cli.argtypes import KeyValueArg
from httpie.cli.constants import SEPARATOR_HEADER, SEPARATOR_HEADER_EMPTY, SEPARATOR_QUERY_PARAM, SEPARATOR_FILE_UPLOAD, SEPARATOR_DATA_STRING, SEPARATOR_DATA_EMBED_FILE_CONTENTS, SEPARATOR_DATA_RAW_JSON, SEPARATOR_DATA_EMBED_RAW_JSON_FILE
from httpie.cli.dicts import RequestDataDict, RequestFilesDict, RequestQueryParamsDict, RequestHeadersDict, MultipartRequestDataDict
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
        request_item_args = [
            KeyValueArg(SEPARATOR_HEADER, 'key', 'value'),
            KeyValueArg(SEPARATOR_HEADER_EMPTY, 'empty_key', ''),
            KeyValueArg(SEPARATOR_QUERY_PARAM, 'query_key', 'query_value'),
            KeyValueArg(SEPARATOR_FILE_UPLOAD, 'file_key', 'file_path'),
            KeyValueArg(SEPARATOR_DATA_STRING, 'data_key', 'data_value'),
            KeyValueArg(SEPARATOR_DATA_EMBED_FILE_CONTENTS, 'data_key', 'file_path'),
            KeyValueArg(SEPARATOR_DATA_RAW_JSON, 'data_key', '{"key": "value}'),
            KeyValueArg(SEPARATOR_DATA_EMBED_RAW_JSON_FILE, 'data_key', 'file_path'),
        ]
        instance = RequestItems.from_args(request_item_args)
        self.assertEqual(instance.headers['key'], 'value')
        self.assertEqual(instance.headers['empty_key'], '')
        self.assertEqual(instance.params['query_key'], 'query_value')
        self.assertEqual(instance.files['file_key'], (os.path.basename('file_path'), open('file_path', 'rb'), get_content_type('file_path')))
        self.assertEqual(instance.data['data_key'], 'data_value')
        self.assertEqual(instance.data['data_key'], load_text_file(KeyValueArg(SEPARATOR_DATA_EMBED_FILE_CONTENTS, 'data_key', 'file_path')))
        self.assertEqual(instance.data['data_key'], load_json(KeyValueArg(SEPARATOR_DATA_RAW_JSON, 'data_key', '{"key": "value}'), '{"key": "value}'))
        self.assertEqual(instance.data['data_key'], load_json_preserve_order(load_text_file(KeyValueArg(SEPARATOR_DATA_EMBED_RAW_JSON_FILE, 'data_key', 'file_path'))))

    def test_process_header_arg(self):
        arg = KeyValueArg(SEPARATOR_HEADER, 'key', 'value')
        result = process_header_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_empty_header_arg(self):
        arg = KeyValueArg(SEPARATOR_HEADER_EMPTY, 'key', '')
        result = process_empty_header_arg(arg)
        self.assertEqual(result, '')

    def test_process_query_param_arg(self):
        arg = KeyValueArg(SEPARATOR_QUERY_PARAM, 'key', 'value')
        result = process_query_param_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_file_upload_arg(self):
        arg = KeyValueArg(SEPARATOR_FILE_UPLOAD, 'key', 'file_path')
        result = process_file_upload_arg(arg)
        self.assertEqual(result, (os.path.basename('file_path'), open('file_path', 'rb'), get_content_type('file_path')))

    def test_process_data_item_arg(self):
        arg = KeyValueArg(SEPARATOR_DATA_STRING, 'key', 'value')
        result = process_data_item_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_data_embed_file_contents_arg(self):
        arg = KeyValueArg(SEPARATOR_DATA_EMBED_FILE_CONTENTS, 'key', 'file_path')
        result = process_data_embed_file_contents_arg(arg)
        self.assertEqual(result, load_text_file(arg))

    def test_process_data_embed_raw_json_file_arg(self):
        arg = KeyValueArg(SEPARATOR_DATA_EMBED_RAW_JSON_FILE, 'key', 'file_path')
        result = process_data_embed_raw_json_file_arg(arg)
        self.assertEqual(result, load_json(arg, load_text_file(arg)))

    def test_process_data_raw_json_embed_arg(self):
        arg = KeyValueArg(SEPARATOR_DATA_RAW_JSON, 'key', '{"key": "value}')
        result = process_data_raw_json_embed_arg(arg)
        self.assertEqual(result, load_json(arg, '{"key": "value}'))

if __name__ == '__main__':
    unittest.main()