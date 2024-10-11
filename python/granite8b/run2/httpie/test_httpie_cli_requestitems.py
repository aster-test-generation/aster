import unittest
from httpie.cli.requestitems import RequestItems


class TestRequestItems(unittest.TestCase):
    def test_from_args(self):
        request_item_args = [
            KeyValueArg(sep=SEPARATOR_HEADER, key='Content-Type', value='application/json'),
            KeyValueArg(sep=SEPARATOR_HEADER, key='Authorization', value='Bearer token'),
            KeyValueArg(sep=SEPARATOR_QUERY_PARAM, key='param1', value='value1'),
            KeyValueArg(sep=SEPARATOR_QUERY_PARAM, key='param2', value='value2'),
            KeyValueArg(sep=SEPARATOR_DATA_STRING, key='data1', value='value1'),
            KeyValueArg(sep=SEPARATOR_DATA_STRING, key='data2', value='value2'),
        ]
        request_items = RequestItems.from_args(request_item_args)
        self.assertEqual(request_items.headers, {'Content-Type': 'application/json', 'Authorization': 'Bearer token'})
        self.assertEqual(request_items.params, {'param1': 'value1', 'param2': 'value2'})
        self.assertEqual(request_items.data, {'data1': 'value1', 'data2': 'value2'})

    def test_process_header_arg(self):
        arg = KeyValueArg(sep=SEPARATOR_HEADER, key='Content-Type', value='application/json')
        header = RequestItems._process_header_arg(arg)
        self.assertEqual(header, 'application/json')

    def test_process_empty_header_arg(self):
        arg = KeyValueArg(sep=SEPARATOR_HEADER_EMPTY, key='Content-Type', value='')
        header = RequestItems._process_empty_header_arg(arg)
        self.assertEqual(header, '')

    def test_process_query_param_arg(self):
        arg = KeyValueArg(sep=SEPARATOR_QUERY_PARAM, key='param1', value='value1')
        param = RequestItems._process_query_param_arg(arg)
        self.assertEqual(param, 'value1')

    def test_process_file_upload_arg(self):
        arg = KeyValueArg(sep=SEPARATOR_FILE_UPLOAD, key='file1', value='path/to/file.txt;application/json')
        file_upload = RequestItems._process_file_upload_arg(arg)
        self.assertEqual(file_upload, ('file1', 'path/to/file.txt', 'application/json'))

    def test_process_data_item_arg(self):
        arg = KeyValueArg(sep=SEPARATOR_DATA_STRING, key='data1', value='value1')
        data = RequestItems._process_data_item_arg(arg)
        self.assertEqual(data, 'value1')

    def test_process_data_embed_file_contents_arg(self):
        arg = KeyValueArg(sep=SEPARATOR_DATA_EMBED_FILE_CONTENTS, key='data1', value='path/to/file.txt')
        data = RequestItems._process_data_embed_file_contents_arg(arg)
        self.assertEqual(data, 'file contents')

    def test_process_data_embed_raw_json_file_arg(self):
        arg = KeyValueArg(sep=SEPARATOR_DATA_EMBED_RAW_JSON_FILE, key='data1', value='path/to/file.json')
        data = RequestItems._process_data_embed_raw_json_file_arg(arg)
        self.assertEqual(data, {'key': 'value'})

    def test_process_data_raw_json_embed_arg(self):
        arg = KeyValueArg(sep=SEPARATOR_DATA_RAW_JSON, key='data1', value='{"key": "value"}')
        data = RequestItems._process_data_raw_json_embed_arg(arg)
        self.assertEqual(data, {'key': 'value'})

if __name__ == '__main__':
    unittest.main()