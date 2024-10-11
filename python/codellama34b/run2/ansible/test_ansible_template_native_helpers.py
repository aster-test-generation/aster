import unittest
from ansible.template.native_helpers import *



class TestAnsibleNativeConcat(unittest.TestCase):
    def test_ansible_native_concat(self):
        nodes = []
        result = ansible_native_concat(nodes)
        self.assertEqual(result, None)

    def test_ansible_native_concat_with_one_node(self):
        nodes = [1]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 1)

    def test_ansible_native_concat_with_two_nodes(self):
        nodes = [1, 2]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 12)

    def test_ansible_native_concat_with_three_nodes(self):
        nodes = [1, 2, 3]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 123)

    def test_ansible_native_concat_with_four_nodes(self):
        nodes = [1, 2, 3, 4]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 1234)

    def test_ansible_native_concat_with_five_nodes(self):
        nodes = [1, 2, 3, 4, 5]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 12345)

    def test_ansible_native_concat_with_six_nodes(self):
        nodes = [1, 2, 3, 4, 5, 6]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 123456)

    def test_ansible_native_concat_with_seven_nodes(self):
        nodes = [1, 2, 3, 4, 5, 6, 7]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 1234567)

    def test_ansible_native_concat_with_eight_nodes(self):
        nodes = [1, 2, 3, 4, 5, 6, 7, 8]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 12345678)

    def test_ansible_native_concat_with_nine_nodes(self):
        nodes = [1, 2, 3, 4, 5, 6, 7, 8, 9]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 123456789)

    def test_ansible_native_concat_with_ten_nodes(self):
        nodes = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 12345678910)

    def test_ansible_native_concat_with_eleven_nodes(self):
        nodes = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 1234567891011)

    def test_ansible_native_concat_with_twelve_nodes(self):
        nodes = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
        result = ansible_native_concat(nodes)
        self.assertEqual(result, 123456789101112)

if __name__ == '__main__':
    unittest.main()