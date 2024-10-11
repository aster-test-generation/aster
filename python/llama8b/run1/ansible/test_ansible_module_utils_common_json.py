import datetime
import unittest
from ansible.module_utils.common.json import AnsibleJSONEncoder, _is_unsafe, _is_vault, _preprocess_unsafe_encode


class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_default(self):
        encoder = AnsibleJSONEncoder()
        self.assertEqual(encoder.default(datetime.date(2022, 1, 1)), '2022-01-01')
        self.assertEqual(encoder.default(datetime.datetime(2022, 1, 1, 12, 0, 0)), '2022-01-01T12:00:00')
        self.assertEqual(encoder.default({'a': 1, 'b': 2}), {'a': 1, 'b': 2})
        self.assertEqual(encoder.default('hello'), 'hello')

    def test_preprocess_unsafe_encode(self):
        self.assertEqual(_preprocess_unsafe_encode({'__ansible_unsafe': 'hello'}), {'__ansible_unsafe': 'hello'})
        self.assertEqual(_preprocess_unsafe_encode({'a': 1, 'b': 2}), [{'a': 1, 'b': 2}])
        self.assertEqual(_preprocess_unsafe_encode({'a': 1, 'b': {'c': 3}}), [{'a': 1, 'b': {'c': 3}}])

    def test_is_unsafe(self):
        self.assertTrue(_is_unsafe({'__ansible_unsafe': 'hello'}))
        self.assertFalse(_is_unsafe({'a': 1, 'b': 2}))
        self.assertFalse(_is_unsafe('hello'))

    def test_is_vault(self):
        self.assertTrue(_is_vault({'__ansible_vault': 'hello'}))
        self.assertFalse(_is_vault({'a': 1, 'b': 2}))
        self.assertFalse(_is_vault('hello'))

class TestAnsibleJSONEncoder(unittest.TestCase):
    def test_default(self):
        encoder = AnsibleJSONEncoder()
        obj = {'key': 'value'}
        result = encoder.default(obj)
        self.assertEqual(result, obj)

    def test_default_unsafe(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        obj = {'key': 'value'}
        result = encoder.default(obj)
        self.assertEqual(result, {'__ansible_unsafe': 'value'})

    def test_default_vault(self):
        encoder = AnsibleJSONEncoder(vault_to_text=True)
        obj = {'key': 'value'}
        result = encoder.default(obj)
        self.assertEqual(result, {'__ansible_vault': 'value'})

    def test_default_datetime(self):
        encoder = AnsibleJSONEncoder()
        obj = datetime.datetime(2022, 1, 1)
        result = encoder.default(obj)
        self.assertEqual(result, obj.isoformat())

    def test_default_mapping(self):
        encoder = AnsibleJSONEncoder()
        obj = {'key': 'value'}
        result = encoder.default(obj)
        self.assertEqual(result, obj)

    def test_iterencode(self):
        encoder = AnsibleJSONEncoder(preprocess_unsafe=True)
        obj = {'key': 'value'}
        result = encoder.iterencode(obj)
        self.assertEqual(result, json.dumps({'__ansible_unsafe': 'value'}).encode('utf-8'))

    def test_is_unsafe(self):
        self.assertFalse(_is_unsafe('safe'))
        self.assertTrue(_is_unsafe('__UNSAFE__'))

    def test_is_vault(self):
        self.assertFalse(_is_vault('safe'))
        self.assertTrue(_is_vault('__ENCRYPTED__'))

    def test_preprocess_unsafe_encode(self):
        obj = {'key': 'value'}
        result = _preprocess_unsafe_encode(obj)
        self.assertEqual(result, {'__ansible_unsafe': 'value'})

if __name__ == '__main__':
    unittest.main()