import unittest
from ansible.modules.replace import *


class TestReplaceModule(unittest.TestCase):
    def test_replace_in_file(self):
        # Test replacing a pattern in a file
        path = '/etc/hosts'
        regexp = '(\\s+)old\\.host\\.name(\\s+.*)?$'
        replace = '\\1new.host.name\\2'
        result = replace_in_file(path, regexp, replace)
        self.assertEqual(result, 'Replaced all instances of the pattern in the file')

    def test_replace_in_string(self):
        # Test replacing a pattern in a string
        string = 'This is a test string'
        regexp = 'test'
        replace = 'example'
        result = replace_in_string(string, regexp, replace)
        self.assertEqual(result, 'This is an example string')

    def test_replace_in_list(self):
        # Test replacing a pattern in a list
        list = ['item1', 'item2', 'item3']
        regexp = 'item'
        replace = 'element'
        result = replace_in_list(list, regexp, replace)
        self.assertEqual(result, ['element1', 'element2', 'element3'])

    def test_replace_in_dict(self):
        # Test replacing a pattern in a dictionary
        dict = {'key1': 'value1', 'key2': 'value2', 'key3': 'value3'}
        regexp = 'value'
        replace = 'data'
        result = replace_in_dict(dict, regexp, replace)
        self.assertEqual(result, {'key1': 'data1', 'key2': 'data2', 'key3': 'data3'})

    def test_replace_in_object(self):
        # Test replacing a pattern in an object
        class TestObject:
            def __init__(self, name):
                self.name = name
        obj = TestObject('Test')
        regexp = 'Test'
        replace = 'Example'
        result = replace_in_object(obj, regexp, replace)
        self.assertEqual(result.name, 'Example')

if __name__ == '__main__':
    unittest.main()