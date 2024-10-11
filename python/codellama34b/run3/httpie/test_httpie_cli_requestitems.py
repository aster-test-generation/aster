import unittest
from httpie.cli.requestitems import *


class TestRequestItems(unittest.TestCase):
    def test_init(self):
        instance = RequestItems()
        self.assertEqual(instance.headers, RequestHeadersDict())
        self.assertEqual(instance.data, RequestJSONDataDict())
        self.assertEqual(instance.files, RequestFilesDict())
        self.assertEqual(instance.params, RequestQueryParamsDict())
        self.assertEqual(instance.multipart_data, MultipartRequestDataDict())

    def test_from_args(self):
        instance = RequestItems.from_args([KeyValueArg()])
        self.assertEqual(instance.headers, RequestHeadersDict())
        self.assertEqual(instance.data, RequestJSONDataDict())
        self.assertEqual(instance.files, RequestFilesDict())
        self.assertEqual(instance.params, RequestQueryParamsDict())
        self.assertEqual(instance.multipart_data, MultipartRequestDataDict())

    def test_process_header_arg(self):
        result = process_header_arg(KeyValueArg())
        self.assertEqual(result, None)

    def test_process_empty_header_arg(self):
        result = process_empty_header_arg(KeyValueArg())
        self.assertEqual(result, '')

    def test_process_query_param_arg(self):
        result = process_query_param_arg(KeyValueArg())
        self.assertEqual(result, '')

    def test_process_file_upload_arg(self):
        result = process_file_upload_arg(KeyValueArg())
        self.assertEqual(result, ('', '', ''))

    def test_process_data_item_arg(self):
        result = process_data_item_arg(KeyValueArg())
        self.assertEqual(result, '')

    def test_process_data_embed_file_contents_arg(self):
        result = process_data_embed_file_contents_arg(KeyValueArg())
        self.assertEqual(result, '')

    def test_process_data_embed_raw_json_file_arg(self):
        result = process_data_embed_raw_json_file_arg(KeyValueArg())
        self.assertEqual(result, '')

    def test_process_data_raw_json_embed_arg(self):
        result = process_data_raw_json_embed_arg(KeyValueArg())
        self.assertEqual(result, '')

    def test_load_text_file(self):
        result = load_text_file(KeyValueArg())
        self.assertEqual(result, '')

    def test_load_json(self):
        result = load_json(KeyValueArg(), '')
        self.assertEqual(result, '')

if __name__ == '__main__':
    unittest.main()