import unittest
from httpie.cli.requestitems import RequestItems, process_header_arg, process_empty_header_arg, process_query_param_arg, process_file_upload_arg, process_data_item_arg, process_data_embed_file_contents_arg, process_data_embed_raw_json_file_arg, process_data_raw_json_embed_arg, load_text_file, load_json


class TestRequestItems(unittest.TestCase):
    def test_init(self):
        instance = RequestItems()
        self.assertIsInstance(instance.headers, dict)
        self.assertIsInstance(instance.data, dict)
        self.assertIsInstance(instance.files, dict)
        self.assertIsInstance(instance.params, dict)
        self.assertIsInstance(instance.multipart_data, dict)

    def test_from_args(self):
        request_item_args = [
            KeyValueArg('header', 'value'),
            KeyValueArg('header_empty', ''),
            KeyValueArg('query_param', 'value'),
            KeyValueArg('file_upload', 'file.txt;type=text/plain'),
            KeyValueArg('data_string', 'value'),
            KeyValueArg('data_embed_file_contents', 'file.txt'),
            KeyValueArg('data_raw_json', '{"key": "value}'),
            KeyValueArg('data_embed_raw_json_file', 'file.json'),
        ]
        instance = RequestItems.from_args(request_item_args)
        self.assertEqual(instance.headers['header'], 'value')
        self.assertEqual(instance.headers['header_empty'], '')
        self.assertEqual(instance.params['query_param'], 'value')
        self.assertEqual(instance.files['file.txt'], ('file.txt', open('file.txt', 'rb'), 'text/plain'))
        self.assertEqual(instance.data['data_string'], 'value')
        self.assertEqual(instance.data['data_embed_file_contents'], load_text_file(KeyValueArg('data_embed_file_contents', 'file.txt')))
        self.assertEqual(instance.data['data_raw_json'], load_json(KeyValueArg('data_raw_json', '{"key": "value}'), '{"key": "value}'))
        self.assertEqual(instance.data['data_embed_raw_json_file'], load_json(KeyValueArg('data_embed_raw_json_file', 'file.json'), load_text_file(KeyValueArg('data_embed_raw_json_file', 'file.json'))))

    def test_process_header_arg(self):
        arg = KeyValueArg('header', 'value')
        result = process_header_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_empty_header_arg(self):
        arg = KeyValueArg('header_empty', '')
        with self.assertRaises(ParseError):
            process_empty_header_arg(arg)

    def test_process_query_param_arg(self):
        arg = KeyValueArg('query_param', 'value')
        result = process_query_param_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_file_upload_arg(self):
        arg = KeyValueArg('file_upload', 'file.txt;type=text/plain')
        result = process_file_upload_arg(arg)
        self.assertEqual(result, ('file.txt', open('file.txt', 'rb'), 'text/plain'))

    def test_process_data_item_arg(self):
        arg = KeyValueArg('data_string', 'value')
        result = process_data_item_arg(arg)
        self.assertEqual(result, 'value')

    def test_process_data_embed_file_contents_arg(self):
        arg = KeyValueArg('data_embed_file_contents', 'file.txt')
        result = process_data_embed_file_contents_arg(arg)
        self.assertEqual(result, load_text_file(arg))

    def test_process_data_embed_raw_json_file_arg(self):
        arg = KeyValueArg('data_embed_raw_json_file', 'file.json')
        result = process_data_embed_raw_json_file_arg(arg)
        self.assertEqual(result, load_json(arg, load_text_file(arg)))

    def test_process_data_raw_json_embed_arg(self):
        arg = KeyValueArg('data_raw_json', '{"key": "value}')
        result = process_data_raw_json_embed_arg(arg)
        self.assertEqual(result, load_json(arg, arg.value))

    def test_load_text_file(self):
        arg = KeyValueArg('file.txt', 'file.txt')
        result = load_text_file(arg)
        self.assertEqual(result, load_text_file(arg))

    def test_load_json(self):
        arg = KeyValueArg('{"key": "value}', '{"key": "value}')
        result = load_json(arg, arg.value)
        self.assertEqual(result, load_json(arg, arg.value))

if __name__ == '__main__':
    unittest.main()