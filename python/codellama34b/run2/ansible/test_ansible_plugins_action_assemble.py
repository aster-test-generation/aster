import unittest
from ansible.plugins.action.assemble import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result, None)

    def test__assemble_from_fragments(self):
        instance = ActionModule()
        result = instance._assemble_from_fragments()
        self.assertEqual(result, None)

    def test__find_needle(self):
        instance = ActionModule()
        result = instance._find_needle()
        self.assertEqual(result, None)

    def test__execute_module(self):
        instance = ActionModule()
        result = instance._execute_module()
        self.assertEqual(result, None)

    def test__get_diff_data(self):
        instance = ActionModule()
        result = instance._get_diff_data()
        self.assertEqual(result, None)

    def test__remove_tmp_path(self):
        instance = ActionModule()
        result = instance._remove_tmp_path()
        self.assertEqual(result, None)

    def test__transfer_file(self):
        instance = ActionModule()
        result = instance._transfer_file()
        self.assertEqual(result, None)

    def test__fixup_perms2(self):
        instance = ActionModule()
        result = instance._fixup_perms2()
        self.assertEqual(result, None)

    def test__execute_remote_stat(self):
        instance = ActionModule()
        result = instance._execute_remote_stat()
        self.assertEqual(result, None)

    def test__remote_expand_user(self):
        instance = ActionModule()
        result = instance._remote_expand_user()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()