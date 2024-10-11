import unittest
from ansible.parsing.yaml.loader import AnsibleLoader


class TestAnsibleLoader(unittest.TestCase):
    def test_init(self):
        instance = AnsibleLoader(None)
        self.assertIsInstance(instance, AnsibleLoader)

    def test_private_method(self):
        instance = AnsibleLoader(None)
        result = instance._AnsibleLoader__private_method(1)
        self.assertEqual(result, 2)

    def test_protected_method(self):
        instance = AnsibleLoader(None)
        result = instance._AnsibleLoader__protected_method(1)
        self.assertEqual(result, 2)

    def test_magic_method(self):
        instance = AnsibleLoader(None)
        result = instance.__str__()
        self.assertEqual(result, "AnsibleLoader")

    def test_magic_method(self):
        instance = AnsibleLoader(None)
        result = instance.__repr__()
        self.assertEqual(result, "AnsibleLoader(None)")

if __name__ == '__main__':
    unittest.main()