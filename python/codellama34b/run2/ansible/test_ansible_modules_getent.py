import unittest
from ansible.modules.getent import *



class TestGetentModule(unittest.TestCase):
    def test_main(self):
        instance = GetentModule()
        result = instance.main()
        self.assertEqual(result, None)

    def test_get_bin_path(self):
        instance = GetentModule()
        result = instance.get_bin_path('getent')
        self.assertEqual(result, None)

    def test_run_command(self):
        instance = GetentModule()
        result = instance.run_command('getent')
        self.assertEqual(result, None)

    def test_exit_json(self):
        instance = GetentModule()
        result = instance.exit_json()
        self.assertEqual(result, None)

    def test_fail_json(self):
        instance = GetentModule()
        result = instance.fail_json()
        self.assertEqual(result, None)

    def test_getent_module(self):
        instance = GetentModule()
        result = instance.getent_module()
        self.assertEqual(result, None)

    def test_getent_module_main(self):
        instance = GetentModule()
        result = instance.getent_module_main()
        self.assertEqual(result, None)

    def test_getent_module_main_fail_key(self):
        instance = GetentModule()
        result = instance.getent_module_main(fail_key=True)
        self.assertEqual(result, None)

    def test_getent_module_main_split(self):
        instance = GetentModule()
        result = instance.getent_module_main(split='')
        self.assertEqual(result, None)

    def test_getent_module_main_service(self):
        instance = GetentModule()
        result = instance.getent_module_main(service='')
        self.assertEqual(result, None)

    def test_getent_module_main_key(self):
        instance = GetentModule()
        result = instance.getent_module_main(key='')
        self.assertEqual(result, None)

    def test_getent_module_main_database(self):
        instance = GetentModule()
        result = instance.getent_module_main(database='')
        self.assertEqual(result, None)

    def test_getent_module_main_rc(self):
        instance = GetentModule()
        result = instance.getent_module_main(rc=0)
        self.assertEqual(result, None)

    def test_getent_module_main_out(self):
        instance = GetentModule()
        result = instance.getent_module_main(out='')
        self.assertEqual(result, None)

    def test_getent_module_main_err(self):
        instance = GetentModule()
        result = instance.getent_module_main(err='')
        self.assertEqual(result, None)

    def test_getent_module_main_msg(self):
        instance = GetentModule()
        result = instance.getent_module_main(msg='')
        self.assertEqual(result, None)

    def test_getent_module_main_results(self):
        instance = GetentModule()
        result = instance.getent_module_main(results={})
        self.assertEqual(result, None)

    def test_getent_module_main_dbtree(self):
        instance = GetentModule()
        result = instance.getent_module_main(dbtree='')
        self.assertEqual(result, None)

    def test_getent_module_main_record(self):
        instance = GetentModule()
        result = instance.getent_module_main(record='')
        self.assertEqual(result, None)

    def test_getent_module_main_seen(self):
        instance = GetentModule()
        result = instance.getent_module_main(seen={})
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()