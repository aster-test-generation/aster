import unittest
from string_utils.manipulation import camel_case_to_snake


class TestStringFormatter(unittest.TestCase):
    def test_format(self):
        input_string = "input_string"
        instance = __StringFormatter(input_string)
        result = instance.format()
        self.assertEqual(result, "Input String")

if __name__ == '__main__':
    unittest.main()