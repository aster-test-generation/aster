import unittest
from httpie.cli.requestitems import *



class TestRequestItems(unittest.TestCase):
    def test_from_args(self):
        instance = RequestItems.from_args(
            request_item_args=None,
            as_form=False,
        )
        self.assertEqual(instance.headers, RequestHeadersDict())
        self.assertEqual(instance.data, RequestJSONDataDict())
        self.assertEqual(instance.files, RequestFilesDict())
        self.assertEqual(instance.params, RequestQueryParamsDict())
        self.assertEqual(instance.multipart_data, MultipartRequestDataDict())

    def test_process_header_arg(self):
        arg = KeyValueArg(
            sep=SEPARATOR_HEADER,
            key='key',
            value='value',
            orig='key:value',
        )
        result = process_header_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_empty_header_arg(self):
        arg = KeyValueArg(
            sep=SEPARATOR_HEADER_EMPTY,
            key='key',
            value='value',
            orig='key:value',
        )
        result = process_empty_header_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_query_param_arg(self):
        arg = KeyValueArg(
            sep=SEPARATOR_QUERY_PARAM,
            key='key',
            value='value',
            orig='key:value',
        )
        result = process_query_param_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_file_upload_arg(self):
        arg = KeyValueArg(
            sep=SEPARATOR_FILE_UPLOAD,
            key='key',
            value='value',
            orig='key:value',
        )
        result = process_file_upload_arg(arg)
        self.assertEqual(result, ('value', None, None))

    def test_process_data_item_arg(self):
        arg = KeyValueArg(
            sep=SEPARATOR_DATA_STRING,
            key='key',
            value='value',
            orig='key:value',
        )
        result = process_data_item_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_data_embed_file_contents_arg(self):
        arg = KeyValueArg(
            sep=SEPARATOR_DATA_EMBED_FILE_CONTENTS,
            key='key',
            value='value',
            orig='key:value',
        )
        result = process_data_embed_file_contents_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_data_embed_raw_json_file_arg(self):
        arg = KeyValueArg(
            sep=SEPARATOR_DATA_EMBED_RAW_JSON_FILE,
            key='key',
            value='value',
            orig='key:value',
        )
        result = process_data_embed_raw_json_file_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_data_raw_json_embed_arg(self):
        arg = KeyValueArg(
            sep=SEPARATOR_DATA_RAW_JSON,
            key='key',
            value='value',
            orig='key:value',
        )
        result = process_data_raw_json_embed_arg(arg)
        self.assertEqual(result, 'value')

    def test_load_text_file(self):
        path = 'path'
        result = load_text_file(KeyValueArg(
            sep=SEPARATOR_DATA_EMBED_FILE_CONTENTS,
            key='key',
            value='value',
            orig='key:value',
        ))
        self.assertEqual(result, 'value')

if __name__ == '__main__':
    unittest.main()