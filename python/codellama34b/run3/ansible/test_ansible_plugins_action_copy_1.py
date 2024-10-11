import unittest
from ansible.plugins.action import yaml


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = copy.ActionModule()
        self.assertIsInstance(instance, copy.ActionModule)

    def test_run(self):
        instance = copy.ActionModule()
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test__copy_file(self):
        instance = copy.ActionModule()
        result = instance._copy_file()
        self.assertIsInstance(result, dict)

    def test__execute_module(self):
        instance = copy.ActionModule()
        result = instance._execute_module()
        self.assertIsInstance(result, dict)

    def test__find_needle(self):
        instance = copy.ActionModule()
        result = instance._find_needle()
        self.assertIsInstance(result, str)

    def test__remove_tmp_path(self):
        instance = copy.ActionModule()
        result = instance._remove_tmp_path()
        self.assertIsNone(result)

    def test__walk_dirs(self):
        instance = copy.ActionModule()
        result = instance._walk_dirs()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()