import datetime
import unittest
from ansible.module_utils.common.json import AnsibleJSONEncoder, _is_unsafe, _is_vault, _preprocess_unsafe_encode


class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_default(self):
        encoder = AnsibleJSONEncoder()
        self.assertEqual(encoder.default(1), 1)
        self.assertEqual(encoder.default('hello'), 'hello')
        self.assertEqual(encoder.default({'a': 1}), {'a': 1})
        self.assertEqual(encoder.default(datetime.date(2022, 1, 1)), '2022-01-01')

    def test_default_unsafe(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        self.assertEqual(encoder.default({'__ansible_unsafe': 'hello'}), {'__ansible_unsafe': 'hello'})

    def test_default_vault(self):
        encoder = AnsibleJSONEncoder(vault_to_text=True)
        self.assertEqual(encoder.default({'__ansible_vault': 'hello'}), 'hello')

    def test_iterencode(self):
        encoder = AnsibleJSONEncoder()
        self.assertEqual(encoder.iterencode({'a': 1}), b'{"a": 1}')
        self.assertEqual(encoder.iterencode({'a': 'hello'}), b'{"a": "hello"}')

    def test_iterencode_unsafe(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        self.assertEqual(encoder.iterencode({'__ansible_unsafe': 'hello'}), b'{"__ansible_unsafe": "hello"}')

    def test_is_unsafe(self):
        self.assertFalse(_is_unsafe(1))
        self.assertFalse(_is_unsafe('hello'))
        self.assertTrue(_is_unsafe({'__ansible_unsafe': 'hello'}))

    def test_is_vault(self):
        self.assertFalse(_is_vault(1))
        self.assertFalse(_is_vault('hello'))
        self.assertTrue(_is_vault({'__ansible_vault': 'hello'}))

    def test_preprocess_unsafe_encode(self):
        self.assertEqual(_preprocess_unsafe_encode(1), 1)
        self.assertEqual(_preprocess_unsafe_encode('hello'), 'hello')
        self.assertEqual(_preprocess_unsafe_encode({'a': 1}), {'a': 1})
        self.assertEqual(_preprocess_unsafe_encode({'__ansible_unsafe': 'hello'}), {'__ansible_unsafe': 'hello'})
        self.assertEqual(_preprocess_unsafe_encode([1, 2, 3]), [1, 2, 3])
        self.assertEqual(_preprocess_unsafe_encode({'a': 1, 'b': 2}), {'a': 1, 'b': 2})

if __name__ == '__main__':
    unittest.main()