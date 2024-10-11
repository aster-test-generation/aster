import unittest
import target_module


class TestRequestItems(unittest.TestCase):
    def test_init(self):
        request_items = RequestItems()
        self.assertEqual(request_items.headers, RequestHeadersDict())
        self.assertEqual(request_items.data, RequestDataDict())
        self.assertEqual(request_items.files, RequestFilesDict())
        self.assertEqual(request_items.params, RequestQueryParamsDict())
        self.assertEqual(request_items.multipart_data, MultipartRequestDataDict())

    def test_from_args(self):
        request_item_args = [KeyValueArg('key', 'value')]
        request_items = RequestItems.from_args(request_item_args)
        self.assertEqual(request_items.headers, RequestHeadersDict())
        self.assertEqual(request_items.data, RequestDataDict())
        self.assertEqual(request_items.files, RequestFilesDict())
        self.assertEqual(request_items.params, RequestQueryParamsDict())
        self.assertEqual(request_items.multipart_data, MultipartRequestDataDict())

class TestProcessHeaderArg(unittest.TestCase):
    def test_process_header_arg(self):
        arg = KeyValueArg('key', 'value')
        result = process_header_arg(arg)
        self.assertEqual(result, 'value')

class TestProcessEmptyHeaderArg(unittest.TestCase):
    def test_process_empty_header_arg(self):
        arg = KeyValueArg('key', '')
        result = process_empty_header_arg(arg)
        self.assertEqual(result, '')

class TestProcessQueryParamArg(unittest.TestCase):
    def test_process_query_param_arg(self):
        arg = KeyValueArg('key', 'value')
        result = process_query_param_arg(arg)
        self.assertEqual(result, 'value')

class TestProcessFileUploadArg(unittest.TestCase):
    def test_process_file_upload_arg(self):
        arg = KeyValueArg('key', 'value')
        result = process_file_upload_arg(arg)
        self.assertEqual(result, ('value', 'value', 'value'))

class TestProcessDataItemArg(unittest.TestCase):
    def test_process_data_item_arg(self):
        arg = KeyValueArg('key', 'value')
        result = process_data_item_arg(arg)
        self.assertEqual(result, 'value')

class TestProcessDataEmbedFileContentsArg(unittest.TestCase):
    def test_process_data_embed_file_contents_arg(self):
        arg = KeyValueArg('key', 'value')
        result = process_data_embed_file_contents_arg(arg)
        self.assertEqual(result, 'value')

class TestProcessDataRawJsonEmbedArg(unittest.TestCase):
    def test_process_data_raw_json_embed_arg(self):
        arg = KeyValueArg('key', 'value')
        result = process_data_raw_json_embed_arg(arg)
        self.assertEqual(result, 'value')

class TestProcessDataEmbedRawJsonFileArg(unittest.TestCase):
    def test_process_data_embed_raw_json_file_arg(self):
        arg = KeyValueArg('key', 'value')
        result = process_data_embed_raw_json_file_arg(arg)
        self.assertEqual(result, 'value')

class TestLoadTextFile(unittest.TestCase):
    def test_load_text_file(self):
        item = KeyValueArg('key', 'value')
        result = load_text_file(item)
        self.assertEqual(result, 'value')

class TestLoadJson(unittest.TestCase):
    def test_load_json(self):
        arg = KeyValueArg('key', 'value')
        result = load_json(arg, 'value')
        self.assertEqual(result, 'value')

if __name__ == '__main__':
    unittest.main()