import unittest
from httpie.cli.requestitems import RequestItems


class TestRequestItems(unittest.TestCase):
    def test_from_args(self):
        request_item_args = [
            KeyValueArg('Header', 'Content-Type: application/json'),
            KeyValueArg('Header', 'X-Custom-Header: value'),
            KeyValueArg('Query', 'param1=value1'),
            KeyValueArg('Query', 'param2=value2'),
            KeyValueArg('Data', 'key1=value1'),
            KeyValueArg('Data', 'key2=value2'),
            KeyValueArg('Data', 'key3=value3'),
            KeyValueArg('DataEMBED', 'file.txt'),
            KeyValueArg('DataEMBED', 'file2.txt'),
            KeyValueArg('DataEMBED', 'file3.txt'),
            KeyValueArg('DataEMBEDJSON', 'data.json'),
            KeyValueArg('DataEMBEDJSON', 'data2.json'),
            KeyValueArg('DataEMBEDJSON', 'data3.json'),
            KeyValueArg('DataRAWJSON', '{"key": "value"}'),
            KeyValueArg('DataRAWJSON', '{"key2": "value2"}'),
            KeyValueArg('DataRAWJSON', '{"key3": "value3"}'),
            KeyValueArg('DataEMBEDFILE', 'file.txt'),
            KeyValueArg('DataEMBEDFILE', 'file2.txt'),
            KeyValueArg('DataEMBEDFILE', 'file3.txt'),
        ]
        request_items = RequestItems.from_args(request_item_args)
        self.assertEqual(request_items.headers, {
            'Content-Type': 'application/json',
            'X-Custom-Header': 'value',
        })
        self.assertEqual(request_items.params, {
            'param1': 'value1',
            'param2': 'value2',
        })
        self.assertEqual(request_items.data, {
            'key1': 'value1',
            'key2': 'value2',
            'key3': 'value3',
        })
        self.assertEqual(request_items.files, {
            'file.txt': ('file.txt', b'', 'text/plain'),
            'file2.txt': ('file2.txt', b'', 'text/plain'),
            'file3.txt': ('file3.txt', b'', 'text/plain'),
        })
        self.assertEqual(request_items.multipart_data, {
            'key1': 'value1',
            'key2': 'value2',
            'key3': 'value3',
            'file.txt': ('file.txt', b'', 'text/plain'),
            'file2.txt': ('file2.txt', b'', 'text/plain'),
            'file3.txt': ('file3.txt', b'', 'text/plain'),
        })

if __name__ == '__main__':
    unittest.main()