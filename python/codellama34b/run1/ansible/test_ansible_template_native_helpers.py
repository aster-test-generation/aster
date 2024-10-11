import unittest
from ansible.template.native_helpers import *



class TestAnsibleNativeConcat(unittest.TestCase):
    def test_ansible_native_concat(self):
        result = ansible_native_concat(None)
        self.assertEqual(result, None)

    def test_ansible_native_concat_empty(self):
        result = ansible_native_concat([])
        self.assertEqual(result, None)

    def test_ansible_native_concat_one(self):
        result = ansible_native_concat([1])
        self.assertEqual(result, 1)

    def test_ansible_native_concat_two(self):
        result = ansible_native_concat([1, 2])
        self.assertEqual(result, '12')

    def test_ansible_native_concat_three(self):
        result = ansible_native_concat([1, 2, 3])
        self.assertEqual(result, '123')

    def test_ansible_native_concat_four(self):
        result = ansible_native_concat([1, 2, 3, 4])
        self.assertEqual(result, '1234')

    def test_ansible_native_concat_five(self):
        result = ansible_native_concat([1, 2, 3, 4, 5])
        self.assertEqual(result, '12345')

    def test_ansible_native_concat_six(self):
        result = ansible_native_concat([1, 2, 3, 4, 5, 6])
        self.assertEqual(result, '123456')

    def test_ansible_native_concat_seven(self):
        result = ansible_native_concat([1, 2, 3, 4, 5, 6, 7])
        self.assertEqual(result, '1234567')

    def test_ansible_native_concat_eight(self):
        result = ansible_native_concat([1, 2, 3, 4, 5, 6, 7, 8])
        self.assertEqual(result, '12345678')

    def test_ansible_native_concat_nine(self):
        result = ansible_native_concat([1, 2, 3, 4, 5, 6, 7, 8, 9])
        self.assertEqual(result, '123456789')

    def test_ansible_native_concat_ten(self):
        result = ansible_native_concat([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
        self.assertEqual(result, '12345678910')

    def test_ansible_native_concat_eleven(self):
        result = ansible_native_concat([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])
        self.assertEqual(result, '1234567891011')

    def test_ansible_native_concat_twelve(self):
        result = ansible_native_concat([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12])
        self.assertEqual(result, '123456789101112')

    def test_ansible_native_concat_thirteen(self):
        result = ansible_native_concat([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13])
        self.assertEqual(result, '12345678910111213')

if __name__ == '__main__':
    unittest.main()