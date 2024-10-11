import unittest
from httpie.cli.requestitems import RequestItems


class TestRequestItems(unittest.TestCase):
    def test_init(self):
        instance = RequestItems()
        self.assertIsInstance(instance.headers, RequestHeadersDict)
        self.assertIsInstance(instance.data, RequestDataDict)
        self.assertIsInstance(instance.files, RequestFilesDict)
        self.assertIsInstance(instance.params, RequestQueryParamsDict)
        self.assertIsInstance(instance.multipart_data, MultipartRequestDataDict)

    def test_from_args(self):
        instance = RequestItems.from_args([])
        self.assertIsInstance(instance.headers, RequestHeadersDict)
        self.assertIsInstance(instance.data, RequestDataDict)
        self.assertIsInstance(instance.files, RequestFilesDict)
        self.assertIsInstance(instance.params, RequestQueryParamsDict)
        self.assertIsInstance(instance.multipart_data, MultipartRequestDataDict)

if __name__ == '__main__':
    unittest.main()