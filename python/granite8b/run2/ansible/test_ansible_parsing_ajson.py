import unittest
from ansible.parsing.ajson import AnsibleJSONDecoder


class TestAnsibleJSONDecoder(unittest.TestCase):
    def test_set_secrets(self):
        AnsibleJSONDecoder.set_secrets('secrets')

    def test_object_hook(self):
        instance = AnsibleJSONDecoder()
        pairs = {'key': 'value'}
        result = instance.object_hook(pairs)
        self.assertEqual(result['key'], 'value')

    def test___init__(self):
        instance = AnsibleJSONDecoder()
        result = instance.__init__()
        self.assertIsInstance(result, AnsibleJSONDecoder)

    def test___str__(self):
        instance = AnsibleJSONDecoder()
        result = instance.__str__()
        self.assertEqual(result, 'AnsibleJSONDecoder')

    def test___repr__(self):
        instance = AnsibleJSONDecoder()
        result = instance.__repr__()
        self.assertEqual(result, 'AnsibleJSONDecoder()')

    def test___eq__(self):
        instance = AnsibleJSONDecoder()
        result = instance.__eq__('other')
        self.assertEqual(result, False)

if __name__ == '__main__':
    unittest.main()