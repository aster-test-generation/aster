import unittest
from ansible.modules.replace import *



class TestReplaceModule(unittest.TestCase):
    def test_replace_module(self):
        instance = ReplaceModule.ReplaceModule()
        result = instance.replace_module()
        self.assertEqual(result, None)

    def test_run_command(self):
        from replace import ReplaceModule
        result = instance.run_command()
        self.assertEqual(result, None)

    def test_run_commands(self):
        from replace import ReplaceModule
        result = instance.run_commands()
        self.assertEqual(result, None)

    def test_get_bin_path(self):
        from replace import ReplaceModule
        result = instance.get_bin_path()
        self.assertEqual(result, None)

    def test_get_remote_filename(self):
        instance = ReplaceModule.ReplaceModule()
        result = instance.get_remote_filename()
        self.assertEqual(result, None)

    def test_get_real_src(self):
        instance = ReplaceModule()
        result = instance.get_real_src()
        self.assertEqual(result, None)

    def test_get_real_dest(self):
        instance = ReplaceModule()
        result = instance.get_real_dest()
        self.assertEqual(result, None)

    def test_get_real_path(self):
        from replace import ReplaceModule
        result = instance.get_real_path()
        self.assertEqual(result, None)

    def test_get_diff_data(self):
        instance = ReplaceModule.ReplaceModule()
        result = instance.get_diff_data()
        self.assertEqual(result, None)

    def test_get_diff_data_no_path(self):
        from replace_module import ReplaceModule
        result = instance.get_diff_data_no_path()
        self.assertEqual(result, None)

    def test_get_diff_data_no_dest(self):
        from replace_module import ReplaceModule
        result = instance.get_diff_data_no_dest()
        self.assertEqual(result, None)

    def test_get_diff_data_no_src(self):
        instance = ReplaceModule.ReplaceModule()
        result = instance.get_diff_data_no_src()
        self.assertEqual(result, None)

    def test_get_diff_data_no_dest_no_src(self):
        instance = ReplaceModule.ReplaceModule()
        result = instance.get_diff_data_no_dest_no_src()
        self.assertEqual(result, None)

    def test_get_diff_data_no_dest_no_src_no_path(self):
        instance = ReplaceModule.ReplaceModule()
        result = instance.get_diff_data_no_dest_no_src_no_path()
        self.assertEqual(result, None)

    def test_get_diff_data_no_dest_no_src_no_path_no_backup(self):
        instance = replace_module.ReplaceModule()
        result = instance.get_diff_data_no_dest_no_src_no_path_no_backup()
        self.assertEqual(result, None)

    def test_get_diff_data_no_dest_no_src_no_path_no_backup_no_before(self):
        instance = replace_module.ReplaceModule()
        result = instance.get_diff_data_no_dest_no_src_no_path_no_backup_no_before()
        self.assertEqual(result, None)

    def test_get_diff_data_no_dest_no_src_no_path_no_backup_no_before_no_after(self):
        from ReplaceModule import ReplaceModule
        result = instance.get_diff_data_no_dest_no_src_no_path_no_backup_no_before_no_after()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()