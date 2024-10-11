import unittest
from ansible.module_utils.common.json import *


class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_default(self):
        instance = AnsibleJSONEncoder()
        result = instance.default(1)
        self.assertEqual(result, 1)

    def test_iterencode(self):
        instance = AnsibleJSONEncoder()
        result = instance.iterencode(1)
        self.assertEqual(result, 1)

    def test_preprocess_unsafe_encode(self):
        result = _preprocess_unsafe_encode(1)
        self.assertEqual(result, 1)

    def test_is_unsafe(self):
        result = _is_unsafe(1)
        self.assertEqual(result, False)

    def test_is_vault(self):
        result = _is_vault(1)
        self.assertEqual(result, False)

if __name__ == '__main__':
    unittest.main()