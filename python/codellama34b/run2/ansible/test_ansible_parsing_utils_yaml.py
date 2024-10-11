import unittest
from ansible.parsing.utils.yaml import *


class TestAnsibleJSONDecoder(unittest.TestCase):
    def test_set_secrets(self):
        instance = AnsibleJSONDecoder()
        instance.set_secrets(None)

class TestAnsibleLoader(unittest.TestCase):
    def test_dispose(self):
        instance = AnsibleLoader()
        instance.dispose()

    def test_get_data(self):
        instance = AnsibleLoader()
        instance.get_data()

    def test_get_single_data(self):
        instance = AnsibleLoader()
        instance.get_single_data()

class TestFromYAML(unittest.TestCase):
    def test_from_yaml(self):
        instance = FromYAML()
        instance.from_yaml()

if __name__ == '__main__':
    unittest.main()