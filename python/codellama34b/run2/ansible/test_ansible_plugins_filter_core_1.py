import unittest
from ansible.plugins.filter.yaml import *



class TestFilterModule(unittest.TestCase):
    def test_init(self):
        instance = FilterModule()
        self.assertIsInstance(instance, FilterModule)

    def test_filters(self):
        instance = FilterModule()
        result = instance.filters()
        self.assertIsInstance(result, dict)

    def test_groupby(self):
        instance = FilterModule()
        result = instance.filters()['groupby']
        self.assertIsInstance(result, function)

    def test_b64decode(self):
        instance = FilterModule()
        result = instance.filters()['b64decode']
        self.assertIsInstance(result, function)

    def test_b64encode(self):
        instance = FilterModule()
        result = instance.filters()['b64encode']
        self.assertIsInstance(result, function)

    def test_to_uuid(self):
        instance = FilterModule()
        result = instance.filters()['to_uuid']
        self.assertIsInstance(result, function)

    def test_to_json(self):
        instance = FilterModule()
        result = instance.filters()['to_json']
        self.assertIsInstance(result, function)

    def test_to_nice_json(self):
        instance = FilterModule()
        result = instance.filters()['to_nice_json']
        self.assertIsInstance(result, function)

    def test_from_json(self):
        instance = FilterModule()
        result = instance.filters()['from_json']
        self.assertIsInstance(result, function)

    def test_to_yaml(self):
        instance = FilterModule()
        result = instance.filters()['to_yaml']
        self.assertIsInstance(result, function)

    def test_to_nice_yaml(self):
        instance = FilterModule()
        result = instance.filters()['to_nice_yaml']
        self.assertIsInstance(result, function)

    def test_from_yaml(self):
        instance = FilterModule()
        result = instance.filters()['from_yaml']
        self.assertIsInstance(result, function)

    def test_from_yaml_all(self):
        instance = FilterModule()
        result = instance.filters()['from_yaml_all']
        self.assertIsInstance(result, function)

    def test_basename(self):
        instance = FilterModule()
        result = instance.filters()['basename']
        self.assertIsInstance(result, function)

    def test_dirname(self):
        instance = FilterModule()
        result = instance.filters()['dirname']
        self.assertIsInstance(result, function)

    def test_expanduser(self):
        instance = FilterModule()
        result = instance.filters()['expanduser']
        self.assertIsInstance(result, function)

    def test_expandvars(self):
        instance = FilterModule()
        result = instance.filters()['expandvars']
        self.assertIsInstance(result, function)

    def test_path_join(self):
        instance = FilterModule()
        result = instance.filters()['path_join']
        self.assertIsInstance(result, function)

    def test_realpath(self):
        instance = FilterModule()
        result = instance.filters()['realpath']
        self.assertIsInstance(result, function)

    def test_relpath(self):
        instance = FilterModule()
        result = instance.filters()['relpath']
        self.assertIsInstance(result, function)

    def test_splitext(self):
        instance = FilterModule()
        result = instance.filters()['splitext']
        self.assertIsInstance(result, function)

    def test_win_basename(self):
        instance = FilterModule()
        result = instance.filters()['win_basename']
        self.assertIsInstance(result, function)

    def test_win_dirname(self):
        instance = FilterModule()
        result = instance.filters()['win_dirname']
        self.assertIsInstance(result, function)

if __name__ == '__main__':
    unittest.main()